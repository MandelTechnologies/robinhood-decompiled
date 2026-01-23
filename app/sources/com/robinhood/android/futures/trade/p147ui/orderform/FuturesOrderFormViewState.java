package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.OrderSubmissionState;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.Monitoring;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001:\u0003WXYB\u0087\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010:\u001a\u00020\tJ\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\rHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\t\u0010L\u001a\u00020\u0015HÆ\u0003J\t\u0010M\u001a\u00020\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010O\u001a\u00020\u001aHÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J¥\u0001\u0010R\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\tHÆ\u0001J\u0013\u0010S\u001a\u00020\t2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u0003HÖ\u0001J\t\u0010V\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0011\u0010;\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b<\u0010&R\u0011\u0010=\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u0010&R\u0011\u0010?\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010A\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bB\u0010&¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState;", "", "orderTypeLabel", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "focusedText", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "showingTimeInForceSelector", "", "orderFormContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "orderReceiptContentData", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderReceiptContentData;", "rhdAccountId", "Ljava/util/UUID;", "candidateOrder", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "orderSubmissionState", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;", "microgramState", "Lmicrogram/android/MicrogramState;", "contractId", "contractStreamingSymbol", "", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "refId", "showReviewAsLoading", "<init>", "(ILcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;ZLcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderReceiptContentData;Ljava/util/UUID;Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;Lmicrogram/android/MicrogramState;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/util/UUID;Z)V", "getOrderTypeLabel", "()I", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getFocusedText", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "getShowingTimeInForceSelector", "()Z", "getOrderFormContentData", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "getOrderReceiptContentData", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderReceiptContentData;", "getRhdAccountId", "()Ljava/util/UUID;", "getCandidateOrder", "()Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "getOrderSubmissionState", "()Lcom/robinhood/android/futures/trade/ui/orderform/OrderSubmissionState;", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "getContractId", "getContractStreamingSymbol", "()Ljava/lang/String;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getRefId", "getShowReviewAsLoading", "canMakeValidateOrderCall", "showCloseAsBack", "getShowCloseAsBack", "showOrderTypeMenuItem", "getShowOrderTypeMenuItem", "interceptOnBackPressed", "getInterceptOnBackPressed", "reviewButtonEnabled", "getReviewButtonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "OrderFormContentData", "OrderReceiptContentData", "TextDisplay", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FuturesOrderFormViewState {
    public static final int $stable = 8;
    private final UiFuturesOrderContext candidateOrder;
    private final UUID contractId;
    private final String contractStreamingSymbol;
    private final FuturesOrderFormDataState.FocusedText focusedText;
    private final boolean interceptOnBackPressed;
    private final Monitoring microgramState;
    private final OrderFormContentData orderFormContentData;
    private final OrderReceiptContentData orderReceiptContentData;
    private final OrderSubmissionState orderSubmissionState;
    private final int orderTypeLabel;
    private final UUID refId;
    private final UUID rhdAccountId;
    private final boolean showReviewAsLoading;
    private final boolean showingTimeInForceSelector;
    private final FuturesOrderSide side;
    private final Screen sourceScreen;

    /* renamed from: component1, reason: from getter */
    public final int getOrderTypeLabel() {
        return this.orderTypeLabel;
    }

    /* renamed from: component10, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component11, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getContractStreamingSymbol() {
        return this.contractStreamingSymbol;
    }

    /* renamed from: component13, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component14, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowReviewAsLoading() {
        return this.showReviewAsLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesOrderFormDataState.FocusedText getFocusedText() {
        return this.focusedText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowingTimeInForceSelector() {
        return this.showingTimeInForceSelector;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderFormContentData getOrderFormContentData() {
        return this.orderFormContentData;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderReceiptContentData getOrderReceiptContentData() {
        return this.orderReceiptContentData;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getRhdAccountId() {
        return this.rhdAccountId;
    }

    /* renamed from: component8, reason: from getter */
    public final UiFuturesOrderContext getCandidateOrder() {
        return this.candidateOrder;
    }

    /* renamed from: component9, reason: from getter */
    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    public final FuturesOrderFormViewState copy(int orderTypeLabel, FuturesOrderSide side, FuturesOrderFormDataState.FocusedText focusedText, boolean showingTimeInForceSelector, OrderFormContentData orderFormContentData, OrderReceiptContentData orderReceiptContentData, UUID rhdAccountId, UiFuturesOrderContext candidateOrder, OrderSubmissionState orderSubmissionState, Monitoring microgramState, UUID contractId, String contractStreamingSymbol, Screen sourceScreen, UUID refId, boolean showReviewAsLoading) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(focusedText, "focusedText");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(orderReceiptContentData, "orderReceiptContentData");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(refId, "refId");
        return new FuturesOrderFormViewState(orderTypeLabel, side, focusedText, showingTimeInForceSelector, orderFormContentData, orderReceiptContentData, rhdAccountId, candidateOrder, orderSubmissionState, microgramState, contractId, contractStreamingSymbol, sourceScreen, refId, showReviewAsLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOrderFormViewState)) {
            return false;
        }
        FuturesOrderFormViewState futuresOrderFormViewState = (FuturesOrderFormViewState) other;
        return this.orderTypeLabel == futuresOrderFormViewState.orderTypeLabel && this.side == futuresOrderFormViewState.side && this.focusedText == futuresOrderFormViewState.focusedText && this.showingTimeInForceSelector == futuresOrderFormViewState.showingTimeInForceSelector && Intrinsics.areEqual(this.orderFormContentData, futuresOrderFormViewState.orderFormContentData) && Intrinsics.areEqual(this.orderReceiptContentData, futuresOrderFormViewState.orderReceiptContentData) && Intrinsics.areEqual(this.rhdAccountId, futuresOrderFormViewState.rhdAccountId) && Intrinsics.areEqual(this.candidateOrder, futuresOrderFormViewState.candidateOrder) && Intrinsics.areEqual(this.orderSubmissionState, futuresOrderFormViewState.orderSubmissionState) && Intrinsics.areEqual(this.microgramState, futuresOrderFormViewState.microgramState) && Intrinsics.areEqual(this.contractId, futuresOrderFormViewState.contractId) && Intrinsics.areEqual(this.contractStreamingSymbol, futuresOrderFormViewState.contractStreamingSymbol) && Intrinsics.areEqual(this.sourceScreen, futuresOrderFormViewState.sourceScreen) && Intrinsics.areEqual(this.refId, futuresOrderFormViewState.refId) && this.showReviewAsLoading == futuresOrderFormViewState.showReviewAsLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.orderTypeLabel) * 31) + this.side.hashCode()) * 31) + this.focusedText.hashCode()) * 31) + Boolean.hashCode(this.showingTimeInForceSelector)) * 31) + this.orderFormContentData.hashCode()) * 31) + this.orderReceiptContentData.hashCode()) * 31;
        UUID uuid = this.rhdAccountId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UiFuturesOrderContext uiFuturesOrderContext = this.candidateOrder;
        int iHashCode3 = (((((((iHashCode2 + (uiFuturesOrderContext == null ? 0 : uiFuturesOrderContext.hashCode())) * 31) + this.orderSubmissionState.hashCode()) * 31) + this.microgramState.hashCode()) * 31) + this.contractId.hashCode()) * 31;
        String str = this.contractStreamingSymbol;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.sourceScreen.hashCode()) * 31) + this.refId.hashCode()) * 31) + Boolean.hashCode(this.showReviewAsLoading);
    }

    public String toString() {
        return "FuturesOrderFormViewState(orderTypeLabel=" + this.orderTypeLabel + ", side=" + this.side + ", focusedText=" + this.focusedText + ", showingTimeInForceSelector=" + this.showingTimeInForceSelector + ", orderFormContentData=" + this.orderFormContentData + ", orderReceiptContentData=" + this.orderReceiptContentData + ", rhdAccountId=" + this.rhdAccountId + ", candidateOrder=" + this.candidateOrder + ", orderSubmissionState=" + this.orderSubmissionState + ", microgramState=" + this.microgramState + ", contractId=" + this.contractId + ", contractStreamingSymbol=" + this.contractStreamingSymbol + ", sourceScreen=" + this.sourceScreen + ", refId=" + this.refId + ", showReviewAsLoading=" + this.showReviewAsLoading + ")";
    }

    public FuturesOrderFormViewState(int i, FuturesOrderSide side, FuturesOrderFormDataState.FocusedText focusedText, boolean z, OrderFormContentData orderFormContentData, OrderReceiptContentData orderReceiptContentData, UUID uuid, UiFuturesOrderContext uiFuturesOrderContext, OrderSubmissionState orderSubmissionState, Monitoring microgramState, UUID contractId, String str, Screen sourceScreen, UUID refId, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(focusedText, "focusedText");
        Intrinsics.checkNotNullParameter(orderFormContentData, "orderFormContentData");
        Intrinsics.checkNotNullParameter(orderReceiptContentData, "orderReceiptContentData");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(refId, "refId");
        this.orderTypeLabel = i;
        this.side = side;
        this.focusedText = focusedText;
        this.showingTimeInForceSelector = z;
        this.orderFormContentData = orderFormContentData;
        this.orderReceiptContentData = orderReceiptContentData;
        this.rhdAccountId = uuid;
        this.candidateOrder = uiFuturesOrderContext;
        this.orderSubmissionState = orderSubmissionState;
        this.microgramState = microgramState;
        this.contractId = contractId;
        this.contractStreamingSymbol = str;
        this.sourceScreen = sourceScreen;
        this.refId = refId;
        this.showReviewAsLoading = z2;
        if (Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE) || (orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
            z3 = true;
        } else {
            if (!Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Editing.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        this.interceptOnBackPressed = z3;
    }

    public final int getOrderTypeLabel() {
        return this.orderTypeLabel;
    }

    public final FuturesOrderSide getSide() {
        return this.side;
    }

    public final FuturesOrderFormDataState.FocusedText getFocusedText() {
        return this.focusedText;
    }

    public final boolean getShowingTimeInForceSelector() {
        return this.showingTimeInForceSelector;
    }

    public final OrderFormContentData getOrderFormContentData() {
        return this.orderFormContentData;
    }

    public final OrderReceiptContentData getOrderReceiptContentData() {
        return this.orderReceiptContentData;
    }

    public final UUID getRhdAccountId() {
        return this.rhdAccountId;
    }

    public final UiFuturesOrderContext getCandidateOrder() {
        return this.candidateOrder;
    }

    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final String getContractStreamingSymbol() {
        return this.contractStreamingSymbol;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final boolean getShowReviewAsLoading() {
        return this.showReviewAsLoading;
    }

    public final boolean canMakeValidateOrderCall() {
        return this.candidateOrder != null && Intrinsics.areEqual(this.microgramState, Monitoring.Ready.INSTANCE);
    }

    public final boolean getShowCloseAsBack() {
        return Intrinsics.areEqual(this.orderSubmissionState, OrderSubmissionState.Editing.INSTANCE);
    }

    public final boolean getShowOrderTypeMenuItem() {
        return Intrinsics.areEqual(this.orderSubmissionState, OrderSubmissionState.Editing.INSTANCE);
    }

    public final boolean getInterceptOnBackPressed() {
        return this.interceptOnBackPressed;
    }

    public final boolean getReviewButtonEnabled() {
        return this.candidateOrder != null;
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\t\u0010F\u001a\u00020\u0014HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jó\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010Q\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\fHÖ\u0001J\t\u0010T\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderFormContentData;", "", "orderConfig", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "title", "Lcom/robinhood/utils/resource/StringResource;", "buyingPowerAvailable", "isEnabled", "", "quantityText", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;", "priceLabelRes", "", "bidDisplay", "", "askDisplay", "marketPriceText", "limitPriceText", "stopPriceText", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "gfdLabel", "buyingPowerEffect", "commissionAndFees", "totalCommission", "regulatoryAndExchangeFees", "marginRequired", "totalGoldSavings", "orderSummaryString", "quoteSummaryString", "<init>", "(Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getOrderConfig", "()Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getBuyingPowerAvailable", "()Z", "getQuantityText", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;", "getPriceLabelRes", "()I", "getBidDisplay", "()Ljava/lang/String;", "getAskDisplay", "getMarketPriceText", "getLimitPriceText", "getStopPriceText", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getGfdLabel", "getBuyingPowerEffect", "getCommissionAndFees", "getTotalCommission", "getRegulatoryAndExchangeFees", "getMarginRequired", "getTotalGoldSavings", "getOrderSummaryString", "getQuoteSummaryString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderFormContentData {
        public static final int $stable = StringResource.$stable;
        private final String askDisplay;
        private final String bidDisplay;
        private final StringResource buyingPowerAvailable;
        private final String buyingPowerEffect;
        private final StringResource commissionAndFees;
        private final StringResource gfdLabel;
        private final boolean isEnabled;
        private final TextDisplay limitPriceText;
        private final StringResource marginRequired;
        private final TextDisplay marketPriceText;
        private final FuturesOrderConfiguration orderConfig;
        private final StringResource orderSummaryString;
        private final int priceLabelRes;
        private final TextDisplay quantityText;
        private final StringResource quoteSummaryString;
        private final StringResource regulatoryAndExchangeFees;
        private final TextDisplay stopPriceText;
        private final FuturesTimeInForce timeInForce;
        private final StringResource title;
        private final StringResource totalCommission;
        private final StringResource totalGoldSavings;

        public static /* synthetic */ OrderFormContentData copy$default(OrderFormContentData orderFormContentData, FuturesOrderConfiguration futuresOrderConfiguration, StringResource stringResource, StringResource stringResource2, boolean z, TextDisplay textDisplay, int i, String str, String str2, TextDisplay textDisplay2, TextDisplay textDisplay3, TextDisplay textDisplay4, FuturesTimeInForce futuresTimeInForce, StringResource stringResource3, String str3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, StringResource stringResource7, StringResource stringResource8, StringResource stringResource9, StringResource stringResource10, int i2, Object obj) {
            StringResource stringResource11;
            StringResource stringResource12;
            FuturesOrderConfiguration futuresOrderConfiguration2 = (i2 & 1) != 0 ? orderFormContentData.orderConfig : futuresOrderConfiguration;
            StringResource stringResource13 = (i2 & 2) != 0 ? orderFormContentData.title : stringResource;
            StringResource stringResource14 = (i2 & 4) != 0 ? orderFormContentData.buyingPowerAvailable : stringResource2;
            boolean z2 = (i2 & 8) != 0 ? orderFormContentData.isEnabled : z;
            TextDisplay textDisplay5 = (i2 & 16) != 0 ? orderFormContentData.quantityText : textDisplay;
            int i3 = (i2 & 32) != 0 ? orderFormContentData.priceLabelRes : i;
            String str4 = (i2 & 64) != 0 ? orderFormContentData.bidDisplay : str;
            String str5 = (i2 & 128) != 0 ? orderFormContentData.askDisplay : str2;
            TextDisplay textDisplay6 = (i2 & 256) != 0 ? orderFormContentData.marketPriceText : textDisplay2;
            TextDisplay textDisplay7 = (i2 & 512) != 0 ? orderFormContentData.limitPriceText : textDisplay3;
            TextDisplay textDisplay8 = (i2 & 1024) != 0 ? orderFormContentData.stopPriceText : textDisplay4;
            FuturesTimeInForce futuresTimeInForce2 = (i2 & 2048) != 0 ? orderFormContentData.timeInForce : futuresTimeInForce;
            StringResource stringResource15 = (i2 & 4096) != 0 ? orderFormContentData.gfdLabel : stringResource3;
            String str6 = (i2 & 8192) != 0 ? orderFormContentData.buyingPowerEffect : str3;
            FuturesOrderConfiguration futuresOrderConfiguration3 = futuresOrderConfiguration2;
            StringResource stringResource16 = (i2 & 16384) != 0 ? orderFormContentData.commissionAndFees : stringResource4;
            StringResource stringResource17 = (i2 & 32768) != 0 ? orderFormContentData.totalCommission : stringResource5;
            StringResource stringResource18 = (i2 & 65536) != 0 ? orderFormContentData.regulatoryAndExchangeFees : stringResource6;
            StringResource stringResource19 = (i2 & 131072) != 0 ? orderFormContentData.marginRequired : stringResource7;
            StringResource stringResource20 = (i2 & 262144) != 0 ? orderFormContentData.totalGoldSavings : stringResource8;
            StringResource stringResource21 = (i2 & 524288) != 0 ? orderFormContentData.orderSummaryString : stringResource9;
            if ((i2 & 1048576) != 0) {
                stringResource12 = stringResource21;
                stringResource11 = orderFormContentData.quoteSummaryString;
            } else {
                stringResource11 = stringResource10;
                stringResource12 = stringResource21;
            }
            return orderFormContentData.copy(futuresOrderConfiguration3, stringResource13, stringResource14, z2, textDisplay5, i3, str4, str5, textDisplay6, textDisplay7, textDisplay8, futuresTimeInForce2, stringResource15, str6, stringResource16, stringResource17, stringResource18, stringResource19, stringResource20, stringResource12, stringResource11);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesOrderConfiguration getOrderConfig() {
            return this.orderConfig;
        }

        /* renamed from: component10, reason: from getter */
        public final TextDisplay getLimitPriceText() {
            return this.limitPriceText;
        }

        /* renamed from: component11, reason: from getter */
        public final TextDisplay getStopPriceText() {
            return this.stopPriceText;
        }

        /* renamed from: component12, reason: from getter */
        public final FuturesTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component13, reason: from getter */
        public final StringResource getGfdLabel() {
            return this.gfdLabel;
        }

        /* renamed from: component14, reason: from getter */
        public final String getBuyingPowerEffect() {
            return this.buyingPowerEffect;
        }

        /* renamed from: component15, reason: from getter */
        public final StringResource getCommissionAndFees() {
            return this.commissionAndFees;
        }

        /* renamed from: component16, reason: from getter */
        public final StringResource getTotalCommission() {
            return this.totalCommission;
        }

        /* renamed from: component17, reason: from getter */
        public final StringResource getRegulatoryAndExchangeFees() {
            return this.regulatoryAndExchangeFees;
        }

        /* renamed from: component18, reason: from getter */
        public final StringResource getMarginRequired() {
            return this.marginRequired;
        }

        /* renamed from: component19, reason: from getter */
        public final StringResource getTotalGoldSavings() {
            return this.totalGoldSavings;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component20, reason: from getter */
        public final StringResource getOrderSummaryString() {
            return this.orderSummaryString;
        }

        /* renamed from: component21, reason: from getter */
        public final StringResource getQuoteSummaryString() {
            return this.quoteSummaryString;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getBuyingPowerAvailable() {
            return this.buyingPowerAvailable;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDisplay getQuantityText() {
            return this.quantityText;
        }

        /* renamed from: component6, reason: from getter */
        public final int getPriceLabelRes() {
            return this.priceLabelRes;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBidDisplay() {
            return this.bidDisplay;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAskDisplay() {
            return this.askDisplay;
        }

        /* renamed from: component9, reason: from getter */
        public final TextDisplay getMarketPriceText() {
            return this.marketPriceText;
        }

        public final OrderFormContentData copy(FuturesOrderConfiguration orderConfig, StringResource title, StringResource buyingPowerAvailable, boolean isEnabled, TextDisplay quantityText, int priceLabelRes, String bidDisplay, String askDisplay, TextDisplay marketPriceText, TextDisplay limitPriceText, TextDisplay stopPriceText, FuturesTimeInForce timeInForce, StringResource gfdLabel, String buyingPowerEffect, StringResource commissionAndFees, StringResource totalCommission, StringResource regulatoryAndExchangeFees, StringResource marginRequired, StringResource totalGoldSavings, StringResource orderSummaryString, StringResource quoteSummaryString) {
            Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
            Intrinsics.checkNotNullParameter(buyingPowerAvailable, "buyingPowerAvailable");
            Intrinsics.checkNotNullParameter(quantityText, "quantityText");
            Intrinsics.checkNotNullParameter(marketPriceText, "marketPriceText");
            Intrinsics.checkNotNullParameter(limitPriceText, "limitPriceText");
            Intrinsics.checkNotNullParameter(stopPriceText, "stopPriceText");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new OrderFormContentData(orderConfig, title, buyingPowerAvailable, isEnabled, quantityText, priceLabelRes, bidDisplay, askDisplay, marketPriceText, limitPriceText, stopPriceText, timeInForce, gfdLabel, buyingPowerEffect, commissionAndFees, totalCommission, regulatoryAndExchangeFees, marginRequired, totalGoldSavings, orderSummaryString, quoteSummaryString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderFormContentData)) {
                return false;
            }
            OrderFormContentData orderFormContentData = (OrderFormContentData) other;
            return this.orderConfig == orderFormContentData.orderConfig && Intrinsics.areEqual(this.title, orderFormContentData.title) && Intrinsics.areEqual(this.buyingPowerAvailable, orderFormContentData.buyingPowerAvailable) && this.isEnabled == orderFormContentData.isEnabled && Intrinsics.areEqual(this.quantityText, orderFormContentData.quantityText) && this.priceLabelRes == orderFormContentData.priceLabelRes && Intrinsics.areEqual(this.bidDisplay, orderFormContentData.bidDisplay) && Intrinsics.areEqual(this.askDisplay, orderFormContentData.askDisplay) && Intrinsics.areEqual(this.marketPriceText, orderFormContentData.marketPriceText) && Intrinsics.areEqual(this.limitPriceText, orderFormContentData.limitPriceText) && Intrinsics.areEqual(this.stopPriceText, orderFormContentData.stopPriceText) && this.timeInForce == orderFormContentData.timeInForce && Intrinsics.areEqual(this.gfdLabel, orderFormContentData.gfdLabel) && Intrinsics.areEqual(this.buyingPowerEffect, orderFormContentData.buyingPowerEffect) && Intrinsics.areEqual(this.commissionAndFees, orderFormContentData.commissionAndFees) && Intrinsics.areEqual(this.totalCommission, orderFormContentData.totalCommission) && Intrinsics.areEqual(this.regulatoryAndExchangeFees, orderFormContentData.regulatoryAndExchangeFees) && Intrinsics.areEqual(this.marginRequired, orderFormContentData.marginRequired) && Intrinsics.areEqual(this.totalGoldSavings, orderFormContentData.totalGoldSavings) && Intrinsics.areEqual(this.orderSummaryString, orderFormContentData.orderSummaryString) && Intrinsics.areEqual(this.quoteSummaryString, orderFormContentData.quoteSummaryString);
        }

        public int hashCode() {
            int iHashCode = this.orderConfig.hashCode() * 31;
            StringResource stringResource = this.title;
            int iHashCode2 = (((((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.buyingPowerAvailable.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.quantityText.hashCode()) * 31) + Integer.hashCode(this.priceLabelRes)) * 31;
            String str = this.bidDisplay;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.askDisplay;
            int iHashCode4 = (((((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.marketPriceText.hashCode()) * 31) + this.limitPriceText.hashCode()) * 31) + this.stopPriceText.hashCode()) * 31) + this.timeInForce.hashCode()) * 31;
            StringResource stringResource2 = this.gfdLabel;
            int iHashCode5 = (iHashCode4 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
            String str3 = this.buyingPowerEffect;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            StringResource stringResource3 = this.commissionAndFees;
            int iHashCode7 = (iHashCode6 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
            StringResource stringResource4 = this.totalCommission;
            int iHashCode8 = (iHashCode7 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
            StringResource stringResource5 = this.regulatoryAndExchangeFees;
            int iHashCode9 = (iHashCode8 + (stringResource5 == null ? 0 : stringResource5.hashCode())) * 31;
            StringResource stringResource6 = this.marginRequired;
            int iHashCode10 = (iHashCode9 + (stringResource6 == null ? 0 : stringResource6.hashCode())) * 31;
            StringResource stringResource7 = this.totalGoldSavings;
            int iHashCode11 = (iHashCode10 + (stringResource7 == null ? 0 : stringResource7.hashCode())) * 31;
            StringResource stringResource8 = this.orderSummaryString;
            int iHashCode12 = (iHashCode11 + (stringResource8 == null ? 0 : stringResource8.hashCode())) * 31;
            StringResource stringResource9 = this.quoteSummaryString;
            return iHashCode12 + (stringResource9 != null ? stringResource9.hashCode() : 0);
        }

        public String toString() {
            return "OrderFormContentData(orderConfig=" + this.orderConfig + ", title=" + this.title + ", buyingPowerAvailable=" + this.buyingPowerAvailable + ", isEnabled=" + this.isEnabled + ", quantityText=" + this.quantityText + ", priceLabelRes=" + this.priceLabelRes + ", bidDisplay=" + this.bidDisplay + ", askDisplay=" + this.askDisplay + ", marketPriceText=" + this.marketPriceText + ", limitPriceText=" + this.limitPriceText + ", stopPriceText=" + this.stopPriceText + ", timeInForce=" + this.timeInForce + ", gfdLabel=" + this.gfdLabel + ", buyingPowerEffect=" + this.buyingPowerEffect + ", commissionAndFees=" + this.commissionAndFees + ", totalCommission=" + this.totalCommission + ", regulatoryAndExchangeFees=" + this.regulatoryAndExchangeFees + ", marginRequired=" + this.marginRequired + ", totalGoldSavings=" + this.totalGoldSavings + ", orderSummaryString=" + this.orderSummaryString + ", quoteSummaryString=" + this.quoteSummaryString + ")";
        }

        public OrderFormContentData(FuturesOrderConfiguration orderConfig, StringResource stringResource, StringResource buyingPowerAvailable, boolean z, TextDisplay quantityText, int i, String str, String str2, TextDisplay marketPriceText, TextDisplay limitPriceText, TextDisplay stopPriceText, FuturesTimeInForce timeInForce, StringResource stringResource2, String str3, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, StringResource stringResource7, StringResource stringResource8, StringResource stringResource9) {
            Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
            Intrinsics.checkNotNullParameter(buyingPowerAvailable, "buyingPowerAvailable");
            Intrinsics.checkNotNullParameter(quantityText, "quantityText");
            Intrinsics.checkNotNullParameter(marketPriceText, "marketPriceText");
            Intrinsics.checkNotNullParameter(limitPriceText, "limitPriceText");
            Intrinsics.checkNotNullParameter(stopPriceText, "stopPriceText");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            this.orderConfig = orderConfig;
            this.title = stringResource;
            this.buyingPowerAvailable = buyingPowerAvailable;
            this.isEnabled = z;
            this.quantityText = quantityText;
            this.priceLabelRes = i;
            this.bidDisplay = str;
            this.askDisplay = str2;
            this.marketPriceText = marketPriceText;
            this.limitPriceText = limitPriceText;
            this.stopPriceText = stopPriceText;
            this.timeInForce = timeInForce;
            this.gfdLabel = stringResource2;
            this.buyingPowerEffect = str3;
            this.commissionAndFees = stringResource3;
            this.totalCommission = stringResource4;
            this.regulatoryAndExchangeFees = stringResource5;
            this.marginRequired = stringResource6;
            this.totalGoldSavings = stringResource7;
            this.orderSummaryString = stringResource8;
            this.quoteSummaryString = stringResource9;
        }

        public final FuturesOrderConfiguration getOrderConfig() {
            return this.orderConfig;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getBuyingPowerAvailable() {
            return this.buyingPowerAvailable;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final TextDisplay getQuantityText() {
            return this.quantityText;
        }

        public final int getPriceLabelRes() {
            return this.priceLabelRes;
        }

        public final String getBidDisplay() {
            return this.bidDisplay;
        }

        public final String getAskDisplay() {
            return this.askDisplay;
        }

        public final TextDisplay getMarketPriceText() {
            return this.marketPriceText;
        }

        public final TextDisplay getLimitPriceText() {
            return this.limitPriceText;
        }

        public final TextDisplay getStopPriceText() {
            return this.stopPriceText;
        }

        public final FuturesTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        public final StringResource getGfdLabel() {
            return this.gfdLabel;
        }

        public final String getBuyingPowerEffect() {
            return this.buyingPowerEffect;
        }

        public final StringResource getCommissionAndFees() {
            return this.commissionAndFees;
        }

        public final StringResource getTotalCommission() {
            return this.totalCommission;
        }

        public final StringResource getRegulatoryAndExchangeFees() {
            return this.regulatoryAndExchangeFees;
        }

        public final StringResource getMarginRequired() {
            return this.marginRequired;
        }

        public final StringResource getTotalGoldSavings() {
            return this.totalGoldSavings;
        }

        public final StringResource getOrderSummaryString() {
            return this.orderSummaryString;
        }

        public final StringResource getQuoteSummaryString() {
            return this.quoteSummaryString;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$OrderReceiptContentData;", "", "orderReceiptTitle", "Lcom/robinhood/utils/resource/StringResource;", "orderReceiptDesc", "quantity", "filledQuantity", "avgFilledPrice", "buyingPowerEffect", "commissionAndFees", "totalGoldSavings", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getOrderReceiptTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getOrderReceiptDesc", "getQuantity", "getFilledQuantity", "getAvgFilledPrice", "getBuyingPowerEffect", "getCommissionAndFees", "getTotalGoldSavings", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderReceiptContentData {
        public static final int $stable = StringResource.$stable;
        private final StringResource avgFilledPrice;
        private final StringResource buyingPowerEffect;
        private final StringResource commissionAndFees;
        private final StringResource filledQuantity;
        private final StringResource orderReceiptDesc;
        private final StringResource orderReceiptTitle;
        private final StringResource quantity;
        private final StringResource totalGoldSavings;

        public static /* synthetic */ OrderReceiptContentData copy$default(OrderReceiptContentData orderReceiptContentData, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, StringResource stringResource7, StringResource stringResource8, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = orderReceiptContentData.orderReceiptTitle;
            }
            if ((i & 2) != 0) {
                stringResource2 = orderReceiptContentData.orderReceiptDesc;
            }
            if ((i & 4) != 0) {
                stringResource3 = orderReceiptContentData.quantity;
            }
            if ((i & 8) != 0) {
                stringResource4 = orderReceiptContentData.filledQuantity;
            }
            if ((i & 16) != 0) {
                stringResource5 = orderReceiptContentData.avgFilledPrice;
            }
            if ((i & 32) != 0) {
                stringResource6 = orderReceiptContentData.buyingPowerEffect;
            }
            if ((i & 64) != 0) {
                stringResource7 = orderReceiptContentData.commissionAndFees;
            }
            if ((i & 128) != 0) {
                stringResource8 = orderReceiptContentData.totalGoldSavings;
            }
            StringResource stringResource9 = stringResource7;
            StringResource stringResource10 = stringResource8;
            StringResource stringResource11 = stringResource5;
            StringResource stringResource12 = stringResource6;
            return orderReceiptContentData.copy(stringResource, stringResource2, stringResource3, stringResource4, stringResource11, stringResource12, stringResource9, stringResource10);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getOrderReceiptTitle() {
            return this.orderReceiptTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getOrderReceiptDesc() {
            return this.orderReceiptDesc;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getFilledQuantity() {
            return this.filledQuantity;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getAvgFilledPrice() {
            return this.avgFilledPrice;
        }

        /* renamed from: component6, reason: from getter */
        public final StringResource getBuyingPowerEffect() {
            return this.buyingPowerEffect;
        }

        /* renamed from: component7, reason: from getter */
        public final StringResource getCommissionAndFees() {
            return this.commissionAndFees;
        }

        /* renamed from: component8, reason: from getter */
        public final StringResource getTotalGoldSavings() {
            return this.totalGoldSavings;
        }

        public final OrderReceiptContentData copy(StringResource orderReceiptTitle, StringResource orderReceiptDesc, StringResource quantity, StringResource filledQuantity, StringResource avgFilledPrice, StringResource buyingPowerEffect, StringResource commissionAndFees, StringResource totalGoldSavings) {
            return new OrderReceiptContentData(orderReceiptTitle, orderReceiptDesc, quantity, filledQuantity, avgFilledPrice, buyingPowerEffect, commissionAndFees, totalGoldSavings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderReceiptContentData)) {
                return false;
            }
            OrderReceiptContentData orderReceiptContentData = (OrderReceiptContentData) other;
            return Intrinsics.areEqual(this.orderReceiptTitle, orderReceiptContentData.orderReceiptTitle) && Intrinsics.areEqual(this.orderReceiptDesc, orderReceiptContentData.orderReceiptDesc) && Intrinsics.areEqual(this.quantity, orderReceiptContentData.quantity) && Intrinsics.areEqual(this.filledQuantity, orderReceiptContentData.filledQuantity) && Intrinsics.areEqual(this.avgFilledPrice, orderReceiptContentData.avgFilledPrice) && Intrinsics.areEqual(this.buyingPowerEffect, orderReceiptContentData.buyingPowerEffect) && Intrinsics.areEqual(this.commissionAndFees, orderReceiptContentData.commissionAndFees) && Intrinsics.areEqual(this.totalGoldSavings, orderReceiptContentData.totalGoldSavings);
        }

        public int hashCode() {
            StringResource stringResource = this.orderReceiptTitle;
            int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
            StringResource stringResource2 = this.orderReceiptDesc;
            int iHashCode2 = (iHashCode + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
            StringResource stringResource3 = this.quantity;
            int iHashCode3 = (iHashCode2 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
            StringResource stringResource4 = this.filledQuantity;
            int iHashCode4 = (iHashCode3 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
            StringResource stringResource5 = this.avgFilledPrice;
            int iHashCode5 = (iHashCode4 + (stringResource5 == null ? 0 : stringResource5.hashCode())) * 31;
            StringResource stringResource6 = this.buyingPowerEffect;
            int iHashCode6 = (iHashCode5 + (stringResource6 == null ? 0 : stringResource6.hashCode())) * 31;
            StringResource stringResource7 = this.commissionAndFees;
            int iHashCode7 = (iHashCode6 + (stringResource7 == null ? 0 : stringResource7.hashCode())) * 31;
            StringResource stringResource8 = this.totalGoldSavings;
            return iHashCode7 + (stringResource8 != null ? stringResource8.hashCode() : 0);
        }

        public String toString() {
            return "OrderReceiptContentData(orderReceiptTitle=" + this.orderReceiptTitle + ", orderReceiptDesc=" + this.orderReceiptDesc + ", quantity=" + this.quantity + ", filledQuantity=" + this.filledQuantity + ", avgFilledPrice=" + this.avgFilledPrice + ", buyingPowerEffect=" + this.buyingPowerEffect + ", commissionAndFees=" + this.commissionAndFees + ", totalGoldSavings=" + this.totalGoldSavings + ")";
        }

        public OrderReceiptContentData(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, StringResource stringResource7, StringResource stringResource8) {
            this.orderReceiptTitle = stringResource;
            this.orderReceiptDesc = stringResource2;
            this.quantity = stringResource3;
            this.filledQuantity = stringResource4;
            this.avgFilledPrice = stringResource5;
            this.buyingPowerEffect = stringResource6;
            this.commissionAndFees = stringResource7;
            this.totalGoldSavings = stringResource8;
        }

        public final StringResource getOrderReceiptTitle() {
            return this.orderReceiptTitle;
        }

        public final StringResource getOrderReceiptDesc() {
            return this.orderReceiptDesc;
        }

        public final StringResource getQuantity() {
            return this.quantity;
        }

        public final StringResource getFilledQuantity() {
            return this.filledQuantity;
        }

        public final StringResource getAvgFilledPrice() {
            return this.avgFilledPrice;
        }

        public final StringResource getBuyingPowerEffect() {
            return this.buyingPowerEffect;
        }

        public final StringResource getCommissionAndFees() {
            return this.commissionAndFees;
        }

        public final StringResource getTotalGoldSavings() {
            return this.totalGoldSavings;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormViewState$TextDisplay;", "", "text", "Landroidx/compose/ui/text/input/TextFieldValue;", "useSecondaryColor", "", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Z)V", "getText", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getUseSecondaryColor", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TextDisplay {
        public static final int $stable = 0;
        private final TextFieldValue text;
        private final boolean useSecondaryColor;

        public static /* synthetic */ TextDisplay copy$default(TextDisplay textDisplay, TextFieldValue textFieldValue, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldValue = textDisplay.text;
            }
            if ((i & 2) != 0) {
                z = textDisplay.useSecondaryColor;
            }
            return textDisplay.copy(textFieldValue, z);
        }

        /* renamed from: component1, reason: from getter */
        public final TextFieldValue getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseSecondaryColor() {
            return this.useSecondaryColor;
        }

        public final TextDisplay copy(TextFieldValue text, boolean useSecondaryColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TextDisplay(text, useSecondaryColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextDisplay)) {
                return false;
            }
            TextDisplay textDisplay = (TextDisplay) other;
            return Intrinsics.areEqual(this.text, textDisplay.text) && this.useSecondaryColor == textDisplay.useSecondaryColor;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Boolean.hashCode(this.useSecondaryColor);
        }

        public String toString() {
            return "TextDisplay(text=" + this.text + ", useSecondaryColor=" + this.useSecondaryColor + ")";
        }

        public TextDisplay(TextFieldValue text, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.useSecondaryColor = z;
        }

        public final TextFieldValue getText() {
            return this.text;
        }

        public final boolean getUseSecondaryColor() {
            return this.useSecondaryColor;
        }
    }
}
