package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"GenericErrorDialog", "", "errorId", "", "onDismiss", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GenericErrorDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.GenericErrorDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class GenericErrorDialog4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericErrorDialog$lambda$0(int i, Function0 function0, int i2, Composer composer, int i3) {
        GenericErrorDialog(i, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericErrorDialogPreview$lambda$1(int i, Composer composer, int i2) {
        GenericErrorDialogPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GenericErrorDialog(final int i, final Function0<Unit> onDismiss, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1270638416);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270638416, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.GenericErrorDialog (GenericErrorDialog.kt:17)");
            }
            int i4 = i3;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(i, composerStartRestartGroup, i4 & 14)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0), onDismiss), null, null, null, false, null, onDismiss, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i4 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.GenericErrorDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericErrorDialog4.GenericErrorDialog$lambda$0(i, onDismiss, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GenericErrorDialogPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350518525);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1350518525, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.GenericErrorDialogPreview (GenericErrorDialog.kt:31)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, GenericErrorDialog2.INSTANCE.getLambda$1748065604$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.GenericErrorDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericErrorDialog4.GenericErrorDialogPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
