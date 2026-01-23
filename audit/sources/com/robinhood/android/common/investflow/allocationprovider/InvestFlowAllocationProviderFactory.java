package com.robinhood.android.common.investflow.allocationprovider;

import com.robinhood.android.common.investflow.allocationprovider.percent.InvestFlowPercentAllocationProvider;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowPercentAllocationStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowAllocationProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProviderFactory;", "", "percentAllocationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowPercentAllocationStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowPercentAllocationStore;)V", "createProvider", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProvider;", "strategy", "Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "feature-lib-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InvestFlowAllocationProviderFactory {
    private final InvestFlowPercentAllocationStore percentAllocationStore;

    public InvestFlowAllocationProviderFactory(InvestFlowPercentAllocationStore percentAllocationStore) {
        Intrinsics.checkNotNullParameter(percentAllocationStore, "percentAllocationStore");
        this.percentAllocationStore = percentAllocationStore;
    }

    public final InvestFlowAllocationProvider createProvider(AllocationStrategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        if (strategy instanceof AllocationStrategy.EqualSplit) {
            return new InvestFlowEqualSplitAllocationProvider();
        }
        if (strategy instanceof AllocationStrategy.PercentSplit) {
            return new InvestFlowPercentAllocationProvider(((AllocationStrategy.PercentSplit) strategy).getAssetWeights(), this.percentAllocationStore);
        }
        if (!(strategy instanceof AllocationStrategy.ZeroDefault)) {
            throw new NoWhenBranchMatchedException();
        }
        return new InvestFlowZeroDefaultProvider();
    }
}
