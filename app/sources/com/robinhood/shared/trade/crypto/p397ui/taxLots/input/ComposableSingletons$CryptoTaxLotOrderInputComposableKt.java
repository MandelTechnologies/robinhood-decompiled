package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTaxLotOrderInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$CryptoTaxLotOrderInputComposableKt {
    public static final ComposableSingletons$CryptoTaxLotOrderInputComposableKt INSTANCE = new ComposableSingletons$CryptoTaxLotOrderInputComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$2131732199 = ComposableLambda3.composableLambdaInstance(2131732199, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.input.ComposableSingletons$CryptoTaxLotOrderInputComposableKt$lambda$2131732199$1
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
                ComposerKt.traceEventStart(2131732199, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.input.ComposableSingletons$CryptoTaxLotOrderInputComposableKt.lambda$2131732199.<anonymous> (CryptoTaxLotOrderInputComposable.kt:67)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2131732199$feature_trade_crypto_externalDebug() {
        return lambda$2131732199;
    }
}
