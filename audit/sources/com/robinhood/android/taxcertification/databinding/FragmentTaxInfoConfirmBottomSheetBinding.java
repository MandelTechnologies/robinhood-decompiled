package com.robinhood.android.taxcertification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.taxcertification.C29286R;

/* loaded from: classes9.dex */
public final class FragmentTaxInfoConfirmBottomSheetBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsRowView taxInfoConfirmSheetContactSupportRow;
    public final RdsButton taxInfoConfirmSheetDismissCta;
    public final RhTextView taxInfoConfirmSheetMessage;
    public final RdsRowView taxInfoConfirmSheetSsnRow;

    private FragmentTaxInfoConfirmBottomSheetBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsButton rdsButton, RhTextView rhTextView, RdsRowView rdsRowView2) {
        this.rootView = linearLayout;
        this.taxInfoConfirmSheetContactSupportRow = rdsRowView;
        this.taxInfoConfirmSheetDismissCta = rdsButton;
        this.taxInfoConfirmSheetMessage = rhTextView;
        this.taxInfoConfirmSheetSsnRow = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTaxInfoConfirmBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTaxInfoConfirmBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29286R.layout.fragment_tax_info_confirm_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTaxInfoConfirmBottomSheetBinding bind(View view) {
        int i = C29286R.id.tax_info_confirm_sheet_contact_support_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C29286R.id.tax_info_confirm_sheet_dismiss_cta;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C29286R.id.tax_info_confirm_sheet_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C29286R.id.tax_info_confirm_sheet_ssn_row;
                    RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView2 != null) {
                        return new FragmentTaxInfoConfirmBottomSheetBinding((LinearLayout) view, rdsRowView, rdsButton, rhTextView, rdsRowView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
