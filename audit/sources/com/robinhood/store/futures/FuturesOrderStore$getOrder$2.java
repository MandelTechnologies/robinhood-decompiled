package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesOrderStore$getOrder$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiFuturesOrder>> {
    FuturesOrderStore$getOrder$2(Object obj) {
        super(1, obj, FuturesOrderDao.class, "getFuturesOrder", "getFuturesOrder(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiFuturesOrder> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FuturesOrderDao) this.receiver).getFuturesOrder(p0);
    }
}
