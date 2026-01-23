package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.models.dao.InstrumentChartSpansDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InstrumentChartSpansStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore$chartSpansGetEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentChartSpansStore3 extends AdaptedFunctionReference implements Function2<InstrumentChartSpans, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentChartSpansStore3(Object obj) {
        super(2, obj, InstrumentChartSpansDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentChartSpans instrumentChartSpans, Continuation<? super Unit> continuation) {
        return InstrumentChartSpansStore.chartSpansGetEndpoint$insert((InstrumentChartSpansDao) this.receiver, instrumentChartSpans, continuation);
    }
}
