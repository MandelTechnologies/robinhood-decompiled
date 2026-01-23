package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.AccountMarketValues;
import com.robinhood.android.models.portfolio.AccountMarketValuesDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AccountMarketValuesStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore$valuesEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class AccountMarketValuesStore2 extends AdaptedFunctionReference implements Function2<AccountMarketValues, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AccountMarketValuesStore2(Object obj) {
        super(2, obj, AccountMarketValuesDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountMarketValues accountMarketValues, Continuation<? super Unit> continuation) {
        return AccountMarketValuesStore.valuesEndpoint$insert((AccountMarketValuesDao) this.receiver, accountMarketValues, continuation);
    }
}
