package com.robinhood.android.equitydetail.p123ui.analytics;

import android.view.View;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggableSdpView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Landroid/view/View$OnAttachStateChangeListener;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "Callbacks", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface LoggableSdpView extends View.OnAttachStateChangeListener {

    /* compiled from: LoggableSdpView.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\f\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "", "logAppearance", "", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "logDisappearance", "logEvent", "event", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpEvent;", "changeContext", "context", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableViewContext;", "provideEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "provideEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public interface Callbacks {
        void changeContext(LoggableViewContext context);

        void logAppearance(Component.ComponentType componentType);

        void logDisappearance(Component.ComponentType componentType);

        void logEvent(SdpEvent event);

        Context provideEventContext();

        Screen provideEventScreen();
    }

    Callbacks getAnalyticsCallbacks();

    Component.ComponentType getComponentType();

    @Override // android.view.View.OnAttachStateChangeListener
    void onViewAttachedToWindow(View view);

    @Override // android.view.View.OnAttachStateChangeListener
    void onViewDetachedFromWindow(View view);

    void setAnalyticsCallbacks(Callbacks callbacks);

    /* compiled from: LoggableSdpView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void onViewAttachedToWindow(LoggableSdpView loggableSdpView, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Callbacks analyticsCallbacks = loggableSdpView.getAnalyticsCallbacks();
            if (analyticsCallbacks != null) {
                analyticsCallbacks.logAppearance(loggableSdpView.getComponentType());
            }
        }

        public static void onViewDetachedFromWindow(LoggableSdpView loggableSdpView, View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Callbacks analyticsCallbacks = loggableSdpView.getAnalyticsCallbacks();
            if (analyticsCallbacks != null) {
                analyticsCallbacks.logDisappearance(loggableSdpView.getComponentType());
            }
        }
    }
}
