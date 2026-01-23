package com.truelayer.payments.core.domain.payments;

import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthorizationFlow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "", "Companion", "Consent", "Form", "ProviderSelection", "Redirect", "SchemeSelection", "SubsequentActionHint", "UserAccountSelection", "Wait", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Consent;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Redirect;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SchemeSelection;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$UserAccountSelection;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext, reason: use source file name */
/* loaded from: classes6.dex */
public interface AuthorizationFlow2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "providers", "", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Ljava/util/List;)V", "getProviders", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$ProviderSelection, reason: from toString */
    public static final /* data */ class ProviderSelection implements AuthorizationFlow2 {
        private final List<PaymentProvider> providers;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProviderSelection copy$default(ProviderSelection providerSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = providerSelection.providers;
            }
            return providerSelection.copy(list);
        }

        public final List<PaymentProvider> component1() {
            return this.providers;
        }

        public final ProviderSelection copy(List<PaymentProvider> providers) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            return new ProviderSelection(providers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProviderSelection) && Intrinsics.areEqual(this.providers, ((ProviderSelection) other).providers);
        }

        public int hashCode() {
            return this.providers.hashCode();
        }

        public String toString() {
            return "ProviderSelection(providers=" + this.providers + ")";
        }

        public ProviderSelection(List<PaymentProvider> providers) {
            Intrinsics.checkNotNullParameter(providers, "providers");
            this.providers = providers;
        }

        public final List<PaymentProvider> getProviders() {
            return this.providers;
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Redirect;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$Redirect, reason: from toString */
    public static final /* data */ class Redirect implements AuthorizationFlow2 {
        private final String url;

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.url;
            }
            return redirect.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Redirect copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Redirect(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Redirect) && Intrinsics.areEqual(this.url, ((Redirect) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "Redirect(url=" + this.url + ")";
        }

        public Redirect(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Wait;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "displayMessage", "Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "(Lcom/truelayer/payments/core/domain/payments/TranslatableText;)V", "getDisplayMessage", "()Lcom/truelayer/payments/core/domain/payments/TranslatableText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$Wait, reason: from toString */
    public static final /* data */ class Wait implements AuthorizationFlow2 {
        private final TranslatableText displayMessage;

        public static /* synthetic */ Wait copy$default(Wait wait, TranslatableText translatableText, int i, Object obj) {
            if ((i & 1) != 0) {
                translatableText = wait.displayMessage;
            }
            return wait.copy(translatableText);
        }

        /* renamed from: component1, reason: from getter */
        public final TranslatableText getDisplayMessage() {
            return this.displayMessage;
        }

        public final Wait copy(TranslatableText displayMessage) {
            return new Wait(displayMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Wait) && Intrinsics.areEqual(this.displayMessage, ((Wait) other).displayMessage);
        }

        public int hashCode() {
            TranslatableText translatableText = this.displayMessage;
            if (translatableText == null) {
                return 0;
            }
            return translatableText.hashCode();
        }

        public String toString() {
            return "Wait(displayMessage=" + this.displayMessage + ")";
        }

        public Wait(TranslatableText translatableText) {
            this.displayMessage = translatableText;
        }

        public final TranslatableText getDisplayMessage() {
            return this.displayMessage;
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Form;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "inputs", "", "Lcom/truelayer/payments/core/domain/payments/FormInput;", "(Ljava/util/List;)V", "getInputs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$Form, reason: from toString */
    public static final /* data */ class Form implements AuthorizationFlow2 {
        private final List<FormInput> inputs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Form copy$default(Form form, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = form.inputs;
            }
            return form.copy(list);
        }

        public final List<FormInput> component1() {
            return this.inputs;
        }

        public final Form copy(List<? extends FormInput> inputs) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new Form(inputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Form) && Intrinsics.areEqual(this.inputs, ((Form) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "Form(inputs=" + this.inputs + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Form(List<? extends FormInput> inputs) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.inputs = inputs;
        }

        public final List<FormInput> getInputs() {
            return this.inputs;
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Consent;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "subsequentActionHint", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SubsequentActionHint;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SubsequentActionHint;)V", "getSubsequentActionHint", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SubsequentActionHint;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$Consent, reason: from toString */
    public static final /* data */ class Consent implements AuthorizationFlow2 {
        private final SubsequentActionHint subsequentActionHint;

        public static /* synthetic */ Consent copy$default(Consent consent, SubsequentActionHint subsequentActionHint, int i, Object obj) {
            if ((i & 1) != 0) {
                subsequentActionHint = consent.subsequentActionHint;
            }
            return consent.copy(subsequentActionHint);
        }

        /* renamed from: component1, reason: from getter */
        public final SubsequentActionHint getSubsequentActionHint() {
            return this.subsequentActionHint;
        }

        public final Consent copy(SubsequentActionHint subsequentActionHint) {
            Intrinsics.checkNotNullParameter(subsequentActionHint, "subsequentActionHint");
            return new Consent(subsequentActionHint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Consent) && this.subsequentActionHint == ((Consent) other).subsequentActionHint;
        }

        public int hashCode() {
            return this.subsequentActionHint.hashCode();
        }

        public String toString() {
            return "Consent(subsequentActionHint=" + this.subsequentActionHint + ")";
        }

        public Consent(SubsequentActionHint subsequentActionHint) {
            Intrinsics.checkNotNullParameter(subsequentActionHint, "subsequentActionHint");
            this.subsequentActionHint = subsequentActionHint;
        }

        public final SubsequentActionHint getSubsequentActionHint() {
            return this.subsequentActionHint;
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SchemeSelection;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "schemes", "", "", "(Ljava/util/List;)V", "getSchemes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$SchemeSelection, reason: from toString */
    public static final /* data */ class SchemeSelection implements AuthorizationFlow2 {
        private final List<String> schemes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SchemeSelection copy$default(SchemeSelection schemeSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = schemeSelection.schemes;
            }
            return schemeSelection.copy(list);
        }

        public final List<String> component1() {
            return this.schemes;
        }

        public final SchemeSelection copy(List<String> schemes) {
            Intrinsics.checkNotNullParameter(schemes, "schemes");
            return new SchemeSelection(schemes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SchemeSelection) && Intrinsics.areEqual(this.schemes, ((SchemeSelection) other).schemes);
        }

        public int hashCode() {
            return this.schemes.hashCode();
        }

        public String toString() {
            return "SchemeSelection(schemes=" + this.schemes + ")";
        }

        public SchemeSelection(List<String> schemes) {
            Intrinsics.checkNotNullParameter(schemes, "schemes");
            this.schemes = schemes;
        }

        public final List<String> getSchemes() {
            return this.schemes;
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$UserAccountSelection;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext;", "userAccounts", "", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "(Ljava/util/List;)V", "getUserAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$UserAccountSelection, reason: from toString */
    public static final /* data */ class UserAccountSelection implements AuthorizationFlow2 {
        private final List<UserAccount> userAccounts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserAccountSelection copy$default(UserAccountSelection userAccountSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = userAccountSelection.userAccounts;
            }
            return userAccountSelection.copy(list);
        }

        public final List<UserAccount> component1() {
            return this.userAccounts;
        }

        public final UserAccountSelection copy(List<UserAccount> userAccounts) {
            Intrinsics.checkNotNullParameter(userAccounts, "userAccounts");
            return new UserAccountSelection(userAccounts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserAccountSelection) && Intrinsics.areEqual(this.userAccounts, ((UserAccountSelection) other).userAccounts);
        }

        public int hashCode() {
            return this.userAccounts.hashCode();
        }

        public String toString() {
            return "UserAccountSelection(userAccounts=" + this.userAccounts + ")";
        }

        public UserAccountSelection(List<UserAccount> userAccounts) {
            Intrinsics.checkNotNullParameter(userAccounts, "userAccounts");
            this.userAccounts = userAccounts;
        }

        public final List<UserAccount> getUserAccounts() {
            return this.userAccounts;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$SubsequentActionHint;", "", "(Ljava/lang/String;I)V", "Redirect", "Form", "Unknown", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$SubsequentActionHint */
    public static final class SubsequentActionHint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SubsequentActionHint[] $VALUES;
        public static final SubsequentActionHint Redirect = new SubsequentActionHint("Redirect", 0);
        public static final SubsequentActionHint Form = new SubsequentActionHint("Form", 1);
        public static final SubsequentActionHint Unknown = new SubsequentActionHint("Unknown", 2);

        private static final /* synthetic */ SubsequentActionHint[] $values() {
            return new SubsequentActionHint[]{Redirect, Form, Unknown};
        }

        public static EnumEntries<SubsequentActionHint> getEntries() {
            return $ENTRIES;
        }

        public static SubsequentActionHint valueOf(String str) {
            return (SubsequentActionHint) Enum.valueOf(SubsequentActionHint.class, str);
        }

        public static SubsequentActionHint[] values() {
            return (SubsequentActionHint[]) $VALUES.clone();
        }

        private SubsequentActionHint(String str, int i) {
        }

        static {
            SubsequentActionHint[] subsequentActionHintArr$values = $values();
            $VALUES = subsequentActionHintArr$values;
            $ENTRIES = EnumEntries2.enumEntries(subsequentActionHintArr$values);
        }
    }

    /* compiled from: AuthorizationFlow.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.core.domain.payments.AuthorizationFlowActionNext$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
