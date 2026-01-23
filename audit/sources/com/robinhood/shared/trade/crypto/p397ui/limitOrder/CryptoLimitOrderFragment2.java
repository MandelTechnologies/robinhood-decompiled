package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoLimitOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.ComposableSingletons$CryptoLimitOrderFragmentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoLimitOrderFragment2 {
    public static final CryptoLimitOrderFragment2 INSTANCE = new CryptoLimitOrderFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1643774753 = ComposableLambda3.composableLambdaInstance(1643774753, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.ComposableSingletons$CryptoLimitOrderFragmentKt$lambda$1643774753$1
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
                ComposerKt.traceEventStart(1643774753, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.ComposableSingletons$CryptoLimitOrderFragmentKt.lambda$1643774753.<anonymous> (CryptoLimitOrderFragment.kt:255)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 1, composer, 3120, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1834855785 = ComposableLambda3.composableLambdaInstance(1834855785, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.limitOrder.ComposableSingletons$CryptoLimitOrderFragmentKt$lambda$1834855785$1
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
                ComposerKt.traceEventStart(1834855785, i, -1, "com.robinhood.shared.trade.crypto.ui.limitOrder.ComposableSingletons$CryptoLimitOrderFragmentKt.lambda$1834855785.<anonymous> (CryptoLimitOrderFragment.kt:254)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoLimitOrderFragment2.INSTANCE.getLambda$1643774753$feature_trade_crypto_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1643774753$feature_trade_crypto_externalDebug() {
        return lambda$1643774753;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1834855785$feature_trade_crypto_externalDebug() {
        return lambda$1834855785;
    }
}
