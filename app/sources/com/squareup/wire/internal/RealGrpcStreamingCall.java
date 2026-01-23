package com.squareup.wire.internal;

import com.squareup.wire.GrpcClient2;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.GrpcStreamingCall;
import com.squareup.wire.MessageSink;
import com.squareup.wire.MessageSource;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
import okio.ForwardingTimeout;
import okio.Timeout;

/* compiled from: RealGrpcStreamingCall.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0012H\u0016J \u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(0&H\u0017J(\u0010)\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(0&2\u0006\u0010*\u001a\u00020+H\u0016J \u0010,\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010.0&H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\b\u00101\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR@\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "S", "", "R", "Lcom/squareup/wire/GrpcStreamingCall;", "grpcClient", "Lcom/squareup/wire/WireGrpcClient;", "method", "Lcom/squareup/wire/GrpcMethod;", "<init>", "(Lcom/squareup/wire/WireGrpcClient;Lcom/squareup/wire/GrpcMethod;)V", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "requestBody", "Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "call", "Lokhttp3/Call;", "canceled", "", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "requestMetadata", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "value", "responseMetadata", "getResponseMetadata", "setResponseMetadata$wire_grpc_client", "cancel", "", "isCanceled", "execute", "Lkotlin/Pair;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "executeIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "executeBlocking", "Lcom/squareup/wire/MessageSink;", "Lcom/squareup/wire/MessageSource;", "isExecuted", "clone", "initCall", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealGrpcStreamingCall<S, R> implements GrpcStreamingCall<S, R> {
    private okhttp3.Call call;
    private boolean canceled;
    private final GrpcClient2 grpcClient;
    private final GrpcMethod<S, R> method;
    private final PipeDuplexRequestBody requestBody;
    private Map<String, String> requestMetadata;
    private Map<String, String> responseMetadata;
    private final Timeout timeout;

    public RealGrpcStreamingCall(GrpcClient2 grpcClient, GrpcMethod<S, R> method) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        Intrinsics.checkNotNullParameter(method, "method");
        this.grpcClient = grpcClient;
        this.method = method;
        this.requestBody = grpc.newDuplexRequestBody();
        this.timeout = new ForwardingTimeout(new Timeout());
        getTimeout().clearTimeout();
        getTimeout().clearDeadline();
        this.requestMetadata = MapsKt.emptyMap();
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcMethod<S, R> getMethod() {
        return this.method;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Timeout getTimeout() {
        return this.timeout;
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

    public void setResponseMetadata$wire_grpc_client(Map<String, String> map) {
        this.responseMetadata = map;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public void cancel() {
        this.canceled = true;
        okhttp3.Call call = this.call;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isCanceled() {
        okhttp3.Call call;
        return this.canceled || ((call = this.call) != null && call.getCanceled());
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    @Deprecated
    public Tuples2<Channel9<S>, Channel8<R>> execute() {
        return executeIn(CoroutineScope3.INSTANCE);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Tuples2<Channel9<S>, Channel8<R>> executeIn(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        final Channel channelChannel$default = Channel4.Channel$default(1, null, null, 6, null);
        final Channel channelChannel$default2 = Channel4.Channel$default(1, null, null, 6, null);
        final okhttp3.Call callInitCall = initCall();
        channelChannel$default2.mo28845invokeOnClose(new Function1() { // from class: com.squareup.wire.internal.RealGrpcStreamingCall$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealGrpcStreamingCall.executeIn$lambda$0(channelChannel$default2, callInitCall, channelChannel$default, (Throwable) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(scope, Dispatchers.getIO(), null, new C424622(channelChannel$default, this, callInitCall, null), 2, null);
        callInitCall.enqueue(grpc.readFromResponseBodyCallback(channelChannel$default2, this, getMethod().getResponseAdapter()));
        return Tuples4.m3642to(channelChannel$default, channelChannel$default2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeIn$lambda$0(Channel channel, okhttp3.Call call, Channel channel2, Throwable th) {
        if (channel.isClosedForReceive()) {
            call.cancel();
            Channel8.DefaultImpls.cancel$default(channel2, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: RealGrpcStreamingCall.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.wire.internal.RealGrpcStreamingCall$executeIn$2", m3645f = "RealGrpcStreamingCall.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.squareup.wire.internal.RealGrpcStreamingCall$executeIn$2 */
    static final class C424622 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ okhttp3.Call $call;
        final /* synthetic */ Channel<S> $requestChannel;
        int label;
        final /* synthetic */ RealGrpcStreamingCall<S, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C424622(Channel<S> channel, RealGrpcStreamingCall<S, R> realGrpcStreamingCall, okhttp3.Call call, Continuation<? super C424622> continuation) {
            super(2, continuation);
            this.$requestChannel = channel;
            this.this$0 = realGrpcStreamingCall;
            this.$call = call;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C424622(this.$requestChannel, this.this$0, this.$call, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C424622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<S> channel = this.$requestChannel;
                PipeDuplexRequestBody pipeDuplexRequestBody = ((RealGrpcStreamingCall) this.this$0).requestBody;
                long minMessageToCompress = ((RealGrpcStreamingCall) this.this$0).grpcClient.getMinMessageToCompress();
                ProtoAdapter<S> requestAdapter = this.this$0.getMethod().getRequestAdapter();
                okhttp3.Call call = this.$call;
                this.label = 1;
                if (grpc.writeToRequestBody(channel, pipeDuplexRequestBody, minMessageToCompress, requestAdapter, call, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public Tuples2<MessageSink<S>, MessageSource<R>> executeBlocking() {
        okhttp3.Call callInitCall = initCall();
        BlockingMessageSource blockingMessageSource = new BlockingMessageSource(this, getMethod().getResponseAdapter(), callInitCall);
        GrpcMessageSink grpcMessageSinkMessageSink = grpc.messageSink(this.requestBody, this.grpcClient.getMinMessageToCompress(), getMethod().getRequestAdapter(), callInitCall);
        callInitCall.enqueue(blockingMessageSource.readFromResponseBodyCallback());
        return Tuples4.m3642to(grpcMessageSinkMessageSink, blockingMessageSource);
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public boolean isExecuted() {
        okhttp3.Call call = this.call;
        if (call != null) {
            return call.isExecuted();
        }
        return false;
    }

    @Override // com.squareup.wire.GrpcStreamingCall
    public GrpcStreamingCall<S, R> clone() {
        RealGrpcStreamingCall realGrpcStreamingCall = new RealGrpcStreamingCall(this.grpcClient, getMethod());
        Timeout timeout = getTimeout();
        Timeout timeout2 = realGrpcStreamingCall.getTimeout();
        timeout2.timeout(timeout.getTimeoutNanos(), TimeUnit.NANOSECONDS);
        if (timeout.getHasDeadline()) {
            timeout2.deadlineNanoTime(timeout.deadlineNanoTime());
        } else {
            timeout2.clearDeadline();
        }
        realGrpcStreamingCall.setRequestMetadata(MapsKt.plus(realGrpcStreamingCall.getRequestMetadata(), getRequestMetadata()));
        return realGrpcStreamingCall;
    }

    private final okhttp3.Call initCall() {
        if (this.call != null) {
            throw new IllegalStateException("already executed");
        }
        okhttp3.Call callNewCall$wire_grpc_client = this.grpcClient.newCall$wire_grpc_client(getMethod(), getRequestMetadata(), this.requestBody, getTimeout());
        this.call = callNewCall$wire_grpc_client;
        if (this.canceled) {
            callNewCall$wire_grpc_client.cancel();
        }
        Timeout timeout = getTimeout();
        Intrinsics.checkNotNull(timeout, "null cannot be cast to non-null type okio.ForwardingTimeout");
        ((ForwardingTimeout) timeout).setDelegate(callNewCall$wire_grpc_client.timeout());
        return callNewCall$wire_grpc_client;
    }
}
