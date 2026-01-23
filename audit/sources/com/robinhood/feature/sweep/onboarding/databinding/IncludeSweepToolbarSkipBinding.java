package com.robinhood.feature.sweep.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.feature.sweep.onboarding.C33184R;

/* loaded from: classes15.dex */
public final class IncludeSweepToolbarSkipBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsRippleContainerView sweepOnboardingSkip;
    public final RhTextView sweepOnboardingSkipTxt;
    public final ConstraintLayout sweepOnboardingToolbarContent;

    private IncludeSweepToolbarSkipBinding(ConstraintLayout constraintLayout, RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.sweepOnboardingSkip = rdsRippleContainerView;
        this.sweepOnboardingSkipTxt = rhTextView;
        this.sweepOnboardingToolbarContent = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeSweepToolbarSkipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSweepToolbarSkipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C33184R.layout.include_sweep_toolbar_skip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSweepToolbarSkipBinding bind(View view) {
        int i = C33184R.id.sweep_onboarding_skip;
        RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsRippleContainerView != null) {
            i = C33184R.id.sweep_onboarding_skip_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new IncludeSweepToolbarSkipBinding(constraintLayout, rdsRippleContainerView, rhTextView, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
