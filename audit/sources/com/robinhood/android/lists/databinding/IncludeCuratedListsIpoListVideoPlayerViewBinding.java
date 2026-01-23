package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.p014ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeCuratedListsIpoListVideoPlayerViewBinding implements ViewBinding {
    private final PlayerView rootView;

    private IncludeCuratedListsIpoListVideoPlayerViewBinding(PlayerView playerView) {
        this.rootView = playerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PlayerView getRoot() {
        return this.rootView;
    }

    public static IncludeCuratedListsIpoListVideoPlayerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCuratedListsIpoListVideoPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_curated_lists_ipo_list_video_player_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCuratedListsIpoListVideoPlayerViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCuratedListsIpoListVideoPlayerViewBinding((PlayerView) view);
    }
}
