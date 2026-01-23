package com.robinhood.android.api.alldaytrading;

import com.robinhood.models.alldaytrading.api.ApiAdtInstrumentInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: AllDayTradingApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/api/alldaytrading/AllDayTradingApi;", "", "getInstrumentInfo", "Lcom/robinhood/models/alldaytrading/api/ApiAdtInstrumentInfo;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-all-day-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AllDayTradingApi {
    @GET("all_day_trading/{instrument_id}/instrument_info")
    Object getInstrumentInfo(@Path("instrument_id") UUID uuid, Continuation<? super ApiAdtInstrumentInfo> continuation);
}
