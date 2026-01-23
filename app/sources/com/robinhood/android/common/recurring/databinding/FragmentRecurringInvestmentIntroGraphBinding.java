package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.intro.RecurringInvestmentGraphLayout;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentRecurringInvestmentIntroGraphBinding implements ViewBinding {
    public final RdsButton cta;
    public final RhTextView disclosure;
    public final RecurringInvestmentGraphLayout recurringInvestmentGraph;
    private final LinearLayout rootView;

    private FragmentRecurringInvestmentIntroGraphBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RecurringInvestmentGraphLayout recurringInvestmentGraphLayout) {
        this.rootView = linearLayout;
        this.cta = rdsButton;
        this.disclosure = rhTextView;
        this.recurringInvestmentGraph = recurringInvestmentGraphLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringInvestmentIntroGraphBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringInvestmentIntroGraphBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_investment_intro_graph, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringInvestmentIntroGraphBinding bind(View view) {
        int i = C11595R.id.cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C11595R.id.disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11595R.id.recurring_investment_graph;
                RecurringInvestmentGraphLayout recurringInvestmentGraphLayout = (RecurringInvestmentGraphLayout) ViewBindings.findChildViewById(view, i);
                if (recurringInvestmentGraphLayout != null) {
                    return new FragmentRecurringInvestmentIntroGraphBinding((LinearLayout) view, rdsButton, rhTextView, recurringInvestmentGraphLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
