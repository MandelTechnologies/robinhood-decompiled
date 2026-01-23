package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorQuickAccessRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$IndicatorQuickAccessRowKt {
    public static final ComposableSingletons$IndicatorQuickAccessRowKt INSTANCE = new ComposableSingletons$IndicatorQuickAccessRowKt();

    /* renamed from: lambda$-314755052, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8701lambda$314755052 = ComposableLambda3.composableLambdaInstance(-314755052, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$IndicatorQuickAccessRowKt$lambda$-314755052$1
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
                ComposerKt.traceEventStart(-314755052, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$IndicatorQuickAccessRowKt.lambda$-314755052.<anonymous> (IndicatorQuickAccessRow.kt:102)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1928948456, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8700lambda$1928948456 = ComposableLambda3.composableLambdaInstance(-1928948456, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$IndicatorQuickAccessRowKt$lambda$-1928948456$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 IndicatorPill, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(IndicatorPill, "$this$IndicatorPill");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1928948456, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$IndicatorQuickAccessRowKt.lambda$-1928948456.<anonymous> (IndicatorQuickAccessRow.kt:352)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.FOLDER_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10963R.string.indicators_quick_access_save_set, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$247622988 = ComposableLambda3.composableLambdaInstance(247622988, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$IndicatorQuickAccessRowKt$lambda$247622988$1
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
                ComposerKt.traceEventStart(247622988, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.ComposableSingletons$IndicatorQuickAccessRowKt.lambda$247622988.<anonymous> (IndicatorQuickAccessRow.kt:374)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1928948456$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<Row5, Composer, Integer, Unit> m1782xd91cc50() {
        return f8700lambda$1928948456;
    }

    /* renamed from: getLambda$-314755052$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1783x416b0216() {
        return f8701lambda$314755052;
    }

    /* renamed from: getLambda$247622988$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1784xfc31f20b() {
        return lambda$247622988;
    }
}
