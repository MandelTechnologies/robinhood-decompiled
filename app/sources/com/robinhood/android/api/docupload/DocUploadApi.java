package com.robinhood.android.api.docupload;

import android.annotation.SuppressLint;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.identi.ApiCreatePersonaInquiryRequest;
import com.robinhood.models.api.identi.ApiCreatePersonaInquiryResponse;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiGenericDocument;
import com.robinhood.models.api.identi.ApiPersonaDocumentUploadedRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieCaptureFailedRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieThresholds;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadResponse;
import com.robinhood.models.api.identi.ApiVideoSelfieVerificationResponse;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationConstants;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: DocUploadApi.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00062\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018H§@¢\u0006\u0002\u0010\u0019Jt\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u001b2\b\b\u0001\u0010\u0016\u001a\u00020\u001b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0002\u0010#Jd\u0010$\u001a\u00020%2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010\u0016\u001a\u00020\u001b2\b\b\u0001\u0010(\u001a\u00020\u001b2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010*\u001a\u00020\u001f2\b\b\u0001\u0010+\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u001fH§@¢\u0006\u0002\u0010-JL\u0010.\u001a\u00020/2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0001\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f032\b\b\u0001\u00104\u001a\u00020\u001f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010'H§@¢\u0006\u0002\u00105J\u0018\u00106\u001a\u0002072\b\b\u0003\u00108\u001a\u00020'H§@¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020;2\b\b\u0001\u0010\u0011\u001a\u00020<H§@¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u00020?2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\"\u0010@\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020AH§@¢\u0006\u0002\u0010B¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/api/docupload/DocUploadApi;", "", "getDocumentRequests", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/identi/ApiDocumentRequest;", "type", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "state", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocumentRequest", "documentRequestId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patchDocumentRequest", "", "notifyPersonaDocumentUploaded", "request", "Lcom/robinhood/models/api/identi/ApiPersonaDocumentUploadedRequest;", "(Lcom/robinhood/models/api/identi/ApiPersonaDocumentUploadedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocumentSides", "Lcom/robinhood/models/api/IdDocument$SidesResponse;", "documentType", "photoIdType", "Lcom/robinhood/models/api/IdDocument$Type;", "(Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/models/api/IdDocument$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDocument", "Lokhttp3/RequestBody;", PlaceTypes.COUNTRY, CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "front", "Lokhttp3/MultipartBody$Part;", TestTags.BACK, "selfie", "selectedType", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadVideoSelfie", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadResponse;", "nonce", "", "setBaseline", "video", "center", "timeseries", "additionalInfo", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadGenericFile", "Lcom/robinhood/models/api/identi/ApiGenericDocument;", "referenceInstanceId", "referenceInstance", "thumbnailSizes", "", WebsocketGatewayConstants.DATA_KEY, "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Ljava/util/List;Lokhttp3/MultipartBody$Part;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoSelfieThresholds", "Lcom/robinhood/models/api/identi/ApiVideoSelfieThresholds;", "platform", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPersonaInquiry", "Lcom/robinhood/models/api/identi/ApiCreatePersonaInquiryResponse;", "Lcom/robinhood/models/api/identi/ApiCreatePersonaInquiryRequest;", "(Lcom/robinhood/models/api/identi/ApiCreatePersonaInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoSelfieVerification", "Lcom/robinhood/models/api/identi/ApiVideoSelfieVerificationResponse;", "reportVideoSelfieCaptureFailed", "Lcom/robinhood/models/api/identi/ApiVideoSelfieCaptureFailedRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/identi/ApiVideoSelfieCaptureFailedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"NoNewRetrofitEndpoints"})
/* loaded from: classes7.dex */
public interface DocUploadApi {
    @POST("system_check/persona/create_inquiry/")
    Object createPersonaInquiry(@Body ApiCreatePersonaInquiryRequest apiCreatePersonaInquiryRequest, Continuation<? super ApiCreatePersonaInquiryResponse> continuation);

    @GET("document/document_requests/{id}/")
    Object getDocumentRequest(@Path("id") UUID uuid, Continuation<? super ApiDocumentRequest> continuation);

    @GET("document/document_requests/")
    Object getDocumentRequests(@Query("type") ApiDocumentRequest.Type type2, @Query("state") ApiDocumentRequest.State state, Continuation<? super PaginatedResult<ApiDocumentRequest>> continuation);

    @GET("document/sides/")
    Object getDocumentSides(@Query("document_type") ApiDocumentRequest.Type type2, @Query("photo_id_type") IdDocument.Type type3, Continuation<? super IdDocument.SidesResponse> continuation);

    @GET("document/video_selfie_thresholds/")
    Object getVideoSelfieThresholds(@Query("platform") String str, Continuation<? super ApiVideoSelfieThresholds> continuation);

    @GET("document/{id}/")
    Object getVideoSelfieVerification(@Path("id") UUID uuid, Continuation<? super ApiVideoSelfieVerificationResponse> continuation);

    @POST("document/document_requests/uploaded/")
    Object notifyPersonaDocumentUploaded(@Body ApiPersonaDocumentUploadedRequest apiPersonaDocumentUploadedRequest, Continuation<? super Unit> continuation);

    @PATCH("document/document_requests/{id}/")
    Object patchDocumentRequest(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @PATCH("document/document_requests/{id}/")
    Object reportVideoSelfieCaptureFailed(@Path("id") UUID uuid, @Body ApiVideoSelfieCaptureFailedRequest apiVideoSelfieCaptureFailedRequest, Continuation<? super Unit> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 30", "X-Write-Timeout-Seconds-Override: 30"})
    @POST("document/upload/")
    @Multipart
    Object uploadDocument(@Part("document_request_id") RequestBody requestBody, @Part("document_type") RequestBody requestBody2, @Part("photo_id_type") RequestBody requestBody3, @Part(PlaceTypes.COUNTRY) RequestBody requestBody4, @Part("device_id") RequestBody requestBody5, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, @Part MultipartBody.Part part3, @Part MultipartBody.Part part4, Continuation<? super Unit> continuation);

    @POST("document/upload_generic_file/")
    @Multipart
    Object uploadGenericFile(@Part("reference_instance_id") RequestBody requestBody, @Part("reference_instance") RequestBody requestBody2, @Part List<MultipartBody.Part> list, @Part MultipartBody.Part part, @Part("device_id") String str, Continuation<? super ApiGenericDocument> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 30", "X-Write-Timeout-Seconds-Override: 30"})
    @POST("document/upload/")
    @Multipart
    Object uploadVideoSelfie(@Header(DeviceAttestationConstants.HEADER_DEVICE_ATTESTATION_NONCE) String str, @Part("document_request_id") RequestBody requestBody, @Part("document_type") RequestBody requestBody2, @Part("set_baseline") RequestBody requestBody3, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, @Part MultipartBody.Part part3, @Part MultipartBody.Part part4, Continuation<? super ApiVideoSelfieUploadResponse> continuation);

    /* compiled from: DocUploadApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getDocumentRequests$default(DocUploadApi docUploadApi, ApiDocumentRequest.Type type2, ApiDocumentRequest.State state, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDocumentRequests");
            }
            if ((i & 1) != 0) {
                type2 = null;
            }
            if ((i & 2) != 0) {
                state = null;
            }
            return docUploadApi.getDocumentRequests(type2, state, continuation);
        }

        public static /* synthetic */ Object uploadDocument$default(DocUploadApi docUploadApi, RequestBody requestBody, RequestBody requestBody2, RequestBody requestBody3, RequestBody requestBody4, RequestBody requestBody5, MultipartBody.Part part, MultipartBody.Part part2, MultipartBody.Part part3, MultipartBody.Part part4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDocument");
            }
            if ((i & 4) != 0) {
                requestBody3 = null;
            }
            if ((i & 8) != 0) {
                requestBody4 = null;
            }
            if ((i & 64) != 0) {
                part2 = null;
            }
            if ((i & 128) != 0) {
                part3 = null;
            }
            if ((i & 256) != 0) {
                part4 = null;
            }
            return docUploadApi.uploadDocument(requestBody, requestBody2, requestBody3, requestBody4, requestBody5, part, part2, part3, part4, continuation);
        }

        public static /* synthetic */ Object uploadGenericFile$default(DocUploadApi docUploadApi, RequestBody requestBody, RequestBody requestBody2, List list, MultipartBody.Part part, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadGenericFile");
            }
            if ((i & 1) != 0) {
                requestBody = null;
            }
            if ((i & 2) != 0) {
                requestBody2 = null;
            }
            return docUploadApi.uploadGenericFile(requestBody, requestBody2, list, part, str, continuation);
        }

        public static /* synthetic */ Object getVideoSelfieThresholds$default(DocUploadApi docUploadApi, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideoSelfieThresholds");
            }
            if ((i & 1) != 0) {
                str = "android";
            }
            return docUploadApi.getVideoSelfieThresholds(str, continuation);
        }
    }
}
