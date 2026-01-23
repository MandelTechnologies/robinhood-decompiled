package com.robinhood.shared.trading.tradeflow;

import com.robinhood.android.lib.trade.C20649R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderInProgressLoadingView.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradeflow/OrderInProgressLoadingState;", "", "submittingText", "", "receivedText", "disclaimerText", "<init>", "(IILjava/lang/Integer;)V", "getSubmittingText", "()I", "getReceivedText", "getDisclaimerText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/robinhood/shared/trading/tradeflow/OrderInProgressLoadingState;", "equals", "", "other", "hashCode", "toString", "", "lib-trade-flow-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderInProgressLoadingState {
    public static final int $stable = 0;
    private final Integer disclaimerText;
    private final int receivedText;
    private final int submittingText;

    public OrderInProgressLoadingState() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ OrderInProgressLoadingState copy$default(OrderInProgressLoadingState orderInProgressLoadingState, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = orderInProgressLoadingState.submittingText;
        }
        if ((i3 & 2) != 0) {
            i2 = orderInProgressLoadingState.receivedText;
        }
        if ((i3 & 4) != 0) {
            num = orderInProgressLoadingState.disclaimerText;
        }
        return orderInProgressLoadingState.copy(i, i2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSubmittingText() {
        return this.submittingText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReceivedText() {
        return this.receivedText;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDisclaimerText() {
        return this.disclaimerText;
    }

    public final OrderInProgressLoadingState copy(int submittingText, int receivedText, Integer disclaimerText) {
        return new OrderInProgressLoadingState(submittingText, receivedText, disclaimerText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInProgressLoadingState)) {
            return false;
        }
        OrderInProgressLoadingState orderInProgressLoadingState = (OrderInProgressLoadingState) other;
        return this.submittingText == orderInProgressLoadingState.submittingText && this.receivedText == orderInProgressLoadingState.receivedText && Intrinsics.areEqual(this.disclaimerText, orderInProgressLoadingState.disclaimerText);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.submittingText) * 31) + Integer.hashCode(this.receivedText)) * 31;
        Integer num = this.disclaimerText;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "OrderInProgressLoadingState(submittingText=" + this.submittingText + ", receivedText=" + this.receivedText + ", disclaimerText=" + this.disclaimerText + ")";
    }

    public OrderInProgressLoadingState(int i, int i2, Integer num) {
        this.submittingText = i;
        this.receivedText = i2;
        this.disclaimerText = num;
    }

    public /* synthetic */ OrderInProgressLoadingState(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C20649R.string.order_review_status_submitting : i, (i3 & 2) != 0 ? C20649R.string.order_review_status_received : i2, (i3 & 4) != 0 ? Integer.valueOf(C20649R.string.order_confirmation_disclaimer) : num);
    }

    public final int getSubmittingText() {
        return this.submittingText;
    }

    public final int getReceivedText() {
        return this.receivedText;
    }

    public final Integer getDisclaimerText() {
        return this.disclaimerText;
    }
}
