package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedCarousel;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedCarouselBinding implements ViewBinding {
    private final NewsFeedCarousel rootView;

    private IncludeNewsFeedCarouselBinding(NewsFeedCarousel newsFeedCarousel) {
        this.rootView = newsFeedCarousel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedCarousel getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedCarouselBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedCarouselBinding((NewsFeedCarousel) view);
    }
}
