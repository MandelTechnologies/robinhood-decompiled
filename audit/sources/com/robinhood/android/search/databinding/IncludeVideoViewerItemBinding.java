package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoViewerItemView;

/* loaded from: classes5.dex */
public final class IncludeVideoViewerItemBinding implements ViewBinding {
    private final NewsFeedVideoViewerItemView rootView;

    private IncludeVideoViewerItemBinding(NewsFeedVideoViewerItemView newsFeedVideoViewerItemView) {
        this.rootView = newsFeedVideoViewerItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NewsFeedVideoViewerItemView getRoot() {
        return this.rootView;
    }

    public static IncludeVideoViewerItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeVideoViewerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_video_viewer_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeVideoViewerItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeVideoViewerItemBinding((NewsFeedVideoViewerItemView) view);
    }
}
