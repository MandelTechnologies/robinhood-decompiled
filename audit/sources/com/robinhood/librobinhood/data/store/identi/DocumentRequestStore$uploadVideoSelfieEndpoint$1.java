package com.robinhood.librobinhood.data.store.identi;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadResponse;
import com.robinhood.utils.http.MediaTypes;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: DocumentRequestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadResponse;", "request", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.DocumentRequestStore$uploadVideoSelfieEndpoint$1", m3645f = "DocumentRequestStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DocumentRequestStore$uploadVideoSelfieEndpoint$1 extends ContinuationImpl7 implements Function2<ApiVideoSelfieUploadRequest, Continuation<? super ApiVideoSelfieUploadResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DocumentRequestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRequestStore$uploadVideoSelfieEndpoint$1(DocumentRequestStore documentRequestStore, Continuation<? super DocumentRequestStore$uploadVideoSelfieEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = documentRequestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DocumentRequestStore$uploadVideoSelfieEndpoint$1 documentRequestStore$uploadVideoSelfieEndpoint$1 = new DocumentRequestStore$uploadVideoSelfieEndpoint$1(this.this$0, continuation);
        documentRequestStore$uploadVideoSelfieEndpoint$1.L$0 = obj;
        return documentRequestStore$uploadVideoSelfieEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiVideoSelfieUploadRequest apiVideoSelfieUploadRequest, Continuation<? super ApiVideoSelfieUploadResponse> continuation) {
        return ((DocumentRequestStore$uploadVideoSelfieEndpoint$1) create(apiVideoSelfieUploadRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiVideoSelfieUploadRequest apiVideoSelfieUploadRequest = (ApiVideoSelfieUploadRequest) this.L$0;
        DocUploadApi docUploadApi = this.this$0.api;
        String nonce = apiVideoSelfieUploadRequest.getNonce();
        String documentRequestId = apiVideoSelfieUploadRequest.getDocumentRequestId();
        RequestBody requestBodyCreate = documentRequestId != null ? RequestBody.INSTANCE.create(documentRequestId, MediaTypes.INSTANCE.getMULTIPART_FORM_DATA()) : null;
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String serverValue = ApiDocumentRequest.Type.VIDEO_SELFIE.getServerValue();
        MediaTypes mediaTypes = MediaTypes.INSTANCE;
        RequestBody requestBodyCreate2 = companion.create(serverValue, mediaTypes.getMULTIPART_FORM_DATA());
        RequestBody requestBodyCreate3 = companion.create(String.valueOf(apiVideoSelfieUploadRequest.getSetBaseline()), mediaTypes.getMULTIPART_FORM_DATA());
        MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
        MultipartBody.Part partCreateFormData = companion2.createFormData("video", "video.mp4", companion.create(new File(apiVideoSelfieUploadRequest.getVideoPath()), mediaTypes.getMP4()));
        MultipartBody.Part partCreateFormData2 = companion2.createFormData("center", "center.jpeg", companion.create(new File(apiVideoSelfieUploadRequest.getPhotoPath()), mediaTypes.getJPEG()));
        MultipartBody.Part partCreateFormData3 = companion2.createFormData("timeseries", "timeseries.csv", companion.create(apiVideoSelfieUploadRequest.getTimeSeries(), mediaTypes.getTEXT_CSV()));
        String json = this.this$0.getAdditionalInfoAdapter().toJson(apiVideoSelfieUploadRequest.getAdditionalInfo());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        MultipartBody.Part partCreateFormData4 = companion2.createFormData("additional_info", null, companion.create(json, MediaTypes.JSON_UTF8));
        this.label = 1;
        Object objUploadVideoSelfie = docUploadApi.uploadVideoSelfie(nonce, requestBodyCreate, requestBodyCreate2, requestBodyCreate3, partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, this);
        return objUploadVideoSelfie == coroutine_suspended ? coroutine_suspended : objUploadVideoSelfie;
    }
}
