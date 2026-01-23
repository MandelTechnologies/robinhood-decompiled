package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedHeaderView;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedHeaderViewBinding implements ViewBinding {
    private final NewsFeedHeaderView rootView;

    private IncludeNewsFeedHeaderViewBinding(NewsFeedHeaderView newsFeedHeaderView) {
        this.rootView = newsFeedHeaderView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedHeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedHeaderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_header_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedHeaderViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedHeaderViewBinding((NewsFeedHeaderView) view);
    }
}
