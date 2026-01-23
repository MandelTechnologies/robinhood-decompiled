package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.QuoteDao;
import com.robinhood.models.p320db.Quote;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: QuoteStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$quoteQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class QuoteStore8 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends Quote>> {
    QuoteStore8(Object obj) {
        super(1, obj, QuoteDao.class, "getQuoteByInstrumentId", "getQuoteByInstrumentId(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<Quote> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((QuoteDao) this.receiver).getQuoteByInstrumentId(p0);
    }
}
