package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: InsightServiceInternalServiceClient.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightServiceInternalServiceClient;", "Lcom/squareup/wire/Service;", "GetInsightsInternal", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/GetInsightsInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetInsightsInternalResponse;", "CreateInsightsInternal", "Lcom/robinhood/copilot/proto/v1/CreateInsightsInternalRequest;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsInternalResponse;", "GetLatestInsightInternal", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "GetAccountStatusInternal", "Lcom/robinhood/copilot/proto/v1/GetAccountStatusInternalRequest;", "Lcom/robinhood/copilot/proto/v1/GetAccountStatusInternalResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface InsightServiceInternalServiceClient extends Service {
    GrpcCall<CreateInsightsInternalRequest, CreateInsightsInternalResponse> CreateInsightsInternal();

    GrpcCall<GetAccountStatusInternalRequest, GetAccountStatusInternalResponse> GetAccountStatusInternal();

    GrpcCall<GetInsightsInternalRequest, GetInsightsInternalResponse> GetInsightsInternal();

    GrpcCall<GetLatestInsightInternalRequest, GetLatestInsightInternalResponse> GetLatestInsightInternal();
}
