package com.robinhood.api.rhy.referral;

import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.rhy.referral.api.ApiRefereeLanding;
import com.robinhood.models.rhy.referral.api.ApiReferrerLanding;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttribution;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralAttributionList;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralEligibility;
import com.robinhood.models.rhy.referral.api.ApiRhyReferralRemindRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: RhyReferralBonfireApi.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;", "", "getReferrerLandingPage", "Lcom/robinhood/models/rhy/referral/api/ApiReferrerLanding;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefereeLandingPage", "Lcom/robinhood/models/rhy/referral/api/ApiRefereeLanding;", "getRhyReferralEligibility", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralEligibility;", "getRhyReferralAttribution", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralAttribution;", "getRhyReferralAttributionList", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralAttributionList;", "remindRhyReferral", "", "request", "Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralRemindRequest;", "(Lcom/robinhood/models/rhy/referral/api/ApiRhyReferralRemindRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface RhyReferralBonfireApi {
    @GET("rhy/referral/referee_landing")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRefereeLandingPage(Continuation<? super ApiRefereeLanding> continuation);

    @GET("rhy/referral/referrer_landing")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getReferrerLandingPage(Continuation<? super ApiReferrerLanding> continuation);

    @GET("rhy/referral/get_attribution")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyReferralAttribution(Continuation<? super ApiRhyReferralAttribution> continuation);

    @GET("rhy/referral/list_attributions")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyReferralAttributionList(Continuation<? super ApiRhyReferralAttributionList> continuation);

    @GET("rhy/referral")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyReferralEligibility(Continuation<? super ApiRhyReferralEligibility> continuation);

    @POST("rhy/referral/remind")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object remindRhyReferral(@Body ApiRhyReferralRemindRequest apiRhyReferralRemindRequest, Continuation<? super Unit> continuation);
}
