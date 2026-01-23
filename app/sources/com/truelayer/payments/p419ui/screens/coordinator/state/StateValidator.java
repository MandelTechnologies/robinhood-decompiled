package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.FormInput;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.store.AdditionalInputs;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.ScreenKt;
import com.truelayer.payments.p419ui.screens.coordinator.state.PaymentProcessorState;
import com.truelayer.payments.p419ui.screens.coordinator.state.ValidatedState;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: StateValidator.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/StateValidator;", "", "()V", "MERCHANT_CONFIG_IS_NOT_AVAILABLE", "", "PAYMENT_UNAVAILABLE", "SELECTED_PROVIDER_IS_NOT_AVAILABLE", "TAG", "validateAuthorizationStep", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState;", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "snapshot", "Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "action", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/store/Store;Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateConsentStep", "validateFormStep", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;", "(Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;Lcom/truelayer/payments/core/store/Store;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateProviderSelectionStep", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;", "validateRedirectStep", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Redirect;", "validateSchemeSelectionStep", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SchemeSelection;", "validateUserAccountSelectionStep", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$UserAccountSelection;", "validateWaitStep", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class StateValidator {
    public static final int $stable = 0;
    public static final StateValidator INSTANCE = new StateValidator();
    private static final String MERCHANT_CONFIG_IS_NOT_AVAILABLE = "Merchant config is not available";
    private static final String PAYMENT_UNAVAILABLE = "Payment is not available";
    private static final String SELECTED_PROVIDER_IS_NOT_AVAILABLE = "Selected provider is not available";
    private static final String TAG = "StateValidator";

    /* compiled from: StateValidator.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.StateValidator", m3645f = "StateValidator.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "validateFormStep")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.StateValidator$validateFormStep$1 */
    static final class C430771 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C430771(Continuation<? super C430771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StateValidator.this.validateFormStep(null, null, null, this);
        }
    }

    private StateValidator() {
    }

    public final Object validateAuthorizationStep(PaymentContext paymentContext, Store store, ManagerDataSnapshot managerDataSnapshot, AuthorizationFlow2 authorizationFlow2, Continuation<? super ValidatedState> continuation) {
        List<CoreError> errors = managerDataSnapshot.getErrors();
        if (!errors.isEmpty()) {
            return new ValidatedState.Valid(new PaymentProcessorState.Error.Core((CoreError) CollectionsKt.first((List) errors), null, 2, null));
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.Consent) {
            return validateConsentStep(managerDataSnapshot);
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.Form) {
            return validateFormStep(managerDataSnapshot, (AuthorizationFlow2.Form) authorizationFlow2, store, continuation);
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.ProviderSelection) {
            return validateProviderSelectionStep(paymentContext, managerDataSnapshot, (AuthorizationFlow2.ProviderSelection) authorizationFlow2);
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.Redirect) {
            return validateRedirectStep(managerDataSnapshot, (AuthorizationFlow2.Redirect) authorizationFlow2);
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.SchemeSelection) {
            return validateSchemeSelectionStep(managerDataSnapshot, (AuthorizationFlow2.SchemeSelection) authorizationFlow2);
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.UserAccountSelection) {
            return validateUserAccountSelectionStep(managerDataSnapshot, (AuthorizationFlow2.UserAccountSelection) authorizationFlow2);
        }
        if (authorizationFlow2 instanceof AuthorizationFlow2.Wait) {
            return validateWaitStep(managerDataSnapshot, (AuthorizationFlow2.Wait) authorizationFlow2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ValidatedState validateSchemeSelectionStep(ManagerDataSnapshot snapshot, AuthorizationFlow2.SchemeSelection action) {
        Logger6.i$default(Logger6.INSTANCE, "Validating -> validateSchemeSelectionStep", TAG, null, 4, null);
        Payment payment = (Payment) Outcome4.okOrNull(snapshot.getPayment());
        if (payment == null) {
            return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
        }
        MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(snapshot.getMerchantConfig());
        if (merchantConfig == null) {
            return new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE));
        }
        PaymentProvider selectedProvider = snapshot.getSelectedProvider();
        if (selectedProvider == null) {
            return new ValidatedState.Invalid(new Throwable(SELECTED_PROVIDER_IS_NOT_AVAILABLE));
        }
        ProviderSelectionResult providerSelectionResult = snapshot.getProviderSelectionResult();
        return new ValidatedState.Valid(new PaymentProcessorState.Authorizing.SchemeSelection(payment, merchantConfig, selectedProvider, action, providerSelectionResult != null ? providerSelectionResult.getSchemeId() : null));
    }

    private final ValidatedState validateProviderSelectionStep(PaymentContext paymentContext, ManagerDataSnapshot snapshot, AuthorizationFlow2.ProviderSelection action) {
        Logger6.i$default(Logger6.INSTANCE, "Validating -> validateProviderSelectionStep", TAG, null, 4, null);
        Payment payment = (Payment) Outcome4.okOrNull(snapshot.getPayment());
        if (payment == null) {
            return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
        }
        MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(snapshot.getMerchantConfig());
        if (merchantConfig == null) {
            return new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE));
        }
        List list = (List) Outcome4.okOrNull(snapshot.getRecommendedProviders());
        if (list == null) {
            return new ValidatedState.MoreDataRequired(PaymentProcessorState.Authorizing.ProviderSelection.class);
        }
        ProviderSelectionResult providerSelectionResult = snapshot.getProviderSelectionResult();
        PaymentContext.Preferences preferences = paymentContext.getPreferences();
        return new ValidatedState.Valid(new PaymentProcessorState.Authorizing.ProviderSelection(payment, merchantConfig, providerSelectionResult, list, preferences != null ? preferences.getPreferredCountryCode() : null, action));
    }

    private final ValidatedState validateUserAccountSelectionStep(ManagerDataSnapshot snapshot, AuthorizationFlow2.UserAccountSelection action) {
        Logger6.i$default(Logger6.INSTANCE, "Validating -> validateUserAccountSelectionStep", TAG, null, 4, null);
        Payment payment = (Payment) Outcome4.okOrNull(snapshot.getPayment());
        if (payment == null) {
            return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
        }
        MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(snapshot.getMerchantConfig());
        return merchantConfig == null ? new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE)) : new ValidatedState.Valid(new PaymentProcessorState.Authorizing.UserAccountSelection(payment, merchantConfig, action));
    }

    private final ValidatedState validateConsentStep(ManagerDataSnapshot snapshot) {
        Logger6.i$default(Logger6.INSTANCE, "Validating -> validateConsentStep  provider:" + snapshot.getSelectedProvider(), TAG, null, 4, null);
        Payment payment = (Payment) Outcome4.okOrNull(snapshot.getPayment());
        if (payment == null) {
            return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
        }
        MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(snapshot.getMerchantConfig());
        if (merchantConfig == null) {
            return new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE));
        }
        PaymentProvider selectedProvider = snapshot.getSelectedProvider();
        if (selectedProvider == null) {
            return new ValidatedState.Invalid(new Throwable(SELECTED_PROVIDER_IS_NOT_AVAILABLE));
        }
        ProviderSelectionResult providerSelectionResult = snapshot.getProviderSelectionResult();
        boolean z = false;
        if (providerSelectionResult != null && providerSelectionResult.getConsentGiven()) {
            z = true;
        }
        return new ValidatedState.Valid(new PaymentProcessorState.Authorizing.Consent(payment, merchantConfig, selectedProvider, !z));
    }

    private final ValidatedState validateRedirectStep(ManagerDataSnapshot snapshot, AuthorizationFlow2.Redirect action) {
        Logger6.i$default(Logger6.INSTANCE, "Validating -> validateRedirectStep", TAG, null, 4, null);
        Payment payment = (Payment) Outcome4.okOrNull(snapshot.getPayment());
        if (payment == null) {
            return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
        }
        MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(snapshot.getMerchantConfig());
        if (merchantConfig == null) {
            return new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE));
        }
        if (StringsKt.isBlank(action.getUrl())) {
            return new ValidatedState.Invalid(new Throwable("Redirect URL is not available or blank"));
        }
        return new ValidatedState.Valid(new PaymentProcessorState.Authorizing.Redirect(payment, merchantConfig, action));
    }

    private final ValidatedState validateWaitStep(ManagerDataSnapshot snapshot, AuthorizationFlow2.Wait action) {
        Logger6.i$default(Logger6.INSTANCE, "Validating -> validateWaitStep", TAG, null, 4, null);
        Payment payment = (Payment) Outcome4.okOrNull(snapshot.getPayment());
        if (payment == null) {
            return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
        }
        MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(snapshot.getMerchantConfig());
        if (merchantConfig == null) {
            return new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE));
        }
        PaymentProvider selectedProvider = snapshot.getSelectedProvider();
        if (selectedProvider == null) {
            return new ValidatedState.Invalid(new Throwable(SELECTED_PROVIDER_IS_NOT_AVAILABLE));
        }
        Legals legals = snapshot.getLegals();
        if (legals != null && snapshot.getTranslationsOutcome() != null) {
            return new ValidatedState.Valid(new PaymentProcessorState.Authorizing.Wait(payment, merchantConfig, legals, snapshot.getTranslations(), selectedProvider, action));
        }
        return new ValidatedState.MoreDataRequired(PaymentProcessorState.Authorizing.Wait.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateFormStep(ManagerDataSnapshot managerDataSnapshot, AuthorizationFlow2.Form form, Store store, Continuation<? super ValidatedState> continuation) {
        C430771 c430771;
        MerchantConfig merchantConfig;
        PaymentProvider paymentProvider;
        Payment payment;
        ArrayList arrayList;
        AuthorizationFlow2.Form form2;
        Branch branch;
        Object objEmptyList;
        if (continuation instanceof C430771) {
            c430771 = (C430771) continuation;
            int i = c430771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430771.label = i - Integer.MIN_VALUE;
            } else {
                c430771 = new C430771(continuation);
            }
        }
        Object obj = c430771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "Validating -> validateFormStep", TAG, null, 4, null);
            Payment payment2 = (Payment) Outcome4.okOrNull(managerDataSnapshot.getPayment());
            if (payment2 == null) {
                return new ValidatedState.Invalid(new Throwable(PAYMENT_UNAVAILABLE));
            }
            merchantConfig = (MerchantConfig) Outcome4.okOrNull(managerDataSnapshot.getMerchantConfig());
            if (merchantConfig == null) {
                return new ValidatedState.Invalid(new Throwable(MERCHANT_CONFIG_IS_NOT_AVAILABLE));
            }
            paymentProvider = (PaymentProvider) Outcome4.okOrNull(managerDataSnapshot.getSelectedProviderOutcome());
            if (paymentProvider == null) {
                return new ValidatedState.Invalid(new Throwable(SELECTED_PROVIDER_IS_NOT_AVAILABLE));
            }
            ProviderSelectionResult providerSelectionResult = managerDataSnapshot.getProviderSelectionResult();
            if (form.getInputs().isEmpty()) {
                return new ValidatedState.Invalid(new Throwable("Inputs are not available or blank"));
            }
            List<FormInput> inputs = form.getInputs();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : inputs) {
                if (((FormInput) obj2).getMandatory()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                arrayList3.add(ScreenKt.intoFormInputWrapper$default((FormInput) it.next(), null, 1, null));
            }
            Branch branch2 = providerSelectionResult != null ? providerSelectionResult.getBranch() : null;
            AdditionalInputs additionalInputs = store.getAdditionalInputs();
            String id = paymentProvider.getId();
            c430771.L$0 = payment2;
            c430771.L$1 = merchantConfig;
            c430771.L$2 = paymentProvider;
            c430771.L$3 = branch2;
            c430771.L$4 = form;
            c430771.L$5 = arrayList3;
            c430771.label = 1;
            Object all = additionalInputs.getAll(id, c430771);
            if (all == coroutine_suspended) {
                return coroutine_suspended;
            }
            payment = payment2;
            obj = all;
            arrayList = arrayList3;
            form2 = form;
            branch = branch2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r3 = (List) c430771.L$5;
            AuthorizationFlow2.Form form3 = (AuthorizationFlow2.Form) c430771.L$4;
            Branch branch3 = (Branch) c430771.L$3;
            paymentProvider = (PaymentProvider) c430771.L$2;
            merchantConfig = (MerchantConfig) c430771.L$1;
            Payment payment3 = (Payment) c430771.L$0;
            ResultKt.throwOnFailure(obj);
            payment = payment3;
            arrayList = r3;
            form2 = form3;
            branch = branch3;
        }
        PaymentProvider paymentProvider2 = paymentProvider;
        MerchantConfig merchantConfig2 = merchantConfig;
        Outcome outcome = (Outcome) obj;
        if (outcome instanceof Ok) {
            objEmptyList = ((Ok) outcome).getValue();
        } else {
            if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            objEmptyList = CollectionsKt.emptyList();
        }
        return new ValidatedState.Valid(new PaymentProcessorState.Authorizing.Form(payment, merchantConfig2, paymentProvider2, branch, form2, arrayList, (List) objEmptyList));
    }
}
