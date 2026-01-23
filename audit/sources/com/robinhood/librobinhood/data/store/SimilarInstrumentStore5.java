package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.SimilarInstrumentDao;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SimilarInstrumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.SimilarInstrumentStore$query$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class SimilarInstrumentStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends List<? extends UUID>>> {
    SimilarInstrumentStore5(Object obj) {
        super(1, obj, SimilarInstrumentDao.class, "getSimilarInstrumentIds", "getSimilarInstrumentIds(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<List<UUID>> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((SimilarInstrumentDao) this.receiver).getSimilarInstrumentIds(p0);
    }
}
