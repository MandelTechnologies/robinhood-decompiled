package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.p014ui.AspectRatioFrameLayout;
import androidx.media3.p014ui.R$id;
import androidx.media3.p014ui.SubtitleView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class VideoViewerExoPlayerViewBinding implements ViewBinding {
    public final FrameLayout exoAdOverlay;
    public final ImageView exoArtwork;
    public final RdsProgressBar exoBuffering;
    public final AspectRatioFrameLayout exoContentFrame;
    public final View exoControllerPlaceholder;
    public final RhTextView exoErrorMessage;
    public final ImageView exoFullscreenBtn;
    public final FrameLayout exoOverlay;
    public final View exoShutter;
    public final SubtitleView exoSubtitles;
    public final ImageView playerPreviewImg;
    private final View rootView;

    private VideoViewerExoPlayerViewBinding(View view, FrameLayout frameLayout, ImageView imageView, RdsProgressBar rdsProgressBar, AspectRatioFrameLayout aspectRatioFrameLayout, View view2, RhTextView rhTextView, ImageView imageView2, FrameLayout frameLayout2, View view3, SubtitleView subtitleView, ImageView imageView3) {
        this.rootView = view;
        this.exoAdOverlay = frameLayout;
        this.exoArtwork = imageView;
        this.exoBuffering = rdsProgressBar;
        this.exoContentFrame = aspectRatioFrameLayout;
        this.exoControllerPlaceholder = view2;
        this.exoErrorMessage = rhTextView;
        this.exoFullscreenBtn = imageView2;
        this.exoOverlay = frameLayout2;
        this.exoShutter = view3;
        this.exoSubtitles = subtitleView;
        this.playerPreviewImg = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static VideoViewerExoPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.video_viewer_exo_player_view, viewGroup);
        return bind(viewGroup);
    }

    public static VideoViewerExoPlayerViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.exo_ad_overlay;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R$id.exo_artwork;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27909R.id.exo_buffering;
                RdsProgressBar rdsProgressBar = (RdsProgressBar) ViewBindings.findChildViewById(view, i);
                if (rdsProgressBar != null) {
                    i = R$id.exo_content_frame;
                    AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) ViewBindings.findChildViewById(view, i);
                    if (aspectRatioFrameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.exo_controller_placeholder))) != null) {
                        i = R$id.exo_error_message;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C27909R.id.exo_fullscreen_btn;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R$id.exo_overlay;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.exo_shutter))) != null) {
                                    i = R$id.exo_subtitles;
                                    SubtitleView subtitleView = (SubtitleView) ViewBindings.findChildViewById(view, i);
                                    if (subtitleView != null) {
                                        i = C27909R.id.player_preview_img;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            return new VideoViewerExoPlayerViewBinding(view, frameLayout, imageView, rdsProgressBar, aspectRatioFrameLayout, viewFindChildViewById, rhTextView, imageView2, frameLayout2, viewFindChildViewById2, subtitleView, imageView3);
                                        }
                                    }
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
