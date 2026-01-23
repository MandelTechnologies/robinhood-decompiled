package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventTradingSession;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.store.event.EventMarketdataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: StreamNextEventOpenSessionUseCase.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/lib/futures/trade/Session;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.futures.trade.StreamNextEventOpenSessionUseCase$invoke$2", m3645f = "StreamNextEventOpenSessionUseCase.kt", m3646l = {30, 33, 44}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.futures.trade.StreamNextEventOpenSessionUseCase$invoke$2, reason: use source file name */
/* loaded from: classes8.dex */
final class StreamNextEventOpenSessionUseCase2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Session>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ExchangeSource $exchangeSource;
    final /* synthetic */ Function0<Instant> $getNow;
    final /* synthetic */ long $retryDelayDuration;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ StreamNextEventOpenSessionUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreamNextEventOpenSessionUseCase2(Function0<Instant> function0, StreamNextEventOpenSessionUseCase streamNextEventOpenSessionUseCase, ExchangeSource exchangeSource, long j, Continuation<? super StreamNextEventOpenSessionUseCase2> continuation) {
        super(2, continuation);
        this.$getNow = function0;
        this.this$0 = streamNextEventOpenSessionUseCase;
        this.$exchangeSource = exchangeSource;
        this.$retryDelayDuration = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StreamNextEventOpenSessionUseCase2 streamNextEventOpenSessionUseCase2 = new StreamNextEventOpenSessionUseCase2(this.$getNow, this.this$0, this.$exchangeSource, this.$retryDelayDuration, continuation);
        streamNextEventOpenSessionUseCase2.L$0 = obj;
        return streamNextEventOpenSessionUseCase2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Session> flowCollector, Continuation<? super Unit> continuation) {
        return ((StreamNextEventOpenSessionUseCase2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a3 -> B:13:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Instant instant;
        Session session;
        long jM28738getInWholeMillisecondsimpl;
        Instant instant2;
        Session uiSession;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
        } else {
            if (i == 1) {
                instant2 = (Instant) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                uiSession = ApiEventTradingSessionExt.toUiSession((ApiEventTradingSession) obj);
                this.L$0 = flowCollector;
                this.L$1 = instant2;
                this.L$2 = uiSession;
                this.label = 2;
                if (flowCollector.emit(uiSession, this) != coroutine_suspended) {
                    Instant instant3 = instant2;
                    session = uiSession;
                    instant = instant3;
                    if (session == null) {
                    }
                    this.L$0 = flowCollector;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (DelayKt.delay(jM28738getInWholeMillisecondsimpl, this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i == 2) {
                session = (Session) this.L$2;
                Instant instant4 = (Instant) this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                instant = instant4;
                flowCollector = flowCollector2;
                if (session == null) {
                    jM28738getInWholeMillisecondsimpl = session.getEndTime().toEpochMilli() - instant.toEpochMilli();
                } else {
                    jM28738getInWholeMillisecondsimpl = Duration.m28738getInWholeMillisecondsimpl(this.$retryDelayDuration);
                }
                this.L$0 = flowCollector;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (DelayKt.delay(jM28738getInWholeMillisecondsimpl, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        }
        Instant instantInvoke = this.$getNow.invoke();
        EventMarketdataStore eventMarketdataStore = this.this$0.eventMarketdataStore;
        ExchangeSource exchangeSource = this.$exchangeSource;
        this.L$0 = flowCollector;
        this.L$1 = instantInvoke;
        this.label = 1;
        Object nextOpenTradingSession = eventMarketdataStore.getNextOpenTradingSession(instantInvoke, exchangeSource, this);
        if (nextOpenTradingSession != coroutine_suspended) {
            instant2 = instantInvoke;
            obj = nextOpenTradingSession;
            uiSession = ApiEventTradingSessionExt.toUiSession((ApiEventTradingSession) obj);
            this.L$0 = flowCollector;
            this.L$1 = instant2;
            this.L$2 = uiSession;
            this.label = 2;
            if (flowCollector.emit(uiSession, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
