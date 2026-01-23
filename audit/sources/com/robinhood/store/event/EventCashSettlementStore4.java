package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.ceres.EventCashSettlement;
import com.robinhood.android.models.event.p186db.dao.EventCashSettlementDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EventCashSettlementStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.event.EventCashSettlementStore$getEventContractPayoutByContractId$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class EventCashSettlementStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends EventCashSettlement>> {
    EventCashSettlementStore4(Object obj) {
        super(1, obj, EventCashSettlementDao.class, "getCashSettlementByContractId", "getCashSettlementByContractId(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<EventCashSettlement> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((EventCashSettlementDao) this.receiver).getCashSettlementByContractId(p0);
    }
}
