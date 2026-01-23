package com.stripe.android.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R$id;
import com.stripe.android.view.PaymentFlowViewPager;

/* loaded from: classes10.dex */
public final class StripePaymentFlowActivityBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final PaymentFlowViewPager shippingFlowViewpager;

    private StripePaymentFlowActivityBinding(FrameLayout frameLayout, PaymentFlowViewPager paymentFlowViewPager) {
        this.rootView = frameLayout;
        this.shippingFlowViewpager = paymentFlowViewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static StripePaymentFlowActivityBinding bind(View view) {
        int i = R$id.shipping_flow_viewpager;
        PaymentFlowViewPager paymentFlowViewPager = (PaymentFlowViewPager) ViewBindings.findChildViewById(view, i);
        if (paymentFlowViewPager != null) {
            return new StripePaymentFlowActivityBinding((FrameLayout) view, paymentFlowViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
