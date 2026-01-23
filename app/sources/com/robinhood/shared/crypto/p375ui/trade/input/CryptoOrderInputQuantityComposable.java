package com.robinhood.shared.crypto.p375ui.trade.input;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderInputQuantityComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderInputQuantityComposable {
    public static final CryptoOrderInputQuantityComposable INSTANCE = new CryptoOrderInputQuantityComposable();
    private static Function2<Composer, Integer, Unit> lambda$68423805 = ComposableLambda3.composableLambdaInstance(68423805, false, CryptoOrderInputQuantityComposable3.INSTANCE);

    /* renamed from: lambda$-902895931, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9446lambda$902895931 = ComposableLambda3.composableLambdaInstance(-902895931, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt$lambda$-902895931$1
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
                ComposerKt.traceEventStart(-902895931, i, -1, "com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt.lambda$-902895931.<anonymous> (CryptoOrderInputQuantityComposable.kt:84)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoOrderInputQuantityComposable.INSTANCE.getLambda$68423805$lib_crypto_ui_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-902895931$lib_crypto_ui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25258getLambda$902895931$lib_crypto_ui_externalDebug() {
        return f9446lambda$902895931;
    }

    public final Function2<Composer, Integer, Unit> getLambda$68423805$lib_crypto_ui_externalDebug() {
        return lambda$68423805;
    }
}
