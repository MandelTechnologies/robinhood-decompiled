package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarVisuals;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSnackbarVisuals;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ChartSnackbar2;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddIndicatorScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$AddIndicatorScreenKt {
    public static final ComposableSingletons$AddIndicatorScreenKt INSTANCE = new ComposableSingletons$AddIndicatorScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$465674019 = ComposableLambda3.composableLambdaInstance(465674019, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$465674019$1
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
                ComposerKt.traceEventStart(465674019, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt.lambda$465674019.<anonymous> (AddIndicatorScreen.kt:394)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<SnackbarData, Composer, Integer, Unit> lambda$130956949 = ComposableLambda3.composableLambdaInstance(130956949, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$130956949$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarData it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(130956949, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt.lambda$130956949.<anonymous> (AddIndicatorScreen.kt:113)");
            }
            SnackbarVisuals visuals = it.getVisuals();
            ChartSnackbarVisuals chartSnackbarVisuals = visuals instanceof ChartSnackbarVisuals ? (ChartSnackbarVisuals) visuals : null;
            if (chartSnackbarVisuals != null) {
                ChartSnackbar2.ChartSnackbar(chartSnackbarVisuals, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1177032550, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8699lambda$1177032550 = ComposableLambda3.composableLambdaInstance(-1177032550, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$-1177032550$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(item) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177032550, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt.lambda$-1177032550.<anonymous> (AddIndicatorScreen.kt:290)");
            }
            Modifier modifierAnimateItem$default = LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null);
            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_popular_indicators_section_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAnimateItem$default, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$899005695 = ComposableLambda3.composableLambdaInstance(899005695, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt$lambda$899005695$1
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
                ComposerKt.traceEventStart(899005695, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$AddIndicatorScreenKt.lambda$899005695.<anonymous> (AddIndicatorScreen.kt:332)");
            }
            Spacer2.Spacer(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1857233451 = ComposableLambda3.composableLambdaInstance(1857233451, false, ComposableSingletons$AddIndicatorScreenKt$lambda$1857233451$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$446187962 = ComposableLambda3.composableLambdaInstance(446187962, false, ComposableSingletons$AddIndicatorScreenKt$lambda$446187962$1.INSTANCE);

    /* renamed from: getLambda$-1177032550$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1776x742fc35() {
        return f8699lambda$1177032550;
    }

    /* renamed from: getLambda$130956949$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<SnackbarData, Composer, Integer, Unit> m1777x23ebfe91() {
        return lambda$130956949;
    }

    /* renamed from: getLambda$1857233451$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1778x873d7e2e() {
        return lambda$1857233451;
    }

    /* renamed from: getLambda$446187962$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1779x73ea7228() {
        return lambda$446187962;
    }

    /* renamed from: getLambda$465674019$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1780x7804d12b() {
        return lambda$465674019;
    }

    /* renamed from: getLambda$899005695$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1781x6894c38e() {
        return lambda$899005695;
    }
}
