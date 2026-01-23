package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentDetailShimBinding implements ViewBinding {
    public final ShimmerLoadingView detailShimLoadingView;
    public final FragmentContainerLayout fragmentContainer;
    private final FrameLayout rootView;

    private FragmentDetailShimBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, FragmentContainerLayout fragmentContainerLayout) {
        this.rootView = frameLayout;
        this.detailShimLoadingView = shimmerLoadingView;
        this.fragmentContainer = fragmentContainerLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDetailShimBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDetailShimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_detail_shim, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDetailShimBinding bind(View view) {
        int i = C18359R.id.detail_shim_loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C18359R.id.fragment_container;
            FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerLayout != null) {
                return new FragmentDetailShimBinding((FrameLayout) view, shimmerLoadingView, fragmentContainerLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
