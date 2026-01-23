package com.plaid.internal;

import android.text.TextUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.http.ContentEncoding;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.plaid.internal.t1 */
/* loaded from: classes16.dex */
public final class C7211t1 {

    /* renamed from: e */
    public static final C7237w0 f3210e;

    /* renamed from: a */
    public final int f3211a;

    /* renamed from: b */
    public final String f3212b;

    /* renamed from: c */
    public final HashMap f3213c;

    /* renamed from: d */
    public final String f3214d;

    public C7211t1(int i, String str, HashMap map, String str2) {
        this.f3211a = i;
        this.f3212b = str;
        this.f3213c = map;
        this.f3214d = str2;
    }

    /* renamed from: a */
    public static C7211t1 m1615a(InputStream inputStream) throws IOException, NumberFormatException {
        String strM1624a;
        String strJoin;
        C7225u6 c7225u6 = new C7225u6(inputStream);
        do {
            strM1624a = c7225u6.m1624a();
            if (strM1624a == null) {
                throw new IOException("empty response");
            }
        } while (strM1624a.length() < 10);
        f3210e.m1635a(EnumC5943Q3.TRACE, "HttpResponse: ".concat(strM1624a), new Object[0]);
        String[] strArrSplit = strM1624a.split(PlaceholderUtils.XXShortPlaceholderText);
        if (strArrSplit.length > 0) {
            String str = strArrSplit[0];
        }
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 500;
        if (strArrSplit.length > 2) {
            strJoin = TextUtils.join(PlaceholderUtils.XXShortPlaceholderText, Arrays.copyOfRange(strArrSplit, 2, strArrSplit.length));
        } else if (i == 204) {
            strJoin = "No Content";
        } else if (i == 404) {
            strJoin = "Not Found";
        } else if (i == 410) {
            strJoin = "Gone";
        } else if (i != 500) {
            switch (i) {
                case 200:
                    strJoin = "OK";
                    break;
                case 201:
                    strJoin = "Created";
                    break;
                case 202:
                    strJoin = "Accepted";
                    break;
                default:
                    strJoin = "Unknown Error";
                    break;
            }
        } else {
            strJoin = "Internal Server Error";
        }
        HashMap map = new HashMap();
        String strM1624a2 = c7225u6.m1624a();
        if (strM1624a2 == null) {
            throw new IOException("unexpected end of response");
        }
        int length = strM1624a2.length();
        while (length > 0) {
            C7237w0 c7237w0 = f3210e;
            c7237w0.m1635a(EnumC5943Q3.TRACE, strM1624a2, new Object[0]);
            String[] strArrSplit2 = strM1624a2.split(":");
            if (strArrSplit2.length > 1) {
                String lowerCase = strArrSplit2[0].trim().toLowerCase();
                String strTrim = strM1624a2.substring(strArrSplit2[0].length() + 1).trim();
                List linkedList = (List) map.get(lowerCase);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    map.put(lowerCase, linkedList);
                }
                linkedList.add(strTrim);
            } else {
                c7237w0.m1635a(EnumC5943Q3.ERROR, "Invalid header line received: ".concat(strM1624a2), new Object[0]);
            }
            strM1624a2 = c7225u6.m1624a();
            if (strM1624a2 == null) {
                throw new IOException("unexpected end of response");
            }
            length = strM1624a2.length();
        }
        f3210e.m1635a(EnumC5943Q3.TRACE, strM1624a2, new Object[0]);
        boolean z = false;
        boolean z2 = false;
        int i2 = -1;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) ((List) entry.getValue()).get(0);
            if ("transfer-encoding".equals(str2)) {
                if ("chunked".equalsIgnoreCase(str3)) {
                    z = true;
                } else if (ContentEncoding.GZIP.equalsIgnoreCase(str3)) {
                    z2 = true;
                }
            } else if ("content-length".equals(str2)) {
                i2 = Integer.parseInt((String) ((List) entry.getValue()).get(0));
            }
            if ("content-encoding".equals(entry.getKey()) && ContentEncoding.GZIP.equalsIgnoreCase(str3)) {
                z2 = true;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        if (z) {
            f3210e.m1635a(EnumC5943Q3.TRACE, "read chunked", new Object[0]);
            while (true) {
                String strM1624a3 = c7225u6.m1624a();
                if (strM1624a3 != null) {
                    int i3 = Integer.parseInt(strM1624a3.trim(), 16);
                    f3210e.m1635a(EnumC5943Q3.TRACE, "read chunk of " + i3 + " bytes", new Object[0]);
                    if (i3 != 0) {
                        byte[] bArr = new byte[i3];
                        byteArrayOutputStream.write(bArr, 0, c7225u6.f3236a.read(bArr, 0, i3));
                        c7225u6.m1624a();
                    }
                }
            }
        } else {
            if (i2 >= 0) {
                f3210e.m1635a(EnumC5943Q3.TRACE, "read body of content-length=" + i2, new Object[0]);
                byte[] bArr2 = new byte[i2];
                int i4 = 0;
                do {
                    int i5 = c7225u6.f3236a.read(bArr2, i4, i2 - i4);
                    if (i5 != -1) {
                        i4 += i5;
                    }
                    byteArrayOutputStream.write(bArr2);
                } while (i4 != i2);
                byteArrayOutputStream.write(bArr2);
            } else {
                f3210e.m1635a(EnumC5943Q3.TRACE, "read body of unknown content-length", new Object[0]);
                byte[] bArr3 = new byte[256];
                for (int i6 = c7225u6.f3236a.read(bArr3, 0, 256); i6 > 0; i6 = c7225u6.f3236a.read(bArr3, 0, 256)) {
                    byteArrayOutputStream.write(bArr3, 0, i6);
                }
            }
            if (z2) {
                f3210e.m1635a(EnumC5943Q3.TRACE, "decompress response bytes", new Object[0]);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = new ByteArrayOutputStream(byteArray.length * 4);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
                byte[] bArr4 = new byte[32];
                while (true) {
                    int i7 = gZIPInputStream.read(bArr4);
                    if (i7 != -1) {
                        byteArrayOutputStream.write(bArr4, 0, i7);
                    } else {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    }
                }
            }
        }
        return new C7211t1(i, strJoin, map, byteArrayOutputStream.toString());
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f3210e = new C7237w0("http-response");
    }
}
