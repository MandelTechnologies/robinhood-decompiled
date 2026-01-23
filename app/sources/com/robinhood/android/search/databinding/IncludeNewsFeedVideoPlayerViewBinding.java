package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.p014ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class IncludeNewsFeedVideoPlayerViewBinding implements ViewBinding {
    private final PlayerView rootView;

    private IncludeNewsFeedVideoPlayerViewBinding(PlayerView playerView) {
        this.rootView = playerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PlayerView getRoot() {
        return this.rootView;
    }

    public static IncludeNewsFeedVideoPlayerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeNewsFeedVideoPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_news_feed_video_player_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeNewsFeedVideoPlayerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeNewsFeedVideoPlayerViewBinding((PlayerView) view);
    }
}
