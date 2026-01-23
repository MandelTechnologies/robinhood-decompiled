package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.InstrumentDetails;
import com.robinhood.android.models.portfolio.InstrumentDetailsDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InstrumentDetailsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.InstrumentDetailsStore$instrumentDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentDetailsStore2 extends AdaptedFunctionReference implements Function2<InstrumentDetails, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    InstrumentDetailsStore2(Object obj) {
        super(2, obj, InstrumentDetailsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentDetails instrumentDetails, Continuation<? super Unit> continuation) {
        return InstrumentDetailsStore.instrumentDetailsEndpoint$insert((InstrumentDetailsDao) this.receiver, instrumentDetails, continuation);
    }
}
