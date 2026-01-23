package com.robinhood.android.indexes.detail.components.chart;

import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChartStates.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;", "activeDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "historicalChart", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "source", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "hasExtendedHours", "", "inCurbHoursExperiment", "curbHoursTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Lcom/robinhood/android/indexes/models/db/Index;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;ZZLcom/robinhood/prefs/BooleanPreference;)V", "getIndex", "()Lcom/robinhood/android/indexes/models/db/Index;", "getActiveDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getHistoricalChart", "()Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "getSource", "()Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "getHasExtendedHours", "()Z", "getInCurbHoursExperiment", "getCurbHoursTooltipPref", "()Lcom/robinhood/prefs/BooleanPreference;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexHistoricalChartDataState {
    public static final int $stable = 8;
    private final DisplaySpan activeDisplaySpan;
    private final BooleanPreference curbHoursTooltipPref;
    private final boolean hasExtendedHours;
    private final IndexHistoricalChartModel historicalChart;
    private final boolean inCurbHoursExperiment;
    private final Index index;
    private final IndexDetailPageFragmentKey2 source;

    public static /* synthetic */ IndexHistoricalChartDataState copy$default(IndexHistoricalChartDataState indexHistoricalChartDataState, Index index, DisplaySpan displaySpan, IndexHistoricalChartModel indexHistoricalChartModel, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2, boolean z, boolean z2, BooleanPreference booleanPreference, int i, Object obj) {
        if ((i & 1) != 0) {
            index = indexHistoricalChartDataState.index;
        }
        if ((i & 2) != 0) {
            displaySpan = indexHistoricalChartDataState.activeDisplaySpan;
        }
        if ((i & 4) != 0) {
            indexHistoricalChartModel = indexHistoricalChartDataState.historicalChart;
        }
        if ((i & 8) != 0) {
            indexDetailPageFragmentKey2 = indexHistoricalChartDataState.source;
        }
        if ((i & 16) != 0) {
            z = indexHistoricalChartDataState.hasExtendedHours;
        }
        if ((i & 32) != 0) {
            z2 = indexHistoricalChartDataState.inCurbHoursExperiment;
        }
        if ((i & 64) != 0) {
            booleanPreference = indexHistoricalChartDataState.curbHoursTooltipPref;
        }
        boolean z3 = z2;
        BooleanPreference booleanPreference2 = booleanPreference;
        boolean z4 = z;
        IndexHistoricalChartModel indexHistoricalChartModel2 = indexHistoricalChartModel;
        return indexHistoricalChartDataState.copy(index, displaySpan, indexHistoricalChartModel2, indexDetailPageFragmentKey2, z4, z3, booleanPreference2);
    }

    /* renamed from: component1, reason: from getter */
    public final Index getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplaySpan getActiveDisplaySpan() {
        return this.activeDisplaySpan;
    }

    /* renamed from: component3, reason: from getter */
    public final IndexHistoricalChartModel getHistoricalChart() {
        return this.historicalChart;
    }

    /* renamed from: component4, reason: from getter */
    public final IndexDetailPageFragmentKey2 getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasExtendedHours() {
        return this.hasExtendedHours;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getInCurbHoursExperiment() {
        return this.inCurbHoursExperiment;
    }

    /* renamed from: component7, reason: from getter */
    public final BooleanPreference getCurbHoursTooltipPref() {
        return this.curbHoursTooltipPref;
    }

    public final IndexHistoricalChartDataState copy(Index index, DisplaySpan activeDisplaySpan, IndexHistoricalChartModel historicalChart, IndexDetailPageFragmentKey2 source, boolean hasExtendedHours, boolean inCurbHoursExperiment, BooleanPreference curbHoursTooltipPref) {
        Intrinsics.checkNotNullParameter(activeDisplaySpan, "activeDisplaySpan");
        Intrinsics.checkNotNullParameter(source, "source");
        return new IndexHistoricalChartDataState(index, activeDisplaySpan, historicalChart, source, hasExtendedHours, inCurbHoursExperiment, curbHoursTooltipPref);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexHistoricalChartDataState)) {
            return false;
        }
        IndexHistoricalChartDataState indexHistoricalChartDataState = (IndexHistoricalChartDataState) other;
        return Intrinsics.areEqual(this.index, indexHistoricalChartDataState.index) && this.activeDisplaySpan == indexHistoricalChartDataState.activeDisplaySpan && Intrinsics.areEqual(this.historicalChart, indexHistoricalChartDataState.historicalChart) && Intrinsics.areEqual(this.source, indexHistoricalChartDataState.source) && this.hasExtendedHours == indexHistoricalChartDataState.hasExtendedHours && this.inCurbHoursExperiment == indexHistoricalChartDataState.inCurbHoursExperiment && Intrinsics.areEqual(this.curbHoursTooltipPref, indexHistoricalChartDataState.curbHoursTooltipPref);
    }

    public int hashCode() {
        Index index = this.index;
        int iHashCode = (((index == null ? 0 : index.hashCode()) * 31) + this.activeDisplaySpan.hashCode()) * 31;
        IndexHistoricalChartModel indexHistoricalChartModel = this.historicalChart;
        int iHashCode2 = (((((((iHashCode + (indexHistoricalChartModel == null ? 0 : indexHistoricalChartModel.hashCode())) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.hasExtendedHours)) * 31) + Boolean.hashCode(this.inCurbHoursExperiment)) * 31;
        BooleanPreference booleanPreference = this.curbHoursTooltipPref;
        return iHashCode2 + (booleanPreference != null ? booleanPreference.hashCode() : 0);
    }

    public String toString() {
        return "IndexHistoricalChartDataState(index=" + this.index + ", activeDisplaySpan=" + this.activeDisplaySpan + ", historicalChart=" + this.historicalChart + ", source=" + this.source + ", hasExtendedHours=" + this.hasExtendedHours + ", inCurbHoursExperiment=" + this.inCurbHoursExperiment + ", curbHoursTooltipPref=" + this.curbHoursTooltipPref + ")";
    }

    public IndexHistoricalChartDataState(Index index, DisplaySpan activeDisplaySpan, IndexHistoricalChartModel indexHistoricalChartModel, IndexDetailPageFragmentKey2 source, boolean z, boolean z2, BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(activeDisplaySpan, "activeDisplaySpan");
        Intrinsics.checkNotNullParameter(source, "source");
        this.index = index;
        this.activeDisplaySpan = activeDisplaySpan;
        this.historicalChart = indexHistoricalChartModel;
        this.source = source;
        this.hasExtendedHours = z;
        this.inCurbHoursExperiment = z2;
        this.curbHoursTooltipPref = booleanPreference;
    }

    public final Index getIndex() {
        return this.index;
    }

    public /* synthetic */ IndexHistoricalChartDataState(Index index, DisplaySpan displaySpan, IndexHistoricalChartModel indexHistoricalChartModel, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2, boolean z, boolean z2, BooleanPreference booleanPreference, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : index, (i & 2) != 0 ? DisplaySpan.DAY : displaySpan, (i & 4) != 0 ? null : indexHistoricalChartModel, indexDetailPageFragmentKey2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : booleanPreference);
    }

    public final DisplaySpan getActiveDisplaySpan() {
        return this.activeDisplaySpan;
    }

    public final IndexHistoricalChartModel getHistoricalChart() {
        return this.historicalChart;
    }

    public final IndexDetailPageFragmentKey2 getSource() {
        return this.source;
    }

    public final boolean getHasExtendedHours() {
        return this.hasExtendedHours;
    }

    public final boolean getInCurbHoursExperiment() {
        return this.inCurbHoursExperiment;
    }

    public final BooleanPreference getCurbHoursTooltipPref() {
        return this.curbHoursTooltipPref;
    }
}
