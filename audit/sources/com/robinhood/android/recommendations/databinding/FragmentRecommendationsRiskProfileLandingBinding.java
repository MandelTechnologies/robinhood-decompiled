package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsRiskProfileLandingBinding implements ViewBinding {
    public final View background;
    public final RdsButton continueBtn;
    public final MotionLayout motionLayout;
    public final RhTextView riskLoadingText;
    private final MotionLayout rootView;
    public final LottieAnimationView sharedElementLottie;

    private FragmentRecommendationsRiskProfileLandingBinding(MotionLayout motionLayout, View view, RdsButton rdsButton, MotionLayout motionLayout2, RhTextView rhTextView, LottieAnimationView lottieAnimationView) {
        this.rootView = motionLayout;
        this.background = view;
        this.continueBtn = rdsButton;
        this.motionLayout = motionLayout2;
        this.riskLoadingText = rhTextView;
        this.sharedElementLottie = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MotionLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsRiskProfileLandingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsRiskProfileLandingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_risk_profile_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsRiskProfileLandingBinding bind(View view) {
        int i = C25978R.id.background;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C25978R.id.continue_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                MotionLayout motionLayout = (MotionLayout) view;
                i = C25978R.id.risk_loading_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C25978R.id.shared_element_lottie;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        return new FragmentRecommendationsRiskProfileLandingBinding(motionLayout, viewFindChildViewById, rdsButton, motionLayout, rhTextView, lottieAnimationView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
