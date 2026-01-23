package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class FragmentNewsFeedVideoPlayerBinding implements ViewBinding {
    public final FragmentContainerView newsFeedLandscapeVideoPlayerView;
    public final FragmentContainerView newsFeedPortraitVideoPlayerView;
    private final ConstraintLayout rootView;

    private FragmentNewsFeedVideoPlayerBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = constraintLayout;
        this.newsFeedLandscapeVideoPlayerView = fragmentContainerView;
        this.newsFeedPortraitVideoPlayerView = fragmentContainerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNewsFeedVideoPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsFeedVideoPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.fragment_news_feed_video_player, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsFeedVideoPlayerBinding bind(View view) {
        return new FragmentNewsFeedVideoPlayerBinding((ConstraintLayout) view, (FragmentContainerView) ViewBindings.findChildViewById(view, C27909R.id.news_feed_landscape_video_player_view), (FragmentContainerView) ViewBindings.findChildViewById(view, C27909R.id.news_feed_portrait_video_player_view));
    }
}
