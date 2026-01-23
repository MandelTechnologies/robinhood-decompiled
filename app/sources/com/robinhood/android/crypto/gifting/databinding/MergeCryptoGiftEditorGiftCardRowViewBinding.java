package com.robinhood.android.crypto.gifting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeCryptoGiftEditorGiftCardRowViewBinding implements ViewBinding {
    public final RhTextView amountView;
    public final RhTextView currencyText;
    public final CardView giftCardView;
    public final ImageView giftIcon;
    public final ImageView imageView;
    private final View rootView;
    public final RhTextView signView;

    private MergeCryptoGiftEditorGiftCardRowViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, CardView cardView, ImageView imageView, ImageView imageView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.amountView = rhTextView;
        this.currencyText = rhTextView2;
        this.giftCardView = cardView;
        this.giftIcon = imageView;
        this.imageView = imageView2;
        this.signView = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCryptoGiftEditorGiftCardRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C12906R.layout.merge_crypto_gift_editor_gift_card_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCryptoGiftEditorGiftCardRowViewBinding bind(View view) {
        int i = C12906R.id.amount_view;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C12906R.id.currency_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C12906R.id.gift_card_view;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = C12906R.id.gift_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C12906R.id.image_view;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C12906R.id.sign_view;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new MergeCryptoGiftEditorGiftCardRowViewBinding(view, rhTextView, rhTextView2, cardView, imageView, imageView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
