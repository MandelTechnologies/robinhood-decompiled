package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.directipo.allocation.C14171R;

/* loaded from: classes27.dex */
public final class IncludeDirectIpoNotAllocatedHeaderImageBinding implements ViewBinding {
    private final ImageView rootView;

    private IncludeDirectIpoNotAllocatedHeaderImageBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoNotAllocatedHeaderImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoNotAllocatedHeaderImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.include_direct_ipo_not_allocated_header_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoNotAllocatedHeaderImageBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoNotAllocatedHeaderImageBinding((ImageView) view);
    }
}
