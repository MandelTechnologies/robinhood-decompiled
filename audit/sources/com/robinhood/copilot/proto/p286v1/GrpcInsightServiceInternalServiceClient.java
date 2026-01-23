package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcInsightServiceInternalServiceClient.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GrpcInsightServiceInternalServiceClient;", "Lcom/robinhood/copilot/proto/v1/InsightServiceInternalServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "GetInsightsInternal", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/GetInsightsInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetInsightsInternalResponse;", "CreateInsightsInternal", "Lcom/robinhood/copilot/proto/v1/CreateInsightsInternalRequest;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsInternalResponse;", "GetLatestInsightInternal", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "GetAccountStatusInternal", "Lcom/robinhood/copilot/proto/v1/GetAccountStatusInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetAccountStatusInternalResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcInsightServiceInternalServiceClient implements InsightServiceInternalServiceClient {
    private final GrpcClient client;

    public GrpcInsightServiceInternalServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightServiceInternalServiceClient
    public GrpcCall<GetInsightsInternalRequest, GetInsightsInternalResponse> GetInsightsInternal() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.InsightServiceInternalService/GetInsightsInternal", GetInsightsInternalRequest.ADAPTER, GetInsightsInternalResponse.ADAPTER));
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightServiceInternalServiceClient
    public GrpcCall<CreateInsightsInternalRequest, CreateInsightsInternalResponse> CreateInsightsInternal() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.InsightServiceInternalService/CreateInsightsInternal", CreateInsightsInternalRequest.ADAPTER, CreateInsightsInternalResponse.ADAPTER));
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightServiceInternalServiceClient
    public GrpcCall<GetLatestInsightInternalRequest, GetLatestInsightInternalResponse> GetLatestInsightInternal() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.InsightServiceInternalService/GetLatestInsightInternal", GetLatestInsightInternalRequest.ADAPTER, GetLatestInsightInternalResponse.ADAPTER));
    }

    @Override // com.robinhood.copilot.proto.p286v1.InsightServiceInternalServiceClient
    public GrpcCall<GetAccountStatusInternalRequest, GetAccountStatusInternalResponse> GetAccountStatusInternal() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.InsightServiceInternalService/GetAccountStatusInternal", GetAccountStatusInternalRequest.ADAPTER, GetAccountStatusInternalResponse.ADAPTER));
    }
}
