package com.squareup.wire;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import okio.Timeout;

/* compiled from: GrpcStreamingCall.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J(\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH&J \u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001aH'J \u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0\u001aH&J\b\u0010#\u001a\u00020\u0018H&J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&R\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/GrpcStreamingCall;", "S", "", "R", "method", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "requestMetadata", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "responseMetadata", "getResponseMetadata", "cancel", "", "isCanceled", "", "executeIn", "Lkotlin/Pair;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "execute", "executeBlocking", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/MessageSource;", "isExecuted", "clone", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface GrpcStreamingCall<S, R> {
    void cancel();

    GrpcStreamingCall<S, R> clone();

    @Deprecated
    Tuples2<Channel9<S>, Channel8<R>> execute();

    Tuples2<MessageSink<S>, MessageSource<R>> executeBlocking();

    Tuples2<Channel9<S>, Channel8<R>> executeIn(CoroutineScope scope);

    GrpcMethod<S, R> getMethod();

    Map<String, String> getRequestMetadata();

    Map<String, String> getResponseMetadata();

    Timeout getTimeout();

    boolean isCanceled();

    boolean isExecuted();

    void setRequestMetadata(Map<String, String> map);
}
