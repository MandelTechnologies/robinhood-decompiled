package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class IncludeEquityOrderToolbarBinding implements ViewBinding {
    public final RdsRippleContainerView actionOrderTypes;
    public final RhTextView actionOrderTypesTxt;
    public final ConstraintLayout equityOrderToolbarContainer;
    public final FrameLayout equityOrderToolbarContent;
    private final ConstraintLayout rootView;

    private IncludeEquityOrderToolbarBinding(ConstraintLayout constraintLayout, RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.actionOrderTypes = rdsRippleContainerView;
        this.actionOrderTypesTxt = rhTextView;
        this.equityOrderToolbarContainer = constraintLayout2;
        this.equityOrderToolbarContent = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeEquityOrderToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEquityOrderToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.include_equity_order_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEquityOrderToolbarBinding bind(View view) {
        int i = C20649R.id.action_order_types;
        RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsRippleContainerView != null) {
            i = C20649R.id.action_order_types_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C20649R.id.equity_order_toolbar_content;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    return new IncludeEquityOrderToolbarBinding(constraintLayout, rdsRippleContainerView, rhTextView, constraintLayout, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
