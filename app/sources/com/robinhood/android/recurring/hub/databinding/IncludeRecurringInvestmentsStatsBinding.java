package com.robinhood.android.recurring.hub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.recurring.hub.C26221R;
import com.robinhood.android.recurring.hub.p225ui.RecurringInvestmentsStatsView;

/* loaded from: classes11.dex */
public final class IncludeRecurringInvestmentsStatsBinding implements ViewBinding {
    private final RecurringInvestmentsStatsView rootView;

    private IncludeRecurringInvestmentsStatsBinding(RecurringInvestmentsStatsView recurringInvestmentsStatsView) {
        this.rootView = recurringInvestmentsStatsView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecurringInvestmentsStatsView getRoot() {
        return this.rootView;
    }

    public static IncludeRecurringInvestmentsStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecurringInvestmentsStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26221R.layout.include_recurring_investments_stats, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecurringInvestmentsStatsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRecurringInvestmentsStatsBinding((RecurringInvestmentsStatsView) view);
    }
}
