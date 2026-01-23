package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.p320db.bonfire.RecurringInsightsPageResponse;
import com.robinhood.recurring.models.dao.RecurringInsightsDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RecurringInsightsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RecurringInsightsStore$streamRecurringInsightsPageResponse$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RecurringInsightsStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends RecurringInsightsPageResponse>> {
    RecurringInsightsStore4(Object obj) {
        super(1, obj, RecurringInsightsDao.class, "getRecurringInsightsPageResponse", "getRecurringInsightsPageResponse(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<RecurringInsightsPageResponse> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((RecurringInsightsDao) this.receiver).getRecurringInsightsPageResponse(p0);
    }
}
