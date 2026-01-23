package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.details.p092ui.GiftCardRowView;

/* loaded from: classes2.dex */
public final class IncludeCryptoGiftEditorGiftCardRowViewBinding implements ViewBinding {
    private final GiftCardRowView rootView;

    private IncludeCryptoGiftEditorGiftCardRowViewBinding(GiftCardRowView giftCardRowView) {
        this.rootView = giftCardRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public GiftCardRowView getRoot() {
        return this.rootView;
    }

    public static IncludeCryptoGiftEditorGiftCardRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCryptoGiftEditorGiftCardRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12906R.layout.include_crypto_gift_editor_gift_card_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCryptoGiftEditorGiftCardRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCryptoGiftEditorGiftCardRowViewBinding((GiftCardRowView) view);
    }
}
