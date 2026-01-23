package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcFeedbackServiceClient.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GrpcFeedbackServiceClient;", "Lcom/robinhood/copilot/proto/v1/FeedbackServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "PostFeedback", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackRequest;", "Lcom/robinhood/copilot/proto/v1/PostFeedbackResponse;", "GetFeedback", "Lcom/robinhood/copilot/proto/v1/GetFeedbackRequest;", "Lcom/robinhood/copilot/proto/v1/GetFeedbackResponse;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcFeedbackServiceClient implements FeedbackServiceClient {
    private final GrpcClient client;

    public GrpcFeedbackServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.copilot.proto.p286v1.FeedbackServiceClient
    public GrpcCall<PostFeedbackRequest, PostFeedbackResponse> PostFeedback() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.FeedbackService/PostFeedback", PostFeedbackRequest.ADAPTER, PostFeedbackResponse.ADAPTER));
    }

    @Override // com.robinhood.copilot.proto.p286v1.FeedbackServiceClient
    public GrpcCall<GetFeedbackRequest, GetFeedbackResponse> GetFeedback() {
        return this.client.newCall(new GrpcMethod("/copilot.service.v1.FeedbackService/GetFeedback", GetFeedbackRequest.ADAPTER, GetFeedbackResponse.ADAPTER));
    }
}
