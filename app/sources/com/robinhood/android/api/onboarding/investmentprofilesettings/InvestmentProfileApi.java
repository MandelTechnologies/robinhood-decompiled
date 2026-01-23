package com.robinhood.android.api.onboarding.investmentprofilesettings;

import com.robinhood.models.api.bonfire.investmentprofilesettings.ApiInvestmentProfileSettingsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: InvestmentProfileApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/api/onboarding/investmentprofilesettings/InvestmentProfileApi;", "", "getInvestmentProfile", "Lcom/robinhood/models/api/bonfire/investmentprofilesettings/ApiInvestmentProfileSettingsResponse;", "productContext", "", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface InvestmentProfileApi {
    @GET("investment_profile_settings/profile/")
    Object getInvestmentProfile(@Query("product_context") String str, @Query("account_number") String str2, Continuation<? super ApiInvestmentProfileSettingsResponse> continuation);
}
