package com.robinhood.api.retrofit;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.ApiAcceptSlipAgreementsRequestBody;
import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import com.robinhood.models.api.ApiSlipAccountsStatusResponse;
import com.robinhood.models.api.ApiSlipAgreements;
import com.robinhood.models.api.ApiSlipAgreementsSection;
import com.robinhood.models.api.ApiSlipConsentStatusRequestBody;
import com.robinhood.models.api.ApiSlipEnabledRequest;
import com.robinhood.models.api.ApiSlipEnabledResponse;
import com.robinhood.models.api.ApiSlipHub;
import com.robinhood.models.api.ApiSlipHubCard;
import com.robinhood.models.api.ApiSlipOnboarding;
import com.robinhood.models.api.ApiSlipOnboardingEligibility;
import com.robinhood.models.api.ApiSlipOnboardingFlow;
import com.robinhood.models.api.ApiSlipOnboardingLegacy;
import com.robinhood.models.api.ApiSlipUpsellResponse;
import com.robinhood.models.api.ApiUpdatedAgreementsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: SlipApi.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020!2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u001aJ\"\u0010\"\u001a\u00020#2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010$\u001a\u00020%H§@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020(H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010)\u001a\u00020\u001c2\b\b\u0001\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020.H§@¢\u0006\u0002\u0010\u0015J\"\u0010/\u001a\u0002002\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u00101\u001a\u00020\nH§@¢\u0006\u0002\u0010\fJ$\u00102\u001a\u0002032\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\f¨\u00064"}, m3636d2 = {"Lcom/robinhood/api/retrofit/SlipApi;", "", "getSlipOnboardingLegacy", "Lcom/robinhood/models/api/ApiSlipOnboardingLegacy;", "needSignAgreement", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlipOnboarding", "Lcom/robinhood/models/api/ApiSlipOnboarding;", "accountNumber", "", "source", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlipAgreements", "Lcom/robinhood/models/api/ApiSlipAgreements;", "hasQuickEnrollment", "onboardingFlow", "Lcom/robinhood/models/api/ApiSlipOnboardingFlow;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/models/api/ApiSlipOnboardingFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlipUpdatedAgreements", "Lcom/robinhood/models/api/ApiUpdatedAgreementsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlipHub", "Lcom/robinhood/models/api/ApiSlipHub;", "getHubCard", "Lcom/robinhood/models/api/ApiSlipHubCard;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSlipConsentStatus", "", "requestBody", "Lcom/robinhood/models/api/ApiSlipConsentStatusRequestBody;", "(Lcom/robinhood/models/api/ApiSlipConsentStatusRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOnboardingEligibility", "Lcom/robinhood/models/api/ApiSlipOnboardingEligibility;", "updateSlipEnabledStatus", "Lcom/robinhood/models/api/ApiSlipEnabledResponse;", "request", "Lcom/robinhood/models/api/ApiSlipEnabledRequest;", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiSlipEnabledRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlipAccountsStatus", "Lcom/robinhood/models/api/ApiSlipAccountsStatusResponse;", "acceptSlipAgreements", CarResultComposable2.BODY, "Lcom/robinhood/models/api/ApiAcceptSlipAgreementsRequestBody;", "(Lcom/robinhood/models/api/ApiAcceptSlipAgreementsRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPreviouslySignedAgreements", "Lcom/robinhood/models/api/ApiPreviouslySignedAgreements;", "getSlipUpsell", "Lcom/robinhood/models/api/ApiSlipUpsellResponse;", "orderId", "getSlipAgreementsSection", "Lcom/robinhood/models/api/ApiSlipAgreementsSection;", "lib-api-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface SlipApi {
    @POST("slip/accept-agreements/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object acceptSlipAgreements(@Body ApiAcceptSlipAgreementsRequestBody apiAcceptSlipAgreementsRequestBody, Continuation<? super Unit> continuation);

    @GET("slip/hub-card/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getHubCard(@Query("account_number") String str, Continuation<? super ApiSlipHubCard> continuation);

    @GET("slip/{account_number}/eligibility/v2/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getOnboardingEligibility(@Path("account_number") String str, Continuation<? super ApiSlipOnboardingEligibility> continuation);

    @GET("slip/previously_signed_agreements/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getPreviouslySignedAgreements(Continuation<? super ApiPreviouslySignedAgreements> continuation);

    @GET("slip/status")
    @RequiresRegionGate(regionGates = {SlipRegionGate.class})
    Object getSlipAccountsStatus(Continuation<? super ApiSlipAccountsStatusResponse> continuation);

    @GET("slip/agreements/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getSlipAgreements(@Query("account_number") String str, @Query("source") String str2, @Query("has_quick_enrollment") Boolean bool, @Query("onboarding_flow") ApiSlipOnboardingFlow apiSlipOnboardingFlow, Continuation<? super ApiSlipAgreements> continuation);

    @GET("slip/agreements_section")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getSlipAgreementsSection(@Query("account_number") String str, @Query("source") String str2, Continuation<? super ApiSlipAgreementsSection> continuation);

    @GET("slip/hub/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getSlipHub(Continuation<? super ApiSlipHub> continuation);

    @GET("slip/{account_number}/onboarding/v2/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getSlipOnboarding(@Path("account_number") String str, @Query("source") String str2, Continuation<? super ApiSlipOnboarding> continuation);

    @GET("slip/onboarding/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getSlipOnboardingLegacy(@Query("need_sign_agreement") boolean z, Continuation<? super ApiSlipOnboardingLegacy> continuation);

    @GET("slip/updated-agreements-required")
    @RequiresRegionGate(regionGates = {SlipRegionGate.class})
    Object getSlipUpdatedAgreements(Continuation<? super ApiUpdatedAgreementsResponse> continuation);

    @GET("slip/{account_number}/post_trade_upsell/{order_id}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object getSlipUpsell(@Path("account_number") String str, @Path("order_id") String str2, Continuation<? super ApiSlipUpsellResponse> continuation);

    @PUT("slip/consent_status")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object updateSlipConsentStatus(@Body ApiSlipConsentStatusRequestBody apiSlipConsentStatusRequestBody, Continuation<? super Unit> continuation);

    @PUT("slip/{account_number}/status")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SlipRegionGate.class})
    Object updateSlipEnabledStatus(@Path("account_number") String str, @Body ApiSlipEnabledRequest apiSlipEnabledRequest, Continuation<? super ApiSlipEnabledResponse> continuation);

    /* compiled from: SlipApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getSlipOnboardingLegacy$default(SlipApi slipApi, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlipOnboardingLegacy");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return slipApi.getSlipOnboardingLegacy(z, continuation);
        }

        public static /* synthetic */ Object getSlipOnboarding$default(SlipApi slipApi, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlipOnboarding");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return slipApi.getSlipOnboarding(str, str2, continuation);
        }

        public static /* synthetic */ Object getSlipAgreements$default(SlipApi slipApi, String str, String str2, Boolean bool, ApiSlipOnboardingFlow apiSlipOnboardingFlow, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlipAgreements");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                bool = Boolean.FALSE;
            }
            if ((i & 8) != 0) {
                apiSlipOnboardingFlow = null;
            }
            return slipApi.getSlipAgreements(str, str2, bool, apiSlipOnboardingFlow, continuation);
        }
    }
}
