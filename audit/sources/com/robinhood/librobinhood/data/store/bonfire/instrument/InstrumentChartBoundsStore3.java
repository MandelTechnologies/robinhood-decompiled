package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.models.dao.InstrumentChartBoundsDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartBounds;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InstrumentChartBoundsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentChartBoundsStore3 extends AdaptedFunctionReference implements Function2<InstrumentChartBounds, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentChartBoundsStore3(Object obj) {
        super(2, obj, InstrumentChartBoundsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentChartBounds instrumentChartBounds, Continuation<? super Unit> continuation) {
        return InstrumentChartBoundsStore.endpoint$insert((InstrumentChartBoundsDao) this.receiver, instrumentChartBounds, continuation);
    }
}
