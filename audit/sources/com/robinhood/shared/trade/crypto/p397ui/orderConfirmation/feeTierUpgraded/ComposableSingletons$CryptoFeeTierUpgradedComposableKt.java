package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$CryptoFeeTierUpgradedComposableKt {
    public static final ComposableSingletons$CryptoFeeTierUpgradedComposableKt INSTANCE = new ComposableSingletons$CryptoFeeTierUpgradedComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1820059056 = ComposableLambda3.composableLambdaInstance(1820059056, false, C40388xfdd552be.INSTANCE);

    /* renamed from: lambda$-1747886488, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9488lambda$1747886488 = ComposableLambda3.composableLambdaInstance(-1747886488, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt$lambda$-1747886488$1
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
                ComposerKt.traceEventStart(-1747886488, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt.lambda$-1747886488.<anonymous> (CryptoFeeTierUpgradedComposable.kt:452)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$CryptoFeeTierUpgradedComposableKt.INSTANCE.getLambda$1820059056$feature_trade_crypto_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1747886488$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25889getLambda$1747886488$feature_trade_crypto_externalDebug() {
        return f9488lambda$1747886488;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1820059056$feature_trade_crypto_externalDebug() {
        return lambda$1820059056;
    }
}
