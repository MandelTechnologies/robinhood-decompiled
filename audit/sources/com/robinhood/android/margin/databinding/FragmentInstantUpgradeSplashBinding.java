package com.robinhood.android.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;

/* loaded from: classes8.dex */
public final class FragmentInstantUpgradeSplashBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final RhTextView descriptionTxt;
    public final RhTextView instantUpgradeTitle;
    public final ShimmerLoadingView loadingView;
    public final RdsButton positiveBtn;
    private final ConstraintLayout rootView;

    private FragmentInstantUpgradeSplashBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton) {
        this.rootView = constraintLayout;
        this.animationView = lottieAnimationView;
        this.descriptionTxt = rhTextView;
        this.instantUpgradeTitle = rhTextView2;
        this.loadingView = shimmerLoadingView;
        this.positiveBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInstantUpgradeSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInstantUpgradeSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20999R.layout.fragment_instant_upgrade_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInstantUpgradeSplashBinding bind(View view) {
        int i = C20999R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C20999R.id.description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C20999R.id.instant_upgrade_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C20999R.id.loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        i = C20999R.id.positive_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            return new FragmentInstantUpgradeSplashBinding((ConstraintLayout) view, lottieAnimationView, rhTextView, rhTextView2, shimmerLoadingView, rdsButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
