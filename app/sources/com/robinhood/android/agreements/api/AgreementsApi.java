package com.robinhood.android.agreements.api;

import com.robinhood.android.agreements.models.ApiAgreement;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.agreements.models.ApiSignAgreementRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: AgreementsApi.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/agreements/api/AgreementsApi;", "", "getAgreement", "Lcom/robinhood/android/agreements/models/ApiAgreement;", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signAgreement", "", "signRequest", "Lcom/robinhood/android/agreements/models/ApiSignAgreementRequest;", "(Lcom/robinhood/android/agreements/models/ApiSignAgreementRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAgreement", "Lcom/robinhood/android/agreements/models/ApiPreviousAgreement;", "lib-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AgreementsApi {
    @GET("user_info/agreement_logs/v2/check/{name}/")
    Object checkAgreement(@Path("name") String str, Continuation<? super ApiPreviousAgreement> continuation);

    @GET("user_info/agreements/v2/retrieve/{name}/")
    Object getAgreement(@Path("name") String str, Continuation<? super ApiAgreement> continuation);

    @POST("user_info/agreements/v2/sign/")
    Object signAgreement(@Body ApiSignAgreementRequest apiSignAgreementRequest, Continuation<? super Unit> continuation);
}
