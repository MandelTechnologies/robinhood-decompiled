package io.ktor.client.plugins;

import io.ktor.client.network.sockets.TimeoutExceptions;
import io.ktor.client.network.sockets.TimeoutExceptions2;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.logging.KtorSimpleLoggerJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: HttpTimeout.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lio/ktor/client/request/HttpRequestData;", "request", "", "cause", "Lio/ktor/client/network/sockets/ConnectTimeoutException;", "ConnectTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Lio/ktor/client/network/sockets/SocketTimeoutException;", "SocketTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/SocketTimeoutException;", "", "timeout", "", "convertLongTimeoutToIntWithInfiniteAsZero", "(J)I", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.HttpTimeoutKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpTimeout6 {
    private static final Logger LOGGER = KtorSimpleLoggerJvm.KtorSimpleLogger("io.ktor.client.plugins.HttpTimeout");

    public static final int convertLongTimeoutToIntWithInfiniteAsZero(long j) {
        if (j == Long.MAX_VALUE) {
            return 0;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final TimeoutExceptions ConnectTimeoutException(HttpRequestData request, Throwable th) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Connect timeout has expired [url=");
        sb.append(request.getUrl());
        sb.append(", connect_timeout=");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.INSTANCE);
        if (httpTimeoutCapabilityConfiguration == null || (obj = httpTimeoutCapabilityConfiguration.get_connectTimeoutMillis()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append(" ms]");
        return new TimeoutExceptions(sb.toString(), th);
    }

    public static final TimeoutExceptions2 SocketTimeoutException(HttpRequestData request, Throwable th) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb = new StringBuilder();
        sb.append("Socket timeout has expired [url=");
        sb.append(request.getUrl());
        sb.append(", socket_timeout=");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.INSTANCE);
        if (httpTimeoutCapabilityConfiguration == null || (obj = httpTimeoutCapabilityConfiguration.get_socketTimeoutMillis()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        return new TimeoutExceptions2(sb.toString(), th);
    }
}
