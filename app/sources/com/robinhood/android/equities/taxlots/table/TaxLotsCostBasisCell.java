package com.robinhood.android.equities.taxlots.table;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsCostBasisCell.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsCostBasisCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "text", "", "isSelectable", "", "maxCostPerShare", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "()Z", "getMaxCostPerShare", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsCostBasisCell extends TaxLotsTableHelpers4 {
    public static final int $stable = 0;
    private final boolean isSelectable;
    private final String maxCostPerShare;
    private final int relativeWidth;
    private final String text;

    public static /* synthetic */ TaxLotsCostBasisCell copy$default(TaxLotsCostBasisCell taxLotsCostBasisCell, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotsCostBasisCell.text;
        }
        if ((i & 2) != 0) {
            z = taxLotsCostBasisCell.isSelectable;
        }
        if ((i & 4) != 0) {
            str2 = taxLotsCostBasisCell.maxCostPerShare;
        }
        return taxLotsCostBasisCell.copy(str, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelectable() {
        return this.isSelectable;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }

    public final TaxLotsCostBasisCell copy(String text, boolean isSelectable, String maxCostPerShare) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TaxLotsCostBasisCell(text, isSelectable, maxCostPerShare);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotsCostBasisCell)) {
            return false;
        }
        TaxLotsCostBasisCell taxLotsCostBasisCell = (TaxLotsCostBasisCell) other;
        return Intrinsics.areEqual(this.text, taxLotsCostBasisCell.text) && this.isSelectable == taxLotsCostBasisCell.isSelectable && Intrinsics.areEqual(this.maxCostPerShare, taxLotsCostBasisCell.maxCostPerShare);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + Boolean.hashCode(this.isSelectable)) * 31;
        String str = this.maxCostPerShare;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TaxLotsCostBasisCell(text=" + this.text + ", isSelectable=" + this.isSelectable + ", maxCostPerShare=" + this.maxCostPerShare + ")";
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isSelectable() {
        return this.isSelectable;
    }

    public final String getMaxCostPerShare() {
        return this.maxCostPerShare;
    }

    public TaxLotsCostBasisCell(String text, boolean z, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isSelectable = z;
        this.maxCostPerShare = str;
        this.relativeWidth = str != null ? str.length() : text.length();
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.relativeWidth;
    }
}
