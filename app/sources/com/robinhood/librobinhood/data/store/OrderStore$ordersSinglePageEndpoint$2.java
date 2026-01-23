package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOrder;
import com.robinhood.models.dao.OrderDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: OrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OrderStore$ordersSinglePageEndpoint$2 extends AdaptedFunctionReference implements Function2<PaginatedResult<? extends ApiOrder>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    OrderStore$ordersSinglePageEndpoint$2(Object obj) {
        super(2, obj, OrderDao.class, "insert", "insert(Lcom/robinhood/models/PaginatedResult;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiOrder> paginatedResult, Continuation<? super Unit> continuation) {
        return OrderStore.ordersSinglePageEndpoint$insert$3((OrderDao) this.receiver, paginatedResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiOrder> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiOrder>) paginatedResult, continuation);
    }
}
