package com.robinhood.android.rhymigration.databinding;

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
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class FragmentRhyFeatureIntroBinding implements ViewBinding {
    public final Guideline rhyFeatureAnimationTopGuideline;
    public final LottieAnimationView rhyFeatureIntroAnimation;
    public final RhTextView rhyFeatureIntroDisclosure;
    public final RhTextView rhyFeatureIntroSubtitle;
    public final RhTextView rhyFeatureIntroTitle;
    public final RdsButton rhyFeaturePrimaryBtn;
    private final ConstraintLayout rootView;

    private FragmentRhyFeatureIntroBinding(ConstraintLayout constraintLayout, Guideline guideline, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsButton rdsButton) {
        this.rootView = constraintLayout;
        this.rhyFeatureAnimationTopGuideline = guideline;
        this.rhyFeatureIntroAnimation = lottieAnimationView;
        this.rhyFeatureIntroDisclosure = rhTextView;
        this.rhyFeatureIntroSubtitle = rhTextView2;
        this.rhyFeatureIntroTitle = rhTextView3;
        this.rhyFeaturePrimaryBtn = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyFeatureIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyFeatureIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.fragment_rhy_feature_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyFeatureIntroBinding bind(View view) {
        int i = C27577R.id.rhy_feature_animation_top_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C27577R.id.rhy_feature_intro_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C27577R.id.rhy_feature_intro_disclosure;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C27577R.id.rhy_feature_intro_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C27577R.id.rhy_feature_intro_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C27577R.id.rhy_feature_primary_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                return new FragmentRhyFeatureIntroBinding((ConstraintLayout) view, guideline, lottieAnimationView, rhTextView, rhTextView2, rhTextView3, rdsButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
