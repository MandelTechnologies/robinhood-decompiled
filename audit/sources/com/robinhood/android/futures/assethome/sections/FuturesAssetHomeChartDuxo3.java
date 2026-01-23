package com.robinhood.android.futures.assethome.sections;

import com.robinhood.android.futures.charts.FuturesPerformanceChartResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FuturesAssetHomeChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/futures/charts/FuturesPerformanceChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$2$2", m3645f = "FuturesAssetHomeChartDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.assethome.sections.FuturesAssetHomeChartDuxo$onCreate$1$1$2$2, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesAssetHomeChartDuxo3 extends ContinuationImpl7 implements Function2<FlowCollector<? super FuturesPerformanceChartResult>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    FuturesAssetHomeChartDuxo3(Continuation<? super FuturesAssetHomeChartDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAssetHomeChartDuxo3 futuresAssetHomeChartDuxo3 = new FuturesAssetHomeChartDuxo3(continuation);
        futuresAssetHomeChartDuxo3.L$0 = obj;
        return futuresAssetHomeChartDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super FuturesPerformanceChartResult> flowCollector, Continuation<? super Unit> continuation) {
        return ((FuturesAssetHomeChartDuxo3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (flowCollector.emit(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
