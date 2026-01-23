package com.robinhood.shared.trade.crypto.p397ui.fee.preference.unsupported;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.ComposableSingletons$CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable {
    public static final CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable INSTANCE = new CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable();

    /* renamed from: lambda$-98847760, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9484lambda$98847760 = ComposableLambda3.composableLambdaInstance(-98847760, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.ComposableSingletons$CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt$lambda$-98847760$1
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
                ComposerKt.traceEventStart(-98847760, i, -1, "com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.ComposableSingletons$CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt.lambda$-98847760.<anonymous> (CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.kt:27)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), "", BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-98847760$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25832getLambda$98847760$feature_trade_crypto_externalDebug() {
        return f9484lambda$98847760;
    }
}
