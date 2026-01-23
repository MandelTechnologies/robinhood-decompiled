package com.robinhood.android.crypto.p094ui.detail.p095v2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CryptoDetailComposableKt {
    public static final ComposableSingletons$CryptoDetailComposableKt INSTANCE = new ComposableSingletons$CryptoDetailComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1428617090 = ComposableLambda3.composableLambdaInstance(1428617090, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.ComposableSingletons$CryptoDetailComposableKt$lambda$1428617090$1
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
                ComposerKt.traceEventStart(1428617090, i, -1, "com.robinhood.android.crypto.ui.detail.v2.ComposableSingletons$CryptoDetailComposableKt.lambda$1428617090.<anonymous> (CryptoDetailComposable.kt:327)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1428617090$feature_crypto_externalDebug() {
        return lambda$1428617090;
    }
}
