package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.p200ui.NewsFeedArticleView;

/* loaded from: classes8.dex */
public final class IncludeNewsFeedArticleCardBinding implements ViewBinding {
    private final NewsFeedArticleView rootView;

    private IncludeNewsFeedArticleCardBinding(NewsFeedArticleView newsFeedArticleView) {
        this.rootView = newsFeedArticleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedArticleView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedArticleCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedArticleCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.include_news_feed_article_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedArticleCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedArticleCardBinding((NewsFeedArticleView) view);
    }
}
