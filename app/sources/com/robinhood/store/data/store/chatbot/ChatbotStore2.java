package com.robinhood.store.data.store.chatbot;

import com.plaid.internal.EnumC7081g;
import com.robinhood.chatbot.proto.p285v1.Chatbot;
import com.robinhood.chatbot.proto.p285v1.ConversationMessagesDto;
import com.robinhood.chatbot.proto.p285v1.GetConversationMessagesRequestDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ChatbotStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "request", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$getMessagesEndpoint$1", m3645f = "ChatbotStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$getMessagesEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ChatbotStore2 extends ContinuationImpl7 implements Function2<Request<? extends GetConversationMessagesRequestDto>, Continuation<? super Response<? extends ConversationMessagesDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatbotStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatbotStore2(ChatbotStore chatbotStore, Continuation<? super ChatbotStore2> continuation) {
        super(2, continuation);
        this.this$0 = chatbotStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatbotStore2 chatbotStore2 = new ChatbotStore2(this.this$0, continuation);
        chatbotStore2.L$0 = obj;
        return chatbotStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Request<GetConversationMessagesRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        return ((ChatbotStore2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Request<? extends GetConversationMessagesRequestDto> request, Continuation<? super Response<? extends ConversationMessagesDto>> continuation) {
        return invoke2((Request<GetConversationMessagesRequestDto>) request, (Continuation<? super Response<ConversationMessagesDto>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Request<GetConversationMessagesRequestDto> request = (Request) this.L$0;
        Chatbot chatbot = this.this$0.chatbotApi;
        this.label = 1;
        Object objGetConversationMessages = chatbot.GetConversationMessages(request, this);
        return objGetConversationMessages == coroutine_suspended ? coroutine_suspended : objGetConversationMessages;
    }
}
