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
public final class FragmentRewardsOnboardingSetupBrokerageBinding implements ViewBinding {
    public final RdsButton rewardsOnboardingSetupBrokerageButton;
    public final RhTextView rewardsOnboardingSetupBrokerageDescription;
    public final ImageView rewardsOnboardingSetupBrokerageImage;
    public final RhTextView rewardsOnboardingSetupBrokerageTitle;
    private final ConstraintLayout rootView;

    private FragmentRewardsOnboardingSetupBrokerageBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.rewardsOnboardingSetupBrokerageButton = rdsButton;
        this.rewardsOnboardingSetupBrokerageDescription = rhTextView;
        this.rewardsOnboardingSetupBrokerageImage = imageView;
        this.rewardsOnboardingSetupBrokerageTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingSetupBrokerageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingSetupBrokerageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_setup_brokerage, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingSetupBrokerageBinding bind(View view) {
        int i = C10176R.id.rewards_onboarding_setup_brokerage_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10176R.id.rewards_onboarding_setup_brokerage_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10176R.id.rewards_onboarding_setup_brokerage_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C10176R.id.rewards_onboarding_setup_brokerage_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRewardsOnboardingSetupBrokerageBinding((ConstraintLayout) view, rdsButton, rhTextView, imageView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
