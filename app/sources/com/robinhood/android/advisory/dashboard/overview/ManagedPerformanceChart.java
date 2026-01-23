package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagedPerformanceChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedPerformanceChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedPerformanceChart {
    public static final ManagedPerformanceChart INSTANCE = new ManagedPerformanceChart();
    private static Function3<Row5, Composer, Integer, Unit> lambda$1233940967 = ComposableLambda3.composableLambdaInstance(1233940967, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedPerformanceChartKt$lambda$1233940967$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 GlowingGradientBorderButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(GlowingGradientBorderButton, "$this$GlowingGradientBorderButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233940967, i, -1, "com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedPerformanceChartKt.lambda$1233940967.<anonymous> (ManagedPerformanceChart.kt:157)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C8626R.string.projected_returns_entry_point_text, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8170);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<Row5, Composer, Integer, Unit> getLambda$1233940967$lib_advisory_dashboard_externalDebug() {
        return lambda$1233940967;
    }
}
