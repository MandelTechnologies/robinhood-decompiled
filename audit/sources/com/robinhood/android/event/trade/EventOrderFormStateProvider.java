package com.robinhood.android.event.trade;

import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor2;
import com.robinhood.android.eventcontracts.sharedeventui.EventContractStyle;
import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.StateProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventOrderFormStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/event/trade/EventOrderFormDataState;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState;", "<init>", "()V", "reduce", "dataState", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventOrderFormStateProvider implements StateProvider<EventOrderFormDataState, EventOrderFormViewState> {
    public static final int $stable = 0;
    public static final EventOrderFormStateProvider INSTANCE = new EventOrderFormStateProvider();

    private EventOrderFormStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public EventOrderFormViewState reduce(EventOrderFormDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID eventContractId = dataState.getEventContractId();
        EventOrderSide side = dataState.getSide();
        UUID refId = dataState.getRefId();
        FuturesAccount futuresAccount = dataState.getFuturesAccount();
        UiEventOrderContext orderContext = dataState.getOrderContext();
        OrderSubmissionState orderSubmissionState = dataState.getOrderSubmissionState();
        EventOrderFormViewState.OrderFormContentData orderFormContentData = dataState.getOrderFormContentData();
        OrderFormOrderType orderType = dataState.getOrderType();
        OrderFormFocusedField focusedField = dataState.getFocusedField();
        EventContract contract = dataState.getContract();
        return new EventOrderFormViewState(eventContractId, refId, futuresAccount, orderContext, orderFormContentData, side, orderType, focusedField, contract != null ? new EventContractStyle(DayNightColor2.getDayNightColor(contract), contract.getImageStyle()) : null, dataState.getReceiptData(), orderSubmissionState, EventOrderFormStateProvider2.createLoggingContext(dataState), dataState.getExchangeSource(), dataState.getFocusedField() == OrderFormFocusedField.NOTIONAL_AMOUNT || (dataState.getFocusedField() == OrderFormFocusedField.LIMIT_PRICE && !dataState.isInAutoInsertDecimalExperiment()), dataState.getSupportChangingOrderTypes(), dataState.getSubmissionPrice$feature_event_trade_externalDebug());
    }
}
