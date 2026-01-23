package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.charts.models.dao.AdvancedChartDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InstrumentAdvancedChartStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAdvancedChartStore$deleteAllFromDb$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentAdvancedChartStore3 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentAdvancedChartStore3(Object obj) {
        super(1, obj, AdvancedChartDao.class, "deleteAll", "deleteAll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((AdvancedChartDao) this.receiver).deleteAll(continuation);
    }
}
