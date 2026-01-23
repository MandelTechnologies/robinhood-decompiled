package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: ManagerData.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000207R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001bR@\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR@\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001c\u001a\u0004\u0018\u00010%@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010+\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR4\u0010.\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\b\"\u0004\b3\u0010\n¨\u00068"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerData;", "", "()V", "authorizationFlowResponseOutcome", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "getAuthorizationFlowResponseOutcome", "()Lcom/truelayer/payments/core/domain/utils/Outcome;", "setAuthorizationFlowResponseOutcome", "(Lcom/truelayer/payments/core/domain/utils/Outcome;)V", "errors", "", "getErrors", "()Ljava/util/List;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "getLegals", "setLegals", "merchantConfigOutcome", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getMerchantConfigOutcome", "setMerchantConfigOutcome", "overrideCurrentFormFields", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "getOverrideCurrentFormFields", "setOverrideCurrentFormFields", "(Ljava/util/List;)V", "value", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentOutcome", "getPaymentOutcome", "setPaymentOutcome", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "preSelectedProviderOutcome", "getPreSelectedProviderOutcome", "setPreSelectedProviderOutcome", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "providerSelectionResult", "getProviderSelectionResult", "()Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "setProviderSelectionResult", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;)V", "recommendedProvidersOutcome", "getRecommendedProvidersOutcome", "setRecommendedProvidersOutcome", "translations", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "getTranslations", "setTranslations", "createSnapshot", "Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "reset", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ManagerData {
    public static final int $stable = 8;
    private Outcome<? extends AuthorizationFlowResponse, ? extends CoreError> authorizationFlowResponseOutcome;
    private Outcome<Legals, ? extends CoreError> legals;
    private Outcome<MerchantConfig, ? extends CoreError> merchantConfigOutcome;
    private List<? extends FormInputWrapper> overrideCurrentFormFields;
    private Outcome<? extends Payment, ? extends CoreError> paymentOutcome;
    private Outcome<PaymentProvider, ? extends CoreError> preSelectedProviderOutcome;
    private ProviderSelectionResult providerSelectionResult;
    private Outcome<? extends List<PaymentProvider>, ? extends CoreError> recommendedProvidersOutcome;
    private Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> translations;

    public final Outcome<Map<String, LocalisedText>, CoreError> getTranslations() {
        return this.translations;
    }

    public final void setTranslations(Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> outcome) {
        this.translations = outcome;
    }

    public final Outcome<Legals, CoreError> getLegals() {
        return this.legals;
    }

    public final void setLegals(Outcome<Legals, ? extends CoreError> outcome) {
        this.legals = outcome;
    }

    public final List<FormInputWrapper> getOverrideCurrentFormFields() {
        return this.overrideCurrentFormFields;
    }

    public final void setOverrideCurrentFormFields(List<? extends FormInputWrapper> list) {
        this.overrideCurrentFormFields = list;
    }

    public final Outcome<Payment, CoreError> getPaymentOutcome() {
        return this.paymentOutcome;
    }

    public final void setPaymentOutcome(Outcome<? extends Payment, ? extends CoreError> outcome) {
        Currency currency;
        this.paymentOutcome = outcome;
        String currencyCode = null;
        Payment payment = outcome != null ? (Payment) Outcome4.okOrNull(outcome) : null;
        TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
        TrueLayerAnalytics.AnalyticsContext analyticsContext = companion.getAnalyticsContext();
        if (analyticsContext != null) {
            PaymentMethod paymentMethod = payment != null ? payment.getPaymentMethod() : null;
            PaymentMethod.BankTransfer bankTransfer = paymentMethod instanceof PaymentMethod.BankTransfer ? (PaymentMethod.BankTransfer) paymentMethod : null;
            analyticsContext.setAmountInMinor(bankTransfer != null ? Long.valueOf(bankTransfer.getAmountInMinor()) : null);
        }
        TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
        if (analyticsContext2 == null) {
            return;
        }
        if (payment != null && (currency = payment.getCurrency()) != null) {
            currencyCode = currency.getCurrencyCode();
        }
        analyticsContext2.setCurrency(currencyCode);
    }

    public final Outcome<AuthorizationFlowResponse, CoreError> getAuthorizationFlowResponseOutcome() {
        return this.authorizationFlowResponseOutcome;
    }

    public final void setAuthorizationFlowResponseOutcome(Outcome<? extends AuthorizationFlowResponse, ? extends CoreError> outcome) {
        this.authorizationFlowResponseOutcome = outcome;
    }

    public final Outcome<List<PaymentProvider>, CoreError> getRecommendedProvidersOutcome() {
        return this.recommendedProvidersOutcome;
    }

    public final void setRecommendedProvidersOutcome(Outcome<? extends List<PaymentProvider>, ? extends CoreError> outcome) {
        this.recommendedProvidersOutcome = outcome;
    }

    public final ProviderSelectionResult getProviderSelectionResult() {
        return this.providerSelectionResult;
    }

    public final void setProviderSelectionResult(ProviderSelectionResult providerSelectionResult) {
        this.providerSelectionResult = providerSelectionResult;
        PaymentProvider provider = providerSelectionResult != null ? providerSelectionResult.getProvider() : null;
        TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
        TrueLayerAnalytics.AnalyticsContext analyticsContext = companion.getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.setProviderId(provider != null ? provider.getId() : null);
        }
        TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
        if (analyticsContext2 == null) {
            return;
        }
        analyticsContext2.setProviderCountryCode(provider != null ? provider.getCountryCode() : null);
    }

    public final Outcome<PaymentProvider, CoreError> getPreSelectedProviderOutcome() {
        return this.preSelectedProviderOutcome;
    }

    public final void setPreSelectedProviderOutcome(Outcome<PaymentProvider, ? extends CoreError> outcome) {
        this.preSelectedProviderOutcome = outcome;
        PaymentProvider paymentProvider = outcome != null ? (PaymentProvider) Outcome4.okOrNull(outcome) : null;
        TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
        TrueLayerAnalytics.AnalyticsContext analyticsContext = companion.getAnalyticsContext();
        if (analyticsContext != null) {
            analyticsContext.setProviderId(paymentProvider != null ? paymentProvider.getId() : null);
        }
        TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
        if (analyticsContext2 == null) {
            return;
        }
        analyticsContext2.setProviderCountryCode(paymentProvider != null ? paymentProvider.getCountryCode() : null);
    }

    public final Outcome<MerchantConfig, CoreError> getMerchantConfigOutcome() {
        return this.merchantConfigOutcome;
    }

    public final void setMerchantConfigOutcome(Outcome<MerchantConfig, ? extends CoreError> outcome) {
        this.merchantConfigOutcome = outcome;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<CoreError> getErrors() {
        return CollectionsKt.listOfNotNull((Object[]) new CoreError[]{Outcome4.errorOrNull(this.paymentOutcome), Outcome4.errorOrNull(this.merchantConfigOutcome), Outcome4.errorOrNull(this.authorizationFlowResponseOutcome), Outcome4.errorOrNull(this.preSelectedProviderOutcome), Outcome4.errorOrNull(this.recommendedProvidersOutcome)});
    }

    public final ManagerDataSnapshot createSnapshot() {
        return new ManagerDataSnapshot(this.paymentOutcome, this.merchantConfigOutcome, this.authorizationFlowResponseOutcome, this.preSelectedProviderOutcome, this.recommendedProvidersOutcome, this.providerSelectionResult, this.translations, this.overrideCurrentFormFields, this.legals, getErrors());
    }

    public final void reset() {
        setPaymentOutcome(null);
        this.merchantConfigOutcome = null;
        this.authorizationFlowResponseOutcome = null;
        setPreSelectedProviderOutcome(null);
        this.recommendedProvidersOutcome = null;
    }
}
