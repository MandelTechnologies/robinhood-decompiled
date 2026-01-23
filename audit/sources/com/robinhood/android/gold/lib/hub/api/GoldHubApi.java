package com.robinhood.android.gold.lib.hub.api;

import com.robinhood.android.api.gold.hub.ApiGoldDepositBoostAdjustment;
import com.robinhood.android.api.gold.hub.ApiGoldDepositBoostPayout;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: GoldHubApi.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0004J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/GoldHubApi;", "", "getGoldHub", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldDepositBoostHub", "Lcom/robinhood/android/gold/lib/hub/api/ApiDepositBoostHub;", "transferIds", "", "amountList", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldSweepHub", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldSweepHub;", "getDepositBoostPayouts", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostPayout;", "cursor", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDepositBoostAdjustments", "Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostAdjustment;", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface GoldHubApi {
    @GET("deposit_boost_adjustments/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getDepositBoostAdjustments(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiGoldDepositBoostAdjustment>> continuation);

    @GET("deposit_boost_paid_payouts/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getDepositBoostPayouts(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiGoldDepositBoostPayout>> continuation);

    @GET("deposit_boost_hub/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getGoldDepositBoostHub(@Query("transfer_ids") String str, @Query("amount_list") String str2, Continuation<? super ApiDepositBoostHub> continuation);

    @GET("hub/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getGoldHub(Continuation<? super ApiGoldHub> continuation);

    @GET("sweep_hub/")
    @RequiresRegionGate(regionGates = {GoldRegionGate.class})
    Object getGoldSweepHub(Continuation<? super ApiGoldSweepHub> continuation);
}
