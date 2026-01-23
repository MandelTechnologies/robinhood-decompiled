package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: InsightServiceClient.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightServiceClient;", "Lcom/squareup/wire/Service;", "GetInsights", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/GetInsightsRequest;", "Lcom/robinhood/copilot/proto/v1/GetInsightsResponse;", "CreateInsights", "Lcom/robinhood/copilot/proto/v1/CreateInsightsRequest;", "Lcom/robinhood/copilot/proto/v1/CreateInsightsResponse;", "GetLatestInsight", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightRequest;", "Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface InsightServiceClient extends Service {
    GrpcCall<CreateInsightsRequest, CreateInsightsResponse> CreateInsights();

    GrpcCall<GetInsightsRequest, GetInsightsResponse> GetInsights();

    GrpcCall<GetLatestInsightRequest, GetLatestInsightResponse> GetLatestInsight();
}
