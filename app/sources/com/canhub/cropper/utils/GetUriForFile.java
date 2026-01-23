package com.canhub.cropper.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.IOStreams;

/* compiled from: GetUriForFile.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0000¨\u0006\b"}, m3636d2 = {"getUriForFile", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "authority", "", "cropper_release"}, m3637k = 2, m3638mv = {1, 7, 1}, m3640xi = 48)
/* renamed from: com.canhub.cropper.utils.GetUriForFileKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class GetUriForFile {
    public static final String authority(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageName() + ".cropper.fileprovider";
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef A[Catch: Exception -> 0x0069, TryCatch #6 {Exception -> 0x0069, blocks: (B:6:0x0020, B:12:0x0062, B:43:0x00ef, B:45:0x00f4, B:46:0x00f7, B:38:0x00e4, B:40:0x00e9), top: B:63:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[Catch: Exception -> 0x0069, TryCatch #6 {Exception -> 0x0069, blocks: (B:6:0x0020, B:12:0x0062, B:43:0x00ef, B:45:0x00f4, B:46:0x00f7, B:38:0x00e4, B:40:0x00e9), top: B:63:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri getUriForFile(Context context, File file) throws Throwable {
        File externalCacheDir;
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        String strAuthority = authority(context);
        try {
            Log.i("AIC", "Try get URI for scope storage - content://");
            Uri uriForFile = FileProvider.getUriForFile(context, strAuthority, file);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(context, authority, file)");
            return uriForFile;
        } catch (Exception e) {
            try {
                Log.e("AIC", String.valueOf(e.getMessage()));
                Log.w("AIC", "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices");
                File file2 = new File(new File(context.getCacheDir(), "CROP_LIB_CACHE"), file.getName());
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            IOStreams.copyTo$default(fileInputStream2, fileOutputStream, 0, 2, null);
                            Log.i("AIC", "Completed Android N+ file copy. Attempting to return the cached file");
                            Uri uriForFile2 = FileProvider.getUriForFile(context, strAuthority, file2);
                            Intrinsics.checkNotNullExpressionValue(uriForFile2, "getUriForFile(context, authority, cacheLocation)");
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return uriForFile2;
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream = fileInputStream2;
                            try {
                                Log.e("AIC", String.valueOf(e.getMessage()));
                                Log.i("AIC", "Trying to provide URI manually");
                                String str = "content://" + strAuthority + "/files/my_images/";
                                if (Build.VERSION.SDK_INT >= 26) {
                                    Files.createDirectories(Paths.get(str, new String[0]), new FileAttribute[0]);
                                } else {
                                    File file3 = new File(str);
                                    if (!file3.exists()) {
                                        file3.mkdirs();
                                    }
                                }
                                Uri uri = Uri.parse(str + file.getName());
                                Intrinsics.checkNotNullExpressionValue(uri, "parse(\"$path${file.name}\")");
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return uri;
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } catch (Exception e5) {
                Log.e("AIC", String.valueOf(e5.getMessage()));
                if (Build.VERSION.SDK_INT < 29 && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Log.i("AIC", "Use External storage, do not work for OS 29 and above");
                        Uri uriFromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(File(cacheDir.path, file.absolutePath))");
                        return uriFromFile;
                    } catch (Exception e6) {
                        Log.e("AIC", String.valueOf(e6.getMessage()));
                        Log.i("AIC", "Try get URI using file://");
                        Uri uriFromFile2 = Uri.fromFile(file);
                        Intrinsics.checkNotNullExpressionValue(uriFromFile2, "fromFile(file)");
                        return uriFromFile2;
                    }
                }
                Log.i("AIC", "Try get URI using file://");
                Uri uriFromFile22 = Uri.fromFile(file);
                Intrinsics.checkNotNullExpressionValue(uriFromFile22, "fromFile(file)");
                return uriFromFile22;
            }
        }
    }
}
