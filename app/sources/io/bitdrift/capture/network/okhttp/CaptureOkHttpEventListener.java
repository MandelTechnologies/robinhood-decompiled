package io.bitdrift.capture.network.okhttp;

import com.robinhood.models.card.p311db.Card;
import com.singular.sdk.internal.Constants;
import io.bitdrift.capture.ILogger;
import io.bitdrift.capture.common.IClock;
import io.bitdrift.capture.network.HttpRequestInfo;
import io.bitdrift.capture.network.HttpRequestMetrics;
import io.bitdrift.capture.network.HttpResponse;
import io.bitdrift.capture.network.HttpResponseInfo;
import io.bitdrift.capture.network.HttpUrlPath;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* compiled from: CaptureOkHttpEventListener.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J*\u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J2\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010&\u001a\u00020'H\u0016J \u00102\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u00103\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00104\u001a\u000205H\u0016J&\u00107\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016J\u0018\u0010=\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00108\u001a\u000209H\u0016J\b\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J&\u0010D\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020.0;H\u0016J\u0018\u0010H\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010I\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\tH\u0016J\u0010\u0010K\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010L\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010M\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010Q\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\tH\u0016J\u0010\u0010R\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010S\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010T\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0010\u0010U\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010V\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u001a\u0010W\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010Z\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0015\u0010[\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\\R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006]"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/CaptureOkHttpEventListener;", "Lokhttp3/EventListener;", "logger", "Lio/bitdrift/capture/ILogger;", Card.Icon.CLOCK, "Lio/bitdrift/capture/common/IClock;", "targetEventListener", "(Lio/bitdrift/capture/ILogger;Lio/bitdrift/capture/common/IClock;Lokhttp3/EventListener;)V", "callStartTimeMs", "", "connectStartTimeMs", "Ljava/lang/Long;", "dnsResolutionDurationMs", "dnsStartTimeMs", "fetchInitializationMs", "lastResponse", "Lokhttp3/Response;", "requestBodyBytesSentCount", "requestEndTimeMs", "requestHeadersBytesCount", "requestInfo", "Lio/bitdrift/capture/network/HttpRequestInfo;", "responseBodyBytesReceivedCount", "responseHeadersBytesCount", "responseLatencyMs", "tcpDurationMs", "tlsDurationMs", "tlsStartTimeMs", "cacheConditionalHit", "", "call", "Lokhttp3/Call;", "cachedResponse", "cacheHit", "response", "cacheMiss", "callEnd", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "canceled", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", "dnsStart", "getMetrics", "Lio/bitdrift/capture/network/HttpRequestMetrics;", "isInterruptedException", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "proxySelectEnd", "url", "Lokhttp3/HttpUrl;", "proxies", "proxySelectStart", "requestBodyEnd", "byteCount", "requestBodyStart", "requestFailed", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseFailed", "responseHeadersEnd", "responseHeadersStart", "satisfactionFailure", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "validateLength", "(Ljava/lang/Long;)Ljava/lang/Long;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CaptureOkHttpEventListener extends EventListener {
    private long callStartTimeMs;
    private final IClock clock;
    private Long connectStartTimeMs;
    private Long dnsResolutionDurationMs;
    private Long dnsStartTimeMs;
    private Long fetchInitializationMs;
    private Response lastResponse;
    private final ILogger logger;
    private long requestBodyBytesSentCount;
    private Long requestEndTimeMs;
    private long requestHeadersBytesCount;
    private HttpRequestInfo requestInfo;
    private long responseBodyBytesReceivedCount;
    private long responseHeadersBytesCount;
    private Long responseLatencyMs;
    private final EventListener targetEventListener;
    private Long tcpDurationMs;
    private Long tlsDurationMs;
    private Long tlsStartTimeMs;

    public CaptureOkHttpEventListener(ILogger iLogger, IClock clock, EventListener eventListener) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.logger = iLogger;
        this.clock = clock;
        this.targetEventListener = eventListener;
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        long jValidateLength;
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.callStart(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        this.callStartTimeMs = this.clock.elapsedRealtime();
        Request request = call.request();
        List<String> listValues = request.getHeaders().values("x-capture-path-template");
        String strJoinToString$default = listValues.isEmpty() ? null : CollectionsKt.joinToString$default(listValues, ",", null, null, 0, null, null, 62, null);
        if (request.getBody() == null) {
            jValidateLength = 0L;
        } else {
            RequestBody body = request.getBody();
            jValidateLength = validateLength(body != null ? Long.valueOf(body.contentLength()) : null);
        }
        HttpRequestInfo httpRequestInfo = new HttpRequestInfo(request.getMethod(), request.getUrl().getHost(), new HttpUrlPath(request.getUrl().encodedPath(), strJoinToString$default), request.getUrl().query(), MapsKt.toMap(request.getHeaders()), jValidateLength, null, null, 192, null);
        this.requestInfo = httpRequestInfo;
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.log(httpRequestInfo);
        }
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl url) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.proxySelectStart(call, url);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl url, List<? extends Proxy> proxies) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.proxySelectEnd(call, url, proxies);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String domainName) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.dnsStart(call, domainName);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (this.fetchInitializationMs == null) {
            this.fetchInitializationMs = Long.valueOf(jElapsedRealtime - this.callStartTimeMs);
        }
        this.dnsStartTimeMs = Long.valueOf(jElapsedRealtime);
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.dnsEnd(call, domainName, inetAddressList);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        Long l = this.dnsStartTimeMs;
        if (l != null) {
            long jLongValue = jElapsedRealtime - l.longValue();
            Long l2 = this.dnsResolutionDurationMs;
            this.dnsResolutionDurationMs = Long.valueOf((l2 != null ? l2.longValue() : 0L) + jLongValue);
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.connectStart(call, inetSocketAddress, proxy);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        this.connectStartTimeMs = Long.valueOf(this.clock.elapsedRealtime());
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.secureConnectStart(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        Long l = this.connectStartTimeMs;
        if (l != null) {
            long jLongValue = jElapsedRealtime - l.longValue();
            Long l2 = this.tcpDurationMs;
            this.tcpDurationMs = Long.valueOf((l2 != null ? l2.longValue() : 0L) + jLongValue);
            this.tlsStartTimeMs = Long.valueOf(jElapsedRealtime);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.secureConnectEnd(call, handshake);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        Long l = this.tlsStartTimeMs;
        if (l != null) {
            long jLongValue = jElapsedRealtime - l.longValue();
            Long l2 = this.tlsDurationMs;
            this.tlsDurationMs = Long.valueOf((l2 != null ? l2.longValue() : 0L) + jLongValue);
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Long l;
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (this.tlsStartTimeMs != null || (l = this.connectStartTimeMs) == null) {
            return;
        }
        long jLongValue = jElapsedRealtime - l.longValue();
        Long l2 = this.tcpDurationMs;
        this.tcpDurationMs = Long.valueOf((l2 != null ? l2.longValue() : 0L) + jLongValue);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.connectionAcquired(call, connection);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.connectionReleased(call, connection);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.requestHeadersStart(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.requestHeadersEnd(call, request);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        this.requestEndTimeMs = Long.valueOf(this.clock.elapsedRealtime());
        this.requestHeadersBytesCount += request.getHeaders().byteCount();
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.requestBodyStart(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long byteCount) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.requestBodyEnd(call, byteCount);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        this.requestEndTimeMs = Long.valueOf(this.clock.elapsedRealtime());
        this.requestBodyBytesSentCount += byteCount;
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException ioe) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.requestFailed(call, ioe);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.responseHeadersStart(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Long l = this.requestEndTimeMs;
        if (l != null) {
            long jElapsedRealtime = this.clock.elapsedRealtime() - l.longValue();
            Long l2 = this.responseLatencyMs;
            this.responseLatencyMs = Long.valueOf((l2 != null ? l2.longValue() : 0L) + jElapsedRealtime);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.responseHeadersEnd(call, response);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        this.responseHeadersBytesCount += response.getHeaders().byteCount();
        this.lastResponse = response;
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.responseBodyStart(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long byteCount) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.responseBodyEnd(call, byteCount);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        this.responseBodyBytesReceivedCount += byteCount;
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException ioe) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.responseFailed(call, ioe);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        Response response;
        HttpResponse.HttpResult httpResult;
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.callEnd(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        HttpRequestInfo httpRequestInfo = this.requestInfo;
        if (httpRequestInfo == null || (response = this.lastResponse) == null) {
            return;
        }
        Request request = response.getRequest();
        int code = response.getCode();
        boolean z = false;
        if (200 <= code && code < 400) {
            z = true;
        }
        String host = request.getUrl().getHost();
        HttpUrlPath httpUrlPath = new HttpUrlPath(request.getUrl().encodedPath(), null, 2, null);
        String strQuery = request.getUrl().query();
        if (z) {
            httpResult = HttpResponse.HttpResult.SUCCESS;
        } else {
            httpResult = HttpResponse.HttpResult.FAILURE;
        }
        HttpResponseInfo httpResponseInfo = new HttpResponseInfo(httpRequestInfo, new HttpResponse(httpResult, host, httpUrlPath, strQuery, MapsKt.toMap(response.getHeaders()), Integer.valueOf(code), null, 64, null), this.clock.elapsedRealtime() - this.callStartTimeMs, getMetrics(), null, 16, null);
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.log(httpResponseInfo);
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException ioe) {
        Request request;
        HttpResponse.HttpResult httpResult;
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.callFailed(call, ioe);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        HttpRequestInfo httpRequestInfo = this.requestInfo;
        if (httpRequestInfo == null) {
            return;
        }
        Response response = this.lastResponse;
        if (response == null || (request = response.getRequest()) == null) {
            request = call.request();
        }
        String host = request.getUrl().getHost();
        HttpUrlPath httpUrlPath = new HttpUrlPath(request.getUrl().encodedPath(), null, 2, null);
        String strQuery = request.getUrl().query();
        if (isInterruptedException(ioe)) {
            httpResult = HttpResponse.HttpResult.CANCELED;
        } else {
            httpResult = HttpResponse.HttpResult.FAILURE;
        }
        HttpResponseInfo httpResponseInfo = new HttpResponseInfo(httpRequestInfo, new HttpResponse(httpResult, host, httpUrlPath, strQuery, null, null, ioe, 48, null), this.clock.elapsedRealtime() - this.callStartTimeMs, getMetrics(), null, 16, null);
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.log(httpResponseInfo);
        }
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.canceled(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.satisfactionFailure(call, response);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.cacheHit(call, response);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.cacheMiss(call);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response cachedResponse) {
        Unit unit;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        try {
            Result.Companion companion = Result.INSTANCE;
            EventListener eventListener = this.targetEventListener;
            if (eventListener != null) {
                eventListener.cacheConditionalHit(call, cachedResponse);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m28550constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final HttpRequestMetrics getMetrics() {
        Long lValueOf = Long.valueOf(this.requestBodyBytesSentCount);
        Long lValueOf2 = Long.valueOf(this.responseBodyBytesReceivedCount);
        Long lValueOf3 = Long.valueOf(this.requestHeadersBytesCount);
        Long lValueOf4 = Long.valueOf(this.responseHeadersBytesCount);
        Long l = this.dnsResolutionDurationMs;
        Long l2 = this.tlsDurationMs;
        Long l3 = this.tcpDurationMs;
        Long l4 = this.fetchInitializationMs;
        Long l5 = this.responseLatencyMs;
        Response response = this.lastResponse;
        return new HttpRequestMetrics(lValueOf, lValueOf2, lValueOf3, lValueOf4, l, l2, l3, l4, l5, String.valueOf(response != null ? response.getProtocol() : null));
    }

    private final boolean isInterruptedException(Throwable e) {
        if (e.getCause() != null) {
            e = e.getCause();
        }
        if (e == null) {
            return false;
        }
        return e.getClass() == InterruptedIOException.class || e.getClass() == InterruptedException.class;
    }

    private final Long validateLength(Long l) {
        if (l == null || l.longValue() != -1) {
            return l;
        }
        return null;
    }
}
