package com.robinhood.android.rhyonboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhyonboarding.C27634R;

/* loaded from: classes5.dex */
public final class FragmentRhyPostAccountOpenSubmittingBinding implements ViewBinding {
    public final LottieAnimationView rewardsOnboardingApplicationSubmittingAnimation;
    public final RhTextView rewardsOnboardingApplicationSubmittingSubtitle;
    public final RhTextView rewardsOnboardingApplicationSubmittingTitle;
    private final ConstraintLayout rootView;

    private FragmentRhyPostAccountOpenSubmittingBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.rewardsOnboardingApplicationSubmittingAnimation = lottieAnimationView;
        this.rewardsOnboardingApplicationSubmittingSubtitle = rhTextView;
        this.rewardsOnboardingApplicationSubmittingTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyPostAccountOpenSubmittingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyPostAccountOpenSubmittingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27634R.layout.fragment_rhy_post_account_open_submitting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyPostAccountOpenSubmittingBinding bind(View view) {
        int i = C27634R.id.rewards_onboarding_application_submitting_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C27634R.id.rewards_onboarding_application_submitting_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C27634R.id.rewards_onboarding_application_submitting_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentRhyPostAccountOpenSubmittingBinding((ConstraintLayout) view, lottieAnimationView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
