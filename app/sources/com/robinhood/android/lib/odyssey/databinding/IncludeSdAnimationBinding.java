package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdAnimationView;

/* loaded from: classes8.dex */
public final class IncludeSdAnimationBinding implements ViewBinding {
    private final SdAnimationView rootView;
    public final SdAnimationView sdAnimation;

    private IncludeSdAnimationBinding(SdAnimationView sdAnimationView, SdAnimationView sdAnimationView2) {
        this.rootView = sdAnimationView;
        this.sdAnimation = sdAnimationView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public SdAnimationView getRoot() {
        return this.rootView;
    }

    public static IncludeSdAnimationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSdAnimationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.include_sd_animation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSdAnimationBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SdAnimationView sdAnimationView = (SdAnimationView) view;
        return new IncludeSdAnimationBinding(sdAnimationView, sdAnimationView);
    }
}
