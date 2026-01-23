package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedViewState2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierUpgradedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt$lambda$1820059056$1 */
/* loaded from: classes12.dex */
final class C40388xfdd552be implements Function2<Composer, Integer, Unit> {
    public static final C40388xfdd552be INSTANCE = new C40388xfdd552be();

    C40388xfdd552be() {
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
            ComposerKt.traceEventStart(1820059056, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt.lambda$1820059056.<anonymous> (CryptoFeeTierUpgradedComposable.kt:453)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoFeeTierUpgradedViewState cryptoFeeTierUpgradedViewState = new CryptoFeeTierUpgradedViewState(new CryptoFeeTierUpgradedViewState2.Show(new CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay(companion.invoke("current fee title"), "0.85%"), new CryptoFeeTierUpgradedViewState2.Show.FeeRateDisplay(companion.invoke("next fee title"), "0.45%")), companion.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_title, new Object[0]), companion.invoke(C40095R.string.f6282x938d957, "$49,591.89", "30"), companion.invoke(C40095R.string.crypto_order_confirmation_fee_tier_upgraded_title, new Object[0]), CryptoFeeTierUpgradedViewState.PrimaryButton.DONE, false, false, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt$lambda$1820059056$1$$ExternalSyntheticLambda0
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
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt$lambda$1820059056$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierUpgraded.ComposableSingletons$CryptoFeeTierUpgradedComposableKt$lambda$1820059056$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgraded(cryptoFeeTierUpgradedViewState, function0, function02, (Function0) objRememberedValue3, null, true, composer, 200112, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
