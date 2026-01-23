package com.robinhood.android.generic.table;

import com.robinhood.android.generic.table.GenericCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012H\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005HÆ\u0003J5\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/generic/table/GenericTableData;", "T", "Lcom/robinhood/android/generic/table/GenericCell;", "", "headers", "Lkotlinx/collections/immutable/ImmutableList;", "rows", "Lcom/robinhood/android/generic/table/GenericRow;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getHeaders", "()Lkotlinx/collections/immutable/ImmutableList;", "getRows", "validTable", "", "getValidTable", "()Z", "cellsForColumnWidthEstimate", "", "Lcom/robinhood/android/generic/table/ColumnWidthMeasure;", "getCellsForColumnWidthEstimate", "()Ljava/util/List;", "getLargestCellPerColumn", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class GenericTableData<T extends GenericCell> {
    public static final int $stable = 8;
    private final List<ColumnWidthMeasure<T>> cellsForColumnWidthEstimate;
    private final ImmutableList<T> headers;
    private final ImmutableList<GenericRow<T>> rows;
    private final boolean validTable;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericTableData copy$default(GenericTableData genericTableData, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = genericTableData.headers;
        }
        if ((i & 2) != 0) {
            immutableList2 = genericTableData.rows;
        }
        return genericTableData.copy(immutableList, immutableList2);
    }

    public final ImmutableList<T> component1() {
        return this.headers;
    }

    public final ImmutableList<GenericRow<T>> component2() {
        return this.rows;
    }

    public final GenericTableData<T> copy(ImmutableList<? extends T> headers, ImmutableList<GenericRow<T>> rows) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new GenericTableData<>(headers, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericTableData)) {
            return false;
        }
        GenericTableData genericTableData = (GenericTableData) other;
        return Intrinsics.areEqual(this.headers, genericTableData.headers) && Intrinsics.areEqual(this.rows, genericTableData.rows);
    }

    public int hashCode() {
        return (this.headers.hashCode() * 31) + this.rows.hashCode();
    }

    public String toString() {
        return "GenericTableData(headers=" + this.headers + ", rows=" + this.rows + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericTableData(ImmutableList<? extends T> headers, ImmutableList<GenericRow<T>> rows) {
        boolean z;
        List<ColumnWidthMeasure<T>> listEmptyList;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.headers = headers;
        this.rows = rows;
        if (rows.isEmpty() || headers.isEmpty()) {
            z = false;
            break;
        }
        if (rows == null || !rows.isEmpty()) {
            Iterator<GenericRow<T>> it = rows.iterator();
            while (it.hasNext()) {
                if (it.next().getCells().size() != this.headers.size()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.validTable = z;
        if (z) {
            listEmptyList = getLargestCellPerColumn();
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.cellsForColumnWidthEstimate = listEmptyList;
    }

    public final ImmutableList<T> getHeaders() {
        return this.headers;
    }

    public final ImmutableList<GenericRow<T>> getRows() {
        return this.rows;
    }

    public final boolean getValidTable() {
        return this.validTable;
    }

    public final List<ColumnWidthMeasure<T>> getCellsForColumnWidthEstimate() {
        return this.cellsForColumnWidthEstimate;
    }

    private final List<ColumnWidthMeasure<T>> getLargestCellPerColumn() {
        GenericCell cell;
        GenericCell childCell;
        PrimitiveRanges2 indices = CollectionsKt.getIndices(((GenericRow) CollectionsKt.first((List) this.rows)).getCells());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((PrimitiveIterators6) it).nextInt();
            ImmutableList<GenericRow<T>> immutableList = this.rows;
            int i = 10;
            ArrayList<Tuples2> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            Iterator<GenericRow<T>> it2 = immutableList.iterator();
            int i2 = 0;
            while (true) {
                Object next = null;
                if (!it2.hasNext()) {
                    break;
                }
                GenericRow<T> next2 = it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GenericRow<T> genericRow = next2;
                RowIndexCellPair rowIndexCellPair = new RowIndexCellPair(i2, genericRow.getCells().get(iNextInt));
                List<GenericChildRow<T>> childRows = genericRow.getChildRows();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(childRows, i));
                int i4 = 0;
                for (Object obj : childRows) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList3.add(new RowIndexCellPair(i4, ((GenericChildRow) obj).getCells().get(iNextInt)));
                    i4 = i5;
                }
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int relativeWidth = ((RowIndexCellPair) next).getCell().getRelativeWidth();
                        do {
                            Object next3 = it3.next();
                            int relativeWidth2 = ((RowIndexCellPair) next3).getCell().getRelativeWidth();
                            if (relativeWidth < relativeWidth2) {
                                next = next3;
                                relativeWidth = relativeWidth2;
                            }
                        } while (it3.hasNext());
                    }
                }
                arrayList2.add(Tuples4.m3642to(rowIndexCellPair, next));
                i2 = i3;
                i = 10;
            }
            ColumnWidthMeasure columnWidthMeasure = null;
            for (Tuples2 tuples2 : arrayList2) {
                RowIndexCellPair rowIndexCellPair2 = (RowIndexCellPair) tuples2.component1();
                RowIndexCellPair rowIndexCellPair3 = (RowIndexCellPair) tuples2.component2();
                Tuples2 tuples2M3642to = (columnWidthMeasure == null || columnWidthMeasure.getParentCell().getRelativeWidth() < rowIndexCellPair2.getCell().getRelativeWidth()) ? Tuples4.m3642to(rowIndexCellPair2.getCell(), Integer.valueOf(rowIndexCellPair2.getRowIndex())) : Tuples4.m3642to(columnWidthMeasure.getParentCell(), Integer.valueOf(columnWidthMeasure.getParentRowIndex()));
                GenericCell genericCell = (GenericCell) tuples2M3642to.component1();
                int iIntValue = ((Number) tuples2M3642to.component2()).intValue();
                Tuples2 tuples2M3642to2 = ((columnWidthMeasure == null || (childCell = columnWidthMeasure.getChildCell()) == null) ? 0 : childCell.getRelativeWidth()) >= ((rowIndexCellPair3 == null || (cell = rowIndexCellPair3.getCell()) == null) ? 0 : cell.getRelativeWidth()) ? Tuples4.m3642to(columnWidthMeasure != null ? columnWidthMeasure.getChildCell() : null, columnWidthMeasure != null ? columnWidthMeasure.getChildRowIndex() : null) : Tuples4.m3642to(rowIndexCellPair3 != null ? rowIndexCellPair3.getCell() : null, rowIndexCellPair3 != null ? Integer.valueOf(rowIndexCellPair3.getRowIndex()) : null);
                columnWidthMeasure = new ColumnWidthMeasure(iIntValue, genericCell, (Integer) tuples2M3642to2.component2(), (GenericCell) tuples2M3642to2.component1());
            }
            if (columnWidthMeasure != null) {
                arrayList.add(columnWidthMeasure);
            }
        }
        return arrayList;
    }
}
