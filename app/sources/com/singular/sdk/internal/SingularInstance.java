package com.singular.sdk.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.singular.sdk.ShortLinkHandler;
import com.singular.sdk.SingularConfig;
import com.singular.sdk.SingularDeviceAttributionHandler;
import com.singular.sdk.internal.ApiCustomUserId;
import com.singular.sdk.internal.ApiGDPRConsent;
import com.singular.sdk.internal.ApiGDPRUnder13;
import com.singular.sdk.internal.ApiStartSession;
import com.singular.sdk.internal.ApiSubmitEvent;
import com.singular.sdk.internal.InstallReferrer.SLDigitalTurbineReferrer;
import com.singular.sdk.internal.InstallReferrer.SLGoogleReferrer;
import com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler;
import com.singular.sdk.internal.InstallReferrer.SLSamsungReferrer;
import com.singular.sdk.internal.utils.SLJsonUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SingularInstance {
    private static final int RETRY_DELAY_INTERVAL_MS = 200;
    private static SingularInstance instance;
    private static final SingularLog logger = SingularLog.getLogger("Instance");
    private static int retryCounter = 0;
    private final ApiManager apiManager;
    private SingularConfig config;
    private final Context context;
    private DeviceInfo deviceInfo;
    String dtInstallReferrer;
    private HashMap<String, String> globalProperties;
    Map<String, Object> googleInstallReferrer;
    private double installReferrerTimeInterval;
    Map<String, Object> metaInstallReferrer;
    Map<String, Object> samsungInstallReferrer;
    private SessionManager sessionManager;
    private final SingularWorkerThread worker;
    private boolean initialized = false;
    private boolean isFirstInstall = false;

    public static SingularInstance getInstance(Context context, SingularConfig singularConfig) throws IOException {
        if (instance == null) {
            synchronized (SingularInstance.class) {
                try {
                    if (instance == null) {
                        SingularLog.ENABLE_LOGGING = singularConfig.enableLogging;
                        SingularLog.LOG_LEVEL = singularConfig.logLevel;
                        instance = new SingularInstance(context, singularConfig);
                    }
                } finally {
                }
            }
        }
        SingularInstance singularInstance = instance;
        singularInstance.config = singularConfig;
        return singularInstance;
    }

    public static SingularInstance getInstance() {
        return instance;
    }

    private SingularInstance(Context context, SingularConfig singularConfig) throws IOException {
        SingularLog singularLog = logger;
        singularLog.debug("SDK version: %s", Constants.SDK_VERSION);
        singularLog.debug("SDK build info: %s", Constants.SDK_BUILD_INFO);
        singularLog.debug("new SingularInstance() with config: %s", singularConfig);
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            throw new IllegalStateException("Context failed to cast to ApplicationContext");
        }
        this.context = applicationContext;
        this.config = singularConfig;
        SingularWorkerThread singularWorkerThread = new SingularWorkerThread("worker");
        this.worker = singularWorkerThread;
        this.apiManager = new ApiManager(new SingularWorkerThread("api"), context, new SQLitePersistentQueue(context));
        singularWorkerThread.start();
        initGlobalProperties();
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.1
            @Override // java.lang.Runnable
            public void run() {
                SingularInstance.this.init(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init(SingularInstance singularInstance) {
        if (isInitialized()) {
            logger.error("Singular is already initialized, please don't call init() again.");
            return;
        }
        try {
            singularInstance.isFirstInstall = Utils.isFirstInstall(getContext());
            if (!Utils.isEmptyOrNull(this.config.fcmDeviceToken)) {
                saveDeviceToken(Constants.FCM_DEVICE_TOKEN_KEY, this.config.fcmDeviceToken);
            }
            String str = this.config.customUserId;
            if (str != null) {
                saveCustomUserId(str);
            }
            Boolean bool = this.config.limitDataSharing;
            if (bool != null) {
                limitDataSharing(bool.booleanValue());
            }
            String str2 = this.config.imei;
            if (str2 != null) {
                setIMEI(str2);
            }
            singularInstance.deviceInfo = new DeviceInfo(singularInstance.context, this.config.collectOAID, Boolean.valueOf(isLimitAdvertisingIdentifiers()));
            ConfigManager.getInstance().setup();
            DeviceIDManager.getInstance().setup(singularInstance);
            BatchManager.getInstance().setup(this.context);
            BatchManager.getInstance().sendEvents();
            singularInstance.sessionManager = new SessionManager(singularInstance);
            this.initialized = true;
            logger.info("Singular is initialized now.");
        } catch (Throwable th) {
            logger.error("error in init()", th);
        }
    }

    private void initGlobalProperties() {
        this.globalProperties = loadGlobalProperties();
        if (this.config.globalProperties.size() == 0) {
            return;
        }
        HashMap<String, String> map = (HashMap) this.globalProperties.clone();
        for (SingularGlobalProperty singularGlobalProperty : this.config.globalProperties.values()) {
            if (singularGlobalProperty.isOverrideExisting() || !map.containsKey(singularGlobalProperty.getKey())) {
                map.put(singularGlobalProperty.getKey(), singularGlobalProperty.getValue());
            }
        }
        if (map.size() > 5) {
            return;
        }
        this.globalProperties = map;
        saveGlobalProperties();
        if (this.globalProperties == null) {
            clearGlobalProperties();
        }
    }

    ApiManager getApiManager() {
        return this.apiManager;
    }

    Context getContext() {
        return this.context;
    }

    boolean isInitialized() {
        return this.initialized;
    }

    DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    SingularConfig getSingularConfig() {
        return this.config;
    }

    SessionManager getSessionManager() {
        return this.sessionManager;
    }

    public long getSessionId() {
        SessionManager sessionManager = this.sessionManager;
        if (sessionManager == null) {
            return -1L;
        }
        return sessionManager.getSessionId();
    }

    private boolean isSessionManagerInitialized() {
        return (!isInitialized() || getInstance() == null || getSessionManager() == null) ? false : true;
    }

    public boolean logEvent(String str) {
        return logEvent(str, null);
    }

    public boolean logEvent(String str, String str2) {
        int length = (str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0);
        if (length > 3746) {
            logger.debug("Event discarded! payload length = %d", Integer.valueOf(length));
            return false;
        }
        logEvent(new ApiSubmitEvent.RawEvent(str, str2));
        return true;
    }

    void logEvent(final ApiSubmitEvent.RawEvent rawEvent) {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else if (!isSessionManagerInitialized()) {
            retryTask(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.2
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.this.logEvent(rawEvent);
                }
            });
        } else {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.3
                @Override // java.lang.Runnable
                public void run() {
                    ApiSubmitEvent apiSubmitEvent = new ApiSubmitEvent(rawEvent.timestamp);
                    apiSubmitEvent.addParams(ApiSubmitEvent.Params.build(rawEvent, SingularInstance.instance));
                    if (!apiSubmitEvent.isAdmonEvent() || BatchManager.getInstance() == null) {
                        SingularInstance.instance.apiManager.enqueue(apiSubmitEvent);
                    } else {
                        BatchManager.getInstance().addToBatch(apiSubmitEvent);
                    }
                }
            });
        }
    }

    void logApi(final BaseApi baseApi) {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else if (!isSessionManagerInitialized()) {
            retryTask(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.4
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.this.logApi(baseApi);
                }
            });
        } else {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.5
                @Override // java.lang.Runnable
                public void run() {
                    SingularInstance.instance.apiManager.enqueue(baseApi);
                }
            });
        }
    }

    void logSessionStart(final long j) {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else {
            runOnWorkerAtFront(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.6
                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    if (SingularInstance.instance != null) {
                        if (SingularInstance.this.isFirstInstall) {
                            SingularInstance.this.fetchMetaInstallReferrer();
                            SingularInstance.this.fetchDTInstallReferrer();
                            SingularInstance.this.fetchInstallReferrerAndSendSession(j);
                            return;
                        }
                        SingularInstance.this.startSession(j);
                    }
                }
            });
        }
    }

    void fetchMetaInstallReferrer() {
        new SLMetaReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.7
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                SingularInstance.this.metaInstallReferrer = map;
            }
        });
    }

    void fetchDTInstallReferrer() {
        new SLDigitalTurbineReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.8
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                if (map == null || !map.containsKey(Constants.DT_INSTALL_REFERRER_KEY)) {
                    return;
                }
                SingularInstance.this.dtInstallReferrer = map.get(Constants.DT_INSTALL_REFERRER_KEY).toString();
            }
        });
    }

    void fetchInstallReferrerAndSendSession(long j) throws InterruptedException {
        final long currentTimeMillis = Utils.getCurrentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        new SLGoogleReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.9
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                SingularInstance.this.googleInstallReferrer = map;
                countDownLatch.countDown();
                SingularInstance.this.installReferrerTimeInterval = Utils.lagSince(currentTimeMillis);
            }
        });
        new SLSamsungReferrer().fetchReferrer(getContext(), new SLInstallReferrerCompletionHandler() { // from class: com.singular.sdk.internal.SingularInstance.10
            @Override // com.singular.sdk.internal.InstallReferrer.SLInstallReferrerCompletionHandler
            public void onInstallReferrerReceived(Map<String, Object> map) {
                SingularInstance.this.samsungInstallReferrer = map;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            logger.debug("InterruptedException!");
        }
        startSession(j);
    }

    void startSession(long j) {
        ApiStartSession apiStartSession = new ApiStartSession(j);
        apiStartSession.addParams(ApiStartSession.Params.build(j, instance));
        instance.apiManager.enqueue(apiStartSession);
        SingularInstance singularInstance = instance;
        singularInstance.config.openUri = null;
        singularInstance.isFirstInstall = false;
    }

    public void logSetDeviceCustomUserId() {
        if (isAllTrackingStopped()) {
            logger.debug("Tracking was stopped! not logging event!");
        } else {
            runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.11
                @Override // java.lang.Runnable
                public void run() {
                    ApiCustomUserId apiCustomUserId = new ApiCustomUserId(Utils.getCurrentTimeMillis());
                    apiCustomUserId.addParams(ApiCustomUserId.Params.build(SingularInstance.instance));
                    SingularInstance.instance.apiManager.enqueue(apiCustomUserId);
                }
            });
        }
    }

    void retryTask(Runnable runnable) {
        if (retryCounter < 10) {
            runOnWorkerDelayed(runnable, 200);
            retryCounter++;
        }
    }

    void runOnWorker(Runnable runnable) {
        this.worker.post(runnable);
    }

    void runOnWorkerAtFront(Runnable runnable) {
        this.worker.postAtFront(runnable);
    }

    void runOnWorkerDelayed(Runnable runnable, int i) {
        this.worker.postDelayed(runnable, i);
    }

    public void onActivityPaused(long j) {
        this.sessionManager.onExitForeground(j);
    }

    public void onActivityResumed(long j) {
        SessionManager sessionManager = this.sessionManager;
        if (sessionManager != null) {
            sessionManager.onEnterForeground(j);
        }
    }

    public void startSessionIfOpenedWithPush() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.12
            @Override // java.lang.Runnable
            public void run() {
                SingularInstance.this.sessionManager.startNewSession(Utils.getCurrentTimeMillis());
            }
        });
    }

    public void startSessionIfOpenedWithDeeplink() {
        if (this.config.singularLink == null) {
            return;
        }
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.13
            @Override // java.lang.Runnable
            public void run() {
                SingularInstance.this.sessionManager.startNewSession(Utils.getCurrentTimeMillis());
            }
        });
    }

    public void saveGCMDeviceToken(String str) {
        saveDeviceToken(Constants.GCM_DEVICE_TOKEN_KEY, str);
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setGcmRegId(str);
        }
    }

    public void saveFCMDeviceToken(String str) {
        saveDeviceToken(Constants.FCM_DEVICE_TOKEN_KEY, str);
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setFcmRegId(str);
        }
    }

    public void saveCustomUserId(String str) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.putString(Constants.CUSTOM_USER_ID_KEY, str);
        editorEdit.commit();
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setCustomUserId(str);
        }
    }

    private void saveDeviceToken(String str, String str2) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public void sendTrackingOptIn() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.14
            @Override // java.lang.Runnable
            public void run() {
                ApiGDPRConsent apiGDPRConsent = new ApiGDPRConsent(Utils.getCurrentTimeMillis());
                apiGDPRConsent.addParams(ApiGDPRConsent.Params.build(this));
                SingularInstance.this.logApi(apiGDPRConsent);
            }
        });
    }

    public void sendTrackingUnder13() {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.15
            @Override // java.lang.Runnable
            public void run() {
                ApiGDPRUnder13 apiGDPRUnder13 = new ApiGDPRUnder13(Utils.getCurrentTimeMillis());
                apiGDPRUnder13.addParams(ApiGDPRUnder13.Params.build(this));
                SingularInstance.this.logApi(apiGDPRUnder13);
            }
        });
    }

    public void stopAllTracking() {
        persistBoolean(Constants.STOP_ALL_TRACKING_KEY, true);
    }

    public void resumeAllTracking() {
        persistBoolean(Constants.STOP_ALL_TRACKING_KEY, false);
    }

    public boolean isAllTrackingStopped() {
        return getSharedPreferences().getBoolean(Constants.STOP_ALL_TRACKING_KEY, false);
    }

    public void limitDataSharing(boolean z) {
        saveBooleanToPref("limit_data_sharing", z);
    }

    public Boolean getLimitDataSharing() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences.contains("limit_data_sharing")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("limit_data_sharing", false));
        }
        return null;
    }

    public void setLimitAdvertisingIdentifiers(boolean z) {
        try {
            if (instance == null) {
                logger.debug("setLimitAdvertisingIdentifiers: instance null, returning.");
                return;
            }
            SingularConfig singularConfig = this.config;
            if (singularConfig == null) {
                logger.debug("setLimitAdvertisingIdentifiers: config null, returning.");
                return;
            }
            singularConfig.limitAdvertisingIdentifiers = Boolean.valueOf(z);
            SingularInstance singularInstance = instance;
            DeviceInfo deviceInfo = singularInstance.deviceInfo;
            if (deviceInfo == null) {
                logger.debug("setLimitAdvertisingIdentifiers: deviceInfo null, returning.");
            } else if (z) {
                deviceInfo.resetAdvertisingIdentifiers();
            } else if (singularInstance.context != null) {
                runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.16
                    @Override // java.lang.Runnable
                    public void run() {
                        SingularInstance.instance.deviceInfo.blockingFetchLimitedAdvertisingIdentifiers(SingularInstance.instance.context);
                    }
                });
            }
        } catch (Throwable th) {
            logger.debug("setLimitAdvertisingIdentifiers failed with exception: " + Utils.formatException(th));
        }
    }

    public boolean isLimitAdvertisingIdentifiers() {
        if (instance == null) {
            logger.debug("isLimitAdvertisingIdentifiers: instance null, returning default false.");
            return false;
        }
        SingularConfig singularConfig = this.config;
        if (singularConfig == null) {
            logger.debug("isLimitAdvertisingIdentifiers: config null, returning default false.");
            return false;
        }
        return singularConfig.limitAdvertisingIdentifiers.booleanValue();
    }

    public Map getGoogleInstallReferrer() {
        return this.googleInstallReferrer;
    }

    public Map getSamsungInstallReferrer() {
        return this.samsungInstallReferrer;
    }

    public String getDTInstallReferrer() {
        return this.dtInstallReferrer;
    }

    public Map getMetaInstallReferrer() {
        return this.metaInstallReferrer;
    }

    public boolean getIsFirstInstall() {
        return this.isFirstInstall;
    }

    public double getInstallReferrerTimeInterval() {
        return this.installReferrerTimeInterval;
    }

    private SharedPreferences getSharedPreferences() {
        return this.context.getSharedPreferences(Constants.PREF_SESSION, 0);
    }

    private void persistBoolean(final String str, final boolean z) {
        runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.17
            @Override // java.lang.Runnable
            public void run() {
                SingularInstance.this.saveBooleanToPref(str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveBooleanToPref(String str, boolean z) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.putBoolean(str, z);
        editorEdit.commit();
    }

    public void setIMEI(String str) {
        Utils.setImei(str);
    }

    public HashMap<String, String> getGlobalProperties() {
        return this.globalProperties;
    }

    public JSONObject getGlobalPropertiesJSON() {
        return new JSONObject((Map<?, ?>) this.globalProperties);
    }

    private boolean putGlobalProperty(SingularGlobalProperty singularGlobalProperty) {
        if (this.globalProperties.containsKey(singularGlobalProperty.getKey())) {
            if (singularGlobalProperty.isOverrideExisting()) {
                this.globalProperties.put(singularGlobalProperty.getKey(), singularGlobalProperty.getValue());
            }
            return true;
        }
        if (this.globalProperties.size() >= 5) {
            return false;
        }
        this.globalProperties.put(singularGlobalProperty.getKey(), singularGlobalProperty.getValue());
        return true;
    }

    public boolean setGlobalProperty(SingularGlobalProperty singularGlobalProperty) {
        if (!putGlobalProperty(singularGlobalProperty)) {
            return false;
        }
        saveGlobalProperties();
        return true;
    }

    public void removeGlobalProperty(String str) {
        if (Utils.isEmptyOrNull(str) || !this.globalProperties.containsKey(str)) {
            return;
        }
        this.globalProperties.remove(str);
        saveGlobalProperties();
    }

    public void clearGlobalProperties() {
        this.globalProperties = null;
        saveGlobalProperties();
    }

    private void saveGlobalProperties() {
        if (this.globalProperties == null) {
            this.globalProperties = new HashMap<>();
        }
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.putString(Constants.GLOBAL_PROPERTIES_KEY, getGlobalPropertiesJSON().toString());
        editorEdit.commit();
    }

    public HashMap<String, String> loadGlobalProperties() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(getSharedPreferences().getString(Constants.GLOBAL_PROPERTIES_KEY, "{}"));
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            } catch (Throwable unused2) {
            }
        }
        return map;
    }

    public void createReferrerShortLink(String str, String str2, String str3, JSONObject jSONObject, ShortLinkHandler shortLinkHandler) {
        if (!ReferrerLinkService.validateRequest(str, str2, str3, jSONObject)) {
            shortLinkHandler.onError("Error sending request: could not validate request params");
            return;
        }
        try {
            ReferrerLinkService.sendReferrerRequest(ReferrerLinkService.unifyParamsToUrl(str, str2, str3, jSONObject), shortLinkHandler);
        } catch (JSONException e) {
            logger.error("Error in JSON parsing ", e);
            shortLinkHandler.onError("Error sending request: could not unify params");
        }
    }

    public void handleDeviceAttributionData(JSONObject jSONObject) {
        try {
            final Map<String, Object> mapJsonToMap = SLJsonUtils.jsonToMap(jSONObject);
            logger.debug("device attribution json to map: " + mapJsonToMap);
            final SingularDeviceAttributionHandler singularDeviceAttributionHandler = this.config.deviceAttributionHandler;
            if (mapJsonToMap == null || singularDeviceAttributionHandler == null) {
                return;
            }
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.SingularInstance.18
                @Override // java.lang.Runnable
                public void run() {
                    singularDeviceAttributionHandler.onDeviceAttributionInfoReceived(mapJsonToMap);
                }
            });
        } catch (Throwable th) {
            logger.debug("could not convert device attribution json object to map" + th.getMessage());
        }
    }
}
