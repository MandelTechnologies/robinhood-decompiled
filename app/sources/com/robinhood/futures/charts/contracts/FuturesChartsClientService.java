package com.robinhood.futures.charts.contracts;

import com.robinhood.futures.charts.contracts.models.EventContractEvent;
import com.robinhood.futures.charts.contracts.models.FuturesClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesContract;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical7;
import com.robinhood.futures.charts.contracts.models.FuturesPrevClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesProduct;
import com.robinhood.futures.charts.contracts.models.FuturesQuote;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: FuturesChartsClientService.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\fJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0019J2\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H'J\u001c\u0010 \u001a\u00020!2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H§@¢\u0006\u0002\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "", "getFuturesHistorical", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "contractId", "", "interval", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "start", "", "end", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "getFuturesHistoricalForProduct", "productId", "getFuturesClosesRange", "", "Lcom/robinhood/futures/charts/contracts/models/FuturesClosePrice;", "(Ljava/lang/String;JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "getFuturesClosePrice", "Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "getFuturesLastTradePrice", "", "getFuturesContract", "Lcom/robinhood/futures/charts/contracts/models/FuturesContract;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFuturesProduct", "Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;", "streamEventContractHistoricals", "eventContractIds", "streamEventContractLastTradePrices", "Lcom/robinhood/futures/charts/contracts/models/FuturesQuote;", "getEventContractEvent", "Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.futures.charts.FuturesChartsClientService")
/* loaded from: classes15.dex */
public interface FuturesChartsClientService {
    Object getEventContractEvent(List<String> list, Continuation<? super EventContractEvent> continuation);

    Flow<FuturesPrevClosePrice> getFuturesClosePrice(String contractId);

    Flow<List<FuturesClosePrice>> getFuturesClosesRange(String contractId, long start, Long end);

    Object getFuturesContract(String str, Continuation<? super FuturesContract> continuation);

    Flow<FuturesHistorical> getFuturesHistorical(String contractId, FuturesHistorical7 interval, long start, Long end);

    Flow<FuturesHistorical> getFuturesHistoricalForProduct(String productId, FuturesHistorical7 interval, long start, Long end);

    Flow<Double> getFuturesLastTradePrice(String contractId);

    Object getFuturesProduct(String str, Continuation<? super FuturesProduct> continuation);

    Flow<List<FuturesHistorical>> streamEventContractHistoricals(List<String> eventContractIds, FuturesHistorical7 interval, long start);

    Flow<List<FuturesQuote>> streamEventContractLastTradePrices(List<String> eventContractIds);
}
