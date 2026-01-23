package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.footer;

import kotlin.Metadata;

/* compiled from: RhyOverviewFooterComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/footer/SnapshotListState;", "", "lastFirstVisibleIndex", "", "currentFirstVisibleIndex", "isScrolledToTheEnd", "", "<init>", "(IIZ)V", "getLastFirstVisibleIndex", "()I", "getCurrentFirstVisibleIndex", "()Z", "isScrollingUp", "isScrollingDown", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SnapshotListState {
    public static final int $stable = 0;
    private final int currentFirstVisibleIndex;
    private final boolean isScrolledToTheEnd;
    private final int lastFirstVisibleIndex;

    public static /* synthetic */ SnapshotListState copy$default(SnapshotListState snapshotListState, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = snapshotListState.lastFirstVisibleIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = snapshotListState.currentFirstVisibleIndex;
        }
        if ((i3 & 4) != 0) {
            z = snapshotListState.isScrolledToTheEnd;
        }
        return snapshotListState.copy(i, i2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLastFirstVisibleIndex() {
        return this.lastFirstVisibleIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentFirstVisibleIndex() {
        return this.currentFirstVisibleIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsScrolledToTheEnd() {
        return this.isScrolledToTheEnd;
    }

    public final SnapshotListState copy(int lastFirstVisibleIndex, int currentFirstVisibleIndex, boolean isScrolledToTheEnd) {
        return new SnapshotListState(lastFirstVisibleIndex, currentFirstVisibleIndex, isScrolledToTheEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotListState)) {
            return false;
        }
        SnapshotListState snapshotListState = (SnapshotListState) other;
        return this.lastFirstVisibleIndex == snapshotListState.lastFirstVisibleIndex && this.currentFirstVisibleIndex == snapshotListState.currentFirstVisibleIndex && this.isScrolledToTheEnd == snapshotListState.isScrolledToTheEnd;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.lastFirstVisibleIndex) * 31) + Integer.hashCode(this.currentFirstVisibleIndex)) * 31) + Boolean.hashCode(this.isScrolledToTheEnd);
    }

    public String toString() {
        return "SnapshotListState(lastFirstVisibleIndex=" + this.lastFirstVisibleIndex + ", currentFirstVisibleIndex=" + this.currentFirstVisibleIndex + ", isScrolledToTheEnd=" + this.isScrolledToTheEnd + ")";
    }

    public SnapshotListState(int i, int i2, boolean z) {
        this.lastFirstVisibleIndex = i;
        this.currentFirstVisibleIndex = i2;
        this.isScrolledToTheEnd = z;
    }

    public final int getLastFirstVisibleIndex() {
        return this.lastFirstVisibleIndex;
    }

    public final int getCurrentFirstVisibleIndex() {
        return this.currentFirstVisibleIndex;
    }

    public final boolean isScrolledToTheEnd() {
        return this.isScrolledToTheEnd;
    }

    public final boolean isScrollingUp() {
        return this.lastFirstVisibleIndex > this.currentFirstVisibleIndex;
    }

    public final boolean isScrollingDown() {
        return this.lastFirstVisibleIndex < this.currentFirstVisibleIndex;
    }
}
