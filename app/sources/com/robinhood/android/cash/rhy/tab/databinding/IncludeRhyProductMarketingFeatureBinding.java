package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class IncludeRhyProductMarketingFeatureBinding implements ViewBinding {
    public final ImageView featureImage;
    public final RhTextView featureSubtitle;
    public final RhTextView featureTitle;
    private final LinearLayout rootView;

    private IncludeRhyProductMarketingFeatureBinding(LinearLayout linearLayout, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.featureImage = imageView;
        this.featureSubtitle = rhTextView;
        this.featureTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeRhyProductMarketingFeatureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRhyProductMarketingFeatureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.include_rhy_product_marketing_feature, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRhyProductMarketingFeatureBinding bind(View view) {
        int i = C10285R.id.feature_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C10285R.id.feature_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C10285R.id.feature_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new IncludeRhyProductMarketingFeatureBinding((LinearLayout) view, imageView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
