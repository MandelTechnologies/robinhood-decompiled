package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.details.p092ui.DisclaimerRowView;

/* loaded from: classes2.dex */
public final class IncludeCryptoGiftDisclaimerRowViewBinding implements ViewBinding {
    private final DisclaimerRowView rootView;

    private IncludeCryptoGiftDisclaimerRowViewBinding(DisclaimerRowView disclaimerRowView) {
        this.rootView = disclaimerRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public DisclaimerRowView getRoot() {
        return this.rootView;
    }

    public static IncludeCryptoGiftDisclaimerRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCryptoGiftDisclaimerRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.include_crypto_gift_disclaimer_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCryptoGiftDisclaimerRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCryptoGiftDisclaimerRowViewBinding((DisclaimerRowView) view);
    }
}
