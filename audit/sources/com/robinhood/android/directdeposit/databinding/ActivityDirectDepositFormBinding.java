package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class ActivityDirectDepositFormBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final ShimmerLoadingView rootView;

    private ActivityDirectDepositFormBinding(ShimmerLoadingView shimmerLoadingView, ShimmerLoadingView shimmerLoadingView2) {
        this.rootView = shimmerLoadingView;
        this.loadingView = shimmerLoadingView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static ActivityDirectDepositFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDirectDepositFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.activity_direct_deposit_form, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDirectDepositFormBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) view;
        return new ActivityDirectDepositFormBinding(shimmerLoadingView, shimmerLoadingView);
    }
}
