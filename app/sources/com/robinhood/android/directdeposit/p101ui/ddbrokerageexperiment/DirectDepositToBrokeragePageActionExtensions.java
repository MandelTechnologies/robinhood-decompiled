package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.robinhood.models.serverdriven.experimental.api.DirectDepositToBrokeragePageAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositToBrokeragePageActionExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"handleDirectDepositAction", "", "Landroid/app/Activity;", "action", "Lcom/robinhood/models/serverdriven/experimental/api/DirectDepositToBrokeragePageAction;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositToBrokeragePageActionExtensionsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositToBrokeragePageActionExtensions {
    public static final boolean handleDirectDepositAction(Activity activity, DirectDepositToBrokeragePageAction action) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof DirectDepositToBrokeragePageAction.CopyToClipboardWithAlert) {
            Object systemService = activity.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            DirectDepositToBrokeragePageAction.CopyToClipboardWithAlert copyToClipboardWithAlert = (DirectDepositToBrokeragePageAction.CopyToClipboardWithAlert) action;
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", copyToClipboardWithAlert.getValue2().getValue()));
            Toast.makeText(activity, copyToClipboardWithAlert.getValue2().getAlert_text(), 0).show();
            return true;
        }
        if (!(action instanceof DirectDepositToBrokeragePageAction.Dismiss)) {
            throw new NoWhenBranchMatchedException();
        }
        activity.finish();
        return true;
    }
}
