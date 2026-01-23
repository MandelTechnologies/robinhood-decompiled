package com.robinhood.android.lib.api.directipo;

import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.directipo.models.api.ApiDirectIpoAllocation;
import com.robinhood.directipo.models.api.ApiDirectIpoAllocationShare;
import com.robinhood.directipo.models.api.ApiDirectIpoDspFundAccount;
import com.robinhood.directipo.models.api.ApiDirectIpoEnrollment;
import com.robinhood.directipo.models.api.ApiDirectIpoIndicationOfInterest;
import com.robinhood.directipo.models.api.ApiDirectIpoLimitTypeExplanation;
import com.robinhood.directipo.models.api.ApiDirectIpoNotificationDisclosure;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderEntryIntro;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderResponse;
import com.robinhood.directipo.models.api.ApiDirectIpoSummary;
import com.robinhood.directipo.models.api.ApiIpoAccessItem;
import com.robinhood.directipo.models.api.ApiIpoAccessLearningHub;
import com.robinhood.directipo.models.api.ApiIpoAccessListViewModel;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiDirectIpoPostCobFollowup;
import com.robinhood.models.api.bonfire.ipoaccess.clarity.ApiIpoAccessAnnouncement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: DirectIpoApi.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\"\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J0\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010#H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010'\u001a\u00020(H§@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010)J$\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u000e\b\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000500H§@¢\u0006\u0002\u00101J\u000e\u00102\u001a\u000203H§@¢\u0006\u0002\u0010)¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "", "getDirectIpoOrderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDirectIpoOrderTradeReceipt", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderResponse;", "orderId", "getDirectIpoPostCobFollowup", "Lcom/robinhood/models/api/bonfire/ApiDirectIpoPostCobFollowup;", "getDirectIpoIndicationOfInterest", "Lcom/robinhood/directipo/models/api/ApiDirectIpoIndicationOfInterest;", "enrollDirectIpoInstrument", "Lcom/robinhood/directipo/models/api/ApiDirectIpoEnrollment;", "accountNumber", "", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDirectIpoOrderEntryIntro", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderEntryIntro;", "getDirectIpoAllocationResultsV2", "Lcom/robinhood/directipo/models/api/ApiDirectIpoAllocation;", "getSharedDirectIpoAllocationResults", "Lcom/robinhood/directipo/models/api/ApiDirectIpoAllocation$Allocated;", "getDirectIpoSummary", "Lcom/robinhood/directipo/models/api/ApiDirectIpoSummary;", "getIpoShareUrl", "Lcom/robinhood/directipo/models/api/ApiDirectIpoAllocationShare;", "getLimitTypeExplanation", "Lcom/robinhood/directipo/models/api/ApiDirectIpoLimitTypeExplanation;", "getIpoAccessNotificationDisclosure", "Lcom/robinhood/directipo/models/api/ApiDirectIpoNotificationDisclosure;", "destination", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/directipo/models/DirectIpoOrderSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIpoAccessAnnouncement", "Lcom/robinhood/models/api/bonfire/ipoaccess/clarity/ApiIpoAccessAnnouncement;", "getIpoAccessLearningHub", "Lcom/robinhood/directipo/models/api/ApiIpoAccessLearningHub;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIpoAccessDspFundAccount", "Lcom/robinhood/directipo/models/api/ApiDirectIpoDspFundAccount;", "getIpoAccessItems", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/directipo/models/api/ApiIpoAccessItem;", "ids", "Lcom/robinhood/models/CommaSeparatedList;", "(Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIpoAccessListViewModel", "Lcom/robinhood/directipo/models/api/ApiIpoAccessListViewModel;", "lib-api-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface DirectIpoApi {
    @POST("equity_trading/ipo_access/enroll/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object enrollDirectIpoInstrument(@Path("instrumentId") UUID uuid, @Query("account_number") String str, Continuation<? super ApiDirectIpoEnrollment> continuation);

    @GET("equity_trading/ipo_access/viewmodels/allocation_results/{instrumentId}/?endpoint_version=2021-09-21")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoAllocationResultsV2(@Path("instrumentId") UUID uuid, Continuation<? super ApiDirectIpoAllocation> continuation);

    @GET("equity_trading/ipo_access/viewmodels/indication_of_interest/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoIndicationOfInterest(@Path("instrumentId") UUID uuid, Continuation<? super ApiDirectIpoIndicationOfInterest> continuation);

    @GET("equity_trading/ipo_access/viewmodels/mobile_order_entry/{instrumentId}/?endpoint_version=2021-05-04")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoOrderConfiguration(@Path("instrumentId") UUID uuid, Continuation<? super ApiDirectIpoOrderConfiguration> continuation);

    @GET("equity_trading/ipo_access/viewmodels/order_entry_splash/{instrumentId}/?endpoint_version=2021-10-13")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoOrderEntryIntro(@Path("instrumentId") UUID uuid, Continuation<? super ApiDirectIpoOrderEntryIntro> continuation);

    @GET("equity_trading/ipo_access/viewmodels/trade_receipt/{orderId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoOrderTradeReceipt(@Path("orderId") UUID uuid, Continuation<? super ApiDirectIpoOrderResponse> continuation);

    @GET("equity_trading/ipo_access/viewmodels/post_cob_follow_up/{orderId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoPostCobFollowup(@Path("orderId") UUID uuid, Continuation<? super ApiDirectIpoPostCobFollowup> continuation);

    @GET("equity_trading/ipo_access/viewmodels/summary/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getDirectIpoSummary(@Path("instrumentId") UUID uuid, Continuation<? super ApiDirectIpoSummary> continuation);

    @GET("equity_trading/ipo_access/viewmodels/ipo_announcement/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getIpoAccessAnnouncement(@Path("instrumentId") UUID uuid, Continuation<? super ApiIpoAccessAnnouncement> continuation);

    @GET("equity_trading/ipo_access/viewmodels/dsp_fund_account/")
    @RequiresRegionGate(regionGates = {IpoAccessRegionGate.class})
    Object getIpoAccessDspFundAccount(Continuation<? super ApiDirectIpoDspFundAccount> continuation);

    @GET("lists/ipo_access/cards/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getIpoAccessItems(@Query("ids") CommaSeparatedList<UUID> commaSeparatedList, Continuation<? super PaginatedResult<ApiIpoAccessItem>> continuation);

    @GET("equity_trading/ipo_access/viewmodels/allocation/learning_hub/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getIpoAccessLearningHub(Continuation<? super ApiIpoAccessLearningHub> continuation);

    @GET("lists/ipo_access/view_model/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getIpoAccessListViewModel(Continuation<? super ApiIpoAccessListViewModel> continuation);

    @GET("equity_trading/ipo_access/viewmodels/notification_disclosure/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getIpoAccessNotificationDisclosure(@Path("instrumentId") UUID uuid, @Query("destination") String str, @Query("source") DirectIpoOrderSource directIpoOrderSource, Continuation<? super ApiDirectIpoNotificationDisclosure> continuation);

    @POST("equity_trading/ipo_access/shared_ipo_access_results/{orderId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getIpoShareUrl(@Path("orderId") UUID uuid, Continuation<? super ApiDirectIpoAllocationShare> continuation);

    @GET("equity_trading/ipo_access/viewmodels/limit_type_explanation/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getLimitTypeExplanation(@Path("instrumentId") UUID uuid, Continuation<? super ApiDirectIpoLimitTypeExplanation> continuation);

    @GET("equity_trading/ipo_access/shared_ipo_access_results/{orderId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {IpoAccessRegionGate.class})
    Object getSharedDirectIpoAllocationResults(@Path("orderId") UUID uuid, Continuation<? super ApiDirectIpoAllocation.Allocated> continuation);
}
