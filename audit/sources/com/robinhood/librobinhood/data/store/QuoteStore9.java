package com.robinhood.librobinhood.data.store;

import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.models.dao.IpoQuoteDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: QuoteStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$streamIpoQuote$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class QuoteStore9 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends IpoQuote>> {
    QuoteStore9(Object obj) {
        super(1, obj, IpoQuoteDao.class, "getIpoQuoteByInstrumentId", "getIpoQuoteByInstrumentId(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<IpoQuote> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((IpoQuoteDao) this.receiver).getIpoQuoteByInstrumentId(p0);
    }
}
