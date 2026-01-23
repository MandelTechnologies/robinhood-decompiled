package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesOrderStore$replaceOrderEndpoint$2 extends FunctionReferenceImpl implements Function2<FuturesOrderDto, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    FuturesOrderStore$replaceOrderEndpoint$2(Object obj) {
        super(2, obj, FuturesOrderDao.class, "insert", "insert(Lcom/robinhood/ceres/v1/FuturesOrderDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesOrderDto futuresOrderDto, Continuation<? super Unit> continuation) {
        return ((FuturesOrderDao) this.receiver).insert(futuresOrderDto, continuation);
    }
}
