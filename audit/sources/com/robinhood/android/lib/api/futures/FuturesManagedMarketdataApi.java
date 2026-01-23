package com.robinhood.android.lib.api.futures;

import com.robinhood.android.models.futures.api.marketdata.MockFundamentalsRequest;
import com.robinhood.android.models.futures.api.marketdata.MockHistoricalRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: FuturesManagedMarketdataApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;", "", "createMockHistoricalsForContract", "", "request", "Lcom/robinhood/android/models/futures/api/marketdata/MockHistoricalRequest;", "(Lcom/robinhood/android/models/futures/api/marketdata/MockHistoricalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createMockHistoricalsForProduct", "createMockFundamentals", "Lcom/robinhood/android/models/futures/api/marketdata/MockFundamentalsRequest;", "(Lcom/robinhood/android/models/futures/api/marketdata/MockFundamentalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FuturesManagedMarketdataApi {
    @POST("fundamentals/futures/v1/")
    Object createMockFundamentals(@Body MockFundamentalsRequest mockFundamentalsRequest, Continuation<? super Unit> continuation);

    @POST("historicals/futures/contracts/v1/")
    Object createMockHistoricalsForContract(@Body MockHistoricalRequest mockHistoricalRequest, Continuation<? super Unit> continuation);

    @POST("historicals/futures/products/v1/")
    Object createMockHistoricalsForProduct(@Body MockHistoricalRequest mockHistoricalRequest, Continuation<? super Unit> continuation);
}
