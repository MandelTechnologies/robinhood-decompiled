package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpanInterval;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentChartIntervalsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDuxo$onCreate$2$1", m3645f = "InstrumentChartIntervalsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentChartIntervalsDuxo2 extends ContinuationImpl7 implements Function2<InstrumentChartIntervalsDataState, Continuation<? super InstrumentChartIntervalsDataState>, Object> {
    final /* synthetic */ InstrumentChartSpanInterval $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentChartIntervalsDuxo2(InstrumentChartSpanInterval instrumentChartSpanInterval, Continuation<? super InstrumentChartIntervalsDuxo2> continuation) {
        super(2, continuation);
        this.$it = instrumentChartSpanInterval;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentChartIntervalsDuxo2 instrumentChartIntervalsDuxo2 = new InstrumentChartIntervalsDuxo2(this.$it, continuation);
        instrumentChartIntervalsDuxo2.L$0 = obj;
        return instrumentChartIntervalsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentChartIntervalsDataState instrumentChartIntervalsDataState, Continuation<? super InstrumentChartIntervalsDataState> continuation) {
        return ((InstrumentChartIntervalsDuxo2) create(instrumentChartIntervalsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((InstrumentChartIntervalsDataState) this.L$0).copy(this.$it);
    }
}
