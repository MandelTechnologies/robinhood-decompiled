package com.robinhood.android.lib.store.mcw.data;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversionFxRate.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/ConversionFxRate;", "", "symbolId", "", "symbol", "bidPrice", "Ljava/math/BigDecimal;", "askPrice", "feePercent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getSymbolId", "()Ljava/lang/String;", "getSymbol", "getBidPrice", "()Ljava/math/BigDecimal;", "getAskPrice", "getFeePercent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConversionFxRate {
    public static final int $stable = 8;
    private final BigDecimal askPrice;
    private final BigDecimal bidPrice;
    private final BigDecimal feePercent;
    private final String symbol;
    private final String symbolId;

    public static /* synthetic */ ConversionFxRate copy$default(ConversionFxRate conversionFxRate, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversionFxRate.symbolId;
        }
        if ((i & 2) != 0) {
            str2 = conversionFxRate.symbol;
        }
        if ((i & 4) != 0) {
            bigDecimal = conversionFxRate.bidPrice;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = conversionFxRate.askPrice;
        }
        if ((i & 16) != 0) {
            bigDecimal3 = conversionFxRate.feePercent;
        }
        BigDecimal bigDecimal4 = bigDecimal3;
        BigDecimal bigDecimal5 = bigDecimal;
        return conversionFxRate.copy(str, str2, bigDecimal5, bigDecimal2, bigDecimal4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSymbolId() {
        return this.symbolId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getBidPrice() {
        return this.bidPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAskPrice() {
        return this.askPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getFeePercent() {
        return this.feePercent;
    }

    public final ConversionFxRate copy(String symbolId, String symbol, BigDecimal bidPrice, BigDecimal askPrice, BigDecimal feePercent) {
        Intrinsics.checkNotNullParameter(symbolId, "symbolId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(feePercent, "feePercent");
        return new ConversionFxRate(symbolId, symbol, bidPrice, askPrice, feePercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversionFxRate)) {
            return false;
        }
        ConversionFxRate conversionFxRate = (ConversionFxRate) other;
        return Intrinsics.areEqual(this.symbolId, conversionFxRate.symbolId) && Intrinsics.areEqual(this.symbol, conversionFxRate.symbol) && Intrinsics.areEqual(this.bidPrice, conversionFxRate.bidPrice) && Intrinsics.areEqual(this.askPrice, conversionFxRate.askPrice) && Intrinsics.areEqual(this.feePercent, conversionFxRate.feePercent);
    }

    public int hashCode() {
        return (((((((this.symbolId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.bidPrice.hashCode()) * 31) + this.askPrice.hashCode()) * 31) + this.feePercent.hashCode();
    }

    public String toString() {
        return "ConversionFxRate(symbolId=" + this.symbolId + ", symbol=" + this.symbol + ", bidPrice=" + this.bidPrice + ", askPrice=" + this.askPrice + ", feePercent=" + this.feePercent + ")";
    }

    public ConversionFxRate(String symbolId, String symbol, BigDecimal bidPrice, BigDecimal askPrice, BigDecimal feePercent) {
        Intrinsics.checkNotNullParameter(symbolId, "symbolId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(feePercent, "feePercent");
        this.symbolId = symbolId;
        this.symbol = symbol;
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
        this.feePercent = feePercent;
    }

    public final String getSymbolId() {
        return this.symbolId;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final BigDecimal getBidPrice() {
        return this.bidPrice;
    }

    public final BigDecimal getAskPrice() {
        return this.askPrice;
    }

    public final BigDecimal getFeePercent() {
        return this.feePercent;
    }
}
