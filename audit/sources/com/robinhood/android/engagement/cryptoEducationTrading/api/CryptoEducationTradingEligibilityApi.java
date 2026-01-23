package com.robinhood.android.engagement.cryptoEducationTrading.api;

import com.robinhood.android.engagement.cryptoEducationTrading.model.CryptoEducationEligibilityResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: CryptoEducationTradingEligibilityApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/api/CryptoEducationTradingEligibilityApi;", "", "getEducationRewardsConfirmationCard", "Lcom/robinhood/android/engagement/cryptoEducationTrading/model/CryptoEducationEligibilityResponse;", "upsellSurfaceLocation", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface CryptoEducationTradingEligibilityApi {
    @GET("crypto_education_trading_eligibility/")
    Object getEducationRewardsConfirmationCard(@Query("upsell_surface_location") String str, Continuation<? super CryptoEducationEligibilityResponse> continuation);
}
