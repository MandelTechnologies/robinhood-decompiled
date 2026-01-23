package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEducationCarouselView;

/* loaded from: classes8.dex */
public final class IncludeNewsFeedEducationCarouselViewBinding implements ViewBinding {
    private final NewsFeedEducationCarouselView rootView;

    private IncludeNewsFeedEducationCarouselViewBinding(NewsFeedEducationCarouselView newsFeedEducationCarouselView) {
        this.rootView = newsFeedEducationCarouselView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedEducationCarouselView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedEducationCarouselViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedEducationCarouselViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.include_news_feed_education_carousel_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedEducationCarouselViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedEducationCarouselViewBinding((NewsFeedEducationCarouselView) view);
    }
}
