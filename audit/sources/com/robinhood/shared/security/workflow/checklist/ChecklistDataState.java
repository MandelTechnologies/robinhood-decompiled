package com.robinhood.shared.security.workflow.checklist;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ChecklistDataState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/checklist/ChecklistDataState;", "", "checkboxStates", "Lkotlinx/collections/immutable/ImmutableList;", "", "hasDelayPassed", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getCheckboxStates", "()Lkotlinx/collections/immutable/ImmutableList;", "getHasDelayPassed", "()Z", "isPrimaryCtaEnabled", "isPrimaryCtaLoading", "allCheckboxesChecked", "getAllCheckboxesChecked", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class ChecklistDataState {
    public static final int $stable = 0;
    private final ImmutableList<Boolean> checkboxStates;
    private final boolean hasDelayPassed;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChecklistDataState copy$default(ChecklistDataState checklistDataState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = checklistDataState.checkboxStates;
        }
        if ((i & 2) != 0) {
            z = checklistDataState.hasDelayPassed;
        }
        return checklistDataState.copy(immutableList, z);
    }

    public final ImmutableList<Boolean> component1() {
        return this.checkboxStates;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasDelayPassed() {
        return this.hasDelayPassed;
    }

    public final ChecklistDataState copy(ImmutableList<Boolean> checkboxStates, boolean hasDelayPassed) {
        Intrinsics.checkNotNullParameter(checkboxStates, "checkboxStates");
        return new ChecklistDataState(checkboxStates, hasDelayPassed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChecklistDataState)) {
            return false;
        }
        ChecklistDataState checklistDataState = (ChecklistDataState) other;
        return Intrinsics.areEqual(this.checkboxStates, checklistDataState.checkboxStates) && this.hasDelayPassed == checklistDataState.hasDelayPassed;
    }

    public int hashCode() {
        return (this.checkboxStates.hashCode() * 31) + Boolean.hashCode(this.hasDelayPassed);
    }

    public String toString() {
        return "ChecklistDataState(checkboxStates=" + this.checkboxStates + ", hasDelayPassed=" + this.hasDelayPassed + ")";
    }

    public ChecklistDataState(ImmutableList<Boolean> checkboxStates, boolean z) {
        Intrinsics.checkNotNullParameter(checkboxStates, "checkboxStates");
        this.checkboxStates = checkboxStates;
        this.hasDelayPassed = z;
    }

    public /* synthetic */ ChecklistDataState(ImmutableList immutableList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i & 2) != 0 ? false : z);
    }

    public final ImmutableList<Boolean> getCheckboxStates() {
        return this.checkboxStates;
    }

    public final boolean getHasDelayPassed() {
        return this.hasDelayPassed;
    }

    public final boolean isPrimaryCtaEnabled() {
        return this.hasDelayPassed && getAllCheckboxesChecked();
    }

    public final boolean isPrimaryCtaLoading() {
        return !this.hasDelayPassed && getAllCheckboxesChecked();
    }

    private final boolean getAllCheckboxesChecked() {
        ImmutableList<Boolean> immutableList = this.checkboxStates;
        if (immutableList != null && immutableList.isEmpty()) {
            return true;
        }
        Iterator<Boolean> it = immutableList.iterator();
        while (it.hasNext()) {
            if (!it.next().booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
