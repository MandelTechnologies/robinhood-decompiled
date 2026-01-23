package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.nbbo.models.p359db.NbboSummary;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderPriceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$2$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OrderPriceDuxo3 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
    final /* synthetic */ NbboSummary $nbboSummary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderPriceDuxo3(NbboSummary nbboSummary, Continuation<? super OrderPriceDuxo3> continuation) {
        super(2, continuation);
        this.$nbboSummary = nbboSummary;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderPriceDuxo3 orderPriceDuxo3 = new OrderPriceDuxo3(this.$nbboSummary, continuation);
        orderPriceDuxo3.L$0 = obj;
        return orderPriceDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
        return ((OrderPriceDuxo3) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, null, null, null, this.$nbboSummary, null, null, false, null, null, 2015, null);
    }
}
