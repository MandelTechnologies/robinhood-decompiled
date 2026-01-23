package com.robinhood.api.retrofit;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.api.ApiSettingsToggleUpdateRequest;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ApiProfileAccountBreakdown;
import com.robinhood.models.api.ApiShippingAddress;
import com.robinhood.models.api.bonfire.ApiEmployerType;
import com.robinhood.models.api.bonfire.ApiEtpDetails;
import com.robinhood.models.api.bonfire.ApiFeatureDiscoveryResponse;
import com.robinhood.models.api.bonfire.ApiInstantDepositInfo;
import com.robinhood.models.api.bonfire.ApiInstrumentDisclosure;
import com.robinhood.models.api.bonfire.ApiListDisclosure;
import com.robinhood.models.api.bonfire.ApiMarginRequirements;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.api.bonfire.ApiTaxFormResubmissionStatus;
import com.robinhood.models.api.bonfire.waitlist.ApiWaitlistSpot;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdown;
import com.robinhood.models.api.phoenix.ApiUnifiedAccountV2;
import com.robinhood.models.serverdriven.experimental.api.ApiSduiPlayground;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BonfireApi.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J$\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0014J\"\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0011J\"\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001eJ$\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020&H§@¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H§@¢\u0006\u0002\u0010\nJ\u0018\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010.\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000\bH§@¢\u0006\u0002\u0010\nJ\u0018\u00101\u001a\u0002002\b\b\u0001\u00102\u001a\u000203H§@¢\u0006\u0002\u00104J\u0018\u00105\u001a\u0002062\b\b\u0001\u00107\u001a\u000208H§@¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020;H§@¢\u0006\u0002\u0010\nJ*\u0010<\u001a\b\u0012\u0004\u0012\u00020=0)2\b\b\u0001\u0010>\u001a\u00020\u00052\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\"J\u0018\u0010?\u001a\u00020@2\b\b\u0001\u0010A\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0014¨\u0006B"}, m3636d2 = {"Lcom/robinhood/api/retrofit/BonfireApi;", "", "getInstantDepositAdditionalInfo", "Lcom/robinhood/models/api/bonfire/ApiInstantDepositInfo;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnifiedAccounts", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/phoenix/ApiUnifiedAccountV2;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWithdrawableAmountBreakdown", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdown;", "getInstrumentDisclosure", "Lcom/robinhood/models/api/bonfire/ApiInstrumentDisclosure;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstrumentDetail", "Lcom/robinhood/models/api/bonfire/ApiStockDetail;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEtpDetails", "Lcom/robinhood/models/api/bonfire/ApiEtpDetails;", "getMarginRequirements", "Lcom/robinhood/models/api/bonfire/ApiMarginRequirements;", "getListDisclosure", "Lcom/robinhood/models/api/bonfire/ApiListDisclosure;", "listId", "ownerType", "Lcom/robinhood/models/api/ApiCuratedList$OwnerType;", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiCuratedList$OwnerType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSettingsPage", "Lcom/robinhood/android/settings/models/api/ApiSettingsPage;", "pageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateToggleSetting", "", "request", "Lcom/robinhood/android/settings/models/api/ApiSettingsToggleUpdateRequest;", "(Lcom/robinhood/android/settings/models/api/ApiSettingsToggleUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileAccountBreakdown", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiProfileAccountBreakdown;", "getWaitlistSpot", "Lcom/robinhood/models/api/bonfire/waitlist/ApiWaitlistSpot;", "waitlistName", "joinWaitlist", "getShippingAddresses", "Lcom/robinhood/models/api/ApiShippingAddress;", "addShippingAddress", PlaceTypes.ADDRESS, "Lcom/robinhood/models/api/ApiShippingAddress$Request;", "(Lcom/robinhood/models/api/ApiShippingAddress$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployerTypes", "Lcom/robinhood/models/api/bonfire/ApiEmployerType;", "isRhdOnboarding", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaxFormResubmissionStatus", "Lcom/robinhood/models/api/bonfire/ApiTaxFormResubmissionStatus;", "getFeatureDiscoveryWidget", "Lcom/robinhood/models/api/bonfire/ApiFeatureDiscoveryResponse;", "location", "getSduiPlayground", "Lcom/robinhood/models/serverdriven/experimental/api/ApiSduiPlayground;", "uuid", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface BonfireApi {
    @POST("user/shipping_addresses/")
    Object addShippingAddress(@Body ApiShippingAddress.Request request, Continuation<? super ApiShippingAddress> continuation);

    @GET("user_info/employment_options/")
    Object getEmployerTypes(@Query("is_rhd_onboarding") boolean z, Continuation<? super ApiEmployerType> continuation);

    @GET("instruments/{instrumentId}/etp-details/")
    Object getEtpDetails(@Path("instrumentId") UUID uuid, Continuation<? super ApiEtpDetails> continuation);

    @GET("feature-discovery/features/{location}/")
    Object getFeatureDiscoveryWidget(@Path("location") String str, @Query("account_number") String str2, Continuation<? super Response<ApiFeatureDiscoveryResponse>> continuation);

    @GET("accounts/{accountNumber}/instant_deposit/additional_info/")
    @RequiresRegionGate(regionGates = {InstantDepositRegionGate.class})
    Object getInstantDepositAdditionalInfo(@Path("accountNumber") String str, Continuation<? super ApiInstantDepositInfo> continuation);

    @GET("instruments/{instrumentId}/stock_detail/")
    Object getInstrumentDetail(@Path("instrumentId") UUID uuid, Continuation<? super ApiStockDetail> continuation);

    @GET("instruments/{instrumentId}/disclosures/")
    Object getInstrumentDisclosure(@Path("instrumentId") UUID uuid, @Query("account_number") String str, Continuation<? super ApiInstrumentDisclosure> continuation);

    @GET("lists/{listId}/disclosures/")
    Object getListDisclosure(@Path("listId") UUID uuid, @Query("owner_type") ApiCuratedList.OwnerType ownerType, Continuation<? super ApiListDisclosure> continuation);

    @GET("instruments/{instrument_id}/margin-requirements/")
    Object getMarginRequirements(@Path("instrument_id") UUID uuid, @Query("account_number") String str, Continuation<? super ApiMarginRequirements> continuation);

    @GET("profile/account_breakdown/")
    Object getProfileAccountBreakdown(Continuation<? super Response<ApiProfileAccountBreakdown>> continuation);

    @GET("sdui_storage/{uuid}")
    Object getSduiPlayground(@Path("uuid") UUID uuid, Continuation<? super ApiSduiPlayground> continuation);

    @GET("settings_page/{page_id}/")
    Object getSettingsPage(@Path("page_id") String str, @Query("account_number") String str2, Continuation<? super ApiSettingsPage> continuation);

    @GET("user/shipping_addresses/")
    Object getShippingAddresses(Continuation<? super PaginatedResult<ApiShippingAddress>> continuation);

    @GET("user_info/tax_form_resubmission_status/")
    Object getTaxFormResubmissionStatus(Continuation<? super ApiTaxFormResubmissionStatus> continuation);

    @GET("accounts/unified/")
    Object getUnifiedAccounts(Continuation<? super PaginatedResult<ApiUnifiedAccountV2>> continuation);

    @GET("waitlist/{waitlist_name}/spot/")
    Object getWaitlistSpot(@Path("waitlist_name") String str, Continuation<? super ApiWaitlistSpot> continuation);

    @GET("accounts/{rhs_account_number}/withdrawable_amount_breakdown")
    Object getWithdrawableAmountBreakdown(@Path("rhs_account_number") String str, Continuation<? super ApiWithdrawableAmountBreakdown> continuation);

    @POST("waitlist/{waitlist_name}/spot/")
    Object joinWaitlist(@Path("waitlist_name") String str, Continuation<? super ApiWaitlistSpot> continuation);

    @POST("update_toggle_setting/")
    Object updateToggleSetting(@Body ApiSettingsToggleUpdateRequest apiSettingsToggleUpdateRequest, Continuation<? super Unit> continuation);
}
