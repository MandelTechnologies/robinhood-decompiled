package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Chatbot.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/Chatbot;", "", "GetConversationMessages", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "request", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessage", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessageV2", "StartRealtimeConversation", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface Chatbot {

    /* compiled from: Chatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.Chatbot$DefaultImpls", m3645f = "Chatbot.kt", m3646l = {18}, m3647m = "GetConversationMessages")
    /* renamed from: com.robinhood.chatbot.proto.v1.Chatbot$GetConversationMessages$1 */
    static final class C323201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323201(Continuation<? super C323201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetConversationMessages(null, null, this);
        }
    }

    /* compiled from: Chatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.Chatbot$DefaultImpls", m3645f = "Chatbot.kt", m3646l = {28}, m3647m = "SendMessage")
    /* renamed from: com.robinhood.chatbot.proto.v1.Chatbot$SendMessage$1 */
    static final class C323211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323211(Continuation<? super C323211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.SendMessage(null, null, this);
        }
    }

    /* compiled from: Chatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.Chatbot$DefaultImpls", m3645f = "Chatbot.kt", m3646l = {38}, m3647m = "SendMessageV2")
    /* renamed from: com.robinhood.chatbot.proto.v1.Chatbot$SendMessageV2$1 */
    static final class C323221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323221(Continuation<? super C323221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.SendMessageV2(null, null, this);
        }
    }

    /* compiled from: Chatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.Chatbot$DefaultImpls", m3645f = "Chatbot.kt", m3646l = {42}, m3647m = "StartRealtimeConversation")
    /* renamed from: com.robinhood.chatbot.proto.v1.Chatbot$StartRealtimeConversation$1 */
    static final class C323231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323231(Continuation<? super C323231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.StartRealtimeConversation(null, null, this);
        }
    }

    Object GetConversationMessages(GetConversationMessagesRequestDto getConversationMessagesRequestDto, Continuation<? super ConversationMessagesDto> continuation);

    Object GetConversationMessages(Request<GetConversationMessagesRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation);

    Object SendMessage(SendMessageRequestDto sendMessageRequestDto, Continuation<? super ConversationMessagesDto> continuation);

    Object SendMessage(Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation);

    Object SendMessageV2(SendMessageRequestDto sendMessageRequestDto, Continuation<? super ConversationMessagesDto> continuation);

    Object SendMessageV2(Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation);

    Object StartRealtimeConversation(StartRealtimeConversationRequestDto startRealtimeConversationRequestDto, Continuation<? super RealtimeSessionResponseDto> continuation);

    Object StartRealtimeConversation(Request<StartRealtimeConversationRequestDto> request, Continuation<? super Response<RealtimeSessionResponseDto>> continuation);

    /* compiled from: Chatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetConversationMessages(Chatbot chatbot, Request<GetConversationMessagesRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
            C323201 c323201;
            if (continuation instanceof C323201) {
                c323201 = (C323201) continuation;
                int i = c323201.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c323201.label = i - Integer.MIN_VALUE;
                } else {
                    c323201 = new C323201(continuation);
                }
            }
            Object objGetConversationMessages = c323201.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c323201.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetConversationMessages);
                GetConversationMessagesRequestDto data = request.getData();
                c323201.label = 1;
                objGetConversationMessages = chatbot.GetConversationMessages(data, c323201);
                if (objGetConversationMessages == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetConversationMessages);
            }
            return new Response(objGetConversationMessages, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object SendMessage(Chatbot chatbot, Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
            C323211 c323211;
            if (continuation instanceof C323211) {
                c323211 = (C323211) continuation;
                int i = c323211.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c323211.label = i - Integer.MIN_VALUE;
                } else {
                    c323211 = new C323211(continuation);
                }
            }
            Object objSendMessage = c323211.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c323211.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendMessage);
                SendMessageRequestDto data = request.getData();
                c323211.label = 1;
                objSendMessage = chatbot.SendMessage(data, c323211);
                if (objSendMessage == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendMessage);
            }
            return new Response(objSendMessage, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object SendMessageV2(Chatbot chatbot, Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
            C323221 c323221;
            if (continuation instanceof C323221) {
                c323221 = (C323221) continuation;
                int i = c323221.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c323221.label = i - Integer.MIN_VALUE;
                } else {
                    c323221 = new C323221(continuation);
                }
            }
            Object objSendMessageV2 = c323221.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c323221.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendMessageV2);
                SendMessageRequestDto data = request.getData();
                c323221.label = 1;
                objSendMessageV2 = chatbot.SendMessageV2(data, c323221);
                if (objSendMessageV2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendMessageV2);
            }
            return new Response(objSendMessageV2, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object StartRealtimeConversation(Chatbot chatbot, Request<StartRealtimeConversationRequestDto> request, Continuation<? super Response<RealtimeSessionResponseDto>> continuation) {
            C323231 c323231;
            if (continuation instanceof C323231) {
                c323231 = (C323231) continuation;
                int i = c323231.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c323231.label = i - Integer.MIN_VALUE;
                } else {
                    c323231 = new C323231(continuation);
                }
            }
            Object objStartRealtimeConversation = c323231.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c323231.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStartRealtimeConversation);
                StartRealtimeConversationRequestDto data = request.getData();
                c323231.label = 1;
                objStartRealtimeConversation = chatbot.StartRealtimeConversation(data, c323231);
                if (objStartRealtimeConversation == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStartRealtimeConversation);
            }
            return new Response(objStartRealtimeConversation, null, 2, null);
        }
    }
}
