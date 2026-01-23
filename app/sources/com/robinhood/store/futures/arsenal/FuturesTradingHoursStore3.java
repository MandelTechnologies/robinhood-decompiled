package com.robinhood.store.futures.arsenal;

import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.TradingSessionsDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.LocalDate;

/* compiled from: FuturesTradingHoursStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"Lkotlin/Pair;", "Ljava/util/UUID;", "j$/time/LocalDate", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "<anonymous>", "(Lkotlin/Pair;)Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$tradingHoursEndpoint$1", m3645f = "FuturesTradingHoursStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$tradingHoursEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesTradingHoursStore3 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends LocalDate>, Continuation<? super TradingSessionsDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesTradingHoursStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesTradingHoursStore3(FuturesTradingHoursStore futuresTradingHoursStore, Continuation<? super FuturesTradingHoursStore3> continuation) {
        super(2, continuation);
        this.this$0 = futuresTradingHoursStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesTradingHoursStore3 futuresTradingHoursStore3 = new FuturesTradingHoursStore3(this.this$0, continuation);
        futuresTradingHoursStore3.L$0 = obj;
        return futuresTradingHoursStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends LocalDate> tuples2, Continuation<? super TradingSessionsDto> continuation) {
        return invoke2((Tuples2<UUID, LocalDate>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, LocalDate> tuples2, Continuation<? super TradingSessionsDto> continuation) {
        return ((FuturesTradingHoursStore3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        UUID uuid = (UUID) tuples2.component1();
        LocalDate localDate = (LocalDate) tuples2.component2();
        InstrumentService instrumentService = this.this$0.arsenalService;
        this.label = 1;
        Object futuresContractTradingSessions = ArsenalServiceExt.getFuturesContractTradingSessions(instrumentService, uuid, localDate, this);
        return futuresContractTradingSessions == coroutine_suspended ? coroutine_suspended : futuresContractTradingSessions;
    }
}
