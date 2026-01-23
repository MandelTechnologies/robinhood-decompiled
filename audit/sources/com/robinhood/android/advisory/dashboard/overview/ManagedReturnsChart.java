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

/* compiled from: ManagedReturnsChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedReturnsChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedReturnsChart {
    public static final ManagedReturnsChart INSTANCE = new ManagedReturnsChart();

    /* renamed from: lambda$-438123830, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8625lambda$438123830 = ComposableLambda3.composableLambdaInstance(-438123830, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedReturnsChartKt$lambda$-438123830$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438123830, i, -1, "com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedReturnsChartKt.lambda$-438123830.<anonymous> (ManagedReturnsChart.kt:196)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_hub_entry_point_text, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8170);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-438123830$lib_advisory_dashboard_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m11002getLambda$438123830$lib_advisory_dashboard_externalDebug() {
        return f8625lambda$438123830;
    }
}
