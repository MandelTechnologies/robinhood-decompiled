package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesContractDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesContractStore$relatedFuturesContractEndpoint$2 extends AdaptedFunctionReference implements Function2<Iterable<? extends FuturesContract>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    FuturesContractStore$relatedFuturesContractEndpoint$2(Object obj) {
        super(2, obj, FuturesContractDao.class, "insert", "insert(Ljava/lang/Iterable;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Iterable<FuturesContract> iterable, Continuation<? super Unit> continuation) {
        return FuturesContractStore.relatedFuturesContractEndpoint$insert((FuturesContractDao) this.receiver, iterable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Iterable<? extends FuturesContract> iterable, Continuation<? super Unit> continuation) {
        return invoke2((Iterable<FuturesContract>) iterable, continuation);
    }
}
