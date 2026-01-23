package com.robinhood.android.options.p208ui.chart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.options.p208ui.chartsettings.OptionChartSettingsBottomSheetComposable3;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionHistoricalChartKt$OptionHistoricalChart$1$17 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ ChartType $chartType;
    final /* synthetic */ Function1<Boolean, Unit> $onCandlestickSwitchClicked;
    final /* synthetic */ Function1<Boolean, Unit> $onShowAllHoursToggled;
    final /* synthetic */ OptionsDetailPageBodyState2.Chart $state;

    /* JADX WARN: Multi-variable type inference failed */
    OptionHistoricalChartKt$OptionHistoricalChart$1$17(ChartType chartType, OptionsDetailPageBodyState2.Chart chart, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12) {
        this.$chartType = chartType;
        this.$state = chart;
        this.$onCandlestickSwitchClicked = function1;
        this.$onShowAllHoursToggled = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1969465492, i, -1, "com.robinhood.android.options.ui.chart.OptionHistoricalChart.<anonymous>.<anonymous> (OptionHistoricalChart.kt:263)");
        }
        ChartType chartType = this.$chartType;
        boolean showAllHoursChart = this.$state.getShowAllHoursChart();
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onCandlestickSwitchClicked);
        final Function1<Boolean, Unit> function1 = this.$onCandlestickSwitchClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<ChartType, Unit>() { // from class: com.robinhood.android.options.ui.chart.OptionHistoricalChartKt$OptionHistoricalChart$1$17$1$1

                /* compiled from: OptionHistoricalChart.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ChartType.values().length];
                        try {
                            iArr[ChartType.CANDLESTICK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ChartType.LINE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ChartType.EMPTY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ChartType chartType2) {
                    invoke2(chartType2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ChartType selectedChartType) {
                    Intrinsics.checkNotNullParameter(selectedChartType, "selectedChartType");
                    int i2 = WhenMappings.$EnumSwitchMapping$0[selectedChartType.ordinal()];
                    if (i2 == 1) {
                        function1.invoke(Boolean.TRUE);
                    } else if (i2 == 2) {
                        function1.invoke(Boolean.FALSE);
                    } else {
                        if (i2 == 3) {
                            throw new IllegalStateException("should not be able to select empty chart type");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        OptionChartSettingsBottomSheetComposable3.OptionChartSettingsBottomSheetComposable(chartType, showAllHoursChart, (Function1) objRememberedValue, this.$onShowAllHoursToggled, null, composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
