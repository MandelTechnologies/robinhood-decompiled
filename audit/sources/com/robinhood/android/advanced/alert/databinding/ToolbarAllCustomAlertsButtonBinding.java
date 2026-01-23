package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.button.RdsTextButton;

/* loaded from: classes24.dex */
public final class ToolbarAllCustomAlertsButtonBinding implements ViewBinding {
    public final RdsTextButton allCustomAlertsButton;
    public final ConstraintLayout allCustomAlertsCustomView;
    private final ConstraintLayout rootView;

    private ToolbarAllCustomAlertsButtonBinding(ConstraintLayout constraintLayout, RdsTextButton rdsTextButton, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.allCustomAlertsButton = rdsTextButton;
        this.allCustomAlertsCustomView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ToolbarAllCustomAlertsButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarAllCustomAlertsButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.toolbar_all_custom_alerts_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ToolbarAllCustomAlertsButtonBinding bind(View view) {
        int i = C8387R.id.all_custom_alerts_button;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new ToolbarAllCustomAlertsButtonBinding(constraintLayout, rdsTextButton, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
