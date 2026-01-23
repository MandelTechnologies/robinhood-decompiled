package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesProductDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FuturesProductStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.arsenal.FuturesProductStore$futuresProductQuery$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class FuturesProductStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends FuturesProduct>> {
    FuturesProductStore5(Object obj) {
        super(1, obj, FuturesProductDao.class, "getFuturesProduct", "getFuturesProduct(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<FuturesProduct> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FuturesProductDao) this.receiver).getFuturesProduct(p0);
    }
}
