package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.view.ShippingInfoWidget;

/* loaded from: classes10.dex */
public final class StripeShippingInfoPageBinding implements ViewBinding {
    private final ScrollView rootView;
    public final ShippingInfoWidget shippingInfoWidget;

    private StripeShippingInfoPageBinding(ScrollView scrollView, ShippingInfoWidget shippingInfoWidget) {
        this.rootView = scrollView;
        this.shippingInfoWidget = shippingInfoWidget;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static StripeShippingInfoPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.stripe_shipping_info_page, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static StripeShippingInfoPageBinding bind(View view) {
        int i = R$id.shipping_info_widget;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) ViewBindings.findChildViewById(view, i);
        if (shippingInfoWidget != null) {
            return new StripeShippingInfoPageBinding((ScrollView) view, shippingInfoWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
