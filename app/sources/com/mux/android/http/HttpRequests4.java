package com.mux.android.http;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: HttpRequests.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/mux/android/http/Response;", "", "Lcom/mux/android/http/Request;", "originalRequest", "Lcom/mux/android/http/Response$StatusLine;", "status", "", "", "", "headers", "", CarResultComposable2.BODY, "<init>", "(Lcom/mux/android/http/Request;Lcom/mux/android/http/Response$StatusLine;Ljava/util/Map;[B)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Lcom/mux/android/http/Request;", "getOriginalRequest", "()Lcom/mux/android/http/Request;", "Lcom/mux/android/http/Response$StatusLine;", "getStatus", "()Lcom/mux/android/http/Response$StatusLine;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "[B", "getBody", "()[B", "successful", "Z", "getSuccessful", "()Z", "StatusLine", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.android.http.Response, reason: use source file name */
/* loaded from: classes27.dex */
public final class HttpRequests4 {
    private final byte[] body;
    private final Map<String, List<String>> headers;
    private final HttpRequests3 originalRequest;
    private final StatusLine status;
    private final boolean successful;

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequests4(HttpRequests3 originalRequest, StatusLine status, Map<String, ? extends List<String>> headers, byte[] bArr) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.originalRequest = originalRequest;
        this.status = status;
        this.headers = headers;
        this.body = bArr;
        int code = status.getCode();
        boolean z = false;
        if (200 <= code && code < 300) {
            z = true;
        }
        this.successful = z;
    }

    public final StatusLine getStatus() {
        return this.status;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    /* compiled from: HttpRequests.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/mux/android/http/Response$StatusLine;", "", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Ljava/lang/String;", "getMessage", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.mux.android.http.Response$StatusLine, reason: from toString */
    public static final /* data */ class StatusLine {
        private final int code;
        private final String message;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusLine)) {
                return false;
            }
            StatusLine statusLine = (StatusLine) other;
            return this.code == statusLine.code && Intrinsics.areEqual(this.message, statusLine.message);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "StatusLine(code=" + this.code + ", message=" + this.message + ')';
        }

        public StatusLine(int i, String str) {
            this.code = i;
            this.message = str;
        }

        public final int getCode() {
            return this.code;
        }
    }

    public final boolean getSuccessful() {
        return this.successful;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean equals(Object other) {
        return (other instanceof HttpRequests4) && hashCode() == ((HttpRequests4) other).hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strTake;
        StringBuilder sb = new StringBuilder();
        sb.append("Response(originalRequest=");
        sb.append(this.originalRequest);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", body=");
        byte[] bArr = this.body;
        if (bArr != null) {
            String string2 = Arrays.toString(bArr);
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            strTake = string2 != null ? StringsKt.take(string2, 80) : null;
        }
        sb.append(strTake);
        sb.append(", successful=");
        sb.append(this.successful);
        sb.append(')');
        return sb.toString();
    }
}
