package com.robinhood.shared.crypto.transfer.send.address.host;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferSendAddressHostComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$2$3, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendAddressHostComposable3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ CryptoTransferSendAddressHostDuxo $duxo;
    final /* synthetic */ ProtectionSheetState $sheetState;
    final /* synthetic */ SnapshotState4<CryptoTransferSendAddressHostViewState> $viewState$delegate;

    CryptoTransferSendAddressHostComposable3(CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, ProtectionSheetState protectionSheetState, SnapshotState4<CryptoTransferSendAddressHostViewState> snapshotState4) {
        this.$duxo = cryptoTransferSendAddressHostDuxo;
        this.$sheetState = protectionSheetState;
        this.$viewState$delegate = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1874706582, i, -1, "com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposable.<anonymous>.<anonymous> (CryptoTransferSendAddressHostComposable.kt:112)");
        }
        boolean zIsRhc = CryptoTransferSendAddressHostComposable.CryptoTransferSendAddressHostComposable$lambda$0(this.$viewState$delegate).isRhc();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$sheetState);
        final CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo = this.$duxo;
        final ProtectionSheetState protectionSheetState = this.$sheetState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.host.CryptoTransferSendAddressHostComposableKt$CryptoTransferSendAddressHostComposable$2$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransferSendAddressHostComposable3.invoke$lambda$1$lambda$0(cryptoTransferSendAddressHostDuxo, protectionSheetState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ProtectionSheetContent.ProtectionSheetContent(RhModalBottomSheet, zIsRhc, (Function0) objRememberedValue, null, composer, RhModalBottomSheet5.$stable | (i & 14), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoTransferSendAddressHostDuxo cryptoTransferSendAddressHostDuxo, ProtectionSheetState protectionSheetState) {
        cryptoTransferSendAddressHostDuxo.acknowledgeProtectionSheet(protectionSheetState.getAddress());
        return Unit.INSTANCE;
    }
}
