package com.robinhood.api.rhy;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiDirectDepositRelationship;
import com.robinhood.models.api.bonfire.ApiPaycheckV2;
import com.robinhood.models.api.bonfire.ApiRhyAccount;
import com.robinhood.models.api.bonfire.ApiRhyApplicationStatus;
import com.robinhood.models.api.bonfire.ApiRhyCashTabBannerResponse;
import com.robinhood.models.api.bonfire.directdeposits.DirectDepositFormRequestBody;
import com.robinhood.models.api.bonfire.rhy.ApiCashCushionSetting;
import com.robinhood.models.api.bonfire.rhy.ApiRhySpendingAccountLearnMore;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabCarouselItem;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransactionsRequest;
import com.robinhood.models.api.bonfire.rhy.ApiSypRetirementUpsellDetails;
import com.robinhood.models.api.bonfire.waitlist.ApiRhySignupEligibility;
import com.robinhood.models.api.minerva.ApiRoutingDetails;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RhyBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u001cH§@¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H§@¢\u0006\u0002\u0010\u0005J2\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\b\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0001\u0010(\u001a\u00020&H§@¢\u0006\u0002\u0010)J(\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\b\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020,H§@¢\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020/H§@¢\u0006\u0002\u00100J\u000e\u00101\u001a\u000202H§@¢\u0006\u0002\u0010\u0005J\u001e\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u0010\u001f\u001a\u000205H§@¢\u0006\u0002\u00106J\"\u00107\u001a\u0002042\b\b\u0001\u00108\u001a\u00020\t2\b\b\u0001\u00109\u001a\u00020&H§@¢\u0006\u0002\u0010:¨\u0006;"}, m3636d2 = {"Lcom/robinhood/api/rhy/RhyBonfireApi;", "", "getRhyAccounts", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiRhyAccount;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyAccountRoutingDetails", "Lcom/robinhood/models/api/minerva/ApiRoutingDetails;", "accountId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyTabCarouselItems", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTabCarouselItem;", "getRhySignupEligibility", "Lcom/robinhood/models/api/bonfire/waitlist/ApiRhySignupEligibility;", "getRhyTabState", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTabStateResponse;", "getRhySpendingAccountLearnMore", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhySpendingAccountLearnMore;", "p2pContentOverride", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyMigrationApplicationStatus", "Lcom/robinhood/models/api/bonfire/ApiRhyApplicationStatus;", "getRhyMigrationCashTabBannerState", "Lcom/robinhood/models/api/bonfire/ApiRhyCashTabBannerResponse;", "getCashCushionStatus", "Lcom/robinhood/models/api/bonfire/rhy/ApiCashCushionSetting;", "updateCashCushionStatus", "", "request", "(Lcom/robinhood/models/api/bonfire/rhy/ApiCashCushionSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCashCushionDetails", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getDirectDepositPaychecksV2", "Lcom/robinhood/models/api/bonfire/ApiPaycheckV2;", "", "accountType", "rhsAccountNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDirectDepositRelationships", "Lcom/robinhood/models/api/bonfire/ApiDirectDepositRelationship;", "Lcom/robinhood/models/entity/RhEntity;", "(Ljava/lang/String;Lcom/robinhood/models/entity/RhEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitDirectDepositForm", "Lcom/robinhood/models/api/bonfire/directdeposits/DirectDepositFormRequestBody;", "(Lcom/robinhood/models/api/bonfire/directdeposits/DirectDepositFormRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSypRetirementUpsellDetails", "Lcom/robinhood/models/api/bonfire/rhy/ApiSypRetirementUpsellDetails;", "getRhyTransactions", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransaction;", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransactionsRequest;", "(Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransactionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyTransaction", "transactionId", "eventType", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RhyBonfireApi {
    @GET("rhy/cash_cushion/sdui/details")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getCashCushionDetails(Continuation<? super UIComponent<? extends GenericAction>> continuation);

    @GET("rhy/cash_cushion/enabled")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getCashCushionStatus(Continuation<? super ApiCashCushionSetting> continuation);

    @GET("transfer/direct_deposit/v2/paychecks/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getDirectDepositPaychecksV2(@Query("account_id") String str, @Query(InstantCashConstants.ACCOUNT_TYPE_KEY) String str2, @Query("rhs_account_number") String str3, Continuation<? super PaginatedResult<ApiPaycheckV2>> continuation);

    @GET("transfer/direct_deposit/relationships")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getDirectDepositRelationships(@Query("account_id") String str, @Query(InstantCashConstants.ACCOUNT_TYPE_KEY) RhEntity rhEntity, Continuation<? super PaginatedResult<ApiDirectDepositRelationship>> continuation);

    @GET("rhy/accounts/{accountId}/routing_details/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyAccountRoutingDetails(@Path("accountId") UUID uuid, Continuation<? super ApiRoutingDetails> continuation);

    @GET("rhy/accounts/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRhyAccounts(Continuation<? super PaginatedResult<ApiRhyAccount>> continuation);

    @GET("rhy/migration/application/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyMigrationApplicationStatus(Continuation<? super ApiRhyApplicationStatus> continuation);

    @GET("rhy/migration/banner/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyMigrationCashTabBannerState(Continuation<? super ApiRhyCashTabBannerResponse> continuation);

    @GET("rhy/signup/eligibility")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRhySignupEligibility(Continuation<? super ApiRhySignupEligibility> continuation);

    @GET("rhy/learn/spending_account_learn_more/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhySpendingAccountLearnMore(@Query("p2p_content_override") boolean z, Continuation<? super ApiRhySpendingAccountLearnMore> continuation);

    @GET("rhy/banners/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyTabCarouselItems(Continuation<? super List<ApiRhyTabCarouselItem>> continuation);

    @GET("rhy/tab_state/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyTabState(Continuation<? super ApiRhyTabStateResponse> continuation);

    @GET("rhy/get_transaction/{source_id}/{source_event_type}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyTransaction(@Path("source_id") UUID uuid, @Path("source_event_type") String str, Continuation<? super ApiRhyTransaction> continuation);

    @POST("rhy/list_transactions")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRhyTransactions(@Body ApiRhyTransactionsRequest apiRhyTransactionsRequest, Continuation<? super PaginatedResult<ApiRhyTransaction>> continuation);

    @GET("rhy/syp_retirement_upsell/sdui/details/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getSypRetirementUpsellDetails(Continuation<? super ApiSypRetirementUpsellDetails> continuation);

    @POST("teller/direct_deposit_form/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object submitDirectDepositForm(@Body DirectDepositFormRequestBody directDepositFormRequestBody, Continuation<? super Unit> continuation);

    @POST("rhy/cash_cushion/enabled")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object updateCashCushionStatus(@Body ApiCashCushionSetting apiCashCushionSetting, Continuation<? super Unit> continuation);
}
