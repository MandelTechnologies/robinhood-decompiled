package com.robinhood.android.equityvalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equityvalidation.C16020R;

/* loaded from: classes3.dex */
public final class MergeEquityOrderChecksBreakdownRowViewBinding implements ViewBinding {
    public final RhTextView dataRowArithmeticText;
    public final RhTextView dataRowLabelText;
    public final RhTextView dataRowValueText;
    public final View divider;
    private final View rootView;

    private MergeEquityOrderChecksBreakdownRowViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, View view2) {
        this.rootView = view;
        this.dataRowArithmeticText = rhTextView;
        this.dataRowLabelText = rhTextView2;
        this.dataRowValueText = rhTextView3;
        this.divider = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEquityOrderChecksBreakdownRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C16020R.layout.merge_equity_order_checks_breakdown_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEquityOrderChecksBreakdownRowViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C16020R.id.data_row_arithmetic_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C16020R.id.data_row_label_text;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C16020R.id.data_row_value_text;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C16020R.id.divider))) != null) {
                    return new MergeEquityOrderChecksBreakdownRowViewBinding(view, rhTextView, rhTextView2, rhTextView3, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
