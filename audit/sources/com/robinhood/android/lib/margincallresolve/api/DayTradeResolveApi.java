package com.robinhood.android.lib.margincallresolve.api;

import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: DayTradeResolveApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/margincallresolve/api/DayTradeResolveApi;", "", "getDayTradeCallView", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DayTradeResolveApi {
    @GET("margin/{account_number}/day_trade_call_view")
    Object getDayTradeCallView(@Path("account_number") String str, Continuation<? super ApiDayTradeCallView> continuation);
}
