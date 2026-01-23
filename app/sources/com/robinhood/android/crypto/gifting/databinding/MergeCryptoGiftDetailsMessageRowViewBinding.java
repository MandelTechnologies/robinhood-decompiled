package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeCryptoGiftDetailsMessageRowViewBinding implements ViewBinding {
    public final RhTextView messageView;
    private final View rootView;

    private MergeCryptoGiftDetailsMessageRowViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.messageView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoGiftDetailsMessageRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C12906R.layout.merge_crypto_gift_details_message_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoGiftDetailsMessageRowViewBinding bind(View view) {
        int i = C12906R.id.message_view;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeCryptoGiftDetailsMessageRowViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
