package com.withpersona.sdk2.inquiry.shared;

import android.webkit.MimeTypeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FileHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/RealFileHelper;", "Lcom/withpersona/sdk2/inquiry/shared/FileHelper;", "<init>", "()V", "getMimeTypeFromPath", "", "path", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.shared.RealFileHelper, reason: use source file name */
/* loaded from: classes18.dex */
public final class FileHelper2 implements FileHelper {
    @Override // com.withpersona.sdk2.inquiry.shared.FileHelper
    public String getMimeTypeFromPath(String path) {
        String mimeTypeFromExtension;
        Intrinsics.checkNotNullParameter(path, "path");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
        return (fileExtensionFromUrl == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null) ? "image/*" : mimeTypeFromExtension;
    }
}
