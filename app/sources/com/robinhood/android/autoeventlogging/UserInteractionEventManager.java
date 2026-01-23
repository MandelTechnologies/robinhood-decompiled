package com.robinhood.android.autoeventlogging;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.EventLogger;
import com.robinhood.hammer.android.fragment.FragmentComponentManagerHolder;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: UserInteractionEventManager.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J2\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0014\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0016*\u00020\tH\u0002J\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u001a*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/UserInteractionEventManager;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "log", "", "hostView", "Landroid/view/View;", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "eventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "logOnce", "", "logPerformance", "handle", "builder", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventBuilder;", "upstreamEventData", "Lkotlin/sequences/Sequence;", "findEventScreen", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "autoLogOnceEventManager", "Lcom/robinhood/android/autoeventlogging/AutoLogOnceEventManager;", "getAutoLogOnceEventManager", "(Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;)Lcom/robinhood/android/autoeventlogging/AutoLogOnceEventManager;", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class UserInteractionEventManager {
    private final EventLogger eventLogger;

    public UserInteractionEventManager(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final void log(View hostView, UserInteractionEventData.EventType eventType, UserInteractionEventDescriptor eventData, boolean logOnce, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (eventData != null) {
            handle(hostView, new UserInteractionEventBuilder(eventType), eventData, logOnce, logPerformance);
        }
    }

    private final void handle(View hostView, UserInteractionEventBuilder builder, UserInteractionEventDescriptor eventData, boolean logOnce, boolean logPerformance) {
        builder.setData(eventData);
        Iterator<UserInteractionEventDescriptor> itIterator2 = upstreamEventData(hostView).iterator2();
        while (itIterator2.hasNext()) {
            builder.setData(itIterator2.next());
        }
        if (logOnce || !builder.isScreenSet()) {
            AutoLoggableFragment autoLoggableFragmentFindEventScreen = findEventScreen(hostView);
            AutoLogOnceEventManager autoLogOnceEventManager = autoLoggableFragmentFindEventScreen != null ? getAutoLogOnceEventManager(autoLoggableFragmentFindEventScreen) : null;
            if (logOnce) {
                String identifier = builder.getIdentifier();
                if (autoLogOnceEventManager != null && autoLogOnceEventManager.isLogged(identifier)) {
                    return;
                }
                if (autoLogOnceEventManager != null) {
                    autoLogOnceEventManager.markAsLogged(identifier);
                }
            }
            Screen eventScreen = autoLoggableFragmentFindEventScreen != null ? autoLoggableFragmentFindEventScreen.getEventScreen() : null;
            if (eventScreen != null) {
                builder.setScreen(eventScreen);
            }
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, builder.build(), logPerformance, false, 4, null);
    }

    private final Sequence<UserInteractionEventDescriptor> upstreamEventData(View view) {
        return SequencesKt.map(SequencesKt.takeWhile(com.robinhood.utils.extensions.ViewsKt.getParents(view), new Function1() { // from class: com.robinhood.android.autoeventlogging.UserInteractionEventManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(UserInteractionEventManager.upstreamEventData$lambda$0((View) obj));
            }
        }), new Function1() { // from class: com.robinhood.android.autoeventlogging.UserInteractionEventManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserInteractionEventManager.upstreamEventData$lambda$1((View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean upstreamEventData$lambda$0(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId() != 16908290;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor upstreamEventData$lambda$1(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ViewsKt.getEventData(it);
    }

    private final AutoLoggableFragment findEventScreen(View view) {
        try {
            ActivityResultCaller activityResultCallerFindFragment = FragmentManager.findFragment(view);
            Intrinsics.checkNotNullExpressionValue(activityResultCallerFindFragment, "findFragment(...)");
            if (activityResultCallerFindFragment instanceof AutoLoggableFragment) {
                return (AutoLoggableFragment) activityResultCallerFindFragment;
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AutoLogOnceEventManager getAutoLogOnceEventManager(AutoLoggableFragment autoLoggableFragment) {
        Intrinsics.checkNotNull(autoLoggableFragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return ((UserInteractionEventManager2) ((FragmentComponentManagerHolder) ((Fragment) autoLoggableFragment)).getComponentManager().get()).getAutoLogOnceEventManager();
    }
}
