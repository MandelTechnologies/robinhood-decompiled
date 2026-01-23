package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementContributionDao;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ContributionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ContributionStore$contributionViewModelEndpoint$2 extends AdaptedFunctionReference implements Function2<RetirementCombinedContributionViewModel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ContributionStore$contributionViewModelEndpoint$2(Object obj) {
        super(2, obj, RetirementContributionDao.class, "insertCombinedContributionViewModel", "insertCombinedContributionViewModel(Lcom/robinhood/android/models/retirement/db/RetirementCombinedContributionViewModel;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, Continuation<? super Unit> continuation) {
        return ContributionStore.m2648xef2362fb((RetirementContributionDao) this.receiver, retirementCombinedContributionViewModel, continuation);
    }
}
