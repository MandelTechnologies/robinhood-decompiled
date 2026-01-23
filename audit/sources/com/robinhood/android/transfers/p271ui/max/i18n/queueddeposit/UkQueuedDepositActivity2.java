package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.UkQueuedDeposit;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"configureToolbarForOnboarding", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositActivityKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositActivity2 {
    public static final void configureToolbarForOnboarding(BaseFragment baseFragment, RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        OnboardingProgress onboardingProgress = OnboardingProgress.FUND_ACCOUNT_DEPOSIT;
        Integer numValueOf = Integer.valueOf(C30065R.string.uk_queued_deposit_toolbar_title);
        UkQueuedDepositActivity.Companion companion = UkQueuedDepositActivity.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositActivity");
        ToolbarExt2.configureMaxFragment(toolbar, onboardingProgress, numValueOf, ((UkQueuedDeposit) companion.getExtras(fragmentActivityRequireActivity)).isFromRhfOnboarding());
    }
}
