package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class FragmentSweepPaymentDetailBinding implements ViewBinding {
    private final ScrollView rootView;
    public final RdsDataRowView sweepPaymentDetailAccount;
    public final RdsDataRowView sweepPaymentDetailAmount;
    public final RdsDataRowView sweepPaymentDetailBackupWithholding;
    public final RhTextView sweepPaymentDetailFooter;
    public final RdsDataRowView sweepPaymentDetailNetCredit;
    public final RdsDataRowView sweepPaymentDetailPayDate;
    public final RdsDataRowView sweepPaymentDetailPaymentReason;

    private FragmentSweepPaymentDetailBinding(ScrollView scrollView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RhTextView rhTextView, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6) {
        this.rootView = scrollView;
        this.sweepPaymentDetailAccount = rdsDataRowView;
        this.sweepPaymentDetailAmount = rdsDataRowView2;
        this.sweepPaymentDetailBackupWithholding = rdsDataRowView3;
        this.sweepPaymentDetailFooter = rhTextView;
        this.sweepPaymentDetailNetCredit = rdsDataRowView4;
        this.sweepPaymentDetailPayDate = rdsDataRowView5;
        this.sweepPaymentDetailPaymentReason = rdsDataRowView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentSweepPaymentDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSweepPaymentDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_sweep_payment_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSweepPaymentDetailBinding bind(View view) {
        int i = C18359R.id.sweep_payment_detail_account;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.sweep_payment_detail_amount;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C18359R.id.sweep_payment_detail_backup_withholding;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C18359R.id.sweep_payment_detail_footer;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C18359R.id.sweep_payment_detail_net_credit;
                        RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                        if (rdsDataRowView4 != null) {
                            i = C18359R.id.sweep_payment_detail_pay_date;
                            RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView5 != null) {
                                i = C18359R.id.sweep_payment_detail_payment_reason;
                                RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView6 != null) {
                                    return new FragmentSweepPaymentDetailBinding((ScrollView) view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rhTextView, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6);
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
