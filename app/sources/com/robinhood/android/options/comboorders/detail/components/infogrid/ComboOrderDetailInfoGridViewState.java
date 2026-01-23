package com.robinhood.android.options.comboorders.detail.components.infogrid;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ComboOrderDetailInfoGridViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridViewState;", "", "gridItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailGridItemViewState;", "isVisible", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getGridItems", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailInfoGridViewState {
    public static final int $stable = 0;
    private final ImmutableList<ComboOrderDetailInfoGridViewState2> gridItems;
    private final boolean isVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComboOrderDetailInfoGridViewState copy$default(ComboOrderDetailInfoGridViewState comboOrderDetailInfoGridViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = comboOrderDetailInfoGridViewState.gridItems;
        }
        if ((i & 2) != 0) {
            z = comboOrderDetailInfoGridViewState.isVisible;
        }
        return comboOrderDetailInfoGridViewState.copy(immutableList, z);
    }

    public final ImmutableList<ComboOrderDetailInfoGridViewState2> component1() {
        return this.gridItems;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final ComboOrderDetailInfoGridViewState copy(ImmutableList<? extends ComboOrderDetailInfoGridViewState2> gridItems, boolean isVisible) {
        Intrinsics.checkNotNullParameter(gridItems, "gridItems");
        return new ComboOrderDetailInfoGridViewState(gridItems, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailInfoGridViewState)) {
            return false;
        }
        ComboOrderDetailInfoGridViewState comboOrderDetailInfoGridViewState = (ComboOrderDetailInfoGridViewState) other;
        return Intrinsics.areEqual(this.gridItems, comboOrderDetailInfoGridViewState.gridItems) && this.isVisible == comboOrderDetailInfoGridViewState.isVisible;
    }

    public int hashCode() {
        return (this.gridItems.hashCode() * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "ComboOrderDetailInfoGridViewState(gridItems=" + this.gridItems + ", isVisible=" + this.isVisible + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComboOrderDetailInfoGridViewState(ImmutableList<? extends ComboOrderDetailInfoGridViewState2> gridItems, boolean z) {
        Intrinsics.checkNotNullParameter(gridItems, "gridItems");
        this.gridItems = gridItems;
        this.isVisible = z;
    }

    public /* synthetic */ ComboOrderDetailInfoGridViewState(ImmutableList immutableList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i & 2) != 0 ? false : z);
    }

    public final ImmutableList<ComboOrderDetailInfoGridViewState2> getGridItems() {
        return this.gridItems;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
