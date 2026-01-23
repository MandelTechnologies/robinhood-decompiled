package com.robinhood.android.api.verification;

import com.robinhood.models.api.identi.ApiStartPhoneUpdateSuvRequest;
import com.robinhood.models.api.identi.ApiStartPhoneUpdateSuvResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: VerificationApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/api/verification/VerificationApi;", "", "startPhoneUpdateSuv", "Lcom/robinhood/models/api/identi/ApiStartPhoneUpdateSuvResponse;", "request", "Lcom/robinhood/models/api/identi/ApiStartPhoneUpdateSuvRequest;", "(Lcom/robinhood/models/api/identi/ApiStartPhoneUpdateSuvRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface VerificationApi {
    @POST("user_info/trigger_phone_update_suv/")
    Object startPhoneUpdateSuv(@Body ApiStartPhoneUpdateSuvRequest apiStartPhoneUpdateSuvRequest, Continuation<? super ApiStartPhoneUpdateSuvResponse> continuation);
}
