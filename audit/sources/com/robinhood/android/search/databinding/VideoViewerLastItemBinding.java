package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class VideoViewerLastItemBinding implements ViewBinding {
    private final LinearLayout rootView;

    private VideoViewerLastItemBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static VideoViewerLastItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VideoViewerLastItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.video_viewer_last_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static VideoViewerLastItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new VideoViewerLastItemBinding((LinearLayout) view);
    }
}
