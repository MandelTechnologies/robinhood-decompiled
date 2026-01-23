package com.robinhood.shared.common.lib.formats.currency;

import com.robinhood.utils.money.Currencies;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyInputInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputInfo;", "", "symbol", "", "decimalScale", "", "isFiatCurrency", "", "isUsd", "<init>", "(Ljava/lang/String;IZZ)V", "getDecimalScale", "()I", "()Z", "displaySymbol", "getDisplaySymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "lib-formats-currency_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class CurrencyInputInfo {
    private final int decimalScale;
    private final boolean isFiatCurrency;
    private final boolean isUsd;
    private final String symbol;

    /* renamed from: component1, reason: from getter */
    private final String getSymbol() {
        return this.symbol;
    }

    public static /* synthetic */ CurrencyInputInfo copy$default(CurrencyInputInfo currencyInputInfo, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = currencyInputInfo.symbol;
        }
        if ((i2 & 2) != 0) {
            i = currencyInputInfo.decimalScale;
        }
        if ((i2 & 4) != 0) {
            z = currencyInputInfo.isFiatCurrency;
        }
        if ((i2 & 8) != 0) {
            z2 = currencyInputInfo.isUsd;
        }
        return currencyInputInfo.copy(str, i, z, z2);
    }

    /* renamed from: component2, reason: from getter */
    public final int getDecimalScale() {
        return this.decimalScale;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFiatCurrency() {
        return this.isFiatCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUsd() {
        return this.isUsd;
    }

    public final CurrencyInputInfo copy(String symbol, int decimalScale, boolean isFiatCurrency, boolean isUsd) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new CurrencyInputInfo(symbol, decimalScale, isFiatCurrency, isUsd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyInputInfo)) {
            return false;
        }
        CurrencyInputInfo currencyInputInfo = (CurrencyInputInfo) other;
        return Intrinsics.areEqual(this.symbol, currencyInputInfo.symbol) && this.decimalScale == currencyInputInfo.decimalScale && this.isFiatCurrency == currencyInputInfo.isFiatCurrency && this.isUsd == currencyInputInfo.isUsd;
    }

    public int hashCode() {
        return (((((this.symbol.hashCode() * 31) + Integer.hashCode(this.decimalScale)) * 31) + Boolean.hashCode(this.isFiatCurrency)) * 31) + Boolean.hashCode(this.isUsd);
    }

    public String toString() {
        return "CurrencyInputInfo(symbol=" + this.symbol + ", decimalScale=" + this.decimalScale + ", isFiatCurrency=" + this.isFiatCurrency + ", isUsd=" + this.isUsd + ")";
    }

    public CurrencyInputInfo(String symbol, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.decimalScale = i;
        this.isFiatCurrency = z;
        this.isUsd = z2;
    }

    public final int getDecimalScale() {
        return this.decimalScale;
    }

    public final boolean isFiatCurrency() {
        return this.isFiatCurrency;
    }

    public final boolean isUsd() {
        return this.isUsd;
    }

    public final String getDisplaySymbol() {
        if (this.isUsd) {
            String symbol = Currencies.USD.getSymbol(Locale.US);
            Intrinsics.checkNotNull(symbol);
            return symbol;
        }
        return this.symbol;
    }
}
