package com.robinhood.android.equities.taxlots.table;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import equity_trading_tax_lots.proto.p460v1.TaxLotTerm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsDateAndTermCell.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/table/TaxLotsDateAndTermCell;", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableCell;", InquiryField.DateField.TYPE, "", "term", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "<init>", "(Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTerm;)V", "getDate", "()Ljava/lang/String;", "getTerm", "()Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TaxLotsDateAndTermCell extends TaxLotsTableHelpers4 {
    public static final int $stable = 0;
    private final String date;
    private final int relativeWidth;
    private final TaxLotTerm term;

    public static /* synthetic */ TaxLotsDateAndTermCell copy$default(TaxLotsDateAndTermCell taxLotsDateAndTermCell, String str, TaxLotTerm taxLotTerm, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotsDateAndTermCell.date;
        }
        if ((i & 2) != 0) {
            taxLotTerm = taxLotsDateAndTermCell.term;
        }
        return taxLotsDateAndTermCell.copy(str, taxLotTerm);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final TaxLotTerm getTerm() {
        return this.term;
    }

    public final TaxLotsDateAndTermCell copy(String date, TaxLotTerm term) {
        Intrinsics.checkNotNullParameter(term, "term");
        return new TaxLotsDateAndTermCell(date, term);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotsDateAndTermCell)) {
            return false;
        }
        TaxLotsDateAndTermCell taxLotsDateAndTermCell = (TaxLotsDateAndTermCell) other;
        return Intrinsics.areEqual(this.date, taxLotsDateAndTermCell.date) && this.term == taxLotsDateAndTermCell.term;
    }

    public int hashCode() {
        String str = this.date;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.term.hashCode();
    }

    public String toString() {
        return "TaxLotsDateAndTermCell(date=" + this.date + ", term=" + this.term + ")";
    }

    public final String getDate() {
        return this.date;
    }

    public final TaxLotTerm getTerm() {
        return this.term;
    }

    public TaxLotsDateAndTermCell(String str, TaxLotTerm term) {
        Intrinsics.checkNotNullParameter(term, "term");
        this.date = str;
        this.term = term;
        this.relativeWidth = 1;
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.relativeWidth;
    }
}
