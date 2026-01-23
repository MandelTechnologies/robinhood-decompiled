package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;

/* loaded from: classes8.dex */
public final class MergeSdBannerBinding implements ViewBinding {
    public final ImageView bannerImage;
    public final RhTextView bannerSubtitle;
    public final RhTextView bannerTitle;
    private final View rootView;

    private MergeSdBannerBinding(View view, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.bannerImage = imageView;
        this.bannerSubtitle = rhTextView;
        this.bannerTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSdBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20335R.layout.merge_sd_banner, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSdBannerBinding bind(View view) {
        int i = C20335R.id.banner_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C20335R.id.banner_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C20335R.id.banner_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeSdBannerBinding(view, imageView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
