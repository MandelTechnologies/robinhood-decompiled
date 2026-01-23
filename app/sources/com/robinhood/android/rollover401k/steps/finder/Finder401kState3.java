package com.robinhood.android.rollover401k.steps.finder;

import com.robinhood.android.models.retirement.p194db.NoResultsViewModel;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Finder401kState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;", "", "<init>", "()V", "Loading", "Results", "NoResults", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState$Loading;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState$NoResults;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState$Results;", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsViewState, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class Finder401kState3 {
    public static final int $stable = 0;

    public /* synthetic */ Finder401kState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Finder401kState3() {
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState$Loading;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsViewState$Loading */
    public static final class Loading extends Finder401kState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState$Results;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;", "viewModel", "Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "<init>", "(Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsViewState$Results, reason: from toString */
    public static final /* data */ class Results extends Finder401kState3 {
        public static final int $stable = 8;
        private final Retirement401kFinderResultsViewmodel viewModel;

        public static /* synthetic */ Results copy$default(Results results, Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, int i, Object obj) {
            if ((i & 1) != 0) {
                retirement401kFinderResultsViewmodel = results.viewModel;
            }
            return results.copy(retirement401kFinderResultsViewmodel);
        }

        /* renamed from: component1, reason: from getter */
        public final Retirement401kFinderResultsViewmodel getViewModel() {
            return this.viewModel;
        }

        public final Results copy(Retirement401kFinderResultsViewmodel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new Results(viewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Results) && Intrinsics.areEqual(this.viewModel, ((Results) other).viewModel);
        }

        public int hashCode() {
            return this.viewModel.hashCode();
        }

        public String toString() {
            return "Results(viewModel=" + this.viewModel + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Results(Retirement401kFinderResultsViewmodel viewModel) {
            super(null);
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.viewModel = viewModel;
        }

        public final Retirement401kFinderResultsViewmodel getViewModel() {
            return this.viewModel;
        }
    }

    /* compiled from: Finder401kState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState$NoResults;", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;", "viewModel", "Lcom/robinhood/android/models/retirement/db/NoResultsViewModel;", "<init>", "(Lcom/robinhood/android/models/retirement/db/NoResultsViewModel;)V", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/NoResultsViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kResultsViewState$NoResults, reason: from toString */
    public static final /* data */ class NoResults extends Finder401kState3 {
        public static final int $stable = 8;
        private final NoResultsViewModel viewModel;

        public static /* synthetic */ NoResults copy$default(NoResults noResults, NoResultsViewModel noResultsViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                noResultsViewModel = noResults.viewModel;
            }
            return noResults.copy(noResultsViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final NoResultsViewModel getViewModel() {
            return this.viewModel;
        }

        public final NoResults copy(NoResultsViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new NoResults(viewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoResults) && Intrinsics.areEqual(this.viewModel, ((NoResults) other).viewModel);
        }

        public int hashCode() {
            return this.viewModel.hashCode();
        }

        public String toString() {
            return "NoResults(viewModel=" + this.viewModel + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResults(NoResultsViewModel viewModel) {
            super(null);
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.viewModel = viewModel;
        }

        public final NoResultsViewModel getViewModel() {
            return this.viewModel;
        }
    }
}
