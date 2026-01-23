package com.robinhood.android.indexes.detail.components.chart;

import android.content.res.Resources;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.detail.C18813R;
import com.robinhood.android.indexes.detail.IndexDetailPageComposable;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartDataState;", "Lcom/robinhood/android/indexes/detail/components/chart/IndexHistoricalChartViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexHistoricalChartStateProvider implements StateProvider<IndexHistoricalChartDataState, IndexHistoricalChartViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public IndexHistoricalChartStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public IndexHistoricalChartViewState reduce(IndexHistoricalChartDataState dataState) throws Resources.NotFoundException {
        String symbol;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        DisplaySpan activeDisplaySpan = dataState.getActiveDisplaySpan();
        Index index = dataState.getIndex();
        CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip = null;
        String displayName = index != null ? index.getDisplayName() : null;
        IndexHistoricalChartModel historicalChart = dataState.getHistoricalChart();
        IndexHistoricalChartEventData indexHistoricalChartEventData = historicalChart != null ? new IndexHistoricalChartEventData(historicalChart.getIndexId(), dataState.getSource().getEntryPointIdentifier(), dataState.getActiveDisplaySpan(), historicalChart.getShowCandlesticks()) : null;
        Index index2 = dataState.getIndex();
        if (index2 == null || (symbol = index2.getSymbol()) == null) {
            symbol = "";
        }
        String str = symbol;
        IndexHistoricalChartModel historicalChart2 = dataState.getHistoricalChart();
        if (dataState.getIndex() != null && dataState.getInCurbHoursExperiment() && dataState.getHasExtendedHours() && dataState.getCurbHoursTooltipPref() != null && !dataState.getCurbHoursTooltipPref().get() && !Intrinsics.areEqual(dataState.getSource(), IndexDetailPageFragmentKey2.RhList.INSTANCE)) {
            String str2 = "index_detail_page_curb_hours_tooltip_" + dataState.getIndex().getId();
            String string2 = this.resources.getString(C18813R.string.gated_options_index_detail_page_curb_hours_tooltip, DateStrings2.formatTo24HourTime(17, 0, LocalTimeFormatter.SHORT_OPTIONAL_MINUTE));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            tertiaryValueTooltip = new CursorRowModifiers.TertiaryValueTooltip(str2, string2, dataState.getCurbHoursTooltipPref(), IndexDetailPageComposable.CANVAS_TAG);
        }
        return new IndexHistoricalChartViewState(activeDisplaySpan, displayName, indexHistoricalChartEventData, str, historicalChart2, tertiaryValueTooltip);
    }
}
