package com.twilio.twilsock.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: http.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\b\u0002\u0010\n\u001a\u00060\u0003j\u0002`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u0016\u0010\u001a\u001a\u00020\tHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0014J\r\u0010\u001c\u001a\u00060\u0003j\u0002`\u000bHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\b\u0002\u0010\n\u001a\u00060\u0003j\u0002`\u000bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u00060\u0003j\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m3636d2 = {"Lcom/twilio/twilsock/util/HttpRequest;", "", "url", "", "method", "Lcom/twilio/twilsock/util/HttpMethod;", "headers", "Lcom/twilio/twilsock/util/MultiMap;", "timeout", "Lkotlin/time/Duration;", "payload", "Lcom/twilio/twilsock/util/Payload;", "(Ljava/lang/String;Lcom/twilio/twilsock/util/HttpMethod;Lcom/twilio/twilsock/util/MultiMap;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeaders", "()Lcom/twilio/twilsock/util/MultiMap;", "getMethod", "()Lcom/twilio/twilsock/util/HttpMethod;", "getPayload", "()Ljava/lang/String;", "getTimeout-UwyO8pc", "()J", "J", "getUrl", "component1", "component2", "component3", "component4", "component4-UwyO8pc", "component5", "copy", "copy-zkXUZaI", "(Ljava/lang/String;Lcom/twilio/twilsock/util/HttpMethod;Lcom/twilio/twilsock/util/MultiMap;JLjava/lang/String;)Lcom/twilio/twilsock/util/HttpRequest;", "equals", "", "other", "hashCode", "", "toString", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HttpRequest {
    private final MultiMap<String, String> headers;
    private final http2 method;
    private final String payload;
    private final long timeout;
    private final String url;

    public /* synthetic */ HttpRequest(String str, http2 http2Var, MultiMap multiMap, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, http2Var, multiMap, j, str2);
    }

    /* renamed from: copy-zkXUZaI$default, reason: not valid java name */
    public static /* synthetic */ HttpRequest m27233copyzkXUZaI$default(HttpRequest httpRequest, String str, http2 http2Var, MultiMap multiMap, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpRequest.url;
        }
        if ((i & 2) != 0) {
            http2Var = httpRequest.method;
        }
        if ((i & 4) != 0) {
            multiMap = httpRequest.headers;
        }
        if ((i & 8) != 0) {
            j = httpRequest.timeout;
        }
        if ((i & 16) != 0) {
            str2 = httpRequest.payload;
        }
        String str3 = str2;
        MultiMap multiMap2 = multiMap;
        return httpRequest.m27235copyzkXUZaI(str, http2Var, multiMap2, j, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final http2 getMethod() {
        return this.method;
    }

    public final MultiMap<String, String> component3() {
        return this.headers;
    }

    /* renamed from: component4-UwyO8pc, reason: not valid java name and from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* renamed from: copy-zkXUZaI, reason: not valid java name */
    public final HttpRequest m27235copyzkXUZaI(String url, http2 method, MultiMap<String, String> headers, long timeout, String payload) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new HttpRequest(url, method, headers, timeout, payload, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return Intrinsics.areEqual(this.url, httpRequest.url) && this.method == httpRequest.method && Intrinsics.areEqual(this.headers, httpRequest.headers) && Duration.m28733equalsimpl0(this.timeout, httpRequest.timeout) && Intrinsics.areEqual(this.payload, httpRequest.payload);
    }

    public int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.method.hashCode()) * 31) + this.headers.hashCode()) * 31) + Duration.m28747hashCodeimpl(this.timeout)) * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "HttpRequest(url=" + this.url + ", method=" + this.method + ", headers=" + this.headers + ", timeout=" + ((Object) Duration.m28761toStringimpl(this.timeout)) + ", payload=" + this.payload + ')';
    }

    private HttpRequest(String url, http2 method, MultiMap<String, String> headers, long j, String payload) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.timeout = j;
        this.payload = payload;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ HttpRequest(String str, http2 http2Var, MultiMap multiMap, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? http2.GET : http2Var, (i & 4) != 0 ? new MultiMap() : multiMap, (i & 8) != 0 ? http.getKDefaultRequestTimeout() : j, (i & 16) != 0 ? "" : str2, null);
    }

    public final http2 getMethod() {
        return this.method;
    }

    public final MultiMap<String, String> getHeaders() {
        return this.headers;
    }

    /* renamed from: getTimeout-UwyO8pc, reason: not valid java name */
    public final long m27236getTimeoutUwyO8pc() {
        return this.timeout;
    }

    public final String getPayload() {
        return this.payload;
    }
}
