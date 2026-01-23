package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes9.dex */
public final class FragmentWelcomeRebrandBinding implements ViewBinding {
    public final ConstraintLayout buttonContainer;
    public final LottieAnimationView maxWelcomeAnimationView;
    public final DotIndicators maxWelcomeDotIndicators;
    public final RdsButton maxWelcomeLoginBtn;
    public final RdsButton maxWelcomeSignupBtn;
    public final ViewPager2 maxWelcomeViewPager;
    private final ConstraintLayout rootView;

    private FragmentWelcomeRebrandBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LottieAnimationView lottieAnimationView, DotIndicators dotIndicators, RdsButton rdsButton, RdsButton rdsButton2, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.buttonContainer = constraintLayout2;
        this.maxWelcomeAnimationView = lottieAnimationView;
        this.maxWelcomeDotIndicators = dotIndicators;
        this.maxWelcomeLoginBtn = rdsButton;
        this.maxWelcomeSignupBtn = rdsButton2;
        this.maxWelcomeViewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeRebrandBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeRebrandBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome_rebrand, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeRebrandBinding bind(View view) {
        int i = C31456R.id.button_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31456R.id.max_welcome_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C31456R.id.max_welcome_dot_indicators;
                DotIndicators dotIndicators = (DotIndicators) ViewBindings.findChildViewById(view, i);
                if (dotIndicators != null) {
                    i = C31456R.id.max_welcome_login_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C31456R.id.max_welcome_signup_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C31456R.id.max_welcome_view_pager;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                return new FragmentWelcomeRebrandBinding((ConstraintLayout) view, constraintLayout, lottieAnimationView, dotIndicators, rdsButton, rdsButton2, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
