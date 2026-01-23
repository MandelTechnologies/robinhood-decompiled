package com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTradeBonusReviewOrderBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt$lambda$-1728891656$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTradeBonusReviewOrderBottomSheetComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoTradeBonusReviewOrderBottomSheetComposable2 INSTANCE = new CryptoTradeBonusReviewOrderBottomSheetComposable2();

    CryptoTradeBonusReviewOrderBottomSheetComposable2() {
    }

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
            ComposerKt.traceEventStart(-1728891656, i, -1, "com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt.lambda$-1728891656.<anonymous> (CryptoTradeBonusReviewOrderBottomSheetComposable.kt:151)");
        }
        CryptoTradeBonusReviewOrderBottomSheetViewState.Loaded loadedGenerate = CryptoTradeBonusReviewOrderBottomSheetViewState_LoadedMock.INSTANCE.generate();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt$lambda$-1728891656$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.tradeBonus.reviewOrderBottomSheet.ComposableSingletons$CryptoTradeBonusReviewOrderBottomSheetComposableKt$lambda$-1728891656$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoTradeBonusReviewOrderBottomSheetComposable4.LoadedContent(loadedGenerate, function0, null, (Function0) objRememberedValue2, composer, StringResource.$stable | 3120, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
