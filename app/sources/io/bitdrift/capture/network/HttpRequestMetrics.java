package io.bitdrift.capture.network;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpRequestMetrics.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010!R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lio/bitdrift/capture/network/HttpRequestMetrics;", "", "", "requestBodyBytesSentCount", "responseBodyBytesReceivedCount", "requestHeadersBytesCount", "responseHeadersBytesCount", "dnsResolutionDurationMs", "tlsDurationMs", "tcpDurationMs", "fetchInitializationMs", "responseLatencyMs", "", "protocolName", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getRequestBodyBytesSentCount$platform_jvm_capture_capture_logger_lib_kt", "()Ljava/lang/Long;", "getResponseBodyBytesReceivedCount$platform_jvm_capture_capture_logger_lib_kt", "getRequestHeadersBytesCount$platform_jvm_capture_capture_logger_lib_kt", "getResponseHeadersBytesCount$platform_jvm_capture_capture_logger_lib_kt", "getDnsResolutionDurationMs$platform_jvm_capture_capture_logger_lib_kt", "setDnsResolutionDurationMs$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/lang/Long;)V", "getTlsDurationMs$platform_jvm_capture_capture_logger_lib_kt", "setTlsDurationMs$platform_jvm_capture_capture_logger_lib_kt", "getTcpDurationMs$platform_jvm_capture_capture_logger_lib_kt", "setTcpDurationMs$platform_jvm_capture_capture_logger_lib_kt", "getFetchInitializationMs$platform_jvm_capture_capture_logger_lib_kt", "setFetchInitializationMs$platform_jvm_capture_capture_logger_lib_kt", "getResponseLatencyMs$platform_jvm_capture_capture_logger_lib_kt", "setResponseLatencyMs$platform_jvm_capture_capture_logger_lib_kt", "Ljava/lang/String;", "getProtocolName$platform_jvm_capture_capture_logger_lib_kt", "setProtocolName$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/lang/String;)V", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HttpRequestMetrics {
    private Long dnsResolutionDurationMs;
    private Long fetchInitializationMs;
    private String protocolName;
    private final Long requestBodyBytesSentCount;
    private final Long requestHeadersBytesCount;
    private final Long responseBodyBytesReceivedCount;
    private final Long responseHeadersBytesCount;
    private Long responseLatencyMs;
    private Long tcpDurationMs;
    private Long tlsDurationMs;

    @JvmOverloads
    public HttpRequestMetrics() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequestMetrics)) {
            return false;
        }
        HttpRequestMetrics httpRequestMetrics = (HttpRequestMetrics) other;
        return Intrinsics.areEqual(this.requestBodyBytesSentCount, httpRequestMetrics.requestBodyBytesSentCount) && Intrinsics.areEqual(this.responseBodyBytesReceivedCount, httpRequestMetrics.responseBodyBytesReceivedCount) && Intrinsics.areEqual(this.requestHeadersBytesCount, httpRequestMetrics.requestHeadersBytesCount) && Intrinsics.areEqual(this.responseHeadersBytesCount, httpRequestMetrics.responseHeadersBytesCount) && Intrinsics.areEqual(this.dnsResolutionDurationMs, httpRequestMetrics.dnsResolutionDurationMs) && Intrinsics.areEqual(this.tlsDurationMs, httpRequestMetrics.tlsDurationMs) && Intrinsics.areEqual(this.tcpDurationMs, httpRequestMetrics.tcpDurationMs) && Intrinsics.areEqual(this.fetchInitializationMs, httpRequestMetrics.fetchInitializationMs) && Intrinsics.areEqual(this.responseLatencyMs, httpRequestMetrics.responseLatencyMs) && Intrinsics.areEqual(this.protocolName, httpRequestMetrics.protocolName);
    }

    public int hashCode() {
        Long l = this.requestBodyBytesSentCount;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.responseBodyBytesReceivedCount;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.requestHeadersBytesCount;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.responseHeadersBytesCount;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.dnsResolutionDurationMs;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.tlsDurationMs;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.tcpDurationMs;
        int iHashCode7 = (iHashCode6 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.fetchInitializationMs;
        int iHashCode8 = (iHashCode7 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.responseLatencyMs;
        int iHashCode9 = (iHashCode8 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str = this.protocolName;
        return iHashCode9 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HttpRequestMetrics(requestBodyBytesSentCount=" + this.requestBodyBytesSentCount + ", responseBodyBytesReceivedCount=" + this.responseBodyBytesReceivedCount + ", requestHeadersBytesCount=" + this.requestHeadersBytesCount + ", responseHeadersBytesCount=" + this.responseHeadersBytesCount + ", dnsResolutionDurationMs=" + this.dnsResolutionDurationMs + ", tlsDurationMs=" + this.tlsDurationMs + ", tcpDurationMs=" + this.tcpDurationMs + ", fetchInitializationMs=" + this.fetchInitializationMs + ", responseLatencyMs=" + this.responseLatencyMs + ", protocolName=" + this.protocolName + ')';
    }

    @JvmOverloads
    public HttpRequestMetrics(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str) {
        this.requestBodyBytesSentCount = l;
        this.responseBodyBytesReceivedCount = l2;
        this.requestHeadersBytesCount = l3;
        this.responseHeadersBytesCount = l4;
        this.dnsResolutionDurationMs = l5;
        this.tlsDurationMs = l6;
        this.tcpDurationMs = l7;
        this.fetchInitializationMs = l8;
        this.responseLatencyMs = l9;
        this.protocolName = str;
    }

    public /* synthetic */ HttpRequestMetrics(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : l4, (i & 16) != 0 ? null : l5, (i & 32) != 0 ? null : l6, (i & 64) != 0 ? null : l7, (i & 128) != 0 ? null : l8, (i & 256) != 0 ? null : l9, (i & 512) != 0 ? null : str);
    }

    /* renamed from: getRequestBodyBytesSentCount$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getRequestBodyBytesSentCount() {
        return this.requestBodyBytesSentCount;
    }

    /* renamed from: getResponseBodyBytesReceivedCount$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getResponseBodyBytesReceivedCount() {
        return this.responseBodyBytesReceivedCount;
    }

    /* renamed from: getRequestHeadersBytesCount$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getRequestHeadersBytesCount() {
        return this.requestHeadersBytesCount;
    }

    /* renamed from: getResponseHeadersBytesCount$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getResponseHeadersBytesCount() {
        return this.responseHeadersBytesCount;
    }

    /* renamed from: getDnsResolutionDurationMs$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getDnsResolutionDurationMs() {
        return this.dnsResolutionDurationMs;
    }

    /* renamed from: getTlsDurationMs$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getTlsDurationMs() {
        return this.tlsDurationMs;
    }

    /* renamed from: getTcpDurationMs$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getTcpDurationMs() {
        return this.tcpDurationMs;
    }

    /* renamed from: getFetchInitializationMs$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getFetchInitializationMs() {
        return this.fetchInitializationMs;
    }

    /* renamed from: getResponseLatencyMs$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final Long getResponseLatencyMs() {
        return this.responseLatencyMs;
    }

    /* renamed from: getProtocolName$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final String getProtocolName() {
        return this.protocolName;
    }
}
