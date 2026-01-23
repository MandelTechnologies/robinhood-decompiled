package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentChartSpansStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore$chartSpansGetEndpoint$1", m3645f = "InstrumentChartSpansStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore$chartSpansGetEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentChartSpansStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super InstrumentChartSpans>, Object> {
    final /* synthetic */ InstrumentsApi $instrumentsApi;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentChartSpansStore2(InstrumentsApi instrumentsApi, Continuation<? super InstrumentChartSpansStore2> continuation) {
        super(2, continuation);
        this.$instrumentsApi = instrumentsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstrumentChartSpansStore2(this.$instrumentsApi, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super InstrumentChartSpans> continuation) {
        return ((InstrumentChartSpansStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InstrumentsApi instrumentsApi = this.$instrumentsApi;
            this.label = 1;
            obj = instrumentsApi.getInstrumentChartSpans(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return InstrumentChartSpans2.toDbModel((ApiInstrumentChartSpans) obj);
    }
}
