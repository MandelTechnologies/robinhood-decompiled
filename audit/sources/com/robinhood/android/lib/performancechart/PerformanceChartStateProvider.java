package com.robinhood.android.lib.performancechart;

import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PerformanceChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "<init>", "()V", "reduce", "dataState", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PerformanceChartStateProvider implements StateProvider<PerformanceChartDataState, PerformanceChartStateProvider3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PerformanceChartStateProvider3 reduce(PerformanceChartDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getChartType() == null || dataState.getChartModel() == null) {
            return new PerformanceChartStateProvider3.Loading(dataState.isStale());
        }
        PerformanceChartSettingsV2 chartSettings = dataState.getChartSettings();
        List<PerformanceChartBenchmarkV2> benchmarks = chartSettings != null ? chartSettings.getBenchmarks() : null;
        if (!dataState.getBenchmarksEnabled()) {
            benchmarks = null;
        }
        if (benchmarks == null) {
            benchmarks = CollectionsKt.emptyList();
        }
        PerformanceChartType chartType = dataState.getChartType();
        PerformanceChartSettingsV2 chartSettings2 = dataState.getChartSettings();
        PerformanceChartStyle chartStyle = chartSettings2 != null ? chartSettings2.getChartStyle() : null;
        PerformanceChartModel chartModel = dataState.getChartModel();
        String activeSpan = dataState.getActiveSpan();
        if (activeSpan == null) {
            activeSpan = dataState.getChartModel().getDisplaySpan();
        }
        String str = activeSpan;
        AccountMarketValuesType marketValuesType = dataState.getMarketValuesType();
        boolean showSettings = dataState.getShowSettings();
        ArrayList arrayList = new ArrayList();
        for (Object obj : benchmarks) {
            if (((PerformanceChartBenchmarkV2) obj).isSelected()) {
                arrayList.add(obj);
            }
        }
        return new PerformanceChartStateProvider3.Ready(chartType, chartStyle, chartModel, marketValuesType, str, showSettings, extensions2.toImmutableList(arrayList), dataState.getBenchmarksEnabled() && dataState.getShowBenchmarksTooltip() && benchmarks.isEmpty(), dataState.getShowFxTooltipButton(), dataState.getSettingsTooltipTextResId(), dataState.getShowDisplayCurrencyLabel(), dataState.isStale());
    }
}
