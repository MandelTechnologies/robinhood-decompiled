package com.robinhood.android.futures.charts;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FuturesChartsServiceManager.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\n\u001a&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"streamFuturesChartResult", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "arg", "Lcom/robinhood/android/futures/charts/FuturesChartArg;", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/android/futures/charts/FuturesChartArg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamEagleChartResult", "Lcom/robinhood/android/futures/charts/EventContractChartArg;", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/android/futures/charts/EventContractChartArg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamFuturesPerformanceChartResult", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartArg;", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/android/futures/charts/FuturesPerformanceChartArg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-futures-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.charts.FuturesChartsServiceManagerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesChartsServiceManager5 {
    public static final Object streamFuturesChartResult(FuturesChartsServiceManager futuresChartsServiceManager, FuturesChartArg futuresChartArg, Continuation<? super Flow<Result<FuturesChartResult>>> continuation) {
        return futuresChartsServiceManager.streamFuturesChartResult(futuresChartArg.getContractId(), futuresChartArg.getSpan(), futuresChartArg.getChartType(), futuresChartArg.isContinuous(), futuresChartArg.isSparkline(), continuation);
    }

    public static final Object streamEagleChartResult(FuturesChartsServiceManager futuresChartsServiceManager, EventContractChartArg futuresChartsServiceManager2, Continuation<? super Flow<Result<FuturesChartResult>>> continuation) {
        return futuresChartsServiceManager.streamEagleChartResult(futuresChartsServiceManager2.getRequests(), futuresChartsServiceManager2.getSpan(), futuresChartsServiceManager2.getFillEntireWidth(), continuation);
    }

    public static final Object streamFuturesPerformanceChartResult(FuturesChartsServiceManager futuresChartsServiceManager, FuturesPerformanceChartArg futuresPerformanceChartArg, Continuation<? super Flow<Result<FuturesPerformanceChartResult>>> continuation) {
        return futuresChartsServiceManager.streamFuturesPerformanceChartResult(futuresPerformanceChartArg.getAccountNumber(), futuresPerformanceChartArg.getSpan(), continuation);
    }
}
