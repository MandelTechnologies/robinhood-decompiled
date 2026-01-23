package com.robinhood.android.trade.options.profitloss;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/InfoBarValues;", "", "maxLoss", "", "maxProfit", "breakevenPoints", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMaxLoss", "()Ljava/lang/String;", "getMaxProfit", "getBreakevenPoints", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InfoBarValues {
    public static final int $stable = 0;
    private final String breakevenPoints;
    private final String maxLoss;
    private final String maxProfit;

    public static /* synthetic */ InfoBarValues copy$default(InfoBarValues infoBarValues, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoBarValues.maxLoss;
        }
        if ((i & 2) != 0) {
            str2 = infoBarValues.maxProfit;
        }
        if ((i & 4) != 0) {
            str3 = infoBarValues.breakevenPoints;
        }
        return infoBarValues.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMaxLoss() {
        return this.maxLoss;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMaxProfit() {
        return this.maxProfit;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBreakevenPoints() {
        return this.breakevenPoints;
    }

    public final InfoBarValues copy(String maxLoss, String maxProfit, String breakevenPoints) {
        Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
        Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
        Intrinsics.checkNotNullParameter(breakevenPoints, "breakevenPoints");
        return new InfoBarValues(maxLoss, maxProfit, breakevenPoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBarValues)) {
            return false;
        }
        InfoBarValues infoBarValues = (InfoBarValues) other;
        return Intrinsics.areEqual(this.maxLoss, infoBarValues.maxLoss) && Intrinsics.areEqual(this.maxProfit, infoBarValues.maxProfit) && Intrinsics.areEqual(this.breakevenPoints, infoBarValues.breakevenPoints);
    }

    public int hashCode() {
        return (((this.maxLoss.hashCode() * 31) + this.maxProfit.hashCode()) * 31) + this.breakevenPoints.hashCode();
    }

    public String toString() {
        return "InfoBarValues(maxLoss=" + this.maxLoss + ", maxProfit=" + this.maxProfit + ", breakevenPoints=" + this.breakevenPoints + ")";
    }

    public InfoBarValues(String maxLoss, String maxProfit, String breakevenPoints) {
        Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
        Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
        Intrinsics.checkNotNullParameter(breakevenPoints, "breakevenPoints");
        this.maxLoss = maxLoss;
        this.maxProfit = maxProfit;
        this.breakevenPoints = breakevenPoints;
    }

    public final String getMaxLoss() {
        return this.maxLoss;
    }

    public final String getMaxProfit() {
        return this.maxProfit;
    }

    public final String getBreakevenPoints() {
        return this.breakevenPoints;
    }
}
