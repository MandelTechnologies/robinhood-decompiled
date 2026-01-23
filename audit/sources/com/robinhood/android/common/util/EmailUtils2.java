package com.robinhood.android.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.C11048R;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: EmailUtils.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a.\u0010\n\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a@\u0010\f\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a:\u0010\u0011\u001a\u00020\u000f*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002\u001a\f\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0002¨\u0006\u0013"}, m3636d2 = {"sendSupportEmail", "", "Landroid/content/Context;", "subject", "", CarResultComposable2.BODY, "aliasBlocks", "", "topicId", "openMailApp", "sendEmail", "to", "sendSupportEmailIfSupported", "", "getSendSupportEmailChooserIntent", "Landroid/content/Intent;", "emailIntent", "getSendSupportEmailIntent", "getOpenAllMailAppsChooserIntent", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.EmailUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class EmailUtils2 {
    public static /* synthetic */ void sendSupportEmail$default(Context context, String str, String str2, Collection collection, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            collection = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        sendSupportEmail(context, str, str2, collection, str3);
    }

    public static final void sendSupportEmail(Context context, String str, String str2, Collection<String> collection, String str3) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        context.startActivity(getSendSupportEmailChooserIntent(context, getSendSupportEmailIntent(context, str, str2, collection, str3)));
    }

    public static final void openMailApp(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        context.startActivity(getOpenAllMailAppsChooserIntent(context));
    }

    public static /* synthetic */ void sendEmail$default(Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        sendEmail(context, str, str2, str3);
    }

    public static final void sendEmail(Context context, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setFlags(268435456);
        if (str == null) {
            str = "";
        }
        intent.setData(Uri.parse("mailto:" + str));
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (str3 != null) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        context.startActivity(intent);
    }

    public static /* synthetic */ boolean sendSupportEmailIfSupported$default(Context context, String str, String str2, Collection collection, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            collection = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return sendSupportEmailIfSupported(context, str, str2, collection, str3);
    }

    public static final boolean sendSupportEmailIfSupported(Context context, String str, String str2, Collection<String> collection, String str3) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intent sendSupportEmailIntent = getSendSupportEmailIntent(context, str, str2, collection, str3);
        if (sendSupportEmailIntent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(getSendSupportEmailChooserIntent(context, sendSupportEmailIntent));
        return true;
    }

    private static final Intent getSendSupportEmailChooserIntent(Context context, Intent intent) {
        String string2 = context.getString(C11048R.string.general_send_email_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Intent intentCreateChooser = Intent.createChooser(intent, string2);
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    private static final Intent getSendSupportEmailIntent(Context context, String str, String str2, Collection<String> collection, String str3) {
        String string2;
        String string3 = null;
        String strJoinToString$default = collection != null ? CollectionsKt.joinToString$default(collection, "+", null, null, 0, null, null, 62, null) : null;
        if (strJoinToString$default == null && str3 == null) {
            string2 = context.getString(C11048R.string.email_support);
        } else if (str3 != null) {
            string2 = context.getString(C11048R.string.email_support_aliased, str3);
        } else {
            String string4 = context.getString(C11048R.string.email_support_aliased, strJoinToString$default);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String str4 = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) string4, new String[]{"@"}, false, 0, 6, (Object) null));
            if (str4.length() > 64) {
                String str5 = str4.length() + " / 64";
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Aliased email user segment exceeds maximum length (" + str5 + "): " + str4), false, null, 6, null);
                string2 = context.getString(C11048R.string.email_support);
            } else {
                string2 = string4;
            }
        }
        Intrinsics.checkNotNull(string2);
        if (str3 != null) {
            StringBuilder sb = new StringBuilder(str2 == null ? "" : str2);
            sb.append('\n');
            sb.append('\n');
            sb.append("Topic Id: " + str3);
            string3 = sb.toString();
        }
        Intent intentPutExtra = new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.EMAIL", new String[]{string2});
        if (string3 != null) {
            str2 = string3;
        }
        Intent intentPutExtra2 = intentPutExtra.putExtra("android.intent.extra.TEXT", str2);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
        return intentPutExtra2;
    }

    private static final Intent getOpenAllMailAppsChooserIntent(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(getSendSupportEmailIntent(context, "", "", null, null), 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(((ResolveInfo) it.next()).activityInfo.packageName);
            if (launchIntentForPackage != null) {
                arrayList.add(launchIntentForPackage);
            }
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        Intent intentCreateChooser = Intent.createChooser(new Intent(), context.getString(C11048R.string.general_open_mail_app_title));
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        Intrinsics.checkNotNull(intentCreateChooser);
        return intentCreateChooser;
    }
}
