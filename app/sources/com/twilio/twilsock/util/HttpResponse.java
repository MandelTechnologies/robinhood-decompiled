package com.twilio.twilsock.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: http.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\n\u0010\t\u001a\u00060\u0005j\u0002`\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\r\u0010\u0018\u001a\u00060\u0005j\u0002`\nHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\f\b\u0002\u0010\t\u001a\u00060\u0005j\u0002`\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\t\u001a\u00060\u0005j\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/twilio/twilsock/util/HttpResponse;", "", "statusCode", "", "status", "", "rawMessageHeaders", "headers", "Lcom/twilio/twilsock/util/MultiMap;", "payload", "Lcom/twilio/twilsock/util/Payload;", "(ILjava/lang/String;Ljava/lang/String;Lcom/twilio/twilsock/util/MultiMap;Ljava/lang/String;)V", "getHeaders", "()Lcom/twilio/twilsock/util/MultiMap;", "getPayload", "()Ljava/lang/String;", "getRawMessageHeaders", "getStatus", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HttpResponse {
    private final MultiMap<String, String> headers;
    private final String payload;
    private final String rawMessageHeaders;
    private final String status;
    private final int statusCode;

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, int i, String str, String str2, MultiMap multiMap, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = httpResponse.status;
        }
        if ((i2 & 4) != 0) {
            str2 = httpResponse.rawMessageHeaders;
        }
        if ((i2 & 8) != 0) {
            multiMap = httpResponse.headers;
        }
        if ((i2 & 16) != 0) {
            str3 = httpResponse.payload;
        }
        String str4 = str3;
        String str5 = str2;
        return httpResponse.copy(i, str, str5, multiMap, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRawMessageHeaders() {
        return this.rawMessageHeaders;
    }

    public final MultiMap<String, String> component4() {
        return this.headers;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    public final HttpResponse copy(int statusCode, String status, String rawMessageHeaders, MultiMap<String, String> headers, String payload) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rawMessageHeaders, "rawMessageHeaders");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new HttpResponse(statusCode, status, rawMessageHeaders, headers, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return this.statusCode == httpResponse.statusCode && Intrinsics.areEqual(this.status, httpResponse.status) && Intrinsics.areEqual(this.rawMessageHeaders, httpResponse.rawMessageHeaders) && Intrinsics.areEqual(this.headers, httpResponse.headers) && Intrinsics.areEqual(this.payload, httpResponse.payload);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.statusCode) * 31) + this.status.hashCode()) * 31) + this.rawMessageHeaders.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "HttpResponse(statusCode=" + this.statusCode + ", status=" + this.status + ", rawMessageHeaders=" + this.rawMessageHeaders + ", headers=" + this.headers + ", payload=" + this.payload + ')';
    }

    public HttpResponse(int i, String status, String rawMessageHeaders, MultiMap<String, String> headers, String payload) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rawMessageHeaders, "rawMessageHeaders");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.statusCode = i;
        this.status = status;
        this.rawMessageHeaders = rawMessageHeaders;
        this.headers = headers;
        this.payload = payload;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getRawMessageHeaders() {
        return this.rawMessageHeaders;
    }

    public final MultiMap<String, String> getHeaders() {
        return this.headers;
    }

    public final String getPayload() {
        return this.payload;
    }
}
