package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOnboardingConfirmationBinding implements ViewBinding {
    public final RdsButton dismissButton;
    public final LottieAnimationView rewardsOnboardingConfirmationAnimation;
    public final RhTextView rewardsOnboardingConfirmationDescription;
    public final RhTextView rewardsOnboardingConfirmationTitle;
    private final ConstraintLayout rootView;

    private FragmentRewardsOnboardingConfirmationBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.dismissButton = rdsButton;
        this.rewardsOnboardingConfirmationAnimation = lottieAnimationView;
        this.rewardsOnboardingConfirmationDescription = rhTextView;
        this.rewardsOnboardingConfirmationTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingConfirmationBinding bind(View view) {
        int i = C10176R.id.dismiss_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10176R.id.rewards_onboarding_confirmation_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C10176R.id.rewards_onboarding_confirmation_description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10176R.id.rewards_onboarding_confirmation_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRewardsOnboardingConfirmationBinding((ConstraintLayout) view, rdsButton, lottieAnimationView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
