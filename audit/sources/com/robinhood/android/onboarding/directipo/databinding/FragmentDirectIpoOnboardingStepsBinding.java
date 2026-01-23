package com.robinhood.android.onboarding.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.onboarding.directipo.C22750R;

/* loaded from: classes10.dex */
public final class FragmentDirectIpoOnboardingStepsBinding implements ViewBinding {
    public final RdsButton directIpoOnboardingStepsContinue;
    public final RdsProgressBar directIpoOnboardingStepsProgressBar;
    public final ViewPager2 directIpoOnboardingStepsViewPager;
    private final ConstraintLayout rootView;

    private FragmentDirectIpoOnboardingStepsBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsProgressBar rdsProgressBar, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.directIpoOnboardingStepsContinue = rdsButton;
        this.directIpoOnboardingStepsProgressBar = rdsProgressBar;
        this.directIpoOnboardingStepsViewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoOnboardingStepsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoOnboardingStepsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22750R.layout.fragment_direct_ipo_onboarding_steps, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoOnboardingStepsBinding bind(View view) {
        int i = C22750R.id.direct_ipo_onboarding_steps_continue;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C22750R.id.direct_ipo_onboarding_steps_progress_bar;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C22750R.id.direct_ipo_onboarding_steps_view_pager;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new FragmentDirectIpoOnboardingStepsBinding((ConstraintLayout) view, rdsButton, rdsProgressBar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
