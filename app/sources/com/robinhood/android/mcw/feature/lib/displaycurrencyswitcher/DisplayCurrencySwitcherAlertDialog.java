package com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherEvent;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisplayCurrencySwitcherAlertDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"DisplayCurrencySwitcherAlertDialog", "", "event", "Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/mcw/feature/lib/displaycurrencyswitcher/DisplayCurrencySwitcherEvent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-display-currency-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherAlertDialogKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class DisplayCurrencySwitcherAlertDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplayCurrencySwitcherAlertDialog$lambda$0(DisplayCurrencySwitcherEvent displayCurrencySwitcherEvent, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisplayCurrencySwitcherAlertDialog(displayCurrencySwitcherEvent, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisplayCurrencySwitcherAlertDialog(final DisplayCurrencySwitcherEvent event, final Function0<Unit> onConfirm, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        String strStringResource;
        String strStringResource2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(492529585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(event) : composerStartRestartGroup.changedInstance(event) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirm) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(492529585, i3, -1, "com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherAlertDialog (DisplayCurrencySwitcherAlertDialog.kt:18)");
                }
                z = event instanceof DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog;
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1340943263);
                    strStringResource = StringResources_androidKt.stringResource(C21738R.string.stale_fx_rates_alert_dialog_title, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1341030466);
                    strStringResource = StringResources_androidKt.stringResource(C21738R.string.no_fx_rates_alert_dialog_title, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1341199168);
                    DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog showStaleFxRatesDialog = (DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog) event;
                    strStringResource2 = StringResources_androidKt.stringResource(C21738R.string.stale_fx_rates_alert_dialog_body, new Object[]{showStaleFxRatesDialog.getFormattedFxRate(), InstantFormatter.LONG_NO_YEAR_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) showStaleFxRatesDialog.getLastUpdated())}, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1341470139);
                    strStringResource2 = StringResources_androidKt.stringResource(C21738R.string.no_fx_rates_alert_dialog_body, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoAlertDialog.BentoAlertDialog(strStringResource, new BentoAlertDialog2.Body.Text(strStringResource2), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composerStartRestartGroup, 0), onConfirm), modifier4, null, null, false, null, onDismiss, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | (i3 & 7168) | ((i3 << 18) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherAlertDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DisplayCurrencySwitcherAlertDialog.DisplayCurrencySwitcherAlertDialog$lambda$0(event, onConfirm, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z = event instanceof DisplayCurrencySwitcherEvent.ShowStaleFxRatesDialog;
            if (!z) {
            }
            if (!z) {
            }
            BentoAlertDialog.BentoAlertDialog(strStringResource, new BentoAlertDialog2.Body.Text(strStringResource2), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composerStartRestartGroup, 0), onConfirm), modifier4, null, null, false, null, onDismiss, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | (i3 & 7168) | ((i3 << 18) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
