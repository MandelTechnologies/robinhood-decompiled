package com.robinhood.referral.singular;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: AttributionApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/referral/singular/AttributionApi;", "", "completeAttribution", "", "attributionRequest", "Lcom/robinhood/referral/singular/AttributionRequest;", "(Lcom/robinhood/referral/singular/AttributionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"NoNewRetrofitEndpoints"})
/* loaded from: classes26.dex */
public interface AttributionApi {
    @POST("attribution/deeplink/context/")
    Object completeAttribution(@Body AttributionRequest attributionRequest, Continuation<? super Unit> continuation);
}
