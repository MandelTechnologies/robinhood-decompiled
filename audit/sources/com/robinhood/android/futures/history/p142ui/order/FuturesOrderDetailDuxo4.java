package com.robinhood.android.futures.history.p142ui.order;

import com.robinhood.android.futures.history.C17229R;
import com.robinhood.android.futures.history.extensions.UiFutureOrders;
import com.robinhood.android.futures.history.p142ui.order.OrderDetailViewState;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract3;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.p189db.FuturesOrder;
import com.robinhood.android.models.futures.p189db.FuturesOrderLeg;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: FuturesOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/order/OrderDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/history/ui/order/OrderDetailDataState;", "Lcom/robinhood/android/futures/history/ui/order/OrderDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.order.OrderDetailStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOrderDetailDuxo4 implements StateProvider<OrderDetailDataState, OrderDetailViewState> {
    public static final int $stable = 0;
    public static final FuturesOrderDetailDuxo4 INSTANCE = new FuturesOrderDetailDuxo4();

    private FuturesOrderDetailDuxo4() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OrderDetailViewState reduce(OrderDetailDataState dataState) {
        StringResource stringResourceInvoke;
        FuturesOrder order;
        FuturesOrderState orderState;
        FuturesOrder order2;
        Instant createdAt;
        LocalDate localDate$default;
        FuturesOrder order3;
        FuturesOrderState orderState2;
        OrderState commonState;
        String displayName;
        String expiration;
        String displaySymbol;
        List<FuturesOrderLeg> legs;
        FuturesOrderLeg futuresOrderLeg;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiFuturesOrder order4 = dataState.getOrder();
        String str = null;
        UUID contractId = (order4 == null || (legs = order4.getLegs()) == null || (futuresOrderLeg = legs.get(0)) == null) ? null : futuresOrderLeg.getContractId();
        FuturesContract contract = dataState.getContract();
        UUID productId = contract != null ? contract.getProductId() : null;
        FuturesContract contract2 = dataState.getContract();
        StringResource stringResourceInvoke2 = (contract2 == null || (displaySymbol = contract2.getDisplaySymbol()) == null) ? null : StringResource.INSTANCE.invoke(C17229R.string.futures_order_detail_view_contract_cta, displaySymbol);
        UiFuturesOrder order5 = dataState.getOrder();
        Integer numValueOf = order5 != null ? Integer.valueOf(UiFutureOrders.getLabel(order5)) : null;
        FuturesProduct product = dataState.getProduct();
        if (product == null || (displayName = product.getDisplayName()) == null) {
            stringResourceInvoke = null;
        } else {
            FuturesContract contract3 = dataState.getContract();
            stringResourceInvoke = (contract3 == null || (expiration = FuturesContract3.formatExpiration(contract3)) == null) ? null : StringResource.INSTANCE.invoke(C17229R.string.futures_order_detail_subheader, displayName, expiration);
        }
        StringResource queuedOrderLabel = dataState.getQueuedOrderLabel();
        UiFuturesOrder order6 = dataState.getOrder();
        Integer numValueOf2 = (order6 == null || (order3 = order6.getOrder()) == null || (orderState2 = order3.getOrderState()) == null || (commonState = orderState2.toCommonState()) == null) ? null : Integer.valueOf(OrderStates.getLabelResId(commonState));
        Integer timeInForceRes = dataState.getTimeInForceRes();
        UiFuturesOrder order7 = dataState.getOrder();
        if (order7 != null && (order2 = order7.getOrder()) != null && (createdAt = order2.getCreatedAt()) != null && (localDate$default = Instants.toLocalDate$default(createdAt, null, 1, null)) != null) {
            str = LocalDateFormatter.MEDIUM.format(localDate$default);
        }
        String str2 = str;
        String limitPriceStr = dataState.getLimitPriceStr();
        String stopPriceStr = dataState.getStopPriceStr();
        StringResource filledQuantity = dataState.getFilledQuantity();
        String filledTime = dataState.getFilledTime();
        String averageFilledPrice = dataState.getAverageFilledPrice();
        String executionPrice = dataState.getExecutionPrice();
        OrderDetailViewState.Fee realizedProfitOrLoss = dataState.getRealizedProfitOrLoss();
        UiFuturesOrder order8 = dataState.getOrder();
        return new OrderDetailViewState(contractId, productId, stringResourceInvoke2, numValueOf, stringResourceInvoke, queuedOrderLabel, numValueOf2, timeInForceRes, str2, limitPriceStr, stopPriceStr, filledQuantity, filledTime, averageFilledPrice, executionPrice, realizedProfitOrLoss, (order8 == null || (order = order8.getOrder()) == null || (orderState = order.getOrderState()) == null || !orderState.isCancellable()) ? false : true, dataState.getCancelInProgress(), dataState.getOtherFees(), dataState.getCommissionFee(), dataState.getTotalCostOrCredit(), dataState.getGoldSavings());
    }
}
