package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.models.api.ApiCryptoQuote;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import retrofit2.Response;

/* compiled from: CryptoQuoteStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoQuoteStore$pollCryptoQuote$1 extends FunctionReferenceImpl implements Function1<CryptoQuoteStore.CryptoQuoteArgs, Flow<? extends Response<ApiCryptoQuote>>> {
    CryptoQuoteStore$pollCryptoQuote$1(Object obj) {
        super(1, obj, CryptoQuoteStore.class, "handlePoller", "handlePoller(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore$CryptoQuoteArgs;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<Response<ApiCryptoQuote>> invoke(CryptoQuoteStore.CryptoQuoteArgs p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoQuoteStore) this.receiver).handlePoller(p0);
    }
}
