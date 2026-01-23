package com.robinhood.android.equitytradeladder;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onMarketSellClicked$2$2", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onMarketSellClicked$2$2 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    EquityTradeLadderDuxo$onMarketSellClicked$2$2(Continuation<? super EquityTradeLadderDuxo$onMarketSellClicked$2$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$onMarketSellClicked$2$2 equityTradeLadderDuxo$onMarketSellClicked$2$2 = new EquityTradeLadderDuxo$onMarketSellClicked$2$2(continuation);
        equityTradeLadderDuxo$onMarketSellClicked$2$2.L$0 = obj;
        return equityTradeLadderDuxo$onMarketSellClicked$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
        return ((EquityTradeLadderDuxo$onMarketSellClicked$2$2) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, true, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268427263, null);
    }
}
