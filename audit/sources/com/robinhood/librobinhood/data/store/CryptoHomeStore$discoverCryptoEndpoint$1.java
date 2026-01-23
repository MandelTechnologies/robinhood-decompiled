package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoHomeDiscoverDao;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoHomeStore$discoverCryptoEndpoint$1 extends AdaptedFunctionReference implements Function2<CryptoHomeDiscover, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptoHomeStore$discoverCryptoEndpoint$1(Object obj) {
        super(2, obj, CryptoHomeDiscoverDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeDiscover cryptoHomeDiscover, Continuation<? super Unit> continuation) {
        return CryptoHomeStore.discoverCryptoEndpoint$insert((CryptoHomeDiscoverDao) this.receiver, cryptoHomeDiscover, continuation);
    }
}
