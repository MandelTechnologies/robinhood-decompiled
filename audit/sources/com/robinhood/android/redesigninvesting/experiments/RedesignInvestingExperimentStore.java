package com.robinhood.android.redesigninvesting.experiments;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RedesignInvestingExperimentStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "isInvestingHighlightsEnabled", "Lkotlinx/coroutines/flow/Flow;", "", "isInvestingBadgeEnabled", "isMonitorTabInternalExperimentEnabled", "lib-experiments_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RedesignInvestingExperimentStore {
    private final ExperimentsStore experimentsStore;

    public RedesignInvestingExperimentStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.experimentsStore = experimentsStore;
    }

    public final Flow<Boolean> isInvestingHighlightsEnabled() {
        return FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{InvestingHighlightsExperiment.INSTANCE}, false, null, 6, null));
    }

    public final Flow<Boolean> isInvestingBadgeEnabled() {
        return FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{InvestingHighlightsExperiment2.INSTANCE}, false, null, 6, null));
    }

    public final Flow<Boolean> isMonitorTabInternalExperimentEnabled() {
        return ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{InvestingMonitorInternalExperiment.INSTANCE}, false, null, 6, null);
    }
}
