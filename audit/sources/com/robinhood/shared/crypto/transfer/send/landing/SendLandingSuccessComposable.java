package com.robinhood.shared.crypto.transfer.send.landing;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingViewState;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferQrScannerComposable3;
import com.robinhood.shared.crypto.transfer.unified.QrScannerState;
import com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContent7;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SendLandingSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, m3636d2 = {"SendLandingSuccessComposable", "", "state", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Success;", "onAddressScanned", "Lkotlin/Function1;", "", "onInitialWarningSheetShown", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingViewState$Success;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "initialWarningSheet", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig$TransferWarnings$Stage$Warning;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SendLandingSuccessComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SendLandingSuccessComposable$lambda$7$lambda$4$lambda$3(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SendLandingSuccessComposable$lambda$9(CryptoTransferSendLandingViewState.Success success, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SendLandingSuccessComposable(success, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SendLandingSuccessComposable(final CryptoTransferSendLandingViewState.Success state, final Function1<? super String, Unit> onAddressScanned, final Function0<Unit> onInitialWarningSheetShown, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Modifier modifier3;
        final CryptoTransferConfig.TransferWarnings.Stage.Warning warningSendLandingSuccessComposable$lambda$1;
        Continuation continuation;
        SnapshotState snapshotState;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAddressScanned, "onAddressScanned");
        Intrinsics.checkNotNullParameter(onInitialWarningSheetShown, "onInitialWarningSheetShown");
        Composer composerStartRestartGroup = composer.startRestartGroup(1985703932);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddressScanned) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInitialWarningSheetShown) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1985703932, i3, -1, "com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposable (SendLandingSuccessComposable.kt:23)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                QrScannerState qrScannerState = state.getQrScannerState();
                int i5 = StringResource.$stable | (i3 & 112) | ((i3 >> 3) & 896);
                modifier3 = modifier2;
                CryptoTransferQrScannerComposable3.CryptoTransferQrScannerComposable(qrScannerState, onAddressScanned, modifier3, composerStartRestartGroup, i5, 0);
                warningSendLandingSuccessComposable$lambda$1 = SendLandingSuccessComposable$lambda$1(snapshotState2);
                composerStartRestartGroup.startReplaceGroup(1296017855);
                if (warningSendLandingSuccessComposable$lambda$1 != null) {
                    composer2 = composerStartRestartGroup;
                    continuation = null;
                    snapshotState = snapshotState2;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(SendLandingSuccessComposable.SendLandingSuccessComposable$lambda$7$lambda$4$lambda$3((SheetValue) obj));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue3, composerStartRestartGroup, 54, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SendLandingSuccessComposable.SendLandingSuccessComposable$lambda$7$lambda$6$lambda$5(snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1595198260, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposableKt$SendLandingSuccessComposable$1$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer3, Integer num) {
                            invoke(rhModalBottomSheet5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer3.changed(RhModalBottomSheet) : composer3.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1595198260, i6, -1, "com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposable.<anonymous>.<anonymous> (SendLandingSuccessComposable.kt:42)");
                            }
                            WarningSheetContent7.WarningSheetContent(RhModalBottomSheet, warningSendLandingSuccessComposable$lambda$1, null, null, composer3, RhModalBottomSheet5.$stable | 384 | (i6 & 14), 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    continuation = null;
                    snapshotState = snapshotState2;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, sheetStateRememberModalBottomSheetState, null, 0L, composableLambdaRememberComposableLambda, composerStartRestartGroup, 1572870, 54);
                    composer2 = composerStartRestartGroup;
                    onInitialWarningSheetShown.invoke();
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet = state.getInitialWarningSheet();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(state);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SendLandingSuccessComposable3(state, snapshotState, continuation);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(initialWarningSheet, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.landing.SendLandingSuccessComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SendLandingSuccessComposable.SendLandingSuccessComposable$lambda$9(state, onAddressScanned, onInitialWarningSheetShown, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            QrScannerState qrScannerState2 = state.getQrScannerState();
            int i52 = StringResource.$stable | (i3 & 112) | ((i3 >> 3) & 896);
            modifier3 = modifier2;
            CryptoTransferQrScannerComposable3.CryptoTransferQrScannerComposable(qrScannerState2, onAddressScanned, modifier3, composerStartRestartGroup, i52, 0);
            warningSendLandingSuccessComposable$lambda$1 = SendLandingSuccessComposable$lambda$1(snapshotState22);
            composerStartRestartGroup.startReplaceGroup(1296017855);
            if (warningSendLandingSuccessComposable$lambda$1 != null) {
            }
            composer2.endReplaceGroup();
            CryptoTransferConfig.TransferWarnings.Stage.Warning initialWarningSheet2 = state.getInitialWarningSheet();
            composer2.startReplaceGroup(-1633490746);
            zChangedInstance = composer2.changedInstance(state);
            objRememberedValue2 = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new SendLandingSuccessComposable3(state, snapshotState, continuation);
                composer2.updateRememberedValue(objRememberedValue2);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(initialWarningSheet2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SendLandingSuccessComposable$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    private static final CryptoTransferConfig.TransferWarnings.Stage.Warning SendLandingSuccessComposable$lambda$1(SnapshotState<CryptoTransferConfig.TransferWarnings.Stage.Warning> snapshotState) {
        return snapshotState.getValue();
    }
}
