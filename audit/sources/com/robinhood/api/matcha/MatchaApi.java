package com.robinhood.api.matcha;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import com.robinhood.android.models.matcha.api.ApiEncryptedUserId;
import com.robinhood.android.models.matcha.api.ApiFullTransactionListResponse;
import com.robinhood.android.models.matcha.api.ApiLatestSoftAttribution;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchRequestRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchTransfer;
import com.robinhood.android.models.matcha.api.ApiMatchaBatchTransferRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaIncentives;
import com.robinhood.android.models.matcha.api.ApiMatchaIncentivesSummary;
import com.robinhood.android.models.matcha.api.ApiMatchaLaunchPromo;
import com.robinhood.android.models.matcha.api.ApiMatchaRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaRequestRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaRestrictionResponse;
import com.robinhood.android.models.matcha.api.ApiMatchaSendRequest;
import com.robinhood.android.models.matcha.api.ApiMatchaTransaction;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.models.matcha.api.ApiMatchaTreatment;
import com.robinhood.android.models.matcha.api.ApiMemoBanList;
import com.robinhood.android.models.matcha.api.ApiReferralShareText;
import com.robinhood.android.models.matcha.api.ApiRequestAcceptRequest;
import com.robinhood.android.models.matcha.api.ApiRequestAcceptResponse;
import com.robinhood.android.models.matcha.api.ApiRequestAttributeResponse;
import com.robinhood.android.models.matcha.api.ApiRhyAccountCheck;
import com.robinhood.android.models.matcha.api.ApiSearchUsersResponse;
import com.robinhood.android.models.matcha.api.ApiTransferAttributeResponse;
import com.robinhood.android.models.matcha.api.ApiUserLimits;
import com.robinhood.android.models.matcha.api.MatchaAdditionalPagesResponse;
import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.android.models.matcha.api.MatchaTransferRole;
import com.robinhood.android.models.matcha.api.profile.ApiMiniProfileResponse;
import com.robinhood.android.regiongate.P2pRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: MatchaApi.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 i2\u00020\u0001:\u0001iJ\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001d\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\f\u001a\u00020\u0016H§@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u0004\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0004\u001a\u00020'H§@¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020\"2\b\b\u0001\u0010*\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\"\u0010+\u001a\u00020,2\b\b\u0001\u0010*\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020-H§@¢\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\"2\b\b\u0001\u0010*\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u00100\u001a\u00020\"2\b\b\u0001\u0010*\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u00101\u001a\u0002022\b\b\u0001\u0010*\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u00103\u001a\u00020\u001f2\b\b\u0001\u0010*\u001a\u00020\u0016H§@¢\u0006\u0002\u0010 J4\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0002\u0010\u0017J4\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00102\b\b\u0001\u00107\u001a\u00020\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0002\u00108J\u0018\u00109\u001a\u00020:2\b\b\u0001\u00107\u001a\u00020\u0016H§@¢\u0006\u0002\u0010 J\"\u0010;\u001a\u00020<2\b\b\u0001\u0010=\u001a\u00020\r2\b\b\u0001\u0010>\u001a\u00020?H§@¢\u0006\u0002\u0010@J\"\u0010A\u001a\u00020B2\b\b\u0001\u0010C\u001a\u00020\u00162\b\b\u0001\u0010D\u001a\u00020EH§@¢\u0006\u0002\u0010FJ\u000e\u0010G\u001a\u00020BH§@¢\u0006\u0002\u0010HJ\u0018\u0010I\u001a\u00020J2\b\b\u0001\u00107\u001a\u00020\u0016H§@¢\u0006\u0002\u0010 J\u0018\u0010K\u001a\u00020L2\b\b\u0001\u00107\u001a\u00020\u0016H§@¢\u0006\u0002\u0010 J\u000e\u0010M\u001a\u00020NH§@¢\u0006\u0002\u0010HJ\u0018\u0010O\u001a\u00020<2\b\b\u0001\u0010\u0004\u001a\u00020PH§@¢\u0006\u0002\u0010QJ\u000e\u0010R\u001a\u00020SH§@¢\u0006\u0002\u0010HJ\u000e\u0010T\u001a\u00020UH§@¢\u0006\u0002\u0010HJ\u000e\u0010V\u001a\u00020WH§@¢\u0006\u0002\u0010HJ\u000e\u0010X\u001a\u00020YH§@¢\u0006\u0002\u0010HJ\u000e\u0010Z\u001a\u00020[H§@¢\u0006\u0002\u0010HJ\u000e\u0010\\\u001a\u00020]H§@¢\u0006\u0002\u0010HJ\u000e\u0010^\u001a\u00020_H§@¢\u0006\u0002\u0010HJ\u000e\u0010`\u001a\u00020aH§@¢\u0006\u0002\u0010HJ\u0018\u0010b\u001a\u00020c2\b\b\u0001\u0010d\u001a\u00020eH§@¢\u0006\u0002\u0010fJ\u000e\u0010g\u001a\u00020hH§@¢\u0006\u0002\u0010H¨\u0006j"}, m3636d2 = {"Lcom/robinhood/api/matcha/MatchaApi;", "", "createTransfer", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;", "request", "Lcom/robinhood/android/models/matcha/api/ApiMatchaSendRequest;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaSendRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBatchTransfer", "Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchTransfer;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchTransferRequest;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchTransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransfer", "transferId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransfers", "Lcom/robinhood/models/PaginatedResult;", "role", "Lcom/robinhood/android/models/matcha/api/MatchaTransferRole;", "pageSize", "", "cursor", "", "(Lcom/robinhood/android/models/matcha/api/MatchaTransferRole;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attributeTransfer", "Lcom/robinhood/android/models/matcha/api/ApiTransferAttributeResponse;", "claimTransfer", "declineTransfer", "cancelTransfer", "continueTransferPostVerification", "getAdditionalTransferPages", "Lcom/robinhood/android/models/matcha/api/MatchaAdditionalPagesResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRequest", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequest;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRequestRequest;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaRequestRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBatchRequest", "Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchRequest;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchRequestRequest;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaBatchRequestRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRequest", "requestId", "acceptRequest", "Lcom/robinhood/android/models/matcha/api/ApiRequestAcceptResponse;", "Lcom/robinhood/android/models/matcha/api/ApiRequestAcceptRequest;", "(Ljava/util/UUID;Lcom/robinhood/android/models/matcha/api/ApiRequestAcceptRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "declineRequest", "cancelRequest", "attributeRequest", "Lcom/robinhood/android/models/matcha/api/ApiRequestAttributeResponse;", "getAdditionalRequestPages", "getPendingTransactions", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransaction;", "getPendingTransactionsBetween", "userId", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFullTransactionList", "Lcom/robinhood/android/models/matcha/api/ApiFullTransactionListResponse;", "remindTransaction", "", "id", "type", "Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;", "(Ljava/util/UUID;Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUsers", "Lcom/robinhood/android/models/matcha/api/ApiSearchUsersResponse;", "query", "mergeResults", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchEmptyState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMiniProfile", "Lcom/robinhood/android/models/matcha/api/profile/ApiMiniProfileResponse;", "getUserSocialProfile", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "getEncryptedUserId", "Lcom/robinhood/android/models/matcha/api/ApiEncryptedUserId;", "createAbuseReport", "Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest;", "(Lcom/robinhood/android/models/matcha/api/ApiCreateAbuseReportRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMemoBanList", "Lcom/robinhood/android/models/matcha/api/ApiMemoBanList;", "getReferralShareText", "Lcom/robinhood/android/models/matcha/api/ApiReferralShareText;", "getLatestSoftAttribution", "Lcom/robinhood/android/models/matcha/api/ApiLatestSoftAttribution;", "getHasRhyAccountOrApplication", "Lcom/robinhood/android/models/matcha/api/ApiRhyAccountCheck;", "getLimits", "Lcom/robinhood/android/models/matcha/api/ApiUserLimits;", "getTreatment", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTreatment;", "getIncentives", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIncentives;", "getIncentivesSummary", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIncentivesSummary;", "getRestriction", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRestrictionResponse;", "flow", "Lcom/robinhood/android/models/matcha/api/ApiMatchaRestrictionResponse$Flow;", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaRestrictionResponse$Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLaunchPromo", "Lcom/robinhood/android/models/matcha/api/ApiMatchaLaunchPromo;", "Companion", "lib-api-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface MatchaApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Headers({"X-Read-Timeout-Seconds-Override: 30", "X-Write-Timeout-Seconds-Override: 30"})
    @POST("p2p/request/accept/{request_id}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object acceptRequest(@Path("request_id") UUID uuid, @Body ApiRequestAcceptRequest apiRequestAcceptRequest, Continuation<? super ApiRequestAcceptResponse> continuation);

    @POST("p2p/request/{request_id}/attribute/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object attributeRequest(@Path("request_id") UUID uuid, Continuation<? super ApiRequestAttributeResponse> continuation);

    @POST("p2p/transfer/{transfer_id}/attribute/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object attributeTransfer(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiTransferAttributeResponse> continuation);

    @POST("p2p/request/cancel/{request_id}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object cancelRequest(@Path("request_id") UUID uuid, Continuation<? super ApiMatchaRequest> continuation);

    @POST("p2p/transfer/{transfer_id}/cancel/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object cancelTransfer(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiMatchaTransfer> continuation);

    @POST("p2p/transfer/{transfer_id}/claim/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object claimTransfer(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiMatchaTransfer> continuation);

    @POST("p2p/transfer/{transfer_id}/continue_post_suv/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object continueTransferPostVerification(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiMatchaTransfer> continuation);

    @POST("moderation/report/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object createAbuseReport(@Body ApiCreateAbuseReportRequest apiCreateAbuseReportRequest, Continuation<? super Unit> continuation);

    @POST("p2p/request/batch/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object createBatchRequest(@Body ApiMatchaBatchRequestRequest apiMatchaBatchRequestRequest, Continuation<? super ApiMatchaBatchRequest> continuation);

    @POST("p2p/transfer/batch/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object createBatchTransfer(@Body ApiMatchaBatchTransferRequest apiMatchaBatchTransferRequest, Continuation<? super ApiMatchaBatchTransfer> continuation);

    @POST("p2p/request/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object createRequest(@Body ApiMatchaRequestRequest apiMatchaRequestRequest, Continuation<? super ApiMatchaRequest> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 30", "X-Write-Timeout-Seconds-Override: 30"})
    @POST("p2p/send/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object createTransfer(@Body ApiMatchaSendRequest apiMatchaSendRequest, Continuation<? super ApiMatchaTransfer> continuation);

    @POST("p2p/request/decline/{request_id}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object declineRequest(@Path("request_id") UUID uuid, Continuation<? super ApiMatchaRequest> continuation);

    @POST("p2p/transfer/{transfer_id}/decline/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object declineTransfer(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiMatchaTransfer> continuation);

    @GET("p2p/request/{request_id}/additional_pages")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getAdditionalRequestPages(@Path("request_id") String str, Continuation<? super MatchaAdditionalPagesResponse> continuation);

    @GET("p2p/transfer/{transfer_id}/additional_pages")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getAdditionalTransferPages(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) String str, Continuation<? super MatchaAdditionalPagesResponse> continuation);

    @GET("p2p/encrypted_user_id/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getEncryptedUserId(Continuation<? super ApiEncryptedUserId> continuation);

    @GET("p2p/full_transaction_list/{user_id}")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getFullTransactionList(@Path(MatchaQrCodeDuxo6.USER_ID_KEY) String str, Continuation<? super ApiFullTransactionListResponse> continuation);

    @GET("rhy/account-check/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getHasRhyAccountOrApplication(Continuation<? super ApiRhyAccountCheck> continuation);

    @GET("p2p/incentives")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getIncentives(Continuation<? super ApiMatchaIncentives> continuation);

    @GET("p2p/incentives/summary")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getIncentivesSummary(Continuation<? super ApiMatchaIncentivesSummary> continuation);

    @GET("p2p/latest_soft_attribution/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getLatestSoftAttribution(Continuation<? super ApiLatestSoftAttribution> continuation);

    @GET("p2p/launch_messaging")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getLaunchPromo(Continuation<? super ApiMatchaLaunchPromo> continuation);

    @GET("p2p/limits")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getLimits(Continuation<? super ApiUserLimits> continuation);

    @GET("p2p/memo/banlist")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getMemoBanList(Continuation<? super ApiMemoBanList> continuation);

    @GET("p2p/mini_profile/{user_id}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getMiniProfile(@Path(MatchaQrCodeDuxo6.USER_ID_KEY) String str, Continuation<? super ApiMiniProfileResponse> continuation);

    @GET("p2p/transactions/pending/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getPendingTransactions(@Query("role") MatchaTransferRole matchaTransferRole, @Query("page_size") int i, @Query("cursor") String str, Continuation<? super PaginatedResult<? extends ApiMatchaTransaction>> continuation);

    @GET("p2p/transactionsBetween/pending/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getPendingTransactionsBetween(@Query("transaction_with_user_uuid") String str, @Query("page_size") int i, @Query("cursor") String str2, Continuation<? super PaginatedResult<? extends ApiMatchaTransaction>> continuation);

    @GET("p2p/referral/share_text")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getReferralShareText(Continuation<? super ApiReferralShareText> continuation);

    @GET("p2p/request/{request_id}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getRequest(@Path("request_id") UUID uuid, Continuation<? super ApiMatchaRequest> continuation);

    @GET("p2p/restrictions")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getRestriction(@Query("flow") ApiMatchaRestrictionResponse.Flow flow, Continuation<? super ApiMatchaRestrictionResponse> continuation);

    @GET("search/users/empty_state")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getSearchEmptyState(Continuation<? super ApiSearchUsersResponse> continuation);

    @GET("p2p/transfer/{transfer_id}")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getTransfer(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiMatchaTransfer> continuation);

    @GET("p2p/transfers/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getTransfers(@Query("role") MatchaTransferRole matchaTransferRole, @Query("page_size") int i, @Query("cursor") String str, Continuation<? super PaginatedResult<ApiMatchaTransfer>> continuation);

    @GET("p2p/treatment")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getTreatment(Continuation<? super ApiMatchaTreatment> continuation);

    @GET("social/user_profile/{user_id}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object getUserSocialProfile(@Path(MatchaQrCodeDuxo6.USER_ID_KEY) String str, Continuation<? super ApiSocialProfileInfo> continuation);

    @POST("p2p/remind/{transaction_id}/{transaction_type}/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object remindTransaction(@Path("transaction_id") UUID uuid, @Path("transaction_type") MatchaTransactionType matchaTransactionType, Continuation<? super Unit> continuation);

    @GET("search/users/")
    @RequiresRegionGate(regionGates = {P2pRegionGate.class})
    Object searchUsers(@Query("query") String str, @Query("merge_results") boolean z, Continuation<? super ApiSearchUsersResponse> continuation);

    /* compiled from: MatchaApi.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/api/matcha/MatchaApi$Companion;", "", "<init>", "()V", "TRANSFER_TIMEOUT", "", "lib-api-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int TRANSFER_TIMEOUT = 30;

        private Companion() {
        }
    }
}
