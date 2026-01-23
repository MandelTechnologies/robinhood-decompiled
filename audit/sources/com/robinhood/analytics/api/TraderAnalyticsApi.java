package com.robinhood.analytics.api;

import com.robinhood.rosetta.eventlogging.LoggingEventBatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* compiled from: TraderAnalyticsApi.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "", "postAnalytics", "", "analyticsRequestsJson", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "track", "batch", "Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;", "(Lcom/robinhood/rosetta/eventlogging/LoggingEventBatch;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface TraderAnalyticsApi {
    @Headers({"X-Gzip-Request-Body: 1"})
    @POST("track")
    Object postAnalytics(@Body RequestBody requestBody, Continuation<? super Unit> continuation);

    @POST("trackv2")
    Object track(@Body LoggingEventBatch loggingEventBatch, Continuation<? super Unit> continuation);
}
