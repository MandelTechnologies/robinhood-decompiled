package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class FragmentNewsFeedPortraitVideoPlayerBinding implements ViewBinding {
    public final ErrorView newsFeedVideoErrorRetryView;
    public final RdsProgressBar newsFeedVideoProgressBar;
    public final RecyclerView newsFeedVideoRecyclerView;
    private final ConstraintLayout rootView;

    private FragmentNewsFeedPortraitVideoPlayerBinding(ConstraintLayout constraintLayout, ErrorView errorView, RdsProgressBar rdsProgressBar, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.newsFeedVideoErrorRetryView = errorView;
        this.newsFeedVideoProgressBar = rdsProgressBar;
        this.newsFeedVideoRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewsFeedPortraitVideoPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsFeedPortraitVideoPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_news_feed_portrait_video_player, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsFeedPortraitVideoPlayerBinding bind(View view) {
        int i = C27909R.id.news_feed_video_error_retry_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C27909R.id.news_feed_video_progress_bar;
            RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
            if (rdsProgressBar != null) {
                i = C27909R.id.news_feed_video_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new FragmentNewsFeedPortraitVideoPlayerBinding((ConstraintLayout) view, errorView, rdsProgressBar, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
