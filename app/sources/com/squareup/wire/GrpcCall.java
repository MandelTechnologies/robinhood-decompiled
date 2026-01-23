package com.squareup.wire;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Timeout;

/* compiled from: GrpcCall.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001$J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\u0016\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001dJ)\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H&¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0018H&J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&R\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/GrpcCall;", "S", "", "R", "method", "Lcom/squareup/wire/GrpcMethod;", "getMethod", "()Lcom/squareup/wire/GrpcMethod;", "timeout", "Lokio/Timeout;", "getTimeout", "()Lokio/Timeout;", "requestMetadata", "", "", "getRequestMetadata", "()Ljava/util/Map;", "setRequestMetadata", "(Ljava/util/Map;)V", "responseMetadata", "getResponseMetadata", "cancel", "", "isCanceled", "", "execute", "request", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "(Ljava/lang/Object;)Ljava/lang/Object;", "enqueue", "callback", "Lcom/squareup/wire/GrpcCall$Callback;", "(Ljava/lang/Object;Lcom/squareup/wire/GrpcCall$Callback;)V", "isExecuted", "clone", "Callback", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface GrpcCall<S, R> {

    /* compiled from: GrpcCall.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002J(\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J)\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\f\u001a\u00028\u0003H&¢\u0006\u0002\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/GrpcCall$Callback;", "S", "", "R", "onFailure", "", "call", "Lcom/squareup/wire/GrpcCall;", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "onSuccess", "response", "(Lcom/squareup/wire/GrpcCall;Ljava/lang/Object;)V", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Callback<S, R> {
        void onFailure(GrpcCall<S, R> call, IOException exception);

        void onSuccess(GrpcCall<S, R> call, R response);
    }

    void cancel();

    GrpcCall<S, R> clone();

    void enqueue(S request, Callback<S, R> callback);

    Object execute(S s, Continuation<? super R> continuation) throws CancellationException, IOException;

    R executeBlocking(S request) throws IOException;

    GrpcMethod<S, R> getMethod();

    Map<String, String> getRequestMetadata();

    Map<String, String> getResponseMetadata();

    Timeout getTimeout();

    boolean isCanceled();

    boolean isExecuted();

    void setRequestMetadata(Map<String, String> map);
}
