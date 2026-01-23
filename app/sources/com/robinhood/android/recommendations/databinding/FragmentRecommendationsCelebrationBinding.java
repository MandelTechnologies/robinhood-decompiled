package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsCelebrationBinding implements ViewBinding {
    public final RdsButton doneBtn;
    public final LottieAnimationView lottie;
    private final ConstraintLayout rootView;
    public final RhTextView subtitle;
    public final RhTextView title;
    public final Guideline verticalCenterGuideline;

    private FragmentRecommendationsCelebrationBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, Guideline guideline) {
        this.rootView = constraintLayout;
        this.doneBtn = rdsButton;
        this.lottie = lottieAnimationView;
        this.subtitle = rhTextView;
        this.title = rhTextView2;
        this.verticalCenterGuideline = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsCelebrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsCelebrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_celebration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsCelebrationBinding bind(View view) {
        int i = C25978R.id.done_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25978R.id.lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C25978R.id.subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C25978R.id.title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C25978R.id.vertical_center_guideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            return new FragmentRecommendationsCelebrationBinding((ConstraintLayout) view, rdsButton, lottieAnimationView, rhTextView, rhTextView2, guideline);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
