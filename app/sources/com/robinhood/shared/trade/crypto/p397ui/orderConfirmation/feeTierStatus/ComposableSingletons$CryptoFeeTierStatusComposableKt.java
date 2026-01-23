package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoFeeTierStatusComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$CryptoFeeTierStatusComposableKt {
    public static final ComposableSingletons$CryptoFeeTierStatusComposableKt INSTANCE = new ComposableSingletons$CryptoFeeTierStatusComposableKt();

    /* renamed from: lambda$-815735632, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9487lambda$815735632 = ComposableLambda3.composableLambdaInstance(-815735632, false, C40374xd542c9b1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1241477480 = ComposableLambda3.composableLambdaInstance(1241477480, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt$lambda$1241477480$1
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
                ComposerKt.traceEventStart(1241477480, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt.lambda$1241477480.<anonymous> (CryptoFeeTierStatusComposable.kt:275)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoFeeTierStatusComposableKt.INSTANCE.m25878getLambda$815735632$feature_trade_crypto_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-815735632$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25878getLambda$815735632$feature_trade_crypto_externalDebug() {
        return f9487lambda$815735632;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1241477480$feature_trade_crypto_externalDebug() {
        return lambda$1241477480;
    }
}
