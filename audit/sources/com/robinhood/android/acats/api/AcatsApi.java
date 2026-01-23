package com.robinhood.android.acats.api;

import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsAccountEligibilityValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsAccountNumberValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsBonusModalContentResponse;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.ApiAcatsDetailPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsDtcNumberValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationRequest;
import com.robinhood.models.api.bonfire.ApiAcatsOptionValidationResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransferRequest;
import com.robinhood.models.api.bonfire.ApiAcatsValidationResponse;
import com.robinhood.models.api.bonfire.ApiAcatsWelcomeContents;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.models.api.bonfire.ApiSearchBrokeragesResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidAccountNumberResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenRequest;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenResponse;
import com.robinhood.models.api.bonfire.plaid.brokerassets.ApiAcatsInBrokerAssetsResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AcatsApi.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00182\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u000f\u001a\u00020 H§@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u001f2\b\b\u0001\u0010\u000f\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\u001f2\b\b\u0001\u0010\u000f\u001a\u00020&H§@¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020)2\b\b\u0001\u0010\u000f\u001a\u00020*H§@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020-H§@¢\u0006\u0002\u0010.J,\u0010/\u001a\u0002002\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u00020\u0006H§@¢\u0006\u0002\u00103J\u000e\u00104\u001a\u000205H§@¢\u0006\u0002\u0010.J\u0018\u00106\u001a\u0002072\b\b\u0001\u0010\u0015\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0019J\u000e\u00108\u001a\u000209H§@¢\u0006\u0002\u0010.J\u000e\u0010:\u001a\u00020;H§@¢\u0006\u0002\u0010.J:\u0010<\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020\u00062\b\b\u0001\u0010?\u001a\u00020\u00062\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010BJ\u0018\u0010C\u001a\u00020D2\b\b\u0001\u0010\u000f\u001a\u00020EH§@¢\u0006\u0002\u0010F¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/acats/api/AcatsApi;", "", "getAcatsTransfers", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer;", "paginationCursor", "", "bothDirections", "", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAcatsTransfer", "acatId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAcatsTransferRequest", "request", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "(Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchBrokerages", "Lcom/robinhood/models/api/bonfire/ApiSearchBrokeragesResponse;", "query", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAcatDetailPage", "Lcom/robinhood/models/api/bonfire/ApiAcatsDetailPageResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAcatOutDetailPage", "rhsAccountNumber", "getAcatListPage", "Lcom/robinhood/models/api/bonfire/ApiAcatsListPageResponse;", "postAccountEligibilityRequest", "Lcom/robinhood/models/api/bonfire/ApiAcatsValidationResponse;", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountEligibilityValidationRequest;", "(Lcom/robinhood/models/api/bonfire/ApiAcatsAccountEligibilityValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postDtcNumberValidationRequest", "Lcom/robinhood/models/api/bonfire/ApiAcatsDtcNumberValidationRequest;", "(Lcom/robinhood/models/api/bonfire/ApiAcatsDtcNumberValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAccountNumberValidationRequest", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountNumberValidationRequest;", "(Lcom/robinhood/models/api/bonfire/ApiAcatsAccountNumberValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postOptionValidationRequest", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationResponse;", "Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationRequest;", "(Lcom/robinhood/models/api/bonfire/ApiAcatsOptionValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWelcomeContents", "Lcom/robinhood/models/api/bonfire/ApiAcatsWelcomeContents;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaidBrokerAssets", "Lcom/robinhood/models/api/bonfire/plaid/brokerassets/ApiAcatsInBrokerAssetsResponse;", "contraAccountNumber", "accessTokenId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableDestinations", "Lcom/robinhood/models/api/bonfire/ApiAvailableDestinationsResponse;", "getAccountContents", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse;", "getBonusPromoInfo", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusPromoInfo;", "getBonusModal", "Lcom/robinhood/models/api/bonfire/ApiAcatsBonusModalContentResponse;", "getPlaidLinkToken", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenResponse;", "rhAccountNumber", "contraDtccNumber", "plaidInstitutionId", "androidPackageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPlaidLinkToken", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidAccountNumberResponse;", "Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenRequest;", "(Lcom/robinhood/models/api/bonfire/plaid/ApiAcatsInPlaidTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-acats-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsApi {
    @GET("acats/detail/{acat_id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getAcatDetailPage(@Path("acat_id") String str, Continuation<? super ApiAcatsDetailPageResponse> continuation);

    @GET("acats/detail/assets/{acat_id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getAcatListPage(@Path("acat_id") String str, Continuation<? super ApiAcatsListPageResponse> continuation);

    @GET("acats/detail/out/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getAcatOutDetailPage(@Query("rhs_account_number") String str, Continuation<? super ApiAcatsDetailPageResponse> continuation);

    @GET("acats/{acats_id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getAcatsTransfer(@Path("acats_id") UUID uuid, Continuation<? super ApiAcatsTransfer> continuation);

    @GET("acats/")
    @RequiresRegionGate(regionGates = {AcatsRegionGate.class})
    Object getAcatsTransfers(@Query("cursor") String str, @Query("both_directions") Boolean bool, Continuation<? super PaginatedResult<ApiAcatsTransfer>> continuation);

    @GET("portfolio/acats/in/account-contents")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getAccountContents(@Query("account_number") String str, Continuation<? super ApiAcatsAccountContentsResponse> continuation);

    @GET("portfolio/acats/available-accounts")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getAvailableDestinations(Continuation<? super ApiAvailableDestinationsResponse> continuation);

    @GET("portfolio/acats/bonus-modal/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getBonusModal(Continuation<? super ApiAcatsBonusModalContentResponse> continuation);

    @GET("portfolio/acats/bonus-promo-info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getBonusPromoInfo(Continuation<? super ApiAcatsBonusPromoInfo> continuation);

    @GET("acats/in/plaid/{account_number}/{brokerage_number}/assets/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getPlaidBrokerAssets(@Path("account_number") String str, @Path("brokerage_number") String str2, @Query("access_token_id") String str3, Continuation<? super ApiAcatsInBrokerAssetsResponse> continuation);

    @GET("acats/plaid/token/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getPlaidLinkToken(@Query("rh_account_number") String str, @Query("contra_dtcc_number") String str2, @Query("plaid_institution_id") String str3, @Query("android_package_name") String str4, Continuation<? super ApiAcatsInPlaidTokenResponse> continuation);

    @GET("portfolio/acats/welcome-contents")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object getWelcomeContents(Continuation<? super ApiAcatsWelcomeContents> continuation);

    @POST("acats/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object postAcatsTransferRequest(@Body ApiAcatsTransferRequest apiAcatsTransferRequest, Continuation<? super ApiAcatsTransfer> continuation);

    @POST("acats/validation/account_eligibility/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object postAccountEligibilityRequest(@Body ApiAcatsAccountEligibilityValidationRequest apiAcatsAccountEligibilityValidationRequest, Continuation<? super ApiAcatsValidationResponse> continuation);

    @POST("acats/validation/contra_account_number/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object postAccountNumberValidationRequest(@Body ApiAcatsAccountNumberValidationRequest apiAcatsAccountNumberValidationRequest, Continuation<? super ApiAcatsValidationResponse> continuation);

    @POST("acats/validation/contra_dtcc_number/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object postDtcNumberValidationRequest(@Body ApiAcatsDtcNumberValidationRequest apiAcatsDtcNumberValidationRequest, Continuation<? super ApiAcatsValidationResponse> continuation);

    @POST("acats/validation/options/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object postOptionValidationRequest(@Body ApiAcatsOptionValidationRequest apiAcatsOptionValidationRequest, Continuation<? super ApiAcatsOptionValidationResponse> continuation);

    @POST("acats/plaid/token/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object postPlaidLinkToken(@Body ApiAcatsInPlaidTokenRequest apiAcatsInPlaidTokenRequest, Continuation<? super ApiAcatsInPlaidAccountNumberResponse> continuation);

    @GET("acats/search_brokers/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AcatsRegionGate.class})
    Object searchBrokerages(@Query("query") String str, @Query("account_number") String str2, Continuation<? super ApiSearchBrokeragesResponse> continuation);

    /* compiled from: AcatsApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAcatsTransfers$default(AcatsApi acatsApi, String str, Boolean bool, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAcatsTransfers");
            }
            if ((i & 2) != 0) {
                bool = Boolean.TRUE;
            }
            return acatsApi.getAcatsTransfers(str, bool, continuation);
        }
    }
}
