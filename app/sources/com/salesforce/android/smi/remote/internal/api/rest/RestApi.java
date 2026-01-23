package com.salesforce.android.smi.remote.internal.api.rest;

import com.robinhood.android.car.result.CarResultComposable2;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.Message;
import com.salesforce.android.smi.remote.internal.dto.request.ConversationsQuery;
import com.salesforce.android.smi.remote.internal.dto.request.CreateConversationRequest;
import com.salesforce.android.smi.remote.internal.dto.request.QueryConversationEntriesRequest;
import com.salesforce.android.smi.remote.internal.dto.request.QueryConversationsRequest;
import com.salesforce.android.smi.remote.internal.dto.request.RegisterDeviceRequest;
import com.salesforce.android.smi.remote.internal.dto.request.TypingStartedIndicatorRequest;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.DeliveryAcknowledgeEntriesRequest;
import com.salesforce.android.smi.remote.internal.dto.request.acknowledgement.ReadAcknowledgeEntriesRequest;
import com.salesforce.android.smi.remote.internal.dto.response.ConversationEntriesQueryResponse;
import com.salesforce.android.smi.remote.internal.dto.response.InternalCoreConversation;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/* compiled from: RestApi.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00162\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020#2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020)H§@¢\u0006\u0004\b*\u0010+J \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010-\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/¨\u00060"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/rest/RestApi;", "", "Lcom/salesforce/android/smi/remote/internal/dto/request/QueryConversationsRequest;", CarResultComposable2.BODY, "Lcom/salesforce/android/smi/remote/internal/dto/request/ConversationsQuery;", "queryConversations", "(Lcom/salesforce/android/smi/remote/internal/dto/request/QueryConversationsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/QueryConversationEntriesRequest;", "Ljava/util/UUID;", "conversationId", "Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntriesQueryResponse;", "queryConversationEntries", "(Lcom/salesforce/android/smi/remote/internal/dto/request/QueryConversationEntriesRequest;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/CreateConversationRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/response/InternalCoreConversation;", "createConversation", "(Lcom/salesforce/android/smi/remote/internal/dto/request/CreateConversationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "sendMessage", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/Message;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest;", "", "sendTypingStartedIndicator", "(Lcom/salesforce/android/smi/remote/internal/dto/request/TypingStartedIndicatorRequest;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "messageEntry", "Lokhttp3/MultipartBody$Part;", "file", "createFileAttachmentEntry", "(Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/DeliveryAcknowledgeEntriesRequest;", "sendDeliveryAcknowledgeEntries", "(Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/DeliveryAcknowledgeEntriesRequest;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/ReadAcknowledgeEntriesRequest;", "sendReadAcknowledgeEntries", "(Lcom/salesforce/android/smi/remote/internal/dto/request/acknowledgement/ReadAcknowledgeEntriesRequest;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterPushNotificationsRequest;", "registerDevice", "(Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterPushNotificationsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterCapabilitiesRequest;", "registerDeviceCapabilities", "(Lcom/salesforce/android/smi/remote/internal/dto/request/RegisterDeviceRequest$RegisterCapabilitiesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "fetchAttachment", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface RestApi {
    @POST("iamessage/v1/conversation")
    Object createConversation(@Body CreateConversationRequest createConversationRequest, Continuation<? super InternalCoreConversation> continuation);

    @POST("iamessage/v1/conversation/{conversationId}/file")
    @Multipart
    Object createFileAttachmentEntry(@Part("messageEntry") RequestBody requestBody, @Part MultipartBody.Part part, @Path("conversationId") UUID uuid, Continuation<? super Response<ResponseBody>> continuation);

    @Streaming
    @GET
    Object fetchAttachment(@Url String str, Continuation<? super Response<ResponseBody>> continuation);

    @POST("iamessage/v1/queries/conversation/{conversationId}/entries")
    Object queryConversationEntries(@Body QueryConversationEntriesRequest queryConversationEntriesRequest, @Path("conversationId") UUID uuid, Continuation<? super ConversationEntriesQueryResponse> continuation);

    @POST("iamessage/v1/queries/conversation/list")
    Object queryConversations(@Body QueryConversationsRequest queryConversationsRequest, Continuation<? super ConversationsQuery> continuation);

    @POST("iamessage/v1/device/registerDeviceCapabilities")
    Object registerDevice(@Body RegisterDeviceRequest.RegisterPushNotificationsRequest registerPushNotificationsRequest, Continuation<? super Unit> continuation);

    @POST("iamessage/v1/device/registerDeviceCapabilities")
    Object registerDeviceCapabilities(@Body RegisterDeviceRequest.RegisterCapabilitiesRequest registerCapabilitiesRequest, Continuation<? super Unit> continuation);

    @POST("iamessage/v1/conversation/{conversationId}/deliveryAcknowledgeEntries")
    Object sendDeliveryAcknowledgeEntries(@Body DeliveryAcknowledgeEntriesRequest deliveryAcknowledgeEntriesRequest, @Path("conversationId") UUID uuid, Continuation<? super Unit> continuation);

    @POST("iamessage/v1/conversation/{conversationId}/message")
    Object sendMessage(@Body Message message, @Path("conversationId") UUID uuid, Continuation<? super Response<ResponseBody>> continuation);

    @POST("iamessage/v1/conversation/{conversationId}/readAcknowledgeEntry")
    Object sendReadAcknowledgeEntries(@Body ReadAcknowledgeEntriesRequest readAcknowledgeEntriesRequest, @Path("conversationId") UUID uuid, Continuation<? super Unit> continuation);

    @POST("iamessage/v1/conversation/{conversationId}/entry")
    Object sendTypingStartedIndicator(@Body TypingStartedIndicatorRequest typingStartedIndicatorRequest, @Path("conversationId") UUID uuid, Continuation<? super Unit> continuation);
}
