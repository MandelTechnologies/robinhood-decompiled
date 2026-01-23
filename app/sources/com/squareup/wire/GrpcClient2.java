package com.squareup.wire;

import com.squareup.wire.internal.RealGrpcCall;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* compiled from: GrpcClient.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0012\"\b\b\u0000\u0010\u0013*\u00020\u0015\"\b\b\u0001\u0010\u0014*\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0019\"\b\b\u0000\u0010\u0013*\u00020\u0015\"\b\b\u0001\u0010\u0014*\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/squareup/wire/WireGrpcClient;", "Lcom/squareup/wire/GrpcClient;", "client", "Lokhttp3/Call$Factory;", "baseUrl", "Lokhttp3/HttpUrl;", "Lcom/squareup/wire/GrpcHttpUrl;", "minMessageToCompress", "", "<init>", "(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;J)V", "getClient$wire_grpc_client", "()Lokhttp3/Call$Factory;", "getBaseUrl$wire_grpc_client", "()Lokhttp3/HttpUrl;", "getMinMessageToCompress$wire_grpc_client", "()J", "newCall", "Lcom/squareup/wire/GrpcCall;", "S", "R", "", "method", "Lcom/squareup/wire/GrpcMethod;", "newStreamingCall", "Lcom/squareup/wire/GrpcStreamingCall;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.WireGrpcClient, reason: use source file name */
/* loaded from: classes12.dex */
public final class GrpcClient2 extends GrpcClient {
    private final HttpUrl baseUrl;
    private final Call.Factory client;
    private final long minMessageToCompress;

    /* renamed from: getClient$wire_grpc_client, reason: from getter */
    public final Call.Factory getClient() {
        return this.client;
    }

    /* renamed from: getBaseUrl$wire_grpc_client, reason: from getter */
    public final HttpUrl getBaseUrl() {
        return this.baseUrl;
    }

    /* renamed from: getMinMessageToCompress$wire_grpc_client, reason: from getter */
    public final long getMinMessageToCompress() {
        return this.minMessageToCompress;
    }

    public GrpcClient2(Call.Factory client, HttpUrl baseUrl, long j) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.client = client;
        this.baseUrl = baseUrl;
        this.minMessageToCompress = j;
    }

    @Override // com.squareup.wire.GrpcClient
    public <S, R> GrpcCall<S, R> newCall(GrpcMethod<S, R> method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return new RealGrpcCall(this, method);
    }

    @Override // com.squareup.wire.GrpcClient
    public <S, R> GrpcStreamingCall<S, R> newStreamingCall(GrpcMethod<S, R> method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return new RealGrpcStreamingCall(this, method);
    }
}
