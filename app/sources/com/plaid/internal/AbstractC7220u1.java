package com.plaid.internal;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.plaid.internal.u1 */
/* loaded from: classes16.dex */
public abstract class AbstractC7220u1 {
    /* renamed from: a */
    public static void m1621a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static LinkedHashMap m1623b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String encodedQuery = Uri.parse(str).getEncodedQuery();
        if (encodedQuery != null) {
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int i2 = iIndexOf != -1 ? iIndexOf : length;
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > i2 || iIndexOf2 == -1) {
                    iIndexOf2 = i2;
                }
                String strDecode = Uri.decode(encodedQuery.substring(i, iIndexOf2));
                if (iIndexOf2 == i2) {
                    linkedHashMap.put(strDecode, "");
                } else {
                    linkedHashMap.put(strDecode, Uri.decode(encodedQuery.substring(iIndexOf2 + 1, i2)));
                }
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static byte[] m1622a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            gZIPOutputStream.flush();
            m1621a(gZIPOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            m1621a(gZIPOutputStream);
            throw th;
        }
    }
}
