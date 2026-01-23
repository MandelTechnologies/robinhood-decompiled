package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestChatbot.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RestChatbot;", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "retrofit", "Lcom/robinhood/chatbot/proto/v1/ChatbotRetrofit;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/ChatbotRetrofit;)V", "GetConversationMessages", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "request", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessage", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessageV2", "StartRealtimeConversation", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequestDto;", "(Lcom/robinhood/chatbot/proto/v1/StartRealtimeConversationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RestChatbot implements Chatbot {
    private final ChatbotRetrofit retrofit;

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {17}, m3647m = "GetConversationMessages")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$GetConversationMessages$1 */
    static final class C323921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323921(Continuation<? super C323921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.GetConversationMessages((GetConversationMessagesRequestDto) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {20}, m3647m = "GetConversationMessages")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$GetConversationMessages$2 */
    static final class C323932 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323932(Continuation<? super C323932> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.GetConversationMessages((Request<GetConversationMessagesRequestDto>) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {33}, m3647m = "SendMessage")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$SendMessage$1 */
    static final class C323941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323941(Continuation<? super C323941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.SendMessage((SendMessageRequestDto) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {39}, m3647m = "SendMessage")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$SendMessage$2 */
    static final class C323952 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323952(Continuation<? super C323952> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.SendMessage((Request<SendMessageRequestDto>) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {50}, m3647m = "SendMessageV2")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$SendMessageV2$1 */
    static final class C323961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323961(Continuation<? super C323961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.SendMessageV2((SendMessageRequestDto) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {56}, m3647m = "SendMessageV2")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$SendMessageV2$2 */
    static final class C323972 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323972(Continuation<? super C323972> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.SendMessageV2((Request<SendMessageRequestDto>) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {64}, m3647m = "StartRealtimeConversation")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$StartRealtimeConversation$1 */
    static final class C323981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323981(Continuation<? super C323981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.StartRealtimeConversation((StartRealtimeConversationRequestDto) null, this);
        }
    }

    /* compiled from: RestChatbot.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.chatbot.proto.v1.RestChatbot", m3645f = "RestChatbot.kt", m3646l = {67}, m3647m = "StartRealtimeConversation")
    /* renamed from: com.robinhood.chatbot.proto.v1.RestChatbot$StartRealtimeConversation$2 */
    static final class C323992 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C323992(Continuation<? super C323992> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestChatbot.this.StartRealtimeConversation((Request<StartRealtimeConversationRequestDto>) null, this);
        }
    }

    public RestChatbot(ChatbotRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetConversationMessages(GetConversationMessagesRequestDto getConversationMessagesRequestDto, Continuation<? super ConversationMessagesDto> continuation) {
        C323921 c323921;
        if (continuation instanceof C323921) {
            c323921 = (C323921) continuation;
            int i = c323921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323921.label = i - Integer.MIN_VALUE;
            } else {
                c323921 = new C323921(continuation);
            }
        }
        Object objGetConversationMessages = c323921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetConversationMessages);
            Request<GetConversationMessagesRequestDto> request = new Request<>(getConversationMessagesRequestDto, null, 2, null);
            c323921.label = 1;
            objGetConversationMessages = GetConversationMessages(request, c323921);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetConversationMessages(Request<GetConversationMessagesRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        C323932 c323932;
        if (continuation instanceof C323932) {
            c323932 = (C323932) continuation;
            int i = c323932.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323932.label = i - Integer.MIN_VALUE;
            } else {
                c323932 = new C323932(continuation);
            }
        }
        C323932 c3239322 = c323932;
        Object objGetConversationMessages = c3239322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3239322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetConversationMessages);
            ChatbotRetrofit chatbotRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            Integer numBoxInt = request.getData().getPage_offset() != 0 ? boxing.boxInt(request.getData().getPage_offset()) : null;
            Integer numBoxInt2 = request.getData().getPage_size() != 0 ? boxing.boxInt(request.getData().getPage_size()) : null;
            String order = Intrinsics.areEqual(request.getData().getOrder(), "") ? null : request.getData().getOrder();
            c3239322.label = 1;
            objGetConversationMessages = chatbotRetrofit.GetConversationMessages(metadata, id, numBoxInt, numBoxInt2, order, c3239322);
            if (objGetConversationMessages == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetConversationMessages);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetConversationMessages);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendMessage(SendMessageRequestDto sendMessageRequestDto, Continuation<? super ConversationMessagesDto> continuation) {
        C323941 c323941;
        if (continuation instanceof C323941) {
            c323941 = (C323941) continuation;
            int i = c323941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323941.label = i - Integer.MIN_VALUE;
            } else {
                c323941 = new C323941(continuation);
            }
        }
        Object objSendMessage = c323941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessage);
            Request<SendMessageRequestDto> request = new Request<>(sendMessageRequestDto, null, 2, null);
            c323941.label = 1;
            objSendMessage = SendMessage(request, c323941);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendMessage(Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        C323952 c323952;
        if (continuation instanceof C323952) {
            c323952 = (C323952) continuation;
            int i = c323952.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323952.label = i - Integer.MIN_VALUE;
            } else {
                c323952 = new C323952(continuation);
            }
        }
        Object objSendMessage = c323952.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323952.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessage);
            ChatbotRetrofit chatbotRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String conversation_id = request.getData().getConversation_id();
            SendMessageRequestDto data = request.getData();
            c323952.label = 1;
            objSendMessage = chatbotRetrofit.SendMessage(metadata, conversation_id, data, c323952);
            if (objSendMessage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendMessage);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSendMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendMessageV2(SendMessageRequestDto sendMessageRequestDto, Continuation<? super ConversationMessagesDto> continuation) {
        C323961 c323961;
        if (continuation instanceof C323961) {
            c323961 = (C323961) continuation;
            int i = c323961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323961.label = i - Integer.MIN_VALUE;
            } else {
                c323961 = new C323961(continuation);
            }
        }
        Object objSendMessageV2 = c323961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessageV2);
            Request<SendMessageRequestDto> request = new Request<>(sendMessageRequestDto, null, 2, null);
            c323961.label = 1;
            objSendMessageV2 = SendMessageV2(request, c323961);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SendMessageV2(Request<SendMessageRequestDto> request, Continuation<? super Response<ConversationMessagesDto>> continuation) {
        C323972 c323972;
        if (continuation instanceof C323972) {
            c323972 = (C323972) continuation;
            int i = c323972.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323972.label = i - Integer.MIN_VALUE;
            } else {
                c323972 = new C323972(continuation);
            }
        }
        Object objSendMessageV2 = c323972.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323972.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendMessageV2);
            ChatbotRetrofit chatbotRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String conversation_id = request.getData().getConversation_id();
            SendMessageRequestDto data = request.getData();
            c323972.label = 1;
            objSendMessageV2 = chatbotRetrofit.SendMessageV2(metadata, conversation_id, data, c323972);
            if (objSendMessageV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendMessageV2);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSendMessageV2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object StartRealtimeConversation(StartRealtimeConversationRequestDto startRealtimeConversationRequestDto, Continuation<? super RealtimeSessionResponseDto> continuation) {
        C323981 c323981;
        if (continuation instanceof C323981) {
            c323981 = (C323981) continuation;
            int i = c323981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323981.label = i - Integer.MIN_VALUE;
            } else {
                c323981 = new C323981(continuation);
            }
        }
        Object objStartRealtimeConversation = c323981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartRealtimeConversation);
            Request<StartRealtimeConversationRequestDto> request = new Request<>(startRealtimeConversationRequestDto, null, 2, null);
            c323981.label = 1;
            objStartRealtimeConversation = StartRealtimeConversation(request, c323981);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.chatbot.proto.p285v1.Chatbot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object StartRealtimeConversation(Request<StartRealtimeConversationRequestDto> request, Continuation<? super Response<RealtimeSessionResponseDto>> continuation) {
        C323992 c323992;
        if (continuation instanceof C323992) {
            c323992 = (C323992) continuation;
            int i = c323992.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c323992.label = i - Integer.MIN_VALUE;
            } else {
                c323992 = new C323992(continuation);
            }
        }
        Object objStartRealtimeConversation = c323992.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c323992.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStartRealtimeConversation);
            ChatbotRetrofit chatbotRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String conversation_id = request.getData().getConversation_id();
            c323992.label = 1;
            objStartRealtimeConversation = chatbotRetrofit.StartRealtimeConversation(metadata, conversation_id, c323992);
            if (objStartRealtimeConversation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objStartRealtimeConversation);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objStartRealtimeConversation);
    }
}
