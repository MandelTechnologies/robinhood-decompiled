package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState4;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallMarketOrderViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderViewState;", "", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "orderSummaryViewState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;", "nbboSummaryViewState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;", "orderConfirmationViewState", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", "<init>", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;)V", "getOrderFormState", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getOrderSummaryViewState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;", "getNbboSummaryViewState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;", "getOrderConfirmationViewState", "()Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarginCallMarketOrderViewState {
    public static final int $stable = 0;
    private final MarginCallMarketOrderViewState2 nbboSummaryViewState;
    private final MarginCallMarketOrderViewState3 orderConfirmationViewState;
    private final OrderForm6 orderFormState;
    private final MarginCallMarketOrderViewState4 orderSummaryViewState;

    public MarginCallMarketOrderViewState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MarginCallMarketOrderViewState copy$default(MarginCallMarketOrderViewState marginCallMarketOrderViewState, OrderForm6 orderForm6, MarginCallMarketOrderViewState4 marginCallMarketOrderViewState4, MarginCallMarketOrderViewState2 marginCallMarketOrderViewState2, MarginCallMarketOrderViewState3 marginCallMarketOrderViewState3, int i, Object obj) {
        if ((i & 1) != 0) {
            orderForm6 = marginCallMarketOrderViewState.orderFormState;
        }
        if ((i & 2) != 0) {
            marginCallMarketOrderViewState4 = marginCallMarketOrderViewState.orderSummaryViewState;
        }
        if ((i & 4) != 0) {
            marginCallMarketOrderViewState2 = marginCallMarketOrderViewState.nbboSummaryViewState;
        }
        if ((i & 8) != 0) {
            marginCallMarketOrderViewState3 = marginCallMarketOrderViewState.orderConfirmationViewState;
        }
        return marginCallMarketOrderViewState.copy(orderForm6, marginCallMarketOrderViewState4, marginCallMarketOrderViewState2, marginCallMarketOrderViewState3);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderForm6 getOrderFormState() {
        return this.orderFormState;
    }

    /* renamed from: component2, reason: from getter */
    public final MarginCallMarketOrderViewState4 getOrderSummaryViewState() {
        return this.orderSummaryViewState;
    }

    /* renamed from: component3, reason: from getter */
    public final MarginCallMarketOrderViewState2 getNbboSummaryViewState() {
        return this.nbboSummaryViewState;
    }

    /* renamed from: component4, reason: from getter */
    public final MarginCallMarketOrderViewState3 getOrderConfirmationViewState() {
        return this.orderConfirmationViewState;
    }

    public final MarginCallMarketOrderViewState copy(OrderForm6 orderFormState, MarginCallMarketOrderViewState4 orderSummaryViewState, MarginCallMarketOrderViewState2 nbboSummaryViewState, MarginCallMarketOrderViewState3 orderConfirmationViewState) {
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(orderSummaryViewState, "orderSummaryViewState");
        return new MarginCallMarketOrderViewState(orderFormState, orderSummaryViewState, nbboSummaryViewState, orderConfirmationViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginCallMarketOrderViewState)) {
            return false;
        }
        MarginCallMarketOrderViewState marginCallMarketOrderViewState = (MarginCallMarketOrderViewState) other;
        return this.orderFormState == marginCallMarketOrderViewState.orderFormState && Intrinsics.areEqual(this.orderSummaryViewState, marginCallMarketOrderViewState.orderSummaryViewState) && Intrinsics.areEqual(this.nbboSummaryViewState, marginCallMarketOrderViewState.nbboSummaryViewState) && Intrinsics.areEqual(this.orderConfirmationViewState, marginCallMarketOrderViewState.orderConfirmationViewState);
    }

    public int hashCode() {
        int iHashCode = ((this.orderFormState.hashCode() * 31) + this.orderSummaryViewState.hashCode()) * 31;
        MarginCallMarketOrderViewState2 marginCallMarketOrderViewState2 = this.nbboSummaryViewState;
        int iHashCode2 = (iHashCode + (marginCallMarketOrderViewState2 == null ? 0 : marginCallMarketOrderViewState2.hashCode())) * 31;
        MarginCallMarketOrderViewState3 marginCallMarketOrderViewState3 = this.orderConfirmationViewState;
        return iHashCode2 + (marginCallMarketOrderViewState3 != null ? marginCallMarketOrderViewState3.hashCode() : 0);
    }

    public String toString() {
        return "MarginCallMarketOrderViewState(orderFormState=" + this.orderFormState + ", orderSummaryViewState=" + this.orderSummaryViewState + ", nbboSummaryViewState=" + this.nbboSummaryViewState + ", orderConfirmationViewState=" + this.orderConfirmationViewState + ")";
    }

    public MarginCallMarketOrderViewState(OrderForm6 orderFormState, MarginCallMarketOrderViewState4 orderSummaryViewState, MarginCallMarketOrderViewState2 marginCallMarketOrderViewState2, MarginCallMarketOrderViewState3 marginCallMarketOrderViewState3) {
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        Intrinsics.checkNotNullParameter(orderSummaryViewState, "orderSummaryViewState");
        this.orderFormState = orderFormState;
        this.orderSummaryViewState = orderSummaryViewState;
        this.nbboSummaryViewState = marginCallMarketOrderViewState2;
        this.orderConfirmationViewState = marginCallMarketOrderViewState3;
    }

    public /* synthetic */ MarginCallMarketOrderViewState(OrderForm6 orderForm6, MarginCallMarketOrderViewState4 marginCallMarketOrderViewState4, MarginCallMarketOrderViewState2 marginCallMarketOrderViewState2, MarginCallMarketOrderViewState3 marginCallMarketOrderViewState3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderForm6.REVIEWING : orderForm6, (i & 2) != 0 ? MarginCallMarketOrderViewState4.Loading.INSTANCE : marginCallMarketOrderViewState4, (i & 4) != 0 ? null : marginCallMarketOrderViewState2, (i & 8) != 0 ? null : marginCallMarketOrderViewState3);
    }

    public final OrderForm6 getOrderFormState() {
        return this.orderFormState;
    }

    public final MarginCallMarketOrderViewState4 getOrderSummaryViewState() {
        return this.orderSummaryViewState;
    }

    public final MarginCallMarketOrderViewState2 getNbboSummaryViewState() {
        return this.nbboSummaryViewState;
    }

    public final MarginCallMarketOrderViewState3 getOrderConfirmationViewState() {
        return this.orderConfirmationViewState;
    }
}
