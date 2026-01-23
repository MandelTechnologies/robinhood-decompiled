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
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatError;
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatErrorAlert;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatUpdateErrorDialog.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"CxChatUpdateErrorDialog", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/v2/UpdateSupportChatError;", "onClickPrimaryCta", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "deeplink", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/ui/v2/UpdateSupportChatError;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.dialog.CxChatUpdateErrorDialogKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatUpdateErrorDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatUpdateErrorDialog$lambda$2(UpdateSupportChatError updateSupportChatError, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CxChatUpdateErrorDialog(updateSupportChatError, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CxChatUpdateErrorDialog(final UpdateSupportChatError data, final Function1<? super String, Unit> onClickPrimaryCta, final Function0<Unit> onDismissRequest, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Tuples2 tuples2M3642to;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694503483);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694503483, i3, -1, "com.robinhood.android.supportchat.thread.compose.dialog.CxChatUpdateErrorDialog (CxChatUpdateErrorDialog.kt:17)");
            }
            UpdateSupportChatErrorAlert alertInfo = data.getAlertInfo();
            final UpdateSupportChatErrorAlert.Cta primaryCta = alertInfo.getPrimaryCta();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C29104R.string.chatbot_unrecoverable_error_dialog_secondary_text, composerStartRestartGroup, 0), onDismissRequest);
            composerStartRestartGroup.startReplaceGroup(-625224904);
            if (primaryCta != null) {
                String title = primaryCta.getTitle();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(primaryCta) | ((i3 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatUpdateErrorDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatUpdateErrorDialog.CxChatUpdateErrorDialog$lambda$1$lambda$0(onClickPrimaryCta, primaryCta);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                tuples2M3642to = Tuples4.m3642to(new BentoAlertButton(title, (Function0) objRememberedValue), bentoAlertButton);
            } else {
                tuples2M3642to = Tuples4.m3642to(bentoAlertButton, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton2 = (BentoAlertButton) tuples2M3642to.component1();
            BentoAlertButton bentoAlertButton3 = (BentoAlertButton) tuples2M3642to.component2();
            String title2 = alertInfo.getTitle();
            int i4 = i3;
            String message = alertInfo.getMessage();
            if (message == null) {
                message = "";
            }
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(message);
            int i5 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i6 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(title2, text, bentoAlertButton2, null, bentoAlertButton3, null, false, null, onDismissRequest, composerStartRestartGroup, i5 | (i6 << 6) | (i6 << 12) | ((i4 << 18) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatUpdateErrorDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatUpdateErrorDialog.CxChatUpdateErrorDialog$lambda$2(data, onClickPrimaryCta, onDismissRequest, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatUpdateErrorDialog$lambda$1$lambda$0(Function1 function1, UpdateSupportChatErrorAlert.Cta cta) {
        function1.invoke(cta.getDeeplink());
        return Unit.INSTANCE;
    }
}
