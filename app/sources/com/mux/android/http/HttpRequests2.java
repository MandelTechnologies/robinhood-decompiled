package com.mux.android.http;

import com.robinhood.android.car.result.CarResultComposable2;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpRequests.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/mux/android/http/POST;", "Lcom/mux/android/http/Request;", "Ljava/net/URL;", "url", "", "", "", "headers", "contentType", "", CarResultComposable2.BODY, "<init>", "(Ljava/net/URL;Ljava/util/Map;Ljava/lang/String;[B)V", "bodyStr", "(Ljava/net/URL;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "mux-kt-utils_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.android.http.POST, reason: use source file name */
/* loaded from: classes27.dex */
public final class HttpRequests2 extends HttpRequests3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequests2(URL url, Map<String, ? extends List<String>> headers, String str, byte[] bArr) {
        super("POST", url, headers, str, bArr);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    public /* synthetic */ HttpRequests2(URL url, Map map, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, (Map<String, ? extends List<String>>) ((i & 2) != 0 ? MapsKt.emptyMap() : map), (i & 4) != 0 ? "application/json" : str, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequests2(URL url, Map<String, ? extends List<String>> headers, String str, String str2) {
        this(url, headers, str, str2 != null ? HttpRequests.asRequestBody(str2) : null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }
}
