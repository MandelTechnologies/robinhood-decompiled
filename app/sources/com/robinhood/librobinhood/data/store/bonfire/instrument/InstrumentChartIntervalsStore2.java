package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentChartIntervalsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "it", "", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentId;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$chartIntervalsGetEndpoint$1", m3645f = "InstrumentChartIntervalsStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$chartIntervalsGetEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentChartIntervalsStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super InstrumentChartIntervals>, Object> {
    final /* synthetic */ InstrumentsApi $instrumentsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentChartIntervalsStore2(InstrumentsApi instrumentsApi, Continuation<? super InstrumentChartIntervalsStore2> continuation) {
        super(2, continuation);
        this.$instrumentsApi = instrumentsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentChartIntervalsStore2 instrumentChartIntervalsStore2 = new InstrumentChartIntervalsStore2(this.$instrumentsApi, continuation);
        instrumentChartIntervalsStore2.L$0 = obj;
        return instrumentChartIntervalsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super InstrumentChartIntervals> continuation) {
        return ((InstrumentChartIntervalsStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            InstrumentsApi instrumentsApi = this.$instrumentsApi;
            this.label = 1;
            obj = instrumentsApi.getInstrumentChartIntervals(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return InstrumentChartIntervals2.toDbModel((ApiInstrumentChartIntervals) obj);
    }
}
