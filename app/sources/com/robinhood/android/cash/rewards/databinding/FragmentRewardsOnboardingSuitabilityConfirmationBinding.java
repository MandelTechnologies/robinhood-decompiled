package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOnboardingSuitabilityConfirmationBinding implements ViewBinding {
    public final RdsButton rewardsOnboardingAccountApprovedDoneButton;
    public final FocusSafeNestedScrollView rewardsOnboardingSignUpScrollView;
    public final RhTextView rewardsOnboardingSuitabilityConfirmationSubtitle;
    public final RhTextView rewardsOnboardingSuitabilityConfirmationTitle;
    private final LinearLayout rootView;

    private FragmentRewardsOnboardingSuitabilityConfirmationBinding(LinearLayout linearLayout, RdsButton rdsButton, FocusSafeNestedScrollView focusSafeNestedScrollView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.rewardsOnboardingAccountApprovedDoneButton = rdsButton;
        this.rewardsOnboardingSignUpScrollView = focusSafeNestedScrollView;
        this.rewardsOnboardingSuitabilityConfirmationSubtitle = rhTextView;
        this.rewardsOnboardingSuitabilityConfirmationTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingSuitabilityConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingSuitabilityConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_suitability_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingSuitabilityConfirmationBinding bind(View view) {
        int i = C10176R.id.rewards_onboarding_account_approved_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10176R.id.rewards_onboarding_sign_up_scroll_view;
            FocusSafeNestedScrollView focusSafeNestedScrollView = (FocusSafeNestedScrollView) ViewBindings.findChildViewById(view, i);
            if (focusSafeNestedScrollView != null) {
                i = C10176R.id.rewards_onboarding_suitability_confirmation_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10176R.id.rewards_onboarding_suitability_confirmation_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRewardsOnboardingSuitabilityConfirmationBinding((LinearLayout) view, rdsButton, focusSafeNestedScrollView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
