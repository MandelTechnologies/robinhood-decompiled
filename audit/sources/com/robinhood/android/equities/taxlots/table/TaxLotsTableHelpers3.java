package com.robinhood.android.equities.taxlots.table;

import kotlin.Metadata;

/* compiled from: TaxLotsTableHelpers.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsBlankCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", "<init>", "()V", "relativeWidth", "", "getRelativeWidth", "()I", "equals", "", "other", "", "hashCode", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsBlankCell, reason: use source file name */
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsTableHelpers3 extends TaxLotsTableHelpers4 {
    public static final int $stable = 0;
    public static final TaxLotsTableHelpers3 INSTANCE = new TaxLotsTableHelpers3();
    private static final int relativeWidth = 1;

    public boolean equals(Object other) {
        return this == other || (other instanceof TaxLotsTableHelpers3);
    }

    public int hashCode() {
        return -1085114367;
    }

    public String toString() {
        return "TaxLotsBlankCell";
    }

    private TaxLotsTableHelpers3() {
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return relativeWidth;
    }
}
