package com.robinhood.android.trade.options.profitloss.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossMetrics.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "", "breakevenPoints", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "maxProfit", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "maxLoss", "<init>", "(Ljava/util/List;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;)V", "getBreakevenPoints", "()Ljava/util/List;", "getMaxProfit", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "getMaxLoss", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossMetrics {
    public static final int $stable = 8;
    private final List<ProfitAndLossPoint> breakevenPoints;
    private final ProfitAndLossLimit maxLoss;
    private final ProfitAndLossLimit maxProfit;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfitAndLossMetrics copy$default(ProfitAndLossMetrics profitAndLossMetrics, List list, ProfitAndLossLimit profitAndLossLimit, ProfitAndLossLimit profitAndLossLimit2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profitAndLossMetrics.breakevenPoints;
        }
        if ((i & 2) != 0) {
            profitAndLossLimit = profitAndLossMetrics.maxProfit;
        }
        if ((i & 4) != 0) {
            profitAndLossLimit2 = profitAndLossMetrics.maxLoss;
        }
        return profitAndLossMetrics.copy(list, profitAndLossLimit, profitAndLossLimit2);
    }

    public final List<ProfitAndLossPoint> component1() {
        return this.breakevenPoints;
    }

    /* renamed from: component2, reason: from getter */
    public final ProfitAndLossLimit getMaxProfit() {
        return this.maxProfit;
    }

    /* renamed from: component3, reason: from getter */
    public final ProfitAndLossLimit getMaxLoss() {
        return this.maxLoss;
    }

    public final ProfitAndLossMetrics copy(List<ProfitAndLossPoint> breakevenPoints, ProfitAndLossLimit maxProfit, ProfitAndLossLimit maxLoss) {
        Intrinsics.checkNotNullParameter(breakevenPoints, "breakevenPoints");
        Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
        Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
        return new ProfitAndLossMetrics(breakevenPoints, maxProfit, maxLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossMetrics)) {
            return false;
        }
        ProfitAndLossMetrics profitAndLossMetrics = (ProfitAndLossMetrics) other;
        return Intrinsics.areEqual(this.breakevenPoints, profitAndLossMetrics.breakevenPoints) && Intrinsics.areEqual(this.maxProfit, profitAndLossMetrics.maxProfit) && Intrinsics.areEqual(this.maxLoss, profitAndLossMetrics.maxLoss);
    }

    public int hashCode() {
        return (((this.breakevenPoints.hashCode() * 31) + this.maxProfit.hashCode()) * 31) + this.maxLoss.hashCode();
    }

    public String toString() {
        return "ProfitAndLossMetrics(breakevenPoints=" + this.breakevenPoints + ", maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ")";
    }

    public ProfitAndLossMetrics(List<ProfitAndLossPoint> breakevenPoints, ProfitAndLossLimit maxProfit, ProfitAndLossLimit maxLoss) {
        Intrinsics.checkNotNullParameter(breakevenPoints, "breakevenPoints");
        Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
        Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
        this.breakevenPoints = breakevenPoints;
        this.maxProfit = maxProfit;
        this.maxLoss = maxLoss;
    }

    public final List<ProfitAndLossPoint> getBreakevenPoints() {
        return this.breakevenPoints;
    }

    public final ProfitAndLossLimit getMaxProfit() {
        return this.maxProfit;
    }

    public final ProfitAndLossLimit getMaxLoss() {
        return this.maxLoss;
    }
}
