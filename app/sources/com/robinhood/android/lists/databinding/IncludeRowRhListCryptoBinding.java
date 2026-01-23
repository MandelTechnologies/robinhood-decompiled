package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.views.crypto.CryptoRowView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class IncludeRowRhListCryptoBinding implements ViewBinding {
    private final CryptoRowView rootView;

    private IncludeRowRhListCryptoBinding(CryptoRowView cryptoRowView) {
        this.rootView = cryptoRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CryptoRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRowRhListCryptoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRowRhListCryptoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_row_rh_list_crypto, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRowRhListCryptoBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRowRhListCryptoBinding((CryptoRowView) view);
    }
}
