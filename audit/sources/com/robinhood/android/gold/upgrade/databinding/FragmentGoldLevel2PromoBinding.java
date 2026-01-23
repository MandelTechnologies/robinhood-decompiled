package com.robinhood.android.gold.upgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.gold.upgrade.C18003R;

/* loaded from: classes10.dex */
public final class FragmentGoldLevel2PromoBinding implements ViewBinding {
    public final SparkleButton continueBtn;
    public final ShimmerLoadingView loadingView;
    public final ImageView previewImg;
    private final LinearLayout rootView;
    public final RhTextView summaryTxt;
    public final RhTextView titleTxt;

    private FragmentGoldLevel2PromoBinding(LinearLayout linearLayout, SparkleButton sparkleButton, ShimmerLoadingView shimmerLoadingView, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.continueBtn = sparkleButton;
        this.loadingView = shimmerLoadingView;
        this.previewImg = imageView;
        this.summaryTxt = rhTextView;
        this.titleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentGoldLevel2PromoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGoldLevel2PromoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18003R.layout.fragment_gold_level_2_promo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentGoldLevel2PromoBinding bind(View view) {
        int i = C18003R.id.continue_btn;
        SparkleButton sparkleButton = (SparkleButton) ViewBindings.findChildViewById(view, i);
        if (sparkleButton != null) {
            i = C18003R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C18003R.id.preview_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C18003R.id.summary_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C18003R.id.title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentGoldLevel2PromoBinding((LinearLayout) view, sparkleButton, shimmerLoadingView, imageView, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
