package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOnboardingAccountApprovedBinding implements ViewBinding {
    public final RdsButton rewardsOnboardingAccountApprovedDoneButton;
    public final ImageView rewardsOnboardingAccountApprovedIllustration;
    public final RhTextView rewardsOnboardingAccountApprovedMessage;
    public final RhTextView rewardsOnboardingAccountApprovedTitle;
    private final ConstraintLayout rootView;

    private FragmentRewardsOnboardingAccountApprovedBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.rewardsOnboardingAccountApprovedDoneButton = rdsButton;
        this.rewardsOnboardingAccountApprovedIllustration = imageView;
        this.rewardsOnboardingAccountApprovedMessage = rhTextView;
        this.rewardsOnboardingAccountApprovedTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingAccountApprovedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingAccountApprovedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_account_approved, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingAccountApprovedBinding bind(View view) {
        int i = C10176R.id.rewards_onboarding_account_approved_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10176R.id.rewards_onboarding_account_approved_illustration;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C10176R.id.rewards_onboarding_account_approved_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10176R.id.rewards_onboarding_account_approved_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRewardsOnboardingAccountApprovedBinding((ConstraintLayout) view, rdsButton, imageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
