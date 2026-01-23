package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: CryptoDigestServiceInternalServiceClient.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/CryptoDigestServiceInternalServiceClient;", "Lcom/squareup/wire/Service;", "GetLatestCryptoDigestInternal", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalResponse;", "ClearCryptoDigestCache", "Lcom/robinhood/copilot/proto/v1/ClearCryptoDigestCacheRequest;", "Lcom/robinhood/copilot/proto/v1/ClearCryptoDigestCacheResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface CryptoDigestServiceInternalServiceClient extends Service {
    GrpcCall<ClearCryptoDigestCacheRequest, ClearCryptoDigestCacheResponse> ClearCryptoDigestCache();

    GrpcCall<GetLatestCryptoDigestInternalRequest, GetLatestCryptoDigestInternalResponse> GetLatestCryptoDigestInternal();
}
