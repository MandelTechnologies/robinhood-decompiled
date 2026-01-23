package com.robinhood.android.options.p208ui.chart;

import com.robinhood.android.charts.models.p080db.OptionHistoricalChartData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$1$trailingButton$2$1 */
/* loaded from: classes11.dex */
final class C23810x2c9af07d implements Function0<Unit> {
    final /* synthetic */ OptionHistoricalChartData $historicalChartData;
    final /* synthetic */ Function1<Boolean, Unit> $onCandlestickSwitchClicked;

    /* JADX WARN: Multi-variable type inference failed */
    C23810x2c9af07d(Function1<? super Boolean, Unit> function1, OptionHistoricalChartData optionHistoricalChartData) {
        this.$onCandlestickSwitchClicked = function1;
        this.$historicalChartData = optionHistoricalChartData;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCandlestickSwitchClicked.invoke(Boolean.valueOf(!(this.$historicalChartData != null ? r1.getShowCandlesticks() : false)));
    }
}
