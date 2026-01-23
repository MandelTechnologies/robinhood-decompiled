package com.robinhood.android.trade.options.bidaskbar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderBidAskBarLoggingState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/bidaskbar/OptionOrderBidAskBarLoggingState;", "", "bid", "", "mark", "ask", "selectedPrice", "inputType", "Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarInputType;", "<init>", "(DDDDLcom/robinhood/android/trade/options/bidaskbar/BidAskBarInputType;)V", "getBid", "()D", "getMark", "getAsk", "getSelectedPrice", "getInputType", "()Lcom/robinhood/android/trade/options/bidaskbar/BidAskBarInputType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderBidAskBarLoggingState {
    public static final int $stable = 0;
    private final double ask;
    private final double bid;
    private final OptionOrderBidAskBarViewState2 inputType;
    private final double mark;
    private final double selectedPrice;

    public static /* synthetic */ OptionOrderBidAskBarLoggingState copy$default(OptionOrderBidAskBarLoggingState optionOrderBidAskBarLoggingState, double d, double d2, double d3, double d4, OptionOrderBidAskBarViewState2 optionOrderBidAskBarViewState2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = optionOrderBidAskBarLoggingState.bid;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = optionOrderBidAskBarLoggingState.mark;
        }
        return optionOrderBidAskBarLoggingState.copy(d5, d2, (i & 4) != 0 ? optionOrderBidAskBarLoggingState.ask : d3, (i & 8) != 0 ? optionOrderBidAskBarLoggingState.selectedPrice : d4, (i & 16) != 0 ? optionOrderBidAskBarLoggingState.inputType : optionOrderBidAskBarViewState2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getBid() {
        return this.bid;
    }

    /* renamed from: component2, reason: from getter */
    public final double getMark() {
        return this.mark;
    }

    /* renamed from: component3, reason: from getter */
    public final double getAsk() {
        return this.ask;
    }

    /* renamed from: component4, reason: from getter */
    public final double getSelectedPrice() {
        return this.selectedPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionOrderBidAskBarViewState2 getInputType() {
        return this.inputType;
    }

    public final OptionOrderBidAskBarLoggingState copy(double bid, double mark, double ask, double selectedPrice, OptionOrderBidAskBarViewState2 inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        return new OptionOrderBidAskBarLoggingState(bid, mark, ask, selectedPrice, inputType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderBidAskBarLoggingState)) {
            return false;
        }
        OptionOrderBidAskBarLoggingState optionOrderBidAskBarLoggingState = (OptionOrderBidAskBarLoggingState) other;
        return Double.compare(this.bid, optionOrderBidAskBarLoggingState.bid) == 0 && Double.compare(this.mark, optionOrderBidAskBarLoggingState.mark) == 0 && Double.compare(this.ask, optionOrderBidAskBarLoggingState.ask) == 0 && Double.compare(this.selectedPrice, optionOrderBidAskBarLoggingState.selectedPrice) == 0 && this.inputType == optionOrderBidAskBarLoggingState.inputType;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.bid) * 31) + Double.hashCode(this.mark)) * 31) + Double.hashCode(this.ask)) * 31) + Double.hashCode(this.selectedPrice)) * 31) + this.inputType.hashCode();
    }

    public String toString() {
        return "OptionOrderBidAskBarLoggingState(bid=" + this.bid + ", mark=" + this.mark + ", ask=" + this.ask + ", selectedPrice=" + this.selectedPrice + ", inputType=" + this.inputType + ")";
    }

    public OptionOrderBidAskBarLoggingState(double d, double d2, double d3, double d4, OptionOrderBidAskBarViewState2 inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.bid = d;
        this.mark = d2;
        this.ask = d3;
        this.selectedPrice = d4;
        this.inputType = inputType;
    }

    public final double getBid() {
        return this.bid;
    }

    public final double getMark() {
        return this.mark;
    }

    public final double getAsk() {
        return this.ask;
    }

    public final double getSelectedPrice() {
        return this.selectedPrice;
    }

    public final OptionOrderBidAskBarViewState2 getInputType() {
        return this.inputType;
    }
}
