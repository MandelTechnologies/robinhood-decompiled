package com.squareup.wire;

import com.squareup.wire.GrpcCall;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import okio.ByteString;
import okio.Timeout;

/* compiled from: GrpcCalls.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0007¢\u0006\u0002\b\u0007\u001ae\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\t\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u000424\u0010\u0005\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\b\b\u0000\u0010\u0013*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00130\u0014H\u0000\u001a\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016\"\b\b\u0000\u0010\u0013*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00130\u0014H\u0000¨\u0006\u0017"}, m3636d2 = {"GrpcCall", "Lcom/squareup/wire/GrpcCall;", "S", "R", "", "function", "Lkotlin/Function1;", "grpcCall", "GrpcStreamingCall", "Lcom/squareup/wire/GrpcStreamingCall;", "Lkotlin/Function3;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "grpcStreamingCall", "(Lkotlin/jvm/functions/Function3;)Lcom/squareup/wire/GrpcStreamingCall;", "toMessageSource", "Lcom/squareup/wire/MessageSource;", "E", "Lkotlinx/coroutines/channels/Channel;", "toMessageSink", "Lcom/squareup/wire/MessageSink;", "wire-grpc-client"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes12.dex */
public final class GrpcCalls {
    @JvmName
    public static final <S, R> GrpcCall<S, R> grpcCall(final Function1<? super S, ? extends R> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new GrpcCall<S, R>() { // from class: com.squareup.wire.GrpcCalls$GrpcCall$1
            private final Map<String, String> responseMetadata;
            private AtomicBoolean canceled = new AtomicBoolean();
            private AtomicBoolean executed = new AtomicBoolean();
            private Map<String, String> requestMetadata = MapsKt.emptyMap();
            private final Timeout timeout = Timeout.NONE;

            public static /* synthetic */ void getMethod$annotations() {
            }

            @Override // com.squareup.wire.GrpcCall
            public Map<String, String> getRequestMetadata() {
                return this.requestMetadata;
            }

            @Override // com.squareup.wire.GrpcCall
            public void setRequestMetadata(Map<String, String> map) {
                Intrinsics.checkNotNullParameter(map, "<set-?>");
                this.requestMetadata = map;
            }

            @Override // com.squareup.wire.GrpcCall
            public Map<String, String> getResponseMetadata() {
                return this.responseMetadata;
            }

            @Override // com.squareup.wire.GrpcCall
            public GrpcMethod<S, R> getMethod() {
                ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
                return new GrpcMethod<>("/wire/AnonymousEndpoint", protoAdapter, protoAdapter);
            }

            @Override // com.squareup.wire.GrpcCall
            public Timeout getTimeout() {
                return this.timeout;
            }

            @Override // com.squareup.wire.GrpcCall
            public void cancel() {
                this.canceled.set(true);
            }

            @Override // com.squareup.wire.GrpcCall
            public boolean isCanceled() {
                return this.canceled.get();
            }

            @Override // com.squareup.wire.GrpcCall
            public boolean isExecuted() {
                return this.executed.get();
            }

            @Override // com.squareup.wire.GrpcCall
            public void enqueue(S request, GrpcCall.Callback<S, R> callback) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(callback, "callback");
                try {
                    callback.onSuccess(this, executeBlocking(request));
                } catch (IOException e) {
                    callback.onFailure(this, e);
                }
            }

            @Override // com.squareup.wire.GrpcCall
            public Object execute(S s, Continuation<? super R> continuation) {
                return executeBlocking(s);
            }

            @Override // com.squareup.wire.GrpcCall
            public R executeBlocking(S request) throws IOException {
                Intrinsics.checkNotNullParameter(request, "request");
                if (!this.executed.compareAndSet(false, true)) {
                    throw new IllegalStateException("already executed");
                }
                if (this.canceled.get()) {
                    throw new IOException("canceled");
                }
                try {
                    return function.invoke(request);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException("call failed: " + e2, e2);
                }
            }

            @Override // com.squareup.wire.GrpcCall
            public GrpcCall<S, R> clone() {
                GrpcCall<S, R> grpcCall = GrpcCalls.grpcCall(function);
                grpcCall.setRequestMetadata(MapsKt.plus(grpcCall.getRequestMetadata(), getRequestMetadata()));
                return grpcCall;
            }
        };
    }

    @JvmName
    public static final <S, R> GrpcStreamingCall<S, R> grpcStreamingCall(Function3<? super Channel8<? extends S>, ? super Channel9<? super R>, ? super Continuation<? super Unit>, ? extends Object> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new GrpcCalls3(function);
    }

    public static final <E> MessageSource<E> toMessageSource(final Channel<E> channel) {
        Intrinsics.checkNotNullParameter(channel, "<this>");
        return new MessageSource<E>() { // from class: com.squareup.wire.GrpcCalls.toMessageSource.1
            @Override // com.squareup.wire.MessageSource
            public E read() {
                return (E) BuildersKt__BuildersKt.runBlocking$default(null, new GrpcCalls6(channel, null), 1, null);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Channel8.DefaultImpls.cancel$default(channel, null, 1, null);
            }
        };
    }

    public static final <E> MessageSink<E> toMessageSink(final Channel<E> channel) {
        Intrinsics.checkNotNullParameter(channel, "<this>");
        return new MessageSink<E>() { // from class: com.squareup.wire.GrpcCalls.toMessageSink.1
            @Override // com.squareup.wire.MessageSink
            public void write(E message) throws InterruptedException {
                Intrinsics.checkNotNullParameter(message, "message");
                BuildersKt__BuildersKt.runBlocking$default(null, new GrpcCalls5(channel, message, null), 1, null);
            }

            @Override // com.squareup.wire.MessageSink
            public void cancel() {
                Channel<E> channel2 = channel;
                Intrinsics.checkNotNull(channel2, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<*>");
                Channel8.DefaultImpls.cancel$default(channel2, null, 1, null);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Channel9.DefaultImpls.close$default(channel, null, 1, null);
            }
        };
    }
}
