package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementContributionDao;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedSummaryCardViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ContributionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ContributionStore$combinedSummaryCardEndpoint$2 extends AdaptedFunctionReference implements Function2<RetirementCombinedSummaryCardViewModel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ContributionStore$combinedSummaryCardEndpoint$2(Object obj) {
        super(2, obj, RetirementContributionDao.class, "insertCombinedSummaryCardViewModel", "insertCombinedSummaryCardViewModel(Lcom/robinhood/android/models/retirement/db/RetirementCombinedSummaryCardViewModel;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementCombinedSummaryCardViewModel retirementCombinedSummaryCardViewModel, Continuation<? super Unit> continuation) {
        return ContributionStore.combinedSummaryCardEndpoint$insertCombinedSummaryCardViewModel((RetirementContributionDao) this.receiver, retirementCombinedSummaryCardViewModel, continuation);
    }
}
