package com.robinhood.android.recurring.hub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.recurring.hub.C26221R;

/* loaded from: classes11.dex */
public final class MergeRecurringInvestmentsStatsBinding implements ViewBinding {
    public final RdsDataRowView activeRow;
    public final RdsDataRowView nextInvestmentDateRow;
    public final RdsDataRowView pausedRow;
    private final View rootView;
    public final RdsDataRowView totalInvestedRow;

    private MergeRecurringInvestmentsStatsBinding(View view, RdsDataRowView rdsDataRowView, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3, RdsDataRowView rdsDataRowView4) {
        this.rootView = view;
        this.activeRow = rdsDataRowView;
        this.nextInvestmentDateRow = rdsDataRowView2;
        this.pausedRow = rdsDataRowView3;
        this.totalInvestedRow = rdsDataRowView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRecurringInvestmentsStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C26221R.layout.merge_recurring_investments_stats, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRecurringInvestmentsStatsBinding bind(View view) {
        int i = C26221R.id.active_row;
        RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
        if (rdsDataRowView != null) {
            i = C26221R.id.next_investment_date_row;
            RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView2 != null) {
                i = C26221R.id.paused_row;
                RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                if (rdsDataRowView3 != null) {
                    i = C26221R.id.total_invested_row;
                    RdsDataRowView rdsDataRowView4 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsDataRowView4 != null) {
                        return new MergeRecurringInvestmentsStatsBinding(view, rdsDataRowView, rdsDataRowView2, rdsDataRowView3, rdsDataRowView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
