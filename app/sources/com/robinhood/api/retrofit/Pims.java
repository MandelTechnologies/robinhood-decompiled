package com.robinhood.api.retrofit;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.models.api.ApiDataSubjectRequest;
import com.robinhood.models.api.ApiDocument;
import com.robinhood.models.api.pims.ApiDataSubjectListResponse;
import com.robinhood.models.api.pims.ApiDataSubjectRequestResponse;
import com.robinhood.utils.http.Headers;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: Pims.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00072\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Pims;", "", "submitPersonalDataRequest", "Lcom/robinhood/models/api/pims/ApiDataSubjectRequestResponse;", "apiDataSubjectRequest", "Lcom/robinhood/models/api/ApiDataSubjectRequest;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "(Lcom/robinhood/models/api/ApiDataSubjectRequest;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPersonalDataRequests", "Lcom/robinhood/models/api/pims/ApiDataSubjectListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataRequestFiles", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "id", "(Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface Pims {
    @GET("data_subject_request/")
    Object fetchPersonalDataRequests(Continuation<? super ApiDataSubjectListResponse> continuation);

    @GET("data_subject_request/{id}/download/?redirect=False")
    Object getDataRequestFiles(@Path("id") UUID uuid, @Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid2, Continuation<? super ApiDocument.DownloadResponse> continuation);

    @POST("data_subject_request/register/")
    Object submitPersonalDataRequest(@Body ApiDataSubjectRequest apiDataSubjectRequest, @Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, Continuation<? super ApiDataSubjectRequestResponse> continuation);

    /* compiled from: Pims.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object submitPersonalDataRequest$default(Pims pims, ApiDataSubjectRequest apiDataSubjectRequest, UUID uuid, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPersonalDataRequest");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            return pims.submitPersonalDataRequest(apiDataSubjectRequest, uuid, continuation);
        }

        public static /* synthetic */ Object getDataRequestFiles$default(Pims pims, UUID uuid, UUID uuid2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDataRequestFiles");
            }
            if ((i & 2) != 0) {
                uuid2 = null;
            }
            return pims.getDataRequestFiles(uuid, uuid2, continuation);
        }
    }
}
