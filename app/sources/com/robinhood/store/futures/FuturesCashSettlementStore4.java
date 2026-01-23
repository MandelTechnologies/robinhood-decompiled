package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesCashSettlementDao;
import com.robinhood.android.models.futures.p189db.FuturesCashSettlement;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FuturesCashSettlementStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.FuturesCashSettlementStore$getEventContractPayoutByContractId$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class FuturesCashSettlementStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends FuturesCashSettlement>> {
    FuturesCashSettlementStore4(Object obj) {
        super(1, obj, FuturesCashSettlementDao.class, "getCashSettlementByContractId", "getCashSettlementByContractId(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<FuturesCashSettlement> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FuturesCashSettlementDao) this.receiver).getCashSettlementByContractId(p0);
    }
}
