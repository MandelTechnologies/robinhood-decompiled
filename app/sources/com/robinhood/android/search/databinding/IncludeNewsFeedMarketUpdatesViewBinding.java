package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketUpdatesView;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedMarketUpdatesViewBinding implements ViewBinding {
    private final NewsFeedMarketUpdatesView rootView;

    private IncludeNewsFeedMarketUpdatesViewBinding(NewsFeedMarketUpdatesView newsFeedMarketUpdatesView) {
        this.rootView = newsFeedMarketUpdatesView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedMarketUpdatesView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedMarketUpdatesViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedMarketUpdatesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_market_updates_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedMarketUpdatesViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedMarketUpdatesViewBinding((NewsFeedMarketUpdatesView) view);
    }
}
