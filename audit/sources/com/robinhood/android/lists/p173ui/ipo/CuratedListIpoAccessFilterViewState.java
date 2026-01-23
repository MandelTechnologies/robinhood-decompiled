package com.robinhood.android.lists.p173ui.ipo;

import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListIpoAccessFilterViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterViewState;", "", "ipoAccessFilter", "Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "isSelected", "", "<init>", "(Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;Z)V", "getIpoAccessFilter", "()Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CuratedListIpoAccessFilterViewState {
    public static final int $stable = 0;
    private final CuratedListRhListViewState6 ipoAccessFilter;
    private final boolean isSelected;

    public static /* synthetic */ CuratedListIpoAccessFilterViewState copy$default(CuratedListIpoAccessFilterViewState curatedListIpoAccessFilterViewState, CuratedListRhListViewState6 curatedListRhListViewState6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            curatedListRhListViewState6 = curatedListIpoAccessFilterViewState.ipoAccessFilter;
        }
        if ((i & 2) != 0) {
            z = curatedListIpoAccessFilterViewState.isSelected;
        }
        return curatedListIpoAccessFilterViewState.copy(curatedListRhListViewState6, z);
    }

    /* renamed from: component1, reason: from getter */
    public final CuratedListRhListViewState6 getIpoAccessFilter() {
        return this.ipoAccessFilter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final CuratedListIpoAccessFilterViewState copy(CuratedListRhListViewState6 ipoAccessFilter, boolean isSelected) {
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        return new CuratedListIpoAccessFilterViewState(ipoAccessFilter, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CuratedListIpoAccessFilterViewState)) {
            return false;
        }
        CuratedListIpoAccessFilterViewState curatedListIpoAccessFilterViewState = (CuratedListIpoAccessFilterViewState) other;
        return this.ipoAccessFilter == curatedListIpoAccessFilterViewState.ipoAccessFilter && this.isSelected == curatedListIpoAccessFilterViewState.isSelected;
    }

    public int hashCode() {
        return (this.ipoAccessFilter.hashCode() * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "CuratedListIpoAccessFilterViewState(ipoAccessFilter=" + this.ipoAccessFilter + ", isSelected=" + this.isSelected + ")";
    }

    public CuratedListIpoAccessFilterViewState(CuratedListRhListViewState6 ipoAccessFilter, boolean z) {
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        this.ipoAccessFilter = ipoAccessFilter;
        this.isSelected = z;
    }

    public final CuratedListRhListViewState6 getIpoAccessFilter() {
        return this.ipoAccessFilter;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
