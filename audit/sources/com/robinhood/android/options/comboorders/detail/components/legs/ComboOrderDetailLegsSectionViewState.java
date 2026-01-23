package com.robinhood.android.options.comboorders.detail.components.legs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ComboOrderDetailLegsSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsSectionViewState;", "", "legsRowViewState", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/comboorders/detail/components/legs/ComboOrderDetailLegsRowViewState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getLegsRowViewState", "()Lkotlinx/collections/immutable/ImmutableList;", "isVisible", "", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailLegsSectionViewState {
    public static final int $stable = 0;
    private final ImmutableList<ComboOrderDetailLegsRowViewState> legsRowViewState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComboOrderDetailLegsSectionViewState copy$default(ComboOrderDetailLegsSectionViewState comboOrderDetailLegsSectionViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = comboOrderDetailLegsSectionViewState.legsRowViewState;
        }
        return comboOrderDetailLegsSectionViewState.copy(immutableList);
    }

    public final ImmutableList<ComboOrderDetailLegsRowViewState> component1() {
        return this.legsRowViewState;
    }

    public final ComboOrderDetailLegsSectionViewState copy(ImmutableList<ComboOrderDetailLegsRowViewState> legsRowViewState) {
        Intrinsics.checkNotNullParameter(legsRowViewState, "legsRowViewState");
        return new ComboOrderDetailLegsSectionViewState(legsRowViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ComboOrderDetailLegsSectionViewState) && Intrinsics.areEqual(this.legsRowViewState, ((ComboOrderDetailLegsSectionViewState) other).legsRowViewState);
    }

    public int hashCode() {
        return this.legsRowViewState.hashCode();
    }

    public String toString() {
        return "ComboOrderDetailLegsSectionViewState(legsRowViewState=" + this.legsRowViewState + ")";
    }

    public ComboOrderDetailLegsSectionViewState(ImmutableList<ComboOrderDetailLegsRowViewState> legsRowViewState) {
        Intrinsics.checkNotNullParameter(legsRowViewState, "legsRowViewState");
        this.legsRowViewState = legsRowViewState;
    }

    public final ImmutableList<ComboOrderDetailLegsRowViewState> getLegsRowViewState() {
        return this.legsRowViewState;
    }

    public final boolean isVisible() {
        return !this.legsRowViewState.isEmpty();
    }
}
