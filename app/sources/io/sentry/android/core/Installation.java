package io.sentry.android.core;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes21.dex */
final class Installation {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    static String deviceId;

    /* renamed from: id */
    public static synchronized String m3347id(Context context) throws RuntimeException {
        try {
            if (deviceId == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String strWriteInstallationFile = writeInstallationFile(file);
                        deviceId = strWriteInstallationFile;
                        return strWriteInstallationFile;
                    }
                    deviceId = readInstallationFile(file);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return deviceId;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static String readInstallationFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, Constants.REVENUE_AMOUNT_KEY);
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, UTF_8);
            randomAccessFile.close();
            return str;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String writeInstallationFile(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String string2 = UUID.randomUUID().toString();
            fileOutputStream.write(string2.getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
            return string2;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
