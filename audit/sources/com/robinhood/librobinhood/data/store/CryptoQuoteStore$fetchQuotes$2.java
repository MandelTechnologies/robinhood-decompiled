package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoQuote;
import com.robinhood.models.dao.CryptoQuoteDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoQuoteStore$fetchQuotes$2 extends AdaptedFunctionReference implements Function2<Iterable<? extends ApiCryptoQuote>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CryptoQuoteStore$fetchQuotes$2(Object obj) {
        super(2, obj, CryptoQuoteDao.class, "insert", "insert(Ljava/lang/Iterable;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Iterable<ApiCryptoQuote> iterable, Continuation<? super Unit> continuation) {
        return CryptoQuoteStore.fetchQuotes$insert((CryptoQuoteDao) this.receiver, iterable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Iterable<? extends ApiCryptoQuote> iterable, Continuation<? super Unit> continuation) {
        return invoke2((Iterable<ApiCryptoQuote>) iterable, continuation);
    }
}
