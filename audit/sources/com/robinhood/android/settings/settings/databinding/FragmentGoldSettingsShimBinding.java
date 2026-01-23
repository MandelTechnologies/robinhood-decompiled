package com.robinhood.android.settings.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.settings.settings.C28321R;

/* loaded from: classes5.dex */
public final class FragmentGoldSettingsShimBinding implements ViewBinding {
    private final ShimmerLoadingView rootView;
    public final ShimmerLoadingView shimmerLoadingView;

    private FragmentGoldSettingsShimBinding(ShimmerLoadingView shimmerLoadingView, ShimmerLoadingView shimmerLoadingView2) {
        this.rootView = shimmerLoadingView;
        this.shimmerLoadingView = shimmerLoadingView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentGoldSettingsShimBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGoldSettingsShimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28321R.layout.fragment_gold_settings_shim, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentGoldSettingsShimBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) view;
        return new FragmentGoldSettingsShimBinding(shimmerLoadingView, shimmerLoadingView);
    }
}
