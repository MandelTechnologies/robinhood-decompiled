package com.robinhood.analytics.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p479j$.time.Instant;

/* compiled from: ColdStartDetector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/analytics/performance/SharedColdStartDetector;", "Lcom/robinhood/analytics/performance/ColdStartDetector;", "Landroidx/lifecycle/LifecycleEventObserver;", "<init>", "()V", "value", "Lcom/robinhood/analytics/performance/ColdStart;", "state", "getState", "()Lcom/robinhood/analytics/performance/ColdStart;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onApplicationCreate", "application", "Landroid/app/Application;", "onApplicationCreate$lib_analytics_externalRelease", "isForegroundProcess", "", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.performance.SharedColdStartDetector, reason: use source file name */
/* loaded from: classes17.dex */
public final class ColdStartDetector3 implements ColdStartDetector, LifecycleEventObserver {
    public static final ColdStartDetector3 INSTANCE;
    private static ColdStart state;

    /* compiled from: ColdStartDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.performance.SharedColdStartDetector$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ColdStartDetector3() {
    }

    static {
        ColdStartDetector3 coldStartDetector3 = new ColdStartDetector3();
        INSTANCE = coldStartDetector3;
        ProcessLifecycleOwner.INSTANCE.get().getRegistry().addObserver(coldStartDetector3);
    }

    @Override // com.robinhood.analytics.performance.ColdStartDetector
    public ColdStart getState() {
        return state;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
            case 7:
                state = null;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void onApplicationCreate$lib_analytics_externalRelease(final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (isForegroundProcess()) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.analytics.performance.SharedColdStartDetector$onApplicationCreate$1
                @Override // java.lang.Runnable
                public final void run() {
                    booleanRef.element = false;
                }
            });
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleListener() { // from class: com.robinhood.analytics.performance.SharedColdStartDetector$onApplicationCreate$2
                @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
                }

                @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
                }

                @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    ActivityLifecycleListener.DefaultImpls.onActivityResumed(this, activity);
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

                @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    StartupTime startupTime;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    application.unregisterActivityLifecycleCallbacks(this);
                    if (booleanRef.element && savedInstanceState == null && (startupTime = (StartupTime) FirebaseApp.getInstance().get(StartupTime.class)) != null) {
                        ColdStartDetector3 coldStartDetector3 = ColdStartDetector3.INSTANCE;
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(startupTime.getEpochMillis());
                        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                        ColdStartDetector3.state = new ColdStart(instantOfEpochMilli, activity.getClass());
                    }
                }
            });
        }
    }

    private final boolean isForegroundProcess() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100;
    }
}
