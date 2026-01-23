package com.robinhood.android.advancedchart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/AdvancedChartViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartDuxo$onCreate$3$1", m3645f = "AdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AdvancedChartDuxo$onCreate$3$1 extends ContinuationImpl7 implements Function2<AdvancedChartViewState, Continuation<? super AdvancedChartViewState>, Object> {
    final /* synthetic */ boolean $showCandlesticks;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartDuxo$onCreate$3$1(boolean z, Continuation<? super AdvancedChartDuxo$onCreate$3$1> continuation) {
        super(2, continuation);
        this.$showCandlesticks = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedChartDuxo$onCreate$3$1 advancedChartDuxo$onCreate$3$1 = new AdvancedChartDuxo$onCreate$3$1(this.$showCandlesticks, continuation);
        advancedChartDuxo$onCreate$3$1.L$0 = obj;
        return advancedChartDuxo$onCreate$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvancedChartViewState advancedChartViewState, Continuation<? super AdvancedChartViewState> continuation) {
        return ((AdvancedChartDuxo$onCreate$3$1) create(advancedChartViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) this.L$0;
        return advancedChartViewState.copy((61439 & 1) != 0 ? advancedChartViewState.advancedChart : null, (61439 & 2) != 0 ? advancedChartViewState.chartSpans : null, (61439 & 4) != 0 ? advancedChartViewState.displaySpan : null, (61439 & 8) != 0 ? advancedChartViewState.chartIntervals : null, (61439 & 16) != 0 ? advancedChartViewState.isLoading : false, (61439 & 32) != 0 ? advancedChartViewState.indicatorList : null, (61439 & 64) != 0 ? advancedChartViewState.indicatorListViewHeight : 0, (61439 & 128) != 0 ? advancedChartViewState.instrument : null, (61439 & 256) != 0 ? advancedChartViewState.quote : null, (61439 & 512) != 0 ? advancedChartViewState.hideExtendedHours : false, (61439 & 1024) != 0 ? advancedChartViewState.showCandlesticks : this.$showCandlesticks, (61439 & 2048) != 0 ? advancedChartViewState.isEditSurfaceIconEnabled : false, (61439 & 4096) != 0 ? advancedChartViewState.isIndicatorTapScrollEnabled : false, (61439 & 8192) != 0 ? advancedChartViewState.showCustomIntervalsTooltip : false, (61439 & 16384) != 0 ? advancedChartViewState.locality : null, (61439 & 32768) != 0 ? advancedChartViewState.xAxisZoomRange : null);
    }
}
