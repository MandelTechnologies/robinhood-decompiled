package com.robinhood.analytics.performance.startup;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.analytics.performance.ColdStartDetector;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger2;
import com.robinhood.analytics.performance.startup.StartupPerformanceLogger4;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: StartupPerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0014¢\u0006\u0004\b/\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, m3636d2 = {"Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/performance/ColdStartDetector;", "coldStartDetector", "Lcom/robinhood/android/util/LockscreenManager;", "lockscreenManager", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStartDetector;Lcom/robinhood/android/util/LockscreenManager;Lcom/robinhood/analytics/SharedEventLogger;Landroid/os/Handler;)V", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;Lj$/time/Clock;Lcom/robinhood/analytics/performance/ColdStartDetector;Lcom/robinhood/android/util/LockscreenManager;Lcom/robinhood/analytics/SharedEventLogger;)V", "Lcom/robinhood/analytics/performance/startup/State;", "newState", "", "updateState", "(Lcom/robinhood/analytics/performance/startup/State;)V", "Lcom/robinhood/analytics/performance/startup/ReportableState;", "logPlt", "(Lcom/robinhood/analytics/performance/startup/ReportableState;)V", "", "duration", "logPltHelper", "(J)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "onLockscreenReady", "()V", "onWatchlistReady", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lj$/time/Clock;", "Lcom/robinhood/analytics/performance/ColdStartDetector;", "Lcom/robinhood/android/util/LockscreenManager;", "Lcom/robinhood/analytics/SharedEventLogger;", "Landroid/os/Handler;", "currentState", "Lcom/robinhood/analytics/performance/startup/State;", "", "hasLoggedPlt", "Z", "getHasLoggedPlt", "()Z", "setHasLoggedPlt", "(Z)V", "lib-startup-performance_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class StartupPerformanceLogger implements ActivityLifecycleListener, LifecycleEventObserver {
    private final Clock clock;
    private final ColdStartDetector coldStartDetector;
    private StartupPerformanceLogger4 currentState;
    private final SharedEventLogger eventLogger;
    private final Handler handler;
    private boolean hasLoggedPlt;
    private final LockscreenManager lockscreenManager;
    private final PerformanceLogger performanceLogger;

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

    public StartupPerformanceLogger(PerformanceLogger performanceLogger, Clock clock, ColdStartDetector coldStartDetector, LockscreenManager lockscreenManager, SharedEventLogger eventLogger, Handler handler) {
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(coldStartDetector, "coldStartDetector");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.performanceLogger = performanceLogger;
        this.clock = clock;
        this.coldStartDetector = coldStartDetector;
        this.lockscreenManager = lockscreenManager;
        this.eventLogger = eventLogger;
        this.handler = handler;
        this.currentState = StartupPerformanceLogger4.Stopped.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StartupPerformanceLogger(PerformanceLogger performanceLogger, Clock clock, ColdStartDetector coldStartDetector, LockscreenManager lockscreenManager, SharedEventLogger eventLogger) {
        this(performanceLogger, clock, coldStartDetector, lockscreenManager, eventLogger, new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(coldStartDetector, "coldStartDetector");
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_STOP) {
            this.handler.removeCallbacksAndMessages(null);
            updateState(StartupPerformanceLogger4.Stopped.INSTANCE);
        }
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.handler.post(new Runnable() { // from class: com.robinhood.analytics.performance.startup.StartupPerformanceLogger.onActivityCreated.1
            @Override // java.lang.Runnable
            public final void run() {
                StartupPerformanceLogger4 startupPerformanceLogger4OnActivityCreated;
                if (activity instanceof StartupActivity) {
                    startupPerformanceLogger4OnActivityCreated = this.currentState.onActivityCreated(this.clock, this.coldStartDetector.getState(), (StartupActivity) activity);
                } else {
                    startupPerformanceLogger4OnActivityCreated = StartupPerformanceLogger4.Aborted.INSTANCE;
                }
                this.updateState(startupPerformanceLogger4OnActivityCreated);
            }
        });
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.handler.post(new Runnable() { // from class: com.robinhood.analytics.performance.startup.StartupPerformanceLogger.onActivityResumed.1
            @Override // java.lang.Runnable
            public final void run() {
                StartupPerformanceLogger4 startupPerformanceLogger4OnActivityResumed;
                if (activity instanceof StartupActivity) {
                    startupPerformanceLogger4OnActivityResumed = this.currentState.onActivityResumed(this.clock, this.lockscreenManager.isLocked(), (StartupActivity) activity);
                } else {
                    startupPerformanceLogger4OnActivityResumed = StartupPerformanceLogger4.Aborted.INSTANCE;
                }
                this.updateState(startupPerformanceLogger4OnActivityResumed);
            }
        });
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.handler.post(new Runnable() { // from class: com.robinhood.analytics.performance.startup.StartupPerformanceLogger.onActivityPaused.1
            @Override // java.lang.Runnable
            public final void run() {
                StartupPerformanceLogger4 startupPerformanceLogger4OnActivityPaused;
                if (activity instanceof StartupActivity) {
                    startupPerformanceLogger4OnActivityPaused = this.currentState.onActivityPaused(this.clock, (StartupActivity) activity);
                } else {
                    startupPerformanceLogger4OnActivityPaused = StartupPerformanceLogger4.Aborted.INSTANCE;
                }
                this.updateState(startupPerformanceLogger4OnActivityPaused);
            }
        });
    }

    public final void onLockscreenReady() {
        this.handler.post(new Runnable() { // from class: com.robinhood.analytics.performance.startup.StartupPerformanceLogger.onLockscreenReady.1
            @Override // java.lang.Runnable
            public final void run() {
                StartupPerformanceLogger startupPerformanceLogger = StartupPerformanceLogger.this;
                startupPerformanceLogger.updateState(startupPerformanceLogger.currentState.onLockscreenReady(StartupPerformanceLogger.this.clock));
            }
        });
    }

    public final void onWatchlistReady() {
        this.handler.post(new Runnable() { // from class: com.robinhood.analytics.performance.startup.StartupPerformanceLogger.onWatchlistReady.1
            @Override // java.lang.Runnable
            public final void run() {
                StartupPerformanceLogger startupPerformanceLogger = StartupPerformanceLogger.this;
                startupPerformanceLogger.updateState(startupPerformanceLogger.currentState.onWatchlistReady(StartupPerformanceLogger.this.clock));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(StartupPerformanceLogger4 newState) {
        PerformanceMetricEventData.Name name;
        this.currentState = newState;
        if (newState instanceof StartupPerformanceLogger2) {
            PerformanceLogger performanceLogger = this.performanceLogger;
            StartupPerformanceLogger2 startupPerformanceLogger2 = (StartupPerformanceLogger2) newState;
            if (startupPerformanceLogger2 instanceof StartupPerformanceLogger2.Lockscreen) {
                name = PerformanceMetricEventData.Name.LOCAL_AUTHENTICATION;
            } else if (startupPerformanceLogger2 instanceof StartupPerformanceLogger2.Home) {
                name = PerformanceMetricEventData.Name.HOME;
            } else {
                if (!(startupPerformanceLogger2 instanceof StartupPerformanceLogger2.Welcome)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = PerformanceMetricEventData.Name.APP_LAUNCH;
            }
            PerformanceMetricEventData.Source source = PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED;
            performanceLogger.reportStartup(name, source, startupPerformanceLogger2.getStartTimestamp(), startupPerformanceLogger2.getEndTimestamp(), startupPerformanceLogger2.isFromColdStart(), startupPerformanceLogger2.getRequiresLocalAuth());
            if (newState instanceof StartupPerformanceLogger2.Home) {
                StartupPerformanceLogger2.Home home = (StartupPerformanceLogger2.Home) newState;
                this.performanceLogger.reportStartup(PerformanceMetricEventData.Name.HOME_SETUP_POST_LAUNCH, source, home.getProcessLaunchEndTimestamp(), home.getEndTimestamp(), home.isFromColdStart(), home.getRequiresLocalAuth());
            }
            logPlt(startupPerformanceLogger2);
        }
    }

    private final void logPlt(StartupPerformanceLogger2 newState) {
        long millis = Duration.between(newState.getStartTimestamp(), newState.getEndTimestamp()).toMillis();
        if (newState instanceof StartupPerformanceLogger2.Home) {
            if (((StartupPerformanceLogger2.Home) newState).getRequiresLocalAuth()) {
                return;
            }
            logPltHelper(millis);
        } else if (newState instanceof StartupPerformanceLogger2.Lockscreen) {
            logPltHelper(millis);
        } else if (!(newState instanceof StartupPerformanceLogger2.Welcome)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean getHasLoggedPlt() {
        return this.hasLoggedPlt;
    }

    public final void setHasLoggedPlt(boolean z) {
        this.hasLoggedPlt = z;
    }

    private final void logPltHelper(long duration) {
        String str;
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (!this.hasLoggedPlt) {
            str = "robinhood_app_launch";
        } else {
            str = "robinhood_app_launch_active_prewarm";
        }
        sharedEventLogger.logPltEvent(new PerceivedLoadingTimeEventData(duration, duration, new Screen(null, null, str, null, 11, null), false, 0, 0, null, 120, null));
        this.hasLoggedPlt = true;
    }
}
