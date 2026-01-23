package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsProfitAndLossChartViewState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.ComposableSingletons$OptionsProfitAndLossChartViewStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsProfitAndLossChartViewState2 {
    public static final OptionsProfitAndLossChartViewState2 INSTANCE = new OptionsProfitAndLossChartViewState2();
    private static Function2<Composer, Integer, Unit> lambda$1934188814 = ComposableLambda3.composableLambdaInstance(1934188814, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.ComposableSingletons$OptionsProfitAndLossChartViewStateKt$lambda$1934188814$1
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
                ComposerKt.traceEventStart(1934188814, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.ComposableSingletons$OptionsProfitAndLossChartViewStateKt.lambda$1934188814.<anonymous> (OptionsProfitAndLossChartViewState.kt:362)");
            }
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1934188814$lib_options_simulated_return_externalDebug() {
        return lambda$1934188814;
    }
}
