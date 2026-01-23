package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: ChatbotInternalClient.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0003H&J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0003H&J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0003H&J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0003H&J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0003H&J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0003H&J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0003H&¨\u0006 "}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotInternalClient;", "Lcom/squareup/wire/Service;", "CreateConversation", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/chatbot/proto/v1/CreateConversationRequest;", "Lcom/robinhood/chatbot/proto/v1/Conversation;", "EndConversation", "Lcom/robinhood/chatbot/proto/v1/EndConversationRequest;", "GenerateSuggestedResponse", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequest;", "Lcom/robinhood/chatbot/proto/v1/NostraSuggestedResponse;", "GetAccountSignals", "Lcom/robinhood/chatbot/proto/v1/GetACRequest;", "Lcom/robinhood/chatbot/proto/v1/GetACResponse;", "GetConversationMessages", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequest;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessages;", "GetSelfServeFlow", "Lcom/robinhood/chatbot/proto/v1/GetSSFRequest;", "Lcom/robinhood/chatbot/proto/v1/GetSSFResponse;", "GetConversationTranscript", "Lcom/robinhood/chatbot/proto/v1/GetConversationTranscriptRequest;", "Lcom/robinhood/chatbot/proto/v1/ConversationTranscript;", "CreateSimpleCashAdjustmentEvent", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequest;", "Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventResponse;", "GetClearingGatewayEvents", "Lcom/robinhood/chatbot/proto/v1/GetClearingGatewayEventsRequest;", "Lcom/robinhood/chatbot/proto/v1/GetClearingGatewayEventsResponse;", "TriggerStateExecution", "Lcom/robinhood/chatbot/proto/v1/TriggerStateExecutionRequest;", "Lcom/robinhood/chatbot/proto/v1/TriggerStateExecutionResponse;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface ChatbotInternalClient extends Service {
    GrpcCall<CreateConversationRequest, Conversation> CreateConversation();

    GrpcCall<CreateSimpleCashAdjustmentEventRequest, CreateSimpleCashAdjustmentEventResponse> CreateSimpleCashAdjustmentEvent();

    GrpcCall<EndConversationRequest, Conversation> EndConversation();

    GrpcCall<GenerateSRRequest, NostraSuggestedResponse> GenerateSuggestedResponse();

    GrpcCall<GetACRequest, GetACResponse> GetAccountSignals();

    GrpcCall<GetClearingGatewayEventsRequest, GetClearingGatewayEventsResponse> GetClearingGatewayEvents();

    GrpcCall<GetConversationMessagesRequest, ConversationMessages> GetConversationMessages();

    GrpcCall<GetConversationTranscriptRequest, ConversationTranscript> GetConversationTranscript();

    GrpcCall<GetSSFRequest, GetSSFResponse> GetSelfServeFlow();

    GrpcCall<TriggerStateExecutionRequest, TriggerStateExecutionResponse> TriggerStateExecution();
}
