package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class FragmentBaseOrderConfirmationBinding implements ViewBinding {
    public final FrameLayout contentRoot;
    public final FrameLayout orderConfirmationLayoutContainer;
    private final FrameLayout rootView;

    private FragmentBaseOrderConfirmationBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.contentRoot = frameLayout2;
        this.orderConfirmationLayoutContainer = frameLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBaseOrderConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBaseOrderConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.fragment_base_order_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBaseOrderConfirmationBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C20649R.id.order_confirmation_layout_container;
        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout2 != null) {
            return new FragmentBaseOrderConfirmationBinding(frameLayout, frameLayout, frameLayout2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
