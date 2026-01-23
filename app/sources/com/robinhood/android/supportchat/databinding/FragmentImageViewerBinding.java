package com.robinhood.android.supportchat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.supportchat.C29104R;

/* loaded from: classes9.dex */
public final class FragmentImageViewerBinding implements ViewBinding {
    public final ErrorView imageError;
    public final ShimmerLoadingView imageLoadingView;
    public final ImageView imageView;
    private final FrameLayout rootView;

    private FragmentImageViewerBinding(FrameLayout frameLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView, ImageView imageView) {
        this.rootView = frameLayout;
        this.imageError = errorView;
        this.imageLoadingView = shimmerLoadingView;
        this.imageView = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentImageViewerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentImageViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29104R.layout.fragment_image_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentImageViewerBinding bind(View view) {
        int i = C29104R.id.image_error;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C29104R.id.image_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C29104R.id.image_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new FragmentImageViewerBinding((FrameLayout) view, errorView, shimmerLoadingView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
