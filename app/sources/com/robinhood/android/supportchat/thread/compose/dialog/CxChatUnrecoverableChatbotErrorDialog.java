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

/* compiled from: CxChatUnrecoverableChatbotErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"CxChatUnrecoverableChatbotErrorDialog", "", "onClickEscalate", "Lkotlin/Function0;", "onDismissRequest", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.dialog.CxChatUnrecoverableChatbotErrorDialogKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatUnrecoverableChatbotErrorDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatUnrecoverableChatbotErrorDialog$lambda$0(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CxChatUnrecoverableChatbotErrorDialog(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CxChatUnrecoverableChatbotErrorDialog(final Function0<Unit> onClickEscalate, final Function0<Unit> onDismissRequest, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(onClickEscalate, "onClickEscalate");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1149846030);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(onClickEscalate) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1149846030, i3, -1, "com.robinhood.android.supportchat.thread.compose.dialog.CxChatUnrecoverableChatbotErrorDialog (CxChatUnrecoverableChatbotErrorDialog.kt:15)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C29104R.string.chatbot_unrecoverable_error_dialog_title, composerStartRestartGroup, 0);
            int i4 = i3;
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C29104R.string.chatbot_unrecoverable_error_dialog_body, composerStartRestartGroup, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C29104R.string.chatbot_unrecoverable_error_dialog_primary_text, composerStartRestartGroup, 0), onClickEscalate);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C29104R.string.chatbot_unrecoverable_error_dialog_secondary_text, composerStartRestartGroup, 0), onDismissRequest);
            int i5 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i6 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, onDismissRequest, composerStartRestartGroup, i5 | (i6 << 6) | (i6 << 12) | ((i4 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatUnrecoverableChatbotErrorDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatUnrecoverableChatbotErrorDialog.CxChatUnrecoverableChatbotErrorDialog$lambda$0(onClickEscalate, onDismissRequest, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
