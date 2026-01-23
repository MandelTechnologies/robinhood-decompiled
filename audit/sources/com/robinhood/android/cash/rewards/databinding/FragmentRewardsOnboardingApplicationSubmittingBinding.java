package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentRewardsOnboardingApplicationSubmittingBinding implements ViewBinding {
    public final LottieAnimationView rewardsOnboardingApplicationSubmittingAnimation;
    public final RhTextView rewardsOnboardingApplicationSubmittingSubtitle;
    public final RhTextView rewardsOnboardingApplicationSubmittingTitle;
    private final ConstraintLayout rootView;

    private FragmentRewardsOnboardingApplicationSubmittingBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.rewardsOnboardingApplicationSubmittingAnimation = lottieAnimationView;
        this.rewardsOnboardingApplicationSubmittingSubtitle = rhTextView;
        this.rewardsOnboardingApplicationSubmittingTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingApplicationSubmittingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingApplicationSubmittingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_application_submitting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingApplicationSubmittingBinding bind(View view) {
        int i = C10176R.id.rewards_onboarding_application_submitting_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C10176R.id.rewards_onboarding_application_submitting_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10176R.id.rewards_onboarding_application_submitting_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentRewardsOnboardingApplicationSubmittingBinding((ConstraintLayout) view, lottieAnimationView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
