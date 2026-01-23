package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.cash.rhy.tab.C10285R;

/* loaded from: classes7.dex */
public final class MergeRhyHeroAssetViewBinding implements ViewBinding {
    public final LottieAnimationView rhyHeroAssetAnimation;
    public final ImageView rhyHeroAssetImage;
    private final View rootView;

    private MergeRhyHeroAssetViewBinding(View view, LottieAnimationView lottieAnimationView, ImageView imageView) {
        this.rootView = view;
        this.rhyHeroAssetAnimation = lottieAnimationView;
        this.rhyHeroAssetImage = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhyHeroAssetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10285R.layout.merge_rhy_hero_asset_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhyHeroAssetViewBinding bind(View view) {
        int i = C10285R.id.rhy_hero_asset_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C10285R.id.rhy_hero_asset_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new MergeRhyHeroAssetViewBinding(view, lottieAnimationView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
