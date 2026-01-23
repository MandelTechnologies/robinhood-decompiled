package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragmentEvent;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.Order;
import java.math.BigDecimal;
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
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$5$1$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$5$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OrderPriceDuxo4 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
    final /* synthetic */ Order $order;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrderPriceDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderPriceDuxo4(OrderPriceDuxo orderPriceDuxo, Order order, Continuation<? super OrderPriceDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = orderPriceDuxo;
        this.$order = order;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderPriceDuxo4 orderPriceDuxo4 = new OrderPriceDuxo4(this.this$0, this.$order, continuation);
        orderPriceDuxo4.L$0 = obj;
        return orderPriceDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
        return ((OrderPriceDuxo4) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal stopPrice;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OrderPriceViewState orderPriceViewState = (OrderPriceViewState) this.L$0;
        OrderPriceDuxo orderPriceDuxo = this.this$0;
        if (((OrderPriceFragment.Args) OrderPriceDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getDirectOrder().getOrderConfiguration() == Order.Configuration.LIMIT) {
            stopPrice = this.$order.getPrice();
        } else {
            stopPrice = this.$order.getStopPrice();
        }
        orderPriceDuxo.submit(new OrderPriceFragmentEvent.InitialPriceEvent(stopPrice));
        return OrderPriceViewState.copy$default(orderPriceViewState, null, null, null, null, null, null, null, null, false, this.$order, null, 1535, null);
    }
}
