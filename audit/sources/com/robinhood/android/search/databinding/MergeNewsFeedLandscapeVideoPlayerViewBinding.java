package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.video.VideoPlayerContainer;

/* loaded from: classes5.dex */
public final class MergeNewsFeedLandscapeVideoPlayerViewBinding implements ViewBinding {
    public final ErrorView newsFeedVideoLandscapeErrorRetryView;
    public final VideoPlayerContainer newsFeedVideoLandscapePlayerContainer;
    public final RdsProgressBar newsFeedVideoLandscapeProgressBar;
    private final ConstraintLayout rootView;

    private MergeNewsFeedLandscapeVideoPlayerViewBinding(ConstraintLayout constraintLayout, ErrorView errorView, VideoPlayerContainer videoPlayerContainer, RdsProgressBar rdsProgressBar) {
        this.rootView = constraintLayout;
        this.newsFeedVideoLandscapeErrorRetryView = errorView;
        this.newsFeedVideoLandscapePlayerContainer = videoPlayerContainer;
        this.newsFeedVideoLandscapeProgressBar = rdsProgressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeNewsFeedLandscapeVideoPlayerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeNewsFeedLandscapeVideoPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.merge_news_feed_landscape_video_player_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeNewsFeedLandscapeVideoPlayerViewBinding bind(View view) {
        int i = C27909R.id.news_feed_video_landscape_error_retry_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C27909R.id.news_feed_video_landscape_player_container;
            VideoPlayerContainer videoPlayerContainer = (VideoPlayerContainer) ViewBindings.findChildViewById(view, i);
            if (videoPlayerContainer != null) {
                i = C27909R.id.news_feed_video_landscape_progress_bar;
                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                if (rdsProgressBar != null) {
                    return new MergeNewsFeedLandscapeVideoPlayerViewBinding((ConstraintLayout) view, errorView, videoPlayerContainer, rdsProgressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
