package com.robinhood.android.directipo.allocation.clarity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;

/* loaded from: classes27.dex */
public final class MergeIpoLearningHubTitleSubtitleLottieSectionViewBinding implements ViewBinding {
    private final View rootView;
    public final LottieAnimationView sectionLottieAnimation;
    public final RhTextView sectionLottieSubtitle;
    public final RhTextView sectionLottieTitle;

    private MergeIpoLearningHubTitleSubtitleLottieSectionViewBinding(View view, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.sectionLottieAnimation = lottieAnimationView;
        this.sectionLottieSubtitle = rhTextView;
        this.sectionLottieTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoLearningHubTitleSubtitleLottieSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14172R.layout.merge_ipo_learning_hub_title_subtitle_lottie_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoLearningHubTitleSubtitleLottieSectionViewBinding bind(View view) {
        int i = C14172R.id.section_lottie_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C14172R.id.section_lottie_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14172R.id.section_lottie_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeIpoLearningHubTitleSubtitleLottieSectionViewBinding(view, lottieAnimationView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
