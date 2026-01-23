package com.robinhood.android.futures.charts.sparkline;

import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.store.futures.ChartType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FuturesSparklineDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\"\u0012\u001e\u0012\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/ChartType;", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$2$flows$1$2", m3645f = "FuturesSparklineDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.charts.sparkline.FuturesSparklineDuxo$onCreate$1$2$flows$1$2, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesSparklineDuxo2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Tuples2<UUID, ChartType> $key;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FuturesSparklineDuxo2(Tuples2<UUID, ? extends ChartType> tuples2, Continuation<? super FuturesSparklineDuxo2> continuation) {
        super(2, continuation);
        this.$key = tuples2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesSparklineDuxo2 futuresSparklineDuxo2 = new FuturesSparklineDuxo2(this.$key, continuation);
        futuresSparklineDuxo2.L$0 = obj;
        return futuresSparklineDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends Tuples2<? extends UUID, ? extends ChartType>, ? extends FuturesChartResult>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Tuples2<? extends Tuples2<UUID, ? extends ChartType>, FuturesChartResult>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Tuples2<? extends Tuples2<UUID, ? extends ChartType>, FuturesChartResult>> flowCollector, Continuation<? super Unit> continuation) {
        return ((FuturesSparklineDuxo2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$key, null);
            this.label = 1;
            if (flowCollector.emit(tuples2M3642to, this) == coroutine_suspended) {
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
