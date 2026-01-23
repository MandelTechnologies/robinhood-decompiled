package com.robinhood.android.equities.taxlots.table;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsShareReadOnlyCell.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsShareReadOnlyCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsShareReadOnlyCell extends TaxLotsTableHelpers4 {
    public static final int $stable = 0;
    private final int relativeWidth;
    private final String text;

    public static /* synthetic */ TaxLotsShareReadOnlyCell copy$default(TaxLotsShareReadOnlyCell taxLotsShareReadOnlyCell, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotsShareReadOnlyCell.text;
        }
        return taxLotsShareReadOnlyCell.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final TaxLotsShareReadOnlyCell copy(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TaxLotsShareReadOnlyCell(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TaxLotsShareReadOnlyCell) && Intrinsics.areEqual(this.text, ((TaxLotsShareReadOnlyCell) other).text);
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return "TaxLotsShareReadOnlyCell(text=" + this.text + ")";
    }

    public final String getText() {
        return this.text;
    }

    public TaxLotsShareReadOnlyCell(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.relativeWidth = text.length();
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.relativeWidth;
    }
}
