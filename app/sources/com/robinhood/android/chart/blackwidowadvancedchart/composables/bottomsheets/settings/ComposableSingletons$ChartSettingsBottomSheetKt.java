package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.layout.BoxKt;
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

/* compiled from: ChartSettingsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$ChartSettingsBottomSheetKt {
    public static final ComposableSingletons$ChartSettingsBottomSheetKt INSTANCE = new ComposableSingletons$ChartSettingsBottomSheetKt();

    /* renamed from: lambda$-1951359210, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8686lambda$1951359210 = ComposableLambda3.composableLambdaInstance(-1951359210, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$-1951359210$1
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
                ComposerKt.traceEventStart(-1951359210, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt.lambda$-1951359210.<anonymous> (ChartSettingsBottomSheet.kt:83)");
            }
            ChartSettingsBottomSheetKt.SettingsDragHandle(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-248420979, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8687lambda$248420979 = ComposableLambda3.composableLambdaInstance(-248420979, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$-248420979$1
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
                ComposerKt.traceEventStart(-248420979, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt.lambda$-248420979.<anonymous> (ChartSettingsBottomSheet.kt:87)");
            }
            SettingsTitle3.SettingsTitle(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1085195401 = ComposableLambda3.composableLambdaInstance(1085195401, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$1085195401$1
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
                ComposerKt.traceEventStart(1085195401, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt.lambda$1085195401.<anonymous> (ChartSettingsBottomSheet.kt:113)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$727547686 = ComposableLambda3.composableLambdaInstance(727547686, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt$lambda$727547686$1
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
                ComposerKt.traceEventStart(727547686, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$ChartSettingsBottomSheetKt.lambda$727547686.<anonymous> (ChartSettingsBottomSheet.kt:153)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BoxKt.Box(SizeKt.m5171sizeVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$101484589 = ComposableLambda3.composableLambdaInstance(101484589, false, C10718x30b23781.INSTANCE);

    /* renamed from: getLambda$-1951359210$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1755x11564358() {
        return f8686lambda$1951359210;
    }

    /* renamed from: getLambda$-248420979$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1756x5cf59203() {
        return f8687lambda$248420979;
    }

    /* renamed from: getLambda$101484589$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1757x7067b28b() {
        return lambda$101484589;
    }

    /* renamed from: getLambda$1085195401$feature_black_widow_advanced_chart_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1758xca32ab31() {
        return lambda$1085195401;
    }

    /* renamed from: getLambda$727547686$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1759xd1d657cb() {
        return lambda$727547686;
    }
}
