package com.robinhood.futures.charts.contracts;

import com.robinhood.futures.charts.contracts.models.EventContractRequest;
import com.robinhood.futures.charts.contracts.models.FuturesChartResponse;
import com.robinhood.futures.charts.contracts.models.FuturesChartResponseJson;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical4;
import com.robinhood.futures.charts.contracts.models.FuturesPerformanceChartResponse;
import com.robinhood.futures.charts.contracts.models.FuturesPerformanceChartResponseJson;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;
import microgram.p507ui.sdui.SduiDisplaySpan;

/* compiled from: FuturesChartsService.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0002\u0010\u000eJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH'¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0002\u0010\u000eJ3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH'¢\u0006\u0002\u0010\u0014J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "", "streamFuturesChart", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "contractId", "", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "chartType", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;", "isContinuous", "", "isSparkline", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "streamEventContractChart", "requests", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "fillEntireWidth", "(Ljava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "streamFuturesPerformanceChart", "Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;", "accountNumber", "streamFuturesChartJson", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "streamEventContractChartJson", "streamFuturesPerformanceChartJson", "Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.futures.charts.FuturesChartsService")
/* loaded from: classes15.dex */
public interface FuturesChartsService {
    Flow<FuturesChartResponse> streamEventContractChart(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean fillEntireWidth);

    Flow<FuturesChartResponseJson> streamEventContractChartJson(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean fillEntireWidth);

    Flow<FuturesChartResponse> streamFuturesChart(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean isContinuous, Boolean isSparkline);

    Flow<FuturesChartResponseJson> streamFuturesChartJson(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean isContinuous, Boolean isSparkline);

    Flow<FuturesPerformanceChartResponse> streamFuturesPerformanceChart(String accountNumber, SduiDisplaySpan span);

    Flow<FuturesPerformanceChartResponseJson> streamFuturesPerformanceChartJson(String accountNumber, SduiDisplaySpan span);
}
