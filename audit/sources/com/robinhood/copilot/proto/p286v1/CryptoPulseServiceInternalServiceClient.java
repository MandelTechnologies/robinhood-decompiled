package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: CryptoPulseServiceInternalServiceClient.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/CryptoPulseServiceInternalServiceClient;", "Lcom/squareup/wire/Service;", "BatchGetLatestCryptoDigestInternal", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequest;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface CryptoPulseServiceInternalServiceClient extends Service {
    GrpcCall<BatchGetLatestCryptoDigestInternalRequest, BatchGetLatestCryptoDigestInternalResponse> BatchGetLatestCryptoDigestInternal();
}
