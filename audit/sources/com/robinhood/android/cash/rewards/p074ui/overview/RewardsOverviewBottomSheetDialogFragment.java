package com.robinhood.android.cash.rewards.p074ui.overview;

import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOverviewBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\t\u0010\b\u001a\u00020\tH\u0096\u0001R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/RewardsOverviewBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onPrimaryButtonClicked", "", "onSecondaryButtonClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOverviewBottomSheetDialogFragment extends RhBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

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

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onPrimaryButtonClicked() {
        dismiss();
        ActivityResultCaller activityResultCallerRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(activityResultCallerRequireParentFragment, "requireParentFragment(...)");
        if (activityResultCallerRequireParentFragment instanceof RhBottomSheetDialogFragment.OnClickListener) {
            ((RhBottomSheetDialogFragment.OnClickListener) activityResultCallerRequireParentFragment).onPrimaryButtonClicked(getDialogId(), getPassthroughArgs());
        }
    }

    @Override // com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment
    protected void onSecondaryButtonClicked() {
        dismiss();
        ActivityResultCaller activityResultCallerRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(activityResultCallerRequireParentFragment, "requireParentFragment(...)");
        if (activityResultCallerRequireParentFragment instanceof RhBottomSheetDialogFragment.OnClickListener) {
            ((RhBottomSheetDialogFragment.OnClickListener) activityResultCallerRequireParentFragment).onSecondaryButtonClicked(getDialogId(), getPassthroughArgs());
        }
    }

    /* compiled from: RewardsOverviewBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/RewardsOverviewBottomSheetDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/overview/RewardsOverviewBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$Args;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsOverviewBottomSheetDialogFragment, RhBottomSheetDialogFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RhBottomSheetDialogFragment.Args getArgs(RewardsOverviewBottomSheetDialogFragment rewardsOverviewBottomSheetDialogFragment) {
            return (RhBottomSheetDialogFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsOverviewBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsOverviewBottomSheetDialogFragment newInstance(RhBottomSheetDialogFragment.Args args) {
            return (RewardsOverviewBottomSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsOverviewBottomSheetDialogFragment rewardsOverviewBottomSheetDialogFragment, RhBottomSheetDialogFragment.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsOverviewBottomSheetDialogFragment, args);
        }
    }
}
