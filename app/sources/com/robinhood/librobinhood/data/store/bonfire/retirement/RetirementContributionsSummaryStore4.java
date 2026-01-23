package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementSypDao;
import com.robinhood.android.models.retirement.p194db.RetirementContributionsSummary;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementContributionsSummaryStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsSummaryStore$query$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RetirementContributionsSummaryStore4 extends FunctionReferenceImpl implements Function1<String, Flow<? extends RetirementContributionsSummary>> {
    RetirementContributionsSummaryStore4(Object obj) {
        super(1, obj, RetirementSypDao.class, "getContributionSummary", "getContributionSummary(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<RetirementContributionsSummary> invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((RetirementSypDao) this.receiver).getContributionSummary(p0);
    }
}
