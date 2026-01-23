package com.salesforce.android.smi.remote.internal.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FileUtils.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/util/FileUtils;", "", "<init>", "()V", "Ljava/io/File;", "f", "", "readFileToByteArray", "(Ljava/io/File;)[B", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    private static final String TAG;
    private static final Logger logger;

    private FileUtils() {
    }

    static {
        String name = FileUtils.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
        logger = Logger.getLogger(name);
    }

    public final byte[] readFileToByteArray(File f) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        byte[] bArr = f != null ? new byte[(int) f.length()] : null;
        try {
            try {
                fileInputStream = new FileInputStream(f);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            logger.log(Level.WARNING, "File could not be read: " + e.getMessage() + ".");
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }
}
