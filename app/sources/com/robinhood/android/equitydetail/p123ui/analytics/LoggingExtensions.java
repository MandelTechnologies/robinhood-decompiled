package com.robinhood.android.equitydetail.p123ui.analytics;

import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggingExtensions.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, m3636d2 = {"logTap", "", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "logViewContextUpdate", "context", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "silent", "", "changeLoggableContext", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.analytics.LoggingExtensionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LoggingExtensions {
    public static /* synthetic */ void logTap$default(LoggableSdpView loggableSdpView, UserInteractionEventData.Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        logTap(loggableSdpView, action);
    }

    public static final void logTap(LoggableSdpView loggableSdpView, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(loggableSdpView, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        LoggableSdpView.Callbacks analyticsCallbacks = loggableSdpView.getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.logEvent(new SdpEvent.Tap(loggableSdpView.getComponentType(), null, action, 2, null));
        }
    }

    public static /* synthetic */ void logViewContextUpdate$default(LoggableSdpView loggableSdpView, LoggableViewContext loggableViewContext, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        logViewContextUpdate(loggableSdpView, loggableViewContext, z);
    }

    public static final void logViewContextUpdate(LoggableSdpView loggableSdpView, LoggableViewContext context, boolean z) {
        Intrinsics.checkNotNullParameter(loggableSdpView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        LoggableSdpView.Callbacks analyticsCallbacks = loggableSdpView.getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.logEvent(new SdpEvent.ViewContextUpdate(loggableSdpView.getComponentType(), context, z));
        }
    }

    public static final void changeLoggableContext(LoggableSdpView loggableSdpView, LoggableViewContext context) {
        Intrinsics.checkNotNullParameter(loggableSdpView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        LoggableSdpView.Callbacks analyticsCallbacks = loggableSdpView.getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.changeContext(context);
        }
    }
}
