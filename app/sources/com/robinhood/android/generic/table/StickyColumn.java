package com.robinhood.android.generic.table;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StickyColumn.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericStickyColumn;", "", "StickAtEndUntilOnScreen", "StickAtStartAfterOnScreen", "Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtEndUntilOnScreen;", "Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtStartAfterOnScreen;", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.generic.table.GenericStickyColumn, reason: use source file name */
/* loaded from: classes10.dex */
public interface StickyColumn {

    /* compiled from: StickyColumn.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtEndUntilOnScreen;", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "columnIndex", "", "<init>", "(I)V", "getColumnIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.generic.table.GenericStickyColumn$StickAtEndUntilOnScreen, reason: from toString */
    public static final /* data */ class StickAtEndUntilOnScreen implements StickyColumn {
        public static final int $stable = 0;
        private final int columnIndex;

        public static /* synthetic */ StickAtEndUntilOnScreen copy$default(StickAtEndUntilOnScreen stickAtEndUntilOnScreen, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stickAtEndUntilOnScreen.columnIndex;
            }
            return stickAtEndUntilOnScreen.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColumnIndex() {
            return this.columnIndex;
        }

        public final StickAtEndUntilOnScreen copy(int columnIndex) {
            return new StickAtEndUntilOnScreen(columnIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StickAtEndUntilOnScreen) && this.columnIndex == ((StickAtEndUntilOnScreen) other).columnIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.columnIndex);
        }

        public String toString() {
            return "StickAtEndUntilOnScreen(columnIndex=" + this.columnIndex + ")";
        }

        public StickAtEndUntilOnScreen(int i) {
            this.columnIndex = i;
        }

        public final int getColumnIndex() {
            return this.columnIndex;
        }
    }

    /* compiled from: StickyColumn.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0012J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericStickyColumn$StickAtStartAfterOnScreen;", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "columnIndex", "", "collapseSize", "Landroidx/compose/ui/unit/Dp;", "expandable", "", "<init>", "(ILandroidx/compose/ui/unit/Dp;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColumnIndex", "()I", "getCollapseSize-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "getExpandable", "()Z", "component1", "component2", "component2-lTKBWiU", "component3", "copy", "copy-ZCAqi1o", "equals", "other", "", "hashCode", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.generic.table.GenericStickyColumn$StickAtStartAfterOnScreen, reason: from toString */
    public static final /* data */ class StickAtStartAfterOnScreen implements StickyColumn {
        public static final int $stable = 0;
        private final C2002Dp collapseSize;
        private final int columnIndex;
        private final boolean expandable;

        public /* synthetic */ StickAtStartAfterOnScreen(int i, C2002Dp c2002Dp, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, c2002Dp, z);
        }

        /* renamed from: copy-ZCAqi1o$default, reason: not valid java name */
        public static /* synthetic */ StickAtStartAfterOnScreen m14965copyZCAqi1o$default(StickAtStartAfterOnScreen stickAtStartAfterOnScreen, int i, C2002Dp c2002Dp, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stickAtStartAfterOnScreen.columnIndex;
            }
            if ((i2 & 2) != 0) {
                c2002Dp = stickAtStartAfterOnScreen.collapseSize;
            }
            if ((i2 & 4) != 0) {
                z = stickAtStartAfterOnScreen.expandable;
            }
            return stickAtStartAfterOnScreen.m14967copyZCAqi1o(i, c2002Dp, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColumnIndex() {
            return this.columnIndex;
        }

        /* renamed from: component2-lTKBWiU, reason: not valid java name and from getter */
        public final C2002Dp getCollapseSize() {
            return this.collapseSize;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getExpandable() {
            return this.expandable;
        }

        /* renamed from: copy-ZCAqi1o, reason: not valid java name */
        public final StickAtStartAfterOnScreen m14967copyZCAqi1o(int columnIndex, C2002Dp collapseSize, boolean expandable) {
            return new StickAtStartAfterOnScreen(columnIndex, collapseSize, expandable, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickAtStartAfterOnScreen)) {
                return false;
            }
            StickAtStartAfterOnScreen stickAtStartAfterOnScreen = (StickAtStartAfterOnScreen) other;
            return this.columnIndex == stickAtStartAfterOnScreen.columnIndex && Intrinsics.areEqual(this.collapseSize, stickAtStartAfterOnScreen.collapseSize) && this.expandable == stickAtStartAfterOnScreen.expandable;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.columnIndex) * 31;
            C2002Dp c2002Dp = this.collapseSize;
            return ((iHashCode + (c2002Dp == null ? 0 : C2002Dp.m7998hashCodeimpl(c2002Dp.getValue()))) * 31) + Boolean.hashCode(this.expandable);
        }

        public String toString() {
            return "StickAtStartAfterOnScreen(columnIndex=" + this.columnIndex + ", collapseSize=" + this.collapseSize + ", expandable=" + this.expandable + ")";
        }

        private StickAtStartAfterOnScreen(int i, C2002Dp c2002Dp, boolean z) {
            this.columnIndex = i;
            this.collapseSize = c2002Dp;
            this.expandable = z;
        }

        public /* synthetic */ StickAtStartAfterOnScreen(int i, C2002Dp c2002Dp, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : c2002Dp, (i2 & 4) != 0 ? false : z, null);
        }

        public final int getColumnIndex() {
            return this.columnIndex;
        }

        /* renamed from: getCollapseSize-lTKBWiU, reason: not valid java name */
        public final C2002Dp m14968getCollapseSizelTKBWiU() {
            return this.collapseSize;
        }

        public final boolean getExpandable() {
            return this.expandable;
        }
    }
}
