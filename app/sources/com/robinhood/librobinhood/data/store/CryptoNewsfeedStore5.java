package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoNewsfeedDao;
import com.robinhood.models.crypto.p314db.CryptoNewsfeed;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoNewsfeedStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoNewsfeedStore$cryptoNewsfeedQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoNewsfeedStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends List<? extends CryptoNewsfeed>>> {
    CryptoNewsfeedStore5(Object obj) {
        super(1, obj, CryptoNewsfeedDao.class, "get", "get(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<List<CryptoNewsfeed>> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoNewsfeedDao) this.receiver).get(p0);
    }
}
