package com.robinhood.android.equities.taxlots.table;

import androidx.compose.p011ui.Alignment;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsHeaderCell.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u001aHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsHeaderCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "value", "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "isActiveSort", "", "isSortable", "sortDirection", "Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "onClick", "Lkotlin/Function1;", "", "<init>", "(Lequity_trading_tax_lots/proto/v1/TaxLotSort;ZZLequity_trading_tax_lots/proto/v1/TaxLotSortDirection;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;)V", "getValue", "()Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "()Z", "getSortDirection", "()Lequity_trading_tax_lots/proto/v1/TaxLotSortDirection;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsHeaderCell extends TaxLotsTableHelpers4 {
    public static final int $stable = 0;
    private final Alignment contentAlignment;
    private final boolean isActiveSort;
    private final boolean isSortable;
    private final Function1<TaxLotSort, Unit> onClick;
    private final int relativeWidth;
    private final TaxLotSortDirection sortDirection;
    private final TaxLotSort value;

    public static /* synthetic */ TaxLotsHeaderCell copy$default(TaxLotsHeaderCell taxLotsHeaderCell, TaxLotSort taxLotSort, boolean z, boolean z2, TaxLotSortDirection taxLotSortDirection, Alignment alignment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLotSort = taxLotsHeaderCell.value;
        }
        if ((i & 2) != 0) {
            z = taxLotsHeaderCell.isActiveSort;
        }
        if ((i & 4) != 0) {
            z2 = taxLotsHeaderCell.isSortable;
        }
        if ((i & 8) != 0) {
            taxLotSortDirection = taxLotsHeaderCell.sortDirection;
        }
        if ((i & 16) != 0) {
            alignment = taxLotsHeaderCell.contentAlignment;
        }
        if ((i & 32) != 0) {
            function1 = taxLotsHeaderCell.onClick;
        }
        Alignment alignment2 = alignment;
        Function1 function12 = function1;
        return taxLotsHeaderCell.copy(taxLotSort, z, z2, taxLotSortDirection, alignment2, function12);
    }

    /* renamed from: component1, reason: from getter */
    public final TaxLotSort getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActiveSort() {
        return this.isActiveSort;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSortable() {
        return this.isSortable;
    }

    /* renamed from: component4, reason: from getter */
    public final TaxLotSortDirection getSortDirection() {
        return this.sortDirection;
    }

    /* renamed from: component5, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final Function1<TaxLotSort, Unit> component6() {
        return this.onClick;
    }

    public final TaxLotsHeaderCell copy(TaxLotSort value, boolean isActiveSort, boolean isSortable, TaxLotSortDirection sortDirection, Alignment contentAlignment, Function1<? super TaxLotSort, Unit> onClick) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new TaxLotsHeaderCell(value, isActiveSort, isSortable, sortDirection, contentAlignment, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotsHeaderCell)) {
            return false;
        }
        TaxLotsHeaderCell taxLotsHeaderCell = (TaxLotsHeaderCell) other;
        return this.value == taxLotsHeaderCell.value && this.isActiveSort == taxLotsHeaderCell.isActiveSort && this.isSortable == taxLotsHeaderCell.isSortable && this.sortDirection == taxLotsHeaderCell.sortDirection && Intrinsics.areEqual(this.contentAlignment, taxLotsHeaderCell.contentAlignment) && Intrinsics.areEqual(this.onClick, taxLotsHeaderCell.onClick);
    }

    public int hashCode() {
        return (((((((((this.value.hashCode() * 31) + Boolean.hashCode(this.isActiveSort)) * 31) + Boolean.hashCode(this.isSortable)) * 31) + this.sortDirection.hashCode()) * 31) + this.contentAlignment.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "TaxLotsHeaderCell(value=" + this.value + ", isActiveSort=" + this.isActiveSort + ", isSortable=" + this.isSortable + ", sortDirection=" + this.sortDirection + ", contentAlignment=" + this.contentAlignment + ", onClick=" + this.onClick + ")";
    }

    public /* synthetic */ TaxLotsHeaderCell(TaxLotSort taxLotSort, boolean z, boolean z2, TaxLotSortDirection taxLotSortDirection, Alignment alignment, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(taxLotSort, z, (i & 4) != 0 ? true : z2, taxLotSortDirection, alignment, function1);
    }

    public final TaxLotSort getValue() {
        return this.value;
    }

    public final boolean isActiveSort() {
        return this.isActiveSort;
    }

    public final boolean isSortable() {
        return this.isSortable;
    }

    public final TaxLotSortDirection getSortDirection() {
        return this.sortDirection;
    }

    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final Function1<TaxLotSort, Unit> getOnClick() {
        return this.onClick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxLotsHeaderCell(TaxLotSort value, boolean z, boolean z2, TaxLotSortDirection sortDirection, Alignment contentAlignment, Function1<? super TaxLotSort, Unit> onClick) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.value = value;
        this.isActiveSort = z;
        this.isSortable = z2;
        this.sortDirection = sortDirection;
        this.contentAlignment = contentAlignment;
        this.onClick = onClick;
        this.relativeWidth = 1;
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.relativeWidth;
    }
}
