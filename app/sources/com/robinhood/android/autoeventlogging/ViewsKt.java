package com.robinhood.android.autoeventlogging;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.util.extensions.ViewTags;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u001a\n\u0010\u000e\u001a\u00020\b*\u00020\u0002\u001a%\u0010\u000f\u001a\u00020\b*\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0002\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\b*\u00020\u0002\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a \u0010\u001e\u001a\u00020\b*\u00020\u00022\n\u0010\u001f\u001a\u00060 j\u0002`!2\u0006\u0010\u0010\u001a\u00020\nH\u0002\u001a \u0010\u0011\u001a\u00020\b*\u00020\u00022\n\u0010\u001f\u001a\u00060 j\u0002`!2\u0006\u0010\u0010\u001a\u00020\nH\u0002\u001a\f\u0010\"\u001a\u00020\b*\u00020\u0002H\u0002\u001a\f\u0010#\u001a\u00020\b*\u00020\u0002H\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\",\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\"\u0015\u0010\u001c\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, m3636d2 = {"loggingOptions", "Lcom/robinhood/android/autoeventlogging/ViewLoggingOptions;", "Landroid/view/View;", "getLoggingOptions", "(Landroid/view/View;)Lcom/robinhood/android/autoeventlogging/ViewLoggingOptions;", "loggingOptions$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventData", "", "logPerformance", "", "accessor", "Lkotlin/Function0;", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "logTap", "logAppear", "logOnce", "dispatchEventToDescendants", "(Landroid/view/View;Ljava/lang/Boolean;Z)V", "logScroll", "value", "Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "loggingConfig", "getLoggingConfig", "(Landroid/view/View;)Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "setLoggingConfig", "(Landroid/view/View;Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;)V", "getEventData", "isEventLoggingEnabled", "(Landroid/view/View;)Z", "log", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "startTrackingVisibility", "stopTrackingVisibility", "lib-auto-event-logging_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ViewsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ViewsKt.class, "loggingOptions", "getLoggingOptions(Landroid/view/View;)Lcom/robinhood/android/autoeventlogging/ViewLoggingOptions;", 1))};
    private static final Interfaces3 loggingOptions$delegate = ViewTags.INSTANCE.property(C9627R.id.tag_view_logging_options, new Function1() { // from class: com.robinhood.android.autoeventlogging.ViewsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ViewsKt.loggingOptions_delegate$lambda$0((View) obj);
        }
    });

    private static final ViewLoggingOptions getLoggingOptions(View view) {
        return (ViewLoggingOptions) loggingOptions$delegate.getValue(view, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewLoggingOptions loggingOptions_delegate$lambda$0(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ViewLoggingOptions();
    }

    public static /* synthetic */ void eventData$default(View view, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eventData(view, z, function0);
    }

    public static final void eventData(View view, boolean z, Function0<UserInteractionEventDescriptor> accessor) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        ViewLoggingOptions loggingOptions = getLoggingOptions(view);
        if (loggingOptions.getConfig() == null) {
            loggingOptions.setConfig(new AutoLoggingConfig(false, false, 3, null));
        }
        loggingOptions.setGetEventData(accessor);
        loggingOptions.setLogPerformance(z);
    }

    public static final void logTap(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        log(view, UserInteractionEventData.EventType.TAP, false);
    }

    public static /* synthetic */ void logAppear$default(View view, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        logAppear(view, bool, z);
    }

    public static final void logAppear(View view, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (bool == null) {
            AutoLoggingConfig loggingConfig = getLoggingConfig(view);
            bool = loggingConfig != null ? Boolean.valueOf(loggingConfig.getLogAppearOnce()) : null;
            if (bool == null) {
                return;
            }
        }
        boolean zBooleanValue = bool.booleanValue();
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.APPEAR;
        log(view, eventType, zBooleanValue);
        if (z) {
            dispatchEventToDescendants(view, eventType, zBooleanValue);
        }
    }

    public static final void logScroll(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        log(view, UserInteractionEventData.EventType.SCROLL, false);
    }

    public static final AutoLoggingConfig getLoggingConfig(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return getLoggingOptions(view).getConfig();
    }

    public static final void setLoggingConfig(View view, AutoLoggingConfig autoLoggingConfig) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        getLoggingOptions(view).setConfig(autoLoggingConfig);
        if (autoLoggingConfig != null ? autoLoggingConfig.getExcludeFromAutomaticAppearLogging() : true) {
            stopTrackingVisibility(view);
        } else {
            startTrackingVisibility(view);
        }
    }

    public static final UserInteractionEventDescriptor getEventData(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return getLoggingOptions(view).getGetEventData().invoke();
    }

    public static final boolean isEventLoggingEnabled(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return getLoggingConfig(view) != null;
    }

    private static final void log(View view, UserInteractionEventData.EventType eventType, boolean z) {
        ComponentCallbacks2 componentCallbacks2;
        if (isEventLoggingEnabled(view)) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            ((AutoLoggableViewEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getUserInteractionEventManager().log(view, eventType, getLoggingOptions(view).getGetEventData().invoke(), z, getLoggingOptions(view).getLogPerformance());
        }
    }

    private static final void dispatchEventToDescendants(View view, UserInteractionEventData.EventType eventType, boolean z) {
        if (view instanceof ViewGroup) {
            Iterator it = SequencesKt.filter(ViewGroup2.getDescendants((ViewGroup) view), new Function1() { // from class: com.robinhood.android.autoeventlogging.ViewsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ViewsKt.dispatchEventToDescendants$lambda$2((View) obj));
                }
            }).iterator2();
            while (it.hasNext()) {
                log((View) it.next(), eventType, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchEventToDescendants$lambda$2(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return isEventLoggingEnabled(it);
    }

    private static final void startTrackingVisibility(View view) {
        if (getLoggingOptions(view).isTrackingVisibility()) {
            return;
        }
        VisibilityTrackingListener visibilityTrackingListener = new VisibilityTrackingListener();
        getLoggingOptions(view).setVisibilityTrackingListener(visibilityTrackingListener);
        if (view.isAttachedToWindow()) {
            visibilityTrackingListener.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(visibilityTrackingListener);
    }

    private static final void stopTrackingVisibility(View view) {
        view.removeOnAttachStateChangeListener(getLoggingOptions(view).getVisibilityTrackingListener());
        getLoggingOptions(view).setVisibilityTrackingListener(null);
    }
}
