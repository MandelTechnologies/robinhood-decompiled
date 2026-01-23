package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentDirectDepositBranchV2Binding implements ViewBinding {
    public final RdsButton continueBtn;
    public final RdsSettingsRowView directDepositAccountNumberSettingsRow;
    public final RhTextView directDepositBranchOtherTitle;
    public final RhTextView directDepositBranchSubtitle;
    public final RhTextView directDepositBranchTitle;
    public final RhTextView directDepositEmailInformation;
    public final RdsSettingsRowView directDepositRoutingNumberSettingsRow;
    public final RdsRowView preFilledRow;
    private final LinearLayout rootView;
    public final RdsRowView switcherRow;

    private FragmentDirectDepositBranchV2Binding(LinearLayout linearLayout, RdsButton rdsButton, RdsSettingsRowView rdsSettingsRowView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RdsSettingsRowView rdsSettingsRowView2, RdsRowView rdsRowView, RdsRowView rdsRowView2) {
        this.rootView = linearLayout;
        this.continueBtn = rdsButton;
        this.directDepositAccountNumberSettingsRow = rdsSettingsRowView;
        this.directDepositBranchOtherTitle = rhTextView;
        this.directDepositBranchSubtitle = rhTextView2;
        this.directDepositBranchTitle = rhTextView3;
        this.directDepositEmailInformation = rhTextView4;
        this.directDepositRoutingNumberSettingsRow = rdsSettingsRowView2;
        this.preFilledRow = rdsRowView;
        this.switcherRow = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectDepositBranchV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectDepositBranchV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_direct_deposit_branch_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectDepositBranchV2Binding bind(View view) {
        int i = C14044R.id.continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14044R.id.direct_deposit_account_number_settings_row;
            RdsSettingsRowView rdsSettingsRowView = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsSettingsRowView != null) {
                i = C14044R.id.direct_deposit_branch_other_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14044R.id.direct_deposit_branch_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C14044R.id.direct_deposit_branch_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C14044R.id.direct_deposit_email_information;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C14044R.id.direct_deposit_routing_number_settings_row;
                                RdsSettingsRowView rdsSettingsRowView2 = (RdsSettingsRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsSettingsRowView2 != null) {
                                    i = C14044R.id.pre_filled_row;
                                    RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsRowView != null) {
                                        i = C14044R.id.switcher_row;
                                        RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsRowView2 != null) {
                                            return new FragmentDirectDepositBranchV2Binding((LinearLayout) view, rdsButton, rdsSettingsRowView, rhTextView, rhTextView2, rhTextView3, rhTextView4, rdsSettingsRowView2, rdsRowView, rdsRowView2);
                                        }
                                    }
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
