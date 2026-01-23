package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderTimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onResume$1$1", m3645f = "OrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OrderTimeInForceDuxo2 extends ContinuationImpl7 implements Function2<OrderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState>, Object> {
    final /* synthetic */ OrderTimeInForce $timeInForce;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderTimeInForceDuxo2(OrderTimeInForce orderTimeInForce, Continuation<? super OrderTimeInForceDuxo2> continuation) {
        super(2, continuation);
        this.$timeInForce = orderTimeInForce;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderTimeInForceDuxo2 orderTimeInForceDuxo2 = new OrderTimeInForceDuxo2(this.$timeInForce, continuation);
        orderTimeInForceDuxo2.L$0 = obj;
        return orderTimeInForceDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OrderTimeInForceDataState orderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState> continuation) {
        return ((OrderTimeInForceDuxo2) create(orderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OrderTimeInForceDataState.copy$default((OrderTimeInForceDataState) this.L$0, null, null, null, null, null, new UiEvent(this.$timeInForce), false, 95, null);
    }
}
