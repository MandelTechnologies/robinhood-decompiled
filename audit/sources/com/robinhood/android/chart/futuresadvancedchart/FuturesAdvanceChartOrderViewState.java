package com.robinhood.android.chart.futuresadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAdvanceChartOrderViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/chart/futuresadvancedchart/FuturesAdvanceChartOrderViewState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "allowFractional", "", "symbol", "", "instrumentOrderState", "Lcom/robinhood/android/chart/futuresadvancedchart/FuturesOrderState;", "autoSendOrders", "tradeRowState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/android/chart/futuresadvancedchart/FuturesOrderState;ZLcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;)V", "getAllowFractional", "()Z", "getSymbol", "()Ljava/lang/String;", "getInstrumentOrderState", "()Lcom/robinhood/android/chart/futuresadvancedchart/FuturesOrderState;", "getAutoSendOrders", "getTradeRowState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-futures-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FuturesAdvanceChartOrderViewState implements AdvanceChartOrderViewState {
    private final boolean allowFractional;
    private final boolean autoSendOrders;
    private final FuturesOrderState instrumentOrderState;
    private final String symbol;
    private final TradeRowState tradeRowState;

    public static /* synthetic */ FuturesAdvanceChartOrderViewState copy$default(FuturesAdvanceChartOrderViewState futuresAdvanceChartOrderViewState, boolean z, String str, FuturesOrderState futuresOrderState, boolean z2, TradeRowState tradeRowState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = futuresAdvanceChartOrderViewState.allowFractional;
        }
        if ((i & 2) != 0) {
            str = futuresAdvanceChartOrderViewState.symbol;
        }
        if ((i & 4) != 0) {
            futuresOrderState = futuresAdvanceChartOrderViewState.instrumentOrderState;
        }
        if ((i & 8) != 0) {
            z2 = futuresAdvanceChartOrderViewState.autoSendOrders;
        }
        if ((i & 16) != 0) {
            tradeRowState = futuresAdvanceChartOrderViewState.tradeRowState;
        }
        TradeRowState tradeRowState2 = tradeRowState;
        FuturesOrderState futuresOrderState2 = futuresOrderState;
        return futuresAdvanceChartOrderViewState.copy(z, str, futuresOrderState2, z2, tradeRowState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowFractional() {
        return this.allowFractional;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesOrderState getInstrumentOrderState() {
        return this.instrumentOrderState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAutoSendOrders() {
        return this.autoSendOrders;
    }

    /* renamed from: component5, reason: from getter */
    public final TradeRowState getTradeRowState() {
        return this.tradeRowState;
    }

    public final FuturesAdvanceChartOrderViewState copy(boolean allowFractional, String symbol, FuturesOrderState instrumentOrderState, boolean autoSendOrders, TradeRowState tradeRowState) {
        return new FuturesAdvanceChartOrderViewState(allowFractional, symbol, instrumentOrderState, autoSendOrders, tradeRowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAdvanceChartOrderViewState)) {
            return false;
        }
        FuturesAdvanceChartOrderViewState futuresAdvanceChartOrderViewState = (FuturesAdvanceChartOrderViewState) other;
        return this.allowFractional == futuresAdvanceChartOrderViewState.allowFractional && Intrinsics.areEqual(this.symbol, futuresAdvanceChartOrderViewState.symbol) && Intrinsics.areEqual(this.instrumentOrderState, futuresAdvanceChartOrderViewState.instrumentOrderState) && this.autoSendOrders == futuresAdvanceChartOrderViewState.autoSendOrders && Intrinsics.areEqual(this.tradeRowState, futuresAdvanceChartOrderViewState.tradeRowState);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.allowFractional) * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FuturesOrderState futuresOrderState = this.instrumentOrderState;
        int iHashCode3 = (((iHashCode2 + (futuresOrderState == null ? 0 : futuresOrderState.hashCode())) * 31) + Boolean.hashCode(this.autoSendOrders)) * 31;
        TradeRowState tradeRowState = this.tradeRowState;
        return iHashCode3 + (tradeRowState != null ? tradeRowState.hashCode() : 0);
    }

    public String toString() {
        return "FuturesAdvanceChartOrderViewState(allowFractional=" + this.allowFractional + ", symbol=" + this.symbol + ", instrumentOrderState=" + this.instrumentOrderState + ", autoSendOrders=" + this.autoSendOrders + ", tradeRowState=" + this.tradeRowState + ")";
    }

    public FuturesAdvanceChartOrderViewState(boolean z, String str, FuturesOrderState futuresOrderState, boolean z2, TradeRowState tradeRowState) {
        this.allowFractional = z;
        this.symbol = str;
        this.instrumentOrderState = futuresOrderState;
        this.autoSendOrders = z2;
        this.tradeRowState = tradeRowState;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public boolean getAllowFractional() {
        return this.allowFractional;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public String getSymbol() {
        return this.symbol;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public FuturesOrderState getInstrumentOrderState() {
        return this.instrumentOrderState;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public boolean getAutoSendOrders() {
        return this.autoSendOrders;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public TradeRowState getTradeRowState() {
        return this.tradeRowState;
    }
}
