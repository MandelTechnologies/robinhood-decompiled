package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxView;

/* loaded from: classes2.dex */
public final class IncludeRecurringInvestmentNuxBinding implements ViewBinding {
    private final RecurringInvestmentsNuxView rootView;

    private IncludeRecurringInvestmentNuxBinding(RecurringInvestmentsNuxView recurringInvestmentsNuxView) {
        this.rootView = recurringInvestmentsNuxView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RecurringInvestmentsNuxView getRoot() {
        return this.rootView;
    }

    public static IncludeRecurringInvestmentNuxBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRecurringInvestmentNuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.include_recurring_investment_nux, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRecurringInvestmentNuxBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRecurringInvestmentNuxBinding((RecurringInvestmentsNuxView) view);
    }
}
