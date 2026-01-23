package com.robinhood.android.transfers.p271ui.max.accounts;

import kotlin.Metadata;

/* compiled from: ConfirmDeleteDialogViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/ConfirmDeleteDialogViewState;", "", "isDismissible", "", "isPrimaryButtonLoading", "isSecondaryButtonEnabled", "<init>", "(ZZZ)V", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConfirmDeleteDialogViewState {
    public static final int $stable = 0;
    private final boolean isDismissible;
    private final boolean isPrimaryButtonLoading;
    private final boolean isSecondaryButtonEnabled;

    public static /* synthetic */ ConfirmDeleteDialogViewState copy$default(ConfirmDeleteDialogViewState confirmDeleteDialogViewState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confirmDeleteDialogViewState.isDismissible;
        }
        if ((i & 2) != 0) {
            z2 = confirmDeleteDialogViewState.isPrimaryButtonLoading;
        }
        if ((i & 4) != 0) {
            z3 = confirmDeleteDialogViewState.isSecondaryButtonEnabled;
        }
        return confirmDeleteDialogViewState.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDismissible() {
        return this.isDismissible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSecondaryButtonEnabled() {
        return this.isSecondaryButtonEnabled;
    }

    public final ConfirmDeleteDialogViewState copy(boolean isDismissible, boolean isPrimaryButtonLoading, boolean isSecondaryButtonEnabled) {
        return new ConfirmDeleteDialogViewState(isDismissible, isPrimaryButtonLoading, isSecondaryButtonEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmDeleteDialogViewState)) {
            return false;
        }
        ConfirmDeleteDialogViewState confirmDeleteDialogViewState = (ConfirmDeleteDialogViewState) other;
        return this.isDismissible == confirmDeleteDialogViewState.isDismissible && this.isPrimaryButtonLoading == confirmDeleteDialogViewState.isPrimaryButtonLoading && this.isSecondaryButtonEnabled == confirmDeleteDialogViewState.isSecondaryButtonEnabled;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isDismissible) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading)) * 31) + Boolean.hashCode(this.isSecondaryButtonEnabled);
    }

    public String toString() {
        return "ConfirmDeleteDialogViewState(isDismissible=" + this.isDismissible + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ", isSecondaryButtonEnabled=" + this.isSecondaryButtonEnabled + ")";
    }

    public ConfirmDeleteDialogViewState(boolean z, boolean z2, boolean z3) {
        this.isDismissible = z;
        this.isPrimaryButtonLoading = z2;
        this.isSecondaryButtonEnabled = z3;
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    public final boolean isPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final boolean isSecondaryButtonEnabled() {
        return this.isSecondaryButtonEnabled;
    }
}
