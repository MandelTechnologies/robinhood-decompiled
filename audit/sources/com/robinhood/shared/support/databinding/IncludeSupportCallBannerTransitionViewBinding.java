package com.robinhood.shared.support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.shared.support.C39996R;

/* loaded from: classes6.dex */
public final class IncludeSupportCallBannerTransitionViewBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final FrameLayout supportCallBannerTransitionView;

    private IncludeSupportCallBannerTransitionViewBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.supportCallBannerTransitionView = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeSupportCallBannerTransitionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSupportCallBannerTransitionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39996R.layout.include_support_call_banner_transition_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSupportCallBannerTransitionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new IncludeSupportCallBannerTransitionViewBinding(frameLayout, frameLayout);
    }
}
