package com.robinhood.android.supportchat.thread.compose.dialog;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.supportchat.C29104R;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatCharacterLimitDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"CxChatCharacterLimitDialog", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.dialog.CxChatCharacterLimitDialogKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatCharacterLimitDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatCharacterLimitDialog$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CxChatCharacterLimitDialog(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CxChatCharacterLimitDialog(final Function0<Unit> onDismissRequest, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1281055998);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1281055998, i3, -1, "com.robinhood.android.supportchat.thread.compose.dialog.CxChatCharacterLimitDialog (CxChatCharacterLimitDialog.kt:14)");
            }
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C29104R.string.support_chat_char_limit_dialog_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C29104R.string.support_chat_char_limit_dialog_body, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C29104R.string.support_chat_char_limit_dialog_primary_text, composerStartRestartGroup, 0), onDismissRequest), null, null, null, false, null, onDismissRequest, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i3 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatCharacterLimitDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatCharacterLimitDialog.CxChatCharacterLimitDialog$lambda$0(onDismissRequest, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
