package com.squareup.wire;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import okio.ByteString;
import okio.Timeout;

/* JADX INFO: Add missing generic type declarations: [R, S] */
/* compiled from: GrpcCalls.kt */
@Metadata(m3635d1 = {"\u0000g\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J \u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#0!H\u0017J(\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#0!2\u0006\u0010%\u001a\u00020&H\u0016J \u0010'\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)0!H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001H\u0016R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"com/squareup/wire/GrpcCalls$GrpcStreamingCall$1", "Lcom/squareup/wire/GrpcStreamingCall;", "method", "Lcom/squareup/wire/GrpcMethod;", "getMethod$annotations", "()V", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "canceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "requestMetadata", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "responseMetadata", "getResponseMetadata", "requestChannel", "Lkotlinx/coroutines/channels/Channel;", "responseChannel", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "cancel", "", "isCanceled", "", "isExecuted", "execute", "Lkotlin/Pair;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "executeIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "executeBlocking", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/MessageSource;", "clone", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.squareup.wire.GrpcCalls$GrpcStreamingCall$1, reason: use source file name */
/* loaded from: classes12.dex */
public final class GrpcCalls3<R, S> implements GrpcStreamingCall<S, R> {
    final /* synthetic */ Function3<Channel8<? extends S>, Channel9<? super R>, Continuation<? super Unit>, Object> $function;
    private final Map<String, String> responseMetadata;
    private AtomicBoolean canceled = new AtomicBoolean();
    private AtomicBoolean executed = new AtomicBoolean();
    private Map<String, String> requestMetadata = MapsKt.emptyMap();
    private final Channel<S> requestChannel = Channel4.Channel$default(1, null, null, 6, null);
    private final Channel<R> responseChannel = Channel4.Channel$default(1, null, null, 6, null);
    private final Timeout timeout = Timeout.NONE;

    public static /* synthetic */ void getMethod$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    GrpcCalls3(Function3<? super Channel8<? extends S>, ? super Channel9<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.$function = function3;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcMethod<S, R> getMethod() {
        ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
        return new GrpcMethod<>("/wire/AnonymousEndpoint", protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Map<String, String> getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void setRequestMetadata(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.requestMetadata = map;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Map<String, String> getResponseMetadata() {
        return this.responseMetadata;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Timeout getTimeout() {
        return this.timeout;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void cancel() {
        if (this.canceled.compareAndSet(false, true)) {
            Channel8.DefaultImpls.cancel$default(this.requestChannel, null, 1, null);
            Channel8.DefaultImpls.cancel$default(this.responseChannel, null, 1, null);
        }
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isCanceled() {
        return this.canceled.get();
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isExecuted() {
        return this.executed.get();
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    @Deprecated
    public Tuples2<Channel9<S>, Channel8<R>> execute() {
        return executeIn(CoroutineScope3.INSTANCE);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Tuples2<Channel9<S>, Channel8<R>> executeIn(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("already executed");
        }
        BuildersKt__Builders_commonKt.launch$default(scope, Dispatchers.getIO(), null, new GrpcCalls4(this.$function, this, null), 2, null).invokeOnCompletion(new Function1() { // from class: com.squareup.wire.GrpcCalls$GrpcStreamingCall$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GrpcCalls3.executeIn$lambda$1(this.f$0, (Throwable) obj);
            }
        });
        return Tuples4.m3642to(this.requestChannel, this.responseChannel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeIn$lambda$1(GrpcCalls3 grpcCalls3, Throwable th) {
        grpcCalls3.requestChannel.close(th);
        grpcCalls3.responseChannel.close(th);
        return Unit.INSTANCE;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Tuples2<MessageSink<S>, MessageSource<R>> executeBlocking() {
        executeIn(CoroutineScope3.INSTANCE);
        return Tuples4.m3642to(GrpcCalls.toMessageSink(this.requestChannel), GrpcCalls.toMessageSource(this.responseChannel));
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcStreamingCall<S, R> clone() {
        GrpcStreamingCall<S, R> grpcStreamingCall = GrpcCalls.grpcStreamingCall(this.$function);
        grpcStreamingCall.setRequestMetadata(MapsKt.plus(grpcStreamingCall.getRequestMetadata(), getRequestMetadata()));
        return grpcStreamingCall;
    }
}
