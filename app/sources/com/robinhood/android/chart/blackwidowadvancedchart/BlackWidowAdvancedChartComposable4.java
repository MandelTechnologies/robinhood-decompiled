package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarVisuals;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSnackbarVisuals;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.ComposableSingletons$BlackWidowAdvancedChartComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartComposable4 {
    public static final BlackWidowAdvancedChartComposable4 INSTANCE = new BlackWidowAdvancedChartComposable4();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$786187035 = ComposableLambda3.composableLambdaInstance(786187035, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.ComposableSingletons$BlackWidowAdvancedChartComposableKt$lambda$786187035$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(786187035, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.ComposableSingletons$BlackWidowAdvancedChartComposableKt.lambda$786187035.<anonymous> (BlackWidowAdvancedChartComposable.kt:135)");
            }
            ChartLoadingAnimation.ChartLoadingAnimation(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<SnackbarData, Composer, Integer, Unit> lambda$1725000843 = ComposableLambda3.composableLambdaInstance(1725000843, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.ComposableSingletons$BlackWidowAdvancedChartComposableKt$lambda$1725000843$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarData it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1725000843, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.ComposableSingletons$BlackWidowAdvancedChartComposableKt.lambda$1725000843.<anonymous> (BlackWidowAdvancedChartComposable.kt:148)");
            }
            SnackbarVisuals visuals = it.getVisuals();
            ChartSnackbarVisuals chartSnackbarVisuals = visuals instanceof ChartSnackbarVisuals ? (ChartSnackbarVisuals) visuals : null;
            if (chartSnackbarVisuals != null) {
                ChartSnackbar2.ChartSnackbar(chartSnackbarVisuals, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1725000843$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<SnackbarData, Composer, Integer, Unit> m1747x95a70365() {
        return lambda$1725000843;
    }

    /* renamed from: getLambda$786187035$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m1748x1ec0074c() {
        return lambda$786187035;
    }
}
