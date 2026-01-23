package com.withpersona.sdk2.inquiry.governmentid;

import android.graphics.Bitmap;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;

/* compiled from: GovernmentId.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"saveGovernmentId", "Ljava/io/File;", "Landroid/graphics/Bitmap;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GovernmentId3 {
    public static final File saveGovernmentId(Bitmap bitmap, SdkFilesManager sdkFilesManager) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        File fileNewRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileNewRandomSessionFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            Closeable.closeFinally(fileOutputStream, null);
            return fileNewRandomSessionFile;
        } finally {
        }
    }
}
