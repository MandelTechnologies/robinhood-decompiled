package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class RowEditLegRatioBinding implements ViewBinding {
    public final RdsTextInputEditText editLegRatioRowContractsEdt;
    public final View editLegRatioRowDivider;
    public final RhTextView editLegRatioRowSubtitle;
    public final RhTextView editLegRatioRowTitle;
    private final ConstraintLayout rootView;

    private RowEditLegRatioBinding(ConstraintLayout constraintLayout, RdsTextInputEditText rdsTextInputEditText, View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.editLegRatioRowContractsEdt = rdsTextInputEditText;
        this.editLegRatioRowDivider = view;
        this.editLegRatioRowSubtitle = rhTextView;
        this.editLegRatioRowTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static RowEditLegRatioBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowEditLegRatioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.row_edit_leg_ratio, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowEditLegRatioBinding bind(View view) {
        View viewFindChildViewById;
        int i = C24135R.id.edit_leg_ratio_row_contracts_edt;
        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
        if (rdsTextInputEditText != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24135R.id.edit_leg_ratio_row_divider))) != null) {
            i = C24135R.id.edit_leg_ratio_row_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C24135R.id.edit_leg_ratio_row_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new RowEditLegRatioBinding((ConstraintLayout) view, rdsTextInputEditText, viewFindChildViewById, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
