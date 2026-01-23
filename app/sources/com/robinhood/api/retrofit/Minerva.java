package com.robinhood.api.retrofit;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiShippingAddress;
import com.robinhood.models.api.minerva.ApiAggregateMerchant;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import com.robinhood.models.api.minerva.ApiCardTransactions2;
import com.robinhood.models.api.minerva.ApiCardTransactions3;
import com.robinhood.models.api.minerva.ApiCardTransactions4;
import com.robinhood.models.api.minerva.ApiChangePinParams;
import com.robinhood.models.api.minerva.ApiCheckPaymentDetails;
import com.robinhood.models.api.minerva.ApiCommitChangePinRequest;
import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.api.minerva.ApiDisputeQuestionnaire;
import com.robinhood.models.api.minerva.ApiDisputeValidationRequest;
import com.robinhood.models.api.minerva.ApiFilledForm;
import com.robinhood.models.api.minerva.ApiGooglePay;
import com.robinhood.models.api.minerva.ApiMerchant;
import com.robinhood.models.api.minerva.ApiMerchantUserCategory;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.api.minerva.ApiMinervaHistoryItem;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.api.minerva.ApiPreflightAction;
import com.robinhood.models.api.minerva.ApiRoutingDetails;
import com.robinhood.models.api.minerva.ApiSetRhyCardPreference;
import com.robinhood.models.api.minerva.ApiShippingUpdateRequest;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.models.api.minerva.ExternalResource;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import com.robinhood.models.api.minerva.SimpleDebitCardActionEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p479j$.time.Instant;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: Minerva.kt */
@Metadata(m3635d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\bH§@¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H§@¢\u0006\u0004\b\u001c\u0010\u0016J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b!\u0010 J\u001a\u0010#\u001a\u00020\u001b2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b#\u0010\fJ\"\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b%\u0010\u0007J\u001a\u0010&\u001a\u00020$2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b&\u0010\fJ\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b(\u0010\fJ\u001a\u0010*\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b*\u0010\fJ\u001a\u0010+\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b+\u0010\fJ\u001a\u0010-\u001a\u00020,2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\b-\u0010\fJ$\u0010/\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020.H§@¢\u0006\u0004\b/\u00100J$\u00102\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u000201H§@¢\u0006\u0004\b2\u00103J$\u00104\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u000201H§@¢\u0006\u0004\b4\u00103J$\u00105\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u000201H§@¢\u0006\u0004\b5\u00103J$\u00107\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u000206H§@¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020)2\b\b\u0001\u00109\u001a\u00020\bH§@¢\u0006\u0004\b:\u0010\fJ\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0004H§@¢\u0006\u0004\b<\u0010\u0016J$\u0010?\u001a\u00020)2\b\b\u0001\u00109\u001a\u00020\b2\b\b\u0001\u0010>\u001a\u00020=H§@¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020A2\b\b\u0001\u00109\u001a\u00020\bH§@¢\u0006\u0004\bB\u0010\fJ\u001a\u0010D\u001a\u00020C2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bD\u0010\fJ\u001a\u0010F\u001a\u00020E2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bF\u0010\fJ\u001a\u0010H\u001a\u00020G2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bH\u0010\fJF\u0010N\u001a\b\u0012\u0004\u0012\u00020E0\u00042\n\b\u0003\u0010I\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010K\u001a\u0004\u0018\u00010J2\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010M\u001a\u0004\u0018\u00010\u001dH§@¢\u0006\u0004\bN\u0010OJ\u001a\u0010P\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bP\u0010\fJ\u001a\u0010Q\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bQ\u0010\fJ\u001a\u0010S\u001a\u00020R2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bS\u0010\fJ\u001a\u0010T\u001a\u00020)2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bT\u0010\fJ\u0010\u0010V\u001a\u00020UH§@¢\u0006\u0004\bV\u0010\u0016J\u001a\u0010X\u001a\u00020)2\b\b\u0001\u0010\u0018\u001a\u00020WH§@¢\u0006\u0004\bX\u0010YJJ\u0010b\u001a\u00020)2\b\b\u0001\u0010[\u001a\u00020Z2\b\b\u0001\u0010\\\u001a\u00020Z2\b\b\u0001\u0010]\u001a\u00020Z2\b\b\u0001\u0010^\u001a\u00020Z2\u0010\b\u0001\u0010a\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_H§@¢\u0006\u0004\bb\u0010cJ\u001a\u0010e\u001a\u00020d2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\be\u0010\fJ\u001a\u0010g\u001a\u00020f2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bg\u0010\fJ$\u0010j\u001a\u00020i2\b\b\u0001\u0010\"\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020hH§@¢\u0006\u0004\bj\u0010kJ*\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u00042\b\b\u0001\u0010m\u001a\u00020l2\b\b\u0001\u0010n\u001a\u00020lH§@¢\u0006\u0004\bp\u0010qJ\u001a\u0010s\u001a\u00020)2\b\b\u0001\u0010\u0018\u001a\u00020rH§@¢\u0006\u0004\bs\u0010tJ\u001a\u0010v\u001a\u00020u2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bv\u0010\fJ\u001a\u0010w\u001a\u00020u2\b\b\u0001\u0010\"\u001a\u00020\bH§@¢\u0006\u0004\bw\u0010\fJ\u001a\u0010{\u001a\u00020z2\b\b\u0001\u0010y\u001a\u00020xH§@¢\u0006\u0004\b{\u0010|¨\u0006}"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Minerva;", "", "", "cursor", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount;", "getAccounts", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "accountId", "Lcom/robinhood/models/api/minerva/ApiRoutingDetails;", "getRoutingDetails", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount$ToggleLocationProtection;", CarResultComposable2.BODY, "toggleLocationProtection", "(Ljava/util/UUID;Lcom/robinhood/models/api/minerva/ApiMinervaAccount$ToggleLocationProtection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shippingUpdateRequestId", "Lcom/robinhood/models/api/minerva/ApiShippingUpdateRequest;", "getShippingUpdateRequest", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getRhyMigrationVariables", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiSetRhyCardPreference;", "request", "setRhyCardPreference", "(Lcom/robinhood/models/api/minerva/ApiSetRhyCardPreference;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiMinervaHistoryItem;", "getHistoryItems", "j$/time/Instant", "initiatedAt", "getNewerHistoryItems", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOlderHistoryItems", "id", "getHistoryItem", "Lcom/robinhood/models/api/minerva/ApiPaymentCard;", "getPaymentCards", "getPaymentCard", "Lcom/robinhood/models/api/minerva/ExternalResource;", "getPaymentCardImageUrl", "", "disableCard", "enableCard", "Lcom/robinhood/models/api/minerva/ApiChangePinParams;", "changePin", "Lcom/robinhood/models/api/minerva/ApiCommitChangePinRequest;", "commitPinChange", "(Ljava/util/UUID;Lcom/robinhood/models/api/minerva/ApiCommitChangePinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiPaymentCard$ReplaceCardRequest;", "reportCardDamaged", "(Ljava/util/UUID;Lcom/robinhood/models/api/minerva/ApiPaymentCard$ReplaceCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportCardLost", "reportCardStolen", "Lcom/robinhood/models/api/minerva/ApiPaymentCard$SwitchToPhysicalRequest;", "switchToPhysical", "(Ljava/util/UUID;Lcom/robinhood/models/api/minerva/ApiPaymentCard$SwitchToPhysicalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardId", "activateCard", "Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "getCardColorOptions", "Lcom/robinhood/models/api/ApiShippingAddress$Request;", "shippingAddress", "updateCardShippingAddress", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiShippingAddress$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiGooglePay;", "opcGooglePayProvisioning", "Lcom/robinhood/models/api/minerva/ApiPendingCardTransaction;", "getPendingCardTransaction", "Lcom/robinhood/models/api/minerva/ApiSettledCardTransaction;", "getSettledCardTransaction", "Lcom/robinhood/models/api/minerva/ApiDeclinedCardTransaction;", "getDeclinedCardTransaction", "aggregateMerchantId", "", "canDispute", "initiatedAtGte", "initiatedAtLte", "getSettledCardTransactions", "(Ljava/util/UUID;Ljava/lang/Boolean;Lj$/time/Instant;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markCardTransactionFraudulent", "markCardTransactionNotFraudulent", "Lcom/robinhood/models/api/minerva/ApiDispute;", "getDispute", "cancelDispute", "Lcom/robinhood/models/api/minerva/ApiDisputeQuestionnaire;", "getDisputeQuestionnaire", "Lcom/robinhood/models/api/minerva/ApiDisputeValidationRequest;", "validateDisputeQuestionResponse", "(Lcom/robinhood/models/api/minerva/ApiDisputeValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "minervaAccountId", "disputeReason", "settlementEvents", "questionnaireAnswers", "", "Lokhttp3/MultipartBody$Part;", "files", "submitDispute", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiMerchant;", "getMerchant", "Lcom/robinhood/models/api/minerva/ApiAggregateMerchant;", "getAggregateMerchant", "Lcom/robinhood/models/api/minerva/ApiMerchantUserCategory$Request;", "Lcom/robinhood/models/api/minerva/ApiMerchantUserCategory;", "setMerchantUserCategory", "(Ljava/util/UUID;Lcom/robinhood/models/api/minerva/ApiMerchantUserCategory$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "Lcom/robinhood/models/api/minerva/Atm;", "getAtmLocations", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiFilledForm;", "submitFilledForm", "(Lcom/robinhood/models/api/minerva/ApiFilledForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/minerva/ApiCheckPaymentDetails;", "getCheckDetails", "cancelCheck", "Lcom/robinhood/models/api/minerva/SimpleDebitCardActionEvent;", "action", "Lcom/robinhood/models/api/minerva/ApiPreflightAction;", "getPreflightAction", "(Lcom/robinhood/models/api/minerva/SimpleDebitCardActionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Minerva {
    @POST("cards/{id}/activate/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object activateCard(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("check_payments/{id}/cancel/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object cancelCheck(@Path("id") UUID uuid, Continuation<? super ApiCheckPaymentDetails> continuation);

    @PUT("cards/disputes/{id}/cancel/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object cancelDispute(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @GET("cards/{id}/change_pin/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object changePin(@Path("id") UUID uuid, Continuation<? super ApiChangePinParams> continuation);

    @POST("cards/{id}/commit_pin_change/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object commitPinChange(@Path("id") UUID uuid, @Body ApiCommitChangePinRequest apiCommitChangePinRequest, Continuation<? super Unit> continuation);

    @POST("cards/{id}/disable/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object disableCard(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("cards/{id}/enable/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object enableCard(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @GET("accounts/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getAccounts(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiMinervaAccount>> continuation);

    @GET("merchants/aggregate_merchants/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getAggregateMerchant(@Path("id") UUID uuid, Continuation<? super ApiAggregateMerchant> continuation);

    @GET("atms/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getAtmLocations(@Query("latitude") double d, @Query("longitude") double d2, Continuation<? super PaginatedResult<Atm>> continuation);

    @GET("cards/colors/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getCardColorOptions(Continuation<? super PaginatedResult<ApiCardColorOption>> continuation);

    @GET("check_payments/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getCheckDetails(@Path("id") UUID uuid, Continuation<? super ApiCheckPaymentDetails> continuation);

    @GET("cards/declined_transactions/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getDeclinedCardTransaction(@Path("id") UUID uuid, Continuation<? super ApiCardTransactions2> continuation);

    @GET("cards/disputes/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getDispute(@Path("id") UUID uuid, Continuation<? super ApiDispute> continuation);

    @GET("cards/disputes/questionnaires/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getDisputeQuestionnaire(Continuation<? super ApiDisputeQuestionnaire> continuation);

    @GET("history/transactions/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getHistoryItem(@Path("id") UUID uuid, Continuation<? super ApiMinervaHistoryItem> continuation);

    @GET("history/transactions/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getHistoryItems(Continuation<? super PaginatedResult<ApiMinervaHistoryItem>> continuation);

    @GET("merchants/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getMerchant(@Path("id") UUID uuid, Continuation<? super ApiMerchant> continuation);

    @GET("history/transactions/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getNewerHistoryItems(@Query("initiated_at[gte]") Instant instant, Continuation<? super PaginatedResult<ApiMinervaHistoryItem>> continuation);

    @GET("history/transactions/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getOlderHistoryItems(@Query("initiated_at[lte]") Instant instant, Continuation<? super PaginatedResult<ApiMinervaHistoryItem>> continuation);

    @GET("cards/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getPaymentCard(@Path("id") UUID uuid, Continuation<? super ApiPaymentCard> continuation);

    @GET("cards/{id}/get_card_image/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getPaymentCardImageUrl(@Path("id") UUID uuid, Continuation<? super ExternalResource> continuation);

    @GET("cards/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getPaymentCards(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiPaymentCard>> continuation);

    @GET("cards/pending_transactions/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getPendingCardTransaction(@Path("id") UUID uuid, Continuation<? super ApiCardTransactions3> continuation);

    @GET("cards/security/preflight_action/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getPreflightAction(@Query("action") SimpleDebitCardActionEvent simpleDebitCardActionEvent, Continuation<? super ApiPreflightAction> continuation);

    @GET("accounts/rhy_migration_variables/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRhyMigrationVariables(Continuation<? super RhyMigrationVariables> continuation);

    @GET("accounts/{accountId}/routing_details/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getRoutingDetails(@Path("accountId") UUID uuid, Continuation<? super ApiRoutingDetails> continuation);

    @GET("cards/settled_transactions/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getSettledCardTransaction(@Path("id") UUID uuid, Continuation<? super ApiCardTransactions4> continuation);

    @GET("cards/settled_transactions/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getSettledCardTransactions(@Query("aggregate_merchant_id") UUID uuid, @Query("can_dispute") Boolean bool, @Query("initiated_at__gte") Instant instant, @Query("initiated_at__lte") Instant instant2, Continuation<? super PaginatedResult<ApiCardTransactions4>> continuation);

    @GET("accounts/update_requests/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object getShippingUpdateRequest(@Path("id") UUID uuid, Continuation<? super ApiShippingUpdateRequest> continuation);

    @POST("cards/declined_transactions/{id}/mark_fraudulent/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object markCardTransactionFraudulent(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("cards/declined_transactions/{id}/mark_not_fraudulent/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object markCardTransactionNotFraudulent(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("cards/{id}/wallet_provisioning/google_pay/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object opcGooglePayProvisioning(@Path("id") UUID uuid, Continuation<? super ApiGooglePay> continuation);

    @POST("cards/{id}/report_damaged/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object reportCardDamaged(@Path("id") UUID uuid, @Body ApiPaymentCard.ReplaceCardRequest replaceCardRequest, Continuation<? super Unit> continuation);

    @POST("cards/{id}/report_lost/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object reportCardLost(@Path("id") UUID uuid, @Body ApiPaymentCard.ReplaceCardRequest replaceCardRequest, Continuation<? super Unit> continuation);

    @POST("cards/{id}/report_stolen/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object reportCardStolen(@Path("id") UUID uuid, @Body ApiPaymentCard.ReplaceCardRequest replaceCardRequest, Continuation<? super Unit> continuation);

    @POST("merchants/{id}/user_category/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object setMerchantUserCategory(@Path("id") UUID uuid, @Body ApiMerchantUserCategory.Request request, Continuation<? super ApiMerchantUserCategory> continuation);

    @POST("accounts/set_rhy_card_preference/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object setRhyCardPreference(@Body ApiSetRhyCardPreference apiSetRhyCardPreference, Continuation<? super ApiSetRhyCardPreference> continuation);

    @POST("cards/dispute_groups/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    @Multipart
    Object submitDispute(@Part("account") RequestBody requestBody, @Part("reason") RequestBody requestBody2, @Part("settlement_events") RequestBody requestBody3, @Part("questionnaire_answers") RequestBody requestBody4, @Part List<MultipartBody.Part> list, Continuation<? super Unit> continuation);

    @POST("direct_deposit/filled_form/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object submitFilledForm(@Body ApiFilledForm apiFilledForm, Continuation<? super Unit> continuation);

    @POST("cards/{id}/switch_to_physical/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object switchToPhysical(@Path("id") UUID uuid, @Body ApiPaymentCard.SwitchToPhysicalRequest switchToPhysicalRequest, Continuation<? super Unit> continuation);

    @PATCH("accounts/{accountId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object toggleLocationProtection(@Path("accountId") UUID uuid, @Body ApiMinervaAccount.ToggleLocationProtection toggleLocationProtection, Continuation<? super ApiMinervaAccount> continuation);

    @POST("cards/{id}/update_shipping_address/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object updateCardShippingAddress(@Path("id") UUID uuid, @Body ApiShippingAddress.Request request, Continuation<? super Unit> continuation);

    @PUT("cards/disputes/validate_question/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object validateDisputeQuestionResponse(@Body ApiDisputeValidationRequest apiDisputeValidationRequest, Continuation<? super Unit> continuation);

    /* compiled from: Minerva.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAccounts$default(Minerva minerva, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccounts");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return minerva.getAccounts(str, continuation);
        }

        public static /* synthetic */ Object getPaymentCards$default(Minerva minerva, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaymentCards");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return minerva.getPaymentCards(str, continuation);
        }

        public static /* synthetic */ Object getSettledCardTransactions$default(Minerva minerva, UUID uuid, Boolean bool, Instant instant, Instant instant2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSettledCardTransactions");
            }
            if ((i & 1) != 0) {
                uuid = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                instant = null;
            }
            if ((i & 8) != 0) {
                instant2 = null;
            }
            return minerva.getSettledCardTransactions(uuid, bool, instant, instant2, continuation);
        }
    }
}
