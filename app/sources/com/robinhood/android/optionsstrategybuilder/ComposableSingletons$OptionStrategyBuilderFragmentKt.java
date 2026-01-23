package com.robinhood.android.optionsstrategybuilder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionchain.composable.OptionChainListLoadingComposable3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionStrategyBuilderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionStrategyBuilderFragmentKt {
    public static final ComposableSingletons$OptionStrategyBuilderFragmentKt INSTANCE = new ComposableSingletons$OptionStrategyBuilderFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$1712300587 = ComposableLambda3.composableLambdaInstance(1712300587, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsstrategybuilder.ComposableSingletons$OptionStrategyBuilderFragmentKt$lambda$1712300587$1
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
                ComposerKt.traceEventStart(1712300587, i, -1, "com.robinhood.android.optionsstrategybuilder.ComposableSingletons$OptionStrategyBuilderFragmentKt.lambda$1712300587.<anonymous> (OptionStrategyBuilderFragment.kt:282)");
            }
            OptionChainListLoadingComposable3.OptionChainListLoadingComposable(null, 0, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$281937523 = ComposableLambda3.composableLambdaInstance(281937523, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsstrategybuilder.ComposableSingletons$OptionStrategyBuilderFragmentKt$lambda$281937523$1
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
                ComposerKt.traceEventStart(281937523, i, -1, "com.robinhood.android.optionsstrategybuilder.ComposableSingletons$OptionStrategyBuilderFragmentKt.lambda$281937523.<anonymous> (OptionStrategyBuilderFragment.kt:281)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$OptionStrategyBuilderFragmentKt.INSTANCE.m2354x7dfa42d7(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1712300587$feature_options_strategy_builder_externalDebug */
    public final Function2<Composer, Integer, Unit> m2354x7dfa42d7() {
        return lambda$1712300587;
    }

    /* renamed from: getLambda$281937523$feature_options_strategy_builder_externalDebug */
    public final Function2<Composer, Integer, Unit> m2355xce56a589() {
        return lambda$281937523;
    }
}
