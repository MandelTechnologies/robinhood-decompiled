package com.robinhood.shared.crypto.transfer.send.address.saved;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferAddressRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$CryptoTransferAddressRowComposable$1$6, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferAddressRowComposable6 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ UiSavedAddress $address;
    final /* synthetic */ String $currencyCode;
    final /* synthetic */ SnapshotState<Boolean> $isSavingAddressBottomSheet$delegate;
    final /* synthetic */ SnapshotState<Boolean> $showSavedAddressBottomSheet$delegate;

    CryptoTransferAddressRowComposable6(String str, UiSavedAddress uiSavedAddress, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$currencyCode = str;
        this.$address = uiSavedAddress;
        this.$showSavedAddressBottomSheet$delegate = snapshotState;
        this.$isSavingAddressBottomSheet$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-677842124, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposable.<anonymous>.<anonymous> (CryptoTransferAddressRowComposable.kt:130)");
        }
        String str = this.$currencyCode;
        UiSavedAddress uiSavedAddress = this.$address;
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState = this.$showSavedAddressBottomSheet$delegate;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$CryptoTransferAddressRowComposable$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransferAddressRowComposable6.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState2 = this.$isSavingAddressBottomSheet$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$CryptoTransferAddressRowComposable$1$6$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferAddressRowComposable6.invoke$lambda$3$lambda$2(snapshotState2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        SaveAddressSheetContent.SaveAddressSheetContent(str, uiSavedAddress, function0, (Function1) objRememberedValue2, null, null, composer, 3456, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
        CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$8(snapshotState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }
}
