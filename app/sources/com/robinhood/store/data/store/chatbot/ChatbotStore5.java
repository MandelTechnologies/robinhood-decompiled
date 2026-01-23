package com.robinhood.store.data.store.chatbot;

import com.robinhood.chatbot.proto.p285v1.ConversationMessagesDto;
import com.robinhood.chatbot.proto.p285v1.SendMessageRequestDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.p355ui.p356v2.ChatbotMessagePage2;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ChatbotStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$sendUserMessageEndpoint$2", m3645f = "ChatbotStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$sendUserMessageEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class ChatbotStore5 extends ContinuationImpl7 implements Function3<Request<? extends SendMessageRequestDto>, Response<? extends ConversationMessagesDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChatbotStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatbotStore5(ChatbotStore chatbotStore, Continuation<? super ChatbotStore5> continuation) {
        super(3, continuation);
        this.this$0 = chatbotStore;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Request<SendMessageRequestDto> request, Response<ConversationMessagesDto> response, Continuation<? super Unit> continuation) {
        ChatbotStore5 chatbotStore5 = new ChatbotStore5(this.this$0, continuation);
        chatbotStore5.L$0 = request;
        chatbotStore5.L$1 = response;
        return chatbotStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Request<? extends SendMessageRequestDto> request, Response<? extends ConversationMessagesDto> response, Continuation<? super Unit> continuation) {
        return invoke2((Request<SendMessageRequestDto>) request, (Response<ConversationMessagesDto>) response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Request request = (Request) this.L$0;
        Response response = (Response) this.L$1;
        SendMessageRequestDto sendMessageRequestDto = (SendMessageRequestDto) request.getData();
        this.this$0.applySessionMutation(StringsKt.toUuid(sendMessageRequestDto.getConversation_id()), ChatbotMessagePage2.toUiModel((ConversationMessagesDto) response.getData()), this.this$0.getPollingIntervalMs(response), false);
        return Unit.INSTANCE;
    }
}
