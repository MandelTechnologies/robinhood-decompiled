package com.robinhood.android.lib.api.futures;

import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.api.margin.ApiFuturesMarginCallResolution;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: FuturesBrokebackApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;", "", "getFuturesBuyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "rhsAccountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFuturesMarginCallResolution", "Lcom/robinhood/android/models/futures/api/margin/ApiFuturesMarginCallResolution;", "accountNumber", "lib-api-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FuturesBrokebackApi {
    @GET("futures/{rhsAccountNumber}/futures_buying_power/")
    Object getFuturesBuyingPower(@Path("rhsAccountNumber") String str, Continuation<? super ApiFuturesBuyingPower> continuation);

    @GET("futures/{accountNumber}/futures_margin_call_resolution/")
    Object getFuturesMarginCallResolution(@Path("accountNumber") String str, Continuation<? super ApiFuturesMarginCallResolution> continuation);
}
