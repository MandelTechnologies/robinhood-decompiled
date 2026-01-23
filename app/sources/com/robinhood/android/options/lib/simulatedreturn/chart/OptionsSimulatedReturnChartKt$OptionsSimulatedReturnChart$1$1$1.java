package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsSimulatedReturnChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1", m3645f = "OptionsSimulatedReturnChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionsProfitAndLossChartDuxo $duxo;
    final /* synthetic */ OptionsSimulatedChartLaunchMode.ProfitAndLoss $this_run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss, Continuation<? super OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1> continuation) {
        super(2, continuation);
        this.$duxo = optionsProfitAndLossChartDuxo;
        this.$this_run = profitAndLoss;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1(this.$duxo, this.$this_run, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsSimulatedReturnChartKt$OptionsSimulatedReturnChart$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.bind(this.$this_run.getAccountNumber(), this.$this_run.getLoggingState(), this.$this_run.getSliderPosition(), this.$this_run.getProfitLossLaunchMode(), this.$this_run.getChartBundle(), this.$this_run.isFullyExpanded());
        return Unit.INSTANCE;
    }
}
