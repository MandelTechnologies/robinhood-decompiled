package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequest2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpTimeout.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lio/ktor/utils/io/errors/IOException;", "", "url", "", "timeoutMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.HttpRequestTimeoutException, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpTimeout2 extends IOException {
    public HttpTimeout2(String url, Long l) {
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sb = new StringBuilder();
        sb.append("Request timeout has expired [url=");
        sb.append(url);
        sb.append(", request_timeout=");
        sb.append(l == null ? "unknown" : l);
        sb.append(" ms]");
        super(sb.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpTimeout2(HttpRequest2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String strBuildString = request.getUrl().buildString();
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.INSTANCE);
        this(strBuildString, httpTimeoutCapabilityConfiguration != null ? httpTimeoutCapabilityConfiguration.get_requestTimeoutMillis() : null);
    }
}
