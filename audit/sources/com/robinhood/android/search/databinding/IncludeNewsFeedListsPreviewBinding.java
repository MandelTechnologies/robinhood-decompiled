package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.view.NewsFeedListsPreview;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedListsPreviewBinding implements ViewBinding {
    private final NewsFeedListsPreview rootView;

    private IncludeNewsFeedListsPreviewBinding(NewsFeedListsPreview newsFeedListsPreview) {
        this.rootView = newsFeedListsPreview;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedListsPreview getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedListsPreviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedListsPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_lists_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedListsPreviewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedListsPreviewBinding((NewsFeedListsPreview) view);
    }
}
