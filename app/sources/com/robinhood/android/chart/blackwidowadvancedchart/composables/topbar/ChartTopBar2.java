package com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar;

import androidx.compose.material.icons.Icons2;
import androidx.compose.material.icons.automirrored.filled.ArrowBack;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ChartTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartTopBar2 {
    public static final ChartTopBar2 INSTANCE = new ChartTopBar2();
    private static Function2<Composer, Integer, Unit> lambda$542796755 = ComposableLambda3.composableLambdaInstance(542796755, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt$lambda$542796755$1
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
                ComposerKt.traceEventStart(542796755, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt.lambda$542796755.<anonymous> (ChartTopBar.kt:76)");
            }
            IconKt.m5872Iconww6aTOc(ArrowBack.getArrowBack(Icons2.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-62992088, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8711lambda$62992088 = ComposableLambda3.composableLambdaInstance(-62992088, false, ChartTopBar3.INSTANCE);

    /* renamed from: getLambda$-62992088$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1803x16c8fadc() {
        return f8711lambda$62992088;
    }

    /* renamed from: getLambda$542796755$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1804xb699aa4d() {
        return lambda$542796755;
    }
}
