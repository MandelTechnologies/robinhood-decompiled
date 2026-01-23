package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.StateProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.Monitoring;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class FuturesOrderFormStateProvider implements StateProvider<FuturesOrderFormDataState, FuturesOrderFormViewState> {
    public static final int $stable = 0;
    public static final FuturesOrderFormStateProvider INSTANCE = new FuturesOrderFormStateProvider();

    private FuturesOrderFormStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesOrderFormViewState reduce(FuturesOrderFormDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int orderTypeLabel = dataState.getOrderTypeLabel();
        FuturesOrderSide side = dataState.getSide();
        FuturesOrderFormDataState.FocusedText focusedText = dataState.getFocusedText();
        boolean showingTimeInForceSelector = dataState.getShowingTimeInForceSelector();
        FuturesOrderFormViewState.OrderFormContentData orderFormContentData = dataState.getOrderFormContentData();
        FuturesOrderFormViewState.OrderReceiptContentData orderReceiptContentData = dataState.getOrderReceiptContentData();
        OrderSubmissionState orderSubmissionState = dataState.getOrderSubmissionState();
        FuturesAccount account = dataState.getAccount();
        UUID id = account != null ? account.getId() : null;
        UiFuturesOrderContext orderContext = dataState.getOrderContext();
        Monitoring microgramState = dataState.getMicrogramState();
        UUID contractId = dataState.getContractId();
        FuturesContract contract = dataState.getContract();
        return new FuturesOrderFormViewState(orderTypeLabel, side, focusedText, showingTimeInForceSelector, orderFormContentData, orderReceiptContentData, id, orderContext, orderSubmissionState, microgramState, contractId, contract != null ? contract.getStreamingSymbol() : null, dataState.getSourceScreen(), dataState.getRefId(), dataState.getShowReviewAsLoading());
    }
}
