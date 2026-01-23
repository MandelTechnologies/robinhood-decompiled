package com.truelayer.payments.core.network.experience.api;

import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.ProviderConfig;
import com.truelayer.payments.core.domain.utils.Outcome;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PaymentsExperienceApi.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ2\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0011J(\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ8\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bJ8\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H¦@¢\u0006\u0002\u0010 J8\u0010!\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u0010\u0011J2\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH¦@¢\u0006\u0002\u0010'JH\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\"H¦@¢\u0006\u0002\u0010-¨\u0006."}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/api/PaymentsExperienceApi;", "", "getAdditionalInputs", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "resourceToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "countryCode", "isSignupPlus", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandatesLegals", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "paymentId", "getProvidersConfig", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "getRecommendedProvidersIds", "userId", "paymentType", "Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentContext$PaymentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchemeSelection", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "currencyCode", "schemeIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranslations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "getUserPriming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "providerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitEncryptedForm", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "idempotencyKey", "Ljava/util/UUID;", "inputs", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface PaymentsExperienceApi {
    Object getAdditionalInputs(String str, Continuation<? super Outcome<? extends List<? extends AdditionalInput>, ? extends CoreError>> continuation);

    Object getLegals(String str, String str2, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation);

    Object getMandatesLegals(String str, String str2, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation);

    Object getMerchantConfig(String str, String str2, Continuation<? super Outcome<MerchantConfig, ? extends CoreError>> continuation);

    Object getProvidersConfig(String str, Continuation<? super Outcome<? extends List<ProviderConfig>, ? extends CoreError>> continuation);

    Object getRecommendedProvidersIds(String str, String str2, PaymentContext.PaymentType paymentType, Continuation<? super Outcome<? extends List<String>, ? extends CoreError>> continuation);

    Object getSchemeSelection(String str, String str2, List<String> list, Continuation<? super Outcome<? extends SchemeSelection, ? extends CoreError>> continuation);

    Object getTranslations(String str, String str2, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation);

    Object getUserPriming(String str, String str2, String str3, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation);

    Object submitEncryptedForm(String str, UUID uuid, String str2, Map<String, String> map, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);
}
