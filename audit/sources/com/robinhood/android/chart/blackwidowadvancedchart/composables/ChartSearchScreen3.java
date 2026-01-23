package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ChartSearchScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$ChartSearchScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartSearchScreen3 {
    public static final ChartSearchScreen3 INSTANCE = new ChartSearchScreen3();
    private static Function2<Composer, Integer, Unit> lambda$90187383 = ComposableLambda3.composableLambdaInstance(90187383, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$ChartSearchScreenKt$lambda$90187383$1
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
                ComposerKt.traceEventStart(90187383, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$ChartSearchScreenKt.lambda$90187383.<anonymous> (ChartSearchScreen.kt:70)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.chart_search_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$90187383$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1749xa238e5a0() {
        return lambda$90187383;
    }
}
