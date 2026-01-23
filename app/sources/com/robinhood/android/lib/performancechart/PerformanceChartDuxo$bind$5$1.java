package com.robinhood.android.lib.performancechart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PerformanceChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$5$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PerformanceChartDuxo$bind$5$1 extends ContinuationImpl7 implements Function2<PerformanceChartDataState, Continuation<? super PerformanceChartDataState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartDuxo$bind$5$1(boolean z, Continuation<? super PerformanceChartDuxo$bind$5$1> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerformanceChartDuxo$bind$5$1 performanceChartDuxo$bind$5$1 = new PerformanceChartDuxo$bind$5$1(this.$it, continuation);
        performanceChartDuxo$bind$5$1.L$0 = obj;
        return performanceChartDuxo$bind$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PerformanceChartDataState performanceChartDataState, Continuation<? super PerformanceChartDataState> continuation) {
        return ((PerformanceChartDuxo$bind$5$1) create(performanceChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PerformanceChartDataState performanceChartDataState = (PerformanceChartDataState) this.L$0;
        return performanceChartDataState.copy((16127 & 1) != 0 ? performanceChartDataState.chartType : null, (16127 & 2) != 0 ? performanceChartDataState.chartModel : null, (16127 & 4) != 0 ? performanceChartDataState.activeSpan : null, (16127 & 8) != 0 ? performanceChartDataState.marketValuesType : null, (16127 & 16) != 0 ? performanceChartDataState.showSettings : this.$it, (16127 & 32) != 0 ? performanceChartDataState.chartSettings : null, (16127 & 64) != 0 ? performanceChartDataState.benchmarksEnabled : false, (16127 & 128) != 0 ? performanceChartDataState.showBenchmarksTooltip : false, (16127 & 256) != 0 ? performanceChartDataState.showFxTooltipButton : false, (16127 & 512) != 0 ? performanceChartDataState.isStale : false, (16127 & 1024) != 0 ? performanceChartDataState.isInCryptoRegionGate : false, (16127 & 2048) != 0 ? performanceChartDataState.isInEtfRegionGate : false, (16127 & 4096) != 0 ? performanceChartDataState.isInMcwRegionGate : false, (16127 & 8192) != 0 ? performanceChartDataState.appType : null);
    }
}
