package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;

/* loaded from: classes10.dex */
public final class StripeAddPaymentMethodRowBinding implements ViewBinding {
    public final AppCompatTextView label;
    private final LinearLayout rootView;

    private StripeAddPaymentMethodRowBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.label = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static StripeAddPaymentMethodRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.stripe_add_payment_method_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeAddPaymentMethodRowBinding bind(View view) {
        int i = R$id.label;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            return new StripeAddPaymentMethodRowBinding((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
