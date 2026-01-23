package com.plaid.internal;

import android.os.Build;
import com.plaid.internal.InterfaceC7184q1;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.http.ContentEncoding;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* renamed from: com.plaid.internal.d */
/* loaded from: classes16.dex */
public final class C7051d implements InterfaceC7184q1 {

    /* renamed from: a */
    public final C7237w0 f2711a;

    /* renamed from: b */
    public final C6023Z3 f2712b;

    /* renamed from: c */
    public int f2713c;

    public C7051d(C6023Z3 c6023z3) {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        this.f2711a = new C7237w0("http-client");
        this.f2713c = 0;
        this.f2712b = c6023z3;
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    /* renamed from: a */
    public final void mo1281a() {
        try {
            C6023Z3 c6023z3 = this.f2712b;
            if (c6023z3.f1867d) {
                return;
            }
            c6023z3.f1867d = true;
            c6023z3.f1865b.run();
        } catch (Exception e) {
            this.f2711a.m1636a(e, "couldn't release the network");
        }
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    public final EnumC7264z isConnected() {
        C6023Z3 c6023z3 = this.f2712b;
        return c6023z3.f1867d ? EnumC7264z.NO : c6023z3.f1866c;
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    /* renamed from: a */
    public final InterfaceC7184q1.b mo1280a(InterfaceC7184q1.a aVar) throws Throwable {
        InputStream errorStream;
        byte[] bytes;
        C7237w0 c7237w0 = this.f2711a;
        StringBuilder sb = new StringBuilder("request ");
        sb.append(aVar.f3119b ? "POST" : "GET");
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(aVar.f3118a);
        c7237w0.m1635a(EnumC5943Q3.DEBUG, sb.toString(), new Object[0]);
        int i = aVar.f3120c;
        if (i <= -1) {
            i = this.f2713c;
        }
        HttpURLConnection httpURLConnection = null;
        OutputStream outputStream = null;
        String str = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f2712b.f1864a.openConnection(new URL(aVar.f3118a));
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Connection", "close");
                httpURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                C7053d1 c7053d1 = C7053d1.f2720c;
                if (!c7053d1.m1490a("http.no-user-agent")) {
                    StringBuilder sb2 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb2.append(Build.VERSION.RELEASE);
                    sb2.append(";device=");
                    String str2 = Build.MANUFACTURER;
                    String str3 = Build.MODEL;
                    if (!str3.toLowerCase().startsWith(str2.toLowerCase())) {
                        str3 = str2 + PlaceholderUtils.XXShortPlaceholderText + str3;
                    }
                    sb2.append(str3);
                    httpURLConnection2.setRequestProperty("user-agent", sb2.toString());
                }
                if (aVar.f3119b) {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Accept", (String) c7053d1.m1488a("http.accept.post", "application/json", String.class));
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection2.setDoOutput(true);
                    boolean zM1490a = c7053d1.m1490a("http.no-gzip");
                    if (!zM1490a) {
                        bytes = AbstractC7220u1.m1622a(aVar.f3121d);
                    } else {
                        bytes = aVar.f3121d.getBytes(StandardCharsets.UTF_8);
                    }
                    if (!zM1490a) {
                        httpURLConnection2.setRequestProperty("Content-Encoding", ContentEncoding.GZIP);
                    }
                    httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                    try {
                        OutputStream outputStream2 = httpURLConnection2.getOutputStream();
                        try {
                            outputStream2.write(bytes, 0, bytes.length);
                            AbstractC7220u1.m1621a(outputStream2);
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            AbstractC7220u1.m1621a(outputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    httpURLConnection2.setRequestProperty("Accept", (String) c7053d1.m1488a("http.accept.get", "application/json, */*", String.class));
                }
                httpURLConnection2.connect();
                try {
                    errorStream = httpURLConnection2.getInputStream();
                } catch (FileNotFoundException unused) {
                    errorStream = httpURLConnection2.getErrorStream();
                }
                int responseCode = httpURLConnection2.getResponseCode();
                String responseMessage = httpURLConnection2.getResponseMessage();
                if (errorStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = errorStream.read(bArr, 0, 1024);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    byteArrayOutputStream.flush();
                    str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                }
                InterfaceC7184q1.b bVar = new InterfaceC7184q1.b(responseCode, responseMessage, str, httpURLConnection2.getHeaderFields());
                httpURLConnection2.disconnect();
                return bVar;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
