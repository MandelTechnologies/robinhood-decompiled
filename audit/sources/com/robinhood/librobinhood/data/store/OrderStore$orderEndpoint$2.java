package com.robinhood.librobinhood.data.store;

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
/* synthetic */ class OrderStore$orderEndpoint$2 extends AdaptedFunctionReference implements Function2<ApiOrder, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    OrderStore$orderEndpoint$2(Object obj) {
        super(2, obj, OrderDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiOrder;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOrder apiOrder, Continuation<? super Unit> continuation) {
        return OrderStore.orderEndpoint$insert$2((OrderDao) this.receiver, apiOrder, continuation);
    }
}
