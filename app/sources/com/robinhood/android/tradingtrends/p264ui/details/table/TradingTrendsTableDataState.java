package com.robinhood.android.tradingtrends.p264ui.details.table;

import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.libtradingtrends.contracts.TradingTrendsTable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsTableDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDataState;", "", "instrumentId", "", "genericTableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsGenericCell;", "tradingTrendsTable", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/generic/table/GenericTableData;Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;)V", "getInstrumentId", "()Ljava/lang/String;", "getGenericTableData", "()Lcom/robinhood/android/generic/table/GenericTableData;", "getTradingTrendsTable", "()Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TradingTrendsTableDataState {
    public static final int $stable = 8;
    private final GenericTableData<TradingTrendsGenericCell> genericTableData;
    private final String instrumentId;
    private final TradingTrendsTable tradingTrendsTable;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradingTrendsTableDataState copy$default(TradingTrendsTableDataState tradingTrendsTableDataState, String str, GenericTableData genericTableData, TradingTrendsTable tradingTrendsTable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingTrendsTableDataState.instrumentId;
        }
        if ((i & 2) != 0) {
            genericTableData = tradingTrendsTableDataState.genericTableData;
        }
        if ((i & 4) != 0) {
            tradingTrendsTable = tradingTrendsTableDataState.tradingTrendsTable;
        }
        return tradingTrendsTableDataState.copy(str, genericTableData, tradingTrendsTable);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final GenericTableData<TradingTrendsGenericCell> component2() {
        return this.genericTableData;
    }

    /* renamed from: component3, reason: from getter */
    public final TradingTrendsTable getTradingTrendsTable() {
        return this.tradingTrendsTable;
    }

    public final TradingTrendsTableDataState copy(String instrumentId, GenericTableData<TradingTrendsGenericCell> genericTableData, TradingTrendsTable tradingTrendsTable) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new TradingTrendsTableDataState(instrumentId, genericTableData, tradingTrendsTable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingTrendsTableDataState)) {
            return false;
        }
        TradingTrendsTableDataState tradingTrendsTableDataState = (TradingTrendsTableDataState) other;
        return Intrinsics.areEqual(this.instrumentId, tradingTrendsTableDataState.instrumentId) && Intrinsics.areEqual(this.genericTableData, tradingTrendsTableDataState.genericTableData) && Intrinsics.areEqual(this.tradingTrendsTable, tradingTrendsTableDataState.tradingTrendsTable);
    }

    public int hashCode() {
        int iHashCode = this.instrumentId.hashCode() * 31;
        GenericTableData<TradingTrendsGenericCell> genericTableData = this.genericTableData;
        int iHashCode2 = (iHashCode + (genericTableData == null ? 0 : genericTableData.hashCode())) * 31;
        TradingTrendsTable tradingTrendsTable = this.tradingTrendsTable;
        return iHashCode2 + (tradingTrendsTable != null ? tradingTrendsTable.hashCode() : 0);
    }

    public String toString() {
        return "TradingTrendsTableDataState(instrumentId=" + this.instrumentId + ", genericTableData=" + this.genericTableData + ", tradingTrendsTable=" + this.tradingTrendsTable + ")";
    }

    public TradingTrendsTableDataState(String instrumentId, GenericTableData<TradingTrendsGenericCell> genericTableData, TradingTrendsTable tradingTrendsTable) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.genericTableData = genericTableData;
        this.tradingTrendsTable = tradingTrendsTable;
    }

    public /* synthetic */ TradingTrendsTableDataState(String str, GenericTableData genericTableData, TradingTrendsTable tradingTrendsTable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : genericTableData, (i & 4) != 0 ? null : tradingTrendsTable);
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final GenericTableData<TradingTrendsGenericCell> getGenericTableData() {
        return this.genericTableData;
    }

    public final TradingTrendsTable getTradingTrendsTable() {
        return this.tradingTrendsTable;
    }
}
