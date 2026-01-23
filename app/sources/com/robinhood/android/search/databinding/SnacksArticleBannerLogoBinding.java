package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class SnacksArticleBannerLogoBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final ImageView snacksArticleLogoImg;

    private SnacksArticleBannerLogoBinding(FrameLayout frameLayout, ImageView imageView) {
        this.rootView = frameLayout;
        this.snacksArticleLogoImg = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static SnacksArticleBannerLogoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SnacksArticleBannerLogoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.snacks_article_banner_logo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SnacksArticleBannerLogoBinding bind(View view) {
        int i = C27909R.id.snacks_article_logo_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new SnacksArticleBannerLogoBinding((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
