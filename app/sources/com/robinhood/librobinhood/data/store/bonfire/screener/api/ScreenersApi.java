package com.robinhood.librobinhood.data.store.bonfire.screener.api;

import com.robinhood.equityscreener.models.api.ApiAllIndicatorsResponse;
import com.robinhood.equityscreener.models.api.ApiSaveScreenerRequest;
import com.robinhood.equityscreener.models.api.ApiScanRequest;
import com.robinhood.equityscreener.models.api.ApiScanResultResponse;
import com.robinhood.equityscreener.models.api.ApiScreenerResponse;
import com.robinhood.equityscreener.models.api.ApiScreenersResponse;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ScreenersApi.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/screener/api/ScreenersApi;", "", "getAllIndicators", "Lcom/robinhood/equityscreener/models/api/ApiAllIndicatorsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScreenersScan", "Lcom/robinhood/equityscreener/models/api/ApiScanResultResponse;", "request", "Lcom/robinhood/equityscreener/models/api/ApiScanRequest;", "(Lcom/robinhood/equityscreener/models/api/ApiScanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScreeners", "Lcom/robinhood/equityscreener/models/api/ApiScreenersResponse;", "includeFilters", "", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPresetScreeners", "orderPriority", "Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "(Ljava/lang/Boolean;Lcom/robinhood/equityscreener/models/api/ScreenerOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScreener", "Lcom/robinhood/equityscreener/models/api/ApiScreenerResponse;", "id", "", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveScreener", "screener", "Lcom/robinhood/equityscreener/models/api/ApiSaveScreenerRequest;", "(Lcom/robinhood/equityscreener/models/api/ApiSaveScreenerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteScreener", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-equityscreener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface ScreenersApi {
    @DELETE("screeners/{id}")
    Object deleteScreener(@Path("id") String str, Continuation<? super Unit> continuation);

    @GET("screeners/indicators/")
    Object getAllIndicators(Continuation<? super ApiAllIndicatorsResponse> continuation);

    @GET("screeners/presets/")
    Object getPresetScreeners(@Query("include_filters") Boolean bool, @Query("order_priority") ScreenerOrder screenerOrder, Continuation<? super ApiScreenersResponse> continuation);

    @GET("screeners/{id}/")
    Object getScreener(@Path("id") String str, @Query("include_filters") Boolean bool, Continuation<? super ApiScreenerResponse> continuation);

    @GET("screeners/")
    Object getScreeners(@Query("include_filters") Boolean bool, Continuation<? super ApiScreenersResponse> continuation);

    @POST("screeners/scan/")
    Object getScreenersScan(@Body ApiScanRequest apiScanRequest, Continuation<? super ApiScanResultResponse> continuation);

    @POST("screeners/")
    Object saveScreener(@Body ApiSaveScreenerRequest apiSaveScreenerRequest, Continuation<? super ApiScreenerResponse> continuation);
}
