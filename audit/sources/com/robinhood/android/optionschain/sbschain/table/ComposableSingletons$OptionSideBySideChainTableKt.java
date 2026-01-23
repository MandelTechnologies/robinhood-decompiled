package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionSideBySideChainTableKt {
    public static final ComposableSingletons$OptionSideBySideChainTableKt INSTANCE = new ComposableSingletons$OptionSideBySideChainTableKt();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$1405615147 = ComposableLambda3.composableLambdaInstance(1405615147, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.ComposableSingletons$OptionSideBySideChainTableKt$lambda$1405615147$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1405615147, i, -1, "com.robinhood.android.optionschain.sbschain.table.ComposableSingletons$OptionSideBySideChainTableKt.lambda$1405615147.<anonymous> (OptionSideBySideChainTable.kt:912)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), C2002Dp.m7995constructorimpl(1), composer, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$1311820244 = ComposableLambda3.composableLambdaInstance(1311820244, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.ComposableSingletons$OptionSideBySideChainTableKt$lambda$1311820244$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1311820244, i, -1, "com.robinhood.android.optionschain.sbschain.table.ComposableSingletons$OptionSideBySideChainTableKt.lambda$1311820244.<anonymous> (OptionSideBySideChainTable.kt:921)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU(), C2002Dp.m7995constructorimpl(1), composer, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$1311820244$feature_options_chain_externalDebug() {
        return lambda$1311820244;
    }

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$1405615147$feature_options_chain_externalDebug() {
        return lambda$1405615147;
    }
}
