package com.robinhood.android.futures.detail.p140ui.chart;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesDetailChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onResume$2$1", m3645f = "FuturesDetailChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesDetailChartDuxo8 extends ContinuationImpl7 implements Function2<FuturesDetailChartDataState, Continuation<? super FuturesDetailChartDataState>, Object> {
    final /* synthetic */ boolean $isContinuous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesDetailChartDuxo8(boolean z, Continuation<? super FuturesDetailChartDuxo8> continuation) {
        super(2, continuation);
        this.$isContinuous = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesDetailChartDuxo8 futuresDetailChartDuxo8 = new FuturesDetailChartDuxo8(this.$isContinuous, continuation);
        futuresDetailChartDuxo8.L$0 = obj;
        return futuresDetailChartDuxo8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesDetailChartDataState futuresDetailChartDataState, Continuation<? super FuturesDetailChartDataState> continuation) {
        return ((FuturesDetailChartDuxo8) create(futuresDetailChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return FuturesDetailChartDataState.copy$default((FuturesDetailChartDataState) this.L$0, null, null, null, null, null, false, false, null, null, null, this.$isContinuous, false, 3071, null);
    }
}
