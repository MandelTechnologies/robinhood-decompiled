package com.robinhood.android.trade.options.profitloss.local;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossBounds;", "", "lowerBound", "Ljava/math/BigDecimal;", "upperBound", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getLowerBound", "()Ljava/math/BigDecimal;", "getUpperBound", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossBounds {
    public static final int $stable = 8;
    private final BigDecimal lowerBound;
    private final BigDecimal upperBound;

    public static /* synthetic */ ProfitAndLossBounds copy$default(ProfitAndLossBounds profitAndLossBounds, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = profitAndLossBounds.lowerBound;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = profitAndLossBounds.upperBound;
        }
        return profitAndLossBounds.copy(bigDecimal, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getLowerBound() {
        return this.lowerBound;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getUpperBound() {
        return this.upperBound;
    }

    public final ProfitAndLossBounds copy(BigDecimal lowerBound, BigDecimal upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return new ProfitAndLossBounds(lowerBound, upperBound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossBounds)) {
            return false;
        }
        ProfitAndLossBounds profitAndLossBounds = (ProfitAndLossBounds) other;
        return Intrinsics.areEqual(this.lowerBound, profitAndLossBounds.lowerBound) && Intrinsics.areEqual(this.upperBound, profitAndLossBounds.upperBound);
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public String toString() {
        return "ProfitAndLossBounds(lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ")";
    }

    public ProfitAndLossBounds(BigDecimal lowerBound, BigDecimal upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public final BigDecimal getLowerBound() {
        return this.lowerBound;
    }

    public final BigDecimal getUpperBound() {
        return this.upperBound;
    }
}
