package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.additional.verification;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AdditionalVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationViewState;", "", "isLoading", "", "showConfirmationDialog", "<init>", "(ZZ)V", "()Z", "getShowConfirmationDialog", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdditionalVerificationViewState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final boolean showConfirmationDialog;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdditionalVerificationViewState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ AdditionalVerificationViewState copy$default(AdditionalVerificationViewState additionalVerificationViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = additionalVerificationViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = additionalVerificationViewState.showConfirmationDialog;
        }
        return additionalVerificationViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowConfirmationDialog() {
        return this.showConfirmationDialog;
    }

    public final AdditionalVerificationViewState copy(boolean isLoading, boolean showConfirmationDialog) {
        return new AdditionalVerificationViewState(isLoading, showConfirmationDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalVerificationViewState)) {
            return false;
        }
        AdditionalVerificationViewState additionalVerificationViewState = (AdditionalVerificationViewState) other;
        return this.isLoading == additionalVerificationViewState.isLoading && this.showConfirmationDialog == additionalVerificationViewState.showConfirmationDialog;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.showConfirmationDialog);
    }

    public String toString() {
        return "AdditionalVerificationViewState(isLoading=" + this.isLoading + ", showConfirmationDialog=" + this.showConfirmationDialog + ")";
    }

    public AdditionalVerificationViewState(boolean z, boolean z2) {
        this.isLoading = z;
        this.showConfirmationDialog = z2;
    }

    public /* synthetic */ AdditionalVerificationViewState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowConfirmationDialog() {
        return this.showConfirmationDialog;
    }
}
