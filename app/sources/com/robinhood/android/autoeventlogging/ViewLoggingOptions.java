package com.robinhood.android.autoeventlogging;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/ViewLoggingOptions;", "", "<init>", "()V", "config", "Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "getConfig", "()Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "setConfig", "(Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;)V", "getEventData", "Lkotlin/Function0;", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getGetEventData", "()Lkotlin/jvm/functions/Function0;", "setGetEventData", "(Lkotlin/jvm/functions/Function0;)V", "visibilityTrackingListener", "Lcom/robinhood/android/autoeventlogging/VisibilityTrackingListener;", "getVisibilityTrackingListener", "()Lcom/robinhood/android/autoeventlogging/VisibilityTrackingListener;", "setVisibilityTrackingListener", "(Lcom/robinhood/android/autoeventlogging/VisibilityTrackingListener;)V", "logPerformance", "", "getLogPerformance", "()Z", "setLogPerformance", "(Z)V", "isTrackingVisibility", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
final class ViewLoggingOptions {
    private AutoLoggingConfig config;
    private Function0<UserInteractionEventDescriptor> getEventData = new Function0() { // from class: com.robinhood.android.autoeventlogging.ViewLoggingOptions$getEventData$1
        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    };
    private boolean logPerformance;
    private VisibilityTrackingListener visibilityTrackingListener;

    public final AutoLoggingConfig getConfig() {
        return this.config;
    }

    public final void setConfig(AutoLoggingConfig autoLoggingConfig) {
        this.config = autoLoggingConfig;
    }

    public final Function0<UserInteractionEventDescriptor> getGetEventData() {
        return this.getEventData;
    }

    public final void setGetEventData(Function0<UserInteractionEventDescriptor> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getEventData = function0;
    }

    public final VisibilityTrackingListener getVisibilityTrackingListener() {
        return this.visibilityTrackingListener;
    }

    public final void setVisibilityTrackingListener(VisibilityTrackingListener visibilityTrackingListener) {
        this.visibilityTrackingListener = visibilityTrackingListener;
    }

    public final boolean getLogPerformance() {
        return this.logPerformance;
    }

    public final void setLogPerformance(boolean z) {
        this.logPerformance = z;
    }

    public final boolean isTrackingVisibility() {
        return this.visibilityTrackingListener != null;
    }
}
