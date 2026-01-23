package com.robinhood.android.chart.blackwidowadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BlackWidowAdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onToggleIndicatorsRow$1$collapseLegend$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onToggleIndicatorsRow$1$collapseLegend$2, reason: use source file name */
/* loaded from: classes7.dex */
final class BlackWidowAdvancedChartDuxo7 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    BlackWidowAdvancedChartDuxo7(Continuation<? super BlackWidowAdvancedChartDuxo7> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BlackWidowAdvancedChartDuxo7 blackWidowAdvancedChartDuxo7 = new BlackWidowAdvancedChartDuxo7(continuation);
        blackWidowAdvancedChartDuxo7.L$0 = obj;
        return blackWidowAdvancedChartDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
        return ((BlackWidowAdvancedChartDuxo7) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, LowerTopBarState.DisplayStatus.Indicators.INSTANCE, null, null, false, false, false, 66060287, null);
    }
}
