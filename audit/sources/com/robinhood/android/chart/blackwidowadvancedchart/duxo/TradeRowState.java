package com.robinhood.android.chart.blackwidowadvancedchart.duxo;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvanceChartOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "", "tradeAmountString", "Lcom/robinhood/utils/resource/StringResource;", "hideBuySellButtons", "", "buyButtonText", "buyEnabled", "confirmBuy", "sellButtonText", "sellEnabled", "confirmSell", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/utils/resource/StringResource;ZZ)V", "getTradeAmountString", "()Lcom/robinhood/utils/resource/StringResource;", "getHideBuySellButtons", "()Z", "getBuyButtonText", "getBuyEnabled", "getConfirmBuy", "getSellButtonText", "getSellEnabled", "getConfirmSell", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TradeRowState {
    public static final int $stable = StringResource.$stable;
    private final StringResource buyButtonText;
    private final boolean buyEnabled;
    private final boolean confirmBuy;
    private final boolean confirmSell;
    private final boolean hideBuySellButtons;
    private final StringResource sellButtonText;
    private final boolean sellEnabled;
    private final StringResource tradeAmountString;

    public static /* synthetic */ TradeRowState copy$default(TradeRowState tradeRowState, StringResource stringResource, boolean z, StringResource stringResource2, boolean z2, boolean z3, StringResource stringResource3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = tradeRowState.tradeAmountString;
        }
        if ((i & 2) != 0) {
            z = tradeRowState.hideBuySellButtons;
        }
        if ((i & 4) != 0) {
            stringResource2 = tradeRowState.buyButtonText;
        }
        if ((i & 8) != 0) {
            z2 = tradeRowState.buyEnabled;
        }
        if ((i & 16) != 0) {
            z3 = tradeRowState.confirmBuy;
        }
        if ((i & 32) != 0) {
            stringResource3 = tradeRowState.sellButtonText;
        }
        if ((i & 64) != 0) {
            z4 = tradeRowState.sellEnabled;
        }
        if ((i & 128) != 0) {
            z5 = tradeRowState.confirmSell;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        StringResource stringResource4 = stringResource3;
        return tradeRowState.copy(stringResource, z, stringResource2, z2, z8, stringResource4, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTradeAmountString() {
        return this.tradeAmountString;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHideBuySellButtons() {
        return this.hideBuySellButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getBuyButtonText() {
        return this.buyButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBuyEnabled() {
        return this.buyEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getConfirmBuy() {
        return this.confirmBuy;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getSellButtonText() {
        return this.sellButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getSellEnabled() {
        return this.sellEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getConfirmSell() {
        return this.confirmSell;
    }

    public final TradeRowState copy(StringResource tradeAmountString, boolean hideBuySellButtons, StringResource buyButtonText, boolean buyEnabled, boolean confirmBuy, StringResource sellButtonText, boolean sellEnabled, boolean confirmSell) {
        Intrinsics.checkNotNullParameter(tradeAmountString, "tradeAmountString");
        Intrinsics.checkNotNullParameter(buyButtonText, "buyButtonText");
        Intrinsics.checkNotNullParameter(sellButtonText, "sellButtonText");
        return new TradeRowState(tradeAmountString, hideBuySellButtons, buyButtonText, buyEnabled, confirmBuy, sellButtonText, sellEnabled, confirmSell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeRowState)) {
            return false;
        }
        TradeRowState tradeRowState = (TradeRowState) other;
        return Intrinsics.areEqual(this.tradeAmountString, tradeRowState.tradeAmountString) && this.hideBuySellButtons == tradeRowState.hideBuySellButtons && Intrinsics.areEqual(this.buyButtonText, tradeRowState.buyButtonText) && this.buyEnabled == tradeRowState.buyEnabled && this.confirmBuy == tradeRowState.confirmBuy && Intrinsics.areEqual(this.sellButtonText, tradeRowState.sellButtonText) && this.sellEnabled == tradeRowState.sellEnabled && this.confirmSell == tradeRowState.confirmSell;
    }

    public int hashCode() {
        return (((((((((((((this.tradeAmountString.hashCode() * 31) + Boolean.hashCode(this.hideBuySellButtons)) * 31) + this.buyButtonText.hashCode()) * 31) + Boolean.hashCode(this.buyEnabled)) * 31) + Boolean.hashCode(this.confirmBuy)) * 31) + this.sellButtonText.hashCode()) * 31) + Boolean.hashCode(this.sellEnabled)) * 31) + Boolean.hashCode(this.confirmSell);
    }

    public String toString() {
        return "TradeRowState(tradeAmountString=" + this.tradeAmountString + ", hideBuySellButtons=" + this.hideBuySellButtons + ", buyButtonText=" + this.buyButtonText + ", buyEnabled=" + this.buyEnabled + ", confirmBuy=" + this.confirmBuy + ", sellButtonText=" + this.sellButtonText + ", sellEnabled=" + this.sellEnabled + ", confirmSell=" + this.confirmSell + ")";
    }

    public TradeRowState(StringResource tradeAmountString, boolean z, StringResource buyButtonText, boolean z2, boolean z3, StringResource sellButtonText, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(tradeAmountString, "tradeAmountString");
        Intrinsics.checkNotNullParameter(buyButtonText, "buyButtonText");
        Intrinsics.checkNotNullParameter(sellButtonText, "sellButtonText");
        this.tradeAmountString = tradeAmountString;
        this.hideBuySellButtons = z;
        this.buyButtonText = buyButtonText;
        this.buyEnabled = z2;
        this.confirmBuy = z3;
        this.sellButtonText = sellButtonText;
        this.sellEnabled = z4;
        this.confirmSell = z5;
    }

    public final StringResource getTradeAmountString() {
        return this.tradeAmountString;
    }

    public final boolean getHideBuySellButtons() {
        return this.hideBuySellButtons;
    }

    public final StringResource getBuyButtonText() {
        return this.buyButtonText;
    }

    public final boolean getBuyEnabled() {
        return this.buyEnabled;
    }

    public final boolean getConfirmBuy() {
        return this.confirmBuy;
    }

    public final StringResource getSellButtonText() {
        return this.sellButtonText;
    }

    public final boolean getSellEnabled() {
        return this.sellEnabled;
    }

    public final boolean getConfirmSell() {
        return this.confirmSell;
    }
}
