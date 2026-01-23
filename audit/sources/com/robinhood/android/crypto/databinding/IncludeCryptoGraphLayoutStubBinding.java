package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.view.CryptoHistoricalGraphLayout;

/* loaded from: classes2.dex */
public final class IncludeCryptoGraphLayoutStubBinding implements ViewBinding {
    private final CryptoHistoricalGraphLayout rootView;

    private IncludeCryptoGraphLayoutStubBinding(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout) {
        this.rootView = cryptoHistoricalGraphLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CryptoHistoricalGraphLayout getRoot() {
        return this.rootView;
    }

    public static IncludeCryptoGraphLayoutStubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCryptoGraphLayoutStubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12757R.layout.include_crypto_graph_layout_stub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCryptoGraphLayoutStubBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCryptoGraphLayoutStubBinding((CryptoHistoricalGraphLayout) view);
    }
}
