package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PerformanceChartSettingsFragment2 {
    public static final PerformanceChartSettingsFragment2 INSTANCE = new PerformanceChartSettingsFragment2();

    /* renamed from: lambda$-1248783211, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9176lambda$1248783211 = ComposableLambda3.composableLambdaInstance(-1248783211, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsFragmentKt$lambda$-1248783211$1
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
                ComposerKt.traceEventStart(-1248783211, i, -1, "com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsFragmentKt.lambda$-1248783211.<anonymous> (PerformanceChartSettingsFragment.kt:130)");
            }
            PerformanceChartSettingsComposable3.PerformanceChartSettingsComposable(null, PerformanceChartSettingsStateProvider3.INSTANCE.getLoadingMock(), new ChartStyleSection() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsFragmentKt$lambda$-1248783211$1.1
                @Override // com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSection
                public void onShowFaq() {
                }

                @Override // com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSection
                public void onStyleChanged(PerformanceChartStyle style) {
                    Intrinsics.checkNotNullParameter(style, "style");
                }
            }, new ChartHoursSection() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsFragmentKt$lambda$-1248783211$1.2
                @Override // com.robinhood.android.portfolio.performanceChartSettings.ChartHoursSection
                public void onToggleAllHours() {
                }
            }, new BenchmarksSection7() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsFragmentKt$lambda$-1248783211$1.3
                @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                public void onEditBenchmarks() {
                }

                @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                public void onShowFaq() {
                }

                @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                public void onShowIntro() {
                }

                @Override // com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection7
                public void onToggleBenchmark(String benchmarkId) {
                    Intrinsics.checkNotNullParameter(benchmarkId, "benchmarkId");
                }
            }, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1248783211$feature_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17656getLambda$1248783211$feature_portfolio_externalDebug() {
        return f9176lambda$1248783211;
    }
}
