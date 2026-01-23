package com.robinhood.android.chart.blackwidowadvancedchart.composables.templates;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SelectTemplateBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$SelectTemplateBottomSheetKt {
    public static final ComposableSingletons$SelectTemplateBottomSheetKt INSTANCE = new ComposableSingletons$SelectTemplateBottomSheetKt();

    /* renamed from: lambda$-150808066, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8708lambda$150808066 = ComposableLambda3.composableLambdaInstance(-150808066, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-150808066$1
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
                ComposerKt.traceEventStart(-150808066, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt.lambda$-150808066.<anonymous> (SelectTemplateBottomSheet.kt:68)");
            }
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6705copywmQWz5c$default(Color.INSTANCE.m6716getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1074849831, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8707lambda$1074849831 = ComposableLambda3.composableLambdaInstance(-1074849831, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$-1074849831$1
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
                ComposerKt.traceEventStart(-1074849831, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt.lambda$-1074849831.<anonymous> (SelectTemplateBottomSheet.kt:141)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.PLUS_24), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1981068762 = ComposableLambda3.composableLambdaInstance(1981068762, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt$lambda$1981068762$1
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
                ComposerKt.traceEventStart(1981068762, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.templates.ComposableSingletons$SelectTemplateBottomSheetKt.lambda$1981068762.<anonymous> (SelectTemplateBottomSheet.kt:150)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10963R.string.indicator_bottom_sheet_select_create, composer, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-367486715, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8709lambda$367486715 = ComposableLambda3.composableLambdaInstance(-367486715, false, C10884xd6adb58e.INSTANCE);

    /* renamed from: getLambda$-1074849831$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1797xac292961() {
        return f8707lambda$1074849831;
    }

    /* renamed from: getLambda$-150808066$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1798x11b45346() {
        return f8708lambda$150808066;
    }

    /* renamed from: getLambda$-367486715$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1799x683f0945() {
        return f8709lambda$367486715;
    }

    /* renamed from: getLambda$1981068762$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1800xfa2e9af3() {
        return lambda$1981068762;
    }
}
