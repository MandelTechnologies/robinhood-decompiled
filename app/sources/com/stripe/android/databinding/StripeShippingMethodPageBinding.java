package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.view.SelectShippingMethodWidget;

/* loaded from: classes10.dex */
public final class StripeShippingMethodPageBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final SelectShippingMethodWidget selectShippingMethodWidget;

    private StripeShippingMethodPageBinding(FrameLayout frameLayout, SelectShippingMethodWidget selectShippingMethodWidget) {
        this.rootView = frameLayout;
        this.selectShippingMethodWidget = selectShippingMethodWidget;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static StripeShippingMethodPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.stripe_shipping_method_page, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeShippingMethodPageBinding bind(View view) {
        int i = R$id.select_shipping_method_widget;
        SelectShippingMethodWidget selectShippingMethodWidget = (SelectShippingMethodWidget) ViewBindings.findChildViewById(view, i);
        if (selectShippingMethodWidget != null) {
            return new StripeShippingMethodPageBinding((FrameLayout) view, selectShippingMethodWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
