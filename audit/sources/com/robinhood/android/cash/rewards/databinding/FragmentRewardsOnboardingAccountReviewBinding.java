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
public final class FragmentRewardsOnboardingAccountReviewBinding implements ViewBinding {
    public final RdsButton rewardsOnboardingAccountReviewDoneButton;
    public final ImageView rewardsOnboardingAccountReviewIllustration;
    public final RhTextView rewardsOnboardingAccountReviewMessage;
    public final RhTextView rewardsOnboardingAccountReviewTitle;
    private final ConstraintLayout rootView;

    private FragmentRewardsOnboardingAccountReviewBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.rewardsOnboardingAccountReviewDoneButton = rdsButton;
        this.rewardsOnboardingAccountReviewIllustration = imageView;
        this.rewardsOnboardingAccountReviewMessage = rhTextView;
        this.rewardsOnboardingAccountReviewTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardsOnboardingAccountReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRewardsOnboardingAccountReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.fragment_rewards_onboarding_account_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRewardsOnboardingAccountReviewBinding bind(View view) {
        int i = C10176R.id.rewards_onboarding_account_review_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10176R.id.rewards_onboarding_account_review_illustration;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C10176R.id.rewards_onboarding_account_review_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10176R.id.rewards_onboarding_account_review_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentRewardsOnboardingAccountReviewBinding((ConstraintLayout) view, rdsButton, imageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
