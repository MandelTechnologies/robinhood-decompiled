package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementHistoryDao;
import com.robinhood.android.models.retirement.p194db.RetirementHistoryItem;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementHistoryStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class RetirementHistoryStore$listItemQuery$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends RetirementHistoryItem>> {
    RetirementHistoryStore$listItemQuery$2(Object obj) {
        super(1, obj, RetirementHistoryDao.class, "getHistoryItem", "getHistoryItem(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<RetirementHistoryItem> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((RetirementHistoryDao) this.receiver).getHistoryItem(p0);
    }
}
