package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.p200ui.NewsFeedEmbeddedArticleView;

/* loaded from: classes8.dex */
public final class IncludeNewsFeedEmbeddedArticleCardBinding implements ViewBinding {
    private final NewsFeedEmbeddedArticleView rootView;

    private IncludeNewsFeedEmbeddedArticleCardBinding(NewsFeedEmbeddedArticleView newsFeedEmbeddedArticleView) {
        this.rootView = newsFeedEmbeddedArticleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedEmbeddedArticleView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedEmbeddedArticleCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedEmbeddedArticleCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.include_news_feed_embedded_article_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedEmbeddedArticleCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedEmbeddedArticleCardBinding((NewsFeedEmbeddedArticleView) view);
    }
}
