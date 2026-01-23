package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: StreamMarketSessionChangeStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase;", "", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "tradingHoursStore", "<init>", "(Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;)V", "Ljava/util/UUID;", "contractId", "Lkotlin/Function0;", "j$/time/Instant", "getNow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "invoke", "(Ljava/util/UUID;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "Companion", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class StreamMarketSessionChangeStateUseCase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StringResource prefixString = StringResource.INSTANCE.invoke(C20288R.string.futures_ladder_header_prefix, new Object[0]);
    private final FuturesTradingHoursStore tradingHoursStore;

    public StreamMarketSessionChangeStateUseCase(FuturesTradingHoursStore tradingHoursStore) {
        Intrinsics.checkNotNullParameter(tradingHoursStore, "tradingHoursStore");
        this.tradingHoursStore = tradingHoursStore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamMarketSessionChangeStateUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase$invoke$1 */
    public /* synthetic */ class C202911 extends FunctionReferenceImpl implements Function0<Instant> {
        public static final C202911 INSTANCE = new C202911();

        C202911() {
            super(0, Instant.class, "now", "now()Ljava/time/Instant;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Instant invoke() {
            return Instant.now();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow invoke$default(StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, UUID uuid, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = C202911.INSTANCE;
        }
        return streamMarketSessionChangeStateUseCase.invoke(uuid, function0);
    }

    public final Flow<MarketSessionChangeDataState> invoke(UUID contractId, Function0<Instant> getNow) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        return GetMarketSessionChangeState2.getMarketSessionChangeState(getNow, new C202922(contractId, null), prefixString);
    }

    /* compiled from: StreamMarketSessionChangeStateUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "now", "Lcom/robinhood/android/lib/futures/trade/Session;", "<anonymous>", "(Lj$/time/Instant;)Lcom/robinhood/android/lib/futures/trade/Session;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase$invoke$2", m3645f = "StreamMarketSessionChangeStateUseCase.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.futures.trade.StreamMarketSessionChangeStateUseCase$invoke$2 */
    static final class C202922 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Session>, Object> {
        final /* synthetic */ UUID $contractId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C202922(UUID uuid, Continuation<? super C202922> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C202922 c202922 = StreamMarketSessionChangeStateUseCase.this.new C202922(this.$contractId, continuation);
            c202922.L$0 = obj;
            return c202922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Instant instant, Continuation<? super Session> continuation) {
            return ((C202922) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Instant instant = (Instant) this.L$0;
                FuturesTradingHoursStore futuresTradingHoursStore = StreamMarketSessionChangeStateUseCase.this.tradingHoursStore;
                UUID uuid = this.$contractId;
                this.label = 1;
                obj = futuresTradingHoursStore.getNextOpenTradingSession(uuid, instant, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return StreamMarketSessionChangeStateUseCase2.toUiSession((FuturesTradingHours.Session) obj);
        }
    }

    /* compiled from: StreamMarketSessionChangeStateUseCase.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/StreamMarketSessionChangeStateUseCase$Companion;", "", "<init>", "()V", "prefixString", "Lcom/robinhood/utils/resource/StringResource;", "getPrefixString$lib_futures_trade_externalDebug$annotations", "getPrefixString$lib_futures_trade_externalDebug", "()Lcom/robinhood/utils/resource/StringResource;", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPrefixString$lib_futures_trade_externalDebug$annotations() {
        }

        private Companion() {
        }

        public final StringResource getPrefixString$lib_futures_trade_externalDebug() {
            return StreamMarketSessionChangeStateUseCase.prefixString;
        }
    }
}
