package com.robinhood.android.advisory.projection.chart;

import com.robinhood.android.charts.model.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartModels.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/chart/ChartPoints;", "", "percentile5Points", "", "Lcom/robinhood/android/charts/model/Point;", "medianPoints", "percentile95Points", "currentPortfolioPoints", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPercentile5Points", "()Ljava/util/List;", "getMedianPoints", "getPercentile95Points", "getCurrentPortfolioPoints", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChartPoints {
    public static final int $stable = 8;
    private final List<Point> currentPortfolioPoints;
    private final List<Point> medianPoints;
    private final List<Point> percentile5Points;
    private final List<Point> percentile95Points;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartPoints copy$default(ChartPoints chartPoints, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartPoints.percentile5Points;
        }
        if ((i & 2) != 0) {
            list2 = chartPoints.medianPoints;
        }
        if ((i & 4) != 0) {
            list3 = chartPoints.percentile95Points;
        }
        if ((i & 8) != 0) {
            list4 = chartPoints.currentPortfolioPoints;
        }
        return chartPoints.copy(list, list2, list3, list4);
    }

    public final List<Point> component1() {
        return this.percentile5Points;
    }

    public final List<Point> component2() {
        return this.medianPoints;
    }

    public final List<Point> component3() {
        return this.percentile95Points;
    }

    public final List<Point> component4() {
        return this.currentPortfolioPoints;
    }

    public final ChartPoints copy(List<Point> percentile5Points, List<Point> medianPoints, List<Point> percentile95Points, List<Point> currentPortfolioPoints) {
        Intrinsics.checkNotNullParameter(percentile5Points, "percentile5Points");
        Intrinsics.checkNotNullParameter(medianPoints, "medianPoints");
        Intrinsics.checkNotNullParameter(percentile95Points, "percentile95Points");
        Intrinsics.checkNotNullParameter(currentPortfolioPoints, "currentPortfolioPoints");
        return new ChartPoints(percentile5Points, medianPoints, percentile95Points, currentPortfolioPoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartPoints)) {
            return false;
        }
        ChartPoints chartPoints = (ChartPoints) other;
        return Intrinsics.areEqual(this.percentile5Points, chartPoints.percentile5Points) && Intrinsics.areEqual(this.medianPoints, chartPoints.medianPoints) && Intrinsics.areEqual(this.percentile95Points, chartPoints.percentile95Points) && Intrinsics.areEqual(this.currentPortfolioPoints, chartPoints.currentPortfolioPoints);
    }

    public int hashCode() {
        return (((((this.percentile5Points.hashCode() * 31) + this.medianPoints.hashCode()) * 31) + this.percentile95Points.hashCode()) * 31) + this.currentPortfolioPoints.hashCode();
    }

    public String toString() {
        return "ChartPoints(percentile5Points=" + this.percentile5Points + ", medianPoints=" + this.medianPoints + ", percentile95Points=" + this.percentile95Points + ", currentPortfolioPoints=" + this.currentPortfolioPoints + ")";
    }

    public ChartPoints(List<Point> percentile5Points, List<Point> medianPoints, List<Point> percentile95Points, List<Point> currentPortfolioPoints) {
        Intrinsics.checkNotNullParameter(percentile5Points, "percentile5Points");
        Intrinsics.checkNotNullParameter(medianPoints, "medianPoints");
        Intrinsics.checkNotNullParameter(percentile95Points, "percentile95Points");
        Intrinsics.checkNotNullParameter(currentPortfolioPoints, "currentPortfolioPoints");
        this.percentile5Points = percentile5Points;
        this.medianPoints = medianPoints;
        this.percentile95Points = percentile95Points;
        this.currentPortfolioPoints = currentPortfolioPoints;
    }

    public final List<Point> getPercentile5Points() {
        return this.percentile5Points;
    }

    public final List<Point> getMedianPoints() {
        return this.medianPoints;
    }

    public final List<Point> getPercentile95Points() {
        return this.percentile95Points;
    }

    public final List<Point> getCurrentPortfolioPoints() {
        return this.currentPortfolioPoints;
    }
}
