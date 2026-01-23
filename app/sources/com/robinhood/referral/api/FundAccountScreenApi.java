package com.robinhood.referral.api;

import com.robinhood.models.api.PostOnboardingFundAccountContentResponse;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.http.Headers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* compiled from: FundAccountScreenApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/referral/api/FundAccountScreenApi;", "", "getFundAccountScreenContent", "Lcom/robinhood/models/api/PostOnboardingFundAccountContentResponse;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface FundAccountScreenApi {
    @GET("promotion/screen/fund_account/")
    Object getFundAccountScreenContent(@Header(Headers.DEVICE_ID) String str, Continuation<? super PostOnboardingFundAccountContentResponse> continuation);
}
