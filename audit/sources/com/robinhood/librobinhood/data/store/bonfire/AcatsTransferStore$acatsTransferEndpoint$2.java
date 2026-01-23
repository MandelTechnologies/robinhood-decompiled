package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.dao.AcatsTransferDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AcatsTransferStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class AcatsTransferStore$acatsTransferEndpoint$2 extends AdaptedFunctionReference implements Function2<ApiAcatsTransfer, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AcatsTransferStore$acatsTransferEndpoint$2(Object obj) {
        super(2, obj, AcatsTransferDao.class, "insertApiModel", "insertApiModel(Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAcatsTransfer apiAcatsTransfer, Continuation<? super Unit> continuation) {
        return AcatsTransferStore.acatsTransferEndpoint$insertApiModel$0((AcatsTransferDao) this.receiver, apiAcatsTransfer, continuation);
    }
}
