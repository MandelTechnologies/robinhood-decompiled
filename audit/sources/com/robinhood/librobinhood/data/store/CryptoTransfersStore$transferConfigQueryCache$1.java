package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoTransferConfigDao;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoTransfersStore$transferConfigQueryCache$1 extends FunctionReferenceImpl implements Function1<String, Flow<? extends CryptoTransferConfig>> {
    CryptoTransfersStore$transferConfigQueryCache$1(Object obj) {
        super(1, obj, CryptoTransferConfigDao.class, "getCryptoTransferConfig", "getCryptoTransferConfig(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<CryptoTransferConfig> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoTransferConfigDao) this.receiver).getCryptoTransferConfig(p0);
    }
}
