package com.robinhood.android.common.util.analytics;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.ScreenViewAnalyticables;
import com.robinhood.android.common.util.lifecycle.SourceScreenEventLogging;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AutoScreenEventLoggingCallbacks.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/util/analytics/AutoScreenEventLoggingCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "sourceScreenEventLogging", "Lcom/robinhood/android/common/util/lifecycle/SourceScreenEventLogging;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/common/util/lifecycle/SourceScreenEventLogging;)V", "onFragmentStarted", "", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "onFragmentStopped", "sendScreenEvent", "fragment", Analytics3.EVENT_APPEAR, "", "canSendScreenEvent", "trackSourceScreenIfNecessary", "generateScreenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class AutoScreenEventLoggingCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    public static final int $stable = 8;
    private final EventLogger eventLogger;
    private final SourceScreenEventLogging sourceScreenEventLogging;

    public AutoScreenEventLoggingCallbacks(EventLogger eventLogger, SourceScreenEventLogging sourceScreenEventLogging) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(sourceScreenEventLogging, "sourceScreenEventLogging");
        this.eventLogger = eventLogger;
        this.sourceScreenEventLogging = sourceScreenEventLogging;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        sendScreenEvent(f, true);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        sendScreenEvent(f, false);
    }

    private final void sendScreenEvent(Fragment fragment, boolean appear) {
        if (!canSendScreenEvent(fragment, appear)) {
            trackSourceScreenIfNecessary(fragment, appear);
        } else {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, generateScreenEventData(fragment, appear), false, false, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canSendScreenEvent(Fragment fragment, boolean appear) {
        if (!(fragment instanceof AutoLoggableFragment)) {
            return (fragment instanceof UiCallbacks.ScreenViewAnalyticable) && !((UiCallbacks.ScreenViewAnalyticable) fragment).getExcludeFromAnalyticsLogging();
        }
        AutoLoggableFragment autoLoggableFragment = (AutoLoggableFragment) fragment;
        return !autoLoggableFragment.getExcludeFromAutoScreenEventLogging() && ((appear && !autoLoggableFragment.getExcludeFromAutoScreenAppearEventLogging()) || (!appear && !autoLoggableFragment.getExcludeFromAutoScreenDisappearEventLogging()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void trackSourceScreenIfNecessary(Fragment fragment, boolean appear) {
        if (fragment instanceof AutoLoggableFragment) {
            AutoLoggableFragment autoLoggableFragment = (AutoLoggableFragment) fragment;
            if (autoLoggableFragment.getExcludeFromAutoScreenEventLogging()) {
                return;
            }
            if (autoLoggableFragment.getExcludeFromAutoScreenAppearEventLogging() && autoLoggableFragment.getExcludeFromAutoScreenDisappearEventLogging()) {
                return;
            }
            if (appear) {
                this.sourceScreenEventLogging.onScreenStarted$lib_common_externalRelease(fragment);
            } else {
                this.sourceScreenEventLogging.onScreenStopped$lib_common_externalRelease(fragment);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final UserInteractionEventData generateScreenEventData(Fragment fragment, boolean appear) {
        UserInteractionEventData.EventType eventType;
        Screen screenOnScreenStopped$lib_common_externalRelease;
        UserInteractionEventData userInteractionEventData;
        Context contextCopy$default;
        if (appear) {
            eventType = UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR;
            screenOnScreenStopped$lib_common_externalRelease = this.sourceScreenEventLogging.onScreenStarted$lib_common_externalRelease(fragment);
        } else {
            eventType = UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR;
            screenOnScreenStopped$lib_common_externalRelease = this.sourceScreenEventLogging.onScreenStopped$lib_common_externalRelease(fragment);
        }
        UserInteractionEventData.EventType eventType2 = eventType;
        Screen screen = screenOnScreenStopped$lib_common_externalRelease;
        if (fragment instanceof AutoLoggableFragment) {
            userInteractionEventData = ((AutoLoggableFragment) fragment).getScreenEventData();
        } else {
            Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable");
            userInteractionEventData = new UserInteractionEventData(null, ScreenViewAnalyticables.getScreenData((UiCallbacks.ScreenViewAnalyticable) fragment), null, null, null, null, null, 125, null);
        }
        Context context = userInteractionEventData.getContext();
        if (screen != null) {
            contextCopy$default = Context.copy$default(context == null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null) : context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, screen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null);
        } else {
            contextCopy$default = null;
        }
        return UserInteractionEventData.copy$default(userInteractionEventData, eventType2, null, null, null, contextCopy$default == null ? context : contextCopy$default, null, null, 110, null);
    }
}
