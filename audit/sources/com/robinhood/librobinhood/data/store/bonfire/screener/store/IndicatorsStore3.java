package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.equityscreener.models.dao.IndicatorsDao;
import com.robinhood.equityscreener.models.p294db.AllIndicatorsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: IndicatorsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore$indicatorsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class IndicatorsStore3 extends AdaptedFunctionReference implements Function2<AllIndicatorsResponse, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    IndicatorsStore3(Object obj) {
        super(2, obj, IndicatorsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AllIndicatorsResponse allIndicatorsResponse, Continuation<? super Unit> continuation) {
        return IndicatorsStore.indicatorsEndpoint$insert((IndicatorsDao) this.receiver, allIndicatorsResponse, continuation);
    }
}
