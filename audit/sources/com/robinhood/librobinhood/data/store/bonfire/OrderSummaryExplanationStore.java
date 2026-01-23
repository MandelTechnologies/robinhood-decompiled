package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.ordersummary.models.api.ApiOrderSummaryExplanation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSummaryExplanationStore.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationArgs;", "Lcom/robinhood/ordersummary/models/api/ApiOrderSummaryExplanation;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "lib-store-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OrderSummaryExplanationStore extends Store {
    private final Endpoint<OrderSummaryExplanationArgs, ApiOrderSummaryExplanation> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummaryExplanationStore(TradeEquityBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.endpoint = Endpoint.INSTANCE.createWithParams(new OrderSummaryExplanationStore2(bonfireApi, null), getLogoutKillswitch(), new OrderSummaryExplanationStore3(null), new OrderSummaryExplanationStore4(null), storeBundle.getClock());
    }

    public final Endpoint<OrderSummaryExplanationArgs, ApiOrderSummaryExplanation> getEndpoint() {
        return this.endpoint;
    }
}
