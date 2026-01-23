package com.robinhood.android.equities.taxlots.viewLots;

import com.robinhood.android.equities.taxlots.table.TaxLotsTableViewState;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewLotsViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsViewState;", "", "tableState", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableViewState;", "taxLotsLoggingContext", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "<init>", "(Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableViewState;Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;)V", "getTableState", "()Lcom/robinhood/android/equities/taxlots/table/TaxLotsTableViewState;", "getTaxLotsLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ViewLotsViewState {
    public static final int $stable = 8;
    private final TaxLotsTableViewState tableState;
    private final TaxLotsContext taxLotsLoggingContext;

    public static /* synthetic */ ViewLotsViewState copy$default(ViewLotsViewState viewLotsViewState, TaxLotsTableViewState taxLotsTableViewState, TaxLotsContext taxLotsContext, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLotsTableViewState = viewLotsViewState.tableState;
        }
        if ((i & 2) != 0) {
            taxLotsContext = viewLotsViewState.taxLotsLoggingContext;
        }
        return viewLotsViewState.copy(taxLotsTableViewState, taxLotsContext);
    }

    /* renamed from: component1, reason: from getter */
    public final TaxLotsTableViewState getTableState() {
        return this.tableState;
    }

    /* renamed from: component2, reason: from getter */
    public final TaxLotsContext getTaxLotsLoggingContext() {
        return this.taxLotsLoggingContext;
    }

    public final ViewLotsViewState copy(TaxLotsTableViewState tableState, TaxLotsContext taxLotsLoggingContext) {
        Intrinsics.checkNotNullParameter(tableState, "tableState");
        Intrinsics.checkNotNullParameter(taxLotsLoggingContext, "taxLotsLoggingContext");
        return new ViewLotsViewState(tableState, taxLotsLoggingContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewLotsViewState)) {
            return false;
        }
        ViewLotsViewState viewLotsViewState = (ViewLotsViewState) other;
        return Intrinsics.areEqual(this.tableState, viewLotsViewState.tableState) && Intrinsics.areEqual(this.taxLotsLoggingContext, viewLotsViewState.taxLotsLoggingContext);
    }

    public int hashCode() {
        return (this.tableState.hashCode() * 31) + this.taxLotsLoggingContext.hashCode();
    }

    public String toString() {
        return "ViewLotsViewState(tableState=" + this.tableState + ", taxLotsLoggingContext=" + this.taxLotsLoggingContext + ")";
    }

    public ViewLotsViewState(TaxLotsTableViewState tableState, TaxLotsContext taxLotsLoggingContext) {
        Intrinsics.checkNotNullParameter(tableState, "tableState");
        Intrinsics.checkNotNullParameter(taxLotsLoggingContext, "taxLotsLoggingContext");
        this.tableState = tableState;
        this.taxLotsLoggingContext = taxLotsLoggingContext;
    }

    public final TaxLotsTableViewState getTableState() {
        return this.tableState;
    }

    public final TaxLotsContext getTaxLotsLoggingContext() {
        return this.taxLotsLoggingContext;
    }
}
