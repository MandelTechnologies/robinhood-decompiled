package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.view.MaskedCardView;

/* loaded from: classes10.dex */
public final class StripeMaskedCardRowBinding implements ViewBinding {
    public final MaskedCardView maskedCardItem;
    private final FrameLayout rootView;

    private StripeMaskedCardRowBinding(FrameLayout frameLayout, MaskedCardView maskedCardView) {
        this.rootView = frameLayout;
        this.maskedCardItem = maskedCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static StripeMaskedCardRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.stripe_masked_card_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeMaskedCardRowBinding bind(View view) {
        int i = R$id.masked_card_item;
        MaskedCardView maskedCardView = (MaskedCardView) ViewBindings.findChildViewById(view, i);
        if (maskedCardView != null) {
            return new StripeMaskedCardRowBinding((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
