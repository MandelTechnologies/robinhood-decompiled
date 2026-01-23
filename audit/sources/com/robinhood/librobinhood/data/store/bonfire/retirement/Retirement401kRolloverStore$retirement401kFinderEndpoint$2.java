package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.Retirement401kFinderResultsDao;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class Retirement401kRolloverStore$retirement401kFinderEndpoint$2 extends AdaptedFunctionReference implements Function2<Retirement401kFinderResultsViewmodel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    Retirement401kRolloverStore$retirement401kFinderEndpoint$2(Object obj) {
        super(2, obj, Retirement401kFinderResultsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, Continuation<? super Unit> continuation) {
        return Retirement401kRolloverStore.retirement401kFinderEndpoint$insert((Retirement401kFinderResultsDao) this.receiver, retirement401kFinderResultsViewmodel, continuation);
    }
}
