package com.robinhood.android.optionschain.sbschain;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionschain.bottomsheet.OptionSideBySideChainNuxEduFooter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionSideBySideChainComposableKt {
    public static final ComposableSingletons$OptionSideBySideChainComposableKt INSTANCE = new ComposableSingletons$OptionSideBySideChainComposableKt();

    /* renamed from: lambda$-2086950222, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f9155lambda$2086950222 = ComposableLambda3.composableLambdaInstance(-2086950222, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.ComposableSingletons$OptionSideBySideChainComposableKt$lambda$-2086950222$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2086950222, i, -1, "com.robinhood.android.optionschain.sbschain.ComposableSingletons$OptionSideBySideChainComposableKt.lambda$-2086950222.<anonymous> (OptionSideBySideChainComposable.kt:317)");
            }
            OptionSideBySideChainNuxEduFooter.OptionSideBySideChainNuxEduFooter(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2086950222$feature_options_chain_externalDebug, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m17208getLambda$2086950222$feature_options_chain_externalDebug() {
        return f9155lambda$2086950222;
    }
}
