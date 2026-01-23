package com.robinhood.android.matcha.p177ui.block;

import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaBlockConfirmationDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"MatchaBlockConfirmationDialog", "", "isBlocked", "", "userFullName", "", "onActionConfirmed", "Lkotlin/Function0;", "onActionCancelled", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.block.MatchaBlockConfirmationDialogKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaBlockConfirmationDialog {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchaBlockConfirmationDialog$lambda$0(boolean z, String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) throws Resources.NotFoundException {
        MatchaBlockConfirmationDialog(z, str, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MatchaBlockConfirmationDialog(final boolean z, final String userFullName, final Function0<Unit> onActionConfirmed, final Function0<Unit> onActionCancelled, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(userFullName, "userFullName");
        Intrinsics.checkNotNullParameter(onActionConfirmed, "onActionConfirmed");
        Intrinsics.checkNotNullParameter(onActionCancelled, "onActionCancelled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1736041404);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(userFullName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActionConfirmed) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActionCancelled) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1736041404, i2, -1, "com.robinhood.android.matcha.ui.block.MatchaBlockConfirmationDialog (MatchaBlockConfirmationDialog.kt:16)");
            }
            if (z) {
                i3 = C21284R.string.matcha_profile_unblock_user_action;
            } else {
                i3 = C21284R.string.matcha_profile_block_user_action;
            }
            String strStringResource = StringResources_androidKt.stringResource(i3, new Object[]{userFullName}, composerStartRestartGroup, 0);
            int i6 = i2;
            if (z) {
                i4 = C21284R.string.matcha_profile_unblock_detail;
            } else {
                i4 = C21284R.string.matcha_profile_block_detail;
            }
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0));
            if (z) {
                i5 = C21284R.string.matcha_profile_unblock_action;
            } else {
                i5 = C21284R.string.matcha_profile_block_action;
            }
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0), onActionConfirmed);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), onActionCancelled);
            int i7 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i8 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, onActionCancelled, composerStartRestartGroup, i7 | (i8 << 6) | (i8 << 12) | ((i6 << 15) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.block.MatchaBlockConfirmationDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaBlockConfirmationDialog.MatchaBlockConfirmationDialog$lambda$0(z, userFullName, onActionConfirmed, onActionCancelled, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
