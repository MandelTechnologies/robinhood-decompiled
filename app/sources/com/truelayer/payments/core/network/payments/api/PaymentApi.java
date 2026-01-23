package com.truelayer.payments.core.network.payments.api;

import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.payments.entity.request.StartAuthorizationFlowRequest;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: PaymentApi.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000bJ<\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018J4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000bJ<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ4\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000bJH\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!H¦@¢\u0006\u0002\u0010\"J<\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000fJ<\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000fJ<\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000fJ4\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000b¨\u0006("}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/api/PaymentApi;", "", "cancelPayment", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "resourceToken", "", "idempotencyKey", "Ljava/util/UUID;", "paymentId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSavedUserAccount", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "userAccountId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayment", "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "providerId", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserAccount", "startAuthorizationFlow", "payload", "Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/truelayer/payments/core/network/payments/entity/request/StartAuthorizationFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsent", "submitForm", "inputs", "", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitProviderSelection", "submitSchemeSelection", "schemeId", "submitUserAccountSelection", "useNewUserAccount", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface PaymentApi {
    Object cancelPayment(String str, UUID uuid, String str2, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation);

    Object deleteSavedUserAccount(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object getPayment(String str, String str2, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation);

    Object getPaymentProvider(String str, String str2, PaymentContext.PaymentType paymentType, Continuation<? super Outcome<PaymentProvider, ? extends CoreError>> continuation);

    Object saveUserAccount(String str, UUID uuid, String str2, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation);

    Object startAuthorizationFlow(String str, UUID uuid, String str2, StartAuthorizationFlowRequest startAuthorizationFlowRequest, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitConsent(String str, UUID uuid, String str2, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitForm(String str, UUID uuid, String str2, Map<String, String> map, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitProviderSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitSchemeSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitUserAccountSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object useNewUserAccount(String str, UUID uuid, String str2, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);
}
