package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.utils.LoggingUtils5;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlattenConfirmationDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"FlattenConfirmationDialog", "", "onDismiss", "Lkotlin/Function0;", "onFlattenConfirmationClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.FlattenConfirmationDialogKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FlattenConfirmationDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlattenConfirmationDialog$lambda$0(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        FlattenConfirmationDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FlattenConfirmationDialog(Function0<Unit> function0, Function0<Unit> onFlattenConfirmationClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function0<Unit> function02;
        final Function0<Unit> onDismiss = function0;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onFlattenConfirmationClick, "onFlattenConfirmationClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1281176773);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFlattenConfirmationClick) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1281176773, i3, -1, "com.robinhood.android.futures.detail.ui.FlattenConfirmationDialog (FlattenConfirmationDialog.kt:17)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_flatten_bottomsheet_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C17042R.string.futures_flatten_bottomsheet_description, composerStartRestartGroup, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_flatten_bottomsheet_primary_button_label, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, onFlattenConfirmationClick, ModifiersKt.autoLogEvents$default(companion, LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_FDP_FLATTEN_CONFIRM, composerStartRestartGroup, 6), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C17042R.string.futures_flatten_bottomsheet_secondary_button_label, composerStartRestartGroup, 0), onDismiss, ModifiersKt.autoLogEvents$default(companion, LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_FDP_FLATTEN_CANCEL, composerStartRestartGroup, 6), true, false, false, true, false, null, 108, null), null, null, false, 56, null);
            int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            composer2 = composerStartRestartGroup;
            function02 = onFlattenConfirmationClick;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i4 | (i5 << 6) | (i5 << 12) | ((i3 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            onDismiss = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            function02 = onFlattenConfirmationClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FlattenConfirmationDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlattenConfirmationDialog.FlattenConfirmationDialog$lambda$0(onDismiss, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
