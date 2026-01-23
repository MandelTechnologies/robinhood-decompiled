package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.SlipGroupedPaymentDao;
import com.robinhood.models.p320db.SlipGroupedPayment;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SlipGroupedPaymentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$stream$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class SlipGroupedPaymentStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends SlipGroupedPayment>> {
    SlipGroupedPaymentStore5(Object obj) {
        super(1, obj, SlipGroupedPaymentDao.class, "get", "get(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<SlipGroupedPayment> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((SlipGroupedPaymentDao) this.receiver).get(p0);
    }
}
