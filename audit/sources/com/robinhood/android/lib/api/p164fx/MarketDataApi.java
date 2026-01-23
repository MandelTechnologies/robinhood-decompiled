package com.robinhood.android.lib.api.p164fx;

import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.p325fx.api.ApiMcwFxQuotes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: MarketDataApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/api/fx/MarketDataApi;", "", "getFxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "symbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMcwFxQuotes", "Lcom/robinhood/models/fx/api/ApiMcwFxQuotes;", "symbols", "lib-api-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarketDataApi {
    @GET("marketdata/fx/quotes/{symbol}/")
    Object getFxQuote(@Path("symbol") String str, Continuation<? super ApiFxQuote> continuation);

    @GET("marketdata/fx/quotes/v1/")
    Object getMcwFxQuotes(@Query("symbols") String str, Continuation<? super ApiMcwFxQuotes> continuation);
}
