package com.robinhood.android.paycheckhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.paycheckhub.C25434R;

/* loaded from: classes11.dex */
public final class FragmentPaycheckDetailBinding implements ViewBinding {
    public final RdsDataRowView dateReceivedSection;
    public final RhTextView directDepositSourceAmountSubtitle;
    public final RdsDataRowView directDepositSourceSection;
    public final RdsDataRowView netDepositSection;
    public final RhTextView paycheckAmount;
    public final RdsDataRowView recurringBrokerageSplitsSection;
    public final RdsDataRowView recurringRetirementSplitsSection;
    private final ScrollView rootView;
    public final RdsDataRowView statusSection;

    private FragmentPaycheckDetailBinding(ScrollView scrollView, RdsDataRowView rdsDataRowView, RhTextView rhTextView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RhTextView rhTextView2, RdsDataRowView rdsDataRowView4, RdsDataRowView rdsDataRowView5, RdsDataRowView rdsDataRowView6) {
        this.rootView = scrollView;
        this.dateReceivedSection = rdsDataRowView;
        this.directDepositSourceAmountSubtitle = rhTextView;
        this.directDepositSourceSection = rdsDataRowView2;
        this.netDepositSection = rdsDataRowView3;
        this.paycheckAmount = rhTextView2;
        this.recurringBrokerageSplitsSection = rdsDataRowView4;
        this.recurringRetirementSplitsSection = rdsDataRowView5;
        this.statusSection = rdsDataRowView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPaycheckDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaycheckDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25434R.layout.fragment_paycheck_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPaycheckDetailBinding bind(View view) {
        int i = C25434R.id.date_received_section;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C25434R.id.direct_deposit_source_amount_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25434R.id.direct_deposit_source_section;
                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView2 != null) {
                    i = C25434R.id.net_deposit_section;
                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView3 != null) {
                        i = C25434R.id.paycheck_amount;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C25434R.id.recurring_brokerage_splits_section;
                            RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsDataRowView4 != null) {
                                i = C25434R.id.recurring_retirement_splits_section;
                                RdsDataRowView rdsDataRowView5 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView5 != null) {
                                    i = C25434R.id.status_section;
                                    RdsDataRowView rdsDataRowView6 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView6 != null) {
                                        return new FragmentPaycheckDetailBinding((ScrollView) view, rdsDataRowView, rhTextView, rdsDataRowView2, rdsDataRowView3, rhTextView2, rdsDataRowView4, rdsDataRowView5, rdsDataRowView6);
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
