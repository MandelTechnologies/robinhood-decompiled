package com.robinhood.android.indexes.detail.components.chart;

import com.robinhood.android.charts.models.p080db.IndexHistoricalChartData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: IndexHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class IndexHistoricalChartKt$IndexHistoricalChart$2$16$1 implements Function0<Unit> {
    final /* synthetic */ IndexHistoricalChartDuxo $duxo;
    final /* synthetic */ IndexHistoricalChartData $historicalChartData;

    IndexHistoricalChartKt$IndexHistoricalChart$2$16$1(IndexHistoricalChartDuxo indexHistoricalChartDuxo, IndexHistoricalChartData indexHistoricalChartData) {
        this.$duxo = indexHistoricalChartDuxo;
        this.$historicalChartData = indexHistoricalChartData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$duxo.onCandlestickToggled(!(this.$historicalChartData != null ? r1.getShowCandlesticks() : false));
    }
}
