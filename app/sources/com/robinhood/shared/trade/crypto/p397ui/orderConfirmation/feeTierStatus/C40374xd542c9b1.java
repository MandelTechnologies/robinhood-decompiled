package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeTierStatusComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt$lambda$-815735632$1 */
/* loaded from: classes12.dex */
final class C40374xd542c9b1 implements Function2<Composer, Integer, Unit> {
    public static final C40374xd542c9b1 INSTANCE = new C40374xd542c9b1();

    C40374xd542c9b1() {
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
            ComposerKt.traceEventStart(-815735632, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt.lambda$-815735632.<anonymous> (CryptoFeeTierStatusComposable.kt:276)");
        }
        CryptoFeeTierStatusViewState cryptoFeeTierStatusViewState = new CryptoFeeTierStatusViewState("0.85%", "0.45%", StringResource.INSTANCE.invoke(C40095R.string.f6282x938d957, "$49,591.89", "30"), Float.valueOf(0.7f), CryptoFeeTierStatusViewState.PrimaryButton.DONE, false, false, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt$lambda$-815735632$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt$lambda$-815735632$1$$ExternalSyntheticLambda1
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
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$CryptoFeeTierStatusComposableKt$lambda$-815735632$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoFeeTierStatusComposableKt.CryptoFeeTierStatus(cryptoFeeTierStatusViewState, function0, function02, (Function0) objRememberedValue3, null, composer, 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
