package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.model.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentsTrackerPerformanceChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerPerformanceChartKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerPerformanceChart {
    public static final InvestmentsTrackerPerformanceChart INSTANCE = new InvestmentsTrackerPerformanceChart();
    private static Function4<AnimatedContentScope, List<Point>, Composer, Integer, Unit> lambda$1858825410 = ComposableLambda3.composableLambdaInstance(1858825410, false, new Function4<AnimatedContentScope, List<Point>, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerPerformanceChartKt$lambda$1858825410$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, List<Point> list, Composer composer, Integer num) {
            invoke(animatedContentScope, list, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, List<Point> state, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1858825410, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerPerformanceChartKt.lambda$1858825410.<anonymous> (InvestmentsTrackerPerformanceChart.kt:120)");
            }
            GradientComponentWithDraw.GradientComponentWithDraw(extensions2.toPersistentList(state), ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), composer, Point.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<AnimatedContentScope, List<Point>, Composer, Integer, Unit> getLambda$1858825410$feature_investments_tracker_externalDebug() {
        return lambda$1858825410;
    }
}
