package com.robinhood.store.search;

import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p314db.CurrencyPair2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.search.SearchStore$saveInstrumentsAndCurrencyPairs$currencyPairs$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class SearchStore5 extends FunctionReferenceImpl implements Function1<ApiCurrencyPair, CurrencyPair> {
    public static final SearchStore5 INSTANCE = new SearchStore5();

    SearchStore5() {
        super(1, CurrencyPair2.class, "toDbModel", "toDbModel(Lcom/robinhood/models/api/ApiCurrencyPair;)Lcom/robinhood/models/crypto/db/CurrencyPair;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CurrencyPair invoke(ApiCurrencyPair p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return CurrencyPair2.toDbModel(p0);
    }
}
