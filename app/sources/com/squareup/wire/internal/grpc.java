package com.squareup.wire.internal;

import com.robinhood.utils.http.ContentEncoding;
import com.squareup.wire.GrpcException;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.ChannelsKt;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.ByteString;

/* compiled from: grpc.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\f\u001a\u0002H\u0006H\u0000¢\u0006\u0002\u0010\r\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0000\u001a:\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0011\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a<\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0016*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00160\u00172\u0010\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00160\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000bH\u0000\u001aH\u0010\u001b\u001a\u00020\u001c\"\b\b\u0000\u0010\u0006*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\u00060\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0002\u0010\u001f\u001a*\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00160!\"\b\b\u0000\u0010\u0016*\u00020\u0007*\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000bH\u0000\u001a\f\u0010$\u001a\u00020\u001c*\u00020\"H\u0002\u001a&\u0010%\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'*\u00020\"2\u0010\b\u0002\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006)"}, m3636d2 = {"APPLICATION_GRPC_MEDIA_TYPE", "Lokhttp3/MediaType;", "getAPPLICATION_GRPC_MEDIA_TYPE", "()Lokhttp3/MediaType;", "newRequestBody", "Lokhttp3/RequestBody;", "S", "", "minMessageToCompress", "", "requestAdapter", "Lcom/squareup/wire/ProtoAdapter;", "onlyMessage", "(JLcom/squareup/wire/ProtoAdapter;Ljava/lang/Object;)Lokhttp3/RequestBody;", "newDuplexRequestBody", "Lcom/squareup/wire/internal/PipeDuplexRequestBody;", "messageSink", "Lcom/squareup/wire/internal/GrpcMessageSink;", "callForCancel", "Lokhttp3/Call;", "readFromResponseBodyCallback", "Lokhttp3/Callback;", "R", "Lkotlinx/coroutines/channels/SendChannel;", "grpcCall", "Lcom/squareup/wire/internal/RealGrpcStreamingCall;", "responseAdapter", "writeToRequestBody", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "requestBody", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lcom/squareup/wire/internal/PipeDuplexRequestBody;JLcom/squareup/wire/ProtoAdapter;Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageSource", "Lcom/squareup/wire/internal/GrpcMessageSource;", "Lokhttp3/Response;", "protoAdapter", "checkGrpcResponse", "grpcResponseToException", "Ljava/io/IOException;", "Lokio/IOException;", "suppressed", "wire-grpc-client"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.squareup.wire.internal.GrpcKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class grpc {
    private static final MediaType APPLICATION_GRPC_MEDIA_TYPE = MediaType.INSTANCE.get("application/grpc");

    /* compiled from: grpc.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.wire.internal.GrpcKt", m3645f = "grpc.kt", m3646l = {250}, m3647m = "writeToRequestBody")
    /* renamed from: com.squareup.wire.internal.GrpcKt$writeToRequestBody$1 */
    static final class C424581<S> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C424581(Continuation<? super C424581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return grpc.writeToRequestBody(null, null, 0L, null, null, this);
        }
    }

    public static final MediaType getAPPLICATION_GRPC_MEDIA_TYPE() {
        return APPLICATION_GRPC_MEDIA_TYPE;
    }

    public static final <S> RequestBody newRequestBody(final long j, final ProtoAdapter<S> requestAdapter, final S onlyMessage) {
        Intrinsics.checkNotNullParameter(requestAdapter, "requestAdapter");
        Intrinsics.checkNotNullParameter(onlyMessage, "onlyMessage");
        return new RequestBody() { // from class: com.squareup.wire.internal.GrpcKt.newRequestBody.1
            @Override // okhttp3.RequestBody
            /* renamed from: contentType */
            public MediaType getContentType() {
                return grpc.getAPPLICATION_GRPC_MEDIA_TYPE();
            }

            @Override // okhttp3.RequestBody
            public void writeTo(BufferedSink sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                GrpcMessageSink grpcMessageSink = new GrpcMessageSink(sink, j, requestAdapter, null, ContentEncoding.GZIP);
                try {
                    grpcMessageSink.write(onlyMessage);
                    Unit unit = Unit.INSTANCE;
                    Closeable.closeFinally(grpcMessageSink, null);
                } finally {
                }
            }
        };
    }

    public static final PipeDuplexRequestBody newDuplexRequestBody() {
        return new PipeDuplexRequestBody(APPLICATION_GRPC_MEDIA_TYPE, 1048576L);
    }

    public static final <S> GrpcMessageSink<S> messageSink(PipeDuplexRequestBody pipeDuplexRequestBody, long j, ProtoAdapter<S> requestAdapter, okhttp3.Call callForCancel) {
        Intrinsics.checkNotNullParameter(pipeDuplexRequestBody, "<this>");
        Intrinsics.checkNotNullParameter(requestAdapter, "requestAdapter");
        Intrinsics.checkNotNullParameter(callForCancel, "callForCancel");
        return new GrpcMessageSink<>(pipeDuplexRequestBody.createSink(), j, requestAdapter, platform2.toWireCall(callForCancel), ContentEncoding.GZIP);
    }

    public static final <R> Callback readFromResponseBodyCallback(final Channel9<? super R> channel9, final RealGrpcStreamingCall<?, R> grpcCall, final ProtoAdapter<R> responseAdapter) {
        Intrinsics.checkNotNullParameter(channel9, "<this>");
        Intrinsics.checkNotNullParameter(grpcCall, "grpcCall");
        Intrinsics.checkNotNullParameter(responseAdapter, "responseAdapter");
        return new Callback() { // from class: com.squareup.wire.internal.GrpcKt.readFromResponseBodyCallback.1
            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                channel9.close(e);
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, Response response) throws InterruptedException {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                grpcCall.setResponseMetadata$wire_grpc_client(MapsKt.toMap(response.getHeaders()));
                BuildersKt__BuildersKt.runBlocking$default(null, new grpc2(response, responseAdapter, channel9, null), 1, null);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x009a, TryCatch #7 {all -> 0x009a, blocks: (B:25:0x0085, B:27:0x008e, B:22:0x0070, B:30:0x009c), top: B:76:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #7 {all -> 0x009a, blocks: (B:25:0x0085, B:27:0x008e, B:22:0x0070, B:30:0x009c), top: B:76:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.squareup.wire.internal.PipeDuplexRequestBody] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.squareup.wire.internal.GrpcMessageSink] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:76:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> Object writeToRequestBody(Channel8<? extends S> channel8, PipeDuplexRequestBody pipeDuplexRequestBody, long j, ProtoAdapter<S> protoAdapter, okhttp3.Call call, Continuation<? super Unit> continuation) {
        C424581 c424581;
        ?? MessageSink;
        boolean z;
        boolean z2;
        Ref.BooleanRef booleanRef;
        Channel8<? extends S> channel82;
        Throwable th;
        ProtoAdapter<S> protoAdapter2;
        Channel3 it;
        Channel8<? extends S> channel83;
        ProtoAdapter<S> protoAdapter3;
        ?? r10;
        ?? r9;
        Channel8<? extends S> channel84;
        if (continuation instanceof C424581) {
            c424581 = (C424581) continuation;
            int i = c424581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c424581.label = i - Integer.MIN_VALUE;
            } else {
                c424581 = new C424581(continuation);
            }
        }
        Object objHasNext = c424581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c424581.label;
        try {
            try {
            } finally {
                if (!z) {
                    if (!z2) {
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHasNext);
                MessageSink = messageSink(pipeDuplexRequestBody, j, protoAdapter, call);
                try {
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = true;
                    try {
                        ProtoAdapter<S> protoAdapter4 = MessageSink;
                        protoAdapter2 = protoAdapter4;
                        booleanRef = booleanRef2;
                        channel82 = channel8;
                        it = channel8.iterator();
                        channel83 = channel82;
                        protoAdapter3 = protoAdapter4;
                        c424581.L$0 = channel83;
                        c424581.L$1 = protoAdapter2;
                        c424581.L$2 = protoAdapter3;
                        c424581.L$3 = booleanRef;
                        c424581.L$4 = channel82;
                        c424581.L$5 = it;
                        c424581.label = 1;
                        objHasNext = it.hasNext(c424581);
                        channel84 = channel83;
                        r9 = protoAdapter3;
                        r10 = protoAdapter2;
                        if (objHasNext == coroutine_suspended) {
                        }
                        if (((Boolean) objHasNext).booleanValue()) {
                        }
                    } catch (Throwable th2) {
                        ProtoAdapter<S> protoAdapter5 = MessageSink;
                        call = protoAdapter5;
                        booleanRef = booleanRef2;
                        channel82 = channel8;
                        th = th2;
                        pipeDuplexRequestBody = channel82;
                        protoAdapter = protoAdapter5;
                    }
                } catch (Throwable th3) {
                    pipeDuplexRequestBody = channel8;
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        Closeable.closeFinally(MessageSink, th);
                        throw th4;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Channel3) c424581.L$5;
                Channel8<? extends S> channel85 = (Channel8) c424581.L$4;
                Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) c424581.L$3;
                Object obj = (java.io.Closeable) c424581.L$2;
                GrpcMessageSink grpcMessageSink = (GrpcMessageSink) c424581.L$1;
                Channel8<? extends S> channel86 = (Channel8) c424581.L$0;
                try {
                    ResultKt.throwOnFailure(objHasNext);
                    channel82 = channel85;
                    channel84 = channel86;
                    r10 = grpcMessageSink;
                    boolean z3 = (ProtoAdapter<S>) obj;
                    booleanRef = booleanRef3;
                    r9 = z3;
                    try {
                        if (((Boolean) objHasNext).booleanValue()) {
                            Object next = it.next();
                            booleanRef.element = false;
                            r10.write(next);
                            booleanRef.element = true;
                            channel83 = channel84;
                            protoAdapter3 = r9;
                            protoAdapter2 = r10;
                            c424581.L$0 = channel83;
                            c424581.L$1 = protoAdapter2;
                            c424581.L$2 = protoAdapter3;
                            c424581.L$3 = booleanRef;
                            c424581.L$4 = channel82;
                            c424581.L$5 = it;
                            c424581.label = 1;
                            objHasNext = it.hasNext(c424581);
                            channel84 = channel83;
                            r9 = protoAdapter3;
                            r10 = protoAdapter2;
                            if (objHasNext == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((Boolean) objHasNext).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed(channel82, null);
                                booleanRef.element = false;
                                Closeable.closeFinally((java.io.Closeable) r9, null);
                                return Unit.INSTANCE;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        pipeDuplexRequestBody = channel84;
                        protoAdapter = r9;
                        call = r10;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    channel82 = channel85;
                    pipeDuplexRequestBody = channel86;
                    call = grpcMessageSink;
                    ProtoAdapter<S> protoAdapter6 = (ProtoAdapter<S>) obj;
                    booleanRef = booleanRef3;
                    protoAdapter = protoAdapter6;
                }
            }
            try {
                throw th;
            } catch (Throwable th7) {
                ChannelsKt.cancelConsumed(channel82, th);
                throw th7;
            }
        } catch (Throwable th8) {
            try {
                if (booleanRef.element) {
                    call.cancel();
                }
                throw th8;
            } catch (Throwable th9) {
                th = th9;
                MessageSink = protoAdapter;
                pipeDuplexRequestBody = pipeDuplexRequestBody;
                throw th;
            }
        }
    }

    public static final <R> GrpcMessageSource<R> messageSource(Response response, ProtoAdapter<R> protoAdapter) throws IOException {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(protoAdapter, "protoAdapter");
        checkGrpcResponse(response);
        String strHeader$default = Response.header$default(response, "grpc-encoding", null, 2, null);
        ResponseBody body = response.getBody();
        Intrinsics.checkNotNull(body);
        return new GrpcMessageSource<>(body.getSource(), protoAdapter, strHeader$default);
    }

    private static final void checkGrpcResponse(Response response) throws IOException {
        ResponseBody body = response.getBody();
        Intrinsics.checkNotNull(body);
        MediaType mediaType = body.get$contentType();
        if (response.getCode() == 200 && mediaType != null && Intrinsics.areEqual(mediaType.getType(), "application") && (Intrinsics.areEqual(mediaType.getSubtype(), "grpc") || Intrinsics.areEqual(mediaType.getSubtype(), "grpc+proto"))) {
            return;
        }
        throw new IOException("expected gRPC but was HTTP status=" + response.getCode() + ", content-type=" + mediaType);
    }

    public static /* synthetic */ IOException grpcResponseToException$default(Response response, IOException iOException, int i, Object obj) {
        if ((i & 1) != 0) {
            iOException = null;
        }
        return grpcResponseToException(response, iOException);
    }

    public static final IOException grpcResponseToException(Response response, IOException e) throws IOException {
        Integer intOrNull;
        ByteString byteStringDecodeBase64;
        Intrinsics.checkNotNullParameter(response, "<this>");
        Headers headersM3820of = Headers.INSTANCE.m3820of(new String[0]);
        if (e == null) {
            try {
                headersM3820of = response.trailers();
            } catch (IOException e2) {
                e = e2;
            }
        }
        String strHeader$default = headersM3820of.get("grpc-status");
        if (strHeader$default == null) {
            strHeader$default = Response.header$default(response, "grpc-status", null, 2, null);
        }
        String strHeader$default2 = headersM3820of.get("grpc-message");
        if (strHeader$default2 == null) {
            strHeader$default2 = Response.header$default(response, "grpc-message", null, 2, null);
        }
        String url = response.getRequest().getUrl().getUrl();
        if (strHeader$default != null && (intOrNull = StringsKt.toIntOrNull(strHeader$default)) != null) {
            if (intOrNull.intValue() == 0) {
                intOrNull = null;
            }
            if (intOrNull != null) {
                int iIntValue = intOrNull.intValue();
                String strHeader$default3 = headersM3820of.get("grpc-status-details-bin");
                if (strHeader$default3 == null) {
                    strHeader$default3 = Response.header$default(response, "grpc-status-details-bin", null, 2, null);
                }
                if (strHeader$default3 != null) {
                    try {
                        byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(strHeader$default3);
                    } catch (IllegalArgumentException e3) {
                        throw new IOException("gRPC transport failure, invalid grpc-status-details-bin (HTTP status=" + response.getCode() + ", grpc-status=" + strHeader$default + ", grpc-message=" + strHeader$default2 + ')', e3);
                    }
                } else {
                    byteStringDecodeBase64 = null;
                }
                return new GrpcException(GrpcStatus.INSTANCE.get(iIntValue), strHeader$default2, byteStringDecodeBase64 != null ? byteStringDecodeBase64.toByteArray() : null, url);
            }
        }
        if (e == null) {
            if ((strHeader$default != null ? StringsKt.toIntOrNull(strHeader$default) : null) != null) {
                return null;
            }
        }
        return new IOException("gRPC transport failure (HTTP status=" + response.getCode() + ", grpc-status=" + strHeader$default + ", grpc-message=" + strHeader$default2 + ')', e);
    }
}
