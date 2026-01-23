package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcChatbot.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GrpcChatbot;", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "grpcClient", "Lcom/robinhood/chatbot/proto/v1/ChatbotClient;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ChatbotClient;)V", "GetConversationMessages", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "request", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessage", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessageV2", "StartRealtimeConversation", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcChatbot implements Chatbot {
    private final ChatbotClient grpcClient;

    /* compiled from: GrpcChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.GrpcChatbot", m3645f = "GrpcChatbot.kt", m3646l = {17}, m3647m = "GetConversationMessages")
    /* renamed from: com.robinhood.chatbot.proto.v1.GrpcChatbot$GetConversationMessages$1 */
    static final class C323611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323611(Continuation<? super C323611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcChatbot.this.GetConversationMessages((GetConversationMessagesRequestDto) null, this);
        }
    }

    /* compiled from: GrpcChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.GrpcChatbot", m3645f = "GrpcChatbot.kt", m3646l = {24}, m3647m = "SendMessage")
    /* renamed from: com.robinhood.chatbot.proto.v1.GrpcChatbot$SendMessage$1 */
    static final class C323621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323621(Continuation<? super C323621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcChatbot.this.SendMessage((SendMessageRequestDto) null, this);
        }
    }

    /* compiled from: GrpcChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.GrpcChatbot", m3645f = "GrpcChatbot.kt", m3646l = {34}, m3647m = "SendMessageV2")
    /* renamed from: com.robinhood.chatbot.proto.v1.GrpcChatbot$SendMessageV2$1 */
    static final class C323631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323631(Continuation<? super C323631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcChatbot.this.SendMessageV2((SendMessageRequestDto) null, this);
        }
    }

    /* compiled from: GrpcChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.GrpcChatbot", m3645f = "GrpcChatbot.kt", m3646l = {41}, m3647m = "StartRealtimeConversation")
    /* renamed from: com.robinhood.chatbot.proto.v1.GrpcChatbot$StartRealtimeConversation$1 */
    static final class C323641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323641(Continuation<? super C323641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcChatbot.this.StartRealtimeConversation((StartRealtimeConversationRequestDto) null, this);
        }
    }

    public GrpcChatbot(ChatbotClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetConversationMessages(GetConversationMessagesRequestDto getConversationMessagesRequestDto, Continuation<? super ConversationMessagesDto> continuation) {
        C323611 c323611;
        if (continuation instanceof C323611) {
            c323611 = (C323611) continuation;
            int i = c323611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323611.label = i - Integer.MIN_VALUE;
            } else {
                c323611 = new C323611(continuation);
            }
        }
        Object objGetConversationMessages = c323611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetConversationMessages);
            Request<GetConversationMessagesRequestDto> request = new Request<>(getConversationMessagesRequestDto, null, 2, null);
            c323611.label = 1;
            objGetConversationMessages = GetConversationMessages(request, c323611);
            if (objGetConversationMessages == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetConversationMessages);
        }
        return ((Response) objGetConversationMessages).getData();
    }

    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    public Object GetConversationMessages(Request<GetConversationMessagesRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        return Response2.handleGrpcCall(request, ConversationMessagesDto.INSTANCE, this.grpcClient.GetConversationMessages(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendMessage(SendMessageRequestDto sendMessageRequestDto, Continuation<? super ConversationMessagesDto> continuation) {
        C323621 c323621;
        if (continuation instanceof C323621) {
            c323621 = (C323621) continuation;
            int i = c323621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323621.label = i - Integer.MIN_VALUE;
            } else {
                c323621 = new C323621(continuation);
            }
        }
        Object objSendMessage = c323621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessage);
            Request<SendMessageRequestDto> request = new Request<>(sendMessageRequestDto, null, 2, null);
            c323621.label = 1;
            objSendMessage = SendMessage(request, c323621);
            if (objSendMessage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendMessage);
        }
        return ((Response) objSendMessage).getData();
    }

    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    public Object SendMessage(Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        return Response2.handleGrpcCall(request, ConversationMessagesDto.INSTANCE, this.grpcClient.SendMessage(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendMessageV2(SendMessageRequestDto sendMessageRequestDto, Continuation<? super ConversationMessagesDto> continuation) {
        C323631 c323631;
        if (continuation instanceof C323631) {
            c323631 = (C323631) continuation;
            int i = c323631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323631.label = i - Integer.MIN_VALUE;
            } else {
                c323631 = new C323631(continuation);
            }
        }
        Object objSendMessageV2 = c323631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessageV2);
            Request<SendMessageRequestDto> request = new Request<>(sendMessageRequestDto, null, 2, null);
            c323631.label = 1;
            objSendMessageV2 = SendMessageV2(request, c323631);
            if (objSendMessageV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendMessageV2);
        }
        return ((Response) objSendMessageV2).getData();
    }

    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    public Object SendMessageV2(Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        return Response2.handleGrpcCall(request, ConversationMessagesDto.INSTANCE, this.grpcClient.SendMessageV2(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object StartRealtimeConversation(StartRealtimeConversationRequestDto startRealtimeConversationRequestDto, Continuation<? super RealtimeSessionResponseDto> continuation) {
        C323641 c323641;
        if (continuation instanceof C323641) {
            c323641 = (C323641) continuation;
            int i = c323641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323641.label = i - Integer.MIN_VALUE;
            } else {
                c323641 = new C323641(continuation);
            }
        }
        Object objStartRealtimeConversation = c323641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartRealtimeConversation);
            Request<StartRealtimeConversationRequestDto> request = new Request<>(startRealtimeConversationRequestDto, null, 2, null);
            c323641.label = 1;
            objStartRealtimeConversation = StartRealtimeConversation(request, c323641);
            if (objStartRealtimeConversation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objStartRealtimeConversation);
        }
        return ((Response) objStartRealtimeConversation).getData();
    }

    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    public Object StartRealtimeConversation(Request<StartRealtimeConversationRequestDto> request, Continuation<? super Response<RealtimeSessionResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, RealtimeSessionResponseDto.INSTANCE, this.grpcClient.StartRealtimeConversation(), continuation);
    }
}
