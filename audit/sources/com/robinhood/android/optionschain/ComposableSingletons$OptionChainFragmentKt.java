package com.robinhood.android.optionschain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionChainFragmentKt {
    public static final ComposableSingletons$OptionChainFragmentKt INSTANCE = new ComposableSingletons$OptionChainFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$2051267481 = ComposableLambda3.composableLambdaInstance(2051267481, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.ComposableSingletons$OptionChainFragmentKt$lambda$2051267481$1
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
                ComposerKt.traceEventStart(2051267481, i, -1, "com.robinhood.android.optionschain.ComposableSingletons$OptionChainFragmentKt.lambda$2051267481.<anonymous> (OptionChainFragment.kt:1069)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2051267481$feature_options_chain_externalDebug() {
        return lambda$2051267481;
    }
}
