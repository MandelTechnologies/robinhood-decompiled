package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.ipo.video.VideoContainerView;

/* loaded from: classes8.dex */
public final class MergeCuratedListIpoAccessVideoSectionViewBinding implements ViewBinding {
    private final View rootView;
    public final VideoContainerView videoContainerView;

    private MergeCuratedListIpoAccessVideoSectionViewBinding(View view, VideoContainerView videoContainerView) {
        this.rootView = view;
        this.videoContainerView = videoContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCuratedListIpoAccessVideoSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_curated_list_ipo_access_video_section_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCuratedListIpoAccessVideoSectionViewBinding bind(View view) {
        int i = C20839R.id.video_container_view;
        VideoContainerView videoContainerView = (VideoContainerView) ViewBindings.findChildViewById(view, i);
        if (videoContainerView != null) {
            return new MergeCuratedListIpoAccessVideoSectionViewBinding(view, videoContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
