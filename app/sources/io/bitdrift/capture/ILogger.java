package io.bitdrift.capture;

import io.bitdrift.capture.network.HttpRequestInfo;
import io.bitdrift.capture.network.HttpResponseInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ILogger.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJI\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H&¢\u0006\u0004\b\u0005\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"Lio/bitdrift/capture/ILogger;", "", "Lio/bitdrift/capture/network/HttpRequestInfo;", "httpRequestInfo", "", "log", "(Lio/bitdrift/capture/network/HttpRequestInfo;)V", "Lio/bitdrift/capture/network/HttpResponseInfo;", "httpResponseInfo", "(Lio/bitdrift/capture/network/HttpResponseInfo;)V", "Lio/bitdrift/capture/LogLevel;", "level", "", "", "fields", "", "throwable", "Lkotlin/Function0;", "message", "(Lio/bitdrift/capture/LogLevel;Ljava/util/Map;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "startNewSession", "()V", "getSessionId", "()Ljava/lang/String;", "sessionId", "getSessionUrl", "sessionUrl", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ILogger {
    String getSessionId();

    String getSessionUrl();

    void log(LogLevel level, Map<String, String> fields, Throwable throwable, Function0<String> message);

    void log(HttpRequestInfo httpRequestInfo);

    void log(HttpResponseInfo httpResponseInfo);

    void startNewSession();
}
