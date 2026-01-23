package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.dao.CryptoDescriptionDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoDescriptionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoDescriptionStore$streamCryptoDescription$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoDescriptionStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends CryptoDescription>> {
    CryptoDescriptionStore4(Object obj) {
        super(1, obj, CryptoDescriptionDao.class, "getCryptoDescription", "getCryptoDescription(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<CryptoDescription> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoDescriptionDao) this.receiver).getCryptoDescription(p0);
    }
}
