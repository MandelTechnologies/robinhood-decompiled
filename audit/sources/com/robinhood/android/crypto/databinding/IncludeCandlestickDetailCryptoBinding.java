package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.view.CandlestickDetailView;
import com.robinhood.android.crypto.C12757R;

/* loaded from: classes2.dex */
public final class IncludeCandlestickDetailCryptoBinding implements ViewBinding {
    private final CandlestickDetailView rootView;

    private IncludeCandlestickDetailCryptoBinding(CandlestickDetailView candlestickDetailView) {
        this.rootView = candlestickDetailView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CandlestickDetailView getRoot() {
        return this.rootView;
    }

    public static IncludeCandlestickDetailCryptoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCandlestickDetailCryptoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12757R.layout.include_candlestick_detail_crypto, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCandlestickDetailCryptoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCandlestickDetailCryptoBinding((CandlestickDetailView) view);
    }
}
