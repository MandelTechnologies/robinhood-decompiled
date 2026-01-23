package com.robinhood.android.equitydetail.p123ui.chart;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class InstrumentChartKt$InstrumentChart$1$5$2 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onPriceBookClicked;
    final /* synthetic */ SduiInstrumentChart $sduiInstrumentChart;
    final /* synthetic */ boolean $showGoldIconInDarkMode;

    InstrumentChartKt$InstrumentChart$1$5$2(SduiInstrumentChart sduiInstrumentChart, Function0<Unit> function0, boolean z) {
        this.$sduiInstrumentChart = sduiInstrumentChart;
        this.$onPriceBookClicked = function0;
        this.$showGoldIconInDarkMode = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 SduiCursorDataHeader, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SduiCursorDataHeader, "$this$SduiCursorDataHeader");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(622026975, i, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChart.<anonymous>.<anonymous>.<anonymous> (InstrumentChart.kt:286)");
        }
        if (this.$sduiInstrumentChart.getHasPriceBook()) {
            InstrumentChartKt.PriceBookButton(this.$onPriceBookClicked, null, this.$showGoldIconInDarkMode, composer, 0, 2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
