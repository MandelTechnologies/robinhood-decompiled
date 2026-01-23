package com.robinhood.android.taxcertification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.taxcertification.C29286R;

/* loaded from: classes9.dex */
public final class FragmentTaxInfoConfirmBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsRowView taxInfoAddressRow;
    public final RdsButton taxInfoConfirmCta;
    public final RdsRowView taxInfoNameRow;
    public final RdsRowView taxInfoSsnRow;
    public final RdsButton taxInfoUpdateCta;

    private FragmentTaxInfoConfirmBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsButton rdsButton, RdsRowView rdsRowView2, RdsRowView rdsRowView3, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.taxInfoAddressRow = rdsRowView;
        this.taxInfoConfirmCta = rdsButton;
        this.taxInfoNameRow = rdsRowView2;
        this.taxInfoSsnRow = rdsRowView3;
        this.taxInfoUpdateCta = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTaxInfoConfirmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTaxInfoConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29286R.layout.fragment_tax_info_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTaxInfoConfirmBinding bind(View view) {
        int i = C29286R.id.tax_info_address_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C29286R.id.tax_info_confirm_cta;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C29286R.id.tax_info_name_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    i = C29286R.id.tax_info_ssn_row;
                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView3 != null) {
                        i = C29286R.id.tax_info_update_cta;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            return new FragmentTaxInfoConfirmBinding((LinearLayout) view, rdsRowView, rdsButton, rdsRowView2, rdsRowView3, rdsButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
