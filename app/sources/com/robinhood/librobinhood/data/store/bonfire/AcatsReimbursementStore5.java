package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.acats.p299db.bonfire.AcatsReimbursement;
import com.robinhood.models.acats.p299db.dao.AcatsReimbursementDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AcatsReimbursementStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStore$listItemQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class AcatsReimbursementStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends AcatsReimbursement>> {
    AcatsReimbursementStore5(Object obj) {
        super(1, obj, AcatsReimbursementDao.class, "getReimbursementItem", "getReimbursementItem(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<AcatsReimbursement> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((AcatsReimbursementDao) this.receiver).getReimbursementItem(p0);
    }
}
