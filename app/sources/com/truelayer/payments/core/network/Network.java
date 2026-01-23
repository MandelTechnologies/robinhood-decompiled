package com.truelayer.payments.core.network;

import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.core.domain.payments.AdditionalInput;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;

/* compiled from: Network.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J2\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH¦@¢\u0006\u0002\u0010\u001eJ\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J*\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J0\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J8\u0010(\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H¦@¢\u0006\u0002\u0010,J8\u0010-\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020/0.\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H¦@¢\u0006\u0002\u0010\u0015J*\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J6\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140.H¦@¢\u0006\u0002\u00107J*\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J*\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J*\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006="}, m3636d2 = {"Lcom/truelayer/payments/core/network/Network;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "translationProvider", "Lcom/truelayer/payments/core/network/experience/TranslationProvider;", "getTranslationProvider", "()Lcom/truelayer/payments/core/network/experience/TranslationProvider;", "cancelPayment", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "paymentContext", "Lcom/truelayer/payments/core/domain/payments/PaymentContext;", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSavedUserAccount", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "userAccountId", "", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdditionalInputs", "", "Lcom/truelayer/payments/core/domain/payments/AdditionalInput;", "getLocalisedLegals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "countryCode", "isSignupPlus", "", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "providerId", "getRecommendedProvidersIds", "userId", "getSchemeSelection", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "currencyCode", "schemeIds", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranslations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "getUserPriming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "saveUserAccount", "startAuthorizationFlow", "submitConsent", "submitForm", "inputs", "(Lcom/truelayer/payments/core/domain/payments/PaymentContext;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitProviderSelection", "submitSchemeSelection", "schemeId", "submitUserAccountSelection", "useNewUserAccount", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface Network {
    Object cancelPayment(PaymentContext paymentContext, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation);

    Object deleteSavedUserAccount(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object getAdditionalInputs(PaymentContext paymentContext, Continuation<? super Outcome<? extends List<? extends AdditionalInput>, ? extends CoreError>> continuation);

    Object getLocalisedLegals(PaymentContext paymentContext, String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation);

    Object getMerchantConfig(PaymentContext paymentContext, Continuation<? super Outcome<MerchantConfig, ? extends CoreError>> continuation);

    OkHttpClient getOkHttpClient();

    Object getPayment(PaymentContext paymentContext, Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation);

    Object getPaymentProvider(PaymentContext paymentContext, String str, Continuation<? super Outcome<PaymentProvider, ? extends CoreError>> continuation);

    Object getRecommendedProvidersIds(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends List<String>, ? extends CoreError>> continuation);

    Object getSchemeSelection(PaymentContext paymentContext, String str, List<String> list, Continuation<? super Outcome<? extends SchemeSelection, ? extends CoreError>> continuation);

    TranslationProvider getTranslationProvider();

    Object getTranslations(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation);

    Object getUserPriming(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends UserPriming, ? extends CoreError>> continuation);

    Object saveUserAccount(PaymentContext paymentContext, Continuation<? super Outcome<Unit, ? extends CoreError>> continuation);

    Object startAuthorizationFlow(PaymentContext paymentContext, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitConsent(PaymentContext paymentContext, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitForm(PaymentContext paymentContext, Map<String, String> map, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitProviderSelection(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitSchemeSelection(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object submitUserAccountSelection(PaymentContext paymentContext, String str, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);

    Object useNewUserAccount(PaymentContext paymentContext, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation);
}
