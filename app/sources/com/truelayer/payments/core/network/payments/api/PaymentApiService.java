package com.truelayer.payments.core.network.payments.api;

import com.truelayer.payments.core.network.payments.entity.request.StartAuthorizationFlowRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitConsentRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitFormRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitProviderSelectionRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitSchemeSelectionRequest;
import com.truelayer.payments.core.network.payments.entity.request.SubmitUserAccountSelectionRequest;
import com.truelayer.payments.core.network.payments.entity.response.AuthorizationFlowResponse;
import com.truelayer.payments.core.network.payments.entity.response.PaymentResponse;
import com.truelayer.payments.core.network.payments.entity.shared.PaymentProviderDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: PaymentApiService.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\tJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J>\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J>\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ>\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001eJ>\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020 H§@¢\u0006\u0002\u0010!J>\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020#H§@¢\u0006\u0002\u0010$¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/api/PaymentApiService;", "", "cancelPayment", "Lretrofit2/Response;", "", "resourceToken", "", "idempotencyKey", "paymentId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayment", "Lcom/truelayer/payments/core/network/payments/entity/response/PaymentResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentProvider", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentProviderDetails;", "providerId", "saveUserAccount", "startAuthorizationFlow", "Lcom/truelayer/payments/core/network/payments/entity/response/AuthorizationFlowResponse;", "payload", "Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsent", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitConsentRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/SubmitConsentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitForm", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitFormRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/SubmitFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitProviderSelection", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitProviderSelectionRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/SubmitProviderSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitSchemeSelection", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitSchemeSelectionRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/SubmitSchemeSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitUserAccountSelection", "Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/SubmitUserAccountSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface PaymentApiService {
    @POST("/payments/{id}/actions/cancel")
    Object cancelPayment(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, Continuation<? super Response<Unit>> continuation);

    @GET("/payments/{id}/")
    Object getPayment(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<PaymentResponse>> continuation);

    @GET("/payments-providers/{id}")
    Object getPaymentProvider(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<PaymentProviderDetails>> continuation);

    @POST("/payments/{id}/actions/save-user-account")
    Object saveUserAccount(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, Continuation<? super Response<Unit>> continuation);

    @POST("/payments/{id}/authorization-flow")
    Object startAuthorizationFlow(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body StartAuthorizationFlowRequest startAuthorizationFlowRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);

    @POST("/payments/{id}/authorization-flow/actions/consent")
    Object submitConsent(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitConsentRequest submitConsentRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);

    @POST("/payments/{id}/authorization-flow/actions/form")
    Object submitForm(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitFormRequest submitFormRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);

    @POST("/payments/{id}/authorization-flow/actions/provider-selection")
    Object submitProviderSelection(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitProviderSelectionRequest submitProviderSelectionRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);

    @POST("/payments/{id}/authorization-flow/actions/scheme-selection")
    Object submitSchemeSelection(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitSchemeSelectionRequest submitSchemeSelectionRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);

    @POST("/payments/{id}/authorization-flow/actions/user-account-selection")
    Object submitUserAccountSelection(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitUserAccountSelectionRequest submitUserAccountSelectionRequest, Continuation<? super Response<AuthorizationFlowResponse>> continuation);
}
