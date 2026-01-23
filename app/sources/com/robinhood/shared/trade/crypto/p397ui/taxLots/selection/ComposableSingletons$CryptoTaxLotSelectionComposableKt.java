package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTaxLotSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$CryptoTaxLotSelectionComposableKt {
    public static final ComposableSingletons$CryptoTaxLotSelectionComposableKt INSTANCE = new ComposableSingletons$CryptoTaxLotSelectionComposableKt();

    /* renamed from: lambda$-1316131724, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9494lambda$1316131724 = ComposableLambda3.composableLambdaInstance(-1316131724, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.ComposableSingletons$CryptoTaxLotSelectionComposableKt$lambda$-1316131724$1
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
                ComposerKt.traceEventStart(-1316131724, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.ComposableSingletons$CryptoTaxLotSelectionComposableKt.lambda$-1316131724.<anonymous> (CryptoTaxLotSelectionComposable.kt:91)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1316131724$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26017getLambda$1316131724$feature_trade_crypto_externalDebug() {
        return f9494lambda$1316131724;
    }
}
