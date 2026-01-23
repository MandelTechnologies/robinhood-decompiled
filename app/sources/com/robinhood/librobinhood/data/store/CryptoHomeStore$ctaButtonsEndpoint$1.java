package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoHomeCtaButtonsDao;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoHomeStore$ctaButtonsEndpoint$1 extends AdaptedFunctionReference implements Function2<CryptoHomeCtaButtons, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptoHomeStore$ctaButtonsEndpoint$1(Object obj) {
        super(2, obj, CryptoHomeCtaButtonsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeCtaButtons cryptoHomeCtaButtons, Continuation<? super Unit> continuation) {
        return CryptoHomeStore.ctaButtonsEndpoint$insert$8((CryptoHomeCtaButtonsDao) this.receiver, cryptoHomeCtaButtons, continuation);
    }
}
