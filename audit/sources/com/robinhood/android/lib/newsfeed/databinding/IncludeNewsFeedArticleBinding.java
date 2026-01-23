package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.p200ui.NewsFeedArticleView;

/* loaded from: classes8.dex */
public final class IncludeNewsFeedArticleBinding implements ViewBinding {
    private final NewsFeedArticleView rootView;

    private IncludeNewsFeedArticleBinding(NewsFeedArticleView newsFeedArticleView) {
        this.rootView = newsFeedArticleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedArticleView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.include_news_feed_article, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedArticleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedArticleBinding((NewsFeedArticleView) view);
    }
}
