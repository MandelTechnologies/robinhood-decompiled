package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;

/* loaded from: classes11.dex */
public final class FragmentPaycheckRecurringInvestmentsDdOnboardingShimBinding implements ViewBinding {
    private final ShimmerLoadingView rootView;

    private FragmentPaycheckRecurringInvestmentsDdOnboardingShimBinding(ShimmerLoadingView shimmerLoadingView) {
        this.rootView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentPaycheckRecurringInvestmentsDdOnboardingShimBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaycheckRecurringInvestmentsDdOnboardingShimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26245R.layout.fragment_paycheck_recurring_investments_dd_onboarding_shim, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPaycheckRecurringInvestmentsDdOnboardingShimBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentPaycheckRecurringInvestmentsDdOnboardingShimBinding((ShimmerLoadingView) view);
    }
}
