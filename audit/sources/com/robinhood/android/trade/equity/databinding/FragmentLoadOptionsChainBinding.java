package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class FragmentLoadOptionsChainBinding implements ViewBinding {
    private final ShimmerLoadingView rootView;

    private FragmentLoadOptionsChainBinding(ShimmerLoadingView shimmerLoadingView) {
        this.rootView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentLoadOptionsChainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoadOptionsChainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.fragment_load_options_chain, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLoadOptionsChainBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentLoadOptionsChainBinding((ShimmerLoadingView) view);
    }
}
