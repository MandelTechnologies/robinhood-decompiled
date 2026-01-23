package com.robinhood.android.chart.blackwidowadvancedchart.onboarding;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
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

/* compiled from: BlackWidowAdvanceChartNuxComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.ComposableSingletons$BlackWidowAdvanceChartNuxComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BlackWidowAdvanceChartNuxComposable3 {
    public static final BlackWidowAdvanceChartNuxComposable3 INSTANCE = new BlackWidowAdvanceChartNuxComposable3();
    private static Function2<Composer, Integer, Unit> lambda$118868873 = ComposableLambda3.composableLambdaInstance(118868873, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.ComposableSingletons$BlackWidowAdvanceChartNuxComposableKt$lambda$118868873$1
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
                ComposerKt.traceEventStart(118868873, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.ComposableSingletons$BlackWidowAdvanceChartNuxComposableKt.lambda$118868873.<anonymous> (BlackWidowAdvanceChartNuxComposable.kt:142)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$126267898 = ComposableLambda3.composableLambdaInstance(126267898, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.onboarding.ComposableSingletons$BlackWidowAdvanceChartNuxComposableKt$lambda$126267898$1
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
                ComposerKt.traceEventStart(126267898, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.onboarding.ComposableSingletons$BlackWidowAdvanceChartNuxComposableKt.lambda$126267898.<anonymous> (BlackWidowAdvanceChartNuxComposable.kt:149)");
            }
            IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getNova(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$118868873$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1809xe081ea11() {
        return lambda$118868873;
    }

    /* renamed from: getLambda$126267898$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1810xbddb166a() {
        return lambda$126267898;
    }
}
