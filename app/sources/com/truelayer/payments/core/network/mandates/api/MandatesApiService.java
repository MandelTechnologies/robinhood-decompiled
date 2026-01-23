package com.truelayer.payments.core.network.mandates.api;

import com.truelayer.payments.core.network.mandates.entity.request.StartAuthorizationFlowRequest;
import com.truelayer.payments.core.network.mandates.entity.request.SubmitConsentRequest;
import com.truelayer.payments.core.network.mandates.entity.request.SubmitProviderSelectionRequest;
import com.truelayer.payments.core.network.mandates.entity.response.MandateAuthorizationFlowResponse;
import com.truelayer.payments.core.network.mandates.entity.response.MandateResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: MandatesApiService.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\fJ>\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J>\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/api/MandatesApiService;", "", "cancelMandate", "Lretrofit2/Response;", "", "resourceToken", "", "idempotencyKey", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandate", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthorizationFlow", "Lcom/truelayer/payments/core/network/mandates/entity/response/MandateAuthorizationFlowResponse;", "payload", "Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsent", "Lcom/truelayer/payments/core/network/mandates/entity/request/SubmitConsentRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/request/SubmitConsentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitProviderSelection", "Lcom/truelayer/payments/core/network/mandates/entity/request/SubmitProviderSelectionRequest;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/request/SubmitProviderSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface MandatesApiService {
    @POST("/mandates/{id}/actions/cancel")
    Object cancelMandate(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, Continuation<? super Response<Unit>> continuation);

    @GET("/mandates/{id}/")
    Object getMandate(@Header("Authorization") String str, @Path("id") String str2, Continuation<? super Response<MandateResponse>> continuation);

    @POST("/mandates/{id}/authorization-flow")
    Object startAuthorizationFlow(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body StartAuthorizationFlowRequest startAuthorizationFlowRequest, Continuation<? super Response<MandateAuthorizationFlowResponse>> continuation);

    @POST("/mandates/{id}/authorization-flow/actions/consent")
    Object submitConsent(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitConsentRequest submitConsentRequest, Continuation<? super Response<MandateAuthorizationFlowResponse>> continuation);

    @POST("/mandates/{id}/authorization-flow/actions/provider-selection")
    Object submitProviderSelection(@Header("Authorization") String str, @Header("Idempotency-Key") String str2, @Path("id") String str3, @Body SubmitProviderSelectionRequest submitProviderSelectionRequest, Continuation<? super Response<MandateAuthorizationFlowResponse>> continuation);
}
