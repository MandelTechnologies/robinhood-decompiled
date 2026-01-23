package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.ITransactionProfiler;
import io.sentry.SentryDate;
import io.sentry.SentryNanotimeDate;
import io.sentry.TracesSamplingDecision;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes21.dex */
public class AppStartMetrics extends ActivityLifecycleCallbacksAdapter {
    private static long CLASS_LOADED_UPTIME_MS = SystemClock.uptimeMillis();
    private static volatile AppStartMetrics instance;
    private boolean appLaunchedInForeground;
    private AppStartType appStartType = AppStartType.UNKNOWN;
    private ITransactionProfiler appStartProfiler = null;
    private TracesSamplingDecision appStartSamplingDecision = null;
    private SentryDate onCreateTime = null;
    private boolean appLaunchTooLong = false;
    private boolean isCallbackRegistered = false;
    private final TimeSpan appStartSpan = new TimeSpan();
    private final TimeSpan sdkInitTimeSpan = new TimeSpan();
    private final TimeSpan applicationOnCreate = new TimeSpan();
    private final Map<ContentProvider, TimeSpan> contentProviderOnCreates = new HashMap();
    private final List<ActivityLifecycleTimeSpan> activityLifecycles = new ArrayList();

    public enum AppStartType {
        UNKNOWN,
        COLD,
        WARM
    }

    public static AppStartMetrics getInstance() {
        if (instance == null) {
            synchronized (AppStartMetrics.class) {
                try {
                    if (instance == null) {
                        instance = new AppStartMetrics();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public AppStartMetrics() {
        this.appLaunchedInForeground = false;
        this.appLaunchedInForeground = ContextUtils.isForegroundImportance();
    }

    public TimeSpan getAppStartTimeSpan() {
        return this.appStartSpan;
    }

    public TimeSpan getSdkInitTimeSpan() {
        return this.sdkInitTimeSpan;
    }

    public TimeSpan getApplicationOnCreateTimeSpan() {
        return this.applicationOnCreate;
    }

    public void setAppStartType(AppStartType appStartType) {
        this.appStartType = appStartType;
    }

    public AppStartType getAppStartType() {
        return this.appStartType;
    }

    public List<TimeSpan> getContentProviderOnCreateTimeSpans() {
        ArrayList arrayList = new ArrayList(this.contentProviderOnCreates.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public List<ActivityLifecycleTimeSpan> getActivityLifecycleTimeSpans() {
        ArrayList arrayList = new ArrayList(this.activityLifecycles);
        Collections.sort(arrayList);
        return arrayList;
    }

    public void addActivityLifecycleTimeSpans(ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        this.activityLifecycles.add(activityLifecycleTimeSpan);
    }

    public long getClassLoadedUptimeMs() {
        return CLASS_LOADED_UPTIME_MS;
    }

    public TimeSpan getAppStartTimeSpanWithFallback(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            TimeSpan appStartTimeSpan = getAppStartTimeSpan();
            if (appStartTimeSpan.hasStarted()) {
                return validateAppStartSpan(appStartTimeSpan);
            }
        }
        return validateAppStartSpan(getSdkInitTimeSpan());
    }

    private TimeSpan validateAppStartSpan(TimeSpan timeSpan) {
        return (this.appLaunchTooLong || !this.appLaunchedInForeground) ? new TimeSpan() : timeSpan;
    }

    public ITransactionProfiler getAppStartProfiler() {
        return this.appStartProfiler;
    }

    public void setAppStartProfiler(ITransactionProfiler iTransactionProfiler) {
        this.appStartProfiler = iTransactionProfiler;
    }

    public void setAppStartSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        this.appStartSamplingDecision = tracesSamplingDecision;
    }

    public TracesSamplingDecision getAppStartSamplingDecision() {
        return this.appStartSamplingDecision;
    }

    public void registerApplicationForegroundCheck(final Application application) {
        if (this.isCallbackRegistered) {
            return;
        }
        boolean z = true;
        this.isCallbackRegistered = true;
        if (!this.appLaunchedInForeground && !ContextUtils.isForegroundImportance()) {
            z = false;
        }
        this.appLaunchedInForeground = z;
        application.registerActivityLifecycleCallbacks(instance);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.checkCreateTimeOnMain(application);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCreateTimeOnMain(final Application application) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppStartMetrics.$r8$lambda$K2XrijRmih0lxN3yFXUqXcvK2xA(this.f$0, application);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$K2XrijRmih0lxN3yFXUqXcvK2xA(AppStartMetrics appStartMetrics, Application application) {
        if (appStartMetrics.onCreateTime == null) {
            appStartMetrics.appLaunchedInForeground = false;
        }
        application.unregisterActivityLifecycleCallbacks(instance);
        ITransactionProfiler iTransactionProfiler = appStartMetrics.appStartProfiler;
        if (iTransactionProfiler == null || !iTransactionProfiler.isRunning()) {
            return;
        }
        appStartMetrics.appStartProfiler.close();
        appStartMetrics.appStartProfiler = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long jCurrentTimeMillis;
        if (this.appLaunchedInForeground && this.onCreateTime == null) {
            this.onCreateTime = new SentryNanotimeDate();
            long startTimestampMs = this.appStartSpan.getStartTimestampMs();
            if (this.appStartSpan.hasStopped()) {
                jCurrentTimeMillis = this.appStartSpan.getProjectedStopTimestampMs();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (jCurrentTimeMillis - startTimestampMs > TimeUnit.MINUTES.toMillis(1L)) {
                this.appLaunchTooLong = true;
            }
        }
    }
}
