package com.robinhood.android.event.trade;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.event.trade.OrderSubmissionState;
import com.robinhood.android.event.trade.orderform.EventOrderFormScreen6;
import com.robinhood.android.eventcontracts.sharedeventui.EventContractStyle;
import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventOrderFormViewState.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003_`aB\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010O\u001a\u00020\u0010HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010R\u001a\u00020\u0016HÆ\u0003J\t\u0010S\u001a\u00020\u0018HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010U\u001a\u00020\u001cHÆ\u0003J\t\u0010V\u001a\u00020\u001cHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001fHÆ\u0003J·\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001J\u0013\u0010Y\u001a\u00020\u001c2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020^HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001d\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bE\u0010<R\u0011\u0010F\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<¨\u0006b"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState;", "", "eventContractId", "Ljava/util/UUID;", "orderRefId", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "candidateOrder", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "orderFormContentData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;", "orderSide", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "orderType", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "focusedField", "Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "tradeStyles", "Lcom/robinhood/android/eventcontracts/sharedeventui/EventContractStyle;", "receiptData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;", "orderSubmissionState", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "exchangeSource", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "showDelimiterOnNumpad", "", "allowChangingOrderType", "orderSubmissionPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;Lcom/robinhood/android/models/event/db/order/EventOrderSide;Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;Lcom/robinhood/android/event/trade/OrderFormFocusedField;Lcom/robinhood/android/eventcontracts/sharedeventui/EventContractStyle;Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;Lcom/robinhood/android/event/trade/OrderSubmissionState;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;ZZLjava/math/BigDecimal;)V", "getEventContractId", "()Ljava/util/UUID;", "getOrderRefId", "getFuturesAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getCandidateOrder", "()Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "getOrderFormContentData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;", "getOrderSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getOrderType", "()Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "getFocusedField", "()Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "getTradeStyles", "()Lcom/robinhood/android/eventcontracts/sharedeventui/EventContractStyle;", "getReceiptData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;", "getOrderSubmissionState", "()Lcom/robinhood/android/event/trade/OrderSubmissionState;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "getExchangeSource", "()Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "getShowDelimiterOnNumpad", "()Z", "getAllowChangingOrderType", "getOrderSubmissionPrice", "()Ljava/math/BigDecimal;", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getOrderFormState", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "showCloseAsBack", "getShowCloseAsBack", "interceptOnBackPressed", "getInterceptOnBackPressed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "", "toString", "", "ReceiptData", "OrderFormContentData", "PayoutData", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventOrderFormViewState {
    public static final int $stable = 8;
    private final boolean allowChangingOrderType;
    private final UiEventOrderContext candidateOrder;
    private final UUID eventContractId;
    private final ExchangeSource exchangeSource;
    private final OrderFormFocusedField focusedField;
    private final FuturesAccount futuresAccount;
    private final boolean interceptOnBackPressed;
    private final EventContractOrderContext loggingContext;
    private final OrderFormContentData orderFormContentData;
    private final OrderForm6 orderFormState;
    private final UUID orderRefId;
    private final EventOrderSide orderSide;
    private final BigDecimal orderSubmissionPrice;
    private final OrderSubmissionState orderSubmissionState;
    private final OrderFormOrderType orderType;
    private final ReceiptData receiptData;
    private final boolean showCloseAsBack;
    private final boolean showDelimiterOnNumpad;
    private final EventContractStyle tradeStyles;

    /* renamed from: component1, reason: from getter */
    public final UUID getEventContractId() {
        return this.eventContractId;
    }

    /* renamed from: component10, reason: from getter */
    public final ReceiptData getReceiptData() {
        return this.receiptData;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    /* renamed from: component12, reason: from getter */
    public final EventContractOrderContext getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component13, reason: from getter */
    public final ExchangeSource getExchangeSource() {
        return this.exchangeSource;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowDelimiterOnNumpad() {
        return this.showDelimiterOnNumpad;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getAllowChangingOrderType() {
        return this.allowChangingOrderType;
    }

    /* renamed from: component16, reason: from getter */
    public final BigDecimal getOrderSubmissionPrice() {
        return this.orderSubmissionPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderRefId() {
        return this.orderRefId;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final UiEventOrderContext getCandidateOrder() {
        return this.candidateOrder;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderFormContentData getOrderFormContentData() {
        return this.orderFormContentData;
    }

    /* renamed from: component6, reason: from getter */
    public final EventOrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component7, reason: from getter */
    public final OrderFormOrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component8, reason: from getter */
    public final OrderFormFocusedField getFocusedField() {
        return this.focusedField;
    }

    /* renamed from: component9, reason: from getter */
    public final EventContractStyle getTradeStyles() {
        return this.tradeStyles;
    }

    public final EventOrderFormViewState copy(UUID eventContractId, UUID orderRefId, FuturesAccount futuresAccount, UiEventOrderContext candidateOrder, OrderFormContentData orderFormContentData, EventOrderSide orderSide, OrderFormOrderType orderType, OrderFormFocusedField focusedField, EventContractStyle tradeStyles, ReceiptData receiptData, OrderSubmissionState orderSubmissionState, EventContractOrderContext loggingContext, ExchangeSource exchangeSource, boolean showDelimiterOnNumpad, boolean allowChangingOrderType, BigDecimal orderSubmissionPrice) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(orderRefId, "orderRefId");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        return new EventOrderFormViewState(eventContractId, orderRefId, futuresAccount, candidateOrder, orderFormContentData, orderSide, orderType, focusedField, tradeStyles, receiptData, orderSubmissionState, loggingContext, exchangeSource, showDelimiterOnNumpad, allowChangingOrderType, orderSubmissionPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventOrderFormViewState)) {
            return false;
        }
        EventOrderFormViewState eventOrderFormViewState = (EventOrderFormViewState) other;
        return Intrinsics.areEqual(this.eventContractId, eventOrderFormViewState.eventContractId) && Intrinsics.areEqual(this.orderRefId, eventOrderFormViewState.orderRefId) && Intrinsics.areEqual(this.futuresAccount, eventOrderFormViewState.futuresAccount) && Intrinsics.areEqual(this.candidateOrder, eventOrderFormViewState.candidateOrder) && Intrinsics.areEqual(this.orderFormContentData, eventOrderFormViewState.orderFormContentData) && this.orderSide == eventOrderFormViewState.orderSide && this.orderType == eventOrderFormViewState.orderType && this.focusedField == eventOrderFormViewState.focusedField && Intrinsics.areEqual(this.tradeStyles, eventOrderFormViewState.tradeStyles) && Intrinsics.areEqual(this.receiptData, eventOrderFormViewState.receiptData) && Intrinsics.areEqual(this.orderSubmissionState, eventOrderFormViewState.orderSubmissionState) && Intrinsics.areEqual(this.loggingContext, eventOrderFormViewState.loggingContext) && this.exchangeSource == eventOrderFormViewState.exchangeSource && this.showDelimiterOnNumpad == eventOrderFormViewState.showDelimiterOnNumpad && this.allowChangingOrderType == eventOrderFormViewState.allowChangingOrderType && Intrinsics.areEqual(this.orderSubmissionPrice, eventOrderFormViewState.orderSubmissionPrice);
    }

    public int hashCode() {
        int iHashCode = ((this.eventContractId.hashCode() * 31) + this.orderRefId.hashCode()) * 31;
        FuturesAccount futuresAccount = this.futuresAccount;
        int iHashCode2 = (iHashCode + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        UiEventOrderContext uiEventOrderContext = this.candidateOrder;
        int iHashCode3 = (((((iHashCode2 + (uiEventOrderContext == null ? 0 : uiEventOrderContext.hashCode())) * 31) + this.orderFormContentData.hashCode()) * 31) + this.orderSide.hashCode()) * 31;
        OrderFormOrderType orderFormOrderType = this.orderType;
        int iHashCode4 = (((iHashCode3 + (orderFormOrderType == null ? 0 : orderFormOrderType.hashCode())) * 31) + this.focusedField.hashCode()) * 31;
        EventContractStyle eventContractStyles = this.tradeStyles;
        int iHashCode5 = (iHashCode4 + (eventContractStyles == null ? 0 : eventContractStyles.hashCode())) * 31;
        ReceiptData receiptData = this.receiptData;
        int iHashCode6 = (((((iHashCode5 + (receiptData == null ? 0 : receiptData.hashCode())) * 31) + this.orderSubmissionState.hashCode()) * 31) + this.loggingContext.hashCode()) * 31;
        ExchangeSource exchangeSource = this.exchangeSource;
        int iHashCode7 = (((((iHashCode6 + (exchangeSource == null ? 0 : exchangeSource.hashCode())) * 31) + Boolean.hashCode(this.showDelimiterOnNumpad)) * 31) + Boolean.hashCode(this.allowChangingOrderType)) * 31;
        BigDecimal bigDecimal = this.orderSubmissionPrice;
        return iHashCode7 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public String toString() {
        return "EventOrderFormViewState(eventContractId=" + this.eventContractId + ", orderRefId=" + this.orderRefId + ", futuresAccount=" + this.futuresAccount + ", candidateOrder=" + this.candidateOrder + ", orderFormContentData=" + this.orderFormContentData + ", orderSide=" + this.orderSide + ", orderType=" + this.orderType + ", focusedField=" + this.focusedField + ", tradeStyles=" + this.tradeStyles + ", receiptData=" + this.receiptData + ", orderSubmissionState=" + this.orderSubmissionState + ", loggingContext=" + this.loggingContext + ", exchangeSource=" + this.exchangeSource + ", showDelimiterOnNumpad=" + this.showDelimiterOnNumpad + ", allowChangingOrderType=" + this.allowChangingOrderType + ", orderSubmissionPrice=" + this.orderSubmissionPrice + ")";
    }

    public EventOrderFormViewState(UUID eventContractId, UUID orderRefId, FuturesAccount futuresAccount, UiEventOrderContext uiEventOrderContext, OrderFormContentData orderFormContentData, EventOrderSide orderSide, OrderFormOrderType orderFormOrderType, OrderFormFocusedField focusedField, EventContractStyle eventContractStyles, ReceiptData receiptData, OrderSubmissionState orderSubmissionState, EventContractOrderContext loggingContext, ExchangeSource exchangeSource, boolean z, boolean z2, BigDecimal bigDecimal) {
        OrderForm6 orderForm6;
        boolean z3;
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(orderRefId, "orderRefId");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        this.eventContractId = eventContractId;
        this.orderRefId = orderRefId;
        this.futuresAccount = futuresAccount;
        this.candidateOrder = uiEventOrderContext;
        this.orderFormContentData = orderFormContentData;
        this.orderSide = orderSide;
        this.orderType = orderFormOrderType;
        this.focusedField = focusedField;
        this.tradeStyles = eventContractStyles;
        this.receiptData = receiptData;
        this.orderSubmissionState = orderSubmissionState;
        this.loggingContext = loggingContext;
        this.exchangeSource = exchangeSource;
        this.showDelimiterOnNumpad = z;
        this.allowChangingOrderType = z2;
        this.orderSubmissionPrice = bigDecimal;
        OrderSubmissionState.Editing editing = OrderSubmissionState.Editing.INSTANCE;
        if (Intrinsics.areEqual(orderSubmissionState, editing)) {
            orderForm6 = OrderForm6.EDITING;
        } else if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE)) {
            orderForm6 = OrderForm6.REVIEWING;
        } else {
            if (!(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
                throw new NoWhenBranchMatchedException();
            }
            OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result = ((OrderSubmissionState.Submitting) orderSubmissionState).getResult();
            if (result instanceof OrderSubmissionManager.Result.Failure) {
                orderForm6 = OrderForm6.EDITING;
            } else if (result instanceof OrderSubmissionManager.Result.Sending) {
                orderForm6 = OrderForm6.SUBMITTING;
            } else {
                if (!(result instanceof OrderSubmissionManager.Result.Submitted)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) orderSubmissionState).getResult()).getTriggersConfirmation() || ((OrderSubmissionManager.Result.Submitted) ((OrderSubmissionState.Submitting) orderSubmissionState).getResult()).getHasTriggeredConfirmation()) {
                    orderForm6 = OrderForm6.CONFIRMATION;
                } else {
                    orderForm6 = OrderForm6.SUBMITTED;
                }
            }
        }
        this.orderFormState = orderForm6;
        this.showCloseAsBack = Intrinsics.areEqual(orderSubmissionState, editing);
        if (Intrinsics.areEqual(orderSubmissionState, editing)) {
            z3 = false;
        } else {
            if (!Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE) && !(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = true;
        }
        this.interceptOnBackPressed = z3;
    }

    public final UUID getEventContractId() {
        return this.eventContractId;
    }

    public final UUID getOrderRefId() {
        return this.orderRefId;
    }

    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    public final UiEventOrderContext getCandidateOrder() {
        return this.candidateOrder;
    }

    public final OrderFormContentData getOrderFormContentData() {
        return this.orderFormContentData;
    }

    public final EventOrderSide getOrderSide() {
        return this.orderSide;
    }

    public final OrderFormOrderType getOrderType() {
        return this.orderType;
    }

    public final OrderFormFocusedField getFocusedField() {
        return this.focusedField;
    }

    public final EventContractStyle getTradeStyles() {
        return this.tradeStyles;
    }

    public final ReceiptData getReceiptData() {
        return this.receiptData;
    }

    public /* synthetic */ EventOrderFormViewState(UUID uuid, UUID uuid2, FuturesAccount futuresAccount, UiEventOrderContext uiEventOrderContext, OrderFormContentData orderFormContentData, EventOrderSide eventOrderSide, OrderFormOrderType orderFormOrderType, OrderFormFocusedField orderFormFocusedField, EventContractStyle eventContractStyles, ReceiptData receiptData, OrderSubmissionState orderSubmissionState, EventContractOrderContext eventContractOrderContext, ExchangeSource exchangeSource, boolean z, boolean z2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, futuresAccount, uiEventOrderContext, orderFormContentData, eventOrderSide, orderFormOrderType, orderFormFocusedField, (i & 256) != 0 ? null : eventContractStyles, (i & 512) != 0 ? null : receiptData, (i & 1024) != 0 ? OrderSubmissionState.Editing.INSTANCE : orderSubmissionState, eventContractOrderContext, exchangeSource, z, z2, (i & 32768) != 0 ? null : bigDecimal);
    }

    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    public final EventContractOrderContext getLoggingContext() {
        return this.loggingContext;
    }

    public final ExchangeSource getExchangeSource() {
        return this.exchangeSource;
    }

    public final boolean getShowDelimiterOnNumpad() {
        return this.showDelimiterOnNumpad;
    }

    public final boolean getAllowChangingOrderType() {
        return this.allowChangingOrderType;
    }

    public final BigDecimal getOrderSubmissionPrice() {
        return this.orderSubmissionPrice;
    }

    /* compiled from: EventOrderFormViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¡\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;", "", "hideHeroElements", "", "centerDisplayName", "", "cardTitle", "Lcom/robinhood/utils/resource/StringResource;", "cardDetail", "payoutData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "estimatedCostOrCreditLabel", "estimatedCostOrCredit", "filledQuantity", "showFilledQuantity", "totalCost", "amountReturned", "quickResubmit", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "comboLegDisplay", "<init>", "(ZLjava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;Ljava/lang/String;)V", "getHideHeroElements", "()Z", "getCenterDisplayName", "()Ljava/lang/String;", "getCardTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getCardDetail", "getPayoutData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "getEstimatedCostOrCreditLabel", "getEstimatedCostOrCredit", "getFilledQuantity", "getShowFilledQuantity", "getTotalCost", "getAmountReturned", "getQuickResubmit", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "getComboLegDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "QuickResubmit", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReceiptData {
        public static final int $stable = StringResource.$stable;
        private final String amountReturned;
        private final StringResource cardDetail;
        private final StringResource cardTitle;
        private final String centerDisplayName;
        private final String comboLegDisplay;
        private final StringResource estimatedCostOrCredit;
        private final StringResource estimatedCostOrCreditLabel;
        private final StringResource filledQuantity;
        private final boolean hideHeroElements;
        private final PayoutData payoutData;
        private final QuickResubmit quickResubmit;
        private final boolean showFilledQuantity;
        private final String totalCost;

        public static /* synthetic */ ReceiptData copy$default(ReceiptData receiptData, boolean z, String str, StringResource stringResource, StringResource stringResource2, PayoutData payoutData, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, boolean z2, String str2, String str3, QuickResubmit quickResubmit, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = receiptData.hideHeroElements;
            }
            return receiptData.copy(z, (i & 2) != 0 ? receiptData.centerDisplayName : str, (i & 4) != 0 ? receiptData.cardTitle : stringResource, (i & 8) != 0 ? receiptData.cardDetail : stringResource2, (i & 16) != 0 ? receiptData.payoutData : payoutData, (i & 32) != 0 ? receiptData.estimatedCostOrCreditLabel : stringResource3, (i & 64) != 0 ? receiptData.estimatedCostOrCredit : stringResource4, (i & 128) != 0 ? receiptData.filledQuantity : stringResource5, (i & 256) != 0 ? receiptData.showFilledQuantity : z2, (i & 512) != 0 ? receiptData.totalCost : str2, (i & 1024) != 0 ? receiptData.amountReturned : str3, (i & 2048) != 0 ? receiptData.quickResubmit : quickResubmit, (i & 4096) != 0 ? receiptData.comboLegDisplay : str4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHideHeroElements() {
            return this.hideHeroElements;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTotalCost() {
            return this.totalCost;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAmountReturned() {
            return this.amountReturned;
        }

        /* renamed from: component12, reason: from getter */
        public final QuickResubmit getQuickResubmit() {
            return this.quickResubmit;
        }

        /* renamed from: component13, reason: from getter */
        public final String getComboLegDisplay() {
            return this.comboLegDisplay;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCenterDisplayName() {
            return this.centerDisplayName;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getCardTitle() {
            return this.cardTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getCardDetail() {
            return this.cardDetail;
        }

        /* renamed from: component5, reason: from getter */
        public final PayoutData getPayoutData() {
            return this.payoutData;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getEstimatedCostOrCreditLabel() {
            return this.estimatedCostOrCreditLabel;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getEstimatedCostOrCredit() {
            return this.estimatedCostOrCredit;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getFilledQuantity() {
            return this.filledQuantity;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowFilledQuantity() {
            return this.showFilledQuantity;
        }

        public final ReceiptData copy(boolean hideHeroElements, String centerDisplayName, StringResource cardTitle, StringResource cardDetail, PayoutData payoutData, StringResource estimatedCostOrCreditLabel, StringResource estimatedCostOrCredit, StringResource filledQuantity, boolean showFilledQuantity, String totalCost, String amountReturned, QuickResubmit quickResubmit, String comboLegDisplay) {
            return new ReceiptData(hideHeroElements, centerDisplayName, cardTitle, cardDetail, payoutData, estimatedCostOrCreditLabel, estimatedCostOrCredit, filledQuantity, showFilledQuantity, totalCost, amountReturned, quickResubmit, comboLegDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReceiptData)) {
                return false;
            }
            ReceiptData receiptData = (ReceiptData) other;
            return this.hideHeroElements == receiptData.hideHeroElements && Intrinsics.areEqual(this.centerDisplayName, receiptData.centerDisplayName) && Intrinsics.areEqual(this.cardTitle, receiptData.cardTitle) && Intrinsics.areEqual(this.cardDetail, receiptData.cardDetail) && Intrinsics.areEqual(this.payoutData, receiptData.payoutData) && Intrinsics.areEqual(this.estimatedCostOrCreditLabel, receiptData.estimatedCostOrCreditLabel) && Intrinsics.areEqual(this.estimatedCostOrCredit, receiptData.estimatedCostOrCredit) && Intrinsics.areEqual(this.filledQuantity, receiptData.filledQuantity) && this.showFilledQuantity == receiptData.showFilledQuantity && Intrinsics.areEqual(this.totalCost, receiptData.totalCost) && Intrinsics.areEqual(this.amountReturned, receiptData.amountReturned) && Intrinsics.areEqual(this.quickResubmit, receiptData.quickResubmit) && Intrinsics.areEqual(this.comboLegDisplay, receiptData.comboLegDisplay);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.hideHeroElements) * 31;
            String str = this.centerDisplayName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            StringResource stringResource = this.cardTitle;
            int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            StringResource stringResource2 = this.cardDetail;
            int iHashCode4 = (iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
            PayoutData payoutData = this.payoutData;
            int iHashCode5 = (iHashCode4 + (payoutData == null ? 0 : payoutData.hashCode())) * 31;
            StringResource stringResource3 = this.estimatedCostOrCreditLabel;
            int iHashCode6 = (iHashCode5 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
            StringResource stringResource4 = this.estimatedCostOrCredit;
            int iHashCode7 = (iHashCode6 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
            StringResource stringResource5 = this.filledQuantity;
            int iHashCode8 = (((iHashCode7 + (stringResource5 == null ? 0 : stringResource5.hashCode())) * 31) + Boolean.hashCode(this.showFilledQuantity)) * 31;
            String str2 = this.totalCost;
            int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.amountReturned;
            int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            QuickResubmit quickResubmit = this.quickResubmit;
            int iHashCode11 = (iHashCode10 + (quickResubmit == null ? 0 : quickResubmit.hashCode())) * 31;
            String str4 = this.comboLegDisplay;
            return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "ReceiptData(hideHeroElements=" + this.hideHeroElements + ", centerDisplayName=" + this.centerDisplayName + ", cardTitle=" + this.cardTitle + ", cardDetail=" + this.cardDetail + ", payoutData=" + this.payoutData + ", estimatedCostOrCreditLabel=" + this.estimatedCostOrCreditLabel + ", estimatedCostOrCredit=" + this.estimatedCostOrCredit + ", filledQuantity=" + this.filledQuantity + ", showFilledQuantity=" + this.showFilledQuantity + ", totalCost=" + this.totalCost + ", amountReturned=" + this.amountReturned + ", quickResubmit=" + this.quickResubmit + ", comboLegDisplay=" + this.comboLegDisplay + ")";
        }

        public ReceiptData(boolean z, String str, StringResource stringResource, StringResource stringResource2, PayoutData payoutData, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, boolean z2, String str2, String str3, QuickResubmit quickResubmit, String str4) {
            this.hideHeroElements = z;
            this.centerDisplayName = str;
            this.cardTitle = stringResource;
            this.cardDetail = stringResource2;
            this.payoutData = payoutData;
            this.estimatedCostOrCreditLabel = stringResource3;
            this.estimatedCostOrCredit = stringResource4;
            this.filledQuantity = stringResource5;
            this.showFilledQuantity = z2;
            this.totalCost = str2;
            this.amountReturned = str3;
            this.quickResubmit = quickResubmit;
            this.comboLegDisplay = str4;
        }

        public final boolean getHideHeroElements() {
            return this.hideHeroElements;
        }

        public final String getCenterDisplayName() {
            return this.centerDisplayName;
        }

        public final StringResource getCardTitle() {
            return this.cardTitle;
        }

        public final StringResource getCardDetail() {
            return this.cardDetail;
        }

        public final PayoutData getPayoutData() {
            return this.payoutData;
        }

        public final StringResource getEstimatedCostOrCreditLabel() {
            return this.estimatedCostOrCreditLabel;
        }

        public final StringResource getEstimatedCostOrCredit() {
            return this.estimatedCostOrCredit;
        }

        public final StringResource getFilledQuantity() {
            return this.filledQuantity;
        }

        public final boolean getShowFilledQuantity() {
            return this.showFilledQuantity;
        }

        public final String getTotalCost() {
            return this.totalCost;
        }

        public final String getAmountReturned() {
            return this.amountReturned;
        }

        public final QuickResubmit getQuickResubmit() {
            return this.quickResubmit;
        }

        public final String getComboLegDisplay() {
            return this.comboLegDisplay;
        }

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/utils/resource/StringResource;", "getCta", "()Lcom/robinhood/utils/resource/StringResource;", "Quantity", "Notional", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit$Notional;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit$Quantity;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface QuickResubmit {
            StringResource getCta();

            /* compiled from: EventOrderFormViewState.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit$Quantity;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "quantity", "", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ILcom/robinhood/utils/resource/StringResource;)V", "getQuantity", "()I", "getCta", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Quantity implements QuickResubmit {
                public static final int $stable = StringResource.$stable;
                private final StringResource cta;
                private final int quantity;

                public static /* synthetic */ Quantity copy$default(Quantity quantity, int i, StringResource stringResource, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = quantity.quantity;
                    }
                    if ((i2 & 2) != 0) {
                        stringResource = quantity.cta;
                    }
                    return quantity.copy(i, stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final int getQuantity() {
                    return this.quantity;
                }

                /* renamed from: component2, reason: from getter */
                public final StringResource getCta() {
                    return this.cta;
                }

                public final Quantity copy(int quantity, StringResource cta) {
                    Intrinsics.checkNotNullParameter(cta, "cta");
                    return new Quantity(quantity, cta);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Quantity)) {
                        return false;
                    }
                    Quantity quantity = (Quantity) other;
                    return this.quantity == quantity.quantity && Intrinsics.areEqual(this.cta, quantity.cta);
                }

                public int hashCode() {
                    return (Integer.hashCode(this.quantity) * 31) + this.cta.hashCode();
                }

                public String toString() {
                    return "Quantity(quantity=" + this.quantity + ", cta=" + this.cta + ")";
                }

                public Quantity(int i, StringResource cta) {
                    Intrinsics.checkNotNullParameter(cta, "cta");
                    this.quantity = i;
                    this.cta = cta;
                }

                public final int getQuantity() {
                    return this.quantity;
                }

                @Override // com.robinhood.android.event.trade.EventOrderFormViewState.ReceiptData.QuickResubmit
                public StringResource getCta() {
                    return this.cta;
                }
            }

            /* compiled from: EventOrderFormViewState.kt */
            @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit$Notional;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "notionalAmount", "Ljava/math/BigDecimal;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/utils/resource/StringResource;)V", "getNotionalAmount", "()Ljava/math/BigDecimal;", "getCta", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Notional implements QuickResubmit {
                public static final int $stable = 8;
                private final StringResource cta;
                private final BigDecimal notionalAmount;

                public static /* synthetic */ Notional copy$default(Notional notional, BigDecimal bigDecimal, StringResource stringResource, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bigDecimal = notional.notionalAmount;
                    }
                    if ((i & 2) != 0) {
                        stringResource = notional.cta;
                    }
                    return notional.copy(bigDecimal, stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final BigDecimal getNotionalAmount() {
                    return this.notionalAmount;
                }

                /* renamed from: component2, reason: from getter */
                public final StringResource getCta() {
                    return this.cta;
                }

                public final Notional copy(BigDecimal notionalAmount, StringResource cta) {
                    Intrinsics.checkNotNullParameter(notionalAmount, "notionalAmount");
                    Intrinsics.checkNotNullParameter(cta, "cta");
                    return new Notional(notionalAmount, cta);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Notional)) {
                        return false;
                    }
                    Notional notional = (Notional) other;
                    return Intrinsics.areEqual(this.notionalAmount, notional.notionalAmount) && Intrinsics.areEqual(this.cta, notional.cta);
                }

                public int hashCode() {
                    return (this.notionalAmount.hashCode() * 31) + this.cta.hashCode();
                }

                public String toString() {
                    return "Notional(notionalAmount=" + this.notionalAmount + ", cta=" + this.cta + ")";
                }

                public Notional(BigDecimal notionalAmount, StringResource cta) {
                    Intrinsics.checkNotNullParameter(notionalAmount, "notionalAmount");
                    Intrinsics.checkNotNullParameter(cta, "cta");
                    this.notionalAmount = notionalAmount;
                    this.cta = cta;
                }

                public final BigDecimal getNotionalAmount() {
                    return this.notionalAmount;
                }

                @Override // com.robinhood.android.event.trade.EventOrderFormViewState.ReceiptData.QuickResubmit
                public StringResource getCta() {
                    return this.cta;
                }
            }
        }
    }

    /* compiled from: EventOrderFormViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004789:Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u0085\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nHÆ\u0001J\u0013\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001e¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;", "", "individualAccountNumber", "", "contractId", "Ljava/util/UUID;", "topBarTitle", "Lcom/robinhood/utils/resource/StringResource;", "orderSummaryString", "showPriceInfoByOrderSummary", "", "quantityBasedData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;", "notionalBasedData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;", "orderTypeDisplay", "continueButtonStyle", "Lcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;", "isContinueButtonEnabled", "isContinueButtonLoading", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;ZZ)V", "getIndividualAccountNumber", "()Ljava/lang/String;", "getContractId", "()Ljava/util/UUID;", "getTopBarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getOrderSummaryString", "getShowPriceInfoByOrderSummary", "()Z", "getQuantityBasedData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;", "getNotionalBasedData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;", "getOrderTypeDisplay", "getContinueButtonStyle", "()Lcom/robinhood/android/event/trade/orderform/OrderFormContinueButtonStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "QuantityBasedData", "NotionalBasedData", "EditingSubTextState", "PriceData", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderFormContentData {
        public static final int $stable = 8;
        private final EventOrderFormScreen6 continueButtonStyle;
        private final UUID contractId;
        private final String individualAccountNumber;
        private final boolean isContinueButtonEnabled;
        private final boolean isContinueButtonLoading;
        private final NotionalBasedData notionalBasedData;
        private final StringResource orderSummaryString;
        private final StringResource orderTypeDisplay;
        private final QuantityBasedData quantityBasedData;
        private final boolean showPriceInfoByOrderSummary;
        private final StringResource topBarTitle;

        public static /* synthetic */ OrderFormContentData copy$default(OrderFormContentData orderFormContentData, String str, UUID uuid, StringResource stringResource, StringResource stringResource2, boolean z, QuantityBasedData quantityBasedData, NotionalBasedData notionalBasedData, StringResource stringResource3, EventOrderFormScreen6 eventOrderFormScreen6, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = orderFormContentData.individualAccountNumber;
            }
            if ((i & 2) != 0) {
                uuid = orderFormContentData.contractId;
            }
            if ((i & 4) != 0) {
                stringResource = orderFormContentData.topBarTitle;
            }
            if ((i & 8) != 0) {
                stringResource2 = orderFormContentData.orderSummaryString;
            }
            if ((i & 16) != 0) {
                z = orderFormContentData.showPriceInfoByOrderSummary;
            }
            if ((i & 32) != 0) {
                quantityBasedData = orderFormContentData.quantityBasedData;
            }
            if ((i & 64) != 0) {
                notionalBasedData = orderFormContentData.notionalBasedData;
            }
            if ((i & 128) != 0) {
                stringResource3 = orderFormContentData.orderTypeDisplay;
            }
            if ((i & 256) != 0) {
                eventOrderFormScreen6 = orderFormContentData.continueButtonStyle;
            }
            if ((i & 512) != 0) {
                z2 = orderFormContentData.isContinueButtonEnabled;
            }
            if ((i & 1024) != 0) {
                z3 = orderFormContentData.isContinueButtonLoading;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            StringResource stringResource4 = stringResource3;
            EventOrderFormScreen6 eventOrderFormScreen62 = eventOrderFormScreen6;
            QuantityBasedData quantityBasedData2 = quantityBasedData;
            NotionalBasedData notionalBasedData2 = notionalBasedData;
            boolean z6 = z;
            StringResource stringResource5 = stringResource;
            return orderFormContentData.copy(str, uuid, stringResource5, stringResource2, z6, quantityBasedData2, notionalBasedData2, stringResource4, eventOrderFormScreen62, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIndividualAccountNumber() {
            return this.individualAccountNumber;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsContinueButtonLoading() {
            return this.isContinueButtonLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getTopBarTitle() {
            return this.topBarTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getOrderSummaryString() {
            return this.orderSummaryString;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShowPriceInfoByOrderSummary() {
            return this.showPriceInfoByOrderSummary;
        }

        /* renamed from: component6, reason: from getter */
        public final QuantityBasedData getQuantityBasedData() {
            return this.quantityBasedData;
        }

        /* renamed from: component7, reason: from getter */
        public final NotionalBasedData getNotionalBasedData() {
            return this.notionalBasedData;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getOrderTypeDisplay() {
            return this.orderTypeDisplay;
        }

        /* renamed from: component9, reason: from getter */
        public final EventOrderFormScreen6 getContinueButtonStyle() {
            return this.continueButtonStyle;
        }

        public final OrderFormContentData copy(String individualAccountNumber, UUID contractId, StringResource topBarTitle, StringResource orderSummaryString, boolean showPriceInfoByOrderSummary, QuantityBasedData quantityBasedData, NotionalBasedData notionalBasedData, StringResource orderTypeDisplay, EventOrderFormScreen6 continueButtonStyle, boolean isContinueButtonEnabled, boolean isContinueButtonLoading) {
            Intrinsics.checkNotNullParameter(continueButtonStyle, "continueButtonStyle");
            return new OrderFormContentData(individualAccountNumber, contractId, topBarTitle, orderSummaryString, showPriceInfoByOrderSummary, quantityBasedData, notionalBasedData, orderTypeDisplay, continueButtonStyle, isContinueButtonEnabled, isContinueButtonLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderFormContentData)) {
                return false;
            }
            OrderFormContentData orderFormContentData = (OrderFormContentData) other;
            return Intrinsics.areEqual(this.individualAccountNumber, orderFormContentData.individualAccountNumber) && Intrinsics.areEqual(this.contractId, orderFormContentData.contractId) && Intrinsics.areEqual(this.topBarTitle, orderFormContentData.topBarTitle) && Intrinsics.areEqual(this.orderSummaryString, orderFormContentData.orderSummaryString) && this.showPriceInfoByOrderSummary == orderFormContentData.showPriceInfoByOrderSummary && Intrinsics.areEqual(this.quantityBasedData, orderFormContentData.quantityBasedData) && Intrinsics.areEqual(this.notionalBasedData, orderFormContentData.notionalBasedData) && Intrinsics.areEqual(this.orderTypeDisplay, orderFormContentData.orderTypeDisplay) && this.continueButtonStyle == orderFormContentData.continueButtonStyle && this.isContinueButtonEnabled == orderFormContentData.isContinueButtonEnabled && this.isContinueButtonLoading == orderFormContentData.isContinueButtonLoading;
        }

        public int hashCode() {
            String str = this.individualAccountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UUID uuid = this.contractId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            StringResource stringResource = this.topBarTitle;
            int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            StringResource stringResource2 = this.orderSummaryString;
            int iHashCode4 = (((iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + Boolean.hashCode(this.showPriceInfoByOrderSummary)) * 31;
            QuantityBasedData quantityBasedData = this.quantityBasedData;
            int iHashCode5 = (iHashCode4 + (quantityBasedData == null ? 0 : quantityBasedData.hashCode())) * 31;
            NotionalBasedData notionalBasedData = this.notionalBasedData;
            int iHashCode6 = (iHashCode5 + (notionalBasedData == null ? 0 : notionalBasedData.hashCode())) * 31;
            StringResource stringResource3 = this.orderTypeDisplay;
            return ((((((iHashCode6 + (stringResource3 != null ? stringResource3.hashCode() : 0)) * 31) + this.continueButtonStyle.hashCode()) * 31) + Boolean.hashCode(this.isContinueButtonEnabled)) * 31) + Boolean.hashCode(this.isContinueButtonLoading);
        }

        public String toString() {
            return "OrderFormContentData(individualAccountNumber=" + this.individualAccountNumber + ", contractId=" + this.contractId + ", topBarTitle=" + this.topBarTitle + ", orderSummaryString=" + this.orderSummaryString + ", showPriceInfoByOrderSummary=" + this.showPriceInfoByOrderSummary + ", quantityBasedData=" + this.quantityBasedData + ", notionalBasedData=" + this.notionalBasedData + ", orderTypeDisplay=" + this.orderTypeDisplay + ", continueButtonStyle=" + this.continueButtonStyle + ", isContinueButtonEnabled=" + this.isContinueButtonEnabled + ", isContinueButtonLoading=" + this.isContinueButtonLoading + ")";
        }

        public OrderFormContentData(String str, UUID uuid, StringResource stringResource, StringResource stringResource2, boolean z, QuantityBasedData quantityBasedData, NotionalBasedData notionalBasedData, StringResource stringResource3, EventOrderFormScreen6 continueButtonStyle, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(continueButtonStyle, "continueButtonStyle");
            this.individualAccountNumber = str;
            this.contractId = uuid;
            this.topBarTitle = stringResource;
            this.orderSummaryString = stringResource2;
            this.showPriceInfoByOrderSummary = z;
            this.quantityBasedData = quantityBasedData;
            this.notionalBasedData = notionalBasedData;
            this.orderTypeDisplay = stringResource3;
            this.continueButtonStyle = continueButtonStyle;
            this.isContinueButtonEnabled = z2;
            this.isContinueButtonLoading = z3;
        }

        public final String getIndividualAccountNumber() {
            return this.individualAccountNumber;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final StringResource getTopBarTitle() {
            return this.topBarTitle;
        }

        public final StringResource getOrderSummaryString() {
            return this.orderSummaryString;
        }

        public final boolean getShowPriceInfoByOrderSummary() {
            return this.showPriceInfoByOrderSummary;
        }

        public final QuantityBasedData getQuantityBasedData() {
            return this.quantityBasedData;
        }

        public final NotionalBasedData getNotionalBasedData() {
            return this.notionalBasedData;
        }

        public final StringResource getOrderTypeDisplay() {
            return this.orderTypeDisplay;
        }

        public final EventOrderFormScreen6 getContinueButtonStyle() {
            return this.continueButtonStyle;
        }

        public final boolean isContinueButtonEnabled() {
            return this.isContinueButtonEnabled;
        }

        public final boolean isContinueButtonLoading() {
            return this.isContinueButtonLoading;
        }

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001NB£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001aHÆ\u0003JÇ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\u0013\u0010I\u001a\u00020\f2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00105¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;", "", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "title", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData$Title;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "quantityText", "Landroidx/compose/ui/text/input/TextFieldValue;", "quantitySubtitle", "quantityUseSecondaryColor", "", "isQuantityEnabled", "priceData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$PriceData;", "timeInForceDisplay", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "canEditTimeInForce", "gtdTimeDisplay", "estimatedCostOrCredit", "feesDisplay", "payoutData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "estimatedCostOrCreditLabel", "bidDisplay", "", "askDisplay", "<init>", "(Lcom/robinhood/android/models/event/db/order/EventOrderSide;Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData$Title;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/text/input/TextFieldValue;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$PriceData;Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;)V", "getSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getTitle", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData$Title;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getQuantityText", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getQuantitySubtitle", "getQuantityUseSecondaryColor", "()Z", "getPriceData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$PriceData;", "getTimeInForceDisplay", "()Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "getCanEditTimeInForce", "getGtdTimeDisplay", "getEstimatedCostOrCredit", "getFeesDisplay", "getPayoutData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "getEstimatedCostOrCreditLabel", "getBidDisplay", "()Ljava/lang/String;", "getAskDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "Title", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuantityBasedData {
            public static final int $stable = StringResource.$stable;
            private final String askDisplay;
            private final String bidDisplay;
            private final boolean canEditTimeInForce;
            private final StringResource estimatedCostOrCredit;
            private final StringResource estimatedCostOrCreditLabel;
            private final StringResource feesDisplay;
            private final StringResource gtdTimeDisplay;
            private final boolean isQuantityEnabled;
            private final PayoutData payoutData;
            private final PriceData priceData;
            private final StringResource quantitySubtitle;
            private final TextFieldValue quantityText;
            private final boolean quantityUseSecondaryColor;
            private final EventOrderSide side;
            private final StringResource subtitle;
            private final OrderFormTimeInForce timeInForceDisplay;
            private final Title title;

            public static /* synthetic */ QuantityBasedData copy$default(QuantityBasedData quantityBasedData, EventOrderSide eventOrderSide, Title title, StringResource stringResource, TextFieldValue textFieldValue, StringResource stringResource2, boolean z, boolean z2, PriceData priceData, OrderFormTimeInForce orderFormTimeInForce, boolean z3, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, PayoutData payoutData, StringResource stringResource6, String str, String str2, int i, Object obj) {
                String str3;
                String str4;
                EventOrderSide eventOrderSide2;
                QuantityBasedData quantityBasedData2;
                StringResource stringResource7;
                Title title2;
                StringResource stringResource8;
                TextFieldValue textFieldValue2;
                StringResource stringResource9;
                boolean z4;
                boolean z5;
                PriceData priceData2;
                OrderFormTimeInForce orderFormTimeInForce2;
                boolean z6;
                StringResource stringResource10;
                StringResource stringResource11;
                StringResource stringResource12;
                PayoutData payoutData2;
                EventOrderSide eventOrderSide3 = (i & 1) != 0 ? quantityBasedData.side : eventOrderSide;
                Title title3 = (i & 2) != 0 ? quantityBasedData.title : title;
                StringResource stringResource13 = (i & 4) != 0 ? quantityBasedData.subtitle : stringResource;
                TextFieldValue textFieldValue3 = (i & 8) != 0 ? quantityBasedData.quantityText : textFieldValue;
                StringResource stringResource14 = (i & 16) != 0 ? quantityBasedData.quantitySubtitle : stringResource2;
                boolean z7 = (i & 32) != 0 ? quantityBasedData.quantityUseSecondaryColor : z;
                boolean z8 = (i & 64) != 0 ? quantityBasedData.isQuantityEnabled : z2;
                PriceData priceData3 = (i & 128) != 0 ? quantityBasedData.priceData : priceData;
                OrderFormTimeInForce orderFormTimeInForce3 = (i & 256) != 0 ? quantityBasedData.timeInForceDisplay : orderFormTimeInForce;
                boolean z9 = (i & 512) != 0 ? quantityBasedData.canEditTimeInForce : z3;
                StringResource stringResource15 = (i & 1024) != 0 ? quantityBasedData.gtdTimeDisplay : stringResource3;
                StringResource stringResource16 = (i & 2048) != 0 ? quantityBasedData.estimatedCostOrCredit : stringResource4;
                StringResource stringResource17 = (i & 4096) != 0 ? quantityBasedData.feesDisplay : stringResource5;
                PayoutData payoutData3 = (i & 8192) != 0 ? quantityBasedData.payoutData : payoutData;
                EventOrderSide eventOrderSide4 = eventOrderSide3;
                StringResource stringResource18 = (i & 16384) != 0 ? quantityBasedData.estimatedCostOrCreditLabel : stringResource6;
                String str5 = (i & 32768) != 0 ? quantityBasedData.bidDisplay : str;
                if ((i & 65536) != 0) {
                    str4 = str5;
                    str3 = quantityBasedData.askDisplay;
                    stringResource7 = stringResource18;
                    title2 = title3;
                    stringResource8 = stringResource13;
                    textFieldValue2 = textFieldValue3;
                    stringResource9 = stringResource14;
                    z4 = z7;
                    z5 = z8;
                    priceData2 = priceData3;
                    orderFormTimeInForce2 = orderFormTimeInForce3;
                    z6 = z9;
                    stringResource10 = stringResource15;
                    stringResource11 = stringResource16;
                    stringResource12 = stringResource17;
                    payoutData2 = payoutData3;
                    eventOrderSide2 = eventOrderSide4;
                    quantityBasedData2 = quantityBasedData;
                } else {
                    str3 = str2;
                    str4 = str5;
                    eventOrderSide2 = eventOrderSide4;
                    quantityBasedData2 = quantityBasedData;
                    stringResource7 = stringResource18;
                    title2 = title3;
                    stringResource8 = stringResource13;
                    textFieldValue2 = textFieldValue3;
                    stringResource9 = stringResource14;
                    z4 = z7;
                    z5 = z8;
                    priceData2 = priceData3;
                    orderFormTimeInForce2 = orderFormTimeInForce3;
                    z6 = z9;
                    stringResource10 = stringResource15;
                    stringResource11 = stringResource16;
                    stringResource12 = stringResource17;
                    payoutData2 = payoutData3;
                }
                return quantityBasedData2.copy(eventOrderSide2, title2, stringResource8, textFieldValue2, stringResource9, z4, z5, priceData2, orderFormTimeInForce2, z6, stringResource10, stringResource11, stringResource12, payoutData2, stringResource7, str4, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final EventOrderSide getSide() {
                return this.side;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getCanEditTimeInForce() {
                return this.canEditTimeInForce;
            }

            /* renamed from: component11, reason: from getter */
            public final StringResource getGtdTimeDisplay() {
                return this.gtdTimeDisplay;
            }

            /* renamed from: component12, reason: from getter */
            public final StringResource getEstimatedCostOrCredit() {
                return this.estimatedCostOrCredit;
            }

            /* renamed from: component13, reason: from getter */
            public final StringResource getFeesDisplay() {
                return this.feesDisplay;
            }

            /* renamed from: component14, reason: from getter */
            public final PayoutData getPayoutData() {
                return this.payoutData;
            }

            /* renamed from: component15, reason: from getter */
            public final StringResource getEstimatedCostOrCreditLabel() {
                return this.estimatedCostOrCreditLabel;
            }

            /* renamed from: component16, reason: from getter */
            public final String getBidDisplay() {
                return this.bidDisplay;
            }

            /* renamed from: component17, reason: from getter */
            public final String getAskDisplay() {
                return this.askDisplay;
            }

            /* renamed from: component2, reason: from getter */
            public final Title getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final TextFieldValue getQuantityText() {
                return this.quantityText;
            }

            /* renamed from: component5, reason: from getter */
            public final StringResource getQuantitySubtitle() {
                return this.quantitySubtitle;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getQuantityUseSecondaryColor() {
                return this.quantityUseSecondaryColor;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsQuantityEnabled() {
                return this.isQuantityEnabled;
            }

            /* renamed from: component8, reason: from getter */
            public final PriceData getPriceData() {
                return this.priceData;
            }

            /* renamed from: component9, reason: from getter */
            public final OrderFormTimeInForce getTimeInForceDisplay() {
                return this.timeInForceDisplay;
            }

            public final QuantityBasedData copy(EventOrderSide side, Title title, StringResource subtitle, TextFieldValue quantityText, StringResource quantitySubtitle, boolean quantityUseSecondaryColor, boolean isQuantityEnabled, PriceData priceData, OrderFormTimeInForce timeInForceDisplay, boolean canEditTimeInForce, StringResource gtdTimeDisplay, StringResource estimatedCostOrCredit, StringResource feesDisplay, PayoutData payoutData, StringResource estimatedCostOrCreditLabel, String bidDisplay, String askDisplay) {
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(quantityText, "quantityText");
                Intrinsics.checkNotNullParameter(priceData, "priceData");
                Intrinsics.checkNotNullParameter(estimatedCostOrCreditLabel, "estimatedCostOrCreditLabel");
                return new QuantityBasedData(side, title, subtitle, quantityText, quantitySubtitle, quantityUseSecondaryColor, isQuantityEnabled, priceData, timeInForceDisplay, canEditTimeInForce, gtdTimeDisplay, estimatedCostOrCredit, feesDisplay, payoutData, estimatedCostOrCreditLabel, bidDisplay, askDisplay);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantityBasedData)) {
                    return false;
                }
                QuantityBasedData quantityBasedData = (QuantityBasedData) other;
                return this.side == quantityBasedData.side && Intrinsics.areEqual(this.title, quantityBasedData.title) && Intrinsics.areEqual(this.subtitle, quantityBasedData.subtitle) && Intrinsics.areEqual(this.quantityText, quantityBasedData.quantityText) && Intrinsics.areEqual(this.quantitySubtitle, quantityBasedData.quantitySubtitle) && this.quantityUseSecondaryColor == quantityBasedData.quantityUseSecondaryColor && this.isQuantityEnabled == quantityBasedData.isQuantityEnabled && Intrinsics.areEqual(this.priceData, quantityBasedData.priceData) && this.timeInForceDisplay == quantityBasedData.timeInForceDisplay && this.canEditTimeInForce == quantityBasedData.canEditTimeInForce && Intrinsics.areEqual(this.gtdTimeDisplay, quantityBasedData.gtdTimeDisplay) && Intrinsics.areEqual(this.estimatedCostOrCredit, quantityBasedData.estimatedCostOrCredit) && Intrinsics.areEqual(this.feesDisplay, quantityBasedData.feesDisplay) && Intrinsics.areEqual(this.payoutData, quantityBasedData.payoutData) && Intrinsics.areEqual(this.estimatedCostOrCreditLabel, quantityBasedData.estimatedCostOrCreditLabel) && Intrinsics.areEqual(this.bidDisplay, quantityBasedData.bidDisplay) && Intrinsics.areEqual(this.askDisplay, quantityBasedData.askDisplay);
            }

            public int hashCode() {
                int iHashCode = this.side.hashCode() * 31;
                Title title = this.title;
                int iHashCode2 = (iHashCode + (title == null ? 0 : title.hashCode())) * 31;
                StringResource stringResource = this.subtitle;
                int iHashCode3 = (((iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.quantityText.hashCode()) * 31;
                StringResource stringResource2 = this.quantitySubtitle;
                int iHashCode4 = (((((((iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + Boolean.hashCode(this.quantityUseSecondaryColor)) * 31) + Boolean.hashCode(this.isQuantityEnabled)) * 31) + this.priceData.hashCode()) * 31;
                OrderFormTimeInForce orderFormTimeInForce = this.timeInForceDisplay;
                int iHashCode5 = (((iHashCode4 + (orderFormTimeInForce == null ? 0 : orderFormTimeInForce.hashCode())) * 31) + Boolean.hashCode(this.canEditTimeInForce)) * 31;
                StringResource stringResource3 = this.gtdTimeDisplay;
                int iHashCode6 = (iHashCode5 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
                StringResource stringResource4 = this.estimatedCostOrCredit;
                int iHashCode7 = (iHashCode6 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
                StringResource stringResource5 = this.feesDisplay;
                int iHashCode8 = (iHashCode7 + (stringResource5 == null ? 0 : stringResource5.hashCode())) * 31;
                PayoutData payoutData = this.payoutData;
                int iHashCode9 = (((iHashCode8 + (payoutData == null ? 0 : payoutData.hashCode())) * 31) + this.estimatedCostOrCreditLabel.hashCode()) * 31;
                String str = this.bidDisplay;
                int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.askDisplay;
                return iHashCode10 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "QuantityBasedData(side=" + this.side + ", title=" + this.title + ", subtitle=" + this.subtitle + ", quantityText=" + this.quantityText + ", quantitySubtitle=" + this.quantitySubtitle + ", quantityUseSecondaryColor=" + this.quantityUseSecondaryColor + ", isQuantityEnabled=" + this.isQuantityEnabled + ", priceData=" + this.priceData + ", timeInForceDisplay=" + this.timeInForceDisplay + ", canEditTimeInForce=" + this.canEditTimeInForce + ", gtdTimeDisplay=" + this.gtdTimeDisplay + ", estimatedCostOrCredit=" + this.estimatedCostOrCredit + ", feesDisplay=" + this.feesDisplay + ", payoutData=" + this.payoutData + ", estimatedCostOrCreditLabel=" + this.estimatedCostOrCreditLabel + ", bidDisplay=" + this.bidDisplay + ", askDisplay=" + this.askDisplay + ")";
            }

            public QuantityBasedData(EventOrderSide side, Title title, StringResource stringResource, TextFieldValue quantityText, StringResource stringResource2, boolean z, boolean z2, PriceData priceData, OrderFormTimeInForce orderFormTimeInForce, boolean z3, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, PayoutData payoutData, StringResource estimatedCostOrCreditLabel, String str, String str2) {
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(quantityText, "quantityText");
                Intrinsics.checkNotNullParameter(priceData, "priceData");
                Intrinsics.checkNotNullParameter(estimatedCostOrCreditLabel, "estimatedCostOrCreditLabel");
                this.side = side;
                this.title = title;
                this.subtitle = stringResource;
                this.quantityText = quantityText;
                this.quantitySubtitle = stringResource2;
                this.quantityUseSecondaryColor = z;
                this.isQuantityEnabled = z2;
                this.priceData = priceData;
                this.timeInForceDisplay = orderFormTimeInForce;
                this.canEditTimeInForce = z3;
                this.gtdTimeDisplay = stringResource3;
                this.estimatedCostOrCredit = stringResource4;
                this.feesDisplay = stringResource5;
                this.payoutData = payoutData;
                this.estimatedCostOrCreditLabel = estimatedCostOrCreditLabel;
                this.bidDisplay = str;
                this.askDisplay = str2;
            }

            public final EventOrderSide getSide() {
                return this.side;
            }

            public final Title getTitle() {
                return this.title;
            }

            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            public final TextFieldValue getQuantityText() {
                return this.quantityText;
            }

            public final StringResource getQuantitySubtitle() {
                return this.quantitySubtitle;
            }

            public final boolean getQuantityUseSecondaryColor() {
                return this.quantityUseSecondaryColor;
            }

            public final boolean isQuantityEnabled() {
                return this.isQuantityEnabled;
            }

            public final PriceData getPriceData() {
                return this.priceData;
            }

            public final OrderFormTimeInForce getTimeInForceDisplay() {
                return this.timeInForceDisplay;
            }

            public final boolean getCanEditTimeInForce() {
                return this.canEditTimeInForce;
            }

            public final StringResource getGtdTimeDisplay() {
                return this.gtdTimeDisplay;
            }

            public final StringResource getEstimatedCostOrCredit() {
                return this.estimatedCostOrCredit;
            }

            public final StringResource getFeesDisplay() {
                return this.feesDisplay;
            }

            public final PayoutData getPayoutData() {
                return this.payoutData;
            }

            public final StringResource getEstimatedCostOrCreditLabel() {
                return this.estimatedCostOrCreditLabel;
            }

            public final String getBidDisplay() {
                return this.bidDisplay;
            }

            public final String getAskDisplay() {
                return this.askDisplay;
            }

            /* compiled from: EventOrderFormViewState.kt */
            @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData$Title;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "expandableContent", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getExpandableContent", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Title {
                public static final int $stable = StringResource.$stable;
                private final String expandableContent;
                private final StringResource title;

                public static /* synthetic */ Title copy$default(Title title, StringResource stringResource, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = title.title;
                    }
                    if ((i & 2) != 0) {
                        str = title.expandableContent;
                    }
                    return title.copy(stringResource, str);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getExpandableContent() {
                    return this.expandableContent;
                }

                public final Title copy(StringResource title, String expandableContent) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new Title(title, expandableContent);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Title)) {
                        return false;
                    }
                    Title title = (Title) other;
                    return Intrinsics.areEqual(this.title, title.title) && Intrinsics.areEqual(this.expandableContent, title.expandableContent);
                }

                public int hashCode() {
                    int iHashCode = this.title.hashCode() * 31;
                    String str = this.expandableContent;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Title(title=" + this.title + ", expandableContent=" + this.expandableContent + ")";
                }

                public Title(StringResource title, String str) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.expandableContent = str;
                }

                public final StringResource getTitle() {
                    return this.title;
                }

                public final String getExpandableContent() {
                    return this.expandableContent;
                }
            }
        }

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;", "", "buyingPowerDisplayLeading", "Lcom/robinhood/utils/resource/StringResource;", "buyingPowerDisplayTrailing", "dollarInput", "", "dollarInputAmount", "Ljava/math/BigDecimal;", "editingSubtext", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "reviewingSubtextLeading", "reviewingSubtextTrailing", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getBuyingPowerDisplayLeading", "()Lcom/robinhood/utils/resource/StringResource;", "getBuyingPowerDisplayTrailing", "getDollarInput", "()Ljava/lang/String;", "getDollarInputAmount", "()Ljava/math/BigDecimal;", "getEditingSubtext", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "getReviewingSubtextLeading", "getReviewingSubtextTrailing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotionalBasedData {
            public static final int $stable = 8;
            private final StringResource buyingPowerDisplayLeading;
            private final StringResource buyingPowerDisplayTrailing;
            private final String dollarInput;
            private final BigDecimal dollarInputAmount;
            private final EditingSubTextState editingSubtext;
            private final StringResource reviewingSubtextLeading;
            private final StringResource reviewingSubtextTrailing;

            public static /* synthetic */ NotionalBasedData copy$default(NotionalBasedData notionalBasedData, StringResource stringResource, StringResource stringResource2, String str, BigDecimal bigDecimal, EditingSubTextState editingSubTextState, StringResource stringResource3, StringResource stringResource4, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = notionalBasedData.buyingPowerDisplayLeading;
                }
                if ((i & 2) != 0) {
                    stringResource2 = notionalBasedData.buyingPowerDisplayTrailing;
                }
                if ((i & 4) != 0) {
                    str = notionalBasedData.dollarInput;
                }
                if ((i & 8) != 0) {
                    bigDecimal = notionalBasedData.dollarInputAmount;
                }
                if ((i & 16) != 0) {
                    editingSubTextState = notionalBasedData.editingSubtext;
                }
                if ((i & 32) != 0) {
                    stringResource3 = notionalBasedData.reviewingSubtextLeading;
                }
                if ((i & 64) != 0) {
                    stringResource4 = notionalBasedData.reviewingSubtextTrailing;
                }
                StringResource stringResource5 = stringResource3;
                StringResource stringResource6 = stringResource4;
                EditingSubTextState editingSubTextState2 = editingSubTextState;
                String str2 = str;
                return notionalBasedData.copy(stringResource, stringResource2, str2, bigDecimal, editingSubTextState2, stringResource5, stringResource6);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getBuyingPowerDisplayLeading() {
                return this.buyingPowerDisplayLeading;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getBuyingPowerDisplayTrailing() {
                return this.buyingPowerDisplayTrailing;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDollarInput() {
                return this.dollarInput;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getDollarInputAmount() {
                return this.dollarInputAmount;
            }

            /* renamed from: component5, reason: from getter */
            public final EditingSubTextState getEditingSubtext() {
                return this.editingSubtext;
            }

            /* renamed from: component6, reason: from getter */
            public final StringResource getReviewingSubtextLeading() {
                return this.reviewingSubtextLeading;
            }

            /* renamed from: component7, reason: from getter */
            public final StringResource getReviewingSubtextTrailing() {
                return this.reviewingSubtextTrailing;
            }

            public final NotionalBasedData copy(StringResource buyingPowerDisplayLeading, StringResource buyingPowerDisplayTrailing, String dollarInput, BigDecimal dollarInputAmount, EditingSubTextState editingSubtext, StringResource reviewingSubtextLeading, StringResource reviewingSubtextTrailing) {
                Intrinsics.checkNotNullParameter(buyingPowerDisplayLeading, "buyingPowerDisplayLeading");
                Intrinsics.checkNotNullParameter(dollarInput, "dollarInput");
                Intrinsics.checkNotNullParameter(dollarInputAmount, "dollarInputAmount");
                Intrinsics.checkNotNullParameter(reviewingSubtextLeading, "reviewingSubtextLeading");
                return new NotionalBasedData(buyingPowerDisplayLeading, buyingPowerDisplayTrailing, dollarInput, dollarInputAmount, editingSubtext, reviewingSubtextLeading, reviewingSubtextTrailing);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotionalBasedData)) {
                    return false;
                }
                NotionalBasedData notionalBasedData = (NotionalBasedData) other;
                return Intrinsics.areEqual(this.buyingPowerDisplayLeading, notionalBasedData.buyingPowerDisplayLeading) && Intrinsics.areEqual(this.buyingPowerDisplayTrailing, notionalBasedData.buyingPowerDisplayTrailing) && Intrinsics.areEqual(this.dollarInput, notionalBasedData.dollarInput) && Intrinsics.areEqual(this.dollarInputAmount, notionalBasedData.dollarInputAmount) && Intrinsics.areEqual(this.editingSubtext, notionalBasedData.editingSubtext) && Intrinsics.areEqual(this.reviewingSubtextLeading, notionalBasedData.reviewingSubtextLeading) && Intrinsics.areEqual(this.reviewingSubtextTrailing, notionalBasedData.reviewingSubtextTrailing);
            }

            public int hashCode() {
                int iHashCode = this.buyingPowerDisplayLeading.hashCode() * 31;
                StringResource stringResource = this.buyingPowerDisplayTrailing;
                int iHashCode2 = (((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.dollarInput.hashCode()) * 31) + this.dollarInputAmount.hashCode()) * 31;
                EditingSubTextState editingSubTextState = this.editingSubtext;
                int iHashCode3 = (((iHashCode2 + (editingSubTextState == null ? 0 : editingSubTextState.hashCode())) * 31) + this.reviewingSubtextLeading.hashCode()) * 31;
                StringResource stringResource2 = this.reviewingSubtextTrailing;
                return iHashCode3 + (stringResource2 != null ? stringResource2.hashCode() : 0);
            }

            public String toString() {
                return "NotionalBasedData(buyingPowerDisplayLeading=" + this.buyingPowerDisplayLeading + ", buyingPowerDisplayTrailing=" + this.buyingPowerDisplayTrailing + ", dollarInput=" + this.dollarInput + ", dollarInputAmount=" + this.dollarInputAmount + ", editingSubtext=" + this.editingSubtext + ", reviewingSubtextLeading=" + this.reviewingSubtextLeading + ", reviewingSubtextTrailing=" + this.reviewingSubtextTrailing + ")";
            }

            public NotionalBasedData(StringResource buyingPowerDisplayLeading, StringResource stringResource, String dollarInput, BigDecimal dollarInputAmount, EditingSubTextState editingSubTextState, StringResource reviewingSubtextLeading, StringResource stringResource2) {
                Intrinsics.checkNotNullParameter(buyingPowerDisplayLeading, "buyingPowerDisplayLeading");
                Intrinsics.checkNotNullParameter(dollarInput, "dollarInput");
                Intrinsics.checkNotNullParameter(dollarInputAmount, "dollarInputAmount");
                Intrinsics.checkNotNullParameter(reviewingSubtextLeading, "reviewingSubtextLeading");
                this.buyingPowerDisplayLeading = buyingPowerDisplayLeading;
                this.buyingPowerDisplayTrailing = stringResource;
                this.dollarInput = dollarInput;
                this.dollarInputAmount = dollarInputAmount;
                this.editingSubtext = editingSubTextState;
                this.reviewingSubtextLeading = reviewingSubtextLeading;
                this.reviewingSubtextTrailing = stringResource2;
            }

            public final StringResource getBuyingPowerDisplayLeading() {
                return this.buyingPowerDisplayLeading;
            }

            public final StringResource getBuyingPowerDisplayTrailing() {
                return this.buyingPowerDisplayTrailing;
            }

            public final String getDollarInput() {
                return this.dollarInput;
            }

            public final BigDecimal getDollarInputAmount() {
                return this.dollarInputAmount;
            }

            public final EditingSubTextState getEditingSubtext() {
                return this.editingSubtext;
            }

            public final StringResource getReviewingSubtextLeading() {
                return this.reviewingSubtextLeading;
            }

            public final StringResource getReviewingSubtextTrailing() {
                return this.reviewingSubtextTrailing;
            }
        }

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "", "message", "Lcom/robinhood/utils/resource/StringResource;", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "Loading", "Error", "Loaded", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState$Error;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState$Loaded;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState$Loading;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface EditingSubTextState {
            StringResource getMessage();

            /* compiled from: EventOrderFormViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState$Loading;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "message", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Loading implements EditingSubTextState {
                public static final int $stable = StringResource.$stable;
                private final StringResource message;

                public static /* synthetic */ Loading copy$default(Loading loading, StringResource stringResource, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = loading.message;
                    }
                    return loading.copy(stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getMessage() {
                    return this.message;
                }

                public final Loading copy(StringResource message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new Loading(message);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Loading) && Intrinsics.areEqual(this.message, ((Loading) other).message);
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return "Loading(message=" + this.message + ")";
                }

                public Loading(StringResource message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }

                @Override // com.robinhood.android.event.trade.EventOrderFormViewState.OrderFormContentData.EditingSubTextState
                public StringResource getMessage() {
                    return this.message;
                }
            }

            /* compiled from: EventOrderFormViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState$Error;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "message", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Error implements EditingSubTextState {
                public static final int $stable = StringResource.$stable;
                private final StringResource message;

                public static /* synthetic */ Error copy$default(Error error, StringResource stringResource, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = error.message;
                    }
                    return error.copy(stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getMessage() {
                    return this.message;
                }

                public final Error copy(StringResource message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new Error(message);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return "Error(message=" + this.message + ")";
                }

                public Error(StringResource message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }

                @Override // com.robinhood.android.event.trade.EventOrderFormViewState.OrderFormContentData.EditingSubTextState
                public StringResource getMessage() {
                    return this.message;
                }
            }

            /* compiled from: EventOrderFormViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState$Loaded;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "message", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Loaded implements EditingSubTextState {
                public static final int $stable = StringResource.$stable;
                private final StringResource message;

                public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, int i, Object obj) {
                    if ((i & 1) != 0) {
                        stringResource = loaded.message;
                    }
                    return loaded.copy(stringResource);
                }

                /* renamed from: component1, reason: from getter */
                public final StringResource getMessage() {
                    return this.message;
                }

                public final Loaded copy(StringResource message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new Loaded(message);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Loaded) && Intrinsics.areEqual(this.message, ((Loaded) other).message);
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return "Loaded(message=" + this.message + ")";
                }

                public Loaded(StringResource message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }

                @Override // com.robinhood.android.event.trade.EventOrderFormViewState.OrderFormContentData.EditingSubTextState
                public StringResource getMessage() {
                    return this.message;
                }
            }
        }

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$PriceData;", "", "placeholderText", "", "editablePriceText", "Landroidx/compose/ui/text/input/TextFieldValue;", "showLoadingPlaceholder", "", "useSecondaryColor", "isEditable", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;ZZZ)V", "getPlaceholderText", "()Ljava/lang/String;", "getEditablePriceText", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getShowLoadingPlaceholder", "()Z", "getUseSecondaryColor", "displayText", "getDisplayText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PriceData {
            public static final int $stable = 0;
            private final String displayText;
            private final TextFieldValue editablePriceText;
            private final boolean isEditable;
            private final String placeholderText;
            private final boolean showLoadingPlaceholder;
            private final boolean useSecondaryColor;

            public static /* synthetic */ PriceData copy$default(PriceData priceData, String str, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = priceData.placeholderText;
                }
                if ((i & 2) != 0) {
                    textFieldValue = priceData.editablePriceText;
                }
                if ((i & 4) != 0) {
                    z = priceData.showLoadingPlaceholder;
                }
                if ((i & 8) != 0) {
                    z2 = priceData.useSecondaryColor;
                }
                if ((i & 16) != 0) {
                    z3 = priceData.isEditable;
                }
                boolean z4 = z3;
                boolean z5 = z;
                return priceData.copy(str, textFieldValue, z5, z2, z4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPlaceholderText() {
                return this.placeholderText;
            }

            /* renamed from: component2, reason: from getter */
            public final TextFieldValue getEditablePriceText() {
                return this.editablePriceText;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowLoadingPlaceholder() {
                return this.showLoadingPlaceholder;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getUseSecondaryColor() {
                return this.useSecondaryColor;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsEditable() {
                return this.isEditable;
            }

            public final PriceData copy(String placeholderText, TextFieldValue editablePriceText, boolean showLoadingPlaceholder, boolean useSecondaryColor, boolean isEditable) {
                Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
                Intrinsics.checkNotNullParameter(editablePriceText, "editablePriceText");
                return new PriceData(placeholderText, editablePriceText, showLoadingPlaceholder, useSecondaryColor, isEditable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceData)) {
                    return false;
                }
                PriceData priceData = (PriceData) other;
                return Intrinsics.areEqual(this.placeholderText, priceData.placeholderText) && Intrinsics.areEqual(this.editablePriceText, priceData.editablePriceText) && this.showLoadingPlaceholder == priceData.showLoadingPlaceholder && this.useSecondaryColor == priceData.useSecondaryColor && this.isEditable == priceData.isEditable;
            }

            public int hashCode() {
                return (((((((this.placeholderText.hashCode() * 31) + this.editablePriceText.hashCode()) * 31) + Boolean.hashCode(this.showLoadingPlaceholder)) * 31) + Boolean.hashCode(this.useSecondaryColor)) * 31) + Boolean.hashCode(this.isEditable);
            }

            public String toString() {
                return "PriceData(placeholderText=" + this.placeholderText + ", editablePriceText=" + this.editablePriceText + ", showLoadingPlaceholder=" + this.showLoadingPlaceholder + ", useSecondaryColor=" + this.useSecondaryColor + ", isEditable=" + this.isEditable + ")";
            }

            public PriceData(String placeholderText, TextFieldValue editablePriceText, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
                Intrinsics.checkNotNullParameter(editablePriceText, "editablePriceText");
                this.placeholderText = placeholderText;
                this.editablePriceText = editablePriceText;
                this.showLoadingPlaceholder = z;
                this.useSecondaryColor = z2;
                this.isEditable = z3;
                this.displayText = editablePriceText.getText();
            }

            public final String getPlaceholderText() {
                return this.placeholderText;
            }

            public final TextFieldValue getEditablePriceText() {
                return this.editablePriceText;
            }

            public final boolean getShowLoadingPlaceholder() {
                return this.showLoadingPlaceholder;
            }

            public final boolean getUseSecondaryColor() {
                return this.useSecondaryColor;
            }

            public final boolean isEditable() {
                return this.isEditable;
            }

            public final String getDisplayText() {
                return this.displayText;
            }
        }
    }

    /* compiled from: EventOrderFormViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "", "payoutLabel", "Lcom/robinhood/utils/resource/StringResource;", "getPayoutLabel", "()Lcom/robinhood/utils/resource/StringResource;", "payout", "getPayout", "OrderForm", "Receipt", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$OrderForm;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$Receipt;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface PayoutData {
        StringResource getPayout();

        StringResource getPayoutLabel();

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$OrderForm;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "payoutLabel", "Lcom/robinhood/utils/resource/StringResource;", "payout", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getPayoutLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getPayout", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderForm implements PayoutData {
            public static final int $stable = StringResource.$stable;
            private final StringResource payout;
            private final StringResource payoutLabel;

            public static /* synthetic */ OrderForm copy$default(OrderForm orderForm, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = orderForm.payoutLabel;
                }
                if ((i & 2) != 0) {
                    stringResource2 = orderForm.payout;
                }
                return orderForm.copy(stringResource, stringResource2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getPayoutLabel() {
                return this.payoutLabel;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getPayout() {
                return this.payout;
            }

            public final OrderForm copy(StringResource payoutLabel, StringResource payout) {
                Intrinsics.checkNotNullParameter(payoutLabel, "payoutLabel");
                return new OrderForm(payoutLabel, payout);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderForm)) {
                    return false;
                }
                OrderForm orderForm = (OrderForm) other;
                return Intrinsics.areEqual(this.payoutLabel, orderForm.payoutLabel) && Intrinsics.areEqual(this.payout, orderForm.payout);
            }

            public int hashCode() {
                int iHashCode = this.payoutLabel.hashCode() * 31;
                StringResource stringResource = this.payout;
                return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
            }

            public String toString() {
                return "OrderForm(payoutLabel=" + this.payoutLabel + ", payout=" + this.payout + ")";
            }

            public OrderForm(StringResource payoutLabel, StringResource stringResource) {
                Intrinsics.checkNotNullParameter(payoutLabel, "payoutLabel");
                this.payoutLabel = payoutLabel;
                this.payout = stringResource;
            }

            @Override // com.robinhood.android.event.trade.EventOrderFormViewState.PayoutData
            public StringResource getPayoutLabel() {
                return this.payoutLabel;
            }

            @Override // com.robinhood.android.event.trade.EventOrderFormViewState.PayoutData
            public StringResource getPayout() {
                return this.payout;
            }
        }

        /* compiled from: EventOrderFormViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData$Receipt;", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "payoutLabel", "Lcom/robinhood/utils/resource/StringResource;", "payout", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getPayoutLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getPayout", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Receipt implements PayoutData {
            public static final int $stable = StringResource.$stable;
            private final StringResource payout;
            private final StringResource payoutLabel;

            public static /* synthetic */ Receipt copy$default(Receipt receipt, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = receipt.payoutLabel;
                }
                if ((i & 2) != 0) {
                    stringResource2 = receipt.payout;
                }
                return receipt.copy(stringResource, stringResource2);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getPayoutLabel() {
                return this.payoutLabel;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getPayout() {
                return this.payout;
            }

            public final Receipt copy(StringResource payoutLabel, StringResource payout) {
                Intrinsics.checkNotNullParameter(payoutLabel, "payoutLabel");
                return new Receipt(payoutLabel, payout);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Receipt)) {
                    return false;
                }
                Receipt receipt = (Receipt) other;
                return Intrinsics.areEqual(this.payoutLabel, receipt.payoutLabel) && Intrinsics.areEqual(this.payout, receipt.payout);
            }

            public int hashCode() {
                int iHashCode = this.payoutLabel.hashCode() * 31;
                StringResource stringResource = this.payout;
                return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
            }

            public String toString() {
                return "Receipt(payoutLabel=" + this.payoutLabel + ", payout=" + this.payout + ")";
            }

            public Receipt(StringResource payoutLabel, StringResource stringResource) {
                Intrinsics.checkNotNullParameter(payoutLabel, "payoutLabel");
                this.payoutLabel = payoutLabel;
                this.payout = stringResource;
            }

            @Override // com.robinhood.android.event.trade.EventOrderFormViewState.PayoutData
            public StringResource getPayoutLabel() {
                return this.payoutLabel;
            }

            @Override // com.robinhood.android.event.trade.EventOrderFormViewState.PayoutData
            public StringResource getPayout() {
                return this.payout;
            }
        }
    }

    public final OrderForm6 getOrderFormState() {
        return this.orderFormState;
    }

    public final boolean getShowCloseAsBack() {
        return this.showCloseAsBack;
    }

    public final boolean getInterceptOnBackPressed() {
        return this.interceptOnBackPressed;
    }
}
