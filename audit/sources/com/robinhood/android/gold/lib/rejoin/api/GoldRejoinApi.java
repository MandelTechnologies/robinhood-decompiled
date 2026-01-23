package com.robinhood.android.gold.lib.rejoin.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: GoldRejoinApi.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinApi;", "", "getGoldRejoinFlow", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlow;", "source", "", "feature", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejoin", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinResponse;", "request", "Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinRequest;", "(Lcom/robinhood/android/gold/lib/rejoin/api/GoldRejoinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-gold-rejoin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GoldRejoinApi {
    @GET("rejoin_flow/")
    Object getGoldRejoinFlow(@Query("source") String str, @Query("feature") String str2, Continuation<? super ApiGoldRejoinFlow> continuation);

    @POST("rejoin/")
    Object rejoin(@Body GoldRejoinRequest goldRejoinRequest, Continuation<? super GoldRejoinResponse> continuation);

    /* compiled from: GoldRejoinApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getGoldRejoinFlow$default(GoldRejoinApi goldRejoinApi, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGoldRejoinFlow");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return goldRejoinApi.getGoldRejoinFlow(str, str2, continuation);
        }
    }
}
