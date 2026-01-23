package com.mux.android.http;

import com.robinhood.android.car.result.CarResultComposable2;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: HttpRequests.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m3636d2 = {"Lcom/mux/android/http/Request;", "", "method", "", "url", "Ljava/net/URL;", "headers", "", "", "contentType", CarResultComposable2.BODY, "", "(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Ljava/lang/String;[B)V", "getBody", "()[B", "getContentType", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getMethod", "getUrl", "()Ljava/net/URL;", "equals", "", "other", "hashCode", "", "toString", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.android.http.Request, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class HttpRequests3 {
    private final byte[] body;
    private final String contentType;
    private final Map<String, List<String>> headers;
    private final String method;
    private final URL url;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequests3(String method, URL url, Map<String, ? extends List<String>> headers, String str, byte[] bArr) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.method = method;
        this.url = url;
        this.headers = headers;
        this.contentType = str;
        this.body = bArr;
    }

    public final String getMethod() {
        return this.method;
    }

    public final URL getUrl() {
        return this.url;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean equals(Object other) {
        return other != null && other.getClass() == getClass() && hashCode() == other.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strTake;
        StringBuilder sb = new StringBuilder();
        sb.append("Request(method='");
        sb.append(this.method);
        sb.append("', url=");
        sb.append(this.url);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", body=");
        byte[] bArr = this.body;
        if (bArr != null) {
            String string2 = Arrays.toString(bArr);
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            strTake = string2 != null ? StringsKt.take(string2, 80) : null;
        }
        sb.append(strTake);
        sb.append(')');
        return sb.toString();
    }
}
