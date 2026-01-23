package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class FragmentCryptoOrderConfirmationBinding implements ViewBinding {
    public final FrameLayout contentRoot;
    public final ComposeView loadingView;
    public final ComposeView orderConfirmationLayoutContainer;
    private final FrameLayout rootView;

    private FragmentCryptoOrderConfirmationBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ComposeView composeView, ComposeView composeView2) {
        this.rootView = frameLayout;
        this.contentRoot = frameLayout2;
        this.loadingView = composeView;
        this.orderConfirmationLayoutContainer = composeView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCryptoOrderConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCryptoOrderConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.fragment_crypto_order_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCryptoOrderConfirmationBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C40095R.id.loading_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C40095R.id.order_confirmation_layout_container;
            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView2 != null) {
                return new FragmentCryptoOrderConfirmationBinding(frameLayout, frameLayout, composeView, composeView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
