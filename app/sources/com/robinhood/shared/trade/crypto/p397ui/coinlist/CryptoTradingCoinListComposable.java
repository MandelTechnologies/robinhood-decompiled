package com.robinhood.shared.trade.crypto.p397ui.coinlist;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTradingCoinListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.ComposableSingletons$CryptoTradingCoinListComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTradingCoinListComposable {
    public static final CryptoTradingCoinListComposable INSTANCE = new CryptoTradingCoinListComposable();
    private static Function2<Composer, Integer, Unit> lambda$693859797 = ComposableLambda3.composableLambdaInstance(693859797, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.ComposableSingletons$CryptoTradingCoinListComposableKt$lambda$693859797$1
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
                ComposerKt.traceEventStart(693859797, i, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.ComposableSingletons$CryptoTradingCoinListComposableKt.lambda$693859797.<anonymous> (CryptoTradingCoinListComposable.kt:97)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_coin_list_selection_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$693859797$feature_trade_crypto_externalDebug() {
        return lambda$693859797;
    }
}
