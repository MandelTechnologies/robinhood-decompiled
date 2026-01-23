package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcSuggestedResponseServiceClient.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GrpcSuggestedResponseServiceClient;", "Lcom/robinhood/chatbot/proto/v1/SuggestedResponseServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "GenerateSuggestedResponse", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "GetSuggestedResponse", "Lcom/robinhood/chatbot/proto/v1/GetSRRequest;", "GetAccountSignals", "Lcom/robinhood/chatbot/proto/v1/GetACRequest;", "Lcom/robinhood/chatbot/proto/v1/GetACResponse;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcSuggestedResponseServiceClient implements SuggestedResponseServiceClient {
    private final GrpcClient client;

    public GrpcSuggestedResponseServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.chatbot.proto.p285v1.SuggestedResponseServiceClient
    public GrpcCall<GenerateSRRequest, NostraSuggestedResponse> GenerateSuggestedResponse() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.SuggestedResponseService/GenerateSuggestedResponse", GenerateSRRequest.ADAPTER, NostraSuggestedResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.SuggestedResponseServiceClient
    public GrpcCall<GetSRRequest, NostraSuggestedResponse> GetSuggestedResponse() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.SuggestedResponseService/GetSuggestedResponse", GetSRRequest.ADAPTER, NostraSuggestedResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.SuggestedResponseServiceClient
    public GrpcCall<GetACRequest, GetACResponse> GetAccountSignals() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.SuggestedResponseService/GetAccountSignals", GetACRequest.ADAPTER, GetACResponse.ADAPTER));
    }
}
