package com.robinhood.analytics;

import com.adjust.sdk.network.ErrorCodes;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import com.robinhood.analytics.models.SharedEventLog;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.Application;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Device;
import com.robinhood.rosetta.eventlogging.ErrorEventData;
import com.robinhood.rosetta.eventlogging.EventCategory;
import com.robinhood.rosetta.eventlogging.EventName;
import com.robinhood.rosetta.eventlogging.ExperimentsEventData;
import com.robinhood.rosetta.eventlogging.HttpCallData;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.rosetta.eventlogging.NetworkErrorData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.TriggeringExperiments;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations2;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: BaseEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\u000e\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00010\u0004*\u0004\b\u0003\u0010\u00062\u00020\u0007BI\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"JK\u0010/\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,2\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b/\u00100JC\u00101\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,¢\u0006\u0004\b1\u00102JC\u00103\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,¢\u0006\u0004\b3\u00102JC\u00104\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,¢\u0006\u0004\b4\u00102JC\u00105\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,¢\u0006\u0004\b5\u00102JK\u00106\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,2\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b6\u00100JC\u00107\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,¢\u0006\u0004\b7\u00102JC\u00108\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,¢\u0006\u0004\b8\u00102JK\u00109\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,2\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b9\u00100JK\u0010B\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJN\u0010D\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u001a2\b\u0010A\u001a\u0004\u0018\u00010@H\u0086@¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\bF\u0010GJ%\u0010K\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020H2\u0006\u0010.\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u0017¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u001f\u0010U\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001d\u0010Y\u001a\u00020\u001c2\u0006\u0010W\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\u001a¢\u0006\u0004\bY\u0010ZJ\u001f\u0010]\u001a\u00020\u001c2\u0006\u0010[\u001a\u00020\u001a2\u0006\u0010\\\u001a\u00020\u001aH\u0016¢\u0006\u0004\b]\u0010ZJ-\u0010e\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020\u001a2\u0006\u0010b\u001a\u00020a2\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\u001d\u0010i\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020@2\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJA\u0010p\u001a\u00020\u001c2\u0006\u0010k\u001a\u00028\u00002\b\b\u0002\u0010l\u001a\u00020\u00172\b\b\u0002\u0010m\u001a\u00020\u00172\b\b\u0002\u0010A\u001a\u00020@2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010nH\u0004¢\u0006\u0004\bp\u0010qJB\u0010r\u001a\u00020\u001c2\u0006\u0010k\u001a\u00028\u00002\b\b\u0002\u0010l\u001a\u00020\u00172\b\b\u0002\u0010m\u001a\u00020\u00172\b\b\u0002\u0010A\u001a\u00020@2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010nH\u0084@¢\u0006\u0004\br\u0010sJ\u0088\u0001\u0010\u0082\u0001\u001a\u00028\u00002\u0006\u0010u\u001a\u00020t2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010v2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010y2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010g2\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010~2\f\b\u0002\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JB\u0010\u0088\u0001\u001a\u00028\u00012\u0006\u0010k\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010nH&¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u008a\u0001R'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008b\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u008c\u0001R&\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008d\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0094\u0001¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/analytics/BaseEventLogger;", "AppEventType", "", "LoggingEventType", "Lcom/robinhood/analytics/models/SharedEventLog;", "EventLog", "LoggingEventBatch", "Lcom/robinhood/analytics/EventLogger;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/EventLogBundle;", "eventLogBundle", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogManager;", "eventLogManager", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/EventLogBundle;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lj$/time/Clock;Lcom/robinhood/analytics/EventLogManager;Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "", "isPerformanceLoggable", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;)Z", "", "singularDeviceId", "", "updateSingularDeviceId", "(Ljava/lang/String;)V", "adjustDeviceId", "updateAdjustDeviceId", "logAppFreshInstall", "()V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "action", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "Lcom/robinhood/rosetta/eventlogging/Component;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "context", "logPerformance", "logTap", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;Z)V", "logAppear", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lcom/robinhood/rosetta/eventlogging/Context;)V", "logDisappear", "logScreenAppear", "logScreenDisappear", "logSwipe", "logScroll", "logType", "logDrag", "tag", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "errorType", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "featureSurface", "personalInformationFreeLog", "j$/time/Instant", "timestamp", "logErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;)V", "recordErrorEvent", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logNetworkEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "eventData", "logImmediate", "logUserInteractionEvent", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;ZZ)V", "Lcom/robinhood/analytics/models/PerformanceMetric;", "metric", "logPerformanceMetric", "(Lcom/robinhood/analytics/models/PerformanceMetric;)V", "Ljava/util/UUID;", "sessionId", "Lcom/robinhood/analytics/models/PerformanceSpan;", "span", "logPerformanceSpan", "(Ljava/util/UUID;Lcom/robinhood/analytics/models/PerformanceSpan;)V", "event", "assignments", "logExperimentAssignments", "(Ljava/lang/String;Ljava/lang/String;)V", "experimentName", "variant", "logExperimentExposure", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "method", "url", "", "responseStatusCode", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "type", "logNetworkError", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;)V", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "callData", "logHttpCall", "(Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/HttpCallData;)V", "appEvent", "triggerUpload", "uploadImmediate", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "networkConnection", "send", "(Ljava/lang/Object;ZZLj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;)V", "record", "(Ljava/lang/Object;ZZLj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/rosetta/eventlogging/EventCategory;", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "errorData", "userInteractionEventData", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "experimentData", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "networkErrorData", "httpCallData", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "performanceMetricEventData", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "performanceMetricSpanEventData", "createAppEvent", "(Lcom/robinhood/rosetta/eventlogging/EventCategory;Lcom/robinhood/rosetta/eventlogging/ErrorEventData;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;Lcom/robinhood/rosetta/eventlogging/HttpCallData;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;Ljava/lang/String;)Ljava/lang/Object;", "Lcom/robinhood/rosetta/eventlogging/Application;", "app", "Lcom/robinhood/rosetta/eventlogging/Device;", "device", "createLoggingEvent", "(Ljava/lang/Object;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Application;Lcom/robinhood/rosetta/eventlogging/Device;Lcom/robinhood/rosetta/eventlogging/NetworkConnection;)Ljava/lang/Object;", "Lj$/time/Clock;", "Lcom/robinhood/analytics/EventLogManager;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/jakewharton/rxrelay2/PublishRelay;", "eventsRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "getEventsRelay", "()Lcom/jakewharton/rxrelay2/PublishRelay;", "application", "Lcom/robinhood/rosetta/eventlogging/Application;", "Lcom/robinhood/rosetta/eventlogging/Device;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class BaseEventLogger<AppEventType, LoggingEventType, EventLog extends SharedEventLog<? extends LoggingEventType>, LoggingEventBatch> implements EventLogger {
    private final Application application;
    private final Clock clock;
    private Device device;
    private final EventLogManager<LoggingEventType, EventLog, LoggingEventBatch> eventLogManager;
    private final PublishRelay<LoggingEventType> eventsRelay;
    private final PerformanceLogger performanceLogger;

    /* compiled from: BaseEventLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserInteractionEventData.EventType.values().length];
            try {
                iArr[UserInteractionEventData.EventType.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserInteractionEventData.EventType.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserInteractionEventData.EventType.SWIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserInteractionEventData.EventType.DRAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserInteractionEventData.EventType.DOUBLE_TAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserInteractionEventData.EventType.LONG_PRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract AppEventType createAppEvent(EventCategory category, ErrorEventData errorData, UserInteractionEventData userInteractionEventData, ExperimentsEventData experimentData, String event, NetworkErrorData networkErrorData, HttpCallData httpCallData, PerformanceMetricEventData performanceMetricEventData, PerformanceMetricSpanEventData performanceMetricSpanEventData, String sessionId);

    public abstract LoggingEventType createLoggingEvent(AppEventType appEvent, Instant timestamp, Application app, Device device, NetworkConnection networkConnection);

    public BaseEventLogger(CoroutineScope coroutineScope, EventLogBundle eventLogBundle, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, Clock clock, EventLogManager<LoggingEventType, EventLog, LoggingEventBatch> eventLogManager, PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eventLogBundle, "eventLogBundle");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogManager, "eventLogManager");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.clock = clock;
        this.eventLogManager = eventLogManager;
        this.performanceLogger = performanceLogger;
        PublishRelay<LoggingEventType> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.eventsRelay = publishRelayCreate;
        this.application = eventLogBundle.createApplication();
        this.device = eventLogBundle.createDevice();
        ScopedSubscriptionKt.subscribeIn(eventLogBundle.getAdIdProvider().getAdId(), coroutineScope, new Function1() { // from class: com.robinhood.analytics.BaseEventLogger$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseEventLogger._init_$lambda$0(this.f$0, (String) obj);
            }
        });
        ScopedSubscriptionKt.subscribeIn(firebaseAppInstanceIdProvider.getFirebaseAppInstanceId(), coroutineScope, new Function1() { // from class: com.robinhood.analytics.BaseEventLogger$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseEventLogger._init_$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    protected final PublishRelay<LoggingEventType> getEventsRelay() {
        return this.eventsRelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(BaseEventLogger baseEventLogger, String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Device device = baseEventLogger.device;
        baseEventLogger.device = device.copy(((-129) & 1) != 0 ? device.platform : null, ((-129) & 2) != 0 ? device.device_id : null, ((-129) & 4) != 0 ? device.web_device_id : null, ((-129) & 8) != 0 ? device.os_version : null, ((-129) & 16) != 0 ? device.manufacturer : null, ((-129) & 32) != 0 ? device.device_version : null, ((-129) & 64) != 0 ? device.screen_resolution : null, ((-129) & 128) != 0 ? device.adid : adId, ((-129) & 256) != 0 ? device.font_size : null, ((-129) & 512) != 0 ? device.sharer_id : null, ((-129) & 1024) != 0 ? device.sharer_url : null, ((-129) & 2048) != 0 ? device.source : null, ((-129) & 4096) != 0 ? device.campaign : null, ((-129) & 8192) != 0 ? device.campaign_version : null, ((-129) & 16384) != 0 ? device.click_id : null, ((-129) & 32768) != 0 ? device.reduced_motion : false, ((-129) & 65536) != 0 ? device.voice_over : false, ((-129) & 131072) != 0 ? device.engagement_time : 0, ((-129) & 262144) != 0 ? device.referral_code : null, ((-129) & 524288) != 0 ? device.model : null, ((-129) & 1048576) != 0 ? device.version : null, ((-129) & 2097152) != 0 ? device.density_independent_resolution : null, ((-129) & 4194304) != 0 ? device.webview : false, ((-129) & 8388608) != 0 ? device.web_device_hash : null, ((-129) & 16777216) != 0 ? device.token_hash : null, ((-129) & 33554432) != 0 ? device.adjust_device_id : null, ((-129) & 67108864) != 0 ? device.firebase_app_instance_id : null, ((-129) & 134217728) != 0 ? device.theme_style : null, ((-129) & 268435456) != 0 ? device.singular_device_id : null, ((-129) & 536870912) != 0 ? device.masked_device_id : null, ((-129) & 1073741824) != 0 ? device.masked_web_device_id : null, ((-129) & Integer.MIN_VALUE) != 0 ? device.masked_adid : null, (511 & 1) != 0 ? device.masked_sharer_id : null, (511 & 2) != 0 ? device.masked_os_version : null, (511 & 4) != 0 ? device.masked_referral_code : null, (511 & 8) != 0 ? device.masked_web_device_hash : null, (511 & 16) != 0 ? device.masked_token_hash : null, (511 & 32) != 0 ? device.masked_adjust_device_id : null, (511 & 64) != 0 ? device.masked_firebase_app_instance_id : null, (511 & 128) != 0 ? device.masked_singular_device_id : null, (511 & 256) != 0 ? device.unknownFields() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(BaseEventLogger baseEventLogger, Optional appInstanceId) {
        Intrinsics.checkNotNullParameter(appInstanceId, "appInstanceId");
        Device device = baseEventLogger.device;
        String str = (String) appInstanceId.getOrNull();
        if (str == null) {
            str = "";
        }
        baseEventLogger.device = device.copy(((-129) & 1) != 0 ? device.platform : null, ((-129) & 2) != 0 ? device.device_id : null, ((-129) & 4) != 0 ? device.web_device_id : null, ((-129) & 8) != 0 ? device.os_version : null, ((-129) & 16) != 0 ? device.manufacturer : null, ((-129) & 32) != 0 ? device.device_version : null, ((-129) & 64) != 0 ? device.screen_resolution : null, ((-129) & 128) != 0 ? device.adid : null, ((-129) & 256) != 0 ? device.font_size : null, ((-129) & 512) != 0 ? device.sharer_id : null, ((-129) & 1024) != 0 ? device.sharer_url : null, ((-129) & 2048) != 0 ? device.source : null, ((-129) & 4096) != 0 ? device.campaign : null, ((-129) & 8192) != 0 ? device.campaign_version : null, ((-129) & 16384) != 0 ? device.click_id : null, ((-129) & 32768) != 0 ? device.reduced_motion : false, ((-129) & 65536) != 0 ? device.voice_over : false, ((-129) & 131072) != 0 ? device.engagement_time : 0, ((-129) & 262144) != 0 ? device.referral_code : null, ((-129) & 524288) != 0 ? device.model : null, ((-129) & 1048576) != 0 ? device.version : null, ((-129) & 2097152) != 0 ? device.density_independent_resolution : null, ((-129) & 4194304) != 0 ? device.webview : false, ((-129) & 8388608) != 0 ? device.web_device_hash : null, ((-129) & 16777216) != 0 ? device.token_hash : null, ((-129) & 33554432) != 0 ? device.adjust_device_id : null, ((-129) & 67108864) != 0 ? device.firebase_app_instance_id : str, ((-129) & 134217728) != 0 ? device.theme_style : null, ((-129) & 268435456) != 0 ? device.singular_device_id : null, ((-129) & 536870912) != 0 ? device.masked_device_id : null, ((-129) & 1073741824) != 0 ? device.masked_web_device_id : null, ((-129) & Integer.MIN_VALUE) != 0 ? device.masked_adid : null, (511 & 1) != 0 ? device.masked_sharer_id : null, (511 & 2) != 0 ? device.masked_os_version : null, (511 & 4) != 0 ? device.masked_referral_code : null, (511 & 8) != 0 ? device.masked_web_device_hash : null, (511 & 16) != 0 ? device.masked_token_hash : null, (511 & 32) != 0 ? device.masked_adjust_device_id : null, (511 & 64) != 0 ? device.masked_firebase_app_instance_id : null, (511 & 128) != 0 ? device.masked_singular_device_id : null, (511 & 256) != 0 ? device.unknownFields() : null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void updateSingularDeviceId(String singularDeviceId) {
        Intrinsics.checkNotNullParameter(singularDeviceId, "singularDeviceId");
        Device device = this.device;
        this.device = device.copy(((-129) & 1) != 0 ? device.platform : null, ((-129) & 2) != 0 ? device.device_id : null, ((-129) & 4) != 0 ? device.web_device_id : null, ((-129) & 8) != 0 ? device.os_version : null, ((-129) & 16) != 0 ? device.manufacturer : null, ((-129) & 32) != 0 ? device.device_version : null, ((-129) & 64) != 0 ? device.screen_resolution : null, ((-129) & 128) != 0 ? device.adid : null, ((-129) & 256) != 0 ? device.font_size : null, ((-129) & 512) != 0 ? device.sharer_id : null, ((-129) & 1024) != 0 ? device.sharer_url : null, ((-129) & 2048) != 0 ? device.source : null, ((-129) & 4096) != 0 ? device.campaign : null, ((-129) & 8192) != 0 ? device.campaign_version : null, ((-129) & 16384) != 0 ? device.click_id : null, ((-129) & 32768) != 0 ? device.reduced_motion : false, ((-129) & 65536) != 0 ? device.voice_over : false, ((-129) & 131072) != 0 ? device.engagement_time : 0, ((-129) & 262144) != 0 ? device.referral_code : null, ((-129) & 524288) != 0 ? device.model : null, ((-129) & 1048576) != 0 ? device.version : null, ((-129) & 2097152) != 0 ? device.density_independent_resolution : null, ((-129) & 4194304) != 0 ? device.webview : false, ((-129) & 8388608) != 0 ? device.web_device_hash : null, ((-129) & 16777216) != 0 ? device.token_hash : null, ((-129) & 33554432) != 0 ? device.adjust_device_id : null, ((-129) & 67108864) != 0 ? device.firebase_app_instance_id : null, ((-129) & 134217728) != 0 ? device.theme_style : null, ((-129) & 268435456) != 0 ? device.singular_device_id : singularDeviceId, ((-129) & 536870912) != 0 ? device.masked_device_id : null, ((-129) & 1073741824) != 0 ? device.masked_web_device_id : null, ((-129) & Integer.MIN_VALUE) != 0 ? device.masked_adid : null, (511 & 1) != 0 ? device.masked_sharer_id : null, (511 & 2) != 0 ? device.masked_os_version : null, (511 & 4) != 0 ? device.masked_referral_code : null, (511 & 8) != 0 ? device.masked_web_device_hash : null, (511 & 16) != 0 ? device.masked_token_hash : null, (511 & 32) != 0 ? device.masked_adjust_device_id : null, (511 & 64) != 0 ? device.masked_firebase_app_instance_id : null, (511 & 128) != 0 ? device.masked_singular_device_id : null, (511 & 256) != 0 ? device.unknownFields() : null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void updateAdjustDeviceId(String adjustDeviceId) {
        Intrinsics.checkNotNullParameter(adjustDeviceId, "adjustDeviceId");
        Device device = this.device;
        this.device = device.copy(((-129) & 1) != 0 ? device.platform : null, ((-129) & 2) != 0 ? device.device_id : null, ((-129) & 4) != 0 ? device.web_device_id : null, ((-129) & 8) != 0 ? device.os_version : null, ((-129) & 16) != 0 ? device.manufacturer : null, ((-129) & 32) != 0 ? device.device_version : null, ((-129) & 64) != 0 ? device.screen_resolution : null, ((-129) & 128) != 0 ? device.adid : null, ((-129) & 256) != 0 ? device.font_size : null, ((-129) & 512) != 0 ? device.sharer_id : null, ((-129) & 1024) != 0 ? device.sharer_url : null, ((-129) & 2048) != 0 ? device.source : null, ((-129) & 4096) != 0 ? device.campaign : null, ((-129) & 8192) != 0 ? device.campaign_version : null, ((-129) & 16384) != 0 ? device.click_id : null, ((-129) & 32768) != 0 ? device.reduced_motion : false, ((-129) & 65536) != 0 ? device.voice_over : false, ((-129) & 131072) != 0 ? device.engagement_time : 0, ((-129) & 262144) != 0 ? device.referral_code : null, ((-129) & 524288) != 0 ? device.model : null, ((-129) & 1048576) != 0 ? device.version : null, ((-129) & 2097152) != 0 ? device.density_independent_resolution : null, ((-129) & 4194304) != 0 ? device.webview : false, ((-129) & 8388608) != 0 ? device.web_device_hash : null, ((-129) & 16777216) != 0 ? device.token_hash : null, ((-129) & 33554432) != 0 ? device.adjust_device_id : adjustDeviceId, ((-129) & 67108864) != 0 ? device.firebase_app_instance_id : null, ((-129) & 134217728) != 0 ? device.theme_style : null, ((-129) & 268435456) != 0 ? device.singular_device_id : null, ((-129) & 536870912) != 0 ? device.masked_device_id : null, ((-129) & 1073741824) != 0 ? device.masked_web_device_id : null, ((-129) & Integer.MIN_VALUE) != 0 ? device.masked_adid : null, (511 & 1) != 0 ? device.masked_sharer_id : null, (511 & 2) != 0 ? device.masked_os_version : null, (511 & 4) != 0 ? device.masked_referral_code : null, (511 & 8) != 0 ? device.masked_web_device_hash : null, (511 & 16) != 0 ? device.masked_token_hash : null, (511 & 32) != 0 ? device.masked_adjust_device_id : null, (511 & 64) != 0 ? device.masked_firebase_app_instance_id : null, (511 & 128) != 0 ? device.masked_singular_device_id : null, (511 & 256) != 0 ? device.unknownFields() : null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logAppFreshInstall() {
        send$default(this, createAppEvent$default(this, EventCategory.APP_SESSION, null, null, null, "FRESH_INSTALL", null, null, null, null, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logTap(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, screen, component, action, context, componentHierarchy, null, 64, null), logPerformance, false, 4, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.APPEAR, screen, component, action, context, componentHierarchy, null, 64, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.DISAPPEAR, screen, component, action, context, componentHierarchy, null, 64, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logScreenAppear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR, screen, component, action, context, componentHierarchy, null, 64, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logScreenDisappear(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR, screen, component, action, context, componentHierarchy, null, 64, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logSwipe(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.SWIPE, screen, component, action, context, componentHierarchy, null, 64, null), logPerformance, false, 4, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logScroll(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.SCROLL, screen, component, action, context, componentHierarchy, null, 64, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logType(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.TYPE, screen, component, action, context, componentHierarchy, null, 64, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logDrag(UserInteractionEventData.Action action, Screen screen, Component component, ComponentHierarchy componentHierarchy, Context context, boolean logPerformance) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.DRAG, screen, component, action, context, componentHierarchy, null, 64, null), logPerformance, false, 4, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logErrorEvent(String tag, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String personalInformationFreeLog, Instant timestamp) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(featureSurface, "featureSurface");
        Intrinsics.checkNotNullParameter(personalInformationFreeLog, "personalInformationFreeLog");
        Object objCreateAppEvent$default = createAppEvent$default(this, EventCategory.ERROR_EVENT, new ErrorEventData(tag, screen, component, errorType, featureSurface, personalInformationFreeLog, null, 64, null), null, null, null, null, null, null, null, null, 1020, null);
        Instant instant = timestamp == null ? this.clock.instant() : timestamp;
        Intrinsics.checkNotNull(instant);
        send$default(this, objCreateAppEvent$default, false, false, instant, null, 22, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final Object recordErrorEvent(String str, Screen screen, Component component, ErrorEventData.ErrorType errorType, ErrorEventData.FeatureSurface featureSurface, String str2, Instant instant, Continuation<? super Unit> continuation) {
        Object objCreateAppEvent$default = createAppEvent$default(this, EventCategory.ERROR_EVENT, new ErrorEventData(str, screen, component, errorType, featureSurface, str2, null, 64, null), null, null, null, null, null, null, null, null, 1020, null);
        Instant instant2 = instant == null ? this.clock.instant() : instant;
        Intrinsics.checkNotNull(instant2);
        Object objRecord$default = record$default(this, objCreateAppEvent$default, false, false, instant2, null, continuation, 20, null);
        return objRecord$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecord$default : Unit.INSTANCE;
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logNetworkEvent(UserInteractionEventData.Action action, Screen screen) {
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this, new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, screen, null, action, null, null, null, 116, null), false, false, 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logUserInteractionEvent(UserInteractionEventData eventData, boolean logPerformance, boolean logImmediate) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (logPerformance && isPerformanceLoggable(eventData.getEvent_type())) {
            PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.ACTION_COMPLETION, null, null, new PerformanceMetricEventData.Context(false, false, false, null, null, null, new PerformanceMetricEventData.Context.Action(eventData, null, 2, null), null, null, null, null, null, 4031, null), 6, null);
        }
        send$default(this, createAppEvent$default(this, EventCategory.USER_INTERACTION, null, eventData, null, null, null, null, null, null, null, 1018, null), false, logImmediate, null, null, 26, null);
        BaseEventLogger2.sendToBitdrift(eventData);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logPerformanceMetric(PerformanceMetric metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        String string2 = metric.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        PerformanceMetricEventData.Name metricName = metric.getKey().getMetricName();
        Duration duration = metric.getDuration();
        send$default(this, createAppEvent$default(this, EventCategory.PERFORMANCE_METRIC, null, null, null, null, null, null, new PerformanceMetricEventData(string2, metricName, duration != null ? Durations2.toSecondsDouble(duration) : 0.0d, metric.getContext(), metric.getStatus(), metric.getSource(), null, 64, null), null, metric.getKey().getSessionId().toString(), 382, null), false, false, metric.getStartTimestamp(), metric.getNetworkConnection(), 6, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logPerformanceSpan(UUID sessionId, PerformanceSpan span) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(span, "span");
        String string2 = span.getKey().getMetricId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String spanName = span.getKey().getSpanName();
        Duration duration = span.getDuration();
        send$default(this, createAppEvent$default(this, EventCategory.PERFORMANCE_METRIC_SPAN, null, null, null, null, null, null, null, new PerformanceMetricSpanEventData(string2, spanName, duration != null ? Durations2.toSecondsDouble(duration) : 0.0d, span.getStatus(), span.getContext(), null, 32, null), sessionId.toString(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), false, false, span.getStartTimestamp(), null, 22, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logExperimentAssignments(String event, String assignments) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        send$default(this, createAppEvent$default(this, EventCategory.EXPERIMENTS, null, null, new ExperimentsEventData(assignments, null, null, 6, null), event, null, null, null, null, null, 998, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public void logExperimentExposure(String experimentName, String variant) {
        Intrinsics.checkNotNullParameter(experimentName, "experimentName");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Timber.INSTANCE.mo3350d("Sending Kaizen exposure for experiment=" + experimentName + " as variant=" + variant, new Object[0]);
        send$default(this, createAppEvent$default(this, EventCategory.EXPERIMENTS, null, null, new ExperimentsEventData(null, new TriggeringExperiments(experimentName, variant, null, 4, null), null, 5, null), EventName.EXPERIMENT_TRIGGERING.getValue(), null, null, null, null, null, 998, null), false, false, null, null, 30, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logNetworkError(NetworkErrorData.Method method, String url, int responseStatusCode, NetworkErrorData.NetworkErrorType type2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type2, "type");
        send$default(this, createAppEvent$default(this, EventCategory.NETWORK_ERROR, null, null, null, null, new NetworkErrorData(method, url, 0L, responseStatusCode, type2, null, 36, null), null, null, null, null, 990, null), false, false, null, null, 28, null);
    }

    @Override // com.robinhood.analytics.EventLogger
    public final void logHttpCall(Instant timestamp, HttpCallData callData) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(callData, "callData");
        send$default(this, createAppEvent$default(this, EventCategory.HTTP_CALL, null, null, null, null, null, callData, null, null, null, 958, null), false, false, timestamp, null, 20, null);
    }

    public static /* synthetic */ void send$default(BaseEventLogger baseEventLogger, Object obj, boolean z, boolean z2, Instant instant, NetworkConnection networkConnection, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            instant = baseEventLogger.clock.instant();
        }
        Instant instant2 = instant;
        if ((i & 16) != 0) {
            networkConnection = null;
        }
        baseEventLogger.send(obj, z3, z4, instant2, networkConnection);
    }

    protected final void send(AppEventType appEvent, boolean triggerUpload, boolean uploadImmediate, Instant timestamp, NetworkConnection networkConnection) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        LoggingEventType loggingeventtypeCreateLoggingEvent = createLoggingEvent(appEvent, timestamp, this.application, this.device, networkConnection);
        this.eventLogManager.send(loggingeventtypeCreateLoggingEvent, timestamp, triggerUpload, uploadImmediate);
        this.eventsRelay.accept(loggingeventtypeCreateLoggingEvent);
    }

    public static /* synthetic */ Object record$default(BaseEventLogger baseEventLogger, Object obj, boolean z, boolean z2, Instant instant, NetworkConnection networkConnection, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            instant = baseEventLogger.clock.instant();
        }
        Instant instant2 = instant;
        if ((i & 16) != 0) {
            networkConnection = null;
        }
        return baseEventLogger.record(obj, z3, z4, instant2, networkConnection, continuation);
    }

    protected final Object record(AppEventType appeventtype, boolean z, boolean z2, Instant instant, NetworkConnection networkConnection, Continuation<? super Unit> continuation) {
        LoggingEventType loggingeventtypeCreateLoggingEvent = createLoggingEvent(appeventtype, instant, this.application, this.device, networkConnection);
        this.eventsRelay.accept(loggingeventtypeCreateLoggingEvent);
        Object objRecord = this.eventLogManager.record(loggingeventtypeCreateLoggingEvent, instant, z, z2, continuation);
        return objRecord == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecord : Unit.INSTANCE;
    }

    public static /* synthetic */ Object createAppEvent$default(BaseEventLogger baseEventLogger, EventCategory eventCategory, ErrorEventData errorEventData, UserInteractionEventData userInteractionEventData, ExperimentsEventData experimentsEventData, String str, NetworkErrorData networkErrorData, HttpCallData httpCallData, PerformanceMetricEventData performanceMetricEventData, PerformanceMetricSpanEventData performanceMetricSpanEventData, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAppEvent");
        }
        if ((i & 2) != 0) {
            errorEventData = null;
        }
        if ((i & 4) != 0) {
            userInteractionEventData = null;
        }
        if ((i & 8) != 0) {
            experimentsEventData = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            networkErrorData = null;
        }
        if ((i & 64) != 0) {
            httpCallData = null;
        }
        if ((i & 128) != 0) {
            performanceMetricEventData = null;
        }
        if ((i & 256) != 0) {
            performanceMetricSpanEventData = null;
        }
        if ((i & 512) != 0) {
            str2 = null;
        }
        return baseEventLogger.createAppEvent(eventCategory, errorEventData, userInteractionEventData, experimentsEventData, str, networkErrorData, httpCallData, performanceMetricEventData, performanceMetricSpanEventData, str2);
    }

    public static /* synthetic */ Object createLoggingEvent$default(BaseEventLogger baseEventLogger, Object obj, Instant instant, Application application, Device device, NetworkConnection networkConnection, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLoggingEvent");
        }
        if ((i & 16) != 0) {
            networkConnection = null;
        }
        return baseEventLogger.createLoggingEvent(obj, instant, application, device, networkConnection);
    }

    private final boolean isPerformanceLoggable(UserInteractionEventData.EventType eventType) {
        switch (WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
