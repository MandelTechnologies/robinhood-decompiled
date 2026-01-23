package com.robinhood.android.rollover401k.steps.finder;

import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Finder401kState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsDataState;", "", "finderViewModel", "Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "<init>", "(Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;)V", "getFinderViewModel", "()Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Finder401kResultsDataState {
    public static final int $stable = 8;
    private final Retirement401kFinderResultsViewmodel finderViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public Finder401kResultsDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Finder401kResultsDataState copy$default(Finder401kResultsDataState finder401kResultsDataState, Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, int i, Object obj) {
        if ((i & 1) != 0) {
            retirement401kFinderResultsViewmodel = finder401kResultsDataState.finderViewModel;
        }
        return finder401kResultsDataState.copy(retirement401kFinderResultsViewmodel);
    }

    /* renamed from: component1, reason: from getter */
    public final Retirement401kFinderResultsViewmodel getFinderViewModel() {
        return this.finderViewModel;
    }

    public final Finder401kResultsDataState copy(Retirement401kFinderResultsViewmodel finderViewModel) {
        return new Finder401kResultsDataState(finderViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Finder401kResultsDataState) && Intrinsics.areEqual(this.finderViewModel, ((Finder401kResultsDataState) other).finderViewModel);
    }

    public int hashCode() {
        Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel = this.finderViewModel;
        if (retirement401kFinderResultsViewmodel == null) {
            return 0;
        }
        return retirement401kFinderResultsViewmodel.hashCode();
    }

    public String toString() {
        return "Finder401kResultsDataState(finderViewModel=" + this.finderViewModel + ")";
    }

    public Finder401kResultsDataState(Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel) {
        this.finderViewModel = retirement401kFinderResultsViewmodel;
    }

    public /* synthetic */ Finder401kResultsDataState(Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : retirement401kFinderResultsViewmodel);
    }

    public final Retirement401kFinderResultsViewmodel getFinderViewModel() {
        return this.finderViewModel;
    }
}
