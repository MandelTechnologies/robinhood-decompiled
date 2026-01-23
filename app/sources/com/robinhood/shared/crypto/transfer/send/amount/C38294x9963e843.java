package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$1$1$2 */
/* loaded from: classes6.dex */
final class C38294x9963e843 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ CryptoTransferSendAmountDuxo $duxo;
    final /* synthetic */ SnapshotState<String> $menuItemText$delegate;

    C38294x9963e843(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, SnapshotState<String> snapshotState) {
        this.$duxo = cryptoTransferSendAmountDuxo;
        this.$menuItemText$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1927028212, i, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSendAmountComposable.kt:104)");
        }
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        String strCryptoTransferSendAmountComposable$lambda$1 = CryptoTransferSendAmountComposableKt.CryptoTransferSendAmountComposable$lambda$1(this.$menuItemText$delegate);
        BentoTextButton3.Icon.Size12 size12 = new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12, BentoTextButton3.Icon.Position.Trailing);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$duxo);
        final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo = this.$duxo;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountComposableKt$CryptoTransferSendAmountComposable$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C38294x9963e843.invoke$lambda$1$lambda$0(cryptoTransferSendAmountDuxo);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strCryptoTransferSendAmountComposable$lambda$1, modifierM5144paddingVpY3zN4$default, size12, null, false, null, composer, BentoTextButton3.Icon.Size12.$stable << 9, 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo) {
        cryptoTransferSendAmountDuxo.showCryptoInputModeSelector();
        return Unit.INSTANCE;
    }
}
