package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.productmarketing.RhyProductMarketingView;
import com.robinhood.android.designsystem.button.RdsButton;

/* loaded from: classes7.dex */
public final class FragmentRhyOnboardingIntroBinding implements ViewBinding {
    public final FrameLayout onboardingIntroBottomPanel;
    public final RdsButton onboardingIntroContinue;
    public final RhyProductMarketingView onboardingIntroMarketing;
    private final ConstraintLayout rootView;

    private FragmentRhyOnboardingIntroBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, RdsButton rdsButton, RhyProductMarketingView rhyProductMarketingView) {
        this.rootView = constraintLayout;
        this.onboardingIntroBottomPanel = frameLayout;
        this.onboardingIntroContinue = rdsButton;
        this.onboardingIntroMarketing = rhyProductMarketingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyOnboardingIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyOnboardingIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.fragment_rhy_onboarding_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyOnboardingIntroBinding bind(View view) {
        int i = C10285R.id.onboarding_intro_bottom_panel;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C10285R.id.onboarding_intro_continue;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10285R.id.onboarding_intro_marketing;
                RhyProductMarketingView rhyProductMarketingView = (RhyProductMarketingView) ViewBindings.findChildViewById(view, i);
                if (rhyProductMarketingView != null) {
                    return new FragmentRhyOnboardingIntroBinding((ConstraintLayout) view, frameLayout, rdsButton, rhyProductMarketingView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
