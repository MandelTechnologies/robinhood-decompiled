package com.robinhood.android.indexes.detail.components.chart;

import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChartStates.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartViewState;", "", "activeDisplaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "displayName", "", "eventData", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartEventData;", "symbol", "historicalChart", "Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "tertiaryValueTooltip", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/String;Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartEventData;Ljava/lang/String;Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;)V", "getActiveDisplaySpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getDisplayName", "()Ljava/lang/String;", "getEventData", "()Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartEventData;", "getSymbol", "getHistoricalChart", "()Lcom/robinhood/android/charts/models/db/IndexHistoricalChartModel;", "getTertiaryValueTooltip", "()Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IndexHistoricalChartViewState {
    public static final int $stable = 8;
    private final DisplaySpan activeDisplaySpan;
    private final String displayName;
    private final IndexHistoricalChartEventData eventData;
    private final IndexHistoricalChartModel historicalChart;
    private final String symbol;
    private final CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip;

    public static /* synthetic */ IndexHistoricalChartViewState copy$default(IndexHistoricalChartViewState indexHistoricalChartViewState, DisplaySpan displaySpan, String str, IndexHistoricalChartEventData indexHistoricalChartEventData, String str2, IndexHistoricalChartModel indexHistoricalChartModel, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, int i, Object obj) {
        if ((i & 1) != 0) {
            displaySpan = indexHistoricalChartViewState.activeDisplaySpan;
        }
        if ((i & 2) != 0) {
            str = indexHistoricalChartViewState.displayName;
        }
        if ((i & 4) != 0) {
            indexHistoricalChartEventData = indexHistoricalChartViewState.eventData;
        }
        if ((i & 8) != 0) {
            str2 = indexHistoricalChartViewState.symbol;
        }
        if ((i & 16) != 0) {
            indexHistoricalChartModel = indexHistoricalChartViewState.historicalChart;
        }
        if ((i & 32) != 0) {
            tertiaryValueTooltip = indexHistoricalChartViewState.tertiaryValueTooltip;
        }
        IndexHistoricalChartModel indexHistoricalChartModel2 = indexHistoricalChartModel;
        CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip2 = tertiaryValueTooltip;
        return indexHistoricalChartViewState.copy(displaySpan, str, indexHistoricalChartEventData, str2, indexHistoricalChartModel2, tertiaryValueTooltip2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisplaySpan getActiveDisplaySpan() {
        return this.activeDisplaySpan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final IndexHistoricalChartEventData getEventData() {
        return this.eventData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component5, reason: from getter */
    public final IndexHistoricalChartModel getHistoricalChart() {
        return this.historicalChart;
    }

    /* renamed from: component6, reason: from getter */
    public final CursorRowModifiers.TertiaryValueTooltip getTertiaryValueTooltip() {
        return this.tertiaryValueTooltip;
    }

    public final IndexHistoricalChartViewState copy(DisplaySpan activeDisplaySpan, String displayName, IndexHistoricalChartEventData eventData, String symbol, IndexHistoricalChartModel historicalChart, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip) {
        Intrinsics.checkNotNullParameter(activeDisplaySpan, "activeDisplaySpan");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new IndexHistoricalChartViewState(activeDisplaySpan, displayName, eventData, symbol, historicalChart, tertiaryValueTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexHistoricalChartViewState)) {
            return false;
        }
        IndexHistoricalChartViewState indexHistoricalChartViewState = (IndexHistoricalChartViewState) other;
        return this.activeDisplaySpan == indexHistoricalChartViewState.activeDisplaySpan && Intrinsics.areEqual(this.displayName, indexHistoricalChartViewState.displayName) && Intrinsics.areEqual(this.eventData, indexHistoricalChartViewState.eventData) && Intrinsics.areEqual(this.symbol, indexHistoricalChartViewState.symbol) && Intrinsics.areEqual(this.historicalChart, indexHistoricalChartViewState.historicalChart) && Intrinsics.areEqual(this.tertiaryValueTooltip, indexHistoricalChartViewState.tertiaryValueTooltip);
    }

    public int hashCode() {
        int iHashCode = this.activeDisplaySpan.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IndexHistoricalChartEventData indexHistoricalChartEventData = this.eventData;
        int iHashCode3 = (((iHashCode2 + (indexHistoricalChartEventData == null ? 0 : indexHistoricalChartEventData.hashCode())) * 31) + this.symbol.hashCode()) * 31;
        IndexHistoricalChartModel indexHistoricalChartModel = this.historicalChart;
        int iHashCode4 = (iHashCode3 + (indexHistoricalChartModel == null ? 0 : indexHistoricalChartModel.hashCode())) * 31;
        CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip = this.tertiaryValueTooltip;
        return iHashCode4 + (tertiaryValueTooltip != null ? tertiaryValueTooltip.hashCode() : 0);
    }

    public String toString() {
        return "IndexHistoricalChartViewState(activeDisplaySpan=" + this.activeDisplaySpan + ", displayName=" + this.displayName + ", eventData=" + this.eventData + ", symbol=" + this.symbol + ", historicalChart=" + this.historicalChart + ", tertiaryValueTooltip=" + this.tertiaryValueTooltip + ")";
    }

    public IndexHistoricalChartViewState(DisplaySpan activeDisplaySpan, String str, IndexHistoricalChartEventData indexHistoricalChartEventData, String symbol, IndexHistoricalChartModel indexHistoricalChartModel, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip) {
        Intrinsics.checkNotNullParameter(activeDisplaySpan, "activeDisplaySpan");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.activeDisplaySpan = activeDisplaySpan;
        this.displayName = str;
        this.eventData = indexHistoricalChartEventData;
        this.symbol = symbol;
        this.historicalChart = indexHistoricalChartModel;
        this.tertiaryValueTooltip = tertiaryValueTooltip;
    }

    public final DisplaySpan getActiveDisplaySpan() {
        return this.activeDisplaySpan;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final IndexHistoricalChartEventData getEventData() {
        return this.eventData;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final IndexHistoricalChartModel getHistoricalChart() {
        return this.historicalChart;
    }

    public final CursorRowModifiers.TertiaryValueTooltip getTertiaryValueTooltip() {
        return this.tertiaryValueTooltip;
    }
}
