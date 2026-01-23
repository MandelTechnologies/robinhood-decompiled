package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class MergeDirectDepositAccountInfoBinding implements ViewBinding {
    public final RdsDataRowView directDepositAccountNumberRow;
    public final RdsDataRowView directDepositAmountRow;
    public final RdsDataRowView directDepositBankNameRow;
    public final RdsDataRowView directDepositEmployerRow;
    public final RdsDataRowView directDepositNameRow;
    public final RdsDataRowView directDepositRoutingNumberRow;
    public final ImageView directDepositSignature;
    public final RdsDataRowView directDepositSignatureRow;
    private final View rootView;

    private MergeDirectDepositAccountInfoBinding(View view, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, ImageView imageView, RdsDataRowView rdsDataRowView7) {
        this.rootView = view;
        this.directDepositAccountNumberRow = rdsDataRowView;
        this.directDepositAmountRow = rdsDataRowView2;
        this.directDepositBankNameRow = rdsDataRowView3;
        this.directDepositEmployerRow = rdsDataRowView4;
        this.directDepositNameRow = rdsDataRowView5;
        this.directDepositRoutingNumberRow = rdsDataRowView6;
        this.directDepositSignature = imageView;
        this.directDepositSignatureRow = rdsDataRowView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDirectDepositAccountInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14044R.layout.merge_direct_deposit_account_info, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDirectDepositAccountInfoBinding bind(View view) {
        int i = C14044R.id.direct_deposit_account_number_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C14044R.id.direct_deposit_amount_row;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C14044R.id.direct_deposit_bank_name_row;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C14044R.id.direct_deposit_employer_row;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        i = C14044R.id.direct_deposit_name_row;
                        RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView5 != null) {
                            i = C14044R.id.direct_deposit_routing_number_row;
                            RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView6 != null) {
                                i = C14044R.id.direct_deposit_signature;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C14044R.id.direct_deposit_signature_row;
                                    RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView7 != null) {
                                        return new MergeDirectDepositAccountInfoBinding(view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6, imageView, rdsDataRowView7);
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
