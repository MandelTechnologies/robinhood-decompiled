package com.robinhood.android.trade.options.profitloss.local;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003HÆ\u0003J\u0015\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\t\u00108\u001a\u00020\u0012HÆ\u0003JÕ\u0001\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChart;", "", "sampledPoints", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "pricesOfInterest", "breakevenPoints", "positiveSparklines", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossSegment;", "negativeSparklines", "positiveAreas", "negativeAreas", "minX", "Ljava/math/BigDecimal;", "maxX", "minY", "maxY", "limitAtZero", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "limitAtInfinity", "maxProfit", "maxLoss", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;)V", "getSampledPoints", "()Ljava/util/List;", "getPricesOfInterest", "getBreakevenPoints", "getPositiveSparklines", "getNegativeSparklines", "getPositiveAreas", "getNegativeAreas", "getMinX", "()Ljava/math/BigDecimal;", "getMaxX", "getMinY", "getMaxY", "getLimitAtZero", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "getLimitAtInfinity", "getMaxProfit", "getMaxLoss", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossChart {
    public static final int $stable = 8;
    private final List<ProfitAndLossPoint> breakevenPoints;
    private final ProfitAndLossLimit limitAtInfinity;
    private final ProfitAndLossLimit limitAtZero;
    private final ProfitAndLossLimit maxLoss;
    private final ProfitAndLossLimit maxProfit;
    private final BigDecimal maxX;
    private final BigDecimal maxY;
    private final BigDecimal minX;
    private final BigDecimal minY;
    private final List<List<ProfitAndLossSegment>> negativeAreas;
    private final List<ProfitAndLossSegment> negativeSparklines;
    private final List<List<ProfitAndLossSegment>> positiveAreas;
    private final List<ProfitAndLossSegment> positiveSparklines;
    private final List<ProfitAndLossPoint> pricesOfInterest;
    private final List<ProfitAndLossPoint> sampledPoints;

    public final List<ProfitAndLossPoint> component1() {
        return this.sampledPoints;
    }

    /* renamed from: component10, reason: from getter */
    public final BigDecimal getMinY() {
        return this.minY;
    }

    /* renamed from: component11, reason: from getter */
    public final BigDecimal getMaxY() {
        return this.maxY;
    }

    /* renamed from: component12, reason: from getter */
    public final ProfitAndLossLimit getLimitAtZero() {
        return this.limitAtZero;
    }

    /* renamed from: component13, reason: from getter */
    public final ProfitAndLossLimit getLimitAtInfinity() {
        return this.limitAtInfinity;
    }

    /* renamed from: component14, reason: from getter */
    public final ProfitAndLossLimit getMaxProfit() {
        return this.maxProfit;
    }

    /* renamed from: component15, reason: from getter */
    public final ProfitAndLossLimit getMaxLoss() {
        return this.maxLoss;
    }

    public final List<ProfitAndLossPoint> component2() {
        return this.pricesOfInterest;
    }

    public final List<ProfitAndLossPoint> component3() {
        return this.breakevenPoints;
    }

    public final List<ProfitAndLossSegment> component4() {
        return this.positiveSparklines;
    }

    public final List<ProfitAndLossSegment> component5() {
        return this.negativeSparklines;
    }

    public final List<List<ProfitAndLossSegment>> component6() {
        return this.positiveAreas;
    }

    public final List<List<ProfitAndLossSegment>> component7() {
        return this.negativeAreas;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getMinX() {
        return this.minX;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getMaxX() {
        return this.maxX;
    }

    public final ProfitAndLossChart copy(List<ProfitAndLossPoint> sampledPoints, List<ProfitAndLossPoint> pricesOfInterest, List<ProfitAndLossPoint> breakevenPoints, List<ProfitAndLossSegment> positiveSparklines, List<ProfitAndLossSegment> negativeSparklines, List<? extends List<ProfitAndLossSegment>> positiveAreas, List<? extends List<ProfitAndLossSegment>> negativeAreas, BigDecimal minX, BigDecimal maxX, BigDecimal minY, BigDecimal maxY, ProfitAndLossLimit limitAtZero, ProfitAndLossLimit limitAtInfinity, ProfitAndLossLimit maxProfit, ProfitAndLossLimit maxLoss) {
        Intrinsics.checkNotNullParameter(sampledPoints, "sampledPoints");
        Intrinsics.checkNotNullParameter(pricesOfInterest, "pricesOfInterest");
        Intrinsics.checkNotNullParameter(breakevenPoints, "breakevenPoints");
        Intrinsics.checkNotNullParameter(positiveSparklines, "positiveSparklines");
        Intrinsics.checkNotNullParameter(negativeSparklines, "negativeSparklines");
        Intrinsics.checkNotNullParameter(positiveAreas, "positiveAreas");
        Intrinsics.checkNotNullParameter(negativeAreas, "negativeAreas");
        Intrinsics.checkNotNullParameter(minX, "minX");
        Intrinsics.checkNotNullParameter(maxX, "maxX");
        Intrinsics.checkNotNullParameter(minY, "minY");
        Intrinsics.checkNotNullParameter(maxY, "maxY");
        Intrinsics.checkNotNullParameter(limitAtZero, "limitAtZero");
        Intrinsics.checkNotNullParameter(limitAtInfinity, "limitAtInfinity");
        Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
        Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
        return new ProfitAndLossChart(sampledPoints, pricesOfInterest, breakevenPoints, positiveSparklines, negativeSparklines, positiveAreas, negativeAreas, minX, maxX, minY, maxY, limitAtZero, limitAtInfinity, maxProfit, maxLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossChart)) {
            return false;
        }
        ProfitAndLossChart profitAndLossChart = (ProfitAndLossChart) other;
        return Intrinsics.areEqual(this.sampledPoints, profitAndLossChart.sampledPoints) && Intrinsics.areEqual(this.pricesOfInterest, profitAndLossChart.pricesOfInterest) && Intrinsics.areEqual(this.breakevenPoints, profitAndLossChart.breakevenPoints) && Intrinsics.areEqual(this.positiveSparklines, profitAndLossChart.positiveSparklines) && Intrinsics.areEqual(this.negativeSparklines, profitAndLossChart.negativeSparklines) && Intrinsics.areEqual(this.positiveAreas, profitAndLossChart.positiveAreas) && Intrinsics.areEqual(this.negativeAreas, profitAndLossChart.negativeAreas) && Intrinsics.areEqual(this.minX, profitAndLossChart.minX) && Intrinsics.areEqual(this.maxX, profitAndLossChart.maxX) && Intrinsics.areEqual(this.minY, profitAndLossChart.minY) && Intrinsics.areEqual(this.maxY, profitAndLossChart.maxY) && Intrinsics.areEqual(this.limitAtZero, profitAndLossChart.limitAtZero) && Intrinsics.areEqual(this.limitAtInfinity, profitAndLossChart.limitAtInfinity) && Intrinsics.areEqual(this.maxProfit, profitAndLossChart.maxProfit) && Intrinsics.areEqual(this.maxLoss, profitAndLossChart.maxLoss);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.sampledPoints.hashCode() * 31) + this.pricesOfInterest.hashCode()) * 31) + this.breakevenPoints.hashCode()) * 31) + this.positiveSparklines.hashCode()) * 31) + this.negativeSparklines.hashCode()) * 31) + this.positiveAreas.hashCode()) * 31) + this.negativeAreas.hashCode()) * 31) + this.minX.hashCode()) * 31) + this.maxX.hashCode()) * 31) + this.minY.hashCode()) * 31) + this.maxY.hashCode()) * 31) + this.limitAtZero.hashCode()) * 31) + this.limitAtInfinity.hashCode()) * 31) + this.maxProfit.hashCode()) * 31) + this.maxLoss.hashCode();
    }

    public String toString() {
        return "ProfitAndLossChart(sampledPoints=" + this.sampledPoints + ", pricesOfInterest=" + this.pricesOfInterest + ", breakevenPoints=" + this.breakevenPoints + ", positiveSparklines=" + this.positiveSparklines + ", negativeSparklines=" + this.negativeSparklines + ", positiveAreas=" + this.positiveAreas + ", negativeAreas=" + this.negativeAreas + ", minX=" + this.minX + ", maxX=" + this.maxX + ", minY=" + this.minY + ", maxY=" + this.maxY + ", limitAtZero=" + this.limitAtZero + ", limitAtInfinity=" + this.limitAtInfinity + ", maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfitAndLossChart(List<ProfitAndLossPoint> sampledPoints, List<ProfitAndLossPoint> pricesOfInterest, List<ProfitAndLossPoint> breakevenPoints, List<ProfitAndLossSegment> positiveSparklines, List<ProfitAndLossSegment> negativeSparklines, List<? extends List<ProfitAndLossSegment>> positiveAreas, List<? extends List<ProfitAndLossSegment>> negativeAreas, BigDecimal minX, BigDecimal maxX, BigDecimal minY, BigDecimal maxY, ProfitAndLossLimit limitAtZero, ProfitAndLossLimit limitAtInfinity, ProfitAndLossLimit maxProfit, ProfitAndLossLimit maxLoss) {
        Intrinsics.checkNotNullParameter(sampledPoints, "sampledPoints");
        Intrinsics.checkNotNullParameter(pricesOfInterest, "pricesOfInterest");
        Intrinsics.checkNotNullParameter(breakevenPoints, "breakevenPoints");
        Intrinsics.checkNotNullParameter(positiveSparklines, "positiveSparklines");
        Intrinsics.checkNotNullParameter(negativeSparklines, "negativeSparklines");
        Intrinsics.checkNotNullParameter(positiveAreas, "positiveAreas");
        Intrinsics.checkNotNullParameter(negativeAreas, "negativeAreas");
        Intrinsics.checkNotNullParameter(minX, "minX");
        Intrinsics.checkNotNullParameter(maxX, "maxX");
        Intrinsics.checkNotNullParameter(minY, "minY");
        Intrinsics.checkNotNullParameter(maxY, "maxY");
        Intrinsics.checkNotNullParameter(limitAtZero, "limitAtZero");
        Intrinsics.checkNotNullParameter(limitAtInfinity, "limitAtInfinity");
        Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
        Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
        this.sampledPoints = sampledPoints;
        this.pricesOfInterest = pricesOfInterest;
        this.breakevenPoints = breakevenPoints;
        this.positiveSparklines = positiveSparklines;
        this.negativeSparklines = negativeSparklines;
        this.positiveAreas = positiveAreas;
        this.negativeAreas = negativeAreas;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.limitAtZero = limitAtZero;
        this.limitAtInfinity = limitAtInfinity;
        this.maxProfit = maxProfit;
        this.maxLoss = maxLoss;
    }

    public final List<ProfitAndLossPoint> getSampledPoints() {
        return this.sampledPoints;
    }

    public final List<ProfitAndLossPoint> getPricesOfInterest() {
        return this.pricesOfInterest;
    }

    public final List<ProfitAndLossPoint> getBreakevenPoints() {
        return this.breakevenPoints;
    }

    public final List<ProfitAndLossSegment> getPositiveSparklines() {
        return this.positiveSparklines;
    }

    public final List<ProfitAndLossSegment> getNegativeSparklines() {
        return this.negativeSparklines;
    }

    public final List<List<ProfitAndLossSegment>> getPositiveAreas() {
        return this.positiveAreas;
    }

    public final List<List<ProfitAndLossSegment>> getNegativeAreas() {
        return this.negativeAreas;
    }

    public final BigDecimal getMinX() {
        return this.minX;
    }

    public final BigDecimal getMaxX() {
        return this.maxX;
    }

    public final BigDecimal getMinY() {
        return this.minY;
    }

    public final BigDecimal getMaxY() {
        return this.maxY;
    }

    public final ProfitAndLossLimit getLimitAtZero() {
        return this.limitAtZero;
    }

    public final ProfitAndLossLimit getLimitAtInfinity() {
        return this.limitAtInfinity;
    }

    public final ProfitAndLossLimit getMaxProfit() {
        return this.maxProfit;
    }

    public final ProfitAndLossLimit getMaxLoss() {
        return this.maxLoss;
    }
}
