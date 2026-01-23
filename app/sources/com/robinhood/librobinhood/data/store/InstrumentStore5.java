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
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentStore$instrumentByIdEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentStore5 extends AdaptedFunctionReference implements Function2<ApiInstrument, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentStore5(Object obj) {
        super(2, obj, InstrumentDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiInstrument;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInstrument apiInstrument, Continuation<? super Unit> continuation) {
        return InstrumentStore.instrumentByIdEndpoint$insert((InstrumentDao) this.receiver, apiInstrument, continuation);
    }
}
