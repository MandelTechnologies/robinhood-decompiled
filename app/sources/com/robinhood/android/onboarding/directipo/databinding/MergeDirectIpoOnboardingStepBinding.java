package com.robinhood.android.onboarding.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.onboarding.directipo.C22750R;

/* loaded from: classes10.dex */
public final class MergeDirectIpoOnboardingStepBinding implements ViewBinding {
    public final LottieAnimationView directIpoOnboardingStepAnimation;
    public final Guideline directIpoOnboardingStepBottomGuideline;
    public final RhTextView directIpoOnboardingStepDescription;
    public final RhTextView directIpoOnboardingStepTitle;
    public final Guideline directIpoOnboardingStepTopGuideline;
    private final ConstraintLayout rootView;

    private MergeDirectIpoOnboardingStepBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, Guideline guideline, RhTextView rhTextView, RhTextView rhTextView2, Guideline guideline2) {
        this.rootView = constraintLayout;
        this.directIpoOnboardingStepAnimation = lottieAnimationView;
        this.directIpoOnboardingStepBottomGuideline = guideline;
        this.directIpoOnboardingStepDescription = rhTextView;
        this.directIpoOnboardingStepTitle = rhTextView2;
        this.directIpoOnboardingStepTopGuideline = guideline2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeDirectIpoOnboardingStepBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeDirectIpoOnboardingStepBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22750R.layout.merge_direct_ipo_onboarding_step, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeDirectIpoOnboardingStepBinding bind(View view) {
        int i = C22750R.id.direct_ipo_onboarding_step_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C22750R.id.direct_ipo_onboarding_step_bottom_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = C22750R.id.direct_ipo_onboarding_step_description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C22750R.id.direct_ipo_onboarding_step_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C22750R.id.direct_ipo_onboarding_step_top_guideline;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline2 != null) {
                            return new MergeDirectIpoOnboardingStepBinding((ConstraintLayout) view, lottieAnimationView, guideline, rhTextView, rhTextView2, guideline2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
