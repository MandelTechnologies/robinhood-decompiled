package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventTradingSession;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: StreamEventMarketSessionChangeStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "<init>", "(Lcom/robinhood/store/event/EventMarketdataStore;)V", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "exchangeSource", "Lkotlin/Function0;", "j$/time/Instant", "getNow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "invoke", "(Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/event/EventMarketdataStore;", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class StreamEventMarketSessionChangeStateUseCase {
    private final EventMarketdataStore eventMarketdataStore;

    public StreamEventMarketSessionChangeStateUseCase(EventMarketdataStore eventMarketdataStore) {
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        this.eventMarketdataStore = eventMarketdataStore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamEventMarketSessionChangeStateUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase$invoke$1 */
    public /* synthetic */ class C202891 extends FunctionReferenceImpl implements Function0<Instant> {
        public static final C202891 INSTANCE = new C202891();

        C202891() {
            super(0, Instant.class, "now", "now()Ljava/time/Instant;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Instant invoke() {
            return Instant.now();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow invoke$default(StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeStateUseCase, ExchangeSource exchangeSource, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = C202891.INSTANCE;
        }
        return streamEventMarketSessionChangeStateUseCase.invoke(exchangeSource, function0);
    }

    public final Flow<MarketSessionChangeDataState> invoke(ExchangeSource exchangeSource, Function0<Instant> getNow) {
        Intrinsics.checkNotNullParameter(exchangeSource, "exchangeSource");
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        return GetMarketSessionChangeState2.getMarketSessionChangeState(getNow, new C202902(exchangeSource, null), StringResource.INSTANCE.invoke(C20288R.string.event_detail_header_prefix, new Object[0]));
    }

    /* compiled from: StreamEventMarketSessionChangeStateUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "now", "Lcom/robinhood/android/lib/futures/trade/Session;", "<anonymous>", "(Lj$/time/Instant;)Lcom/robinhood/android/lib/futures/trade/Session;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase$invoke$2", m3645f = "StreamEventMarketSessionChangeStateUseCase.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase$invoke$2 */
    static final class C202902 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Session>, Object> {
        final /* synthetic */ ExchangeSource $exchangeSource;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C202902(ExchangeSource exchangeSource, Continuation<? super C202902> continuation) {
            super(2, continuation);
            this.$exchangeSource = exchangeSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C202902 c202902 = StreamEventMarketSessionChangeStateUseCase.this.new C202902(this.$exchangeSource, continuation);
            c202902.L$0 = obj;
            return c202902;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Instant instant, Continuation<? super Session> continuation) {
            return ((C202902) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Instant instant = (Instant) this.L$0;
                EventMarketdataStore eventMarketdataStore = StreamEventMarketSessionChangeStateUseCase.this.eventMarketdataStore;
                ExchangeSource exchangeSource = this.$exchangeSource;
                this.label = 1;
                obj = eventMarketdataStore.getNextOpenTradingSession(instant, exchangeSource, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ApiEventTradingSessionExt.toUiSession((ApiEventTradingSession) obj);
        }
    }
}
