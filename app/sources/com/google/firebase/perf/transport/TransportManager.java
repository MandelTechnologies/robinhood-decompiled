package com.google.firebase.perf.transport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.p052v1.AndroidApplicationInfo;
import com.google.firebase.perf.p052v1.ApplicationInfo;
import com.google.firebase.perf.p052v1.ApplicationProcessState;
import com.google.firebase.perf.p052v1.GaugeMetric;
import com.google.firebase.perf.p052v1.NetworkRequestMetric;
import com.google.firebase.perf.p052v1.PerfMetric;
import com.google.firebase.perf.p052v1.PerfMetricOrBuilder;
import com.google.firebase.perf.p052v1.TraceMetric;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Rate;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class TransportManager implements AppStateMonitor.AppStateCallback {
    private Context appContext;
    private AppStateMonitor appStateMonitor;
    private ApplicationInfo.Builder applicationInfoBuilder;
    private final Map<String, Integer> cacheMap;
    private ConfigResolver configResolver;
    private FirebaseApp firebaseApp;
    private FirebaseInstallationsApi firebaseInstallationsApi;
    private FirebasePerformance firebasePerformance;
    private FlgTransport flgTransport;
    private Provider<TransportFactory> flgTransportFactoryProvider;
    private String packageName;
    private String projectId;
    private RateLimiter rateLimiter;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final TransportManager instance = new TransportManager();
    private final ConcurrentLinkedQueue<PendingPerfEvent> pendingEventsQueue = new ConcurrentLinkedQueue<>();
    private final AtomicBoolean isTransportInitialized = new AtomicBoolean(false);
    private boolean isForegroundState = false;
    private ExecutorService executorService = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private TransportManager() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.cacheMap = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static TransportManager getInstance() {
        return instance;
    }

    public void initialize(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider) {
        this.firebaseApp = firebaseApp;
        this.projectId = firebaseApp.getOptions().getProjectId();
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.flgTransportFactoryProvider = provider;
        this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.syncInit();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncInit() {
        Context applicationContext = this.firebaseApp.getApplicationContext();
        this.appContext = applicationContext;
        this.packageName = applicationContext.getPackageName();
        this.configResolver = ConfigResolver.getInstance();
        this.rateLimiter = new RateLimiter(this.appContext, new Rate(100L, 1L, TimeUnit.MINUTES), 500L);
        this.appStateMonitor = AppStateMonitor.getInstance();
        this.flgTransport = new FlgTransport(this.flgTransportFactoryProvider, this.configResolver.getAndCacheLogSourceName());
        finishInitialization();
    }

    private void finishInitialization() {
        this.appStateMonitor.registerForAppState(new WeakReference<>(instance));
        ApplicationInfo.Builder builderNewBuilder = ApplicationInfo.newBuilder();
        this.applicationInfoBuilder = builderNewBuilder;
        builderNewBuilder.setGoogleAppId(this.firebaseApp.getOptions().getApplicationId()).setAndroidAppInfo(AndroidApplicationInfo.newBuilder().setPackageName(this.packageName).setSdkVersion(BuildConfig.FIREPERF_VERSION_NAME).setVersionName(getVersionName(this.appContext)));
        this.isTransportInitialized.set(true);
        while (!this.pendingEventsQueue.isEmpty()) {
            final PendingPerfEvent pendingPerfEventPoll = this.pendingEventsQueue.poll();
            if (pendingPerfEventPoll != null) {
                this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransportManager.m9292$r8$lambda$5wKJIrUBd_mX7lJGyc7JlMFV14(this.f$0, pendingPerfEventPoll);
                    }
                });
            }
        }
    }

    /* renamed from: $r8$lambda$5wKJIrUBd-_mX7lJGyc7JlMFV14, reason: not valid java name */
    public static /* synthetic */ void m9292$r8$lambda$5wKJIrUBd_mX7lJGyc7JlMFV14(TransportManager transportManager, PendingPerfEvent pendingPerfEvent) {
        transportManager.getClass();
        transportManager.syncLog(pendingPerfEvent.perfMetricBuilder, pendingPerfEvent.appState);
    }

    @Override // com.google.firebase.perf.application.AppStateMonitor.AppStateCallback
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.isForegroundState = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (isInitialized()) {
            this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TransportManager transportManager = this.f$0;
                    transportManager.rateLimiter.changeRate(transportManager.isForegroundState);
                }
            });
        }
    }

    public boolean isInitialized() {
        return this.isTransportInitialized.get();
    }

    public void log(final TraceMetric traceMetric, final ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.$r8$lambda$Ja5ak9ThohzhqGMgvAOnsxjXYHs(this.f$0, traceMetric, applicationProcessState);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Ja5ak9ThohzhqGMgvAOnsxjXYHs(TransportManager transportManager, TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        transportManager.getClass();
        transportManager.syncLog(PerfMetric.newBuilder().setTraceMetric(traceMetric), applicationProcessState);
    }

    public void log(final NetworkRequestMetric networkRequestMetric, final ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.m9293$r8$lambda$NKiJZdaGx4GhyfbkFEOM3GNEkU(this.f$0, networkRequestMetric, applicationProcessState);
            }
        });
    }

    /* renamed from: $r8$lambda$NKiJZdaGx4Ghyfb-kFEOM3GNEkU, reason: not valid java name */
    public static /* synthetic */ void m9293$r8$lambda$NKiJZdaGx4GhyfbkFEOM3GNEkU(TransportManager transportManager, NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        transportManager.getClass();
        transportManager.syncLog(PerfMetric.newBuilder().setNetworkRequestMetric(networkRequestMetric), applicationProcessState);
    }

    public void log(final GaugeMetric gaugeMetric, final ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new Runnable() { // from class: com.google.firebase.perf.transport.TransportManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TransportManager.$r8$lambda$mWPY22jackclLui3mlgTfbDlcpc(this.f$0, gaugeMetric, applicationProcessState);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$mWPY22jackclLui3mlgTfbDlcpc(TransportManager transportManager, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        transportManager.getClass();
        transportManager.syncLog(PerfMetric.newBuilder().setGaugeMetric(gaugeMetric), applicationProcessState);
    }

    private void syncLog(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        if (!isInitialized()) {
            if (isAllowedToCache(builder)) {
                logger.debug("Transport is not initialized yet, %s will be queued for to be dispatched later", getLogcatMsg(builder));
                this.pendingEventsQueue.add(new PendingPerfEvent(builder, applicationProcessState));
                return;
            }
            return;
        }
        PerfMetric applicationInfoAndBuild = setApplicationInfoAndBuild(builder, applicationProcessState);
        if (isAllowedToDispatch(applicationInfoAndBuild)) {
            dispatchLog(applicationInfoAndBuild);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    private boolean isAllowedToCache(PerfMetricOrBuilder perfMetricOrBuilder) {
        Integer num = this.cacheMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = this.cacheMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.cacheMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (perfMetricOrBuilder.hasTraceMetric() && iIntValue > 0) {
            this.cacheMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (perfMetricOrBuilder.hasNetworkRequestMetric() && iIntValue2 > 0) {
            this.cacheMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (perfMetricOrBuilder.hasGaugeMetric() && iIntValue3 > 0) {
            this.cacheMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
            return true;
        }
        logger.debug("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", getLogcatMsg(perfMetricOrBuilder), num, num2, num3);
        return false;
    }

    private boolean isAllowedToDispatch(PerfMetric perfMetric) {
        if (!this.configResolver.isPerformanceMonitoringEnabled()) {
            logger.info("Performance collection is not enabled, dropping %s", getLogcatMsg(perfMetric));
            return false;
        }
        if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            logger.warn("App Instance ID is null or empty, dropping %s", getLogcatMsg(perfMetric));
            return false;
        }
        if (!PerfMetricValidator.isValid(perfMetric, this.appContext)) {
            logger.warn("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", getLogcatMsg(perfMetric));
            return false;
        }
        if (!this.rateLimiter.isEventSampled(perfMetric)) {
            incrementDropCount(perfMetric);
            logger.info("Event dropped due to device sampling - %s", getLogcatMsg(perfMetric));
            return false;
        }
        if (!this.rateLimiter.isEventRateLimited(perfMetric)) {
            return true;
        }
        incrementDropCount(perfMetric);
        logger.info("Rate limited (per device) - %s", getLogcatMsg(perfMetric));
        return false;
    }

    private void dispatchLog(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            logger.info("Logging %s. In a minute, visit the Firebase console to view your data: %s", getLogcatMsg(perfMetric), getConsoleUrl(perfMetric.getTraceMetric()));
        } else {
            logger.info("Logging %s", getLogcatMsg(perfMetric));
        }
        this.flgTransport.log(perfMetric);
    }

    private static String getVersionName(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private PerfMetric setApplicationInfoAndBuild(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        updateFirebaseInstallationIdIfPossibleAndNeeded();
        ApplicationInfo.Builder applicationProcessState2 = this.applicationInfoBuilder.setApplicationProcessState(applicationProcessState);
        if (builder.hasTraceMetric() || builder.hasNetworkRequestMetric()) {
            applicationProcessState2 = applicationProcessState2.mo9328clone().putAllCustomAttributes(getGlobalCustomAttributes());
        }
        return builder.setApplicationInfo(applicationProcessState2).build();
    }

    private Map<String, String> getGlobalCustomAttributes() {
        updateFirebasePerformanceIfPossibleAndNeeded();
        FirebasePerformance firebasePerformance = this.firebasePerformance;
        if (firebasePerformance != null) {
            return firebasePerformance.getAttributes();
        }
        return Collections.EMPTY_MAP;
    }

    private void updateFirebasePerformanceIfPossibleAndNeeded() {
        if (this.firebasePerformance == null && isInitialized()) {
            this.firebasePerformance = FirebasePerformance.getInstance();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateFirebaseInstallationIdIfPossibleAndNeeded() {
        String str;
        if (this.configResolver.isPerformanceMonitoringEnabled()) {
            if (!this.applicationInfoBuilder.hasAppInstanceId() || this.isForegroundState) {
                try {
                    str = (String) Tasks.await(this.firebaseInstallationsApi.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    logger.error("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                } catch (ExecutionException e2) {
                    logger.error("Unable to retrieve Installation Id: %s", e2.getMessage());
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                } catch (TimeoutException e3) {
                    logger.error("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    this.applicationInfoBuilder.setAppInstanceId(str);
                } else {
                    logger.warn("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                }
            }
        }
    }

    private void incrementDropCount(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.appStateMonitor.incrementCount(Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.appStateMonitor.incrementCount(Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private static String getLogcatMsg(PerfMetricOrBuilder perfMetricOrBuilder) {
        if (perfMetricOrBuilder.hasTraceMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getTraceMetric());
        }
        if (perfMetricOrBuilder.hasNetworkRequestMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getNetworkRequestMetric());
        }
        if (perfMetricOrBuilder.hasGaugeMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getGaugeMetric());
        }
        return "log";
    }

    private static String getLogcatMsg(TraceMetric traceMetric) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", traceMetric.getName(), new DecimalFormat("#.####").format(traceMetric.getDurationUs() / 1000.0d));
    }

    private static String getLogcatMsg(NetworkRequestMetric networkRequestMetric) {
        String strValueOf;
        long timeToResponseCompletedUs = networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L;
        if (networkRequestMetric.hasHttpResponseCode()) {
            strValueOf = String.valueOf(networkRequestMetric.getHttpResponseCode());
        } else {
            strValueOf = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), strValueOf, new DecimalFormat("#.####").format(timeToResponseCompletedUs / 1000.0d));
    }

    private static String getLogcatMsg(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    private String getConsoleUrl(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        if (name.startsWith("_st_")) {
            return ConsoleUrlGenerator.generateScreenTraceUrl(this.projectId, this.packageName, name);
        }
        return ConsoleUrlGenerator.generateCustomTraceUrl(this.projectId, this.packageName, name);
    }
}
