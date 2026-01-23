package com.robinhood.android.optionchain.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainListLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.composable.ComposableSingletons$OptionChainListLoadingComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionChainListLoadingComposable {
    public static final OptionChainListLoadingComposable INSTANCE = new OptionChainListLoadingComposable();

    /* renamed from: lambda$-1856985415, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9128lambda$1856985415 = ComposableLambda3.composableLambdaInstance(-1856985415, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionchain.composable.ComposableSingletons$OptionChainListLoadingComposableKt$lambda$-1856985415$1
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
                ComposerKt.traceEventStart(-1856985415, i, -1, "com.robinhood.android.optionchain.composable.ComposableSingletons$OptionChainListLoadingComposableKt.lambda$-1856985415.<anonymous> (OptionChainListLoadingComposable.kt:80)");
            }
            OptionChainListLoadingComposable3.OptionChainListLoadingComposable(null, 0, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1856985415$feature_lib_option_chain_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16883getLambda$1856985415$feature_lib_option_chain_externalDebug() {
        return f9128lambda$1856985415;
    }
}
