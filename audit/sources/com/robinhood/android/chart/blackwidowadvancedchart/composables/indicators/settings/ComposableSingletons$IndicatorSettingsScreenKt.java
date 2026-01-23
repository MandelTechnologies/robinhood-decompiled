package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorSettingsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$IndicatorSettingsScreenKt {
    public static final ComposableSingletons$IndicatorSettingsScreenKt INSTANCE = new ComposableSingletons$IndicatorSettingsScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1155541724 = ComposableLambda3.composableLambdaInstance(1155541724, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$1155541724$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1155541724, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt.lambda$1155541724.<anonymous> (IndicatorSettingsScreen.kt:198)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null);
            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicator_settings_parameter_title, composer, 0);
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$214793823 = ComposableLambda3.composableLambdaInstance(214793823, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$214793823$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(214793823, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt.lambda$214793823.<anonymous> (IndicatorSettingsScreen.kt:351)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$118919698 = ComposableLambda3.composableLambdaInstance(118919698, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt$lambda$118919698$1
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
                ComposerKt.traceEventStart(118919698, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ComposableSingletons$IndicatorSettingsScreenKt.lambda$118919698.<anonymous> (IndicatorSettingsScreen.kt:407)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1782221732 = ComposableLambda3.composableLambdaInstance(1782221732, false, C10818xf1176683.INSTANCE);

    /* renamed from: getLambda$1155541724$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1788xb9ddba2e() {
        return lambda$1155541724;
    }

    /* renamed from: getLambda$118919698$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1789xf83cbd17() {
        return lambda$118919698;
    }

    /* renamed from: getLambda$1782221732$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1790x24893bd0() {
        return lambda$1782221732;
    }

    /* renamed from: getLambda$214793823$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1791x79b6d006() {
        return lambda$214793823;
    }
}
