package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class IncludeRhyOverviewCarouselItemBinding implements ViewBinding {
    public final RdsTextButton rhyOverviewCarouselAction;
    public final LottieAnimationView rhyOverviewCarouselAnimation;
    public final Guideline rhyOverviewCarouselAssetGuideline;
    public final RdsIconButton rhyOverviewCarouselDismissIcon;
    public final ImageView rhyOverviewCarouselImage;
    public final RhTextView rhyOverviewCarouselMessage;
    public final RhTextView rhyOverviewCarouselMessageTitle;
    public final RdsInfoTag rhyOverviewCarouselTitle;
    private final ConstraintLayout rootView;

    private IncludeRhyOverviewCarouselItemBinding(ConstraintLayout constraintLayout, RdsTextButton rdsTextButton, LottieAnimationView lottieAnimationView, Guideline guideline, RdsIconButton rdsIconButton, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, RdsInfoTag rdsInfoTag) {
        this.rootView = constraintLayout;
        this.rhyOverviewCarouselAction = rdsTextButton;
        this.rhyOverviewCarouselAnimation = lottieAnimationView;
        this.rhyOverviewCarouselAssetGuideline = guideline;
        this.rhyOverviewCarouselDismissIcon = rdsIconButton;
        this.rhyOverviewCarouselImage = imageView;
        this.rhyOverviewCarouselMessage = rhTextView;
        this.rhyOverviewCarouselMessageTitle = rhTextView2;
        this.rhyOverviewCarouselTitle = rdsInfoTag;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRhyOverviewCarouselItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyOverviewCarouselItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.include_rhy_overview_carousel_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyOverviewCarouselItemBinding bind(View view) {
        int i = C10285R.id.rhy_overview_carousel_action;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C10285R.id.rhy_overview_carousel_animation;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C10285R.id.rhy_overview_carousel_asset_guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C10285R.id.rhy_overview_carousel_dismiss_icon;
                    RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                    if (rdsIconButton != null) {
                        i = C10285R.id.rhy_overview_carousel_image;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C10285R.id.rhy_overview_carousel_message;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C10285R.id.rhy_overview_carousel_message_title;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C10285R.id.rhy_overview_carousel_title;
                                    RdsInfoTag rdsInfoTag = (RdsInfoTag) ViewBindings.findChildViewById(view, i);
                                    if (rdsInfoTag != null) {
                                        return new IncludeRhyOverviewCarouselItemBinding((ConstraintLayout) view, rdsTextButton, lottieAnimationView, guideline, rdsIconButton, imageView, rhTextView, rhTextView2, rdsInfoTag);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
