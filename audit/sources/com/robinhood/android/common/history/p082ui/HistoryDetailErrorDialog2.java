package com.robinhood.android.common.history.p082ui;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.equities.history.extensions.TradeSkippedReasons;
import com.robinhood.recurring.models.TradeSkippedReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryDetailErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0002\u0010\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m3636d2 = {"dialogData", "Lcom/robinhood/android/common/history/ui/HistoryDetailErrorDialogData;", "Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;", "getDialogData", "(Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;)Lcom/robinhood/android/common/history/ui/HistoryDetailErrorDialogData;", "HistoryDetailErrorDialog", "", "errorType", "onDismissRequest", "Lkotlin/Function0;", "(Lcom/robinhood/android/navigation/app/keys/data/DetailErrorType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.HistoryDetailErrorDialogKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryDetailErrorDialog2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryDetailErrorDialog$lambda$1(DetailErrorType detailErrorType, Function0 function0, int i, Composer composer, int i2) {
        HistoryDetailErrorDialog(detailErrorType, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final HistoryDetailErrorDialogData getDialogData(DetailErrorType detailErrorType) {
        Intrinsics.checkNotNullParameter(detailErrorType, "<this>");
        if (detailErrorType instanceof DetailErrorType.AchTransferDetailError) {
            throw new IllegalStateException("History detail error dialog can't handle ACH");
        }
        if (!(detailErrorType instanceof DetailErrorType.RecurringPausedError)) {
            throw new NoWhenBranchMatchedException();
        }
        DetailErrorType.RecurringPausedError recurringPausedError = (DetailErrorType.RecurringPausedError) detailErrorType;
        if (recurringPausedError.getTradeSkippedReason() != null) {
            int i = C11183R.string.equity_detail_error_canceled_dialog_title;
            TradeSkippedReason tradeSkippedReason = recurringPausedError.getTradeSkippedReason();
            return new HistoryDetailErrorDialogData(i, tradeSkippedReason != null ? TradeSkippedReasons.getOrderStringRes(tradeSkippedReason) : null);
        }
        return new HistoryDetailErrorDialogData(C11183R.string.equity_detail_error_pending_dialog_title, Integer.valueOf(C11183R.string.investment_schedule_event_order_pending));
    }

    public static final void HistoryDetailErrorDialog(final DetailErrorType errorType, final Function0<Unit> onDismissRequest, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-463316674);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(errorType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463316674, i2, -1, "com.robinhood.android.common.history.ui.HistoryDetailErrorDialog (HistoryDetailErrorDialog.kt:40)");
            }
            final HistoryDetailErrorDialogData dialogData = getDialogData(errorType);
            Integer message = dialogData.getMessage();
            composerStartRestartGroup.startReplaceGroup(1429283864);
            final String strStringResource = message == null ? null : StringResources_androidKt.stringResource(message.intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (strStringResource == null) {
                strStringResource = "";
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-842891245, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.history.ui.HistoryDetailErrorDialogKt.HistoryDetailErrorDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-842891245, i3, -1, "com.robinhood.android.common.history.ui.HistoryDetailErrorDialog.<anonymous> (HistoryDetailErrorDialog.kt:44)");
                    }
                    BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(dialogData.getTitle(), composer2, 0), new BentoAlertDialog2.Body.Text(strStringResource), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0), onDismissRequest), null, null, null, false, null, onDismissRequest, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryDetailErrorDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HistoryDetailErrorDialog2.HistoryDetailErrorDialog$lambda$1(errorType, onDismissRequest, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
