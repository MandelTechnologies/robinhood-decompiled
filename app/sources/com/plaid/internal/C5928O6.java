package com.plaid.internal;

import android.net.Network;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.plaid.internal.InterfaceC7184q1;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import javax.net.SocketFactory;

/* renamed from: com.plaid.internal.O6 */
/* loaded from: classes16.dex */
public final class C5928O6 implements InterfaceC7184q1 {

    /* renamed from: a */
    public final C7237w0 f1603a;

    /* renamed from: b */
    public final C6023Z3 f1604b;

    /* renamed from: c */
    public int f1605c;

    public C5928O6(C6023Z3 c6023z3) {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        this.f1603a = new C7237w0("socket-http-client");
        this.f1605c = 0;
        this.f1604b = c6023z3;
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    /* renamed from: a */
    public final InterfaceC7184q1.b mo1280a(InterfaceC7184q1.a aVar) throws Throwable {
        boolean zEquals;
        Socket socket;
        OutputStream outputStream;
        URL url;
        Socket socketCreateSocket;
        C7202s1 c7202s1;
        C7237w0 c7237w0 = this.f1603a;
        StringBuilder sb = new StringBuilder("request ");
        sb.append(aVar.f3119b ? "POST" : "GET");
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(aVar.f3118a);
        EnumC5943Q3 enumC5943Q3 = EnumC5943Q3.DEBUG;
        c7237w0.m1635a(enumC5943Q3, sb.toString(), new Object[0]);
        try {
            zEquals = new URL(aVar.f3118a).getProtocol().equals(Constants.SCHEME);
        } catch (MalformedURLException unused) {
            zEquals = false;
        }
        if (zEquals) {
            throw new IOException("https not supported by this httpclient");
        }
        int i = aVar.f3120c;
        if (i <= -1) {
            i = this.f1605c;
        }
        try {
            url = new URL(aVar.f3118a);
            Network network = this.f1604b.f1864a;
            InetAddress byName = network.getByName(url.getHost());
            this.f1603a.m1635a(enumC5943Q3, "host " + url.getHost() + " resolved to " + byName, new Object[0]);
            SocketFactory socketFactory = network.getSocketFactory();
            int port = url.getPort();
            if (port == -1) {
                port = url.getDefaultPort();
            }
            socketCreateSocket = socketFactory.createSocket(byName, port);
        } catch (Throwable th) {
            th = th;
            socket = null;
        }
        try {
            socketCreateSocket.setSoTimeout(i);
            OutputStream outputStream2 = socketCreateSocket.getOutputStream();
            try {
                if (aVar.f3119b) {
                    c7202s1 = new C7202s1(url, "POST");
                    C7053d1 c7053d1 = C7053d1.f2720c;
                    c7202s1.f3175c.put("accept".toLowerCase(), (String) c7053d1.m1488a("http.accept.post", "application/json", String.class));
                    c7202s1.f3175c.put("accept".toLowerCase(), (String) c7053d1.m1488a("http.accept.post", "application/json", String.class));
                    c7202s1.f3178f = aVar.f3121d;
                    c7202s1.f3179g = !c7053d1.m1490a("http.no-gzip");
                } else {
                    c7202s1 = new C7202s1(url, "GET");
                    c7202s1.f3175c.put("accept".toLowerCase(), (String) C7053d1.f2720c.m1488a("http.accept.get", "application/json, */*", String.class));
                }
                if (!C7053d1.f2720c.m1490a("http.no-user-agent")) {
                    StringBuilder sb2 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb2.append(Build.VERSION.RELEASE);
                    sb2.append(";device=");
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                    if (!str2.toLowerCase().startsWith(str.toLowerCase())) {
                        str2 = str + PlaceholderUtils.XXShortPlaceholderText + str2;
                    }
                    sb2.append(str2);
                    c7202s1.f3175c.put("user-agent".toLowerCase(), sb2.toString());
                }
                c7202s1.m1603a(outputStream2);
                InputStream inputStream = socketCreateSocket.getInputStream();
                C7211t1 c7211t1M1615a = C7211t1.m1615a(inputStream);
                inputStream.close();
                InterfaceC7184q1.b bVar = new InterfaceC7184q1.b(c7211t1M1615a.f3211a, c7211t1M1615a.f3212b, c7211t1M1615a.f3214d, c7211t1M1615a.f3213c);
                AbstractC7220u1.m1621a(outputStream2);
                AbstractC7220u1.m1621a(socketCreateSocket);
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStream2;
                socket = socketCreateSocket;
                AbstractC7220u1.m1621a(outputStream);
                AbstractC7220u1.m1621a(socket);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            socket = socketCreateSocket;
            outputStream = null;
            AbstractC7220u1.m1621a(outputStream);
            AbstractC7220u1.m1621a(socket);
            throw th;
        }
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    public final EnumC7264z isConnected() {
        return null;
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    /* renamed from: a */
    public final void mo1281a() {
        try {
            C6023Z3 c6023z3 = this.f1604b;
            if (c6023z3.f1867d) {
                return;
            }
            c6023z3.f1867d = true;
            c6023z3.f1865b.run();
        } catch (Exception e) {
            this.f1603a.m1636a(e, "couldn't release the network");
        }
    }
}
