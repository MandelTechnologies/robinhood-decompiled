package com.robinhood.android.transfers.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.AutomaticDepositRecurringInvestmentHookViewRow;

/* loaded from: classes9.dex */
public final class RowRecurringInvestmentsHookBinding implements ViewBinding {
    public final AutomaticDepositRecurringInvestmentHookViewRow recurringInvestmentsHookCard;
    private final AutomaticDepositRecurringInvestmentHookViewRow rootView;

    private RowRecurringInvestmentsHookBinding(AutomaticDepositRecurringInvestmentHookViewRow automaticDepositRecurringInvestmentHookViewRow, AutomaticDepositRecurringInvestmentHookViewRow automaticDepositRecurringInvestmentHookViewRow2) {
        this.rootView = automaticDepositRecurringInvestmentHookViewRow;
        this.recurringInvestmentsHookCard = automaticDepositRecurringInvestmentHookViewRow2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AutomaticDepositRecurringInvestmentHookViewRow getRoot() {
        return this.rootView;
    }

    public static RowRecurringInvestmentsHookBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowRecurringInvestmentsHookBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30439R.layout.row_recurring_investments_hook, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowRecurringInvestmentsHookBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AutomaticDepositRecurringInvestmentHookViewRow automaticDepositRecurringInvestmentHookViewRow = (AutomaticDepositRecurringInvestmentHookViewRow) view;
        return new RowRecurringInvestmentsHookBinding(automaticDepositRecurringInvestmentHookViewRow, automaticDepositRecurringInvestmentHookViewRow);
    }
}
