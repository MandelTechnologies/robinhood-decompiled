package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore;
import com.robinhood.models.api.bonfire.instrument.PostApiInstrumentChartIntervalsConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentChartIntervalsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore$IntervalsUpdateRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$chartIntervalsUpdateEndpoint$1", m3645f = "InstrumentChartIntervalsStore.kt", m3646l = {46}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$chartIntervalsUpdateEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentChartIntervalsStore4 extends ContinuationImpl7 implements Function2<InstrumentChartIntervalsStore.IntervalsUpdateRequest, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstrumentsApi $instrumentsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentChartIntervalsStore4(InstrumentsApi instrumentsApi, Continuation<? super InstrumentChartIntervalsStore4> continuation) {
        super(2, continuation);
        this.$instrumentsApi = instrumentsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentChartIntervalsStore4 instrumentChartIntervalsStore4 = new InstrumentChartIntervalsStore4(this.$instrumentsApi, continuation);
        instrumentChartIntervalsStore4.L$0 = obj;
        return instrumentChartIntervalsStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentChartIntervalsStore.IntervalsUpdateRequest intervalsUpdateRequest, Continuation<? super Unit> continuation) {
        return ((InstrumentChartIntervalsStore4) create(intervalsUpdateRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InstrumentChartIntervalsStore.IntervalsUpdateRequest intervalsUpdateRequest = (InstrumentChartIntervalsStore.IntervalsUpdateRequest) this.L$0;
            InstrumentsApi instrumentsApi = this.$instrumentsApi;
            String instrumentId = intervalsUpdateRequest.getInstrumentId();
            PostApiInstrumentChartIntervalsConfig postBody = intervalsUpdateRequest.getPostBody();
            this.label = 1;
            if (instrumentsApi.postInstrumentChartIntervalsConfig(instrumentId, postBody, this) == coroutine_suspended) {
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
