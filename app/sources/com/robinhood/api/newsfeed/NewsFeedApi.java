package com.robinhood.api.newsfeed;

import com.robinhood.models.market.updates.api.ApiMarketIndices;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: NewsFeedApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/api/newsfeed/NewsFeedApi;", "", "getMarketIndices", "Lretrofit2/Response;", "Lcom/robinhood/models/market/updates/api/ApiMarketIndices;", "keys", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface NewsFeedApi {
    @GET("market_indices/")
    Object getMarketIndices(@Query("keys") List<String> list, Continuation<? super Response<ApiMarketIndices>> continuation);
}
