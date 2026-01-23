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
/* synthetic */ class AcatsTransferStore$acatsTransfersEndpoint$2 extends AdaptedFunctionReference implements Function2<Iterable<? extends ApiAcatsTransfer>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AcatsTransferStore$acatsTransfersEndpoint$2(Object obj) {
        super(2, obj, AcatsTransferDao.class, "insertApiModel", "insertApiModel(Ljava/lang/Iterable;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Iterable<ApiAcatsTransfer> iterable, Continuation<? super Unit> continuation) {
        return AcatsTransferStore.acatsTransfersEndpoint$insertApiModel((AcatsTransferDao) this.receiver, iterable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Iterable<? extends ApiAcatsTransfer> iterable, Continuation<? super Unit> continuation) {
        return invoke2((Iterable<ApiAcatsTransfer>) iterable, continuation);
    }
}
