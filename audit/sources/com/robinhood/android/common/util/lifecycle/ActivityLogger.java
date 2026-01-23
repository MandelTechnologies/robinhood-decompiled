package com.robinhood.android.common.util.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.LruCache;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: ActivityLogger.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/ActivityLogger;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "<init>", "()V", "descriptorCache", "Landroid/util/LruCache;", "", "", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResumed", "onActivityPaused", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "getActivityInfo", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ActivityLogger implements ActivityLifecycleListener {
    public static final int $stable = 8;
    private final LruCache<Integer, String> descriptorCache = new LruCache<>(5);

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Timber.INSTANCE.mo3356i("onCreate -- %s", getActivityInfo(activity));
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Timber.INSTANCE.mo3356i("onResume -- %s", getActivityInfo(activity));
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Timber.INSTANCE.mo3356i("onPause -- %s", getActivityInfo(activity));
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Timber.INSTANCE.mo3356i("onSaveInstanceState -- %s", getActivityInfo(activity));
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Timber.INSTANCE.mo3356i("onDestroy -- %s", getActivityInfo(activity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getActivityInfo(Activity activity) {
        int iHashCode = activity.hashCode();
        String str = this.descriptorCache.get(Integer.valueOf(iHashCode));
        if (str == null) {
            str = activity.getClass().getSimpleName() + "@" + Integer.toHexString(iHashCode);
            this.descriptorCache.put(Integer.valueOf(iHashCode), str);
        }
        String screenDescription = null;
        try {
            if (activity instanceof UiCallbacks.ScreenViewAnalyticable) {
                screenDescription = ((UiCallbacks.ScreenViewAnalyticable) activity).getScreenDescription();
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
        }
        if (screenDescription == null) {
            return str;
        }
        return str + PlaceholderUtils.XXShortPlaceholderText + screenDescription;
    }
}
