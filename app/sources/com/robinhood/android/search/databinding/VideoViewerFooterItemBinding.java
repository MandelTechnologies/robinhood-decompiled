package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class VideoViewerFooterItemBinding implements ViewBinding {
    private final LinearLayout rootView;

    private VideoViewerFooterItemBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static VideoViewerFooterItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VideoViewerFooterItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.video_viewer_footer_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static VideoViewerFooterItemBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new VideoViewerFooterItemBinding((LinearLayout) view);
    }
}
