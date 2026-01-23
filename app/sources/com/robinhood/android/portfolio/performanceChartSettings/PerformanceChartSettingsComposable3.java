package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsStateProvider3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerformanceChartSettingsComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"PerformanceChartSettingsComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Ready;", "chartStyleCallbacks", "Lcom/robinhood/android/portfolio/performanceChartSettings/ChartStyleCallbacks;", "chartHoursCallbacks", "Lcom/robinhood/android/portfolio/performanceChartSettings/ChartHoursCallbacks;", "benchmarkCallbacks", "Lcom/robinhood/android/portfolio/performanceChartSettings/ChartBenchmarksCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Ready;Lcom/robinhood/android/portfolio/performanceChartSettings/ChartStyleCallbacks;Lcom/robinhood/android/portfolio/performanceChartSettings/ChartHoursCallbacks;Lcom/robinhood/android/portfolio/performanceChartSettings/ChartBenchmarksCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PerformanceChartSettingsComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartSettingsComposable$lambda$2(Modifier modifier, PerformanceChartSettingsStateProvider3.Ready ready, ChartStyleSection chartStyleSection, ChartHoursSection chartHoursSection, BenchmarksSection7 benchmarksSection7, int i, int i2, Composer composer, int i3) {
        PerformanceChartSettingsComposable(modifier, ready, chartStyleSection, chartHoursSection, benchmarksSection7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PerformanceChartSettingsComposable(Modifier modifier, final PerformanceChartSettingsStateProvider3.Ready state, final ChartStyleSection chartStyleCallbacks, final ChartHoursSection chartHoursCallbacks, final BenchmarksSection7 benchmarkCallbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartStyleCallbacks, "chartStyleCallbacks");
        Intrinsics.checkNotNullParameter(chartHoursCallbacks, "chartHoursCallbacks");
        Intrinsics.checkNotNullParameter(benchmarkCallbacks, "benchmarkCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(805753933);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chartStyleCallbacks) : composerStartRestartGroup.changedInstance(chartStyleCallbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chartHoursCallbacks) : composerStartRestartGroup.changedInstance(chartHoursCallbacks) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(benchmarkCallbacks) : composerStartRestartGroup.changedInstance(benchmarkCallbacks) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(805753933, i3, -1, "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposable (PerformanceChartSettingsComposable.kt:20)");
            }
            boolean z = true;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(chartStyleCallbacks))) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(chartHoursCallbacks)));
            if ((57344 & i3) != 16384 && ((i3 & 32768) == 0 || !composerStartRestartGroup.changedInstance(benchmarkCallbacks))) {
                z = false;
            }
            boolean z2 = zChangedInstance | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PerformanceChartSettingsComposable3.PerformanceChartSettingsComposable$lambda$1$lambda$0(state, chartStyleCallbacks, chartHoursCallbacks, benchmarkCallbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier5 = modifier4;
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerformanceChartSettingsComposable3.PerformanceChartSettingsComposable$lambda$2(modifier3, state, chartStyleCallbacks, chartHoursCallbacks, benchmarkCallbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartSettingsComposable$lambda$1$lambda$0(final PerformanceChartSettingsStateProvider3.Ready ready, final ChartStyleSection chartStyleSection, final ChartHoursSection chartHoursSection, final BenchmarksSection7 benchmarksSection7, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, PerformanceChartSettingsComposable.INSTANCE.m17655getLambda$1784836766$feature_portfolio_externalDebug(), 3, null);
        if (ready.isChartStyleExperimentEnabled()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1755946627, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposableKt$PerformanceChartSettingsComposable$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1755946627, i, -1, "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposable.<anonymous>.<anonymous>.<anonymous> (PerformanceChartSettingsComposable.kt:35)");
                    }
                    ChartStyleSection2.ChartStyleSection(ready.getSettings(), chartStyleSection, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (ready.isChartHoursExperimentEnabled()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(633817012, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposableKt$PerformanceChartSettingsComposable$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(633817012, i, -1, "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposable.<anonymous>.<anonymous>.<anonymous> (PerformanceChartSettingsComposable.kt:38)");
                    }
                    ChartHoursSection2.ChartHoursSection(ready.isChartHoursEnabled(), chartHoursSection, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        if (ready.isBenchmarkingExperimentEnabled()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1717178379, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposableKt$PerformanceChartSettingsComposable$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1717178379, i, -1, "com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsComposable.<anonymous>.<anonymous>.<anonymous> (PerformanceChartSettingsComposable.kt:42)");
                    }
                    BenchmarksSection.BenchmarksSection(ready.getSettings(), ready.getShowBenchmarkFtux(), benchmarksSection7, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }
}
