package com.robinhood.android.cash.merchantrewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentMerchantrewardsWelcomeBinding implements ViewBinding {
    public final RdsButtonBarView bottomButtonBar;
    public final RhTextView rewardsOnboardingConfirmationDescription;
    public final ImageView rewardsOnboardingConfirmationIllustration;
    public final RhTextView rewardsOnboardingConfirmationTitle;
    public final ShimmerLoadingView rewardsOnboardingSplashLoading;
    private final ConstraintLayout rootView;

    private FragmentMerchantrewardsWelcomeBinding(ConstraintLayout constraintLayout, RdsButtonBarView rdsButtonBarView, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = constraintLayout;
        this.bottomButtonBar = rdsButtonBarView;
        this.rewardsOnboardingConfirmationDescription = rhTextView;
        this.rewardsOnboardingConfirmationIllustration = imageView;
        this.rewardsOnboardingConfirmationTitle = rhTextView2;
        this.rewardsOnboardingSplashLoading = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMerchantrewardsWelcomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMerchantrewardsWelcomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10127R.layout.fragment_merchantrewards_welcome, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMerchantrewardsWelcomeBinding bind(View view) {
        int i = C10127R.id.bottom_button_bar;
        RdsButtonBarView rdsButtonBarView = (RdsButtonBarView) ViewBindings.findChildViewById(view, i);
        if (rdsButtonBarView != null) {
            i = C10127R.id.rewards_onboarding_confirmation_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10127R.id.rewards_onboarding_confirmation_illustration;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C10127R.id.rewards_onboarding_confirmation_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C10127R.id.rewards_onboarding_splash_loading;
                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                        if (shimmerLoadingView != null) {
                            return new FragmentMerchantrewardsWelcomeBinding((ConstraintLayout) view, rdsButtonBarView, rhTextView, imageView, rhTextView2, shimmerLoadingView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
