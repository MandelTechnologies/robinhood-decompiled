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
public final class FragmentMarginInterestChargeDetailBinding implements ViewBinding {
    public final RdsDataRowView marginInterestChargeAccount;
    public final RdsDataRowView marginInterestChargeAvgMargin;
    public final RdsDataRowView marginInterestChargeBillingCycle;
    public final RdsDataRowView marginInterestChargeCredit;
    public final RhTextView marginInterestChargeDescription;
    public final RdsDataRowView marginInterestChargePaymentDate;
    public final RdsDataRowView marginInterestChargeTotalInterest;
    public final RdsDataRowView marginInterestChargeTotalPaid;
    public final RdsDataRowView marginInterestChargeYearlyInterestRate;
    private final ScrollView rootView;

    private FragmentMarginInterestChargeDetailBinding(ScrollView scrollView, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4, RhTextView rhTextView, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6, RdsDataRowView rdsDataRowView7, RdsDataRowView rdsDataRowView8) {
        this.rootView = scrollView;
        this.marginInterestChargeAccount = rdsDataRowView;
        this.marginInterestChargeAvgMargin = rdsDataRowView2;
        this.marginInterestChargeBillingCycle = rdsDataRowView3;
        this.marginInterestChargeCredit = rdsDataRowView4;
        this.marginInterestChargeDescription = rhTextView;
        this.marginInterestChargePaymentDate = rdsDataRowView5;
        this.marginInterestChargeTotalInterest = rdsDataRowView6;
        this.marginInterestChargeTotalPaid = rdsDataRowView7;
        this.marginInterestChargeYearlyInterestRate = rdsDataRowView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMarginInterestChargeDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMarginInterestChargeDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18359R.layout.fragment_margin_interest_charge_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMarginInterestChargeDetailBinding bind(View view) {
        int i = C18359R.id.margin_interest_charge_account;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C18359R.id.margin_interest_charge_avg_margin;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C18359R.id.margin_interest_charge_billing_cycle;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C18359R.id.margin_interest_charge_credit;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        i = C18359R.id.margin_interest_charge_description;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C18359R.id.margin_interest_charge_payment_date;
                            RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView5 != null) {
                                i = C18359R.id.margin_interest_charge_total_interest;
                                RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView6 != null) {
                                    i = C18359R.id.margin_interest_charge_total_paid;
                                    RdsDataRowView rdsDataRowView7 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView7 != null) {
                                        i = C18359R.id.margin_interest_charge_yearly_interest_rate;
                                        RdsDataRowView rdsDataRowView8 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsDataRowView8 != null) {
                                            return new FragmentMarginInterestChargeDetailBinding((ScrollView) view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4, rhTextView, rdsDataRowView5, rdsDataRowView6, rdsDataRowView7, rdsDataRowView8);
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
