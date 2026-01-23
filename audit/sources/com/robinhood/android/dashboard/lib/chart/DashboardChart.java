package com.robinhood.android.dashboard.lib.chart;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposable3;
import com.robinhood.android.p148fx.tooltip.FxTooltip;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.chart.ComposableSingletons$DashboardChartKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardChart {
    public static final DashboardChart INSTANCE = new DashboardChart();

    /* renamed from: lambda$-551656420, reason: not valid java name */
    private static Function4<Row5, Money, Composer, Integer, Unit> f8866lambda$551656420 = ComposableLambda3.composableLambdaInstance(-551656420, false, new Function4<Row5, Money, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.chart.ComposableSingletons$DashboardChartKt$lambda$-551656420$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Money money, Composer composer, Integer num) {
            invoke(row5, money, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 PerformanceChartComposable, Money money, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-551656420, i, -1, "com.robinhood.android.dashboard.lib.chart.ComposableSingletons$DashboardChartKt.lambda$-551656420.<anonymous> (DashboardChart.kt:41)");
            }
            FxTooltip.FxTooltipButton(money, null, false, null, null, false, composer, (i >> 3) & 14, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1098060201, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8865lambda$1098060201 = ComposableLambda3.composableLambdaInstance(-1098060201, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.chart.ComposableSingletons$DashboardChartKt$lambda$-1098060201$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1098060201, i, -1, "com.robinhood.android.dashboard.lib.chart.ComposableSingletons$DashboardChartKt.lambda$-1098060201.<anonymous> (DashboardChart.kt:98)");
            }
            PerformanceChartLoadingComposable3.PerformanceChartLoadingComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1098060201$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13199getLambda$1098060201$lib_account_home_externalDebug() {
        return f8865lambda$1098060201;
    }

    /* renamed from: getLambda$-551656420$lib_account_home_externalDebug, reason: not valid java name */
    public final Function4<Row5, Money, Composer, Integer, Unit> m13200getLambda$551656420$lib_account_home_externalDebug() {
        return f8866lambda$551656420;
    }
}
