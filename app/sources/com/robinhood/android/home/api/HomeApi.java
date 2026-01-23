package com.robinhood.android.home.api;

import com.robinhood.models.home.api.ApiHomeAccountSwitcher;
import com.robinhood.models.home.api.ApiHomeState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: HomeApi.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/home/api/HomeApi;", "", "getHomeAccountSwitcher", "Lretrofit2/Response;", "Lcom/robinhood/models/home/api/ApiHomeAccountSwitcher;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeState", "Lcom/robinhood/models/home/api/ApiHomeState;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface HomeApi {
    @GET("home/account_switcher/v2/")
    Object getHomeAccountSwitcher(Continuation<? super Response<ApiHomeAccountSwitcher>> continuation);

    @GET("accounts/{account_number}/state/")
    Object getHomeState(@Path("account_number") String str, Continuation<? super Response<ApiHomeState>> continuation);
}
