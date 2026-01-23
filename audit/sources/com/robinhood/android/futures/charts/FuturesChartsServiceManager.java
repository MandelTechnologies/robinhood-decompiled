package com.robinhood.android.futures.charts;

import com.robinhood.futures.charts.contracts.models.EventContractRequest;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import microgram.android.Monitoring;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&JB\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0013J8\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0019J*\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b0\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u001dH¦@¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "", "monitorState", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/android/MicrogramState;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "streamFuturesChartResult", "Lkotlin/Result;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "contractId", "Ljava/util/UUID;", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "chartType", "Lcom/robinhood/store/futures/ChartType;", "isContinuous", "", "isSparkline", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Lcom/robinhood/store/futures/ChartType;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamEagleChartResult", "requests", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "fillEntireWidth", "(Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamFuturesPerformanceChartResult", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "accountNumber", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface FuturesChartsServiceManager {
    Flow<Monitoring> monitorState(CoroutineScope lifecycleScope);

    Object streamEagleChartResult(List<EventContractRequest> list, DisplaySpan displaySpan, boolean z, Continuation<? super Flow<Result<FuturesChartResult>>> continuation);

    Object streamFuturesChartResult(UUID uuid, DisplaySpan displaySpan, ChartType chartType, boolean z, boolean z2, Continuation<? super Flow<Result<FuturesChartResult>>> continuation);

    Object streamFuturesPerformanceChartResult(String str, String str2, Continuation<? super Flow<Result<FuturesPerformanceChartResult>>> continuation);
}
