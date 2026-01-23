package com.robinhood.shared.trade.crypto.views.orderForm;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.views.orderForm.ComposableSingletons$CryptoOrderReviewComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderReviewComposable {
    public static final CryptoOrderReviewComposable INSTANCE = new CryptoOrderReviewComposable();
    private static Function2<Composer, Integer, Unit> lambda$1578544075 = ComposableLambda3.composableLambdaInstance(1578544075, false, CryptoOrderReviewComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$166778499 = ComposableLambda3.composableLambdaInstance(166778499, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.views.orderForm.ComposableSingletons$CryptoOrderReviewComposableKt$lambda$166778499$1
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
                ComposerKt.traceEventStart(166778499, i, -1, "com.robinhood.shared.trade.crypto.views.orderForm.ComposableSingletons$CryptoOrderReviewComposableKt.lambda$166778499.<anonymous> (CryptoOrderReviewComposable.kt:86)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoOrderReviewComposable.INSTANCE.getLambda$1578544075$feature_trade_crypto_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1578544075$feature_trade_crypto_externalDebug() {
        return lambda$1578544075;
    }

    public final Function2<Composer, Integer, Unit> getLambda$166778499$feature_trade_crypto_externalDebug() {
        return lambda$166778499;
    }
}
