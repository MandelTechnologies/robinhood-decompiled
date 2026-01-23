package com.robinhood.android.lib.margin.api;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.lib.margin.api.models.ApiSeenMarginUpsellRequestBody;
import com.robinhood.android.lib.margin.api.models.ApiSeenMarginUpsellResponse;
import com.robinhood.android.lib.margin.api.models.EnableMarginUpsellOrderType;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: MarginInvestingApi.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J,\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020#H§@¢\u0006\u0002\u0010$J8\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010'\u001a\u00020\u00172\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010,\u001a\u00020-2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000b¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "", "enableMarginInvesting", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResponse;", "accountNumber", "", CarResultComposable2.BODY, "Lcom/robinhood/android/lib/margin/api/ApiEnableMarginInvestingRequestBody;", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/ApiEnableMarginInvestingRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginSettings", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMarginSettings", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettingsRequestBody;", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/ApiMarginSettingsRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginEligibility", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "skipMin2kEquityCheck", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postMarginEligibility", "getMarginUpsell", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "orderType", "Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;", "orderIdentifier", "Ljava/util/UUID;", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/models/EnableMarginUpsellOrderType;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSeenMarginUpsell", "Lcom/robinhood/android/lib/margin/api/models/ApiSeenMarginUpsellResponse;", "Lcom/robinhood/android/lib/margin/api/models/ApiSeenMarginUpsellRequestBody;", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/models/ApiSeenMarginUpsellRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginTieredRates", "Lcom/robinhood/android/lib/margin/api/ApiMarginTieredRates;", "skipSuitability", "source", "(Ljava/lang/String;ZZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldUpsell", "Lcom/robinhood/android/lib/margin/api/ApiGoldUpsell;", "getMarginOnboardingSplash", "Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginInvestingApi {
    @POST("margin/{account_number}/enable/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object enableMarginInvesting(@Path("account_number") String str, @Body ApiEnableMarginInvestingRequestBody apiEnableMarginInvestingRequestBody, Continuation<? super ApiToggleMarginInvestingResponse> continuation);

    @GET("margin/{account_number}/gold_upsell/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class, GoldRegionGate.class})
    Object getGoldUpsell(@Path("account_number") String str, Continuation<? super ApiGoldUpsell> continuation);

    @GET("margin/{account_number}/eligibility/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getMarginEligibility(@Path("account_number") String str, @Query("skip_min_2k_equity_check") boolean z, Continuation<? super ApiMarginEligibility> continuation);

    @GET("margin/{account_number}/investing_info/")
    @RequiresRegionGate(regionGates = {LeveredMarginRegionGate.class})
    Object getMarginInvestingInfo(@Path("account_number") String str, @Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super ApiMarginInvestingInfo> continuation);

    @GET("margin/{account_number}/onboarding_flow/splash/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getMarginOnboardingSplash(@Path("account_number") String str, Continuation<? super ApiMarginOnboardingSplash> continuation);

    @GET("margin/{account_number}/settings/")
    @RequiresRegionGate(regionGates = {LeveredMarginRegionGate.class})
    Object getMarginSettings(@Path("account_number") String str, Continuation<? super ApiMarginSettings> continuation);

    @GET("margin/{account_number}/tiered_rates/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getMarginTieredRates(@Path("account_number") String str, @Query("skip_min_2k_equity_check") boolean z, @Query("skip_suitability") boolean z2, @Query("source") String str2, Continuation<? super ApiMarginTieredRates> continuation);

    @GET("margin/{account_number}/upsell/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object getMarginUpsell(@Path("account_number") String str, @Query("order_type") EnableMarginUpsellOrderType enableMarginUpsellOrderType, @Query("order_identifier") UUID uuid, Continuation<? super ApiMarginUpsell> continuation);

    @POST("margin/{account_number}/eligibility/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object postMarginEligibility(@Path("account_number") String str, @Query("skip_min_2k_equity_check") boolean z, Continuation<? super ApiMarginEligibility> continuation);

    @POST("margin/{account_number}/upsell/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object postSeenMarginUpsell(@Path("account_number") String str, @Body ApiSeenMarginUpsellRequestBody apiSeenMarginUpsellRequestBody, Continuation<? super ApiSeenMarginUpsellResponse> continuation);

    @POST("margin/{account_number}/settings/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {LeveredMarginRegionGate.class})
    Object updateMarginSettings(@Path("account_number") String str, @Body ApiMarginSettingsRequestBody apiMarginSettingsRequestBody, Continuation<? super ApiMarginSettings> continuation);
}
