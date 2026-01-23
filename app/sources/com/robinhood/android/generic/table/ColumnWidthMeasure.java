package com.robinhood.android.generic.table;

import com.robinhood.android.generic.table.GenericCell;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ@\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00028\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/generic/table/ColumnWidthMeasure;", "T", "Lcom/robinhood/android/generic/table/GenericCell;", "", "parentRowIndex", "", "parentCell", "childRowIndex", "childCell", "<init>", "(ILcom/robinhood/android/generic/table/GenericCell;Ljava/lang/Integer;Lcom/robinhood/android/generic/table/GenericCell;)V", "getParentRowIndex", "()I", "getParentCell", "()Lcom/robinhood/android/generic/table/GenericCell;", "Lcom/robinhood/android/generic/table/GenericCell;", "getChildRowIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChildCell", "component1", "component2", "component3", "component4", "copy", "(ILcom/robinhood/android/generic/table/GenericCell;Ljava/lang/Integer;Lcom/robinhood/android/generic/table/GenericCell;)Lcom/robinhood/android/generic/table/ColumnWidthMeasure;", "equals", "", "other", "hashCode", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ColumnWidthMeasure<T extends GenericCell> {
    public static final int $stable = 0;
    private final T childCell;
    private final Integer childRowIndex;
    private final T parentCell;
    private final int parentRowIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColumnWidthMeasure copy$default(ColumnWidthMeasure columnWidthMeasure, int i, GenericCell genericCell, Integer num, GenericCell genericCell2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = columnWidthMeasure.parentRowIndex;
        }
        if ((i2 & 2) != 0) {
            genericCell = columnWidthMeasure.parentCell;
        }
        if ((i2 & 4) != 0) {
            num = columnWidthMeasure.childRowIndex;
        }
        if ((i2 & 8) != 0) {
            genericCell2 = columnWidthMeasure.childCell;
        }
        return columnWidthMeasure.copy(i, genericCell, num, genericCell2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getParentRowIndex() {
        return this.parentRowIndex;
    }

    public final T component2() {
        return this.parentCell;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getChildRowIndex() {
        return this.childRowIndex;
    }

    public final T component4() {
        return this.childCell;
    }

    public final ColumnWidthMeasure<T> copy(int parentRowIndex, T parentCell, Integer childRowIndex, T childCell) {
        Intrinsics.checkNotNullParameter(parentCell, "parentCell");
        return new ColumnWidthMeasure<>(parentRowIndex, parentCell, childRowIndex, childCell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnWidthMeasure)) {
            return false;
        }
        ColumnWidthMeasure columnWidthMeasure = (ColumnWidthMeasure) other;
        return this.parentRowIndex == columnWidthMeasure.parentRowIndex && Intrinsics.areEqual(this.parentCell, columnWidthMeasure.parentCell) && Intrinsics.areEqual(this.childRowIndex, columnWidthMeasure.childRowIndex) && Intrinsics.areEqual(this.childCell, columnWidthMeasure.childCell);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.parentRowIndex) * 31) + this.parentCell.hashCode()) * 31;
        Integer num = this.childRowIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        T t = this.childCell;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "ColumnWidthMeasure(parentRowIndex=" + this.parentRowIndex + ", parentCell=" + this.parentCell + ", childRowIndex=" + this.childRowIndex + ", childCell=" + this.childCell + ")";
    }

    public ColumnWidthMeasure(int i, T parentCell, Integer num, T t) {
        Intrinsics.checkNotNullParameter(parentCell, "parentCell");
        this.parentRowIndex = i;
        this.parentCell = parentCell;
        this.childRowIndex = num;
        this.childCell = t;
    }

    public final int getParentRowIndex() {
        return this.parentRowIndex;
    }

    public final T getParentCell() {
        return this.parentCell;
    }

    public final Integer getChildRowIndex() {
        return this.childRowIndex;
    }

    public final T getChildCell() {
        return this.childCell;
    }
}
