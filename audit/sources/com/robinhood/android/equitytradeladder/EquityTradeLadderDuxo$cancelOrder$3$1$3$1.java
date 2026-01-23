package com.robinhood.android.equitytradeladder;

import com.robinhood.android.equitytradeladder.models.EquityPendingOrder3;
import com.robinhood.android.equitytradeladder.models.PendingFilledOrder;
import com.robinhood.models.p320db.Order;
import java.util.Map;
import java.util.UUID;
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
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$cancelOrder$3$1$3$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$cancelOrder$3$1$3$1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
    final /* synthetic */ Order $order;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderDuxo$cancelOrder$3$1$3$1(Order order, Continuation<? super EquityTradeLadderDuxo$cancelOrder$3$1$3$1> continuation) {
        super(2, continuation);
        this.$order = order;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$cancelOrder$3$1$3$1 equityTradeLadderDuxo$cancelOrder$3$1$3$1 = new EquityTradeLadderDuxo$cancelOrder$3$1$3$1(this.$order, continuation);
        equityTradeLadderDuxo$cancelOrder$3$1$3$1.L$0 = obj;
        return equityTradeLadderDuxo$cancelOrder$3$1$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
        return ((EquityTradeLadderDuxo$cancelOrder$3$1$3$1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
        Map<UUID, EquityPendingOrder3> uiPendingOrdersMap = equityTradeLadderDataState.getUiPendingOrdersMap();
        Order order = this.$order;
        uiPendingOrdersMap.put(order.getId(), new PendingFilledOrder(order));
        Unit unit = Unit.INSTANCE;
        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, uiPendingOrdersMap, null, false, false, false, false, false, false, false, false, -1, 268173311, null);
    }
}
