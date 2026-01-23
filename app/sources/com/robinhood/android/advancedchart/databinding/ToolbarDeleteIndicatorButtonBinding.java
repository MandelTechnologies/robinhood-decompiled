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
public final class ToolbarDeleteIndicatorButtonBinding implements ViewBinding {
    public final RdsTextButton deleteIndicatorBtn;
    public final ConstraintLayout deleteIndicatorToolbarCustomView;
    private final ConstraintLayout rootView;

    private ToolbarDeleteIndicatorButtonBinding(ConstraintLayout constraintLayout, RdsTextButton rdsTextButton, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.deleteIndicatorBtn = rdsTextButton;
        this.deleteIndicatorToolbarCustomView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ToolbarDeleteIndicatorButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarDeleteIndicatorButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.toolbar_delete_indicator_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ToolbarDeleteIndicatorButtonBinding bind(View view) {
        int i = C8502R.id.delete_indicator_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new ToolbarDeleteIndicatorButtonBinding(constraintLayout, rdsTextButton, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
