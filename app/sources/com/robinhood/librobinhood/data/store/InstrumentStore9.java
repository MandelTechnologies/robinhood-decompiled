package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiInstrument;
import com.robinhood.models.dao.InstrumentDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InstrumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentStore$instrumentsBySymbolEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentStore9 extends AdaptedFunctionReference implements Function2<Iterable<? extends ApiInstrument>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentStore9(Object obj) {
        super(2, obj, InstrumentDao.class, "insert", "insert(Ljava/lang/Iterable;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Iterable<ApiInstrument> iterable, Continuation<? super Unit> continuation) {
        return InstrumentStore.instrumentsBySymbolEndpoint$insert$1((InstrumentDao) this.receiver, iterable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Iterable<? extends ApiInstrument> iterable, Continuation<? super Unit> continuation) {
        return invoke2((Iterable<ApiInstrument>) iterable, continuation);
    }
}
