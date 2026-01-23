package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class DialogMarginRequirementsBinding implements ViewBinding {
    public final RdsButton dialogMarginRequirementsDone;
    public final RhTextView dialogMarginRequirementsExplanation;
    public final RhTextView dialogMarginRequirementsInitialMarginLabel;
    public final RhTextView dialogMarginRequirementsInitialMarginValue;
    public final RhTextView dialogMarginRequirementsMaintenanceMarginLabel;
    public final RhTextView dialogMarginRequirementsMaintenanceMarginValue;
    public final RhTextView dialogMarginRequirementsTitle;
    private final ConstraintLayout rootView;

    private DialogMarginRequirementsBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.dialogMarginRequirementsDone = rdsButton;
        this.dialogMarginRequirementsExplanation = rhTextView;
        this.dialogMarginRequirementsInitialMarginLabel = rhTextView2;
        this.dialogMarginRequirementsInitialMarginValue = rhTextView3;
        this.dialogMarginRequirementsMaintenanceMarginLabel = rhTextView4;
        this.dialogMarginRequirementsMaintenanceMarginValue = rhTextView5;
        this.dialogMarginRequirementsTitle = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogMarginRequirementsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogMarginRequirementsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.dialog_margin_requirements, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogMarginRequirementsBinding bind(View view) {
        int i = C15314R.id.dialog_margin_requirements_done;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C15314R.id.dialog_margin_requirements_explanation;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C15314R.id.dialog_margin_requirements_initial_margin_label;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C15314R.id.dialog_margin_requirements_initial_margin_value;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C15314R.id.dialog_margin_requirements_maintenance_margin_label;
                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView4 != null) {
                            i = C15314R.id.dialog_margin_requirements_maintenance_margin_value;
                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView5 != null) {
                                i = C15314R.id.dialog_margin_requirements_title;
                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView6 != null) {
                                    return new DialogMarginRequirementsBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2, rhTextView3, rhTextView4, rhTextView5, rhTextView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
