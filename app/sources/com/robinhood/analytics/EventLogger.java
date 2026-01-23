package com.robinhood.analytics;

import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ErrorEventData;
import com.robinhood.rosetta.eventlogging.HttpCallData;
import com.robinhood.rosetta.eventlogging.NetworkErrorData;
import com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: EventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 W2\u00020\u0001:\u0002WXJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJY\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b\u001c\u0010\u001bJO\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b\u001d\u0010\u001bJO\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b\u001e\u0010\u001bJY\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001f\u0010\u0019JO\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b \u0010\u001bJO\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H&¢\u0006\u0004\b!\u0010\u001bJY\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\"\u0010\u0019J[\u0010+\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H&¢\u0006\u0004\b+\u0010,J\\\u0010-\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H¦@¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b/\u00100J+\u00104\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u00103\u001a\u00020\u0016H&¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H&¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u0002H&¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0002H&¢\u0006\u0004\bF\u0010CJ1\u0010N\u001a\u00020\u00042\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u00022\u0006\u0010K\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020LH&¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010Q\u001a\u00020PH&¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00042\u0006\u0010@\u001a\u00020TH&¢\u0006\u0004\bU\u0010V¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/analytics/EventLogger;", "", "", "singularDeviceId", "", "updateSingularDeviceId", "(Ljava/lang/String;)V", "adjustDeviceId", "updateAdjustDeviceId", "logAppFreshInstall", "()V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Component;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "context", "", "logPerformance", "logTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "logAppear", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;)V", "logDisappear", "logScreenAppear", "logScreenDisappear", "logSwipe", "logScroll", "logType", "logDrag", "tag", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "errorType", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "featureSurface", "personalInformationFreeLog", "j$/time/Instant", "timestamp", "logErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;)V", "recordErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logNetworkEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "eventData", "logImmediate", "logUserInteractionEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;ZZ)V", "Lcom/robinhood/analytics/models/PerformanceMetric;", "metric", "logPerformanceMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric;)V", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/analytics/models/PerformanceSpan;", "span", "logPerformanceSpan", "(Ljava/util/UUID;Lcom/robinhood/analytics/models/PerformanceSpan;)V", "event", "assignments", "logExperimentAssignments", "(Ljava/lang/String;Ljava/lang/String;)V", "experimentName", "variant", "logExperimentExposure", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "method", "url", "", "responseStatusCode", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "type", "logNetworkError", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;)V", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "callData", "logHttpCall", "(Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/HttpCallData;)V", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "logPltEvent", "(Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;)V", "Stub", "Noop", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface EventLogger {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void logAppFreshInstall();

    void logAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context);

    void logDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context);

    void logDrag(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance);

    void logErrorEvent(String tag, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String personalInformationFreeLog, Instant timestamp);

    void logExperimentAssignments(String event, String assignments);

    void logExperimentExposure(String experimentName, String variant);

    void logHttpCall(Instant timestamp, HttpCallData callData);

    void logNetworkError(NetworkErrorData.Method method, String url, int responseStatusCode, NetworkErrorData.NetworkErrorType type2);

    void logNetworkEvent(UserInteractionEventData.Action action, Screen screen);

    void logPerformanceMetric(PerformanceMetric metric);

    void logPerformanceSpan(UUID sessionId, PerformanceSpan span);

    void logPltEvent(PerceivedLoadingTimeEventData event);

    void logScreenAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context);

    void logScreenDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context);

    void logScroll(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context);

    void logSwipe(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance);

    void logTap(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance);

    void logType(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context);

    void logUserInteractionEvent(UserInteractionEventData eventData, boolean logPerformance, boolean logImmediate);

    Object recordErrorEvent(String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, Continuation<? super Unit> continuation);

    void updateAdjustDeviceId(String adjustDeviceId);

    void updateSingularDeviceId(String singularDeviceId);

    /* compiled from: EventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void logTap$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logTap");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context = null;
            }
            if ((i & 32) != 0) {
                z = false;
            }
            eventLogger.logTap(action, screen, component, componentHierarchy, context, z);
        }

        public static /* synthetic */ void logAppear$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, int i, Object obj) {
            Context context2;
            ComponentHierarchy componentHierarchy2;
            Screen screen2;
            Component component2;
            EventLogger eventLogger2;
            UserInteractionEventData.Action action2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logAppear");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context2 = null;
                component2 = component;
                componentHierarchy2 = componentHierarchy;
                action2 = action;
                screen2 = screen;
                eventLogger2 = eventLogger;
            } else {
                context2 = context;
                componentHierarchy2 = componentHierarchy;
                screen2 = screen;
                component2 = component;
                eventLogger2 = eventLogger;
                action2 = action;
            }
            eventLogger2.logAppear(action2, screen2, component2, componentHierarchy2, context2);
        }

        public static /* synthetic */ void logDisappear$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, int i, Object obj) {
            Context context2;
            ComponentHierarchy componentHierarchy2;
            Screen screen2;
            Component component2;
            EventLogger eventLogger2;
            UserInteractionEventData.Action action2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDisappear");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context2 = null;
                component2 = component;
                componentHierarchy2 = componentHierarchy;
                action2 = action;
                screen2 = screen;
                eventLogger2 = eventLogger;
            } else {
                context2 = context;
                componentHierarchy2 = componentHierarchy;
                screen2 = screen;
                component2 = component;
                eventLogger2 = eventLogger;
                action2 = action;
            }
            eventLogger2.logDisappear(action2, screen2, component2, componentHierarchy2, context2);
        }

        public static /* synthetic */ void logScreenAppear$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, int i, Object obj) {
            Context context2;
            ComponentHierarchy componentHierarchy2;
            Screen screen2;
            Component component2;
            EventLogger eventLogger2;
            UserInteractionEventData.Action action2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logScreenAppear");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context2 = null;
                component2 = component;
                componentHierarchy2 = componentHierarchy;
                action2 = action;
                screen2 = screen;
                eventLogger2 = eventLogger;
            } else {
                context2 = context;
                componentHierarchy2 = componentHierarchy;
                screen2 = screen;
                component2 = component;
                eventLogger2 = eventLogger;
                action2 = action;
            }
            eventLogger2.logScreenAppear(action2, screen2, component2, componentHierarchy2, context2);
        }

        public static /* synthetic */ void logScreenDisappear$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, int i, Object obj) {
            Context context2;
            ComponentHierarchy componentHierarchy2;
            Screen screen2;
            Component component2;
            EventLogger eventLogger2;
            UserInteractionEventData.Action action2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logScreenDisappear");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context2 = null;
                component2 = component;
                componentHierarchy2 = componentHierarchy;
                action2 = action;
                screen2 = screen;
                eventLogger2 = eventLogger;
            } else {
                context2 = context;
                componentHierarchy2 = componentHierarchy;
                screen2 = screen;
                component2 = component;
                eventLogger2 = eventLogger;
                action2 = action;
            }
            eventLogger2.logScreenDisappear(action2, screen2, component2, componentHierarchy2, context2);
        }

        public static /* synthetic */ void logSwipe$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logSwipe");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context = null;
            }
            if ((i & 32) != 0) {
                z = false;
            }
            eventLogger.logSwipe(action, screen, component, componentHierarchy, context, z);
        }

        public static /* synthetic */ void logScroll$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, int i, Object obj) {
            Context context2;
            ComponentHierarchy componentHierarchy2;
            Screen screen2;
            Component component2;
            EventLogger eventLogger2;
            UserInteractionEventData.Action action2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logScroll");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context2 = null;
                component2 = component;
                componentHierarchy2 = componentHierarchy;
                action2 = action;
                screen2 = screen;
                eventLogger2 = eventLogger;
            } else {
                context2 = context;
                componentHierarchy2 = componentHierarchy;
                screen2 = screen;
                component2 = component;
                eventLogger2 = eventLogger;
                action2 = action;
            }
            eventLogger2.logScroll(action2, screen2, component2, componentHierarchy2, context2);
        }

        public static /* synthetic */ void logType$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, int i, Object obj) {
            Context context2;
            ComponentHierarchy componentHierarchy2;
            Screen screen2;
            Component component2;
            EventLogger eventLogger2;
            UserInteractionEventData.Action action2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logType");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context2 = null;
                component2 = component;
                componentHierarchy2 = componentHierarchy;
                action2 = action;
                screen2 = screen;
                eventLogger2 = eventLogger;
            } else {
                context2 = context;
                componentHierarchy2 = componentHierarchy;
                screen2 = screen;
                component2 = component;
                eventLogger2 = eventLogger;
                action2 = action;
            }
            eventLogger2.logType(action2, screen2, component2, componentHierarchy2, context2);
        }

        public static /* synthetic */ void logDrag$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDrag");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                componentHierarchy = null;
            }
            if ((i & 16) != 0) {
                context = null;
            }
            if ((i & 32) != 0) {
                z = false;
            }
            eventLogger.logDrag(action, screen, component, componentHierarchy, context, z);
        }

        public static /* synthetic */ void logErrorEvent$default(EventLogger eventLogger, String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logErrorEvent");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                errorType = ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
            }
            if ((i & 16) != 0) {
                featureSurface = ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED;
            }
            if ((i & 32) != 0) {
                str2 = "";
            }
            if ((i & 64) != 0) {
                instant = null;
            }
            eventLogger.logErrorEvent(str, screen, component, errorType, featureSurface, str2, instant);
        }

        public static /* synthetic */ Object recordErrorEvent$default(EventLogger eventLogger, String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordErrorEvent");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            if ((i & 4) != 0) {
                component = null;
            }
            if ((i & 8) != 0) {
                errorType = ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
            }
            if ((i & 16) != 0) {
                featureSurface = ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED;
            }
            if ((i & 32) != 0) {
                str2 = "";
            }
            if ((i & 64) != 0) {
                instant = null;
            }
            return eventLogger.recordErrorEvent(str, screen, component, errorType, featureSurface, str2, instant, continuation);
        }

        public static /* synthetic */ void logNetworkEvent$default(EventLogger eventLogger, UserInteractionEventData.Action action, Screen screen, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNetworkEvent");
            }
            if ((i & 1) != 0) {
                action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            }
            if ((i & 2) != 0) {
                screen = null;
            }
            eventLogger.logNetworkEvent(action, screen);
        }

        public static /* synthetic */ void logUserInteractionEvent$default(EventLogger eventLogger, UserInteractionEventData userInteractionEventData, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logUserInteractionEvent");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            eventLogger.logUserInteractionEvent(userInteractionEventData, z, z2);
        }

        public static /* synthetic */ void logNetworkError$default(EventLogger eventLogger, NetworkErrorData.Method method, String str, int i, NetworkErrorData.NetworkErrorType networkErrorType, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNetworkError");
            }
            if ((i2 & 8) != 0) {
                networkErrorType = NetworkErrorData.NetworkErrorType.NON_2XX_RESPONSE;
            }
            eventLogger.logNetworkError(method, str, i, networkErrorType);
        }
    }

    /* compiled from: EventLogger.kt */
    @Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003JM\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b \u0010\u001fJE\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b!\u0010\u001fJE\u0010\"\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\"\u0010\u001fJM\u0010#\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001dJE\u0010$\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b$\u0010\u001fJE\u0010%\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b%\u0010\u001fJM\u0010&\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010\u001dJM\u0010/\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100JN\u00101\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-H\u0096@¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020\t2\u0006\u00106\u001a\u0002052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001aH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020\t2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020\t2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0007H\u0016¢\u0006\u0004\bJ\u0010GJ/\u0010R\u001a\u00020\t2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00072\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010V\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\t2\u0006\u0010D\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010Z¨\u0006["}, m3636d2 = {"Lcom/robinhood/analytics/EventLogger$Stub;", "Lcom/robinhood/analytics/EventLogger;", "<init>", "()V", "", "doNothing", "()Ljava/lang/Void;", "", "singularDeviceId", "", "updateSingularDeviceId", "(Ljava/lang/String;)V", "adjustDeviceId", "updateAdjustDeviceId", "logAppFreshInstall", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Component;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "context", "", "logPerformance", "logTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "logAppear", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;)V", "logDisappear", "logScreenAppear", "logScreenDisappear", "logSwipe", "logScroll", "logType", "logDrag", "tag", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "errorType", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "featureSurface", "personalInformationFreeLog", "j$/time/Instant", "timestamp", "logErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;)V", "recordErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logNetworkEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "eventData", "logImmediate", "logUserInteractionEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;ZZ)V", "Lcom/robinhood/analytics/models/PerformanceMetric;", "metric", "logPerformanceMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric;)V", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/analytics/models/PerformanceSpan;", "span", "logPerformanceSpan", "(Ljava/util/UUID;Lcom/robinhood/analytics/models/PerformanceSpan;)V", "event", "assignments", "logExperimentAssignments", "(Ljava/lang/String;Ljava/lang/String;)V", "experimentName", "variant", "logExperimentExposure", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "method", "url", "", "responseStatusCode", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "type", "logNetworkError", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;)V", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "callData", "logHttpCall", "(Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/HttpCallData;)V", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "logPltEvent", "(Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;)V", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.EventLogger$Stub, reason: from kotlin metadata */
    /* loaded from: classes24.dex */
    public static final class Companion implements EventLogger {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // com.robinhood.analytics.EventLogger
        public void updateSingularDeviceId(String singularDeviceId) {
            Intrinsics.checkNotNullParameter(singularDeviceId, "singularDeviceId");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void updateAdjustDeviceId(String adjustDeviceId) {
            Intrinsics.checkNotNullParameter(adjustDeviceId, "adjustDeviceId");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logAppFreshInstall() {
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logTap(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logScreenAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logScreenDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logSwipe(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logScroll(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logType(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logDrag(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logErrorEvent(String tag, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String personalInformationFreeLog, Instant timestamp) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            Intrinsics.checkNotNullParameter(featureSurface, "featureSurface");
            Intrinsics.checkNotNullParameter(personalInformationFreeLog, "personalInformationFreeLog");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public Object recordErrorEvent(String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, Continuation<? super Unit> continuation) {
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logNetworkEvent(UserInteractionEventData.Action action, Screen screen) {
            Intrinsics.checkNotNullParameter(action, "action");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logUserInteractionEvent(UserInteractionEventData eventData, boolean logPerformance, boolean logImmediate) {
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logPerformanceMetric(PerformanceMetric metric) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logPerformanceSpan(UUID sessionId, PerformanceSpan span) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(span, "span");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logExperimentAssignments(String event, String assignments) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(assignments, "assignments");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logExperimentExposure(String experimentName, String variant) {
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(variant, "variant");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logNetworkError(NetworkErrorData.Method method, String url, int responseStatusCode, NetworkErrorData.NetworkErrorType type2) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(type2, "type");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logHttpCall(Instant timestamp, HttpCallData callData) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(callData, "callData");
            doNothing();
            throw new ExceptionsH();
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logPltEvent(PerceivedLoadingTimeEventData event) {
            Intrinsics.checkNotNullParameter(event, "event");
            doNothing();
            throw new ExceptionsH();
        }

        private final Void doNothing() {
            throw new IllegalStateException("Stub EventLogger should not be used in production code");
        }
    }

    /* compiled from: EventLogger.kt */
    @Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0003JM\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJE\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJE\u0010\u001e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJE\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJM\u0010 \u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u001aJE\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b!\u0010\u001cJE\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\"\u0010\u001cJM\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010\u001aJM\u0010,\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*H\u0096@¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b0\u00101J'\u00105\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010?\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010DJ/\u0010O\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u00062\u0006\u0010A\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020KHÖ\u0001¢\u0006\u0004\bZ\u0010[J\u001a\u0010^\u001a\u00020\u00172\b\u0010]\u001a\u0004\u0018\u00010\\HÖ\u0003¢\u0006\u0004\b^\u0010_¨\u0006`"}, m3636d2 = {"Lcom/robinhood/analytics/EventLogger$Noop;", "Lcom/robinhood/analytics/EventLogger;", "<init>", "()V", "", "singularDeviceId", "", "updateSingularDeviceId", "(Ljava/lang/String;)V", "adjustDeviceId", "updateAdjustDeviceId", "logAppFreshInstall", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Component;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "context", "", "logPerformance", "logTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "logAppear", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;)V", "logDisappear", "logScreenAppear", "logScreenDisappear", "logSwipe", "logScroll", "logType", "logDrag", "tag", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "errorType", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "featureSurface", "personalInformationFreeLog", "j$/time/Instant", "timestamp", "logErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;)V", "recordErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logNetworkEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "eventData", "logImmediate", "logUserInteractionEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;ZZ)V", "Lcom/robinhood/analytics/models/PerformanceMetric;", "metric", "logPerformanceMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric;)V", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/analytics/models/PerformanceSpan;", "span", "logPerformanceSpan", "(Ljava/util/UUID;Lcom/robinhood/analytics/models/PerformanceSpan;)V", "event", "assignments", "logExperimentAssignments", "(Ljava/lang/String;Ljava/lang/String;)V", "experimentName", "variant", "logExperimentExposure", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "method", "url", "", "responseStatusCode", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "type", "logNetworkError", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;)V", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "callData", "logHttpCall", "(Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/HttpCallData;)V", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "logPltEvent", "(Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final /* data */ class Noop implements EventLogger {
        public static final Noop INSTANCE = new Noop();

        public boolean equals(Object other) {
            return this == other || (other instanceof Noop);
        }

        public int hashCode() {
            return 876725539;
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logAppFreshInstall() {
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logDrag(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logErrorEvent(String tag, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String personalInformationFreeLog, Instant timestamp) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            Intrinsics.checkNotNullParameter(featureSurface, "featureSurface");
            Intrinsics.checkNotNullParameter(personalInformationFreeLog, "personalInformationFreeLog");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logExperimentAssignments(String event, String assignments) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(assignments, "assignments");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logExperimentExposure(String experimentName, String variant) {
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(variant, "variant");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logHttpCall(Instant timestamp, HttpCallData callData) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(callData, "callData");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logNetworkError(NetworkErrorData.Method method, String url, int responseStatusCode, NetworkErrorData.NetworkErrorType type2) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(type2, "type");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logNetworkEvent(UserInteractionEventData.Action action, Screen screen) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logPerformanceMetric(PerformanceMetric metric) {
            Intrinsics.checkNotNullParameter(metric, "metric");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logPerformanceSpan(UUID sessionId, PerformanceSpan span) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            Intrinsics.checkNotNullParameter(span, "span");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logPltEvent(PerceivedLoadingTimeEventData event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logScreenAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logScreenDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logScroll(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logSwipe(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logTap(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logType(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
            Intrinsics.checkNotNullParameter(action, "action");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void logUserInteractionEvent(UserInteractionEventData eventData, boolean logPerformance, boolean logImmediate) {
            Intrinsics.checkNotNullParameter(eventData, "eventData");
        }

        public String toString() {
            return "Noop";
        }

        @Override // com.robinhood.analytics.EventLogger
        public void updateAdjustDeviceId(String adjustDeviceId) {
            Intrinsics.checkNotNullParameter(adjustDeviceId, "adjustDeviceId");
        }

        @Override // com.robinhood.analytics.EventLogger
        public void updateSingularDeviceId(String singularDeviceId) {
            Intrinsics.checkNotNullParameter(singularDeviceId, "singularDeviceId");
        }

        private Noop() {
        }

        @Override // com.robinhood.analytics.EventLogger
        public Object recordErrorEvent(String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }
}
