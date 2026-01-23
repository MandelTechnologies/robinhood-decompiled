package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.designsystem.button.RdsTextButton;

/* loaded from: classes24.dex */
public final class ToolbarAddIndicatorButtonBinding implements ViewBinding {
    public final RdsTextButton addIndicatorBtn;
    public final ConstraintLayout addIndicatorToolbarCustomView;
    private final ConstraintLayout rootView;

    private ToolbarAddIndicatorButtonBinding(ConstraintLayout constraintLayout, RdsTextButton rdsTextButton, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.addIndicatorBtn = rdsTextButton;
        this.addIndicatorToolbarCustomView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ToolbarAddIndicatorButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarAddIndicatorButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.toolbar_add_indicator_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ToolbarAddIndicatorButtonBinding bind(View view) {
        int i = C8502R.id.add_indicator_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new ToolbarAddIndicatorButtonBinding(constraintLayout, rdsTextButton, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
