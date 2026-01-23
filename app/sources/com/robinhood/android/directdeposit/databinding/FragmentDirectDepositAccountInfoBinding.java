package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentDirectDepositAccountInfoBinding implements ViewBinding {
    public final RhTextView directDepositAccountInfoBankInfoDisclosure;
    public final ConstraintLayout directDepositAccountInfoContainer;
    public final RdsButton directDepositAccountInfoDone;
    public final RhTextView directDepositAccountInfoLabel;
    public final RhTextView directDepositAccountInfoSummary;
    public final RdsDataRowView directDepositAccountNumberRow;
    public final RdsDataRowView directDepositBankNameRow;
    public final RdsDataRowView directDepositNameRow;
    public final RdsDataRowView directDepositRoutingNumberRow;
    private final ConstraintLayout rootView;

    private FragmentDirectDepositAccountInfoBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ConstraintLayout constraintLayout2, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4) {
        this.rootView = constraintLayout;
        this.directDepositAccountInfoBankInfoDisclosure = rhTextView;
        this.directDepositAccountInfoContainer = constraintLayout2;
        this.directDepositAccountInfoDone = rdsButton;
        this.directDepositAccountInfoLabel = rhTextView2;
        this.directDepositAccountInfoSummary = rhTextView3;
        this.directDepositAccountNumberRow = rdsDataRowView;
        this.directDepositBankNameRow = rdsDataRowView2;
        this.directDepositNameRow = rdsDataRowView3;
        this.directDepositRoutingNumberRow = rdsDataRowView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectDepositAccountInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectDepositAccountInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_direct_deposit_account_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectDepositAccountInfoBinding bind(View view) {
        int i = C14044R.id.direct_deposit_account_info_bank_info_disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C14044R.id.direct_deposit_account_info_done;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C14044R.id.direct_deposit_account_info_label;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C14044R.id.direct_deposit_account_info_summary;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C14044R.id.direct_deposit_account_number_row;
                        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView != null) {
                            i = C14044R.id.direct_deposit_bank_name_row;
                            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView2 != null) {
                                i = C14044R.id.direct_deposit_name_row;
                                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView3 != null) {
                                    i = C14044R.id.direct_deposit_routing_number_row;
                                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView4 != null) {
                                        return new FragmentDirectDepositAccountInfoBinding(constraintLayout, rhTextView, constraintLayout, rdsButton, rhTextView2, rhTextView3, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4);
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
