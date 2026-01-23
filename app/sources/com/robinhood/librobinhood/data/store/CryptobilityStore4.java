package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptobilityDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptobilityStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptobilityStore$pollCryptobility$2$1$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptobilityStore4 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptobilityStore4(Object obj) {
        super(1, obj, CryptobilityDao.class, "deleteAll", "deleteAll()V", 4);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return CryptobilityStore.pollCryptobility$lambda$6$lambda$5$deleteAll((CryptobilityDao) this.receiver, continuation);
    }
}
