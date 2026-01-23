package com.robinhood.lib.sweep.enrollment.api;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: SweepEnrollmentApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/lib/sweep/enrollment/api/SweepEnrollmentApi;", "", "getSweepEnrollment", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSweepEnrollment", CarResultComposable2.BODY, "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollmentRequestBody;", "(Ljava/lang/String;Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollmentRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-sweep-enrollment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface SweepEnrollmentApi {
    @GET("accounts/{account_number}/sweep_enrollment_state/")
    Object getSweepEnrollment(@Path("account_number") String str, Continuation<? super ApiSweepEnrollment> continuation);

    @POST("accounts/{account_number}/sweep_enrollment_state/")
    Object updateSweepEnrollment(@Path("account_number") String str, @Body ApiSweepEnrollmentRequestBody apiSweepEnrollmentRequestBody, Continuation<? super ApiSweepEnrollment> continuation);
}
