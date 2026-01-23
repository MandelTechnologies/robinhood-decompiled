package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.dao.CurrencyPairDao;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CurrencyPairV2Store.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairQuery$2, reason: use source file name */
/* loaded from: classes20.dex */
/* synthetic */ class CurrencyPairV2Store5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiCurrencyPair>> {
    CurrencyPairV2Store5(Object obj) {
        super(1, obj, CurrencyPairDao.class, "getCurrencyPair", "getCurrencyPair(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiCurrencyPair> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CurrencyPairDao) this.receiver).getCurrencyPair(p0);
    }
}
