package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.ordersummary.models.api.ApiOrderSummaryExplanation;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderSummaryExplanationStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ordersummary/models/api/ApiOrderSummaryExplanation;", "args", "Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.OrderSummaryExplanationStore$endpoint$1", m3645f = "OrderSummaryExplanationStore.kt", m3646l = {19}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.OrderSummaryExplanationStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OrderSummaryExplanationStore2 extends ContinuationImpl7 implements Function2<OrderSummaryExplanationArgs, Continuation<? super ApiOrderSummaryExplanation>, Object> {
    final /* synthetic */ TradeEquityBonfireApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderSummaryExplanationStore2(TradeEquityBonfireApi tradeEquityBonfireApi, Continuation<? super OrderSummaryExplanationStore2> continuation) {
        super(2, continuation);
        this.$bonfireApi = tradeEquityBonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderSummaryExplanationStore2 orderSummaryExplanationStore2 = new OrderSummaryExplanationStore2(this.$bonfireApi, continuation);
        orderSummaryExplanationStore2.L$0 = obj;
        return orderSummaryExplanationStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OrderSummaryExplanationArgs orderSummaryExplanationArgs, Continuation<? super ApiOrderSummaryExplanation> continuation) {
        return ((OrderSummaryExplanationStore2) create(orderSummaryExplanationArgs, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OrderSummaryExplanationArgs orderSummaryExplanationArgs = (OrderSummaryExplanationArgs) this.L$0;
        TradeEquityBonfireApi tradeEquityBonfireApi = this.$bonfireApi;
        List<UUID> instrumentIds = orderSummaryExplanationArgs.getInstrumentIds();
        boolean zIsPresetPercentLimitOrder = orderSummaryExplanationArgs.isPresetPercentLimitOrder();
        BigDecimal presetPercentLimit = orderSummaryExplanationArgs.getPresetPercentLimit();
        this.label = 1;
        Object orderSummaryExplanation = tradeEquityBonfireApi.getOrderSummaryExplanation(instrumentIds, false, zIsPresetPercentLimitOrder, presetPercentLimit, this);
        return orderSummaryExplanation == coroutine_suspended ? coroutine_suspended : orderSummaryExplanation;
    }
}
