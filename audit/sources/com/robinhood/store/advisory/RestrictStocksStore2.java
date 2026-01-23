package com.robinhood.store.advisory;

import com.robinhood.models.advisory.dao.RestrictStocksDao;
import com.robinhood.models.advisory.p304db.portfolio.RestrictedStocksResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RestrictStocksStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.advisory.RestrictStocksStore$getRestrictedStocksEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class RestrictStocksStore2 extends AdaptedFunctionReference implements Function2<RestrictedStocksResponse, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RestrictStocksStore2(Object obj) {
        super(2, obj, RestrictStocksDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RestrictedStocksResponse restrictedStocksResponse, Continuation<? super Unit> continuation) {
        return RestrictStocksStore.getRestrictedStocksEndpoint$insert((RestrictStocksDao) this.receiver, restrictedStocksResponse, continuation);
    }
}
