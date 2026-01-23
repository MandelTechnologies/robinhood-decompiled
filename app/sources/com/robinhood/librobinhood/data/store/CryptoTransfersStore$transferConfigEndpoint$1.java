package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoTransferConfigDao;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoTransfersStore$transferConfigEndpoint$1 extends AdaptedFunctionReference implements Function2<CryptoTransferConfig, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptoTransfersStore$transferConfigEndpoint$1(Object obj) {
        super(2, obj, CryptoTransferConfigDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoTransferConfig cryptoTransferConfig, Continuation<? super Unit> continuation) {
        return CryptoTransfersStore.transferConfigEndpoint$insert((CryptoTransferConfigDao) this.receiver, cryptoTransferConfig, continuation);
    }
}
