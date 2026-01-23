package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

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

/* compiled from: LayerGroupRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$LayerGroupRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LayerGroupRow {
    public static final LayerGroupRow INSTANCE = new LayerGroupRow();

    /* renamed from: lambda$-157879881, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8690lambda$157879881 = ComposableLambda3.composableLambdaInstance(-157879881, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$LayerGroupRowKt$lambda$-157879881$1
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
                ComposerKt.traceEventStart(-157879881, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$LayerGroupRowKt.lambda$-157879881.<anonymous> (LayerGroupRow.kt:47)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1838989138, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8691lambda$1838989138 = ComposableLambda3.composableLambdaInstance(-1838989138, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$LayerGroupRowKt$lambda$-1838989138$1
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
                ComposerKt.traceEventStart(-1838989138, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$LayerGroupRowKt.lambda$-1838989138.<anonymous> (LayerGroupRow.kt:109)");
            }
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1140240277 = ComposableLambda3.composableLambdaInstance(1140240277, false, LayerGroupRow4.INSTANCE);

    /* renamed from: getLambda$-157879881$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1764x9bb68f18() {
        return f8690lambda$157879881;
    }

    /* renamed from: getLambda$-1838989138$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1765x6e94abce() {
        return f8691lambda$1838989138;
    }

    /* renamed from: getLambda$1140240277$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1766xc67be4d5() {
        return lambda$1140240277;
    }
}
