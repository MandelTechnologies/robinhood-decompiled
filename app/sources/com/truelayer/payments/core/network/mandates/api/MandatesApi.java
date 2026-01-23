package com.truelayer.payments.core.network.mandates.api;

import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.mandates.entity.request.StartAuthorizationFlowRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: MandatesApi.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000eJ<\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u000bJ<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/api/MandatesApi;", "", "cancelMandate", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "resourceToken", "", "idempotencyKey", "Ljava/util/UUID;", "id", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandate", "Lcom/truelayer/payments/core/domain/payments/Payment;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "payload", "Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/truelayer/payments/core/network/mandates/entity/request/StartAuthorizationFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsent", "submitProviderSelection", "providerId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface MandatesApi {
    Object cancelMandate(String str, UUID uuid, String str2, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation);

    Object getMandate(String str, String str2, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation);

    Object startAuthorizationFlow(String str, UUID uuid, String str2, StartAuthorizationFlowRequest startAuthorizationFlowRequest, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitConsent(String str, UUID uuid, String str2, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitProviderSelection(String str, UUID uuid, String str2, String str3, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);
}
