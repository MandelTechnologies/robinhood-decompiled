package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiPosition;
import com.robinhood.models.dao.PositionDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: PositionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.PositionStore$positionEndpointForAccount$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class PositionStore4 extends AdaptedFunctionReference implements Function2<ApiPosition, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    PositionStore4(Object obj) {
        super(2, obj, PositionDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiPosition;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPosition apiPosition, Continuation<? super Unit> continuation) {
        return PositionStore.positionEndpointForAccount$insert((PositionDao) this.receiver, apiPosition, continuation);
    }
}
