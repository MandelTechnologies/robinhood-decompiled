package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.details.p092ui.MessageRowView;

/* loaded from: classes2.dex */
public final class IncludeCryptoGiftDetailsMessageRowViewBinding implements ViewBinding {
    private final MessageRowView rootView;

    private IncludeCryptoGiftDetailsMessageRowViewBinding(MessageRowView messageRowView) {
        this.rootView = messageRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MessageRowView getRoot() {
        return this.rootView;
    }

    public static IncludeCryptoGiftDetailsMessageRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCryptoGiftDetailsMessageRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.include_crypto_gift_details_message_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCryptoGiftDetailsMessageRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCryptoGiftDetailsMessageRowViewBinding((MessageRowView) view);
    }
}
