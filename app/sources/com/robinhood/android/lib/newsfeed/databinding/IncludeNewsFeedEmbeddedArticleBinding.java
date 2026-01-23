package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEmbeddedArticleView;

/* loaded from: classes8.dex */
public final class IncludeNewsFeedEmbeddedArticleBinding implements ViewBinding {
    private final NewsFeedEmbeddedArticleView rootView;

    private IncludeNewsFeedEmbeddedArticleBinding(NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleView) {
        this.rootView = newsFeedEmbeddedArticleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedEmbeddedArticleView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedEmbeddedArticleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedEmbeddedArticleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.include_news_feed_embedded_article, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedEmbeddedArticleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedEmbeddedArticleBinding((NewsFeedEmbeddedArticleView) view);
    }
}
