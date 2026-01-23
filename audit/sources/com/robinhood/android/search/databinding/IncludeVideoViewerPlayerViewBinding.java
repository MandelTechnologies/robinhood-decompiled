package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.p014ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class IncludeVideoViewerPlayerViewBinding implements ViewBinding {
    public final PlayerView newsFeedVideoPlayer;
    private final PlayerView rootView;

    private IncludeVideoViewerPlayerViewBinding(PlayerView playerView, PlayerView playerView2) {
        this.rootView = playerView;
        this.newsFeedVideoPlayer = playerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PlayerView getRoot() {
        return this.rootView;
    }

    public static IncludeVideoViewerPlayerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeVideoViewerPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_video_viewer_player_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeVideoViewerPlayerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PlayerView playerView = (PlayerView) view;
        return new IncludeVideoViewerPlayerViewBinding(playerView, playerView);
    }
}
