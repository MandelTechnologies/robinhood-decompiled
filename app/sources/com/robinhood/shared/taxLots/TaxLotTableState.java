package com.robinhood.shared.taxLots;

import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.StickyColumn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotTableState;", "T", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/shared/taxLots/TaxLotTableState$Loaded;", "Lcom/robinhood/shared/taxLots/TaxLotTableState$Loading;", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class TaxLotTableState<T> {
    public static final int $stable = 0;

    public /* synthetic */ TaxLotTableState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: TaxLotsTable.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotTableState$Loading;", "T", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "hasInputCell", "", "hasStickyLastColumn", "<init>", "(ZZ)V", "getHasInputCell", "()Z", "getHasStickyLastColumn", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading<T> extends TaxLotTableState<T> {
        public static final int $stable = 0;
        private final boolean hasInputCell;
        private final boolean hasStickyLastColumn;

        /* JADX WARN: Illegal instructions before constructor call */
        public Loading() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.hasInputCell;
            }
            if ((i & 2) != 0) {
                z2 = loading.hasStickyLastColumn;
            }
            return loading.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasInputCell() {
            return this.hasInputCell;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasStickyLastColumn() {
            return this.hasStickyLastColumn;
        }

        public final Loading<T> copy(boolean hasInputCell, boolean hasStickyLastColumn) {
            return new Loading<>(hasInputCell, hasStickyLastColumn);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return this.hasInputCell == loading.hasInputCell && this.hasStickyLastColumn == loading.hasStickyLastColumn;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasInputCell) * 31) + Boolean.hashCode(this.hasStickyLastColumn);
        }

        public String toString() {
            return "Loading(hasInputCell=" + this.hasInputCell + ", hasStickyLastColumn=" + this.hasStickyLastColumn + ")";
        }

        public /* synthetic */ Loading(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
        }

        public final boolean getHasInputCell() {
            return this.hasInputCell;
        }

        public final boolean getHasStickyLastColumn() {
            return this.hasStickyLastColumn;
        }

        public Loading(boolean z, boolean z2) {
            super(null);
            this.hasInputCell = z;
            this.hasStickyLastColumn = z2;
        }
    }

    private TaxLotTableState() {
    }

    /* compiled from: TaxLotsTable.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B/\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/TaxLotTableState$Loaded;", "T", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "tableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/shared/taxLots/TaxLotCell;", "stickyColumnDetails", "Lcom/robinhood/android/generic/table/GenericStickyColumn;", "hasNextPage", "", "<init>", "(Lcom/robinhood/android/generic/table/GenericTableData;Lcom/robinhood/android/generic/table/GenericStickyColumn;Z)V", "getTableData", "()Lcom/robinhood/android/generic/table/GenericTableData;", "getStickyColumnDetails", "()Lcom/robinhood/android/generic/table/GenericStickyColumn;", "getHasNextPage", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded<T> extends TaxLotTableState<T> {
        public static final int $stable = 8;
        private final boolean hasNextPage;
        private final StickyColumn stickyColumnDetails;
        private final GenericTableData<TaxLotCell<T>> tableData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, GenericTableData genericTableData, StickyColumn stickyColumn, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                genericTableData = loaded.tableData;
            }
            if ((i & 2) != 0) {
                stickyColumn = loaded.stickyColumnDetails;
            }
            if ((i & 4) != 0) {
                z = loaded.hasNextPage;
            }
            return loaded.copy(genericTableData, stickyColumn, z);
        }

        public final GenericTableData<TaxLotCell<T>> component1() {
            return this.tableData;
        }

        /* renamed from: component2, reason: from getter */
        public final StickyColumn getStickyColumnDetails() {
            return this.stickyColumnDetails;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final Loaded<T> copy(GenericTableData<TaxLotCell<T>> tableData, StickyColumn stickyColumnDetails, boolean hasNextPage) {
            Intrinsics.checkNotNullParameter(tableData, "tableData");
            return new Loaded<>(tableData, stickyColumnDetails, hasNextPage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.tableData, loaded.tableData) && Intrinsics.areEqual(this.stickyColumnDetails, loaded.stickyColumnDetails) && this.hasNextPage == loaded.hasNextPage;
        }

        public int hashCode() {
            int iHashCode = this.tableData.hashCode() * 31;
            StickyColumn stickyColumn = this.stickyColumnDetails;
            return ((iHashCode + (stickyColumn == null ? 0 : stickyColumn.hashCode())) * 31) + Boolean.hashCode(this.hasNextPage);
        }

        public String toString() {
            return "Loaded(tableData=" + this.tableData + ", stickyColumnDetails=" + this.stickyColumnDetails + ", hasNextPage=" + this.hasNextPage + ")";
        }

        public /* synthetic */ Loaded(GenericTableData genericTableData, StickyColumn stickyColumn, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(genericTableData, (i & 2) != 0 ? null : stickyColumn, z);
        }

        public final GenericTableData<TaxLotCell<T>> getTableData() {
            return this.tableData;
        }

        public final StickyColumn getStickyColumnDetails() {
            return this.stickyColumnDetails;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(GenericTableData<TaxLotCell<T>> tableData, StickyColumn stickyColumn, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(tableData, "tableData");
            this.tableData = tableData;
            this.stickyColumnDetails = stickyColumn;
            this.hasNextPage = z;
        }
    }
}
