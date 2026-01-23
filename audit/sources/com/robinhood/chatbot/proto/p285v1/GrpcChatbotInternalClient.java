package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcChatbotInternalClient.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0007H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0007H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0007H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0007H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0007H\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u0007H\u0016J\u0014\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GrpcChatbotInternalClient;", "Lcom/robinhood/chatbot/proto/v1/ChatbotInternalClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "CreateConversation", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequest;", "Lcom/robinhood/chatbot/proto/v1/Conversation;", "EndConversation", "Lcom/robinhood/chatbot/proto/v1/EndConversationRequest;", "GenerateSuggestedResponse", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "GetAccountSignals", "Lcom/robinhood/chatbot/proto/v1/GetACRequest;", "Lcom/robinhood/chatbot/proto/v1/GetACResponse;", "GetConversationMessages", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequest;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessages;", "GetSelfServeFlow", "Lcom/robinhood/chatbot/proto/v1/GetSSFRequest;", "Lcom/robinhood/chatbot/proto/v1/GetSSFResponse;", "GetConversationTranscript", "Lcom/robinhood/chatbot/proto/v1/GetConversationTranscriptRequest;", "Lcom/robinhood/chatbot/proto/v1/ConversationTranscript;", "CreateSimpleCashAdjustmentEvent", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequest;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventResponse;", "GetClearingGatewayEvents", "Lcom/robinhood/chatbot/proto/v1/GetClearingGatewayEventsRequest;", "Lcom/robinhood/chatbot/proto/v1/GetClearingGatewayEventsResponse;", "TriggerStateExecution", "Lcom/robinhood/chatbot/proto/v1/TriggerStateExecutionRequest;", "Lcom/robinhood/chatbot/proto/v1/TriggerStateExecutionResponse;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcChatbotInternalClient implements ChatbotInternalClient {
    private final GrpcClient client;

    public GrpcChatbotInternalClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<CreateConversationRequest, Conversation> CreateConversation() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/CreateConversation", CreateConversationRequest.ADAPTER, Conversation.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<EndConversationRequest, Conversation> EndConversation() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/EndConversation", EndConversationRequest.ADAPTER, Conversation.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<GenerateSRRequest, NostraSuggestedResponse> GenerateSuggestedResponse() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/GenerateSuggestedResponse", GenerateSRRequest.ADAPTER, NostraSuggestedResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<GetACRequest, GetACResponse> GetAccountSignals() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/GetAccountSignals", GetACRequest.ADAPTER, GetACResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<GetConversationMessagesRequest, ConversationMessages> GetConversationMessages() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/GetConversationMessages", GetConversationMessagesRequest.ADAPTER, ConversationMessages.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<GetSSFRequest, GetSSFResponse> GetSelfServeFlow() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/GetSelfServeFlow", GetSSFRequest.ADAPTER, GetSSFResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<GetConversationTranscriptRequest, ConversationTranscript> GetConversationTranscript() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/GetConversationTranscript", GetConversationTranscriptRequest.ADAPTER, ConversationTranscript.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<CreateSimpleCashAdjustmentEventRequest, CreateSimpleCashAdjustmentEventResponse> CreateSimpleCashAdjustmentEvent() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/CreateSimpleCashAdjustmentEvent", CreateSimpleCashAdjustmentEventRequest.ADAPTER, CreateSimpleCashAdjustmentEventResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<GetClearingGatewayEventsRequest, GetClearingGatewayEventsResponse> GetClearingGatewayEvents() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/GetClearingGatewayEvents", GetClearingGatewayEventsRequest.ADAPTER, GetClearingGatewayEventsResponse.ADAPTER));
    }

    @Override // com.robinhood.chatbot.proto.p285v1.ChatbotInternalClient
    public GrpcCall<TriggerStateExecutionRequest, TriggerStateExecutionResponse> TriggerStateExecution() {
        return this.client.newCall(new GrpcMethod("/chatbot.service.ChatbotInternal/TriggerStateExecution", TriggerStateExecutionRequest.ADAPTER, TriggerStateExecutionResponse.ADAPTER));
    }
}
