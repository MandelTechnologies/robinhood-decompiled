package com.robinhood.android.api.portfolio;

import com.robinhood.android.models.portfolio.api.ApiAssetHomesState;
import com.robinhood.android.models.portfolio.api.AssetType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: AssetHomeApi.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/api/portfolio/AssetHomeApi;", "", "getAssetHomeState", "Lcom/robinhood/android/models/portfolio/api/ApiAssetHomesState;", "accountNumber", "", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AssetType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AssetHomeApi {
    @GET("portfolio/asset-home/{account_number}/state/{asset_type}")
    Object getAssetHomeState(@Path("account_number") String str, @Path("asset_type") AssetType assetType, Continuation<? super ApiAssetHomesState> continuation);
}
