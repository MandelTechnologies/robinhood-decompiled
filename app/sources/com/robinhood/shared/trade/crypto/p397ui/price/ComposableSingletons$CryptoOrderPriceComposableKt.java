package com.robinhood.shared.trade.crypto.p397ui.price;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderPriceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$CryptoOrderPriceComposableKt {
    public static final ComposableSingletons$CryptoOrderPriceComposableKt INSTANCE = new ComposableSingletons$CryptoOrderPriceComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1208242244 = ComposableLambda3.composableLambdaInstance(1208242244, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.ComposableSingletons$CryptoOrderPriceComposableKt$lambda$1208242244$1
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
                ComposerKt.traceEventStart(1208242244, i, -1, "com.robinhood.shared.trade.crypto.ui.price.ComposableSingletons$CryptoOrderPriceComposableKt.lambda$1208242244.<anonymous> (CryptoOrderPriceComposable.kt:107)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1208242244$feature_trade_crypto_externalDebug() {
        return lambda$1208242244;
    }
}
