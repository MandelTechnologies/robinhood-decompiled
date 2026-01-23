package com.robinhood.shared.cards.utils;

import com.robinhood.analytics.EventLogger;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: StubbedEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\u0003JN\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001cJF\u0010\u001e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001cJF\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001cJN\u0010 \u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b \u0010\u001aJF\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096\u0001¢\u0006\u0004\b!\u0010\u001cJF\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0096\u0001¢\u0006\u0004\b\"\u0010\u001cJN\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b#\u0010\u001aJN\u0010,\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0001¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*H\u0096A¢\u0006\u0004\b.\u0010/J\"\u00100\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b0\u00101J(\u00105\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0096\u0001¢\u0006\u0004\b9\u0010:J \u0010?\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0096\u0001¢\u0006\u0004\b?\u0010@J \u0010C\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\bC\u0010DJ \u0010G\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\bG\u0010DJ0\u0010O\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0096\u0001¢\u0006\u0004\bO\u0010PJ \u0010S\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010R\u001a\u00020QH\u0096\u0001¢\u0006\u0004\bS\u0010TJ\u0018\u0010V\u001a\u00020\u00062\u0006\u0010A\u001a\u00020UH\u0096\u0001¢\u0006\u0004\bV\u0010W¨\u0006X"}, m3636d2 = {"Lcom/robinhood/shared/cards/utils/StubbedEventLogger;", "Lcom/robinhood/analytics/EventLogger;", "<init>", "()V", "", "singularDeviceId", "", "updateSingularDeviceId", "(Ljava/lang/String;)V", "adjustDeviceId", "updateAdjustDeviceId", "logAppFreshInstall", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Component;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "context", "", "logPerformance", "logTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "logAppear", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;)V", "logDisappear", "logScreenAppear", "logScreenDisappear", "logSwipe", "logScroll", "logType", "logDrag", "tag", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "errorType", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "featureSurface", "personalInformationFreeLog", "j$/time/Instant", "timestamp", "logErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;)V", "recordErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logNetworkEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "eventData", "logImmediate", "logUserInteractionEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;ZZ)V", "Lcom/robinhood/analytics/models/PerformanceMetric;", "metric", "logPerformanceMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric;)V", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/analytics/models/PerformanceSpan;", "span", "logPerformanceSpan", "(Ljava/util/UUID;Lcom/robinhood/analytics/models/PerformanceSpan;)V", "event", "assignments", "logExperimentAssignments", "(Ljava/lang/String;Ljava/lang/String;)V", "experimentName", "variant", "logExperimentExposure", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "method", "url", "", "responseStatusCode", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "type", "logNetworkError", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;)V", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "callData", "logHttpCall", "(Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/HttpCallData;)V", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "logPltEvent", "(Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;)V", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class StubbedEventLogger implements EventLogger {
    private final /* synthetic */ EventLogger.Noop $$delegate_0 = EventLogger.Noop.INSTANCE;
    public static final StubbedEventLogger INSTANCE = new StubbedEventLogger();
    public static final int $stable = 8;

    @Override // com.robinhood.analytics.EventLogger
    public void logAppFreshInstall() {
        this.$$delegate_0.logAppFreshInstall();
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logAppear(action, screen, component, componentHierarchy, context);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logDisappear(action, screen, component, componentHierarchy, context);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logDrag(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logDrag(action, screen, component, componentHierarchy, context, logPerformance);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logErrorEvent(String tag, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String personalInformationFreeLog, Instant timestamp) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(featureSurface, "featureSurface");
        Intrinsics.checkNotNullParameter(personalInformationFreeLog, "personalInformationFreeLog");
        this.$$delegate_0.logErrorEvent(tag, screen, component, errorType, featureSurface, personalInformationFreeLog, timestamp);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logExperimentAssignments(String event, String assignments) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        this.$$delegate_0.logExperimentAssignments(event, assignments);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logExperimentExposure(String experimentName, String variant) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.$$delegate_0.logExperimentExposure(experimentName, variant);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logHttpCall(Instant timestamp, HttpCallData callData) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(callData, "callData");
        this.$$delegate_0.logHttpCall(timestamp, callData);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logNetworkError(NetworkErrorData.Method method, String url, int responseStatusCode, NetworkErrorData.NetworkErrorType type2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.$$delegate_0.logNetworkError(method, url, responseStatusCode, type2);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logNetworkEvent(UserInteractionEventData.Action action, Screen screen) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logNetworkEvent(action, screen);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logPerformanceMetric(PerformanceMetric metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        this.$$delegate_0.logPerformanceMetric(metric);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logPerformanceSpan(UUID sessionId, PerformanceSpan span) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(span, "span");
        this.$$delegate_0.logPerformanceSpan(sessionId, span);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logPltEvent(PerceivedLoadingTimeEventData event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.logPltEvent(event);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logScreenAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logScreenAppear(action, screen, component, componentHierarchy, context);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logScreenDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logScreenDisappear(action, screen, component, componentHierarchy, context);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logScroll(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logScroll(action, screen, component, componentHierarchy, context);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logSwipe(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logSwipe(action, screen, component, componentHierarchy, context, logPerformance);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logTap(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logTap(action, screen, component, componentHierarchy, context, logPerformance);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logType(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.logType(action, screen, component, componentHierarchy, context);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logUserInteractionEvent(UserInteractionEventData eventData, boolean logPerformance, boolean logImmediate) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.$$delegate_0.logUserInteractionEvent(eventData, logPerformance, logImmediate);
    }

    @Override // com.robinhood.analytics.EventLogger
    public Object recordErrorEvent(String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.recordErrorEvent(str, screen, component, errorType, featureSurface, str2, instant, continuation);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void updateAdjustDeviceId(String adjustDeviceId) {
        Intrinsics.checkNotNullParameter(adjustDeviceId, "adjustDeviceId");
        this.$$delegate_0.updateAdjustDeviceId(adjustDeviceId);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void updateSingularDeviceId(String singularDeviceId) {
        Intrinsics.checkNotNullParameter(singularDeviceId, "singularDeviceId");
        this.$$delegate_0.updateSingularDeviceId(singularDeviceId);
    }

    private StubbedEventLogger() {
    }
}
