package com.robinhood.api.pluto;

import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.pluto.ApiActivateTrialResponse;
import com.robinhood.models.api.pluto.ApiMerchantOfferBanner;
import com.robinhood.models.api.pluto.ApiMerchantOfferTerms;
import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import com.robinhood.models.api.pluto.ApiMerchantRewardUserState;
import com.robinhood.models.api.pluto.ApiRhyReward;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.api.pluto.ApiRoundupOverview;
import com.robinhood.models.api.pluto.ApiRoundupPendingTransactions;
import com.robinhood.models.api.pluto.ApiRoundupTimeline;
import com.robinhood.models.api.pluto.ApiRoundupTransactions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PlutoApi.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u001d\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010 \u001a\u00020!2\b\b\u0001\u0010\u001d\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u000e\u0010\"\u001a\u00020#H§@¢\u0006\u0002\u0010\u0004J \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000f2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0002\u0010\u0013J\u0018\u0010'\u001a\u00020%2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010)\u001a\u00020*2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u000e\u0010+\u001a\u00020,H§@¢\u0006\u0002\u0010\u0004J \u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u000f2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0012H§@¢\u0006\u0002\u0010\u0013J\u0018\u0010.\u001a\u00020/2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017¨\u00060"}, m3636d2 = {"Lcom/robinhood/api/pluto/PlutoApi;", "", "getRoundupEnrollment", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRoundupEnrollment", "request", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$CreateRequest;", "(Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$CreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRoundupEnrollment", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$UpdateRequest;", "(Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$UpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoundupOverview", "Lcom/robinhood/models/api/pluto/ApiRoundupOverview;", "getRewards", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/pluto/ApiRhyReward;", "cursor", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReward", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoricalActivitiesBanner", "Lretrofit2/Response;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferBanner;", "getRoundupTimeline", "Lcom/robinhood/models/api/pluto/ApiRoundupTimeline;", "weeklyRoundupId", "skipRoundupOrder", "", "getRoundupTransactions", "Lcom/robinhood/models/api/pluto/ApiRoundupTransactions;", "getPendingTransactions", "Lcom/robinhood/models/api/pluto/ApiRoundupPendingTransactions;", "getMerchantOffersV2", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2;", "context", "getMerchantOfferV2", "getMerchantOfferBanner", "getMerchantOfferTerms", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferTerms;", "getMerchantRewardUserState", "Lcom/robinhood/models/api/pluto/ApiMerchantRewardUserState;", "getTrialEligibleOffers", "activateTrial", "Lcom/robinhood/models/api/pluto/ApiActivateTrialResponse;", "lib-api-pluto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface PlutoApi {
    @POST("v2/merchant/offers/{id}/activate_trial")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object activateTrial(@Path("id") UUID uuid, Continuation<? super ApiActivateTrialResponse> continuation);

    @POST("roundup/enrollment/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object createRoundupEnrollment(@Body ApiRoundupEnrollment.CreateRequest createRequest, Continuation<? super ApiRoundupEnrollment> continuation);

    @GET("historical_activities/{id}/banner/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getHistoricalActivitiesBanner(@Path("id") UUID uuid, Continuation<? super Response<ApiMerchantOfferBanner>> continuation);

    @GET("v2/merchant/offers/{id}/banner/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getMerchantOfferBanner(@Path("id") UUID uuid, Continuation<? super Response<ApiMerchantOfferBanner>> continuation);

    @GET("merchant/offers/{id}/terms/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getMerchantOfferTerms(@Path("id") UUID uuid, Continuation<? super ApiMerchantOfferTerms> continuation);

    @GET("v2/merchant/offers/{id}/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getMerchantOfferV2(@Path("id") UUID uuid, Continuation<? super ApiMerchantOfferV2> continuation);

    @GET("v2/merchant/offers/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getMerchantOffersV2(@Query("context") String str, Continuation<? super PaginatedResult<ApiMerchantOfferV2>> continuation);

    @GET("merchant/state/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getMerchantRewardUserState(Continuation<? super ApiMerchantRewardUserState> continuation);

    @GET("roundup/pending_transactions/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getPendingTransactions(Continuation<? super ApiRoundupPendingTransactions> continuation);

    @GET("historical_activities/{id}/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getReward(@Path("id") UUID uuid, Continuation<? super ApiRhyReward> continuation);

    @GET("historical_activities/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRewards(@Query("cursor") String str, Continuation<? super PaginatedResult<? extends ApiRhyReward>> continuation);

    @GET("roundup/enrollment/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRoundupEnrollment(Continuation<? super ApiRoundupEnrollment> continuation);

    @GET("roundup/overview/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRoundupOverview(Continuation<? super ApiRoundupOverview> continuation);

    @GET("roundup/{weekly_roundup_id}/timeline/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRoundupTimeline(@Path("weekly_roundup_id") UUID uuid, Continuation<? super ApiRoundupTimeline> continuation);

    @GET("roundup/{weekly_roundup_id}/transactions/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRoundupTransactions(@Path("weekly_roundup_id") UUID uuid, Continuation<? super ApiRoundupTransactions> continuation);

    @GET("v2/merchant/trial_eligible_offers/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getTrialEligibleOffers(@Query("context") String str, Continuation<? super PaginatedResult<ApiMerchantOfferV2>> continuation);

    @POST("roundup/{weekly_roundup_id}/cancel/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object skipRoundupOrder(@Path("weekly_roundup_id") UUID uuid, Continuation<? super Unit> continuation);

    @PATCH("roundup/enrollment/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object updateRoundupEnrollment(@Body ApiRoundupEnrollment.UpdateRequest updateRequest, Continuation<? super ApiRoundupEnrollment> continuation);
}
