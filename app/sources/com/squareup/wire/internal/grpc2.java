package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel9;
import okhttp3.Response;

/* compiled from: grpc.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.wire.internal.GrpcKt$readFromResponseBodyCallback$1$onResponse$1", m3645f = "grpc.kt", m3646l = {117}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.wire.internal.GrpcKt$readFromResponseBodyCallback$1$onResponse$1, reason: use source file name */
/* loaded from: classes12.dex */
final class grpc2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Response $response;
    final /* synthetic */ ProtoAdapter<R> $responseAdapter;
    final /* synthetic */ Channel9<R> $this_readFromResponseBodyCallback;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    grpc2(Response response, ProtoAdapter<R> protoAdapter, Channel9<? super R> channel9, Continuation<? super grpc2> continuation) {
        super(2, continuation);
        this.$response = response;
        this.$responseAdapter = protoAdapter;
        this.$this_readFromResponseBodyCallback = channel9;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new grpc2(this.$response, this.$responseAdapter, this.$this_readFromResponseBodyCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((grpc2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [okhttp3.Response] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Channel9 channel9;
        Closeable closeable;
        Closeable closeable2;
        GrpcMessageSource grpcMessageSourceMessageSource;
        Response response;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        obj = this.$response;
                        ProtoAdapter protoAdapter = this.$responseAdapter;
                        Channel9 channel92 = this.$this_readFromResponseBodyCallback;
                        try {
                            grpcMessageSourceMessageSource = grpc.messageSource(obj, protoAdapter);
                            response = obj;
                            closeable = response;
                            channel9 = channel92;
                            closeable2 = grpcMessageSourceMessageSource;
                        } catch (IOException e) {
                            try {
                                channel92.close(e);
                            } catch (CancellationException unused) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        grpcMessageSourceMessageSource = (GrpcMessageSource) this.L$4;
                        closeable2 = (Closeable) this.L$3;
                        channel9 = (Channel9) this.L$2;
                        response = (Response) this.L$1;
                        closeable = (Closeable) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (IOException e2) {
                            e = grpc.grpcResponseToException(response, e2);
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    do {
                        obj2 = grpcMessageSourceMessageSource.read();
                        if (obj2 != null) {
                            this.L$0 = closeable;
                            this.L$1 = response;
                            this.L$2 = channel9;
                            this.L$3 = closeable2;
                            this.L$4 = grpcMessageSourceMessageSource;
                            this.label = 1;
                        } else {
                            e = grpc.grpcResponseToException$default(response, null, 1, null);
                            try {
                                channel9.close(e);
                            } catch (CancellationException unused2) {
                            }
                            obj = closeable;
                            try {
                                Unit unit = Unit.INSTANCE;
                                kotlin.p481io.Closeable.closeFinally(closeable2, null);
                                Unit unit2 = Unit.INSTANCE;
                                kotlin.p481io.Closeable.closeFinally(obj, null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                closeable = obj;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj = closeable;
                                        try {
                                            throw th;
                                        } finally {
                                            kotlin.p481io.Closeable.closeFinally(obj, th);
                                        }
                                    }
                                }
                            }
                        }
                    } while (channel9.send(obj2, this) != coroutine_suspended);
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        } catch (Throwable th6) {
            try {
                channel9.close(null);
            } catch (CancellationException unused3) {
            }
            throw th6;
        }
    }
}
