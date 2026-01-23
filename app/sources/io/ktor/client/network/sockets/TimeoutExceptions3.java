package io.ktor.client.network.sockets;

import io.ktor.client.plugins.HttpTimeout6;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.Throwable;
import io.ktor.utils.p478io.ByteChannel2;
import io.ktor.utils.p478io.ByteChannelCtor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeoutExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"ByteChannelWithMappedExceptions", "Lio/ktor/utils/io/ByteChannel;", "request", "Lio/ktor/client/request/HttpRequestData;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TimeoutExceptions3 {
    public static final ByteChannelCtor ByteChannelWithMappedExceptions(final HttpRequestData request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ByteChannel2.ByteChannel$default(false, new Function1<Throwable, Throwable>() { // from class: io.ktor.client.network.sockets.TimeoutExceptionsKt.ByteChannelWithMappedExceptions.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Throwable invoke(Throwable th) {
                return (th != null ? Throwable.getRootCause(th) : null) instanceof java.net.SocketTimeoutException ? HttpTimeout6.SocketTimeoutException(request, th) : th;
            }
        }, 1, null);
    }
}
