package com.robinhood.shared.stepupverification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.shared.stepupverification.C39791R;

/* loaded from: classes6.dex */
public final class FragmentLoadingWithErrorViewBinding implements ViewBinding {
    public final ErrorView errorView;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;

    private FragmentLoadingWithErrorViewBinding(FrameLayout frameLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.errorView = errorView;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoadingWithErrorViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoadingWithErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39791R.layout.fragment_loading_with_error_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLoadingWithErrorViewBinding bind(View view) {
        int i = C39791R.id.error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C39791R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentLoadingWithErrorViewBinding((FrameLayout) view, errorView, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
