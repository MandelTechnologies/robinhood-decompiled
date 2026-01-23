package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentPersonalDataLoadingBinding implements ViewBinding {
    public final ShimmerLoadingView detailsContentLoadingView;
    private final ShimmerLoadingView rootView;

    private FragmentPersonalDataLoadingBinding(ShimmerLoadingView shimmerLoadingView, ShimmerLoadingView shimmerLoadingView2) {
        this.rootView = shimmerLoadingView;
        this.detailsContentLoadingView = shimmerLoadingView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentPersonalDataLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPersonalDataLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_personal_data_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPersonalDataLoadingBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) view;
        return new FragmentPersonalDataLoadingBinding(shimmerLoadingView, shimmerLoadingView);
    }
}
