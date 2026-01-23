package com.squareup.wire.internal;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient2;
import com.squareup.wire.GrpcMethod;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Callback;
import okhttp3.Response;
import okio.ForwardingTimeout;
import okio.Timeout;

/* compiled from: RealGrpcCall.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\u0016\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J)\u0010'\u001a\u00020 2\u0006\u0010#\u001a\u00028\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0002\u0010*J\u0011\u0010+\u001a\u00028\u0001*\u00020,H\u0002¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0010H\u0016J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00101R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u00062"}, m3636d2 = {"Lcom/squareup/wire/internal/RealGrpcCall;", "S", "", "R", "Lcom/squareup/wire/GrpcCall;", "grpcClient", "Lcom/squareup/wire/WireGrpcClient;", "method", "Lcom/squareup/wire/GrpcMethod;", "<init>", "(Lcom/squareup/wire/WireGrpcClient;Lcom/squareup/wire/GrpcMethod;)V", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "call", "Lokhttp3/Call;", "canceled", "", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "requestMetadata", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "value", "responseMetadata", "getResponseMetadata", "cancel", "", "isCanceled", "execute", "request", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "(Ljava/lang/Object;)Ljava/lang/Object;", "enqueue", "callback", "Lcom/squareup/wire/GrpcCall$Callback;", "(Ljava/lang/Object;Lcom/squareup/wire/GrpcCall$Callback;)V", "readExactlyOneAndClose", "Lokhttp3/Response;", "(Lokhttp3/Response;)Ljava/lang/Object;", "isExecuted", "clone", "initCall", "(Ljava/lang/Object;)Lokhttp3/Call;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealGrpcCall<S, R> implements GrpcCall<S, R> {
    private okhttp3.Call call;
    private boolean canceled;
    private final GrpcClient2 grpcClient;
    private final GrpcMethod<S, R> method;
    private Map<String, String> requestMetadata;
    private Map<String, String> responseMetadata;
    private final Timeout timeout;

    public RealGrpcCall(GrpcClient2 grpcClient, GrpcMethod<S, R> method) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        Intrinsics.checkNotNullParameter(method, "method");
        this.grpcClient = grpcClient;
        this.method = method;
        this.timeout = new ForwardingTimeout(new Timeout());
        this.requestMetadata = MapsKt.emptyMap();
    }

    @Override // com.squareup.wire.GrpcCall
    public GrpcMethod<S, R> getMethod() {
        return this.method;
    }

    @Override // com.squareup.wire.GrpcCall
    public Timeout getTimeout() {
        return this.timeout;
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
    public void cancel() {
        this.canceled = true;
        okhttp3.Call call = this.call;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.squareup.wire.GrpcCall
    public boolean isCanceled() {
        okhttp3.Call call;
        return this.canceled || ((call = this.call) != null && call.getCanceled());
    }

    @Override // com.squareup.wire.GrpcCall
    public Object execute(S s, Continuation<? super R> continuation) {
        okhttp3.Call callInitCall = initCall(s);
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>(this) { // from class: com.squareup.wire.internal.RealGrpcCall$execute$2$1
            final /* synthetic */ RealGrpcCall<S, R> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.this$0.cancel();
            }
        });
        callInitCall.enqueue(new Callback() { // from class: com.squareup.wire.internal.RealGrpcCall$execute$2$2
            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                Continuation continuation2 = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(e)));
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    ((RealGrpcCall) this).responseMetadata = MapsKt.toMap(response.getHeaders());
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(this.readExactlyOneAndClose(response)));
                } catch (IOException e) {
                    Continuation continuation2 = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(e)));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.squareup.wire.GrpcCall
    public R executeBlocking(S request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        Response responseExecute = initCall(request).execute();
        this.responseMetadata = MapsKt.toMap(responseExecute.getHeaders());
        return readExactlyOneAndClose(responseExecute);
    }

    @Override // com.squareup.wire.GrpcCall
    public void enqueue(S request, final GrpcCall.Callback<S, R> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        initCall(request).enqueue(new Callback() { // from class: com.squareup.wire.internal.RealGrpcCall.enqueue.1
            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                callback.onFailure(this, e);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    ((RealGrpcCall) this).responseMetadata = MapsKt.toMap(response.getHeaders());
                    callback.onSuccess(this, this.readExactlyOneAndClose(response));
                } catch (IOException e) {
                    callback.onFailure(this, e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R readExactlyOneAndClose(Response response) {
        try {
            GrpcMessageSource grpcMessageSourceMessageSource = grpc.messageSource(response, getMethod().getResponseAdapter());
            try {
                try {
                    R r = (R) grpcMessageSourceMessageSource.readExactlyOneAndClose();
                    IOException iOExceptionGrpcResponseToException$default = grpc.grpcResponseToException$default(response, null, 1, null);
                    if (iOExceptionGrpcResponseToException$default != null) {
                        throw iOExceptionGrpcResponseToException$default;
                    }
                    Closeable.closeFinally(grpcMessageSourceMessageSource, null);
                    Closeable.closeFinally(response, null);
                    return r;
                } finally {
                }
            } catch (IOException e) {
                IOException iOExceptionGrpcResponseToException = grpc.grpcResponseToException(response, e);
                Intrinsics.checkNotNull(iOExceptionGrpcResponseToException);
                throw iOExceptionGrpcResponseToException;
            }
        } finally {
        }
    }

    @Override // com.squareup.wire.GrpcCall
    public boolean isExecuted() {
        okhttp3.Call call = this.call;
        if (call != null) {
            return call.isExecuted();
        }
        return false;
    }

    @Override // com.squareup.wire.GrpcCall
    public GrpcCall<S, R> clone() {
        RealGrpcCall realGrpcCall = new RealGrpcCall(this.grpcClient, getMethod());
        Timeout timeout = getTimeout();
        Timeout timeout2 = realGrpcCall.getTimeout();
        timeout2.timeout(timeout.getTimeoutNanos(), TimeUnit.NANOSECONDS);
        if (timeout.getHasDeadline()) {
            timeout2.deadlineNanoTime(timeout.deadlineNanoTime());
        }
        realGrpcCall.setRequestMetadata(MapsKt.plus(realGrpcCall.getRequestMetadata(), getRequestMetadata()));
        return realGrpcCall;
    }

    private final okhttp3.Call initCall(S request) {
        if (this.call != null) {
            throw new IllegalStateException("already executed");
        }
        okhttp3.Call callNewCall$wire_grpc_client = this.grpcClient.newCall$wire_grpc_client(getMethod(), getRequestMetadata(), grpc.newRequestBody(this.grpcClient.getMinMessageToCompress(), getMethod().getRequestAdapter(), request), getTimeout());
        this.call = callNewCall$wire_grpc_client;
        if (this.canceled) {
            callNewCall$wire_grpc_client.cancel();
        }
        if (!getTimeout().getHasDeadline() && getTimeout().getTimeoutNanos() == 0) {
            Timeout timeout = getTimeout();
            Intrinsics.checkNotNull(timeout, "null cannot be cast to non-null type okio.ForwardingTimeout");
            ((ForwardingTimeout) timeout).setDelegate(callNewCall$wire_grpc_client.timeout());
        }
        return callNewCall$wire_grpc_client;
    }
}
