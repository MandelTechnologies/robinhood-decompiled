package com.salesforce.android.smi.common.internal.util;

import android.content.Context;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: FileUtil.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006*\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/FileUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "getMessagingFilesPath", "(Landroid/content/Context;)Ljava/lang/String;", "path", "Ljava/io/File;", "createDirectory", "(Ljava/lang/String;)Ljava/io/File;", "getMimeType", "(Ljava/io/File;)Ljava/lang/String;", "", "isImage", "(Ljava/lang/String;)Z", "isPdf", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();
    private static final String TAG;
    private static final Logger logger;

    private FileUtil() {
    }

    static {
        String name = FileUtil.class.getName();
        TAG = name;
        logger = Logger.getLogger(name);
    }

    public final String getMessagingFilesPath(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getApplicationContext().getFilesDir() + "/smi/";
    }

    public final File createDirectory(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (!file.exists()) {
            logger.log(Level.INFO, "Creating attachment directory " + file.getAbsolutePath());
            file.mkdir();
        }
        return file;
    }

    public final String getMimeType(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(new Regex("\\s").replace(name, "_"));
        Intrinsics.checkNotNullExpressionValue(fileExtensionFromUrl, "getFileExtensionFromUrl(...)");
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    public final boolean isImage(String str) {
        if (str != null) {
            return StringsKt.contains$default((CharSequence) str, (CharSequence) "image/", false, 2, (Object) null);
        }
        return false;
    }

    public final boolean isPdf(String str) {
        if (str != null) {
            return StringsKt.contains$default((CharSequence) str, (CharSequence) "pdf", false, 2, (Object) null);
        }
        return false;
    }
}
