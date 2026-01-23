package com.truelayer.payments.core.network.experience.api;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.truelayer.payments.core.network.experience.entity.request.SchemeSelectionRequest;
import com.truelayer.payments.core.network.experience.entity.request.SubmitEncryptedFormRequest;
import com.truelayer.payments.core.network.experience.entity.response.AdditionalInput;
import com.truelayer.payments.core.network.experience.entity.response.FingerprintResponse;
import com.truelayer.payments.core.network.experience.entity.response.LocalisationLegalsResponse;
import com.truelayer.payments.core.network.experience.entity.response.LocalisedText;
import com.truelayer.payments.core.network.experience.entity.response.MerchantConfigResponse;
import com.truelayer.payments.core.network.experience.entity.response.ProvidersConfigResponse;
import com.truelayer.payments.core.network.experience.entity.response.SchemeSelectionResponse;
import com.truelayer.payments.core.network.experience.entity.response.UserPriming;
import com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PaymentsExperienceApiService.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H§@¢\u0006\u0002\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ8\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u001f\u001a\u00020 H§@¢\u0006\u0002\u0010!J0\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0013J6\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u001cJ4\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010,¨\u0006-"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApiService;", "", "getAdditionalInputs", "Lretrofit2/Response;", "", "Lcom/truelayer/payments/core/network/experience/entity/response/AdditionalInput;", "resourceToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFingerprint", "Lcom/truelayer/payments/core/network/experience/entity/response/FingerprintResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegals", "Lcom/truelayer/payments/core/network/experience/entity/response/LocalisationLegalsResponse;", "countryCode", "isSignupPlus", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandatesLegals", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantConfig", "Lcom/truelayer/payments/core/network/experience/entity/response/MerchantConfigResponse;", "paymentId", "getProvidersConfig", "Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse;", "getRecommendedProvidersIds", "userId", "paymentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchemeSelection", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionResponse;", CarResultComposable2.BODY, "Lcom/truelayer/payments/core/network/experience/entity/request/SchemeSelectionRequest;", "(Ljava/lang/String;Lcom/truelayer/payments/core/network/experience/entity/request/SchemeSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranslations", "Lcom/truelayer/payments/core/network/experience/entity/response/LocalisedText;", "getUserPriming", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming;", "providerId", "submitEncryptedForm", "Lcom/truelayer/payments/core/network/payments/entity/response/AuthorizationFlowResponse;", "idempotencyKey", "payload", "Lcom/truelayer/payments/core/network/experience/entity/request/SubmitEncryptedFormRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/experience/entity/request/SubmitEncryptedFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface PaymentsExperienceApiService {
    @GET("/additional-inputs")
    Object getAdditionalInputs(@Header("Authorization") String str, Continuation<? super Response<List<AdditionalInput>>> continuation);

    @GET("/decrypting-proxy/fingerprint")
    Object getFingerprint(Continuation<? super Response<FingerprintResponse>> continuation);

    @GET("/localisation/legals")
    Object getLegals(@Header("Authorization") String str, @Query(PlaceTypes.COUNTRY) String str2, @Query("isSignupPlus") boolean z, Continuation<? super Response<LocalisationLegalsResponse>> continuation);

    @GET("/localisation/mandates-legals")
    Object getMandatesLegals(@Header("Authorization") String str, @Query(PlaceTypes.COUNTRY) String str2, Continuation<? super Response<LocalisationLegalsResponse>> continuation);

    @GET("/payments/{id}/merchant-config")
    Object getMerchantConfig(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<MerchantConfigResponse>> continuation);

    @GET("/providers/config")
    Object getProvidersConfig(@Header("Authorization") String str, Continuation<? super Response<List<ProvidersConfigResponse>>> continuation);

    @GET("/recommendations/{user_id}/providers")
    Object getRecommendedProvidersIds(@Path(MatchaQrCodeDuxo6.USER_ID_KEY) String str, @Query("resourceId") String str2, @Query("resourceType") String str3, Continuation<? super Response<List<String>>> continuation);

    @POST("providers/scheme-selection")
    Object getSchemeSelection(@Header("Authorization") String str, @Body SchemeSelectionRequest schemeSelectionRequest, Continuation<? super Response<SchemeSelectionResponse>> continuation);

    @GET("/localisation/additional-inputs")
    Object getTranslations(@Header("Authorization") String str, @Query(PlaceTypes.COUNTRY) String str2, Continuation<? super Response<List<LocalisedText>>> continuation);

    @GET("/localisation/user-priming")
    Object getUserPriming(@Header("Authorization") String str, @Query("providerId") String str2, @Query("resourceId") String str3, Continuation<? super Response<UserPriming>> continuation);

    @POST("/proxy")
    Object submitEncryptedForm(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Body SubmitEncryptedFormRequest submitEncryptedFormRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);
}
