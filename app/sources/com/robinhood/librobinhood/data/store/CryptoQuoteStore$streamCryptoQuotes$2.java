package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.dao.CryptoQuoteDao;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoQuoteStore$streamCryptoQuotes$2 extends FunctionReferenceImpl implements Function1<List<? extends UUID>, Flow<? extends List<? extends CryptoQuote>>> {
    CryptoQuoteStore$streamCryptoQuotes$2(Object obj) {
        super(1, obj, CryptoQuoteDao.class, "getQuotesForIds", "getQuotesForIds(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Flow<? extends List<? extends CryptoQuote>> invoke(List<? extends UUID> list) {
        return invoke2((List<UUID>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Flow<List<CryptoQuote>> invoke2(List<UUID> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoQuoteDao) this.receiver).getQuotesForIds(p0);
    }
}
