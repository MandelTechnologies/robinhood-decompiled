package com.robinhood.android.generic.table;

import com.robinhood.android.generic.table.GenericCell;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/generic/table/RowIndexCellPair;", "T", "Lcom/robinhood/android/generic/table/GenericCell;", "", "rowIndex", "", "cell", "<init>", "(ILcom/robinhood/android/generic/table/GenericCell;)V", "getRowIndex", "()I", "getCell", "()Lcom/robinhood/android/generic/table/GenericCell;", "Lcom/robinhood/android/generic/table/GenericCell;", "component1", "component2", "copy", "(ILcom/robinhood/android/generic/table/GenericCell;)Lcom/robinhood/android/generic/table/RowIndexCellPair;", "equals", "", "other", "hashCode", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RowIndexCellPair<T extends GenericCell> {
    public static final int $stable = 0;
    private final T cell;
    private final int rowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RowIndexCellPair copy$default(RowIndexCellPair rowIndexCellPair, int i, GenericCell genericCell, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rowIndexCellPair.rowIndex;
        }
        if ((i2 & 2) != 0) {
            genericCell = rowIndexCellPair.cell;
        }
        return rowIndexCellPair.copy(i, genericCell);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final T component2() {
        return this.cell;
    }

    public final RowIndexCellPair<T> copy(int rowIndex, T cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new RowIndexCellPair<>(rowIndex, cell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowIndexCellPair)) {
            return false;
        }
        RowIndexCellPair rowIndexCellPair = (RowIndexCellPair) other;
        return this.rowIndex == rowIndexCellPair.rowIndex && Intrinsics.areEqual(this.cell, rowIndexCellPair.cell);
    }

    public int hashCode() {
        return (Integer.hashCode(this.rowIndex) * 31) + this.cell.hashCode();
    }

    public String toString() {
        return "RowIndexCellPair(rowIndex=" + this.rowIndex + ", cell=" + this.cell + ")";
    }

    public RowIndexCellPair(int i, T cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.rowIndex = i;
        this.cell = cell;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final T getCell() {
        return this.cell;
    }
}
