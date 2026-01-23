package com.truelayer.payments.p419ui.screens.formflows;

import com.truelayer.payments.core.domain.payments.Branch;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormViewData.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormViewData;", "", "selectedProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "selectedBranch", "Lcom/truelayer/payments/core/domain/payments/Branch;", "isSignupPlus", "", "inputs", "", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "previouslyUsedValues", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "(Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/core/domain/payments/Branch;ZLjava/util/List;Ljava/util/List;)V", "getInputs", "()Ljava/util/List;", "setInputs", "(Ljava/util/List;)V", "()Z", "getPreviouslyUsedValues", "getSelectedBranch", "()Lcom/truelayer/payments/core/domain/payments/Branch;", "getSelectedProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FormViewData {
    public static final int $stable = 8;
    private List<? extends FormInputWrapper> inputs;
    private final boolean isSignupPlus;
    private final List<RecentAdditionalInput> previouslyUsedValues;
    private final Branch selectedBranch;
    private final PaymentProvider selectedProvider;

    public static /* synthetic */ FormViewData copy$default(FormViewData formViewData, PaymentProvider paymentProvider, Branch branch, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProvider = formViewData.selectedProvider;
        }
        if ((i & 2) != 0) {
            branch = formViewData.selectedBranch;
        }
        if ((i & 4) != 0) {
            z = formViewData.isSignupPlus;
        }
        if ((i & 8) != 0) {
            list = formViewData.inputs;
        }
        if ((i & 16) != 0) {
            list2 = formViewData.previouslyUsedValues;
        }
        List list3 = list2;
        boolean z2 = z;
        return formViewData.copy(paymentProvider, branch, z2, list, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProvider getSelectedProvider() {
        return this.selectedProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final Branch getSelectedBranch() {
        return this.selectedBranch;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSignupPlus() {
        return this.isSignupPlus;
    }

    public final List<FormInputWrapper> component4() {
        return this.inputs;
    }

    public final List<RecentAdditionalInput> component5() {
        return this.previouslyUsedValues;
    }

    public final FormViewData copy(PaymentProvider selectedProvider, Branch selectedBranch, boolean isSignupPlus, List<? extends FormInputWrapper> inputs, List<RecentAdditionalInput> previouslyUsedValues) {
        Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(previouslyUsedValues, "previouslyUsedValues");
        return new FormViewData(selectedProvider, selectedBranch, isSignupPlus, inputs, previouslyUsedValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormViewData)) {
            return false;
        }
        FormViewData formViewData = (FormViewData) other;
        return Intrinsics.areEqual(this.selectedProvider, formViewData.selectedProvider) && Intrinsics.areEqual(this.selectedBranch, formViewData.selectedBranch) && this.isSignupPlus == formViewData.isSignupPlus && Intrinsics.areEqual(this.inputs, formViewData.inputs) && Intrinsics.areEqual(this.previouslyUsedValues, formViewData.previouslyUsedValues);
    }

    public int hashCode() {
        int iHashCode = this.selectedProvider.hashCode() * 31;
        Branch branch = this.selectedBranch;
        return ((((((iHashCode + (branch == null ? 0 : branch.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31) + this.inputs.hashCode()) * 31) + this.previouslyUsedValues.hashCode();
    }

    public String toString() {
        return "FormViewData(selectedProvider=" + this.selectedProvider + ", selectedBranch=" + this.selectedBranch + ", isSignupPlus=" + this.isSignupPlus + ", inputs=" + this.inputs + ", previouslyUsedValues=" + this.previouslyUsedValues + ")";
    }

    public FormViewData(PaymentProvider selectedProvider, Branch branch, boolean z, List<? extends FormInputWrapper> inputs, List<RecentAdditionalInput> previouslyUsedValues) {
        Intrinsics.checkNotNullParameter(selectedProvider, "selectedProvider");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(previouslyUsedValues, "previouslyUsedValues");
        this.selectedProvider = selectedProvider;
        this.selectedBranch = branch;
        this.isSignupPlus = z;
        this.inputs = inputs;
        this.previouslyUsedValues = previouslyUsedValues;
    }

    public final PaymentProvider getSelectedProvider() {
        return this.selectedProvider;
    }

    public final Branch getSelectedBranch() {
        return this.selectedBranch;
    }

    public final boolean isSignupPlus() {
        return this.isSignupPlus;
    }

    public final List<FormInputWrapper> getInputs() {
        return this.inputs;
    }

    public final void setInputs(List<? extends FormInputWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inputs = list;
    }

    public final List<RecentAdditionalInput> getPreviouslyUsedValues() {
        return this.previouslyUsedValues;
    }
}
