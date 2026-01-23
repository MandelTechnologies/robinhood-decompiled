package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentOrderDetailBinding implements ViewBinding {
    public final View legacyContainer;
    public final ShimmerLoadingView loadingView;
    public final FrameLayout orderDetailLayout;
    private final FrameLayout rootView;
    public final IncludeOrderDetailViewServerDrivenBinding serverDrivenContainer;

    private FragmentOrderDetailBinding(FrameLayout frameLayout, View view, ShimmerLoadingView shimmerLoadingView, FrameLayout frameLayout2, IncludeOrderDetailViewServerDrivenBinding includeOrderDetailViewServerDrivenBinding) {
        this.rootView = frameLayout;
        this.legacyContainer = view;
        this.loadingView = shimmerLoadingView;
        this.orderDetailLayout = frameLayout2;
        this.serverDrivenContainer = includeOrderDetailViewServerDrivenBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOrderDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOrderDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_order_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOrderDetailBinding bind(View view) {
        int i = C18359R.id.legacy_container;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C18359R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = C18359R.id.server_driven_container;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById2 != null) {
                    return new FragmentOrderDetailBinding(frameLayout, viewFindChildViewById, shimmerLoadingView, frameLayout, IncludeOrderDetailViewServerDrivenBinding.bind(viewFindChildViewById2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
