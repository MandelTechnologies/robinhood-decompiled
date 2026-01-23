package com.robinhood.android.paycheckhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.p213ui.PaycheckDistributionBarGraphView;

/* loaded from: classes11.dex */
public final class MergePaycheckDistributionViewBinding implements ViewBinding {
    public final LinearLayout paycheckDistributionBarGraphLegend;
    public final PaycheckDistributionBarGraphView paycheckDistributionBarGraphView;
    public final RhTextView paycheckTotalDeposited;
    public final View paycheckTotalDepositedColor;
    public final RhTextView paycheckTotalDepositedSecondaryText;
    public final RhTextView paycheckTotalInvested;
    public final View paycheckTotalInvestedColor;
    private final View rootView;

    private MergePaycheckDistributionViewBinding(View view, LinearLayout linearLayout, PaycheckDistributionBarGraphView paycheckDistributionBarGraphView, RhTextView rhTextView, View view2, RhTextView rhTextView2, RhTextView rhTextView3, View view3) {
        this.rootView = view;
        this.paycheckDistributionBarGraphLegend = linearLayout;
        this.paycheckDistributionBarGraphView = paycheckDistributionBarGraphView;
        this.paycheckTotalDeposited = rhTextView;
        this.paycheckTotalDepositedColor = view2;
        this.paycheckTotalDepositedSecondaryText = rhTextView2;
        this.paycheckTotalInvested = rhTextView3;
        this.paycheckTotalInvestedColor = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergePaycheckDistributionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25434R.layout.merge_paycheck_distribution_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergePaycheckDistributionViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C25434R.id.paycheck_distribution_bar_graph_legend;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C25434R.id.paycheck_distribution_bar_graph_view;
            PaycheckDistributionBarGraphView paycheckDistributionBarGraphView = (PaycheckDistributionBarGraphView) ViewBindings.findChildViewById(view, i);
            if (paycheckDistributionBarGraphView != null) {
                i = C25434R.id.paycheck_total_deposited;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25434R.id.paycheck_total_deposited_color))) != null) {
                    i = C25434R.id.paycheck_total_deposited_secondary_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C25434R.id.paycheck_total_invested;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C25434R.id.paycheck_total_invested_color))) != null) {
                            return new MergePaycheckDistributionViewBinding(view, linearLayout, paycheckDistributionBarGraphView, rhTextView, viewFindChildViewById, rhTextView2, rhTextView3, viewFindChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
