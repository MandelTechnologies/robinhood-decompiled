package com.robinhood.android.transfers.pathfinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.transfers.pathfinder.C30419R;

/* loaded from: classes9.dex */
public final class FragmentPathfinderTransferFundsBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ErrorView transferFundsErrorView;
    public final ShimmerLoadingView transferFundsLoadingView;

    private FragmentPathfinderTransferFundsBinding(ConstraintLayout constraintLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = constraintLayout;
        this.transferFundsErrorView = errorView;
        this.transferFundsLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPathfinderTransferFundsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPathfinderTransferFundsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30419R.layout.fragment_pathfinder_transfer_funds, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPathfinderTransferFundsBinding bind(View view) {
        int i = C30419R.id.transfer_funds_error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C30419R.id.transfer_funds_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentPathfinderTransferFundsBinding((ConstraintLayout) view, errorView, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
