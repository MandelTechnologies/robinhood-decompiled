package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubLottieSectionViewBinding implements ViewBinding {
    private final View rootView;
    public final LottieAnimationView sectionLottieAnimation;

    private MergeIpoLearningHubLottieSectionViewBinding(View view, LottieAnimationView lottieAnimationView) {
        this.rootView = view;
        this.sectionLottieAnimation = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubLottieSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_lottie_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubLottieSectionViewBinding bind(View view) {
        int i = C14172R.id.section_lottie_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            return new MergeIpoLearningHubLottieSectionViewBinding(view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
