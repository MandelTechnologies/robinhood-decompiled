package io.bitdrift.capture.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0001+Be\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u0014R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lio/bitdrift/capture/network/HttpResponse;", "", "Lio/bitdrift/capture/network/HttpResponse$HttpResult;", "result", "", "host", "Lio/bitdrift/capture/network/HttpUrlPath;", "path", "query", "", "headers", "", "statusCode", "", "error", "<init>", "(Lio/bitdrift/capture/network/HttpResponse$HttpResult;Ljava/lang/String;Lio/bitdrift/capture/network/HttpUrlPath;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Throwable;)V", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bitdrift/capture/network/HttpResponse$HttpResult;", "getResult", "()Lio/bitdrift/capture/network/HttpResponse$HttpResult;", "Ljava/lang/String;", "getHost", "Lio/bitdrift/capture/network/HttpUrlPath;", "getPath", "()Lio/bitdrift/capture/network/HttpUrlPath;", "getQuery", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "HttpResult", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HttpResponse {
    private final Throwable error;
    private final Map<String, String> headers;
    private final String host;
    private final HttpUrlPath path;
    private final String query;
    private final HttpResult result;
    private final Integer statusCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return this.result == httpResponse.result && Intrinsics.areEqual(this.host, httpResponse.host) && Intrinsics.areEqual(this.path, httpResponse.path) && Intrinsics.areEqual(this.query, httpResponse.query) && Intrinsics.areEqual(this.headers, httpResponse.headers) && Intrinsics.areEqual(this.statusCode, httpResponse.statusCode) && Intrinsics.areEqual(this.error, httpResponse.error);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        String str = this.host;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HttpUrlPath httpUrlPath = this.path;
        int iHashCode3 = (iHashCode2 + (httpUrlPath == null ? 0 : httpUrlPath.hashCode())) * 31;
        String str2 = this.query;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.headers;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode6 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "HttpResponse(result=" + this.result + ", host=" + this.host + ", path=" + this.path + ", query=" + this.query + ", headers=" + this.headers + ", statusCode=" + this.statusCode + ", error=" + this.error + ')';
    }

    @JvmOverloads
    public HttpResponse(HttpResult result, String str, HttpUrlPath httpUrlPath, String str2, Map<String, String> map, Integer num, Throwable th) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.host = str;
        this.path = httpUrlPath;
        this.query = str2;
        this.headers = map;
        this.statusCode = num;
        this.error = th;
    }

    public /* synthetic */ HttpResponse(HttpResult httpResult, String str, HttpUrlPath httpUrlPath, String str2, Map map, Integer num, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpResult, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : httpUrlPath, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : th);
    }

    public final HttpResult getResult() {
        return this.result;
    }

    public final String getHost() {
        return this.host;
    }

    public final HttpUrlPath getPath() {
        return this.path;
    }

    public final String getQuery() {
        return this.query;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpResponse.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/bitdrift/capture/network/HttpResponse$HttpResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "CANCELED", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class HttpResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ HttpResult[] $VALUES;
        public static final HttpResult SUCCESS = new HttpResult("SUCCESS", 0);
        public static final HttpResult FAILURE = new HttpResult("FAILURE", 1);
        public static final HttpResult CANCELED = new HttpResult("CANCELED", 2);

        private static final /* synthetic */ HttpResult[] $values() {
            return new HttpResult[]{SUCCESS, FAILURE, CANCELED};
        }

        public static EnumEntries<HttpResult> getEntries() {
            return $ENTRIES;
        }

        public static HttpResult valueOf(String str) {
            return (HttpResult) Enum.valueOf(HttpResult.class, str);
        }

        public static HttpResult[] values() {
            return (HttpResult[]) $VALUES.clone();
        }

        private HttpResult(String str, int i) {
        }

        static {
            HttpResult[] httpResultArr$values = $values();
            $VALUES = httpResultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(httpResultArr$values);
        }
    }
}
