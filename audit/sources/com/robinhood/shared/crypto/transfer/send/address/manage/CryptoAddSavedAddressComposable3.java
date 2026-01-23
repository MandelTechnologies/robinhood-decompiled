package com.robinhood.shared.crypto.transfer.send.address.manage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAddSavedAddressComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddSavedAddressComposableKt$lambda$-400784157$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoAddSavedAddressComposable3 implements Function2<Composer, Integer, Unit> {
    public static final CryptoAddSavedAddressComposable3 INSTANCE = new CryptoAddSavedAddressComposable3();

    CryptoAddSavedAddressComposable3() {
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
            ComposerKt.traceEventStart(-400784157, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddSavedAddressComposableKt.lambda$-400784157.<anonymous> (CryptoAddSavedAddressComposable.kt:319)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState = new CryptoAddSavedAddressViewState(CryptoAddSavedAddressViewState.ContentState.Loading.INSTANCE);
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddSavedAddressComposableKt$lambda$-400784157$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddSavedAddressComposableKt$lambda$-400784157$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoAddSavedAddressComposable5.ScaffoldComposable(cryptoAddSavedAddressViewState, savedStateHandle, function0, (Function0) objRememberedValue2, modifierFillMaxSize$default, composer, 28032, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
