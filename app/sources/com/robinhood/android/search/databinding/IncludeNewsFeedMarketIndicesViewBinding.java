package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesView;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedMarketIndicesViewBinding implements ViewBinding {
    private final NewsFeedMarketIndicesView rootView;

    private IncludeNewsFeedMarketIndicesViewBinding(NewsFeedMarketIndicesView newsFeedMarketIndicesView) {
        this.rootView = newsFeedMarketIndicesView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedMarketIndicesView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedMarketIndicesViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedMarketIndicesViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_market_indices_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedMarketIndicesViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedMarketIndicesViewBinding((NewsFeedMarketIndicesView) view);
    }
}
