package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p014ui.DefaultTimeBar;
import androidx.media3.p014ui.R$id;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class VideoViewerExoPlayerControlViewBinding implements ViewBinding {
    public final RhTextView exoDuration;
    public final ImageView exoFfwd;
    public final ImageView exoPause;
    public final ImageView exoPlay;
    public final RhTextView exoPosition;
    public final DefaultTimeBar exoProgress;
    public final ImageView exoRew;
    private final ConstraintLayout rootView;

    private VideoViewerExoPlayerControlViewBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, ImageView imageView2, ImageView imageView3, RhTextView rhTextView2, DefaultTimeBar defaultTimeBar, ImageView imageView4) {
        this.rootView = constraintLayout;
        this.exoDuration = rhTextView;
        this.exoFfwd = imageView;
        this.exoPause = imageView2;
        this.exoPlay = imageView3;
        this.exoPosition = rhTextView2;
        this.exoProgress = defaultTimeBar;
        this.exoRew = imageView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static VideoViewerExoPlayerControlViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VideoViewerExoPlayerControlViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.video_viewer_exo_player_control_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static VideoViewerExoPlayerControlViewBinding bind(View view) {
        int i = R$id.exo_duration;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = R$id.exo_ffwd;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R$id.exo_pause;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R$id.exo_play;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R$id.exo_position;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = R$id.exo_progress;
                            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) ViewBindings.findChildViewById(view, i);
                            if (defaultTimeBar != null) {
                                i = R$id.exo_rew;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    return new VideoViewerExoPlayerControlViewBinding((ConstraintLayout) view, rhTextView, imageView, imageView2, imageView3, rhTextView2, defaultTimeBar, imageView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
