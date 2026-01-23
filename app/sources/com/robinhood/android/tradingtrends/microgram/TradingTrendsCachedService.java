package com.robinhood.android.tradingtrends.microgram;

import com.robinhood.coroutines.job.CachedJobManager7;
import com.robinhood.libtradingtrends.contracts.TradingTrendsSection;
import com.robinhood.libtradingtrends.contracts.TradingTrendsTable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: TradingTrendsCachedService.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0007j\u0002`\u0010H¦@¢\u0006\u0002\u0010\u0011J:\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H&J\"\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "getSection", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "instrumentId", "", "initialSelectedType", "isDetailPage", "", "getMoreInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectType", "", "type", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTable", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "initialSortKey", "initialSortDirection", "sortTable", "sortKey", "sortDirection", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-trading-trends-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TradingTrendsCachedService extends CachedJobManager7 {
    Object getMoreInfo(Continuation<? super String> continuation);

    Flow<Result<TradingTrendsSection>> getSection(String instrumentId, String initialSelectedType, boolean isDetailPage);

    Flow<Result<TradingTrendsTable>> getTable(String instrumentId, String initialSelectedType, String initialSortKey, String initialSortDirection);

    Object selectType(String str, Continuation<? super Unit> continuation);

    Object sortTable(String str, String str2, Continuation<? super Unit> continuation);
}
