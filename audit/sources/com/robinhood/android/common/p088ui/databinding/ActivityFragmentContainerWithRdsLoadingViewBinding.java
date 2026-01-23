package com.robinhood.android.common.p088ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;

/* loaded from: classes2.dex */
public final class ActivityFragmentContainerWithRdsLoadingViewBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    public final ShimmerLoadingView rdsLoadingView;
    private final FrameLayout rootView;

    private ActivityFragmentContainerWithRdsLoadingViewBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerLayout;
        this.rdsLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFragmentContainerWithRdsLoadingViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFragmentContainerWithRdsLoadingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11839R.layout.activity_fragment_container_with_rds_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityFragmentContainerWithRdsLoadingViewBinding bind(View view) {
        int i = C11839R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            i = C11839R.id.rds_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new ActivityFragmentContainerWithRdsLoadingViewBinding((FrameLayout) view, fragmentContainerLayout, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
