package com.robinhood.shared.taxLots.views;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotTableHeaderCell.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState;", "", "sortId", "", "text", "sortDirection", "Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState$SortDirection;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState$SortDirection;)V", "getSortId", "()Ljava/lang/String;", "getText", "getSortDirection", "()Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState$SortDirection;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SortDirection", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TaxLotTableHeaderCellState {
    public static final int $stable = 0;
    private final SortDirection sortDirection;
    private final String sortId;
    private final String text;

    public static /* synthetic */ TaxLotTableHeaderCellState copy$default(TaxLotTableHeaderCellState taxLotTableHeaderCellState, String str, String str2, SortDirection sortDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotTableHeaderCellState.sortId;
        }
        if ((i & 2) != 0) {
            str2 = taxLotTableHeaderCellState.text;
        }
        if ((i & 4) != 0) {
            sortDirection = taxLotTableHeaderCellState.sortDirection;
        }
        return taxLotTableHeaderCellState.copy(str, str2, sortDirection);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSortId() {
        return this.sortId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final SortDirection getSortDirection() {
        return this.sortDirection;
    }

    public final TaxLotTableHeaderCellState copy(String sortId, String text, SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TaxLotTableHeaderCellState(sortId, text, sortDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotTableHeaderCellState)) {
            return false;
        }
        TaxLotTableHeaderCellState taxLotTableHeaderCellState = (TaxLotTableHeaderCellState) other;
        return Intrinsics.areEqual(this.sortId, taxLotTableHeaderCellState.sortId) && Intrinsics.areEqual(this.text, taxLotTableHeaderCellState.text) && this.sortDirection == taxLotTableHeaderCellState.sortDirection;
    }

    public int hashCode() {
        String str = this.sortId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31;
        SortDirection sortDirection = this.sortDirection;
        return iHashCode + (sortDirection != null ? sortDirection.hashCode() : 0);
    }

    public String toString() {
        return "TaxLotTableHeaderCellState(sortId=" + this.sortId + ", text=" + this.text + ", sortDirection=" + this.sortDirection + ")";
    }

    public TaxLotTableHeaderCellState(String str, String text, SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.sortId = str;
        this.text = text;
        this.sortDirection = sortDirection;
    }

    public /* synthetic */ TaxLotTableHeaderCellState(String str, String str2, SortDirection sortDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : sortDirection);
    }

    public final String getSortId() {
        return this.sortId;
    }

    public final String getText() {
        return this.text;
    }

    public final SortDirection getSortDirection() {
        return this.sortDirection;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TaxLotTableHeaderCell.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotTableHeaderCellState$SortDirection;", "", "<init>", "(Ljava/lang/String;I)V", "ASCENDING", "DESCENDING", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SortDirection {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SortDirection[] $VALUES;
        public static final SortDirection ASCENDING = new SortDirection("ASCENDING", 0);
        public static final SortDirection DESCENDING = new SortDirection("DESCENDING", 1);

        private static final /* synthetic */ SortDirection[] $values() {
            return new SortDirection[]{ASCENDING, DESCENDING};
        }

        public static EnumEntries<SortDirection> getEntries() {
            return $ENTRIES;
        }

        private SortDirection(String str, int i) {
        }

        static {
            SortDirection[] sortDirectionArr$values = $values();
            $VALUES = sortDirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sortDirectionArr$values);
        }

        public static SortDirection valueOf(String str) {
            return (SortDirection) Enum.valueOf(SortDirection.class, str);
        }

        public static SortDirection[] values() {
            return (SortDirection[]) $VALUES.clone();
        }
    }
}
