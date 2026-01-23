package com.robinhood.android.common.util.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityAnalyticsCallback.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/ActivityAnalyticsCallback;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "sourceScreenAnalytics", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;)V", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "resumedTime", "", "onActivityResumed", "", "activity", "Landroid/app/Activity;", "onActivityPaused", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ActivityAnalyticsCallback implements ActivityLifecycleListener {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private long resumedTime;
    private final SourceScreenAnalytics sourceScreenAnalytics;

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public ActivityAnalyticsCallback(AnalyticsLogger analytics, SourceScreenAnalytics sourceScreenAnalytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(sourceScreenAnalytics, "sourceScreenAnalytics");
        this.analytics = analytics;
        this.sourceScreenAnalytics = sourceScreenAnalytics;
    }

    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.resumedTime = SystemClock.elapsedRealtime();
        if (activity instanceof UiCallbacks.ScreenViewAnalyticable) {
            UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable = (UiCallbacks.ScreenViewAnalyticable) activity;
            if (screenViewAnalyticable.getExcludeFromAnalyticsLogging()) {
                return;
            }
            this.sourceScreenAnalytics.onScreenResumed$lib_common_externalRelease(screenViewAnalyticable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof UiCallbacks.ScreenViewAnalyticable) {
            UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable = (UiCallbacks.ScreenViewAnalyticable) activity;
            if (!screenViewAnalyticable.getExcludeFromAnalyticsLogging() && this.resumedTime > 0) {
                int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.resumedTime);
                AnalyticsLogger.DefaultImpls.buildTransitionEvent$default(this.analytics, null, screenViewAnalyticable.getScreenName(), screenViewAnalyticable.getScreenDescription(), screenViewAnalyticable.getAndResetTransitionReason(), screenViewAnalyticable.getScreenSource(), this.sourceScreenAnalytics.onScreenPaused$lib_common_externalRelease(screenViewAnalyticable, iElapsedRealtime), screenViewAnalyticable.getScreenMessageType(), screenViewAnalyticable.getScreenType(), screenViewAnalyticable.getEntityId(), screenViewAnalyticable.getScreenTag(), iElapsedRealtime, 1, null).send();
            }
        }
        this.resumedTime = 0L;
    }
}
