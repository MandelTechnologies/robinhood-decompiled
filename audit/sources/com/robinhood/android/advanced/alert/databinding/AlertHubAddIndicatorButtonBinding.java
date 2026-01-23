package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class AlertHubAddIndicatorButtonBinding implements ViewBinding {
    public final RhTextView addIndicatorBtn;
    public final RdsRippleContainerView addIndicatorLayout;
    public final View divider;
    private final RdsRippleContainerView rootView;

    private AlertHubAddIndicatorButtonBinding(RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView, RdsRippleContainerView rdsRippleContainerView2, View view) {
        this.rootView = rdsRippleContainerView;
        this.addIndicatorBtn = rhTextView;
        this.addIndicatorLayout = rdsRippleContainerView2;
        this.divider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRippleContainerView getRoot() {
        return this.rootView;
    }

    public static AlertHubAddIndicatorButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AlertHubAddIndicatorButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.alert_hub_add_indicator_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AlertHubAddIndicatorButtonBinding bind(View view) {
        int i = C8387R.id.add_indicator_btn;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) view;
            int i2 = C8387R.id.divider;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById != null) {
                return new AlertHubAddIndicatorButtonBinding(rdsRippleContainerView, rhTextView, rdsRippleContainerView, viewFindChildViewById);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
