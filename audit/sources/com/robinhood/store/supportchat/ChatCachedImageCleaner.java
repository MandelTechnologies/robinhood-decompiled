package com.robinhood.store.supportchat;

import android.content.Context;
import android.os.Environment;
import com.robinhood.utils.logging.CrashReporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlin.text.StringsKt;

/* compiled from: ChatCachedImageCleaner.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "", "<init>", "()V", "cleanChatImages", "", "context", "Landroid/content/Context;", "deleteCroppedImages", "baseDir", "Ljava/io/File;", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ChatCachedImageCleaner {
    public final void cleanChatImages(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            deleteCroppedImages(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            deleteCroppedImages(context.getCacheDir());
            FilesKt.deleteRecursively(new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), ChatImageUtils.SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME));
            FilesKt.deleteRecursively(new File(context.getCacheDir(), ChatImageUtils.TEMP_UNSENT_IMAGE_FILE_DIR));
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    private final void deleteCroppedImages(File baseDir) {
        File[] fileArrListFiles = baseDir != null ? baseDir.listFiles() : null;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "cropped", false, 2, (Object) null)) {
                arrayList.add(file);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }
}
