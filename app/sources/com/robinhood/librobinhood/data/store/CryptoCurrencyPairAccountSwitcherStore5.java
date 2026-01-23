package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CryptoCurrencyPairAccountSwitcherDao;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoCurrencyPairAccountSwitcherStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$accountSwitcherForCurrencyPairQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CryptoCurrencyPairAccountSwitcherStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends CryptoCurrencyPairAccountSwitcher>> {
    CryptoCurrencyPairAccountSwitcherStore5(Object obj) {
        super(1, obj, CryptoCurrencyPairAccountSwitcherDao.class, "getAccountSwitcher", "getAccountSwitcher(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<CryptoCurrencyPairAccountSwitcher> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CryptoCurrencyPairAccountSwitcherDao) this.receiver).getAccountSwitcher(p0);
    }
}
