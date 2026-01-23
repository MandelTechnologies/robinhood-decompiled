package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.models.dao.InstrumentChartIntervalsDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InstrumentChartIntervalsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$chartIntervalsGetEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentChartIntervalsStore3 extends AdaptedFunctionReference implements Function2<InstrumentChartIntervals, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentChartIntervalsStore3(Object obj) {
        super(2, obj, InstrumentChartIntervalsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentChartIntervals instrumentChartIntervals, Continuation<? super Unit> continuation) {
        return InstrumentChartIntervalsStore.chartIntervalsGetEndpoint$insert((InstrumentChartIntervalsDao) this.receiver, instrumentChartIntervals, continuation);
    }
}
