package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeCryptoGiftDisclaimerRowViewBinding implements ViewBinding {
    public final RhTextView disclaimerText;
    private final View rootView;

    private MergeCryptoGiftDisclaimerRowViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.disclaimerText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoGiftDisclaimerRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C12906R.layout.merge_crypto_gift_disclaimer_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoGiftDisclaimerRowViewBinding bind(View view) {
        int i = C12906R.id.disclaimer_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeCryptoGiftDisclaimerRowViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
