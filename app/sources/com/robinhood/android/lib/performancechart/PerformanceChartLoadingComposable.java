package com.robinhood.android.lib.performancechart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.performancechart.ComposableSingletons$PerformanceChartLoadingComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceChartLoadingComposable {
    public static final PerformanceChartLoadingComposable INSTANCE = new PerformanceChartLoadingComposable();

    /* renamed from: lambda$-318541391, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9091lambda$318541391 = ComposableLambda3.composableLambdaInstance(-318541391, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.ComposableSingletons$PerformanceChartLoadingComposableKt$lambda$-318541391$1
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
                ComposerKt.traceEventStart(-318541391, i, -1, "com.robinhood.android.lib.performancechart.ComposableSingletons$PerformanceChartLoadingComposableKt.lambda$-318541391.<anonymous> (PerformanceChartLoadingComposable.kt:91)");
            }
            PerformanceChartLoadingComposable3.PerformanceChartLoadingComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-318541391$lib_performance_chart_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15841getLambda$318541391$lib_performance_chart_externalDebug() {
        return f9091lambda$318541391;
    }
}
