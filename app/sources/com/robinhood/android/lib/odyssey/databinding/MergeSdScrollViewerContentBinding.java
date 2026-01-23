package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdScrollViewerContainer;

/* loaded from: classes8.dex */
public final class MergeSdScrollViewerContentBinding implements ViewBinding {
    private final View rootView;
    public final SdScrollViewerContainer sdScrollViewerContentContainer;

    private MergeSdScrollViewerContentBinding(View view, SdScrollViewerContainer sdScrollViewerContainer) {
        this.rootView = view;
        this.sdScrollViewerContentContainer = sdScrollViewerContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSdScrollViewerContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20335R.layout.merge_sd_scroll_viewer_content, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSdScrollViewerContentBinding bind(View view) {
        int i = C20335R.id.sd_scroll_viewer_content_container;
        SdScrollViewerContainer sdScrollViewerContainer = (SdScrollViewerContainer) ViewBindings.findChildViewById(view, i);
        if (sdScrollViewerContainer != null) {
            return new MergeSdScrollViewerContentBinding(view, sdScrollViewerContainer);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
