package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class IncludeDirectIpoToolbarContentBinding implements ViewBinding {
    public final RdsButton cancelOrderButton;
    public final ConstraintLayout directIpoToolbarContent;
    private final ConstraintLayout rootView;

    private IncludeDirectIpoToolbarContentBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.cancelOrderButton = rdsButton;
        this.directIpoToolbarContent = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoToolbarContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoToolbarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.include_direct_ipo_toolbar_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoToolbarContentBinding bind(View view) {
        int i = C29323R.id.cancel_order_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new IncludeDirectIpoToolbarContentBinding(constraintLayout, rdsButton, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
