package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class BottomSheetAccountInfoBinding implements ViewBinding {
    public final RdsSettingsRowView accountInfoAccountNumberRow;
    public final RhTextView accountInfoDisclosure;
    public final RdsButton accountInfoPrimaryBtn;
    public final RdsSettingsRowView accountInfoRoutingNumberRow;
    private final LinearLayout rootView;

    private BottomSheetAccountInfoBinding(LinearLayout linearLayout, RdsSettingsRowView rdsSettingsRowView, RhTextView rhTextView, RdsButton rdsButton, RdsSettingsRowView rdsSettingsRowView2) {
        this.rootView = linearLayout;
        this.accountInfoAccountNumberRow = rdsSettingsRowView;
        this.accountInfoDisclosure = rhTextView;
        this.accountInfoPrimaryBtn = rdsButton;
        this.accountInfoRoutingNumberRow = rdsSettingsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static BottomSheetAccountInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetAccountInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.bottom_sheet_account_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static BottomSheetAccountInfoBinding bind(View view) {
        int i = C14044R.id.account_info_account_number_row;
        RdsSettingsRowView rdsSettingsRowView = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsSettingsRowView != null) {
            i = C14044R.id.account_info_disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.account_info_primary_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C14044R.id.account_info_routing_number_row;
                    RdsSettingsRowView rdsSettingsRowView2 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsSettingsRowView2 != null) {
                        return new BottomSheetAccountInfoBinding((LinearLayout) view, rdsSettingsRowView, rhTextView, rdsButton, rdsSettingsRowView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
