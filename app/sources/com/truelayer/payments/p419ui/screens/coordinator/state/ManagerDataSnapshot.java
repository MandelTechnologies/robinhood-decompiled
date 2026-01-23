package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagerDataSnapshot.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001a\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012 \u0010\u0010\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\u0010\u0019J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u001d\u00100\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J#\u00102\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003Jñ\u0001\u00105\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u001c\b\u0002\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\"\b\u0002\u0010\u0010\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u00109\u001a\u0004\u0018\u00010\u0017J\b\u0010:\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R%\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR+\u0010\u0010\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001f¨\u0006?"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "authorizationFlowResponse", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "selectedProviderOutcome", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "recommendedProviders", "", "providerSelectionResult", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "translationsOutcome", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "overrideCurrentFormFields", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "legalsOutcome", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "errors", "(Lcom/truelayer/payments/core/domain/utils/Outcome;Lcom/truelayer/payments/core/domain/utils/Outcome;Lcom/truelayer/payments/core/domain/utils/Outcome;Lcom/truelayer/payments/core/domain/utils/Outcome;Lcom/truelayer/payments/core/domain/utils/Outcome;Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;Lcom/truelayer/payments/core/domain/utils/Outcome;Ljava/util/List;Lcom/truelayer/payments/core/domain/utils/Outcome;Ljava/util/List;)V", "authorizationFlowActionNext", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "getAuthorizationFlowActionNext", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "getAuthorizationFlowResponse", "()Lcom/truelayer/payments/core/domain/utils/Outcome;", "getErrors", "()Ljava/util/List;", "getLegalsOutcome", "getMerchantConfig", "getOverrideCurrentFormFields", "getPayment", "getProviderSelectionResult", "()Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "getRecommendedProviders", "getSelectedProviderOutcome", "getTranslationsOutcome", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getLegals", "getSelectedProvider", "getTranslations", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ManagerDataSnapshot {
    public static final int $stable = 8;
    private final Outcome<AuthorizationFlowResponse, CoreError> authorizationFlowResponse;
    private final List<CoreError> errors;
    private final Outcome<Legals, CoreError> legalsOutcome;
    private final Outcome<MerchantConfig, CoreError> merchantConfig;
    private final List<FormInputWrapper> overrideCurrentFormFields;
    private final Outcome<Payment, CoreError> payment;
    private final ProviderSelectionResult providerSelectionResult;
    private final Outcome<List<PaymentProvider>, CoreError> recommendedProviders;
    private final Outcome<PaymentProvider, CoreError> selectedProviderOutcome;
    private final Outcome<Map<String, LocalisedText>, CoreError> translationsOutcome;

    public static /* synthetic */ ManagerDataSnapshot copy$default(ManagerDataSnapshot managerDataSnapshot, Outcome outcome, Outcome outcome2, Outcome outcome3, Outcome outcome4, Outcome outcome5, ProviderSelectionResult providerSelectionResult, Outcome outcome6, List list, Outcome outcome7, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            outcome = managerDataSnapshot.payment;
        }
        if ((i & 2) != 0) {
            outcome2 = managerDataSnapshot.merchantConfig;
        }
        if ((i & 4) != 0) {
            outcome3 = managerDataSnapshot.authorizationFlowResponse;
        }
        if ((i & 8) != 0) {
            outcome4 = managerDataSnapshot.selectedProviderOutcome;
        }
        if ((i & 16) != 0) {
            outcome5 = managerDataSnapshot.recommendedProviders;
        }
        if ((i & 32) != 0) {
            providerSelectionResult = managerDataSnapshot.providerSelectionResult;
        }
        if ((i & 64) != 0) {
            outcome6 = managerDataSnapshot.translationsOutcome;
        }
        if ((i & 128) != 0) {
            list = managerDataSnapshot.overrideCurrentFormFields;
        }
        if ((i & 256) != 0) {
            outcome7 = managerDataSnapshot.legalsOutcome;
        }
        if ((i & 512) != 0) {
            list2 = managerDataSnapshot.errors;
        }
        Outcome outcome8 = outcome7;
        List list3 = list2;
        Outcome outcome9 = outcome6;
        List list4 = list;
        Outcome outcome10 = outcome5;
        ProviderSelectionResult providerSelectionResult2 = providerSelectionResult;
        return managerDataSnapshot.copy(outcome, outcome2, outcome3, outcome4, outcome10, providerSelectionResult2, outcome9, list4, outcome8, list3);
    }

    public final Outcome<Payment, CoreError> component1() {
        return this.payment;
    }

    public final List<CoreError> component10() {
        return this.errors;
    }

    public final Outcome<MerchantConfig, CoreError> component2() {
        return this.merchantConfig;
    }

    public final Outcome<AuthorizationFlowResponse, CoreError> component3() {
        return this.authorizationFlowResponse;
    }

    public final Outcome<PaymentProvider, CoreError> component4() {
        return this.selectedProviderOutcome;
    }

    public final Outcome<List<PaymentProvider>, CoreError> component5() {
        return this.recommendedProviders;
    }

    /* renamed from: component6, reason: from getter */
    public final ProviderSelectionResult getProviderSelectionResult() {
        return this.providerSelectionResult;
    }

    public final Outcome<Map<String, LocalisedText>, CoreError> component7() {
        return this.translationsOutcome;
    }

    public final List<FormInputWrapper> component8() {
        return this.overrideCurrentFormFields;
    }

    public final Outcome<Legals, CoreError> component9() {
        return this.legalsOutcome;
    }

    public final ManagerDataSnapshot copy(Outcome<? extends Payment, ? extends CoreError> payment, Outcome<MerchantConfig, ? extends CoreError> merchantConfig, Outcome<? extends AuthorizationFlowResponse, ? extends CoreError> authorizationFlowResponse, Outcome<PaymentProvider, ? extends CoreError> selectedProviderOutcome, Outcome<? extends List<PaymentProvider>, ? extends CoreError> recommendedProviders, ProviderSelectionResult providerSelectionResult, Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> translationsOutcome, List<? extends FormInputWrapper> overrideCurrentFormFields, Outcome<Legals, ? extends CoreError> legalsOutcome, List<? extends CoreError> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new ManagerDataSnapshot(payment, merchantConfig, authorizationFlowResponse, selectedProviderOutcome, recommendedProviders, providerSelectionResult, translationsOutcome, overrideCurrentFormFields, legalsOutcome, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagerDataSnapshot)) {
            return false;
        }
        ManagerDataSnapshot managerDataSnapshot = (ManagerDataSnapshot) other;
        return Intrinsics.areEqual(this.payment, managerDataSnapshot.payment) && Intrinsics.areEqual(this.merchantConfig, managerDataSnapshot.merchantConfig) && Intrinsics.areEqual(this.authorizationFlowResponse, managerDataSnapshot.authorizationFlowResponse) && Intrinsics.areEqual(this.selectedProviderOutcome, managerDataSnapshot.selectedProviderOutcome) && Intrinsics.areEqual(this.recommendedProviders, managerDataSnapshot.recommendedProviders) && Intrinsics.areEqual(this.providerSelectionResult, managerDataSnapshot.providerSelectionResult) && Intrinsics.areEqual(this.translationsOutcome, managerDataSnapshot.translationsOutcome) && Intrinsics.areEqual(this.overrideCurrentFormFields, managerDataSnapshot.overrideCurrentFormFields) && Intrinsics.areEqual(this.legalsOutcome, managerDataSnapshot.legalsOutcome) && Intrinsics.areEqual(this.errors, managerDataSnapshot.errors);
    }

    public int hashCode() {
        Outcome<Payment, CoreError> outcome = this.payment;
        int iHashCode = (outcome == null ? 0 : outcome.hashCode()) * 31;
        Outcome<MerchantConfig, CoreError> outcome2 = this.merchantConfig;
        int iHashCode2 = (iHashCode + (outcome2 == null ? 0 : outcome2.hashCode())) * 31;
        Outcome<AuthorizationFlowResponse, CoreError> outcome3 = this.authorizationFlowResponse;
        int iHashCode3 = (iHashCode2 + (outcome3 == null ? 0 : outcome3.hashCode())) * 31;
        Outcome<PaymentProvider, CoreError> outcome4 = this.selectedProviderOutcome;
        int iHashCode4 = (iHashCode3 + (outcome4 == null ? 0 : outcome4.hashCode())) * 31;
        Outcome<List<PaymentProvider>, CoreError> outcome5 = this.recommendedProviders;
        int iHashCode5 = (iHashCode4 + (outcome5 == null ? 0 : outcome5.hashCode())) * 31;
        ProviderSelectionResult providerSelectionResult = this.providerSelectionResult;
        int iHashCode6 = (iHashCode5 + (providerSelectionResult == null ? 0 : providerSelectionResult.hashCode())) * 31;
        Outcome<Map<String, LocalisedText>, CoreError> outcome6 = this.translationsOutcome;
        int iHashCode7 = (iHashCode6 + (outcome6 == null ? 0 : outcome6.hashCode())) * 31;
        List<FormInputWrapper> list = this.overrideCurrentFormFields;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Outcome<Legals, CoreError> outcome7 = this.legalsOutcome;
        return ((iHashCode8 + (outcome7 != null ? outcome7.hashCode() : 0)) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "ManagerDataSnapshot(payment=" + this.payment + ", merchantConfig=" + this.merchantConfig + ", authorizationFlowResponse=" + this.authorizationFlowResponse + ", selectedProviderOutcome=" + this.selectedProviderOutcome + ", recommendedProviders=" + this.recommendedProviders + ", providerSelectionResult=" + this.providerSelectionResult + ", translationsOutcome=" + this.translationsOutcome + ", overrideCurrentFormFields=" + this.overrideCurrentFormFields + ", legalsOutcome=" + this.legalsOutcome + ", errors=" + this.errors + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ManagerDataSnapshot(Outcome<? extends Payment, ? extends CoreError> outcome, Outcome<MerchantConfig, ? extends CoreError> outcome2, Outcome<? extends AuthorizationFlowResponse, ? extends CoreError> outcome3, Outcome<PaymentProvider, ? extends CoreError> outcome4, Outcome<? extends List<PaymentProvider>, ? extends CoreError> outcome5, ProviderSelectionResult providerSelectionResult, Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> outcome6, List<? extends FormInputWrapper> list, Outcome<Legals, ? extends CoreError> outcome7, List<? extends CoreError> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.payment = outcome;
        this.merchantConfig = outcome2;
        this.authorizationFlowResponse = outcome3;
        this.selectedProviderOutcome = outcome4;
        this.recommendedProviders = outcome5;
        this.providerSelectionResult = providerSelectionResult;
        this.translationsOutcome = outcome6;
        this.overrideCurrentFormFields = list;
        this.legalsOutcome = outcome7;
        this.errors = errors;
    }

    public final Outcome<Payment, CoreError> getPayment() {
        return this.payment;
    }

    public final Outcome<MerchantConfig, CoreError> getMerchantConfig() {
        return this.merchantConfig;
    }

    public final Outcome<AuthorizationFlowResponse, CoreError> getAuthorizationFlowResponse() {
        return this.authorizationFlowResponse;
    }

    public final Outcome<PaymentProvider, CoreError> getSelectedProviderOutcome() {
        return this.selectedProviderOutcome;
    }

    public final Outcome<List<PaymentProvider>, CoreError> getRecommendedProviders() {
        return this.recommendedProviders;
    }

    public final ProviderSelectionResult getProviderSelectionResult() {
        return this.providerSelectionResult;
    }

    public final Outcome<Map<String, LocalisedText>, CoreError> getTranslationsOutcome() {
        return this.translationsOutcome;
    }

    public final List<FormInputWrapper> getOverrideCurrentFormFields() {
        return this.overrideCurrentFormFields;
    }

    public final Outcome<Legals, CoreError> getLegalsOutcome() {
        return this.legalsOutcome;
    }

    public final List<CoreError> getErrors() {
        return this.errors;
    }

    public final AuthorizationFlow2 getAuthorizationFlowActionNext() {
        AuthorizationFlow authorizationFlow;
        AuthorizationFlow.FlowActions actions;
        AuthorizationFlow authorizationFlow2;
        AuthorizationFlow.FlowActions actions2;
        AuthorizationFlow2 next;
        Object objOkOrNull = Outcome4.okOrNull(this.authorizationFlowResponse);
        AuthorizationFlowResponse.Authorizing authorizing = objOkOrNull instanceof AuthorizationFlowResponse.Authorizing ? (AuthorizationFlowResponse.Authorizing) objOkOrNull : null;
        if (authorizing != null && (authorizationFlow2 = authorizing.getAuthorizationFlow()) != null && (actions2 = authorizationFlow2.getActions()) != null && (next = actions2.getNext()) != null) {
            return next;
        }
        Object objOkOrNull2 = Outcome4.okOrNull(this.payment);
        Payment.Authorizing authorizing2 = objOkOrNull2 instanceof Payment.Authorizing ? (Payment.Authorizing) objOkOrNull2 : null;
        if (authorizing2 == null || (authorizationFlow = authorizing2.getAuthorizationFlow()) == null || (actions = authorizationFlow.getActions()) == null) {
            return null;
        }
        return actions.getNext();
    }

    public final PaymentProvider getSelectedProvider() {
        PaymentProvider paymentProvider = (PaymentProvider) Outcome4.okOrNull(this.selectedProviderOutcome);
        if (paymentProvider != null) {
            return paymentProvider;
        }
        ProviderSelectionResult providerSelectionResult = this.providerSelectionResult;
        if (providerSelectionResult != null) {
            return providerSelectionResult.getProvider();
        }
        return null;
    }

    public final Map<String, LocalisedText> getTranslations() {
        return (Map) Outcome4.okOrNull(this.translationsOutcome);
    }

    public final Legals getLegals() {
        return (Legals) Outcome4.okOrNull(this.legalsOutcome);
    }
}
