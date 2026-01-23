package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTradeBonusReviewOrderBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTradeBonusReviewOrderBottomSheetComposable {
    public static final CryptoTradeBonusReviewOrderBottomSheetComposable INSTANCE = new CryptoTradeBonusReviewOrderBottomSheetComposable();

    /* renamed from: lambda$-1728891656, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9501lambda$1728891656 = ComposableLambda3.composableLambdaInstance(-1728891656, false, CryptoTradeBonusReviewOrderBottomSheetComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1763957004 = ComposableLambda3.composableLambdaInstance(1763957004, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt$lambda$1763957004$1
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
                ComposerKt.traceEventStart(1763957004, i, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt.lambda$1763957004.<anonymous> (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:163)");
            }
            CryptoTradeBonusReviewOrderBottomSheetComposable4.LoadingContent(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1728891656$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26048getLambda$1728891656$feature_trade_crypto_externalDebug() {
        return f9501lambda$1728891656;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1763957004$feature_trade_crypto_externalDebug() {
        return lambda$1763957004;
    }
}
