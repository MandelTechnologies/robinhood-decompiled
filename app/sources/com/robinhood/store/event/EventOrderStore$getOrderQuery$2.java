package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.dao.EventOrderDao;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EventOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class EventOrderStore$getOrderQuery$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiEventOrder>> {
    EventOrderStore$getOrderQuery$2(Object obj) {
        super(1, obj, EventOrderDao.class, "get", "get(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiEventOrder> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((EventOrderDao) this.receiver).get(p0);
    }
}
