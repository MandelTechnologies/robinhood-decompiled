package com.squareup.wire.internal;

import com.singular.sdk.internal.Constants;
import com.squareup.wire.MessageSource;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: BlockingMessageSource.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u001a\u001bB/\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/squareup/wire/internal/BlockingMessageSource;", "R", "", "Lcom/squareup/wire/MessageSource;", "grpcCall", "Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "responseAdapter", "Lcom/squareup/wire/ProtoAdapter;", "call", "Lokhttp3/Call;", "<init>", "(Lcom/squareup/wire/internal/RealGrpcStreamingCall;Lcom/squareup/wire/ProtoAdapter;Lokhttp3/Call;)V", "getGrpcCall", "()Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "getResponseAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "getCall", "()Lokhttp3/Call;", "queue", "Ljava/util/concurrent/LinkedBlockingDeque;", "read", "()Ljava/lang/Object;", "close", "", "readFromResponseBodyCallback", "Lokhttp3/Callback;", "Complete", "Failure", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BlockingMessageSource<R> implements MessageSource<R> {
    private final okhttp3.Call call;
    private final RealGrpcStreamingCall<?, R> grpcCall;
    private final LinkedBlockingDeque<Object> queue;
    private final ProtoAdapter<R> responseAdapter;

    public BlockingMessageSource(RealGrpcStreamingCall<?, R> grpcCall, ProtoAdapter<R> responseAdapter, okhttp3.Call call) {
        Intrinsics.checkNotNullParameter(grpcCall, "grpcCall");
        Intrinsics.checkNotNullParameter(responseAdapter, "responseAdapter");
        Intrinsics.checkNotNullParameter(call, "call");
        this.grpcCall = grpcCall;
        this.responseAdapter = responseAdapter;
        this.call = call;
        this.queue = new LinkedBlockingDeque<>(1);
    }

    public final RealGrpcStreamingCall<?, R> getGrpcCall() {
        return this.grpcCall;
    }

    public final ProtoAdapter<R> getResponseAdapter() {
        return this.responseAdapter;
    }

    public final okhttp3.Call getCall() {
        return this.call;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.MessageSource
    public R read() throws InterruptedException, IOException {
        R r = (R) this.queue.take();
        if (r instanceof Complete) {
            this.queue.put(r);
            return null;
        }
        if (r instanceof Failure) {
            this.queue.put(r);
            throw ((Failure) r).getE();
        }
        Intrinsics.checkNotNull(r, "null cannot be cast to non-null type R of com.squareup.wire.internal.BlockingMessageSource");
        return r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.call.cancel();
    }

    public final Callback readFromResponseBodyCallback() {
        return new Callback(this) { // from class: com.squareup.wire.internal.BlockingMessageSource.readFromResponseBodyCallback.1
            final /* synthetic */ BlockingMessageSource<R> this$0;

            {
                this.this$0 = this;
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException e) throws InterruptedException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                ((BlockingMessageSource) this.this$0).queue.put(new Failure(e));
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, Response response) throws InterruptedException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    this.this$0.getGrpcCall().setResponseMetadata$wire_grpc_client(MapsKt.toMap(response.getHeaders()));
                    BlockingMessageSource<R> blockingMessageSource = this.this$0;
                    try {
                        GrpcMessageSource grpcMessageSourceMessageSource = grpc.messageSource(response, blockingMessageSource.getResponseAdapter());
                        while (true) {
                            try {
                                Object obj = grpcMessageSourceMessageSource.read();
                                if (obj == null) {
                                    break;
                                } else {
                                    ((BlockingMessageSource) blockingMessageSource).queue.put(obj);
                                }
                            } finally {
                            }
                        }
                        IOException iOExceptionGrpcResponseToException$default = grpc.grpcResponseToException$default(response, null, 1, null);
                        if (iOExceptionGrpcResponseToException$default != null) {
                            throw iOExceptionGrpcResponseToException$default;
                        }
                        Unit unit = Unit.INSTANCE;
                        Closeable.closeFinally(grpcMessageSourceMessageSource, null);
                        Closeable.closeFinally(response, null);
                        ((BlockingMessageSource) this.this$0).queue.put(Complete.INSTANCE);
                    } finally {
                    }
                } catch (IOException e) {
                    call.cancel();
                    ((BlockingMessageSource) this.this$0).queue.put(new Failure(e));
                }
            }
        };
    }

    /* compiled from: BlockingMessageSource.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/squareup/wire/internal/BlockingMessageSource$Complete;", "", "<init>", "()V", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class Complete {
        public static final Complete INSTANCE = new Complete();

        private Complete() {
        }
    }

    /* compiled from: BlockingMessageSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/squareup/wire/internal/BlockingMessageSource$Failure;", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(Ljava/io/IOException;)V", "getE", "()Ljava/io/IOException;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class Failure {
        private final IOException e;

        public Failure(IOException e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.e = e;
        }

        public final IOException getE() {
            return this.e;
        }
    }
}
