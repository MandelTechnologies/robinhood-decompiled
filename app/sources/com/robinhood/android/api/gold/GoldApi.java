package com.robinhood.android.api.gold;

import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollment;
import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollmentBody;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: GoldApi.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/api/gold/GoldApi;", "", "getSweepFlow", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDowngradeValueProps", "Lcom/robinhood/models/api/bonfire/ApiGoldValuePropsDowngrade;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enrollInSweep", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepEnrollment;", "request", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepEnrollmentBody;", "(Lcom/robinhood/models/api/bonfire/ApiGoldSweepEnrollmentBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSweepFlowSplash", "Lcom/robinhood/models/api/bonfire/ApiSweepSplash;", "lib-api-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface GoldApi {
    @POST("gold/enroll_sweep/")
    Object enrollInSweep(@Body ApiGoldSweepEnrollmentBody apiGoldSweepEnrollmentBody, Continuation<? super ApiGoldSweepEnrollment> continuation);

    @GET("gold/value_props/downgrade")
    Object getDowngradeValueProps(Continuation<? super ApiGoldValuePropsDowngrade> continuation);

    @GET("gold/sweep_flow/")
    Object getSweepFlow(@Query("account_number") String str, Continuation<? super ApiSweepFlow> continuation);

    @GET("gold/sweep_flow_splash")
    Object getSweepFlowSplash(@Query("account_number") String str, Continuation<? super ApiSweepSplash> continuation);
}
