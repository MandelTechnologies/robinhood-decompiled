package com.robinhood.shared.security.workflow.checklist;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ChecklistViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/checklist/ChecklistViewState;", "", "isPrimaryCtaEnabled", "", "isPrimaryCtaLoading", "checkboxStates", "Lkotlinx/collections/immutable/ImmutableList;", "<init>", "(ZZLkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getCheckboxStates", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChecklistViewState {
    public static final int $stable = 0;
    private final ImmutableList<Boolean> checkboxStates;
    private final boolean isPrimaryCtaEnabled;
    private final boolean isPrimaryCtaLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChecklistViewState copy$default(ChecklistViewState checklistViewState, boolean z, boolean z2, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checklistViewState.isPrimaryCtaEnabled;
        }
        if ((i & 2) != 0) {
            z2 = checklistViewState.isPrimaryCtaLoading;
        }
        if ((i & 4) != 0) {
            immutableList = checklistViewState.checkboxStates;
        }
        return checklistViewState.copy(z, z2, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPrimaryCtaEnabled() {
        return this.isPrimaryCtaEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrimaryCtaLoading() {
        return this.isPrimaryCtaLoading;
    }

    public final ImmutableList<Boolean> component3() {
        return this.checkboxStates;
    }

    public final ChecklistViewState copy(boolean isPrimaryCtaEnabled, boolean isPrimaryCtaLoading, ImmutableList<Boolean> checkboxStates) {
        Intrinsics.checkNotNullParameter(checkboxStates, "checkboxStates");
        return new ChecklistViewState(isPrimaryCtaEnabled, isPrimaryCtaLoading, checkboxStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChecklistViewState)) {
            return false;
        }
        ChecklistViewState checklistViewState = (ChecklistViewState) other;
        return this.isPrimaryCtaEnabled == checklistViewState.isPrimaryCtaEnabled && this.isPrimaryCtaLoading == checklistViewState.isPrimaryCtaLoading && Intrinsics.areEqual(this.checkboxStates, checklistViewState.checkboxStates);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isPrimaryCtaEnabled) * 31) + Boolean.hashCode(this.isPrimaryCtaLoading)) * 31) + this.checkboxStates.hashCode();
    }

    public String toString() {
        return "ChecklistViewState(isPrimaryCtaEnabled=" + this.isPrimaryCtaEnabled + ", isPrimaryCtaLoading=" + this.isPrimaryCtaLoading + ", checkboxStates=" + this.checkboxStates + ")";
    }

    public ChecklistViewState(boolean z, boolean z2, ImmutableList<Boolean> checkboxStates) {
        Intrinsics.checkNotNullParameter(checkboxStates, "checkboxStates");
        this.isPrimaryCtaEnabled = z;
        this.isPrimaryCtaLoading = z2;
        this.checkboxStates = checkboxStates;
    }

    public final boolean isPrimaryCtaEnabled() {
        return this.isPrimaryCtaEnabled;
    }

    public final boolean isPrimaryCtaLoading() {
        return this.isPrimaryCtaLoading;
    }

    public final ImmutableList<Boolean> getCheckboxStates() {
        return this.checkboxStates;
    }
}
