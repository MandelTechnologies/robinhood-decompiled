package com.robinhood.android.api.accountcenter;

import com.robinhood.android.models.accountcenter.api.ApiAccountCenterBanner;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AccountCenterApi.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/api/accountcenter/AccountCenterApi;", "", "getAccountCenterPageResponse", "Lretrofit2/Response;", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterPage;", "currency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "(Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAccountCenterBannerImpressions", "", "bannerType", "Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterBanner$BannerType;", "(Lcom/robinhood/android/models/accountcenter/api/ApiAccountCenterBanner$BannerType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AccountCenterApi {
    @GET("account_center/")
    Object getAccountCenterPageResponse(@Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super Response<ApiAccountCenterPage>> continuation);

    @PATCH("account_center/{banner_type}/impressions/")
    Object updateAccountCenterBannerImpressions(@Path("banner_type") ApiAccountCenterBanner.BannerType bannerType, Continuation<? super Unit> continuation);
}
