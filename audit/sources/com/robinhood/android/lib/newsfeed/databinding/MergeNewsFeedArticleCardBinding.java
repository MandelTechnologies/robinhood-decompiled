package com.robinhood.android.lib.newsfeed.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.newsfeed.C20334R;

/* loaded from: classes8.dex */
public final class MergeNewsFeedArticleCardBinding implements ViewBinding {
    private final CardView rootView;

    private MergeNewsFeedArticleCardBinding(CardView cardView) {
        this.rootView = cardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedArticleCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedArticleCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20334R.layout.merge_news_feed_article_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedArticleCardBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new MergeNewsFeedArticleCardBinding((CardView) view);
    }
}
