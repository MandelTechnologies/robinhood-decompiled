package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringRowView;

/* loaded from: classes10.dex */
public final class IncludeInvestFlowRecurringRowBinding implements ViewBinding {
    private final InvestFlowRecurringRowView rootView;

    private IncludeInvestFlowRecurringRowBinding(InvestFlowRecurringRowView investFlowRecurringRowView) {
        this.rootView = investFlowRecurringRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InvestFlowRecurringRowView getRoot() {
        return this.rootView;
    }

    public static IncludeInvestFlowRecurringRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInvestFlowRecurringRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.include_invest_flow_recurring_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInvestFlowRecurringRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInvestFlowRecurringRowBinding((InvestFlowRecurringRowView) view);
    }
}
