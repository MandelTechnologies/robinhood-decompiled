package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiAggregateOptionPosition;
import com.robinhood.models.dao.AggregateOptionPositionDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AggregateOptionPositionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.AggregateOptionPositionStore$getAggregateOptionPositionEndpoint$1 */
/* loaded from: classes13.dex */
/* synthetic */ class C33553xe4b1b669 extends AdaptedFunctionReference implements Function2<ApiAggregateOptionPosition, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    C33553xe4b1b669(Object obj) {
        super(2, obj, AggregateOptionPositionDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiAggregateOptionPosition;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAggregateOptionPosition apiAggregateOptionPosition, Continuation<? super Unit> continuation) {
        return AggregateOptionPositionStore.getAggregateOptionPositionEndpoint$insert((AggregateOptionPositionDao) this.receiver, apiAggregateOptionPosition, continuation);
    }
}
