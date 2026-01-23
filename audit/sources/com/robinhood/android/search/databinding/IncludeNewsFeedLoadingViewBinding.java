package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedLoadingView;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedLoadingViewBinding implements ViewBinding {
    private final NewsFeedLoadingView rootView;

    private IncludeNewsFeedLoadingViewBinding(NewsFeedLoadingView newsFeedLoadingView) {
        this.rootView = newsFeedLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedLoadingView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedLoadingViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedLoadingViewBinding((NewsFeedLoadingView) view);
    }
}
