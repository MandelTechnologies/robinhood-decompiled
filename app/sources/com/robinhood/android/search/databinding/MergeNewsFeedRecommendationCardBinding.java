package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeNewsFeedRecommendationCardBinding implements ViewBinding {
    public final RhTextView cta;
    public final ImageView img;
    private final View rootView;
    public final RhTextView title;

    private MergeNewsFeedRecommendationCardBinding(View view, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2) {
        this.rootView = view;
        this.cta = rhTextView;
        this.img = imageView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedRecommendationCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_news_feed_recommendation_card, viewGroup);
        return bind(viewGroup);
    }

    public static MergeNewsFeedRecommendationCardBinding bind(View view) {
        int i = C27909R.id.cta;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27909R.id.title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeNewsFeedRecommendationCardBinding(view, rhTextView, imageView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
