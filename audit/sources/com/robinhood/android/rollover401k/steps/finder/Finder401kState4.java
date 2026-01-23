package com.robinhood.android.rollover401k.steps.finder;

import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import com.robinhood.android.rollover401k.steps.finder.Finder401kState3;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Finder401kState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsDataState;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;", "<init>", "()V", "reduce", "dataState", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kStateProvider, reason: use source file name */
/* loaded from: classes5.dex */
public final class Finder401kState4 implements StateProvider<Finder401kResultsDataState, Finder401kState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public Finder401kState3 reduce(Finder401kResultsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Retirement401kFinderResultsViewmodel finderViewModel = dataState.getFinderViewModel();
        if (finderViewModel != null) {
            if (finderViewModel.getFinderResults().isEmpty()) {
                return new Finder401kState3.NoResults(finderViewModel.getNoResultsViewModel());
            }
            return new Finder401kState3.Results(finderViewModel);
        }
        return Finder401kState3.Loading.INSTANCE;
    }
}
