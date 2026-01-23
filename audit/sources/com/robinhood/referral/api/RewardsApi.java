package com.robinhood.referral.api;

import com.robinhood.models.api.ApiRewardSection;
import com.robinhood.models.api.ApiShouldBadgeForRewardOffers;
import com.robinhood.models.api.bonfire.ApiFractionalRewardClaimConfirmationResponse;
import com.robinhood.models.api.bonfire.ApiFractionalRewardClaimRequest;
import com.robinhood.models.api.bonfire.ApiFractionalRewardInfo;
import com.robinhood.models.api.bonfire.ApiRewardInfoResponse;
import com.robinhood.models.api.referraloffer.ApiReferralOfferDetailsV2;
import com.robinhood.models.api.rewardoffer.ApiRewardOffer;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.http.Headers;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RewardsApi.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0014J:\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00132\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00132\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\rH§@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010\u000fJ\u000e\u0010 \u001a\u00020!H§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r2\b\b\u0001\u0010\u0019\u001a\u00020\u0013H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006("}, m3636d2 = {"Lcom/robinhood/referral/api/RewardsApi;", "", "getFractionalRewardInfo", "Lcom/robinhood/models/api/bonfire/ApiFractionalRewardInfo;", "rewardId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claimFractionalReward", "Lcom/robinhood/models/api/bonfire/ApiFractionalRewardClaimConfirmationResponse;", "request", "Lcom/robinhood/models/api/bonfire/ApiFractionalRewardClaimRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/bonfire/ApiFractionalRewardClaimRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFractionalRewardInstruments", "", "Lcom/robinhood/models/api/bonfire/ApiFractionalRewardInfo$ApiClaimableInstrument;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardInfoOrError", "Lcom/robinhood/models/api/bonfire/ApiRewardInfoResponse;", "rewardType", "", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardOfferDetailsV2", "Lcom/robinhood/models/api/referraloffer/ApiReferralOfferDetailsV2;", "offerId", "instrumentId", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "source", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStockRewards", "Lcom/robinhood/models/api/ApiRewardSection;", "getShouldBadgeForRewardOffers", "Lcom/robinhood/models/api/ApiShouldBadgeForRewardOffers;", "clearRewardOffersBadge", "", "getRewardOffers", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOffer;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardOfferDetails", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "rewardOfferId", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface RewardsApi {
    @POST("rewards/fractional_reward/{rewardId}/claim/")
    Object claimFractionalReward(@Path("rewardId") UUID uuid, @Body ApiFractionalRewardClaimRequest apiFractionalRewardClaimRequest, Continuation<? super ApiFractionalRewardClaimConfirmationResponse> continuation);

    @PATCH("rewards/offer/badge/clear/")
    Object clearRewardOffersBadge(Continuation<? super Unit> continuation);

    @GET("rewards/fractional_reward/{rewardId}/reward_info/")
    Object getFractionalRewardInfo(@Path("rewardId") UUID uuid, Continuation<? super ApiFractionalRewardInfo> continuation);

    @GET("rewards/fractional_reward/instruments/")
    Object getFractionalRewardInstruments(Continuation<? super List<ApiFractionalRewardInfo.ApiClaimableInstrument>> continuation);

    @GET("rewards/claimable_reward/{rewardType}/{rewardId}/error_or_info/")
    Object getRewardInfoOrError(@Path("rewardType") String str, @Path("rewardId") UUID uuid, Continuation<? super ApiRewardInfoResponse> continuation);

    @GET("rewards/offer/{reward_offer_id}/")
    Object getRewardOfferDetails(@Path("reward_offer_id") UUID uuid, Continuation<? super ApiRewardOfferDetails> continuation);

    @GET("rewards/v2/offer/{offerId}/")
    Object getRewardOfferDetailsV2(@Path("offerId") String str, @Query("instrument_id") UUID uuid, @Header(Headers.DEVICE_ID) String str2, @Query("source") String str3, Continuation<? super ApiReferralOfferDetailsV2> continuation);

    @GET("rewards/offer/")
    Object getRewardOffers(@Header(Headers.DEVICE_ID) String str, Continuation<? super List<ApiRewardOffer>> continuation);

    @GET("rewards/offer/badge/")
    Object getShouldBadgeForRewardOffers(Continuation<? super ApiShouldBadgeForRewardOffers> continuation);

    @GET("rewards/reward/stocks/")
    Object getStockRewards(Continuation<? super List<ApiRewardSection>> continuation);
}
