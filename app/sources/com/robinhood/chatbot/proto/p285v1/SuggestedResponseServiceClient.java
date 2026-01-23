package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: SuggestedResponseServiceClient.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseServiceClient;", "Lcom/squareup/wire/Service;", "GenerateSuggestedResponse", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "GetSuggestedResponse", "Lcom/robinhood/chatbot/proto/v1/GetSRRequest;", "GetAccountSignals", "Lcom/robinhood/chatbot/proto/v1/GetACRequest;", "Lcom/robinhood/chatbot/proto/v1/GetACResponse;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface SuggestedResponseServiceClient extends Service {
    GrpcCall<GenerateSRRequest, NostraSuggestedResponse> GenerateSuggestedResponse();

    GrpcCall<GetACRequest, GetACResponse> GetAccountSignals();

    GrpcCall<GetSRRequest, NostraSuggestedResponse> GetSuggestedResponse();
}
