package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdImageView;

/* loaded from: classes8.dex */
public final class IncludeSdImageBinding implements ViewBinding {
    private final SdImageView rootView;
    public final SdImageView sdImageView;

    private IncludeSdImageBinding(SdImageView sdImageView, SdImageView sdImageView2) {
        this.rootView = sdImageView;
        this.sdImageView = sdImageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdImageView getRoot() {
        return this.rootView;
    }

    public static IncludeSdImageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdImageBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdImageView sdImageView = (SdImageView) view;
        return new IncludeSdImageBinding(sdImageView, sdImageView);
    }
}
