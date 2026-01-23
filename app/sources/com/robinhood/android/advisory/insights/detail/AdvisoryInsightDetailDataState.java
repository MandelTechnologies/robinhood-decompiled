package com.robinhood.android.advisory.insights.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightDetailDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JW\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDataState;", "", "insight", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "performanceChartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "prevInsightNavArg", "Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "nextInsightNavArg", "currentInsightIndex", "", "currentMultiPageIndex", "totalMultiPageCount", "<init>", "(Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Lcom/robinhood/android/advisory/contracts/InsightNavArg;Lcom/robinhood/android/advisory/contracts/InsightNavArg;III)V", "getInsight", "()Lcom/robinhood/models/advisory/db/insights/AdvisoryInsight;", "getPerformanceChartModel", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getPrevInsightNavArg", "()Lcom/robinhood/android/advisory/contracts/InsightNavArg;", "getNextInsightNavArg", "getCurrentInsightIndex", "()I", "getCurrentMultiPageIndex", "getTotalMultiPageCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryInsightDetailDataState {
    public static final int $stable = 8;
    private final int currentInsightIndex;
    private final int currentMultiPageIndex;
    private final AdvisoryInsight insight;
    private final InsightNavArg nextInsightNavArg;
    private final PerformanceChartModel performanceChartModel;
    private final InsightNavArg prevInsightNavArg;
    private final int totalMultiPageCount;

    public AdvisoryInsightDetailDataState() {
        this(null, null, null, null, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ AdvisoryInsightDetailDataState copy$default(AdvisoryInsightDetailDataState advisoryInsightDetailDataState, AdvisoryInsight advisoryInsight, PerformanceChartModel performanceChartModel, InsightNavArg insightNavArg, InsightNavArg insightNavArg2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            advisoryInsight = advisoryInsightDetailDataState.insight;
        }
        if ((i4 & 2) != 0) {
            performanceChartModel = advisoryInsightDetailDataState.performanceChartModel;
        }
        if ((i4 & 4) != 0) {
            insightNavArg = advisoryInsightDetailDataState.prevInsightNavArg;
        }
        if ((i4 & 8) != 0) {
            insightNavArg2 = advisoryInsightDetailDataState.nextInsightNavArg;
        }
        if ((i4 & 16) != 0) {
            i = advisoryInsightDetailDataState.currentInsightIndex;
        }
        if ((i4 & 32) != 0) {
            i2 = advisoryInsightDetailDataState.currentMultiPageIndex;
        }
        if ((i4 & 64) != 0) {
            i3 = advisoryInsightDetailDataState.totalMultiPageCount;
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        InsightNavArg insightNavArg3 = insightNavArg;
        return advisoryInsightDetailDataState.copy(advisoryInsight, performanceChartModel, insightNavArg3, insightNavArg2, i7, i5, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvisoryInsight getInsight() {
        return this.insight;
    }

    /* renamed from: component2, reason: from getter */
    public final PerformanceChartModel getPerformanceChartModel() {
        return this.performanceChartModel;
    }

    /* renamed from: component3, reason: from getter */
    public final InsightNavArg getPrevInsightNavArg() {
        return this.prevInsightNavArg;
    }

    /* renamed from: component4, reason: from getter */
    public final InsightNavArg getNextInsightNavArg() {
        return this.nextInsightNavArg;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentInsightIndex() {
        return this.currentInsightIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCurrentMultiPageIndex() {
        return this.currentMultiPageIndex;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotalMultiPageCount() {
        return this.totalMultiPageCount;
    }

    public final AdvisoryInsightDetailDataState copy(AdvisoryInsight insight, PerformanceChartModel performanceChartModel, InsightNavArg prevInsightNavArg, InsightNavArg nextInsightNavArg, int currentInsightIndex, int currentMultiPageIndex, int totalMultiPageCount) {
        return new AdvisoryInsightDetailDataState(insight, performanceChartModel, prevInsightNavArg, nextInsightNavArg, currentInsightIndex, currentMultiPageIndex, totalMultiPageCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightDetailDataState)) {
            return false;
        }
        AdvisoryInsightDetailDataState advisoryInsightDetailDataState = (AdvisoryInsightDetailDataState) other;
        return Intrinsics.areEqual(this.insight, advisoryInsightDetailDataState.insight) && Intrinsics.areEqual(this.performanceChartModel, advisoryInsightDetailDataState.performanceChartModel) && Intrinsics.areEqual(this.prevInsightNavArg, advisoryInsightDetailDataState.prevInsightNavArg) && Intrinsics.areEqual(this.nextInsightNavArg, advisoryInsightDetailDataState.nextInsightNavArg) && this.currentInsightIndex == advisoryInsightDetailDataState.currentInsightIndex && this.currentMultiPageIndex == advisoryInsightDetailDataState.currentMultiPageIndex && this.totalMultiPageCount == advisoryInsightDetailDataState.totalMultiPageCount;
    }

    public int hashCode() {
        AdvisoryInsight advisoryInsight = this.insight;
        int iHashCode = (advisoryInsight == null ? 0 : advisoryInsight.hashCode()) * 31;
        PerformanceChartModel performanceChartModel = this.performanceChartModel;
        int iHashCode2 = (iHashCode + (performanceChartModel == null ? 0 : performanceChartModel.hashCode())) * 31;
        InsightNavArg insightNavArg = this.prevInsightNavArg;
        int iHashCode3 = (iHashCode2 + (insightNavArg == null ? 0 : insightNavArg.hashCode())) * 31;
        InsightNavArg insightNavArg2 = this.nextInsightNavArg;
        return ((((((iHashCode3 + (insightNavArg2 != null ? insightNavArg2.hashCode() : 0)) * 31) + Integer.hashCode(this.currentInsightIndex)) * 31) + Integer.hashCode(this.currentMultiPageIndex)) * 31) + Integer.hashCode(this.totalMultiPageCount);
    }

    public String toString() {
        return "AdvisoryInsightDetailDataState(insight=" + this.insight + ", performanceChartModel=" + this.performanceChartModel + ", prevInsightNavArg=" + this.prevInsightNavArg + ", nextInsightNavArg=" + this.nextInsightNavArg + ", currentInsightIndex=" + this.currentInsightIndex + ", currentMultiPageIndex=" + this.currentMultiPageIndex + ", totalMultiPageCount=" + this.totalMultiPageCount + ")";
    }

    public AdvisoryInsightDetailDataState(AdvisoryInsight advisoryInsight, PerformanceChartModel performanceChartModel, InsightNavArg insightNavArg, InsightNavArg insightNavArg2, int i, int i2, int i3) {
        this.insight = advisoryInsight;
        this.performanceChartModel = performanceChartModel;
        this.prevInsightNavArg = insightNavArg;
        this.nextInsightNavArg = insightNavArg2;
        this.currentInsightIndex = i;
        this.currentMultiPageIndex = i2;
        this.totalMultiPageCount = i3;
    }

    public /* synthetic */ AdvisoryInsightDetailDataState(AdvisoryInsight advisoryInsight, PerformanceChartModel performanceChartModel, InsightNavArg insightNavArg, InsightNavArg insightNavArg2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : advisoryInsight, (i4 & 2) != 0 ? null : performanceChartModel, (i4 & 4) != 0 ? null : insightNavArg, (i4 & 8) != 0 ? null : insightNavArg2, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3);
    }

    public final AdvisoryInsight getInsight() {
        return this.insight;
    }

    public final PerformanceChartModel getPerformanceChartModel() {
        return this.performanceChartModel;
    }

    public final InsightNavArg getPrevInsightNavArg() {
        return this.prevInsightNavArg;
    }

    public final InsightNavArg getNextInsightNavArg() {
        return this.nextInsightNavArg;
    }

    public final int getCurrentInsightIndex() {
        return this.currentInsightIndex;
    }

    public final int getCurrentMultiPageIndex() {
        return this.currentMultiPageIndex;
    }

    public final int getTotalMultiPageCount() {
        return this.totalMultiPageCount;
    }
}
