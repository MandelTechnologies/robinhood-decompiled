package com.robinhood.android.trade.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.options.C29757R;

/* loaded from: classes9.dex */
public final class IncludeOptionOrderToolbarBinding implements ViewBinding {
    public final RdsRippleContainerView actionOptionOrderTypes;
    public final RhTextView actionOptionOrderTypesTxt;
    public final FrameLayout optionOrderToolbarContent;
    public final ImageView optionOrderToolbarDiscoveryDot;
    private final FrameLayout rootView;

    private IncludeOptionOrderToolbarBinding(FrameLayout frameLayout, RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView, FrameLayout frameLayout2, ImageView imageView) {
        this.rootView = frameLayout;
        this.actionOptionOrderTypes = rdsRippleContainerView;
        this.actionOptionOrderTypesTxt = rhTextView;
        this.optionOrderToolbarContent = frameLayout2;
        this.optionOrderToolbarDiscoveryDot = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOptionOrderToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionOrderToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29757R.layout.include_option_order_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionOrderToolbarBinding bind(View view) {
        int i = C29757R.id.action_option_order_types;
        RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsRippleContainerView != null) {
            i = C29757R.id.action_option_order_types_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = C29757R.id.option_order_toolbar_discovery_dot;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new IncludeOptionOrderToolbarBinding(frameLayout, rdsRippleContainerView, rhTextView, frameLayout, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
