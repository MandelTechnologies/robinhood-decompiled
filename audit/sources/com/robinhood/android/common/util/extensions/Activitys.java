package com.robinhood.android.common.util.extensions;

import android.app.Activity;
import android.content.Intent;
import androidx.core.app.ShareCompat;
import com.robinhood.android.common.util.ShareReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Activitys.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, m3636d2 = {"launchShareIntent", "", "Landroid/app/Activity;", "title", "", "message", "type", "createShareIntent", "Landroid/content/Intent;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.ActivitysKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Activitys {
    public static /* synthetic */ void launchShareIntent$default(Activity activity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "text/plain";
        }
        launchShareIntent(activity, str, str2, str3);
    }

    public static final void launchShareIntent(Activity activity, String str, String str2, String type2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        activity.startActivity(createShareIntent(activity, str, str2, type2));
    }

    public static /* synthetic */ Intent createShareIntent$default(Activity activity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "text/plain";
        }
        return createShareIntent(activity, str, str2, str3);
    }

    public static final Intent createShareIntent(Activity activity, String str, String str2, String type2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intent intent = new ShareCompat.IntentBuilder(activity).setSubject(str).setText(str2).setType(type2).getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Intent intentCreateChooser = Intent.createChooser(intent, null, ShareReceiver.INSTANCE.getIntentSender(activity));
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }
}
