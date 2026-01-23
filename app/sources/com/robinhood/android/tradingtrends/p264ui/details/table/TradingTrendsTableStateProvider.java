package com.robinhood.android.tradingtrends.p264ui.details.table;

import com.robinhood.android.tradingtrends.p264ui.details.table.TradingTrendsTableViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsTableStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableDataState;", "Lcom/robinhood/android/tradingtrends/ui/details/table/TradingTrendsTableViewState;", "<init>", "()V", "reduce", "dataState", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TradingTrendsTableStateProvider implements StateProvider<TradingTrendsTableDataState, TradingTrendsTableViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public TradingTrendsTableViewState reduce(TradingTrendsTableDataState dataState) {
        TradingTrendsTableViewState.TradingTrendsTableState loaded;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String instrumentId = dataState.getInstrumentId();
        if (dataState.getTradingTrendsTable() != null && dataState.getGenericTableData() != null) {
            loaded = new TradingTrendsTableViewState.TradingTrendsTableState.Loaded(dataState.getTradingTrendsTable().getSelectedType(), dataState.getTradingTrendsTable().getSortKey(), dataState.getTradingTrendsTable().getSortDirection(), dataState.getTradingTrendsTable().getAvailableSortKeys(), dataState.getTradingTrendsTable().getDisclosure(), dataState.getGenericTableData());
        } else {
            loaded = TradingTrendsTableViewState.TradingTrendsTableState.Loading.INSTANCE;
        }
        return new TradingTrendsTableViewState(instrumentId, loaded);
    }
}
