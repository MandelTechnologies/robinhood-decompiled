package com.robinhood.android.referral.lib.invite;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.referral.lib.C26709R;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Activities.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, m3636d2 = {"inviteViaText", "", "Landroid/app/Activity;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/referral/lib/invite/InviteUserData;", "inviteViaEmail", "subjectLine", "", "inviteViaWhatsApp", "message", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.invite.ActivitiesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Activities3 {
    public static final void inviteViaText(Activity activity, InviteUserData data) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("sms:" + data.getContact()));
        intent.putExtra("sms_body", data.getMessageBody());
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ContextsUiExtensions.showShortToast(activity, C26709R.string.invite_contacts_error_no_sms);
        }
    }

    public static /* synthetic */ void inviteViaEmail$default(Activity activity, InviteUserData inviteUserData, String str, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            str = null;
        }
        inviteViaEmail(activity, inviteUserData, str);
    }

    public static final void inviteViaEmail(Activity activity, InviteUserData data, String str) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{data.getContact()});
        intent.putExtra("android.intent.extra.TEXT", data.getMessageBody());
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            ContextsUiExtensions.showShortToast(activity, C26709R.string.invite_contacts_error_no_email);
        }
    }

    public static final void inviteViaWhatsApp(Activity activity, String message) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", message);
        intent.setPackage("com.whatsapp");
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", message);
            activity.startActivity(Intent.createChooser(intent2, activity.getString(C11048R.string.general_action_share)));
        }
    }
}
