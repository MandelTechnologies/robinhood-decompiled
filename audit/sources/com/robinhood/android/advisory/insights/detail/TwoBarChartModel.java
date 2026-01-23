package com.robinhood.android.advisory.insights.detail;

import com.robinhood.models.advisory.p304db.insights.TwoBarChartComparisonDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;", "", "chartDetails", "Lcom/robinhood/models/advisory/db/insights/TwoBarChartComparisonDetails;", "topBarRatio", "", "bottomBarRatio", "<init>", "(Lcom/robinhood/models/advisory/db/insights/TwoBarChartComparisonDetails;FF)V", "getChartDetails", "()Lcom/robinhood/models/advisory/db/insights/TwoBarChartComparisonDetails;", "getTopBarRatio", "()F", "getBottomBarRatio", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TwoBarChartModel {
    public static final int $stable = 8;
    private final float bottomBarRatio;
    private final TwoBarChartComparisonDetails chartDetails;
    private final float topBarRatio;

    public static /* synthetic */ TwoBarChartModel copy$default(TwoBarChartModel twoBarChartModel, TwoBarChartComparisonDetails twoBarChartComparisonDetails, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            twoBarChartComparisonDetails = twoBarChartModel.chartDetails;
        }
        if ((i & 2) != 0) {
            f = twoBarChartModel.topBarRatio;
        }
        if ((i & 4) != 0) {
            f2 = twoBarChartModel.bottomBarRatio;
        }
        return twoBarChartModel.copy(twoBarChartComparisonDetails, f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final TwoBarChartComparisonDetails getChartDetails() {
        return this.chartDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTopBarRatio() {
        return this.topBarRatio;
    }

    /* renamed from: component3, reason: from getter */
    public final float getBottomBarRatio() {
        return this.bottomBarRatio;
    }

    public final TwoBarChartModel copy(TwoBarChartComparisonDetails chartDetails, float topBarRatio, float bottomBarRatio) {
        Intrinsics.checkNotNullParameter(chartDetails, "chartDetails");
        return new TwoBarChartModel(chartDetails, topBarRatio, bottomBarRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoBarChartModel)) {
            return false;
        }
        TwoBarChartModel twoBarChartModel = (TwoBarChartModel) other;
        return Intrinsics.areEqual(this.chartDetails, twoBarChartModel.chartDetails) && Float.compare(this.topBarRatio, twoBarChartModel.topBarRatio) == 0 && Float.compare(this.bottomBarRatio, twoBarChartModel.bottomBarRatio) == 0;
    }

    public int hashCode() {
        return (((this.chartDetails.hashCode() * 31) + Float.hashCode(this.topBarRatio)) * 31) + Float.hashCode(this.bottomBarRatio);
    }

    public String toString() {
        return "TwoBarChartModel(chartDetails=" + this.chartDetails + ", topBarRatio=" + this.topBarRatio + ", bottomBarRatio=" + this.bottomBarRatio + ")";
    }

    public TwoBarChartModel(TwoBarChartComparisonDetails chartDetails, float f, float f2) {
        Intrinsics.checkNotNullParameter(chartDetails, "chartDetails");
        this.chartDetails = chartDetails;
        this.topBarRatio = f;
        this.bottomBarRatio = f2;
    }

    public final TwoBarChartComparisonDetails getChartDetails() {
        return this.chartDetails;
    }

    public final float getTopBarRatio() {
        return this.topBarRatio;
    }

    public final float getBottomBarRatio() {
        return this.bottomBarRatio;
    }
}
