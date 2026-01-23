package com.robinhood.android.supportchat.extensions;

import android.graphics.Bitmap;
import com.robinhood.store.supportchat.ChatImageUtils;
import com.robinhood.utils.logging.CrashReporter;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bitmaps.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"canSend", "", "Landroid/graphics/Bitmap;", "Ljava/io/File;", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.extensions.BitmapsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Bitmaps2 {
    public static final boolean canSend(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        boolean z = ((long) bitmap.getByteCount()) > ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES;
        if (z) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Image upload of " + bitmap.getByteCount() + " B exceeds maximum size of " + ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES + "B"), false, null, 4, null);
        }
        return !z;
    }

    public static final boolean canSend(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        boolean z = file.length() <= ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES;
        if (!z) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Image upload of " + file.length() + " B exceeds maximum size of " + ChatImageUtils.IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES + "B"), false, null, 4, null);
        }
        return z;
    }
}
