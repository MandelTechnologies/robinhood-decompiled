package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferAddressRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$CryptoTransferAddressRowComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferAddressRowComposable5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UiSavedAddress $address;
    final /* synthetic */ Function1<String, Unit> $onAddressRowClick;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoTransferAddressRowComposable5(UiSavedAddress uiSavedAddress, Function1<? super String, Unit> function1) {
        this.$address = uiSavedAddress;
        this.$onAddressRowClick = function1;
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
            ComposerKt.traceEventStart(-2064405365, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposable.<anonymous>.<anonymous> (CryptoTransferAddressRowComposable.kt:78)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        UiSavedAddress uiSavedAddress = this.$address;
        Function1<String, Unit> function1 = this.$onAddressRowClick;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$CryptoTransferAddressRowComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoTransferAddressRowComposable4.BaseAddressRow(uiSavedAddress, function1, (Function0) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
