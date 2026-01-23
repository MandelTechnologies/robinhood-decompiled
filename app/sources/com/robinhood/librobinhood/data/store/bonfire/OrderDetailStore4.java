package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.OrderDetailDao;
import com.robinhood.models.p320db.bonfire.OrderDetail;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OrderDetailStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.OrderDetailStore$stream$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OrderDetailStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends OrderDetail>> {
    OrderDetailStore4(Object obj) {
        super(1, obj, OrderDetailDao.class, "getOrderDetail", "getOrderDetail(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OrderDetail> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OrderDetailDao) this.receiver).getOrderDetail(p0);
    }
}
