package com.robinhood.android.trade.options.profitloss.local;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "", "underlyingPrice", "Ljava/math/BigDecimal;", "profitOrLoss", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getUnderlyingPrice", "()Ljava/math/BigDecimal;", "getProfitOrLoss", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossPoint {
    public static final int $stable = 8;
    private final BigDecimal profitOrLoss;
    private final BigDecimal underlyingPrice;

    public static /* synthetic */ ProfitAndLossPoint copy$default(ProfitAndLossPoint profitAndLossPoint, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = profitAndLossPoint.underlyingPrice;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = profitAndLossPoint.profitOrLoss;
        }
        return profitAndLossPoint.copy(bigDecimal, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getProfitOrLoss() {
        return this.profitOrLoss;
    }

    public final ProfitAndLossPoint copy(BigDecimal underlyingPrice, BigDecimal profitOrLoss) {
        Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
        Intrinsics.checkNotNullParameter(profitOrLoss, "profitOrLoss");
        return new ProfitAndLossPoint(underlyingPrice, profitOrLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossPoint)) {
            return false;
        }
        ProfitAndLossPoint profitAndLossPoint = (ProfitAndLossPoint) other;
        return Intrinsics.areEqual(this.underlyingPrice, profitAndLossPoint.underlyingPrice) && Intrinsics.areEqual(this.profitOrLoss, profitAndLossPoint.profitOrLoss);
    }

    public int hashCode() {
        return (this.underlyingPrice.hashCode() * 31) + this.profitOrLoss.hashCode();
    }

    public String toString() {
        return "ProfitAndLossPoint(underlyingPrice=" + this.underlyingPrice + ", profitOrLoss=" + this.profitOrLoss + ")";
    }

    public ProfitAndLossPoint(BigDecimal underlyingPrice, BigDecimal profitOrLoss) {
        Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
        Intrinsics.checkNotNullParameter(profitOrLoss, "profitOrLoss");
        this.underlyingPrice = underlyingPrice;
        this.profitOrLoss = profitOrLoss;
    }

    public final BigDecimal getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    public final BigDecimal getProfitOrLoss() {
        return this.profitOrLoss;
    }
}
