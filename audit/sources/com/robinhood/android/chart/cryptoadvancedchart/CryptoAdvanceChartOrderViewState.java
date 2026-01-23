package com.robinhood.android.chart.cryptoadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAdvanceChartOrderViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/chart/cryptoadvancedchart/CryptoAdvanceChartOrderViewState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "allowFractional", "", "symbol", "", "instrumentOrderState", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "autoSendOrders", "tradeRowState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;ZLcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;)V", "getAllowFractional", "()Z", "getSymbol", "()Ljava/lang/String;", "getInstrumentOrderState", "()Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "getAutoSendOrders", "getTradeRowState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-crypto-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CryptoAdvanceChartOrderViewState implements AdvanceChartOrderViewState {
    private final boolean allowFractional;
    private final boolean autoSendOrders;
    private final InstrumentOrderState instrumentOrderState;
    private final String symbol;
    private final TradeRowState tradeRowState;

    public CryptoAdvanceChartOrderViewState() {
        this(false, null, null, false, null, 31, null);
    }

    public static /* synthetic */ CryptoAdvanceChartOrderViewState copy$default(CryptoAdvanceChartOrderViewState cryptoAdvanceChartOrderViewState, boolean z, String str, InstrumentOrderState instrumentOrderState, boolean z2, TradeRowState tradeRowState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoAdvanceChartOrderViewState.allowFractional;
        }
        if ((i & 2) != 0) {
            str = cryptoAdvanceChartOrderViewState.symbol;
        }
        if ((i & 4) != 0) {
            instrumentOrderState = cryptoAdvanceChartOrderViewState.instrumentOrderState;
        }
        if ((i & 8) != 0) {
            z2 = cryptoAdvanceChartOrderViewState.autoSendOrders;
        }
        if ((i & 16) != 0) {
            tradeRowState = cryptoAdvanceChartOrderViewState.tradeRowState;
        }
        TradeRowState tradeRowState2 = tradeRowState;
        InstrumentOrderState instrumentOrderState2 = instrumentOrderState;
        return cryptoAdvanceChartOrderViewState.copy(z, str, instrumentOrderState2, z2, tradeRowState2);
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
    public final InstrumentOrderState getInstrumentOrderState() {
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

    public final CryptoAdvanceChartOrderViewState copy(boolean allowFractional, String symbol, InstrumentOrderState instrumentOrderState, boolean autoSendOrders, TradeRowState tradeRowState) {
        return new CryptoAdvanceChartOrderViewState(allowFractional, symbol, instrumentOrderState, autoSendOrders, tradeRowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoAdvanceChartOrderViewState)) {
            return false;
        }
        CryptoAdvanceChartOrderViewState cryptoAdvanceChartOrderViewState = (CryptoAdvanceChartOrderViewState) other;
        return this.allowFractional == cryptoAdvanceChartOrderViewState.allowFractional && Intrinsics.areEqual(this.symbol, cryptoAdvanceChartOrderViewState.symbol) && Intrinsics.areEqual(this.instrumentOrderState, cryptoAdvanceChartOrderViewState.instrumentOrderState) && this.autoSendOrders == cryptoAdvanceChartOrderViewState.autoSendOrders && Intrinsics.areEqual(this.tradeRowState, cryptoAdvanceChartOrderViewState.tradeRowState);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.allowFractional) * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InstrumentOrderState instrumentOrderState = this.instrumentOrderState;
        int iHashCode3 = (((iHashCode2 + (instrumentOrderState == null ? 0 : instrumentOrderState.hashCode())) * 31) + Boolean.hashCode(this.autoSendOrders)) * 31;
        TradeRowState tradeRowState = this.tradeRowState;
        return iHashCode3 + (tradeRowState != null ? tradeRowState.hashCode() : 0);
    }

    public String toString() {
        return "CryptoAdvanceChartOrderViewState(allowFractional=" + this.allowFractional + ", symbol=" + this.symbol + ", instrumentOrderState=" + this.instrumentOrderState + ", autoSendOrders=" + this.autoSendOrders + ", tradeRowState=" + this.tradeRowState + ")";
    }

    public CryptoAdvanceChartOrderViewState(boolean z, String str, InstrumentOrderState instrumentOrderState, boolean z2, TradeRowState tradeRowState) {
        this.allowFractional = z;
        this.symbol = str;
        this.instrumentOrderState = instrumentOrderState;
        this.autoSendOrders = z2;
        this.tradeRowState = tradeRowState;
    }

    public /* synthetic */ CryptoAdvanceChartOrderViewState(boolean z, String str, InstrumentOrderState instrumentOrderState, boolean z2, TradeRowState tradeRowState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : instrumentOrderState, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : tradeRowState);
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
    public InstrumentOrderState getInstrumentOrderState() {
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
