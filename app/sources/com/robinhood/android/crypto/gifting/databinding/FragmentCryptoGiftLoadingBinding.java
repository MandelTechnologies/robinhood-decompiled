package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.crypto.gifting.C12906R;

/* loaded from: classes2.dex */
public final class FragmentCryptoGiftLoadingBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    private final ShimmerLoadingView rootView;

    private FragmentCryptoGiftLoadingBinding(ShimmerLoadingView shimmerLoadingView, ShimmerLoadingView shimmerLoadingView2) {
        this.rootView = shimmerLoadingView;
        this.loadingView = shimmerLoadingView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ShimmerLoadingView getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoGiftLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoGiftLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.fragment_crypto_gift_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoGiftLoadingBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) view;
        return new FragmentCryptoGiftLoadingBinding(shimmerLoadingView, shimmerLoadingView);
    }
}
