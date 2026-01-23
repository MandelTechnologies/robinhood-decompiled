package com.robinhood.android.rhy.referral.util;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareLink.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"shareLink", "", "Landroid/app/Activity;", "inviteMessage", "", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.util.ShareLinkKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ShareLink2 {
    public static final void shareLink(Activity activity, String inviteMessage) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(inviteMessage, "inviteMessage");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", inviteMessage);
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, null));
    }
}
