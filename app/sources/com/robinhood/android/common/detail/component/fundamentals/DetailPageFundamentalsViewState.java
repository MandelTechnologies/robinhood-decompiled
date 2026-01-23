package com.robinhood.android.common.detail.component.fundamentals;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DetailPageFundamentalsViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/fundamentals/DetailPageFundamentalsViewState;", "", "cells", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/common/detail/component/fundamentals/DetailPageFundamentalsDataCell;", "shouldShowFundamentalsSection", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getCells", "()Lkotlinx/collections/immutable/ImmutableList;", "getShouldShowFundamentalsSection", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageFundamentalsViewState {
    public static final int $stable = 0;
    private final ImmutableList<DetailPageFundamentalsDataCell> cells;
    private final boolean shouldShowFundamentalsSection;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailPageFundamentalsViewState copy$default(DetailPageFundamentalsViewState detailPageFundamentalsViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = detailPageFundamentalsViewState.cells;
        }
        if ((i & 2) != 0) {
            z = detailPageFundamentalsViewState.shouldShowFundamentalsSection;
        }
        return detailPageFundamentalsViewState.copy(immutableList, z);
    }

    public final ImmutableList<DetailPageFundamentalsDataCell> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowFundamentalsSection() {
        return this.shouldShowFundamentalsSection;
    }

    public final DetailPageFundamentalsViewState copy(ImmutableList<DetailPageFundamentalsDataCell> cells, boolean shouldShowFundamentalsSection) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new DetailPageFundamentalsViewState(cells, shouldShowFundamentalsSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageFundamentalsViewState)) {
            return false;
        }
        DetailPageFundamentalsViewState detailPageFundamentalsViewState = (DetailPageFundamentalsViewState) other;
        return Intrinsics.areEqual(this.cells, detailPageFundamentalsViewState.cells) && this.shouldShowFundamentalsSection == detailPageFundamentalsViewState.shouldShowFundamentalsSection;
    }

    public int hashCode() {
        return (this.cells.hashCode() * 31) + Boolean.hashCode(this.shouldShowFundamentalsSection);
    }

    public String toString() {
        return "DetailPageFundamentalsViewState(cells=" + this.cells + ", shouldShowFundamentalsSection=" + this.shouldShowFundamentalsSection + ")";
    }

    public DetailPageFundamentalsViewState(ImmutableList<DetailPageFundamentalsDataCell> cells, boolean z) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.shouldShowFundamentalsSection = z;
    }

    public /* synthetic */ DetailPageFundamentalsViewState(ImmutableList immutableList, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, (i & 2) != 0 ? false : z);
    }

    public final ImmutableList<DetailPageFundamentalsDataCell> getCells() {
        return this.cells;
    }

    public final boolean getShouldShowFundamentalsSection() {
        return this.shouldShowFundamentalsSection;
    }
}
