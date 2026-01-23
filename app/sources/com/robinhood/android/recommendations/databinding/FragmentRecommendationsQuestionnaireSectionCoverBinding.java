package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;

/* loaded from: classes11.dex */
public final class FragmentRecommendationsQuestionnaireSectionCoverBinding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RhTextView description;
    public final RhTextView disclosure;
    public final LottieAnimationView lottieView;
    public final ImageView podiumStatic;
    private final ConstraintLayout rootView;
    public final RhTextView title;

    private FragmentRecommendationsQuestionnaireSectionCoverBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, ImageView imageView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.continueBtn = rdsButton;
        this.description = rhTextView;
        this.disclosure = rhTextView2;
        this.lottieView = lottieAnimationView;
        this.podiumStatic = imageView;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsQuestionnaireSectionCoverBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecommendationsQuestionnaireSectionCoverBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.fragment_recommendations_questionnaire_section_cover, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecommendationsQuestionnaireSectionCoverBinding bind(View view) {
        int i = C25978R.id.continueBtn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25978R.id.description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25978R.id.disclosure;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C25978R.id.lottie_view;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C25978R.id.podium_static;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C25978R.id.title;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentRecommendationsQuestionnaireSectionCoverBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2, lottieAnimationView, imageView, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
