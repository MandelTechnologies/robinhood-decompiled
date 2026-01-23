package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.NewsFeedRecommendationsCard;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedRecommendationCardBinding implements ViewBinding {
    private final NewsFeedRecommendationsCard rootView;

    private IncludeNewsFeedRecommendationCardBinding(NewsFeedRecommendationsCard newsFeedRecommendationsCard) {
        this.rootView = newsFeedRecommendationsCard;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedRecommendationsCard getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedRecommendationCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedRecommendationCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_recommendation_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedRecommendationCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedRecommendationCardBinding((NewsFeedRecommendationsCard) view);
    }
}
