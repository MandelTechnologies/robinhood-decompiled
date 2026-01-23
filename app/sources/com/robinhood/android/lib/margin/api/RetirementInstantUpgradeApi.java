package com.robinhood.android.lib.margin.api;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: RetirementInstantUpgradeApi.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/RetirementInstantUpgradeApi;", "", "getSplashScreen", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$InstantDepositsViewModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginAgreement", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface RetirementInstantUpgradeApi {
    @GET("retirement_onboarding/signup_flow/margin_agreement/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getMarginAgreement(Continuation<? super ApiRetirementSignUpFlow.RetirementAgreementViewModel> continuation);

    @GET("retirement_onboarding/signup_flow/instant_ira/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getSplashScreen(Continuation<? super ApiRetirementSignUpFlow.InstantDepositsViewModel> continuation);
}
