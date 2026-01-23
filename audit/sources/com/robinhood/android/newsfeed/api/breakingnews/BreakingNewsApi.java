package com.robinhood.android.newsfeed.api.breakingnews;

import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiBreakingNewsResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: BreakingNewsApi.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/api/breakingnews/BreakingNewsApi;", "", "getBreakingNews", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiBreakingNewsResponse;", "assetId", "Ljava/util/UUID;", "assetType", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "accountNumber", "", "(Ljava/util/UUID;Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-breakingnews_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface BreakingNewsApi {
    @GET("breaking-news/")
    Object getBreakingNews(@Query("asset_id") UUID uuid, @Query("asset_type") ApiAssetType apiAssetType, @Query("account_number") String str, Continuation<? super ApiBreakingNewsResponse> continuation);
}
