package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeAmountInputRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeAmountInputRowState;", "", "inputAmountText", "", "secondaryText", "currencySwitcherState", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;)V", "getInputAmountText", "()Ljava/lang/String;", "getSecondaryText", "getCurrencySwitcherState", "()Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CurrencySwitcherState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoQuickTradeAmountInputRowState {
    public static final int $stable = 0;
    private final CryptoInputRowCurrencyToggle4 currencySwitcherState;
    private final String inputAmountText;
    private final String secondaryText;

    public static /* synthetic */ CryptoQuickTradeAmountInputRowState copy$default(CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState, String str, String str2, CryptoInputRowCurrencyToggle4 cryptoInputRowCurrencyToggle4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoQuickTradeAmountInputRowState.inputAmountText;
        }
        if ((i & 2) != 0) {
            str2 = cryptoQuickTradeAmountInputRowState.secondaryText;
        }
        if ((i & 4) != 0) {
            cryptoInputRowCurrencyToggle4 = cryptoQuickTradeAmountInputRowState.currencySwitcherState;
        }
        return cryptoQuickTradeAmountInputRowState.copy(str, str2, cryptoInputRowCurrencyToggle4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInputAmountText() {
        return this.inputAmountText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoInputRowCurrencyToggle4 getCurrencySwitcherState() {
        return this.currencySwitcherState;
    }

    public final CryptoQuickTradeAmountInputRowState copy(String inputAmountText, String secondaryText, CryptoInputRowCurrencyToggle4 currencySwitcherState) {
        Intrinsics.checkNotNullParameter(inputAmountText, "inputAmountText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(currencySwitcherState, "currencySwitcherState");
        return new CryptoQuickTradeAmountInputRowState(inputAmountText, secondaryText, currencySwitcherState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoQuickTradeAmountInputRowState)) {
            return false;
        }
        CryptoQuickTradeAmountInputRowState cryptoQuickTradeAmountInputRowState = (CryptoQuickTradeAmountInputRowState) other;
        return Intrinsics.areEqual(this.inputAmountText, cryptoQuickTradeAmountInputRowState.inputAmountText) && Intrinsics.areEqual(this.secondaryText, cryptoQuickTradeAmountInputRowState.secondaryText) && Intrinsics.areEqual(this.currencySwitcherState, cryptoQuickTradeAmountInputRowState.currencySwitcherState);
    }

    public int hashCode() {
        return (((this.inputAmountText.hashCode() * 31) + this.secondaryText.hashCode()) * 31) + this.currencySwitcherState.hashCode();
    }

    public String toString() {
        return "CryptoQuickTradeAmountInputRowState(inputAmountText=" + this.inputAmountText + ", secondaryText=" + this.secondaryText + ", currencySwitcherState=" + this.currencySwitcherState + ")";
    }

    public CryptoQuickTradeAmountInputRowState(String inputAmountText, String secondaryText, CryptoInputRowCurrencyToggle4 currencySwitcherState) {
        Intrinsics.checkNotNullParameter(inputAmountText, "inputAmountText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(currencySwitcherState, "currencySwitcherState");
        this.inputAmountText = inputAmountText;
        this.secondaryText = secondaryText;
        this.currencySwitcherState = currencySwitcherState;
    }

    public final String getInputAmountText() {
        return this.inputAmountText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final CryptoInputRowCurrencyToggle4 getCurrencySwitcherState() {
        return this.currencySwitcherState;
    }
}
