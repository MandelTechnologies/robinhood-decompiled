package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesContractDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesContractStore$futuresContractQuery$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends FuturesContract>> {
    FuturesContractStore$futuresContractQuery$2(Object obj) {
        super(1, obj, FuturesContractDao.class, "getFuturesContract", "getFuturesContract(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<FuturesContract> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FuturesContractDao) this.receiver).getFuturesContract(p0);
    }
}
