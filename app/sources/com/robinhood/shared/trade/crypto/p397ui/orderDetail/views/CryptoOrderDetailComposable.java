package com.robinhood.shared.trade.crypto.p397ui.orderDetail.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.ComposableSingletons$CryptoOrderDetailComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderDetailComposable {
    public static final CryptoOrderDetailComposable INSTANCE = new CryptoOrderDetailComposable();
    private static Function2<Composer, Integer, Unit> lambda$1188804612 = ComposableLambda3.composableLambdaInstance(1188804612, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.ComposableSingletons$CryptoOrderDetailComposableKt$lambda$1188804612$1
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
                ComposerKt.traceEventStart(1188804612, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.ComposableSingletons$CryptoOrderDetailComposableKt.lambda$1188804612.<anonymous> (CryptoOrderDetailComposable.kt:115)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1188804612$feature_trade_crypto_externalDebug() {
        return lambda$1188804612;
    }
}
