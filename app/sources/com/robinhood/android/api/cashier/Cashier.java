package com.robinhood.android.api.cashier;

import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.ApiDepositSchedule;
import com.robinhood.models.api.cashier.ApiCreateIavRelationshipRequest;
import com.robinhood.models.api.cashier.ApiCreateQueuedAchDepositRequest;
import com.robinhood.models.api.cashier.ApiDirectDepositSwitchStatus;
import com.robinhood.models.api.cashier.ApiPlaidAccessToken;
import com.robinhood.models.api.cashier.ApiPlaidPublicToken;
import com.robinhood.models.api.cashier.AtomicAccessToken;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: Cashier.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 @2\u00020\u0001:\u0001@J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J@\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\b\b\u0001\u0010\u001c\u001a\u00020 H§@¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\b\b\u0001\u0010\u001c\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020&2\b\b\u0001\u0010'\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001a2\b\b\u0001\u0010)\u001a\u00020*H§@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u0011H§@¢\u0006\u0002\u0010-J \u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\b\b\u0001\u0010\u001c\u001a\u000201H§@¢\u0006\u0002\u00102J\u0018\u00103\u001a\u00020\u00112\b\b\u0001\u00104\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u000e\u00105\u001a\u000206H§@¢\u0006\u0002\u0010-J\u000e\u00107\u001a\u000208H§@¢\u0006\u0002\u0010-J \u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010;\u001a\u00020:2\b\b\u0001\u0010\u001c\u001a\u00020<H§@¢\u0006\u0002\u0010=J\"\u0010>\u001a\u00020:2\b\b\u0001\u00104\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020<H§@¢\u0006\u0002\u0010?¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/Cashier;", "", "getAchRelationships", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAchRelationship;", "paginationCursor", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAchRelationship", "accountId", "routingNumber", "bankAccountNumber", "bankAccountType", "Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;", "accountHolderName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiAchRelationship$BankAccountType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlinkAchRelationship", "", "relationshipId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyMicrodeposits", "firstAmount", "secondAmount", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchangeIavAccessToken", "Lretrofit2/Response;", "Lcom/robinhood/models/api/cashier/ApiPlaidAccessToken;", "request", "Lcom/robinhood/models/api/cashier/ApiPlaidPublicToken;", "(Lcom/robinhood/models/api/cashier/ApiPlaidPublicToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIavRelationship", "Lcom/robinhood/models/api/cashier/ApiCreateIavRelationshipRequest;", "(Lcom/robinhood/models/api/cashier/ApiCreateIavRelationshipRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createQueuedDeposit", "Lcom/robinhood/models/api/cashier/ApiCreateQueuedAchDepositRequest;", "(Lcom/robinhood/models/api/cashier/ApiCreateQueuedAchDepositRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAchTransfer", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer;", "achTransferId", "postAchTransfer", "achTransferRequest", "Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer$Request;", "(Lcom/robinhood/transfers/api/ApiPaymentTransferDetails$ApiAchTransfer$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQueuedAchVerification", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutomaticDeposits", "Lcom/robinhood/models/api/ApiAutomaticDeposit;", "addAutomaticDeposit", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Request;", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAutomaticDeposit", "id", "getAtomicAccessToken", "Lcom/robinhood/models/api/cashier/AtomicAccessToken;", "getDirectDepositSwitchStatus", "Lcom/robinhood/models/api/cashier/ApiDirectDepositSwitchStatus;", "getDepositSchedules", "Lcom/robinhood/models/api/ApiDepositSchedule;", "addDepositSchedule", "Lcom/robinhood/models/api/ApiDepositSchedule$Request;", "(Lcom/robinhood/models/api/ApiDepositSchedule$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDepositSchedule", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiDepositSchedule$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Cashier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @POST("ach/deposit_schedules/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object addAutomaticDeposit(@Body ApiAutomaticDeposit.Request request, Continuation<? super Response<ApiAutomaticDeposit>> continuation);

    @POST("deposit_schedules/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object addDepositSchedule(@Body ApiDepositSchedule.Request request, Continuation<? super ApiDepositSchedule> continuation);

    @FormUrlEncoded
    @POST("ach/relationships/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object createAchRelationship(@Field("account") String str, @Field("bank_routing_number") String str2, @Field("bank_account_number") String str3, @Field("bank_account_type") ApiAchRelationship.BankAccountType bankAccountType, @Field("bank_account_holder_name") String str4, Continuation<? super ApiAchRelationship> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 90", "X-Write-Timeout-Seconds-Override: 90"})
    @POST("iav/v2/ach_relationship/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object createIavRelationship(@Body ApiCreateIavRelationshipRequest apiCreateIavRelationshipRequest, Continuation<? super Response<ApiAchRelationship>> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 60", "X-Write-Timeout-Seconds-Override: 60"})
    @POST("iav/v2/queued_deposit/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object createQueuedDeposit(@Body ApiCreateQueuedAchDepositRequest apiCreateQueuedAchDepositRequest, Continuation<? super Response<Unit>> continuation);

    @DELETE("ach/deposit_schedules/{automaticDepositId}/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object deleteAutomaticDeposit(@Path("automaticDepositId") String str, Continuation<? super Unit> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 60", "X-Write-Timeout-Seconds-Override: 60"})
    @POST("iav/v2/exchange_token/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object exchangeIavAccessToken(@Body ApiPlaidPublicToken apiPlaidPublicToken, Continuation<? super Response<ApiPlaidAccessToken>> continuation);

    @GET("public/ach/relationships/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getAchRelationships(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiAchRelationship>> continuation);

    @GET("ach/transfers/{achTransferId}/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getAchTransfer(@Path("achTransferId") String str, Continuation<? super ApiPaymentTransferDetails.ApiAchTransfer> continuation);

    @POST("atomic/access_token/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getAtomicAccessToken(Continuation<? super AtomicAccessToken> continuation);

    @GET("ach/deposit_schedules/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getAutomaticDeposits(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiAutomaticDeposit>> continuation);

    @GET("deposit_schedules/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getDepositSchedules(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiDepositSchedule>> continuation);

    @GET("atomic/direct_deposit_switch_status/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getDirectDepositSwitchStatus(Continuation<? super ApiDirectDepositSwitchStatus> continuation);

    @GET("ach/queued_deposit/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object getQueuedAchVerification(Continuation<? super Unit> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 30", "X-Write-Timeout-Seconds-Override: 30"})
    @POST("ach/transfers/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object postAchTransfer(@Body ApiPaymentTransferDetails.ApiAchTransfer.Request request, Continuation<? super Response<ApiPaymentTransferDetails.ApiAchTransfer>> continuation);

    @POST("ach/relationships/{id}/unlink/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object unlinkAchRelationship(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @PATCH("deposit_schedules/{id}/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object updateDepositSchedule(@Path("id") String str, @Body ApiDepositSchedule.Request request, Continuation<? super ApiDepositSchedule> continuation);

    @FormUrlEncoded
    @POST("ach/relationships/{id}/micro_deposits/verify/")
    @RequiresRegionGate(regionGates = {MoneyMovementsUsRegionGate.class})
    Object verifyMicrodeposits(@Path("id") UUID uuid, @Field("first_amount_cents") String str, @Field("second_amount_cents") String str2, Continuation<? super Unit> continuation);

    /* compiled from: Cashier.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/Cashier$Companion;", "", "<init>", "()V", "TIMEOUT_3O_SECONDS", "", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int TIMEOUT_3O_SECONDS = 30;

        private Companion() {
        }
    }
}
