package com.robinhood.android.optionschain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionchain.composable.OptionChainListLoadingComposable3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainAdapter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.ComposableSingletons$OptionChainAdapterKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainAdapter2 {
    public static final OptionChainAdapter2 INSTANCE = new OptionChainAdapter2();
    private static Function2<Composer, Integer, Unit> lambda$1635879458 = ComposableLambda3.composableLambdaInstance(1635879458, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.ComposableSingletons$OptionChainAdapterKt$lambda$1635879458$1
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
                ComposerKt.traceEventStart(1635879458, i, -1, "com.robinhood.android.optionschain.ComposableSingletons$OptionChainAdapterKt.lambda$1635879458.<anonymous> (OptionChainAdapter.kt:274)");
            }
            OptionChainListLoadingComposable3.OptionChainListLoadingComposable(null, 0, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1111614870, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9152lambda$1111614870 = ComposableLambda3.composableLambdaInstance(-1111614870, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.ComposableSingletons$OptionChainAdapterKt$lambda$-1111614870$1
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
                ComposerKt.traceEventStart(-1111614870, i, -1, "com.robinhood.android.optionschain.ComposableSingletons$OptionChainAdapterKt.lambda$-1111614870.<anonymous> (OptionChainAdapter.kt:273)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, OptionChainAdapter2.INSTANCE.getLambda$1635879458$feature_options_chain_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1111614870$feature_options_chain_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17078getLambda$1111614870$feature_options_chain_externalDebug() {
        return f9152lambda$1111614870;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1635879458$feature_options_chain_externalDebug() {
        return lambda$1635879458;
    }
}
