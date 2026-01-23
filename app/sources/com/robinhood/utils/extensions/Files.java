package com.robinhood.utils.extensions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ShareCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Files.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b\u001a&\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b\u001a(\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a0\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¨\u0006\u0012"}, m3636d2 = {"getOpenOrShareIntent", "Landroid/content/Intent;", "Ljava/io/File;", "activity", "Landroid/app/Activity;", "shareTitle", "", "mimeType", "", "toFileProviderUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "authority", "getOpenIntent", "getShareIntent", "", "text", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.FilesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Files {
    public static /* synthetic */ Intent getOpenOrShareIntent$default(File file, Activity activity, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "application/pdf";
        }
        return getOpenOrShareIntent(file, activity, i, str);
    }

    public static final Intent getOpenOrShareIntent(File file, Activity activity, int i, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent openIntent$default = getOpenIntent$default(file, activity, mimeType, null, 4, null);
        return openIntent$default == null ? getShareIntent(file, activity, i, mimeType) : openIntent$default;
    }

    public static /* synthetic */ Uri toFileProviderUri$default(File file, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "fileprovider";
        }
        return toFileProviderUri(file, context, str);
    }

    public static final Uri toFileProviderUri(File file, Context context, String authority) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + "." + authority, file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    public static /* synthetic */ Intent getOpenIntent$default(File file, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "fileprovider";
        }
        return getOpenIntent(file, context, str, str2);
    }

    public static final Intent getOpenIntent(File file, Context context, String mimeType, String authority) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Uri fileProviderUri = toFileProviderUri(file, context, authority);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(fileProviderUri, mimeType);
        intent.setFlags(1);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        return null;
    }

    public static /* synthetic */ Intent getShareIntent$default(File file, Activity activity, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = "application/pdf";
        }
        return getShareIntent(file, activity, i, str);
    }

    public static final Intent getShareIntent(File file, Activity activity, int i, String mimeType) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        String string2 = activity.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return getShareIntent$default(file, activity, string2, mimeType, null, 8, null);
    }

    public static /* synthetic */ Intent getShareIntent$default(File file, Activity activity, CharSequence charSequence, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return getShareIntent(file, activity, charSequence, str, str2);
    }

    public static final Intent getShareIntent(File file, Activity activity, CharSequence shareTitle, String mimeType, String str) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareTitle, "shareTitle");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        ShareCompat.IntentBuilder chooserTitle = new ShareCompat.IntentBuilder(activity).setType(mimeType).setStream(toFileProviderUri$default(file, activity, null, 2, null)).setChooserTitle(shareTitle);
        Intrinsics.checkNotNullExpressionValue(chooserTitle, "setChooserTitle(...)");
        if (str != null) {
            chooserTitle.setText(str);
        }
        if (chooserTitle.getIntent().resolveActivity(activity.getPackageManager()) != null) {
            return chooserTitle.createChooserIntent();
        }
        return null;
    }
}
