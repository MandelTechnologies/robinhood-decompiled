package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.models.p320db.Instrument;
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
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$1$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class OrderPriceDuxo2 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
    final /* synthetic */ Instrument $instrument;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderPriceDuxo2(Instrument instrument, Continuation<? super OrderPriceDuxo2> continuation) {
        super(2, continuation);
        this.$instrument = instrument;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderPriceDuxo2 orderPriceDuxo2 = new OrderPriceDuxo2(this.$instrument, continuation);
        orderPriceDuxo2.L$0 = obj;
        return orderPriceDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
        return ((OrderPriceDuxo2) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, null, this.$instrument, null, null, null, null, false, null, null, 2039, null);
    }
}
