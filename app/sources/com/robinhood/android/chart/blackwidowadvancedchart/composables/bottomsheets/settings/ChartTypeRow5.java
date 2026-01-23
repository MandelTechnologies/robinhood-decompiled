package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartTypeRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartTypeRow5 {
    public static final ChartTypeRow5 INSTANCE = new ChartTypeRow5();

    /* renamed from: lambda$-443996764, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8689lambda$443996764 = ComposableLambda3.composableLambdaInstance(-443996764, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt$lambda$-443996764$1
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
                ComposerKt.traceEventStart(-443996764, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt.lambda$-443996764.<anonymous> (ChartTypeRow.kt:54)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$288417805 = ComposableLambda3.composableLambdaInstance(288417805, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt$lambda$288417805$1
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
                ComposerKt.traceEventStart(288417805, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartTypeRowKt.lambda$288417805.<anonymous> (ChartTypeRow.kt:119)");
            }
            Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1496448193, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8688lambda$1496448193 = ComposableLambda3.composableLambdaInstance(-1496448193, false, ChartTypeRow6.INSTANCE);

    /* renamed from: getLambda$-1496448193$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1761x328ffd43() {
        return f8688lambda$1496448193;
    }

    /* renamed from: getLambda$-443996764$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1762xedf9da70() {
        return f8689lambda$443996764;
    }

    /* renamed from: getLambda$288417805$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1763xc9eb3c8e() {
        return lambda$288417805;
    }
}
