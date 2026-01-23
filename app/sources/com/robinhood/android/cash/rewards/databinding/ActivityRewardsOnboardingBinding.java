package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;

/* loaded from: classes7.dex */
public final class ActivityRewardsOnboardingBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    private final FrameLayout rootView;

    private ActivityRewardsOnboardingBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRewardsOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRewardsOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.activity_rewards_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRewardsOnboardingBinding bind(View view) {
        int i = C10176R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            return new ActivityRewardsOnboardingBinding((FrameLayout) view, fragmentContainerLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
