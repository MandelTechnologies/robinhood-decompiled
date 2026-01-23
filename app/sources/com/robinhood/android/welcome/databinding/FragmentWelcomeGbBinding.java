package com.robinhood.android.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.welcome.C31456R;

/* loaded from: classes9.dex */
public final class FragmentWelcomeGbBinding implements ViewBinding {
    public final ConstraintLayout buttonContainer;
    private final ConstraintLayout rootView;
    public final DotIndicators welcomeDotIndicators;
    public final RdsButton welcomeLoginBtn;
    public final RdsButton welcomeSignupBtn;
    public final ViewPager2 welcomeViewPager;

    private FragmentWelcomeGbBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DotIndicators dotIndicators, RdsButton rdsButton, RdsButton rdsButton2, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.buttonContainer = constraintLayout2;
        this.welcomeDotIndicators = dotIndicators;
        this.welcomeLoginBtn = rdsButton;
        this.welcomeSignupBtn = rdsButton2;
        this.welcomeViewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWelcomeGbBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWelcomeGbBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31456R.layout.fragment_welcome_gb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWelcomeGbBinding bind(View view) {
        int i = C31456R.id.button_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C31456R.id.welcome_dot_indicators;
            DotIndicators dotIndicators = (DotIndicators) ViewBindings.findChildViewById(view, i);
            if (dotIndicators != null) {
                i = C31456R.id.welcome_login_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C31456R.id.welcome_signup_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C31456R.id.welcome_view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            return new FragmentWelcomeGbBinding((ConstraintLayout) view, constraintLayout, dotIndicators, rdsButton, rdsButton2, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
