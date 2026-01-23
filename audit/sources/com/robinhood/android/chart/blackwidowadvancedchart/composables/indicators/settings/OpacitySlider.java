package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SliderState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpacitySlider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$OpacitySliderKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class OpacitySlider {
    public static final OpacitySlider INSTANCE = new OpacitySlider();

    /* renamed from: lambda$-358525178, reason: not valid java name */
    private static Function3<SliderState, Composer, Integer, Unit> f8703lambda$358525178 = ComposableLambda3.composableLambdaInstance(-358525178, false, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$OpacitySliderKt$lambda$-358525178$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358525178, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$OpacitySliderKt.lambda$-358525178.<anonymous> (OpacitySlider.kt:122)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BoxKt.Box(Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-843470427, reason: not valid java name */
    private static Function3<SliderState, Composer, Integer, Unit> f8704lambda$843470427 = ComposableLambda3.composableLambdaInstance(-843470427, false, new Function3<SliderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$OpacitySliderKt$lambda$-843470427$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer, Integer num) {
            invoke(sliderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SliderState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-843470427, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$OpacitySliderKt.lambda$-843470427.<anonymous> (OpacitySlider.kt:130)");
            }
            BoxKt.Box(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-358525178$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<SliderState, Composer, Integer, Unit> m1792x9a8205d2() {
        return f8703lambda$358525178;
    }

    /* renamed from: getLambda$-843470427$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<SliderState, Composer, Integer, Unit> m1793xcb8129f() {
        return f8704lambda$843470427;
    }
}
