package com.robinhood.shared.documents.prism.utils;

import android.net.Uri;
import com.robinhood.utils.logging.CrashReporter;
import java.io.File;
import kotlin.Metadata;

/* compiled from: PrismUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/utils/PrismUtils;", "", "<init>", "()V", "deleteFile", "", "fileUri", "Landroid/net/Uri;", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PrismUtils {
    public static final int $stable = 0;
    public static final PrismUtils INSTANCE = new PrismUtils();

    private PrismUtils() {
    }

    public final void deleteFile(Uri fileUri) {
        String path;
        if (fileUri == null || (path = fileUri.getPath()) == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            }
        }
    }
}
