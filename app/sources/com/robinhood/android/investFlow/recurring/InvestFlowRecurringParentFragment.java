package com.robinhood.android.investFlow.recurring;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment;
import com.robinhood.android.navigation.app.keys.data.RecurringOrderAmountArgs;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowRecurringParentFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ParentFragmentCallbacks;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAmountSelected", "investmentScheduleId", "Ljava/util/UUID;", "initialAmount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "targetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "onAmountSelectionComplete", "investmentScheduleAmount", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowRecurringParentFragment extends BaseFragment implements RegionGated, InvestFlowRecurringFragment.ParentFragmentCallbacks, RecurringOrderAmountFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InvestFlowRecurringParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE, RecurringInvestmentRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C19349R.id.fragment_container, InvestFlowRecurringFragment.INSTANCE.newInstance(INSTANCE.getArgs((Fragment) this)));
        }
    }

    @Override // com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment.ParentFragmentCallbacks
    public void onAmountSelected(UUID investmentScheduleId, InvestmentScheduleAmount initialAmount, ApiAssetType targetType) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        replaceFragment(RecurringOrderAmountFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderAmountArgs(investmentScheduleId, initialAmount, null, targetType, false, true, 4, null)));
    }

    @Override // com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment.Callbacks
    public void onAmountSelectionComplete(InvestmentScheduleAmount investmentScheduleAmount) {
        Intrinsics.checkNotNullParameter(investmentScheduleAmount, "investmentScheduleAmount");
        popLastFragment();
        Companion companion = INSTANCE;
        ((InvestFlowRecurringArgs) companion.getArgs((Fragment) this)).setTotalAmount(investmentScheduleAmount.getDollarAmount());
        setFragment(C19349R.id.fragment_container, InvestFlowRecurringFragment.INSTANCE.newInstance(companion.getArgs((Fragment) this)));
    }

    /* compiled from: InvestFlowRecurringParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringParentFragment;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowRecurringParentFragment, InvestFlowRecurringArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowRecurringArgs getArgs(InvestFlowRecurringParentFragment investFlowRecurringParentFragment) {
            return (InvestFlowRecurringArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowRecurringParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowRecurringParentFragment newInstance(InvestFlowRecurringArgs investFlowRecurringArgs) {
            return (InvestFlowRecurringParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowRecurringArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowRecurringParentFragment investFlowRecurringParentFragment, InvestFlowRecurringArgs investFlowRecurringArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowRecurringParentFragment, investFlowRecurringArgs);
        }
    }
}
