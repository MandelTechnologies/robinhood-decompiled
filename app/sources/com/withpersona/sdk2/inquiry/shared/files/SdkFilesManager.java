package com.withpersona.sdk2.inquiry.shared.files;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.FilesKt;

/* compiled from: SdkFilesManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sdkDir", "Ljava/io/File;", "sessionDir", "newSessionFile", "fileName", "", "newRandomSessionFile", "extension", "cleanup", "", "directoriesToDeleteOnError", "", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SdkFilesManager {
    private final File sdkDir;
    private final File sessionDir;

    public SdkFilesManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry");
        this.sdkDir = file;
        this.sessionDir = new File(file, "sess");
    }

    public final File newSessionFile(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.sessionDir.mkdirs();
        return new File(this.sessionDir, fileName);
    }

    public final File newRandomSessionFile(String extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.sessionDir.mkdirs();
        return new File(this.sessionDir, UUID.randomUUID() + "." + extension);
    }

    public final void cleanup() {
        FilesKt.deleteRecursively(this.sessionDir);
    }

    public final List<File> directoriesToDeleteOnError() {
        return CollectionsKt.listOf(this.sessionDir);
    }
}
