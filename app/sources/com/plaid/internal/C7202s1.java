package com.plaid.internal;

import android.text.TextUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.http.ContentEncoding;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.plaid.internal.s1 */
/* loaded from: classes16.dex */
public final class C7202s1 {

    /* renamed from: h */
    public static final C7237w0 f3172h;

    /* renamed from: a */
    public final String f3173a;

    /* renamed from: b */
    public final URL f3174b;

    /* renamed from: c */
    public final HashMap f3175c;

    /* renamed from: d */
    public final LinkedHashMap f3176d;

    /* renamed from: e */
    public final String f3177e;

    /* renamed from: f */
    public String f3178f;

    /* renamed from: g */
    public boolean f3179g;

    /* renamed from: com.plaid.internal.s1$a */
    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if ("host".equals(str3)) {
                return -1;
            }
            if ("host".equals(str4)) {
                return 1;
            }
            return str3.compareTo(str4);
        }
    }

    /* renamed from: com.plaid.internal.s1$b */
    public static class b {

        /* renamed from: a */
        public final String f3180a;

        /* renamed from: b */
        public final boolean f3181b;

        /* renamed from: c */
        public final byte[] f3182c;

        public b(String str, boolean z) {
            this.f3180a = str;
            this.f3181b = z;
            this.f3182c = z ? AbstractC7220u1.m1622a(str) : str.getBytes(StandardCharsets.UTF_8);
        }
    }

    public C7202s1(URL url, String str) {
        String host;
        HashMap map = new HashMap();
        this.f3175c = map;
        this.f3173a = "HTTP/1.1";
        this.f3177e = str.toUpperCase();
        this.f3174b = url;
        this.f3176d = AbstractC7220u1.m1623b(url.toString());
        if (url.getPort() == -1) {
            host = url.getHost();
        } else {
            host = url.getHost() + ":" + url.getPort();
        }
        map.put("host".toLowerCase(), host);
        map.put("connection".toLowerCase(), "close");
        map.put("cache-control".toLowerCase(), "no-cache");
        map.put("accept".toLowerCase(), "*/*");
        map.put("accept-encoding".toLowerCase(), (String) C7053d1.f2720c.m1488a("http.accept-encoding", ContentEncoding.GZIP, String.class));
    }

    /* renamed from: a */
    public static void m1602a(OutputStream outputStream, b bVar) throws IOException {
        if (bVar.f3182c.length > 0) {
            f3172h.m1635a(EnumC5943Q3.TRACE, bVar.f3181b ? "Socket.gzip(`%s`)" : "Socket.write(`%s`)", bVar.f3180a.trim());
            outputStream.write(bVar.f3182c);
        }
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f3172h = new C7237w0("http-request");
    }

    /* renamed from: a */
    public final void m1603a(OutputStream outputStream) throws IOException {
        b bVar = new b("", false);
        if (this.f3177e.equals("GET")) {
            f3172h.m1635a(EnumC5943Q3.TRACE, "Sending GET Request", new Object[0]);
        } else if (this.f3177e.equals("POST")) {
            f3172h.m1635a(EnumC5943Q3.TRACE, "Sending POST Request", new Object[0]);
            String str = this.f3178f;
            if (str != null && str.length() > 0) {
                bVar = new b(this.f3178f, this.f3179g);
                if (this.f3179g) {
                    this.f3175c.put("content-encoding".toLowerCase(), ContentEncoding.GZIP);
                } else {
                    this.f3175c.remove("content-encoding");
                }
                this.f3175c.put("content-length".toLowerCase(), String.valueOf(bVar.f3182c.length));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3177e);
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        String path = this.f3174b.getPath();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : this.f3176d.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb2.append("&");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            try {
                sb2.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        }
        String string2 = sb2.toString();
        if (string2.length() > 0) {
            path = this.f3174b.getPath() + "?" + string2;
        }
        if (path == null || path.length() == 0) {
            path = "/";
        }
        sb.append(path);
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(this.f3173a);
        sb.append("\r\n");
        m1602a(outputStream, new b(sb.toString(), false));
        TreeSet treeSet = new TreeSet(new a());
        treeSet.addAll(this.f3175c.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String[] strArrSplit = str2.toLowerCase().split("-");
            LinkedList linkedList = new LinkedList();
            for (String str3 : strArrSplit) {
                if (str3.length() > 0) {
                    str3 = str3.substring(0, 1).toUpperCase() + str3.substring(1);
                }
                linkedList.add(str3);
            }
            m1602a(outputStream, new b(TextUtils.join("-", linkedList) + ": " + ((String) this.f3175c.get(str2)) + "\r\n", false));
        }
        m1602a(outputStream, new b("\r\n", false));
        m1602a(outputStream, bVar);
        outputStream.flush();
    }
}
