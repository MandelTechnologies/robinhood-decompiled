package com.robinhood.shared.trade.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.trade.crypto.C40095R;

/* loaded from: classes12.dex */
public final class IncludeCryptoOrderToolbarBinding implements ViewBinding {
    public final RdsRippleContainerView actionOrderTypes;
    public final RhTextView actionOrderTypesTxt;
    public final FrameLayout cryptoOrderToolbarContent;
    public final RhTextView reviewOrderTextView;
    private final FrameLayout rootView;

    private IncludeCryptoOrderToolbarBinding(FrameLayout frameLayout, RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView, FrameLayout frameLayout2, RhTextView rhTextView2) {
        this.rootView = frameLayout;
        this.actionOrderTypes = rdsRippleContainerView;
        this.actionOrderTypesTxt = rhTextView;
        this.cryptoOrderToolbarContent = frameLayout2;
        this.reviewOrderTextView = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeCryptoOrderToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCryptoOrderToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C40095R.layout.include_crypto_order_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCryptoOrderToolbarBinding bind(View view) {
        int i = C40095R.id.action_order_types;
        RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsRippleContainerView != null) {
            i = C40095R.id.action_order_types_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = C40095R.id.review_order_text_view;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new IncludeCryptoOrderToolbarBinding(frameLayout, rdsRippleContainerView, rhTextView, frameLayout, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
