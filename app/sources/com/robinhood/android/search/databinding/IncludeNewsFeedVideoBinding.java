package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedVideoBinding implements ViewBinding {
    private final NewsFeedVideoView rootView;

    private IncludeNewsFeedVideoBinding(NewsFeedVideoView newsFeedVideoView) {
        this.rootView = newsFeedVideoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedVideoView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedVideoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_video, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedVideoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedVideoBinding((NewsFeedVideoView) view);
    }
}
