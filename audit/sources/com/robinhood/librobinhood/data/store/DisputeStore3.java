package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.minerva.ApiDispute;
import com.robinhood.models.dao.DisputeDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: DisputeStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.DisputeStore$getDisputeEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class DisputeStore3 extends AdaptedFunctionReference implements Function2<ApiDispute, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    DisputeStore3(Object obj) {
        super(2, obj, DisputeDao.class, "insert", "insert(Lcom/robinhood/models/api/minerva/ApiDispute;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiDispute apiDispute, Continuation<? super Unit> continuation) {
        return DisputeStore.getDisputeEndpoint$insert((DisputeDao) this.receiver, apiDispute, continuation);
    }
}
