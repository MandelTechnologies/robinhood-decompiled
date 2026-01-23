package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.NbboSummaryDao;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: NbboSummaryStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore$streamCache$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class NbboSummaryStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends NbboSummary>> {
    NbboSummaryStore5(Object obj) {
        super(1, obj, NbboSummaryDao.class, "getNbboSummary", "getNbboSummary(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<NbboSummary> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((NbboSummaryDao) this.receiver).getNbboSummary(p0);
    }
}
