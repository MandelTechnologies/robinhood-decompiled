package io.ktor.client.plugins.observer;

import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DelegatedCall.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "wrapWithContent", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/client/call/HttpClientCall;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.observer.DelegatedCallKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class DelegatedCall2 {
    public static final HttpClientCall wrapWithContent(HttpClientCall httpClientCall, ByteReadChannelJVM content) {
        Intrinsics.checkNotNullParameter(httpClientCall, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        return new DelegatedCall(httpClientCall.getClient(), content, httpClientCall);
    }
}
