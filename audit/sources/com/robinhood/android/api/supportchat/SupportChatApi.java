package com.robinhood.android.api.supportchat;

import android.annotation.SuppressLint;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChat;
import com.robinhood.models.api.pathfinder.messaging.ApiSupportChatList;
import com.robinhood.models.api.pathfinder.messaging.CreateSupportChatRequest;
import com.robinhood.models.api.pathfinder.messaging.SupportChatUpdateRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: SupportChatApi.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH§@¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SupportChatApi;", "", "createSupportChat", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChat;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CarResultComposable2.BODY, "Lcom/robinhood/models/api/pathfinder/messaging/CreateSupportChatRequest;", "(Lcom/robinhood/models/api/pathfinder/messaging/CreateSupportChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSupportChats", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pathfinder/messaging/ApiSupportChatList;", "getSupportChat", "inquiryId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSupportChat", "request", "Lcom/robinhood/models/api/pathfinder/messaging/SupportChatUpdateRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/messaging/SupportChatUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"NoNewRetrofitEndpoints"})
/* loaded from: classes7.dex */
public interface SupportChatApi {
    @POST("support_chats/")
    Object createSupportChat(@Body CreateSupportChatRequest createSupportChatRequest, Continuation<? super ApiSupportChat> continuation);

    @POST("support_chats/")
    Object createSupportChat(Continuation<? super ApiSupportChat> continuation);

    @GET("support_chats/{inquiry_id}/")
    Object getSupportChat(@Path("inquiry_id") UUID uuid, Continuation<? super Response<ApiSupportChat>> continuation);

    @GET("support_chats/")
    Object getSupportChats(Continuation<? super Response<ApiSupportChatList>> continuation);

    @POST("support_chats/{inquiry_id}/")
    Object updateSupportChat(@Path("inquiry_id") UUID uuid, @Body SupportChatUpdateRequest supportChatUpdateRequest, Continuation<? super Response<ApiSupportChat>> continuation);
}
