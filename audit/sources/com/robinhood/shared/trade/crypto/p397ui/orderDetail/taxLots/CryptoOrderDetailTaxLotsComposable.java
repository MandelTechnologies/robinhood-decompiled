package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.ComposableSingletons$CryptoOrderDetailTaxLotsComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderDetailTaxLotsComposable {
    public static final CryptoOrderDetailTaxLotsComposable INSTANCE = new CryptoOrderDetailTaxLotsComposable();

    /* renamed from: lambda$-1326985766, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9489lambda$1326985766 = ComposableLambda3.composableLambdaInstance(-1326985766, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.ComposableSingletons$CryptoOrderDetailTaxLotsComposableKt$lambda$-1326985766$1
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
                ComposerKt.traceEventStart(-1326985766, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.ComposableSingletons$CryptoOrderDetailTaxLotsComposableKt.lambda$-1326985766.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:51)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1326985766$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25909getLambda$1326985766$feature_trade_crypto_externalDebug() {
        return f9489lambda$1326985766;
    }
}
