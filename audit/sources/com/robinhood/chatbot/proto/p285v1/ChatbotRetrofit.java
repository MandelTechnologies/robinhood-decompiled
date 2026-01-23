package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.idl.common.json.ToJsonTransform;
import com.robinhood.models.card.p311db.Card;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ChatbotRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0002\u0017\u0018JX\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\rJ>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotRetrofit;", "", "GetConversationMessages", "Lretrofit2/Response;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "headers", "", "", "id", "page_offset", "", "page_size", Card.Icon.ORDER, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessage", "conversation_id", CarResultComposable2.BODY, "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;", "(Ljava/util/Map;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessageV2", "StartRealtimeConversation", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SendMessageBodyTransformer", "SendMessageV2BodyTransformer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes15.dex */
public interface ChatbotRetrofit {
    @GET("chatbot/v1/conversations/{id}/messages")
    Object GetConversationMessages(@HeaderMap Map<String, String> map, @Path("id") @IdlField(protoType = "string") String str, @IdlField(protoType = "int32") @Query("pageOffset") Integer num, @IdlField(protoType = "int32") @Query("pageSize") Integer num2, @IdlField(protoType = "string") @Query(Card.Icon.ORDER) String str2, Continuation<Response<ConversationMessagesDto>> continuation);

    @POST("chatbot/v1/conversations/{conversation_id}/messages")
    Object SendMessage(@HeaderMap Map<String, String> map, @Path("conversation_id") @IdlField(protoType = "string") String str, @ToJsonTransform(objectClass = SendMessageBodyTransformer.class) @Body SendMessageRequestDto sendMessageRequestDto, Continuation<Response<ConversationMessagesDto>> continuation);

    @POST("chatbot/v2/conversations/{conversation_id}/messages")
    Object SendMessageV2(@HeaderMap Map<String, String> map, @Path("conversation_id") @IdlField(protoType = "string") String str, @ToJsonTransform(objectClass = SendMessageV2BodyTransformer.class) @Body SendMessageRequestDto sendMessageRequestDto, Continuation<Response<ConversationMessagesDto>> continuation);

    @POST("chatbot/v1/conversations/{conversation_id}/realtime/start")
    Object StartRealtimeConversation(@HeaderMap Map<String, String> map, @Path("conversation_id") @IdlField(protoType = "string") String str, Continuation<Response<RealtimeSessionResponseDto>> continuation);

    /* compiled from: ChatbotRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotRetrofit$SendMessageBodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequest;", "<init>", "()V", "apply", "value", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SendMessageBodyTransformer implements UnaryOperator<SendMessageRequest> {
        public static final SendMessageBodyTransformer INSTANCE = new SendMessageBodyTransformer();

        private SendMessageBodyTransformer() {
        }

        @Override // java.util.function.Function
        public SendMessageRequest apply(SendMessageRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return SendMessageRequest.copy$default(value, "", null, null, null, 14, null);
        }
    }

    /* compiled from: ChatbotRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ChatbotRetrofit$SendMessageV2BodyTransformer;", "Ljava/util/function/UnaryOperator;", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequest;", "<init>", "()V", "apply", "value", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SendMessageV2BodyTransformer implements UnaryOperator<SendMessageRequest> {
        public static final SendMessageV2BodyTransformer INSTANCE = new SendMessageV2BodyTransformer();

        private SendMessageV2BodyTransformer() {
        }

        @Override // java.util.function.Function
        public SendMessageRequest apply(SendMessageRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return SendMessageRequest.copy$default(value, "", null, null, null, 14, null);
        }
    }
}
