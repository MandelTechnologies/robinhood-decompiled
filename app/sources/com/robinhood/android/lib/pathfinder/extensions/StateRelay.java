package com.robinhood.android.lib.pathfinder.extensions;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.pathfinder.PathfinderWebViewState;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.view.WebErrorView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: StateRelay.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0006\u001a\u00020\u0005*\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\f\u001a\u00020\u0005*\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0005*\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002¢\u0006\u0004\b\u0010\u0010\u000f*\u0016\u0010\u0011\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "Lcom/robinhood/android/lib/pathfinder/extensions/StateRelay;", "j$/time/Duration", "duration", "", "setInitializingState", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;Lj$/time/Duration;)V", "Lcom/robinhood/android/lib/webview/WebError;", "error", "Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "errorViewType", "setWebErrorState", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;Lcom/robinhood/android/lib/webview/WebError;Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;)V", "setTimedOutState", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;)V", "setLoadedState", "StateRelay", "lib-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.extensions.StateRelayKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class StateRelay {
    public static final void setInitializingState(BehaviorRelay<PathfinderWebViewState> behaviorRelay, Duration duration) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        Intrinsics.checkNotNullParameter(duration, "duration");
        behaviorRelay.accept(new PathfinderWebViewState.Initializing(duration));
    }

    public static final void setWebErrorState(BehaviorRelay<PathfinderWebViewState> behaviorRelay, WebError error, WebErrorView.ErrorViewType errorViewType) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorViewType, "errorViewType");
        behaviorRelay.accept(new PathfinderWebViewState.Error(error, errorViewType));
    }

    public static final void setTimedOutState(BehaviorRelay<PathfinderWebViewState> behaviorRelay) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        behaviorRelay.accept(PathfinderWebViewState.Timeout.INSTANCE);
    }

    public static final void setLoadedState(BehaviorRelay<PathfinderWebViewState> behaviorRelay) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        behaviorRelay.accept(PathfinderWebViewState.Loaded.INSTANCE);
    }
}
