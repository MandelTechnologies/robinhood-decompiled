package com.robinhood.android.safetylabels.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.safetylabels.C27803R;

/* loaded from: classes5.dex */
public final class MergeSafetyLabelSlidesViewBinding implements ViewBinding {
    public final Group assetBorderGroup;
    public final View assetBottomBorder;
    public final View assetTopBorder;
    public final Barrier assetsBottomBarrier;
    public final Guideline centerGuideline;
    public final RhTextView firstLabel;
    public final LottieAnimationView firstSlideAnimation;
    private final View rootView;
    public final RhTextView secondLabel;
    public final LottieAnimationView secondSlideAnimation;
    public final ImageView slideImg;
    public final RhTextView titleTxt;

    private MergeSafetyLabelSlidesViewBinding(View view, Group group, View view2, View view3, Barrier barrier, Guideline guideline, RhTextView rhTextView, LottieAnimationView lottieAnimationView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView2, ImageView imageView, RhTextView rhTextView3) {
        this.rootView = view;
        this.assetBorderGroup = group;
        this.assetBottomBorder = view2;
        this.assetTopBorder = view3;
        this.assetsBottomBarrier = barrier;
        this.centerGuideline = guideline;
        this.firstLabel = rhTextView;
        this.firstSlideAnimation = lottieAnimationView;
        this.secondLabel = rhTextView2;
        this.secondSlideAnimation = lottieAnimationView2;
        this.slideImg = imageView;
        this.titleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSafetyLabelSlidesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27803R.layout.merge_safety_label_slides_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSafetyLabelSlidesViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C27803R.id.asset_border_group;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27803R.id.asset_bottom_border))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C27803R.id.asset_top_border))) != null) {
            i = C27803R.id.assets_bottom_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C27803R.id.center_guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C27803R.id.first_label;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C27803R.id.first_slide_animation;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C27803R.id.second_label;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C27803R.id.second_slide_animation;
                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                if (lottieAnimationView2 != null) {
                                    i = C27803R.id.slide_img;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C27803R.id.title_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            return new MergeSafetyLabelSlidesViewBinding(view, group, viewFindChildViewById, viewFindChildViewById2, barrier, guideline, rhTextView, lottieAnimationView, rhTextView2, lottieAnimationView2, imageView, rhTextView3);
                                        }
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
