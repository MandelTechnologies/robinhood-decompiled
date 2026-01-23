package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoStakingSummaryModelDao;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingSummaryModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptoStakingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoStakingStore$cryptoSummaryEndpoint$1 extends AdaptedFunctionReference implements Function2<CryptoStakingSummaryModel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptoStakingStore$cryptoSummaryEndpoint$1(Object obj) {
        super(2, obj, CryptoStakingSummaryModelDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoStakingSummaryModel cryptoStakingSummaryModel, Continuation<? super Unit> continuation) {
        return CryptoStakingStore.cryptoSummaryEndpoint$insert((CryptoStakingSummaryModelDao) this.receiver, cryptoStakingSummaryModel, continuation);
    }
}
