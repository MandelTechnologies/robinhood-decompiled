package com.robinhood.analytics.performance;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.RealSessionManager;
import com.robinhood.analytics.dao.PerformanceMetricDao;
import com.robinhood.analytics.models.PerformanceMetric;
import com.robinhood.analytics.models.PerformanceSpan;
import com.robinhood.analytics.net.NetworkInfoProvider;
import com.robinhood.android.performancelogger.DebugPerformanceLogger;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.performancelogger.PerformanceMetricTrigger;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import p479j$.time.Clock;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: SharedPerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J1\u0010'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\"\u0010,\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00182\u0006\u0010.\u001a\u00020$H\u0002¢\u0006\u0004\b/\u00100J1\u00105\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00102\u001a\u0002012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J1\u00108\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$2\u0006\u00104\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J1\u0010:\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$2\u0006\u00104\u001a\u000207H\u0016¢\u0006\u0004\b:\u00109J)\u0010;\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b;\u0010<J)\u0010=\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b=\u0010<J)\u0010>\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010<J\u001f\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020?2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010C\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bE\u0010DJ!\u0010F\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bF\u0010DJ\u0017\u0010F\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bF\u0010GJ!\u0010H\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bH\u0010DJ\u0017\u0010H\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bH\u0010GJ!\u0010I\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bI\u0010DJ\u0017\u0010I\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bI\u0010GJ?\u0010O\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00102\u001a\u0002012\u0006\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020*2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010QR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010RR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010TR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010UR0\u0010W\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010^\u001a\b\u0012\u0004\u0012\u00020Z0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006b"}, m3636d2 = {"Lcom/robinhood/analytics/performance/SharedPerformanceLogger;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger;", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "dao", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "networkInfoProvider", "Lcom/robinhood/analytics/RealSessionManager;", "sessionManager", "<init>", "(Lj$/time/Clock;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/dao/PerformanceMetricDao;Lcom/robinhood/analytics/net/NetworkInfoProvider;Lcom/robinhood/analytics/RealSessionManager;)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "submit", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "name", "Ljava/util/UUID;", "contextualId", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;", "status", "terminateMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;)V", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "event", "terminateMetricByEvent", "(Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Status;)V", "metricName", "metricContextualId", "", "spanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;", "terminateSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Status;)V", "sessionId", "j$/time/Instant", "timestamp", "onSessionUpdate", "(Ljava/util/UUID;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "action", "checkSession", "(Ljava/lang/String;)Ljava/util/UUID;", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "source", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "context", "beginMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;)V", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "skipSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;)V", "beginSpan", "completeSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;)V", "failSpan", "abortSpan", "Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;", "trigger", "triggerMetric", "(Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;)V", "pauseMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;)V", "resumeMetric", "completeMetric", "(Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;)V", "failMetric", "abortMetric", "startTimestamp", "endTimestamp", "", "isFromColdStart", "requiredLocalAuth", "reportStartup", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Lj$/time/Instant;Lj$/time/Instant;ZZ)V", "Lj$/time/Clock;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/analytics/dao/PerformanceMetricDao;", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "Lcom/robinhood/analytics/RealSessionManager;", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$Event;", "eventSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SharedPerformanceLogger implements PerformanceLogger, DebugPerformanceLogger {
    private final Channel<Function1<Continuation<? super Unit>, Object>> channel;
    private final Clock clock;
    private final CoroutineScope coroutineScope;
    private final PerformanceMetricDao dao;
    private final SharedFlow2<DebugPerformanceLogger.Event> eventSharedFlow;
    private final Flow<DebugPerformanceLogger.Event> events;
    private final NetworkInfoProvider networkInfoProvider;
    private final RealSessionManager sessionManager;

    public SharedPerformanceLogger(@ElapsedRealtime Clock clock, @RootCoroutineScope CoroutineScope coroutineScope, PerformanceMetricDao dao, NetworkInfoProvider networkInfoProvider, RealSessionManager sessionManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.clock = clock;
        this.coroutineScope = coroutineScope;
        this.dao = dao;
        this.networkInfoProvider = networkInfoProvider;
        this.sessionManager = sessionManager;
        this.channel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        SharedFlow2<DebugPerformanceLogger.Event> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.eventSharedFlow = sharedFlow2MutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(sharedFlow2MutableSharedFlow$default);
        FlowKt.launchIn(FlowKt.onEach(sessionManager.getSessionId(), new C73481(null)), coroutineScope);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C73492(null), 3, null);
    }

    @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger
    public Flow<DebugPerformanceLogger.Event> getEvents() {
        return this.events;
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$1 */
    static final class C73481 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C73481(Continuation<? super C73481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C73481 c73481 = SharedPerformanceLogger.this.new C73481(continuation);
            c73481.L$0 = obj;
            return c73481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((C73481) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) this.L$0;
                SharedPerformanceLogger sharedPerformanceLogger = SharedPerformanceLogger.this;
                Instant instant = sharedPerformanceLogger.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                this.label = 1;
                if (sharedPerformanceLogger.onSessionUpdate(uuid, instant, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$2", m3645f = "SharedPerformanceLogger.kt", m3646l = {57, 58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$2 */
    /* loaded from: classes24.dex */
    static final class C73492 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C73492(Continuation<? super C73492> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73492(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C73492) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r6.invoke(r5) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Channel3 it;
            Channel3 channel3;
            Object objHasNext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it = SharedPerformanceLogger.this.channel.iterator();
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channel3 = (Channel3) this.L$0;
                ResultKt.throwOnFailure(obj);
                it = channel3;
                this.L$0 = it;
                this.label = 1;
                objHasNext = it.hasNext(this);
                if (objHasNext != coroutine_suspended) {
                    channel3 = it;
                    obj = objHasNext;
                    if (!((Boolean) obj).booleanValue()) {
                        Function1 function1 = (Function1) channel3.next();
                        this.L$0 = channel3;
                        this.label = 2;
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
            channel3 = (Channel3) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    private final void submit(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        ChannelsKt.trySendBlocking(this.channel, block);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void beginMetric(PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, UUID contextualId, PerformanceMetricEventData.Context context) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(context, "context");
        UUID uuidCheckSession = checkSession("begin metric " + name + " (" + source + ", " + contextualId + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73501(new PerformanceMetric.Key(uuidCheckSession, name, contextualId), source, context, this.networkInfoProvider.determineConnection(), this.clock.instant(), contextualId, name, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$beginMetric$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {94, 102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$beginMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73501 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceMetricEventData.Context $context;
        final /* synthetic */ UUID $contextualId;
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ PerformanceMetricEventData.Name $name;
        final /* synthetic */ NetworkConnection $networkConnection;
        final /* synthetic */ PerformanceMetricEventData.Source $source;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73501(PerformanceMetric.Key key, PerformanceMetricEventData.Source source, PerformanceMetricEventData.Context context, NetworkConnection networkConnection, Instant instant, UUID uuid, PerformanceMetricEventData.Name name, Continuation<? super C73501> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$source = source;
            this.$context = context;
            this.$networkConnection = networkConnection;
            this.$timestamp = instant;
            this.$contextualId = uuid;
            this.$name = name;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73501(this.$key, this.$source, this.$context, this.$networkConnection, this.$timestamp, this.$contextualId, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73501) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            if (r12.emit(r3, r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C73501 c73501;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$key;
                PerformanceMetricEventData.Source source = this.$source;
                PerformanceMetricEventData.Context context = this.$context;
                NetworkConnection networkConnection = this.$networkConnection;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                this.label = 1;
                c73501 = this;
                if (performanceMetricDao.beginMetric(key, source, context, networkConnection, instant, c73501) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c73501 = this;
            SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
            DebugPerformanceLogger.EventState eventState = DebugPerformanceLogger.EventState.STARTED;
            Instant instant2 = c73501.$timestamp;
            Intrinsics.checkNotNull(instant2);
            DebugPerformanceLogger.MetricEvent metricEvent = new DebugPerformanceLogger.MetricEvent(eventState, instant2, c73501.$contextualId, c73501.$name, c73501.$context);
            c73501.label = 2;
        }
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void skipSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Context context) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        Intrinsics.checkNotNullParameter(context, "context");
        UUID uuidCheckSession = checkSession("skip span '" + spanName + "' as part of metric '" + metricName + "' (contextual: " + metricContextualId + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73551(new PerformanceMetric.Key(uuidCheckSession, metricName, metricContextualId), spanName, context, this.clock.instant(), null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$skipSpan$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$skipSpan$1 */
    /* loaded from: classes24.dex */
    static final class C73551 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceMetricSpanEventData.Context $context;
        final /* synthetic */ PerformanceMetric.Key $metricKey;
        final /* synthetic */ String $spanName;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73551(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super C73551> continuation) {
            super(1, continuation);
            this.$metricKey = key;
            this.$spanName = str;
            this.$context = context;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73551(this.$metricKey, this.$spanName, this.$context, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73551) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$metricKey;
                String str = this.$spanName;
                PerformanceMetricSpanEventData.Context context = this.$context;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                this.label = 1;
                if (performanceMetricDao.skipSpan(key, str, context, instant, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void beginSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Context context) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        Intrinsics.checkNotNullParameter(context, "context");
        UUID uuidCheckSession = checkSession("begin span '" + spanName + "' as part of metric '" + metricName + "' (contextual: " + metricContextualId + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73511(new PerformanceMetric.Key(uuidCheckSession, metricName, metricContextualId), spanName, context, this.clock.instant(), null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$beginSpan$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$beginSpan$1 */
    /* loaded from: classes24.dex */
    static final class C73511 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceMetricSpanEventData.Context $context;
        final /* synthetic */ PerformanceMetric.Key $metricKey;
        final /* synthetic */ String $spanName;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73511(PerformanceMetric.Key key, String str, PerformanceMetricSpanEventData.Context context, Instant instant, Continuation<? super C73511> continuation) {
            super(1, continuation);
            this.$metricKey = key;
            this.$spanName = str;
            this.$context = context;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73511(this.$metricKey, this.$spanName, this.$context, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73511) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        
            if (r1.emit(r3, r10) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C73511 c73511;
            DebugPerformanceLogger.EventState eventState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$metricKey;
                String str = this.$spanName;
                PerformanceMetricSpanEventData.Context context = this.$context;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                this.label = 1;
                c73511 = this;
                obj = performanceMetricDao.beginSpan(key, str, context, instant, c73511);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c73511 = this;
            PerformanceSpan performanceSpan = (PerformanceSpan) obj;
            SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
            Instant startTimestamp = performanceSpan != null ? performanceSpan.getStartTimestamp() : null;
            if (Intrinsics.areEqual(startTimestamp, c73511.$timestamp)) {
                eventState = DebugPerformanceLogger.EventState.STARTED;
            } else if (startTimestamp == null) {
                eventState = DebugPerformanceLogger.EventState.METRIC_MISSING;
            } else {
                eventState = DebugPerformanceLogger.EventState.ALREADY_EXISTS;
            }
            Instant instant2 = c73511.$timestamp;
            Intrinsics.checkNotNull(instant2);
            DebugPerformanceLogger.SpanEvent spanEvent = new DebugPerformanceLogger.SpanEvent(eventState, instant2, c73511.$spanName, c73511.$context);
            c73511.label = 2;
        }
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void completeSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        terminateSpan(metricName, metricContextualId, spanName, PerformanceMetricSpanEventData.Status.COMPLETED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void failSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        terminateSpan(metricName, metricContextualId, spanName, PerformanceMetricSpanEventData.Status.FAILED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void abortSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName) {
        Intrinsics.checkNotNullParameter(metricName, "metricName");
        Intrinsics.checkNotNullParameter(spanName, "spanName");
        terminateSpan(metricName, metricContextualId, spanName, PerformanceMetricSpanEventData.Status.ABORTED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void triggerMetric(PerformanceMetricTrigger trigger, PerformanceMetricEventData.Source source) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(source, "source");
        beginMetric(trigger.getPerformanceMetricName(), source, trigger.getPerformanceMetricContextualId(), trigger.getPerformanceMetricContext());
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void pauseMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
        Intrinsics.checkNotNullParameter(name, "name");
        UUID uuidCheckSession = checkSession("pause metric " + name + " (" + contextualId + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73521(new PerformanceMetric.Key(uuidCheckSession, name, contextualId), this.clock.instant(), contextualId, name, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$pauseMetric$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$pauseMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73521 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contextualId;
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ PerformanceMetricEventData.Name $name;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73521(PerformanceMetric.Key key, Instant instant, UUID uuid, PerformanceMetricEventData.Name name, Continuation<? super C73521> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$timestamp = instant;
            this.$contextualId = uuid;
            this.$name = name;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73521(this.$key, this.$timestamp, this.$contextualId, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73521) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (r12.emit(r3, r11) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$key;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                this.label = 1;
                obj = performanceMetricDao.pauseMetric(key, instant, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
                DebugPerformanceLogger.EventState eventState = DebugPerformanceLogger.EventState.PAUSED;
                Instant instant2 = this.$timestamp;
                Intrinsics.checkNotNull(instant2);
                DebugPerformanceLogger.MetricEvent metricEvent = new DebugPerformanceLogger.MetricEvent(eventState, instant2, this.$contextualId, this.$name, null, 16, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void resumeMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
        Intrinsics.checkNotNullParameter(name, "name");
        UUID uuidCheckSession = checkSession("resume metric " + name + " (" + contextualId + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73541(new PerformanceMetric.Key(uuidCheckSession, name, contextualId), this.clock.instant(), contextualId, name, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$resumeMetric$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$resumeMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73541 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contextualId;
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ PerformanceMetricEventData.Name $name;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73541(PerformanceMetric.Key key, Instant instant, UUID uuid, PerformanceMetricEventData.Name name, Continuation<? super C73541> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$timestamp = instant;
            this.$contextualId = uuid;
            this.$name = name;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73541(this.$key, this.$timestamp, this.$contextualId, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73541) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (r12.emit(r3, r11) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$key;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                this.label = 1;
                obj = performanceMetricDao.resumeMetric(key, instant, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
                DebugPerformanceLogger.EventState eventState = DebugPerformanceLogger.EventState.RESUMED;
                Instant instant2 = this.$timestamp;
                Intrinsics.checkNotNull(instant2);
                DebugPerformanceLogger.MetricEvent metricEvent = new DebugPerformanceLogger.MetricEvent(eventState, instant2, this.$contextualId, this.$name, null, 16, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void completeMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
        Intrinsics.checkNotNullParameter(name, "name");
        terminateMetric(name, contextualId, PerformanceMetricEventData.Status.COMPLETED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void completeMetric(ContextActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        terminateMetricByEvent(event, PerformanceMetricEventData.Status.COMPLETED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void failMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
        Intrinsics.checkNotNullParameter(name, "name");
        terminateMetric(name, contextualId, PerformanceMetricEventData.Status.FAILED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void failMetric(ContextActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        terminateMetricByEvent(event, PerformanceMetricEventData.Status.FAILED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void abortMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
        Intrinsics.checkNotNullParameter(name, "name");
        terminateMetric(name, contextualId, PerformanceMetricEventData.Status.ABORTED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void abortMetric(ContextActionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        terminateMetricByEvent(event, PerformanceMetricEventData.Status.ABORTED);
    }

    @Override // com.robinhood.android.performancelogger.PerformanceLogger
    public void reportStartup(PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, Instant startTimestamp, Instant endTimestamp, boolean isFromColdStart, boolean requiredLocalAuth) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
        Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        UUID uuidCheckSession = checkSession("startup metric " + name);
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73531(uuidCheckSession, name, isFromColdStart, requiredLocalAuth, this, source, startTimestamp, endTimestamp, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$reportStartup$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {344}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$reportStartup$1 */
    static final class C73531 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Instant $endTimestamp;
        final /* synthetic */ boolean $isFromColdStart;
        final /* synthetic */ PerformanceMetricEventData.Name $name;
        final /* synthetic */ boolean $requiredLocalAuth;
        final /* synthetic */ UUID $sessionId;
        final /* synthetic */ PerformanceMetricEventData.Source $source;
        final /* synthetic */ Instant $startTimestamp;
        int label;
        final /* synthetic */ SharedPerformanceLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73531(UUID uuid, PerformanceMetricEventData.Name name, boolean z, boolean z2, SharedPerformanceLogger sharedPerformanceLogger, PerformanceMetricEventData.Source source, Instant instant, Instant instant2, Continuation<? super C73531> continuation) {
            super(1, continuation);
            this.$sessionId = uuid;
            this.$name = name;
            this.$isFromColdStart = z;
            this.$requiredLocalAuth = z2;
            this.this$0 = sharedPerformanceLogger;
            this.$source = source;
            this.$startTimestamp = instant;
            this.$endTimestamp = instant2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C73531(this.$sessionId, this.$name, this.$isFromColdStart, this.$requiredLocalAuth, this.this$0, this.$source, this.$startTimestamp, this.$endTimestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73531) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                PerformanceMetric.Key key = new PerformanceMetric.Key(this.$sessionId, this.$name, null);
                PerformanceMetricEventData.Status status = PerformanceMetricEventData.Status.COMPLETED;
                PerformanceMetric performanceMetric = new PerformanceMetric(uuidRandomUUID, key, this.$source, new PerformanceMetricEventData.Context(this.$isFromColdStart, this.$requiredLocalAuth, false, null, null, null, null, null, null, null, null, null, 4092, null), this.this$0.networkInfoProvider.determineConnection(), status, this.$startTimestamp, this.$endTimestamp, CollectionsKt.emptyList());
                PerformanceMetricDao performanceMetricDao = this.this$0.dao;
                this.label = 1;
                if (performanceMetricDao.insert(performanceMetric, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void terminateMetric(PerformanceMetricEventData.Name name, UUID contextualId, PerformanceMetricEventData.Status status) {
        UUID uuidCheckSession = checkSession("complete metric " + name + " (" + contextualId + ", " + status + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73561(new PerformanceMetric.Key(uuidCheckSession, name, contextualId), this.clock.instant(), status, contextualId, name, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$terminateMetric$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {362, 372}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$terminateMetric$1 */
    /* loaded from: classes24.dex */
    static final class C73561 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contextualId;
        final /* synthetic */ PerformanceMetric.Key $key;
        final /* synthetic */ PerformanceMetricEventData.Name $name;
        final /* synthetic */ PerformanceMetricEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* compiled from: SharedPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$terminateMetric$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PerformanceMetricEventData.Status.values().length];
                try {
                    iArr[PerformanceMetricEventData.Status.COMPLETED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PerformanceMetricEventData.Status.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PerformanceMetricEventData.Status.ABORTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73561(PerformanceMetric.Key key, Instant instant, PerformanceMetricEventData.Status status, UUID uuid, PerformanceMetricEventData.Name name, Continuation<? super C73561> continuation) {
            super(1, continuation);
            this.$key = key;
            this.$timestamp = instant;
            this.$status = status;
            this.$contextualId = uuid;
            this.$name = name;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73561(this.$key, this.$timestamp, this.$status, this.$contextualId, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73561) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        
            if (r12.emit(r3, r11) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DebugPerformanceLogger.EventState eventState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$key;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                PerformanceMetricEventData.Status status = this.$status;
                this.label = 1;
                obj = performanceMetricDao.terminateMetric(key, instant, status, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$status.ordinal()];
                if (i2 == 1) {
                    eventState = DebugPerformanceLogger.EventState.COMPLETED;
                } else if (i2 == 2) {
                    eventState = DebugPerformanceLogger.EventState.FAILED;
                } else if (i2 == 3) {
                    eventState = DebugPerformanceLogger.EventState.ABORTED;
                } else {
                    eventState = DebugPerformanceLogger.EventState.UNKNOWN;
                }
                DebugPerformanceLogger.EventState eventState2 = eventState;
                SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
                Instant instant2 = this.$timestamp;
                Intrinsics.checkNotNull(instant2);
                DebugPerformanceLogger.MetricEvent metricEvent = new DebugPerformanceLogger.MetricEvent(eventState2, instant2, this.$contextualId, this.$name, null, 16, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    private final void terminateMetricByEvent(ContextActionEvent event, PerformanceMetricEventData.Status status) {
        UUID uuidCheckSession = checkSession("complete metric by event " + event + " (" + status + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73571(event, uuidCheckSession, this.clock.instant(), status, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$terminateMetricByEvent$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {392, 402}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$terminateMetricByEvent$1 */
    /* loaded from: classes24.dex */
    static final class C73571 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ContextActionEvent $event;
        final /* synthetic */ UUID $sessionId;
        final /* synthetic */ PerformanceMetricEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* compiled from: SharedPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$terminateMetricByEvent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PerformanceMetricEventData.Status.values().length];
                try {
                    iArr[PerformanceMetricEventData.Status.COMPLETED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PerformanceMetricEventData.Status.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PerformanceMetricEventData.Status.ABORTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73571(ContextActionEvent contextActionEvent, UUID uuid, Instant instant, PerformanceMetricEventData.Status status, Continuation<? super C73571> continuation) {
            super(1, continuation);
            this.$event = contextActionEvent;
            this.$sessionId = uuid;
            this.$timestamp = instant;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73571(this.$event, this.$sessionId, this.$timestamp, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73571) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        
            if (r0.emit(r8, r16) == r6) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objTerminateMetricByEvent;
            DebugPerformanceLogger.EventState eventState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                ContextActionEvent contextActionEvent = this.$event;
                UUID uuid = this.$sessionId;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                PerformanceMetricEventData.Status status = this.$status;
                this.label = 1;
                objTerminateMetricByEvent = performanceMetricDao.terminateMetricByEvent(contextActionEvent, uuid, instant, status, this);
                if (objTerminateMetricByEvent != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objTerminateMetricByEvent = obj;
            if (((Boolean) objTerminateMetricByEvent).booleanValue()) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$status.ordinal()];
                if (i2 == 1) {
                    eventState = DebugPerformanceLogger.EventState.COMPLETED;
                } else if (i2 == 2) {
                    eventState = DebugPerformanceLogger.EventState.FAILED;
                } else if (i2 == 3) {
                    eventState = DebugPerformanceLogger.EventState.ABORTED;
                } else {
                    eventState = DebugPerformanceLogger.EventState.UNKNOWN;
                }
                DebugPerformanceLogger.EventState eventState2 = eventState;
                SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
                PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.ACTION_COMPLETION;
                Instant instant2 = this.$timestamp;
                Intrinsics.checkNotNull(instant2);
                DebugPerformanceLogger.MetricEvent metricEvent = new DebugPerformanceLogger.MetricEvent(eventState2, instant2, null, name, null, 16, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    private final void terminateSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Status status) {
        UUID uuidCheckSession = checkSession("terminate span '" + spanName + "' as part of metric '" + metricName + "' (contextual: " + metricContextualId + ")");
        if (uuidCheckSession == null) {
            return;
        }
        submit(new C73581(new PerformanceMetric.Key(uuidCheckSession, metricName, metricContextualId), spanName, this.clock.instant(), status, null));
    }

    /* compiled from: SharedPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.performance.SharedPerformanceLogger$terminateSpan$1", m3645f = "SharedPerformanceLogger.kt", m3646l = {429, 437}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$terminateSpan$1 */
    /* loaded from: classes24.dex */
    static final class C73581 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceMetric.Key $metricKey;
        final /* synthetic */ String $spanName;
        final /* synthetic */ PerformanceMetricSpanEventData.Status $status;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* compiled from: SharedPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.analytics.performance.SharedPerformanceLogger$terminateSpan$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PerformanceMetricSpanEventData.Status.values().length];
                try {
                    iArr[PerformanceMetricSpanEventData.Status.PERFORMANCE_METRIC_SPAN_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PerformanceMetricSpanEventData.Status.COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PerformanceMetricSpanEventData.Status.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PerformanceMetricSpanEventData.Status.ABORTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PerformanceMetricSpanEventData.Status.SKIPPED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73581(PerformanceMetric.Key key, String str, Instant instant, PerformanceMetricSpanEventData.Status status, Continuation<? super C73581> continuation) {
            super(1, continuation);
            this.$metricKey = key;
            this.$spanName = str;
            this.$timestamp = instant;
            this.$status = status;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SharedPerformanceLogger.this.new C73581(this.$metricKey, this.$spanName, this.$timestamp, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C73581) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        
            if (r0.emit(r8, r15) == r6) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objTerminateSpan;
            DebugPerformanceLogger.EventState eventState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerformanceMetricDao performanceMetricDao = SharedPerformanceLogger.this.dao;
                PerformanceMetric.Key key = this.$metricKey;
                String str = this.$spanName;
                Instant instant = this.$timestamp;
                Intrinsics.checkNotNull(instant);
                PerformanceMetricSpanEventData.Status status = this.$status;
                this.label = 1;
                objTerminateSpan = performanceMetricDao.terminateSpan(key, str, instant, status, this);
                if (objTerminateSpan != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objTerminateSpan = obj;
            if (((Boolean) objTerminateSpan).booleanValue()) {
                SharedFlow2 sharedFlow2 = SharedPerformanceLogger.this.eventSharedFlow;
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$status.ordinal()];
                if (i2 == 1) {
                    eventState = DebugPerformanceLogger.EventState.UNKNOWN;
                } else if (i2 == 2) {
                    eventState = DebugPerformanceLogger.EventState.COMPLETED;
                } else if (i2 == 3) {
                    eventState = DebugPerformanceLogger.EventState.FAILED;
                } else if (i2 == 4) {
                    eventState = DebugPerformanceLogger.EventState.ABORTED;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eventState = DebugPerformanceLogger.EventState.SKIPPED;
                }
                DebugPerformanceLogger.EventState eventState2 = eventState;
                Instant instant2 = this.$timestamp;
                Intrinsics.checkNotNull(instant2);
                DebugPerformanceLogger.SpanEvent spanEvent = new DebugPerformanceLogger.SpanEvent(eventState2, instant2, this.$spanName, null, 8, null);
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onSessionUpdate(UUID uuid, Instant instant, Continuation<? super Unit> continuation) {
        Object objOnSessionUpdate = this.dao.onSessionUpdate(uuid, instant, continuation);
        return objOnSessionUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOnSessionUpdate : Unit.INSTANCE;
    }

    private final UUID checkSession(String action) {
        UUID value = this.sessionManager.getSessionId().getValue();
        if (value == null) {
            Timber.INSTANCE.mo3353e("Performance tracking: Could not %s because there is no active session", action);
            return value;
        }
        Timber.INSTANCE.mo3356i("Performance tracking: %s", action);
        return value;
    }
}
