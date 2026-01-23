package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WarningSheetContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$WarningSheetContentKt$lambda$-1890570045$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WarningSheetContent3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    public static final WarningSheetContent3 INSTANCE = new WarningSheetContent3();

    WarningSheetContent3() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1890570045, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$WarningSheetContentKt.lambda$-1890570045.<anonymous> (WarningSheetContent.kt:271)");
        }
        CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState = new CryptoTransferSendAmountViewState.WithdrawalWarningButtonState("Continue without change", ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.CONTINUE, null, 4, null);
        CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2 = new CryptoTransferSendAmountViewState.WithdrawalWarningButtonState("Edit amount", ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.DISMISS, null, 4, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$WarningSheetContentKt$lambda$-1890570045$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        WarningSheetContent6.WarningSheetContent(RhModalBottomSheet, "You could lose $xx.xx of your account transfer bonus", "It’s still within the holding period of your brokerage account transfer bonus, so you must keep your balance above the amount transferred in. Lower the transfer amount to $XX.XX to avoid losing the bonus. [Learn more about the bonus](https://some_link)\nand\njust\nin\ncase\nsomeone\nputs\ntoo\nmuch,\nyou\ncan\nscroll!", withdrawalWarningButtonState, withdrawalWarningButtonState2, (Function0) objRememberedValue, null, 0.5f, composer, 12779568 | RhModalBottomSheet5.$stable | (i2 & 14), 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
