package com.robinhood.api.retrofit;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.ApiTin;
import com.robinhood.models.api.identi.ApiAddress;
import com.robinhood.models.api.identi.ApiAddressValidationRequest;
import com.robinhood.models.api.identi.ApiAddressValidationResult;
import com.robinhood.models.api.identi.ApiConsentStatusRequest;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.api.identi.ApiIdentiApplication;
import com.robinhood.models.api.identi.ApiIdentiJointAccountApplication;
import com.robinhood.models.api.identi.ApiLastFourSsn;
import com.robinhood.models.api.identi.ApiOptOutConsentStatus;
import com.robinhood.models.api.identi.ApiProfileInfo;
import com.robinhood.models.api.identi.ApiSsnAttempts;
import com.robinhood.models.api.identi.ApiToggleDiscoverabilityRequest;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.models.api.identi.ApiUpdateDiscoverabilityStatusRequest;
import com.robinhood.models.api.identi.ApiUserAgreement;
import com.robinhood.models.api.identi.ApiUserAgreementsResponse;
import com.robinhood.models.api.identi.ApiVerifySsnRequest;
import com.robinhood.models.api.identi.ApiVerifySsnResponse;
import com.robinhood.models.api.identi.rhy.ApiRhyEligibility;
import com.robinhood.models.api.identi.rhy.ApiSubmitRhyApplicationRequest;
import com.robinhood.utils.http.Headers;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: Identi.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\fH§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\b\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\"H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010#\u001a\u00020\"2\b\b\u0001\u0010\b\u001a\u00020\"H§@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020&H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010'\u001a\u00020(H§@¢\u0006\u0002\u0010\u0004J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010,\u001a\u00020-H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010.\u001a\u00020/H§@¢\u0006\u0002\u0010\u0004J\u0018\u00100\u001a\u0002012\b\b\u0001\u0010\b\u001a\u000202H§@¢\u0006\u0002\u00103J\u000e\u00104\u001a\u000205H§@¢\u0006\u0002\u0010\u0004J\u000e\u00106\u001a\u000207H§@¢\u0006\u0002\u0010\u0004J\u0018\u00108\u001a\u0002072\b\b\u0001\u0010\b\u001a\u000209H§@¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u0002070*H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010<\u001a\u00020&2\b\b\u0001\u0010\b\u001a\u00020=H§@¢\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020&2\b\b\u0001\u0010\b\u001a\u00020@H§@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020CH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010D\u001a\u00020&2\b\b\u0001\u0010\b\u001a\u00020EH§@¢\u0006\u0002\u0010FJ\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020H0*H§@¢\u0006\u0002\u0010\u0004¨\u0006I"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Identi;", "", "getProfileInfo", "Lcom/robinhood/models/api/identi/ApiProfileInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfileInfo", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "request", "Lcom/robinhood/models/api/identi/ApiProfileInfo$Request;", "(Ljava/util/UUID;Lcom/robinhood/models/api/identi/ApiProfileInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmploymentInfo", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo;", "updateEmploymentInfo", "(Lcom/robinhood/models/api/identi/ApiEmploymentInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResidentialAddress", "Lcom/robinhood/models/api/identi/ApiAddress;", "submitResidentialAddress", PlaceTypes.ADDRESS, "(Lcom/robinhood/models/api/identi/ApiAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateAddress", "Lcom/robinhood/models/api/identi/ApiAddressValidationResult;", "Lcom/robinhood/models/api/identi/ApiAddressValidationRequest;", "(Lcom/robinhood/models/api/identi/ApiAddressValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "agreeToUserAgreement", "Lcom/robinhood/models/api/identi/ApiUserAgreement;", "Lcom/robinhood/models/api/identi/ApiUserAgreement$Request;", "(Lcom/robinhood/models/api/identi/ApiUserAgreement$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAgreements", "Lcom/robinhood/models/api/identi/ApiUserAgreementsResponse;", "agreementType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrustedContact", "Lcom/robinhood/models/api/identi/ApiTrustedContact;", "submitTrustedContact", "(Lcom/robinhood/models/api/identi/ApiTrustedContact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTrustedContact", "", "getApplication", "Lcom/robinhood/models/api/identi/ApiIdentiApplication;", "getJointAccountApplications", "", "Lcom/robinhood/models/api/identi/ApiIdentiJointAccountApplication;", "getLastFourSsn", "Lcom/robinhood/models/api/identi/ApiLastFourSsn;", "getSsnAttemptsLeft", "Lcom/robinhood/models/api/identi/ApiSsnAttempts;", "verifySsn", "Lcom/robinhood/models/api/identi/ApiVerifySsnResponse;", "Lcom/robinhood/models/api/identi/ApiVerifySsnRequest;", "(Lcom/robinhood/models/api/identi/ApiVerifySsnRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSsnLockoutNationalIdRequest", "Lcom/robinhood/models/api/identi/ApiDocumentRequest;", "getCcpaMarketingOptOutStatus", "Lcom/robinhood/models/api/identi/ApiOptOutConsentStatus;", "updateCcpaMarketingOptOutStatus", "Lcom/robinhood/models/api/identi/ApiConsentStatusRequest;", "(Lcom/robinhood/models/api/identi/ApiConsentStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDiscoverabilityConsentStatus", "updateDiscoverabilityConsentStatus", "Lcom/robinhood/models/api/identi/ApiUpdateDiscoverabilityStatusRequest;", "(Lcom/robinhood/models/api/identi/ApiUpdateDiscoverabilityStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleDiscoverability", "Lcom/robinhood/models/api/identi/ApiToggleDiscoverabilityRequest;", "(Lcom/robinhood/models/api/identi/ApiToggleDiscoverabilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRhyEligibility", "Lcom/robinhood/models/api/identi/rhy/ApiRhyEligibility;", "submitRhyApplication", "Lcom/robinhood/models/api/identi/rhy/ApiSubmitRhyApplicationRequest;", "(Lcom/robinhood/models/api/identi/rhy/ApiSubmitRhyApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTins", "Lcom/robinhood/models/api/ApiTin;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Identi {
    @POST("user_info/agreements/agree/")
    Object agreeToUserAgreement(@Body ApiUserAgreement.Request request, Continuation<? super ApiUserAgreement> continuation);

    @DELETE("user_info/trusted_contact/")
    Object deleteTrustedContact(Continuation<? super Unit> continuation);

    @GET("application/brokerage/")
    Object getApplication(Continuation<? super ApiIdentiApplication> continuation);

    @GET("user_info/opt_out_consent/ccpa_marketing/")
    Object getCcpaMarketingOptOutStatus(Continuation<? super ApiOptOutConsentStatus> continuation);

    @GET("user_info/opt_out_consent/privacy/consents/?category=discoverability")
    Object getDiscoverabilityConsentStatus(Continuation<? super List<ApiOptOutConsentStatus>> continuation);

    @GET("user_info/employment/")
    Object getEmploymentInfo(Continuation<? super ApiEmploymentInfo> continuation);

    @GET("application/joint_account/")
    @RequiresRegionGate(regionGates = {JointAccountsRegionGate.class})
    Object getJointAccountApplications(Continuation<? super List<ApiIdentiJointAccountApplication>> continuation);

    @GET("user_info/gov_id_code/get_last_four_ssn/")
    Object getLastFourSsn(Continuation<? super ApiLastFourSsn> continuation);

    @GET("user_info/profile_info/")
    Object getProfileInfo(Continuation<? super ApiProfileInfo> continuation);

    @GET("user_info/address/residential/")
    Object getResidentialAddress(Continuation<? super ApiAddress> continuation);

    @GET("application/spending/eligibility/")
    @RequiresRegionGate(regionGates = {SpendingRegionGate.class})
    Object getRhyEligibility(Continuation<? super ApiRhyEligibility> continuation);

    @GET("user_info/gov_id_code/has_ssn_attempts_left/")
    Object getSsnAttemptsLeft(Continuation<? super ApiSsnAttempts> continuation);

    @POST("document/national_id_request/")
    Object getSsnLockoutNationalIdRequest(Continuation<? super ApiDocumentRequest> continuation);

    @GET("user_info/gov_id_code/get_last_four/")
    Object getTins(Continuation<? super List<ApiTin>> continuation);

    @GET("user_info/trusted_contact/")
    Object getTrustedContact(Continuation<? super ApiTrustedContact> continuation);

    @GET("user_info/agreements/")
    Object getUserAgreements(@Query("type") String str, Continuation<? super ApiUserAgreementsResponse> continuation);

    @POST("user_info/address/residential/")
    Object submitResidentialAddress(@Body ApiAddress apiAddress, Continuation<? super ApiAddress> continuation);

    @POST("application/spending/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {SpendingRegionGate.class})
    Object submitRhyApplication(@Body ApiSubmitRhyApplicationRequest apiSubmitRhyApplicationRequest, Continuation<? super Unit> continuation);

    @POST("user_info/trusted_contact/")
    Object submitTrustedContact(@Body ApiTrustedContact apiTrustedContact, Continuation<? super ApiTrustedContact> continuation);

    @POST("user_info/opt_out_consent/privacy/consents/toggle/")
    Object toggleDiscoverability(@Body ApiToggleDiscoverabilityRequest apiToggleDiscoverabilityRequest, Continuation<? super Unit> continuation);

    @POST("user_info/opt_out_consent/ccpa_marketing/")
    Object updateCcpaMarketingOptOutStatus(@Body ApiConsentStatusRequest apiConsentStatusRequest, Continuation<? super ApiOptOutConsentStatus> continuation);

    @POST("user_info/opt_out_consent/privacy/consents/consent/")
    Object updateDiscoverabilityConsentStatus(@Body ApiUpdateDiscoverabilityStatusRequest apiUpdateDiscoverabilityStatusRequest, Continuation<? super Unit> continuation);

    @PATCH("user_info/employment/")
    Object updateEmploymentInfo(@Body ApiEmploymentInfo apiEmploymentInfo, Continuation<? super ApiEmploymentInfo> continuation);

    @PATCH("user_info/profile_info/")
    Object updateProfileInfo(@Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, @Body ApiProfileInfo.Request request, Continuation<? super ApiProfileInfo> continuation);

    @POST("user_info/address/validation/")
    Object validateAddress(@Body ApiAddressValidationRequest apiAddressValidationRequest, Continuation<? super ApiAddressValidationResult> continuation);

    @POST("user_info/gov_id_code/verify_ssn/")
    Object verifySsn(@Body ApiVerifySsnRequest apiVerifySsnRequest, Continuation<? super ApiVerifySsnResponse> continuation);
}
