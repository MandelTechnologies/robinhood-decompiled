package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcDigestServiceInternalServiceClient.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GrpcDigestServiceInternalServiceClient;", "Lcom/robinhood/copilot/proto/v1/DigestServiceInternalServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "GetLatestDigestInternal", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestInternalResponse;", "GetLatestDigestNochecks", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestNochecksRequest;", "Lcom/robinhood/copilot/proto/v1/GetLatestDigestNochecksResponse;", "ClearDigestCache", "Lcom/robinhood/copilot/proto/v1/ClearDigestCacheRequest;", "Lcom/robinhood/copilot/proto/v1/ClearDigestCacheResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcDigestServiceInternalServiceClient implements DigestServiceInternalServiceClient {
    private final GrpcClient client;

    public GrpcDigestServiceInternalServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.copilot.proto.p286v1.DigestServiceInternalServiceClient
    public GrpcCall<GetLatestDigestInternalRequest, GetLatestDigestInternalResponse> GetLatestDigestInternal() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.DigestServiceInternalService/GetLatestDigestInternal", GetLatestDigestInternalRequest.ADAPTER, GetLatestDigestInternalResponse.ADAPTER));
    }

    @Override // com.robinhood.copilot.proto.p286v1.DigestServiceInternalServiceClient
    public GrpcCall<GetLatestDigestNochecksRequest, GetLatestDigestNochecksResponse> GetLatestDigestNochecks() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.DigestServiceInternalService/GetLatestDigestNochecks", GetLatestDigestNochecksRequest.ADAPTER, GetLatestDigestNochecksResponse.ADAPTER));
    }

    @Override // com.robinhood.copilot.proto.p286v1.DigestServiceInternalServiceClient
    public GrpcCall<ClearDigestCacheRequest, ClearDigestCacheResponse> ClearDigestCache() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.DigestServiceInternalService/ClearDigestCache", ClearDigestCacheRequest.ADAPTER, ClearDigestCacheResponse.ADAPTER));
    }
}
