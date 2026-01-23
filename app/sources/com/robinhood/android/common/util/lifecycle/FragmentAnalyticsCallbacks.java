package com.robinhood.android.common.util.lifecycle;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.UiCallbacks;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FragmentAnalyticsCallbacks.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/util/lifecycle/FragmentAnalyticsCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "sourceScreenAnalytics", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/common/util/lifecycle/SourceScreenAnalytics;)V", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "resumeTimes", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "eventsBuilderStack", "Ljava/util/LinkedList;", "Lcom/robinhood/analytics/AnalyticsLogger$EventBuilder;", "handler", "Landroid/os/Handler;", "sendEventRunnable", "Ljava/lang/Runnable;", "onFragmentResumed", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "onFragmentPaused", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class FragmentAnalyticsCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final LinkedList<AnalyticsLogger.EventBuilder> eventsBuilderStack;
    private final Handler handler;
    private final HashMap<Integer, Long> resumeTimes;
    private final Runnable sendEventRunnable;
    private final SourceScreenAnalytics sourceScreenAnalytics;

    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    public FragmentAnalyticsCallbacks(AnalyticsLogger analytics, SourceScreenAnalytics sourceScreenAnalytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(sourceScreenAnalytics, "sourceScreenAnalytics");
        this.analytics = analytics;
        this.sourceScreenAnalytics = sourceScreenAnalytics;
        this.resumeTimes = new HashMap<>();
        this.eventsBuilderStack = new LinkedList<>();
        this.handler = new Handler(Looper.getMainLooper());
        this.sendEventRunnable = new Runnable() { // from class: com.robinhood.android.common.util.lifecycle.FragmentAnalyticsCallbacks$sendEventRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                while (!this.this$0.eventsBuilderStack.isEmpty()) {
                    ((AnalyticsLogger.EventBuilder) this.this$0.eventsBuilderStack.pop()).send();
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        if (f instanceof UiCallbacks.ScreenViewAnalyticable) {
            UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable = (UiCallbacks.ScreenViewAnalyticable) f;
            if (screenViewAnalyticable.getExcludeFromAnalyticsLogging()) {
                return;
            }
            if (!this.eventsBuilderStack.isEmpty()) {
                this.handler.removeCallbacks(this.sendEventRunnable);
                while (!this.eventsBuilderStack.isEmpty()) {
                    this.eventsBuilderStack.pop().appendEventData("target_screen_name", screenViewAnalyticable.getScreenName()).send();
                }
            }
            this.resumeTimes.put(Integer.valueOf(f.hashCode()), Long.valueOf(SystemClock.elapsedRealtime()));
            this.sourceScreenAnalytics.onScreenResumed$lib_common_externalRelease((UiCallbacks.ScreenViewAnalyticable) f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Long lRemove = this.resumeTimes.remove(Integer.valueOf(f.hashCode()));
        if (lRemove == null || !(f instanceof UiCallbacks.ScreenViewAnalyticable)) {
            return;
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - lRemove.longValue());
        UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable = (UiCallbacks.ScreenViewAnalyticable) f;
        AnalyticsLogger.EventBuilder eventBuilderBuildTransitionEvent$default = AnalyticsLogger.DefaultImpls.buildTransitionEvent$default(this.analytics, null, screenViewAnalyticable.getScreenName(), screenViewAnalyticable.getScreenDescription(), screenViewAnalyticable.getAndResetTransitionReason(), screenViewAnalyticable.getScreenSource(), this.sourceScreenAnalytics.onScreenPaused$lib_common_externalRelease(screenViewAnalyticable, iElapsedRealtime), screenViewAnalyticable.getScreenMessageType(), screenViewAnalyticable.getScreenType(), screenViewAnalyticable.getEntityId(), screenViewAnalyticable.getScreenTag(), iElapsedRealtime, 1, null);
        Integer screenDepth = screenViewAnalyticable.getScreenDepth();
        if (screenDepth != null) {
            eventBuilderBuildTransitionEvent$default.appendEventData("screen_depth", Integer.valueOf(screenDepth.intValue()));
        }
        this.eventsBuilderStack.push(eventBuilderBuildTransitionEvent$default);
        this.handler.postDelayed(this.sendEventRunnable, 500L);
    }
}
