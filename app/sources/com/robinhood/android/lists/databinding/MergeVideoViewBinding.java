package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.video.VideoPlayerContainer;

/* loaded from: classes8.dex */
public final class MergeVideoViewBinding implements ViewBinding {
    private final View rootView;
    public final ImageView soundOffImg;
    public final ImageView soundOnImg;
    public final VideoPlayerContainer videoPlayerContainer;

    private MergeVideoViewBinding(View view, ImageView imageView, ImageView imageView2, VideoPlayerContainer videoPlayerContainer) {
        this.rootView = view;
        this.soundOffImg = imageView;
        this.soundOnImg = imageView2;
        this.videoPlayerContainer = videoPlayerContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeVideoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_video_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeVideoViewBinding bind(View view) {
        int i = C20839R.id.sound_off_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C20839R.id.sound_on_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C20839R.id.video_player_container;
                VideoPlayerContainer videoPlayerContainer = (VideoPlayerContainer) ViewBindings.findChildViewById(view, i);
                if (videoPlayerContainer != null) {
                    return new MergeVideoViewBinding(view, imageView, imageView2, videoPlayerContainer);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
