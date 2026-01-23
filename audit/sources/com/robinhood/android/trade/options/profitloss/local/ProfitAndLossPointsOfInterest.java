package com.robinhood.android.trade.options.profitloss.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPointsOfInterest;", "", "pricesOfInterest", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "breakevenPrices", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPricesOfInterest", "()Ljava/util/List;", "getBreakevenPrices", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossPointsOfInterest {
    public static final int $stable = 8;
    private final List<ProfitAndLossPoint> breakevenPrices;
    private final List<ProfitAndLossPoint> pricesOfInterest;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfitAndLossPointsOfInterest copy$default(ProfitAndLossPointsOfInterest profitAndLossPointsOfInterest, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profitAndLossPointsOfInterest.pricesOfInterest;
        }
        if ((i & 2) != 0) {
            list2 = profitAndLossPointsOfInterest.breakevenPrices;
        }
        return profitAndLossPointsOfInterest.copy(list, list2);
    }

    public final List<ProfitAndLossPoint> component1() {
        return this.pricesOfInterest;
    }

    public final List<ProfitAndLossPoint> component2() {
        return this.breakevenPrices;
    }

    public final ProfitAndLossPointsOfInterest copy(List<ProfitAndLossPoint> pricesOfInterest, List<ProfitAndLossPoint> breakevenPrices) {
        Intrinsics.checkNotNullParameter(pricesOfInterest, "pricesOfInterest");
        Intrinsics.checkNotNullParameter(breakevenPrices, "breakevenPrices");
        return new ProfitAndLossPointsOfInterest(pricesOfInterest, breakevenPrices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossPointsOfInterest)) {
            return false;
        }
        ProfitAndLossPointsOfInterest profitAndLossPointsOfInterest = (ProfitAndLossPointsOfInterest) other;
        return Intrinsics.areEqual(this.pricesOfInterest, profitAndLossPointsOfInterest.pricesOfInterest) && Intrinsics.areEqual(this.breakevenPrices, profitAndLossPointsOfInterest.breakevenPrices);
    }

    public int hashCode() {
        return (this.pricesOfInterest.hashCode() * 31) + this.breakevenPrices.hashCode();
    }

    public String toString() {
        return "ProfitAndLossPointsOfInterest(pricesOfInterest=" + this.pricesOfInterest + ", breakevenPrices=" + this.breakevenPrices + ")";
    }

    public ProfitAndLossPointsOfInterest(List<ProfitAndLossPoint> pricesOfInterest, List<ProfitAndLossPoint> breakevenPrices) {
        Intrinsics.checkNotNullParameter(pricesOfInterest, "pricesOfInterest");
        Intrinsics.checkNotNullParameter(breakevenPrices, "breakevenPrices");
        this.pricesOfInterest = pricesOfInterest;
        this.breakevenPrices = breakevenPrices;
    }

    public final List<ProfitAndLossPoint> getPricesOfInterest() {
        return this.pricesOfInterest;
    }

    public final List<ProfitAndLossPoint> getBreakevenPrices() {
        return this.breakevenPrices;
    }
}
