package com.robinhood.android.car.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: CarEligibilityApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/car/api/CarEligibilityApi;", "", "verifyCarEligibility", "Lcom/robinhood/android/car/api/ApiCarEligibility;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CarEligibilityApi {
    @POST("accounts/{accountNumber}/car_eligibility/")
    Object verifyCarEligibility(@Path("accountNumber") String str, Continuation<? super ApiCarEligibility> continuation);
}
