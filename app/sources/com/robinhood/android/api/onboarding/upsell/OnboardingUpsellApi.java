package com.robinhood.android.api.onboarding.upsell;

import com.robinhood.models.onboardingupsell.ApiOnboardingUpsellFlow;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.http.Headers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* compiled from: OnboardingUpsellApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/api/onboarding/upsell/OnboardingUpsellApi;", "", "getOnboardingUpsellFlow", "Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", "source", "", "amount", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface OnboardingUpsellApi {
    @GET("onboarding/funding_upsell/")
    Object getOnboardingUpsellFlow(@Query("source") String str, @Query("amount") String str2, @Header(Headers.DEVICE_ID) String str3, Continuation<? super ApiOnboardingUpsellFlow> continuation);
}
