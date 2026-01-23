package com.squareup.wire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcMethod.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/wire/GrpcMethod;", "S", "", "R", "path", "", "requestAdapter", "Lcom/squareup/wire/ProtoAdapter;", "responseAdapter", "<init>", "(Ljava/lang/String;Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "getPath", "()Ljava/lang/String;", "getRequestAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "getResponseAdapter", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class GrpcMethod<S, R> {
    private final String path;
    private final ProtoAdapter<S> requestAdapter;
    private final ProtoAdapter<R> responseAdapter;

    public GrpcMethod(String path, ProtoAdapter<S> requestAdapter, ProtoAdapter<R> responseAdapter) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestAdapter, "requestAdapter");
        Intrinsics.checkNotNullParameter(responseAdapter, "responseAdapter");
        this.path = path;
        this.requestAdapter = requestAdapter;
        this.responseAdapter = responseAdapter;
    }

    public final String getPath() {
        return this.path;
    }

    public final ProtoAdapter<S> getRequestAdapter() {
        return this.requestAdapter;
    }

    public final ProtoAdapter<R> getResponseAdapter() {
        return this.responseAdapter;
    }
}
