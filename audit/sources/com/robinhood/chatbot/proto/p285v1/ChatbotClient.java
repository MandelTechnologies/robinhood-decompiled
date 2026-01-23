package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: ChatbotClient.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotClient;", "Lcom/squareup/wire/Service;", "GetConversationMessages", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequest;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessages;", "SendMessage", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequest;", "SendMessageV2", "StartRealtimeConversation", "Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequest;", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponse;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface ChatbotClient extends Service {
    GrpcCall<GetConversationMessagesRequest, ConversationMessages> GetConversationMessages();

    GrpcCall<SendMessageRequest, ConversationMessages> SendMessage();

    GrpcCall<SendMessageRequest, ConversationMessages> SendMessageV2();

    GrpcCall<StartRealtimeConversationRequest, RealtimeSessionResponse> StartRealtimeConversation();
}
