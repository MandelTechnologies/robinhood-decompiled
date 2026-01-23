package com.robinhood.api.retrofit;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiSimilarInstrument2;
import com.robinhood.models.newsfeed.api.ApiNewsFeedElement;
import com.robinhood.models.newsfeed.api.ApiNewsFeedEmbeddedContent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: DoraApi.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/api/retrofit/DoraApi;", "", "getSimilarInstruments", "Lcom/robinhood/models/api/ApiSimilarInstruments;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeedByLocation", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedElement;", "location", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeedByTypeAndLocation", "feedType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeed", "getFeedVideos", "videoId", "getEmbeddedContent", "Lcom/robinhood/models/newsfeed/api/ApiNewsFeedEmbeddedContent;", "articleId", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface DoraApi {
    @GET("feed/embedded_content/{articleId}/")
    Object getEmbeddedContent(@Path("articleId") UUID uuid, Continuation<? super ApiNewsFeedEmbeddedContent> continuation);

    @GET("feed/instrument/{instrumentId}/")
    Object getFeed(@Path("instrumentId") UUID uuid, Continuation<? super PaginatedResult<ApiNewsFeedElement>> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 20", "X-Write-Timeout-Seconds-Override: 20"})
    @GET("feed/{location}/")
    Object getFeedByLocation(@Path("location") String str, Continuation<? super PaginatedResult<ApiNewsFeedElement>> continuation);

    @GET("feed/{feedType}/")
    Object getFeedByTypeAndLocation(@Path("feedType") String str, @Query("location") String str2, Continuation<? super PaginatedResult<ApiNewsFeedElement>> continuation);

    @GET("feed/videos/")
    Object getFeedVideos(@Query("video_id") UUID uuid, Continuation<? super PaginatedResult<ApiNewsFeedElement>> continuation);

    @GET("instruments/similar/{instrumentId}/")
    Object getSimilarInstruments(@Path("instrumentId") UUID uuid, Continuation<? super ApiSimilarInstrument2> continuation);
}
