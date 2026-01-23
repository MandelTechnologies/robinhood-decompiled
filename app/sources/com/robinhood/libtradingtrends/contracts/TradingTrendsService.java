package com.robinhood.libtradingtrends.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: TradingTrendsService.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH'J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H'J\u001a\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0013H§@¢\u0006\u0002\u0010\u0014J\"\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "", "getMoreInfo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSection", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "instrumentId", "initialSelectedType", "isDetailPage", "", "getTable", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "initialSortKey", "initialSortDirection", "selectType", "", "type", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortTable", "sortKey", "sortDirection", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "TradingTrends")
/* loaded from: classes13.dex */
public interface TradingTrendsService {
    Object getMoreInfo(Continuation<? super String> continuation);

    Flow<TradingTrendsSection> getSection(String instrumentId, String initialSelectedType, boolean isDetailPage);

    Flow<TradingTrendsTable> getTable(String instrumentId, String initialSelectedType, String initialSortKey, String initialSortDirection);

    Object selectType(String str, Continuation<? super Unit> continuation);

    Object sortTable(String str, String str2, Continuation<? super Unit> continuation);
}
