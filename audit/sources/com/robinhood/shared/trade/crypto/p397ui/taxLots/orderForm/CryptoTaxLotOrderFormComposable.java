package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotOrderFormComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderFormComposable {
    public static final CryptoTaxLotOrderFormComposable INSTANCE = new CryptoTaxLotOrderFormComposable();

    /* renamed from: lambda$-1912189396, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9492lambda$1912189396 = ComposableLambda3.composableLambdaInstance(-1912189396, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt$lambda$-1912189396$1
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
                ComposerKt.traceEventStart(-1912189396, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt.lambda$-1912189396.<anonymous> (CryptoTaxLotOrderFormComposable.kt:61)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1794397953 = ComposableLambda3.composableLambdaInstance(1794397953, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt$lambda$1794397953$1
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
                ComposerKt.traceEventStart(1794397953, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt.lambda$1794397953.<anonymous> (CryptoTaxLotOrderFormComposable.kt:86)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-227521150, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f9493lambda$227521150 = ComposableLambda3.composableLambdaInstance(-227521150, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt$lambda$-227521150$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope OrderForm, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OrderForm, "$this$OrderForm");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227521150, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.ComposableSingletons$CryptoTaxLotOrderFormComposableKt.lambda$-227521150.<anonymous> (CryptoTaxLotOrderFormComposable.kt:87)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1912189396$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26011getLambda$1912189396$feature_trade_crypto_externalDebug() {
        return f9492lambda$1912189396;
    }

    /* renamed from: getLambda$-227521150$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m26012getLambda$227521150$feature_trade_crypto_externalDebug() {
        return f9493lambda$227521150;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1794397953$feature_trade_crypto_externalDebug() {
        return lambda$1794397953;
    }
}
