package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoRecurringOrderUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.ComposableSingletons$CryptoRecurringOrderUpsellComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoRecurringOrderUpsellComposable {
    public static final CryptoRecurringOrderUpsellComposable INSTANCE = new CryptoRecurringOrderUpsellComposable();

    /* renamed from: lambda$-1848733620, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9486lambda$1848733620 = ComposableLambda3.composableLambdaInstance(-1848733620, false, CryptoRecurringOrderUpsellComposable3.INSTANCE);

    /* renamed from: lambda$-1824270700, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9485lambda$1824270700 = ComposableLambda3.composableLambdaInstance(-1824270700, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.ComposableSingletons$CryptoRecurringOrderUpsellComposableKt$lambda$-1824270700$1
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
                ComposerKt.traceEventStart(-1824270700, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.ComposableSingletons$CryptoRecurringOrderUpsellComposableKt.lambda$-1824270700.<anonymous> (CryptoRecurringOrderUpsellComposable.kt:121)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoRecurringOrderUpsellComposable.INSTANCE.m25862getLambda$1848733620$feature_trade_crypto_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1824270700$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25861getLambda$1824270700$feature_trade_crypto_externalDebug() {
        return f9485lambda$1824270700;
    }

    /* renamed from: getLambda$-1848733620$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25862getLambda$1848733620$feature_trade_crypto_externalDebug() {
        return f9486lambda$1848733620;
    }
}
