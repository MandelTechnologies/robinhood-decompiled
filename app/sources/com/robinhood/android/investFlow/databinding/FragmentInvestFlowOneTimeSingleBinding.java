package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.tickerinputview.TickerInputView;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowOneTimeSingleBinding implements ViewBinding {
    public final TickerInputView amountView;
    public final ConstraintLayout constraintLayout;
    public final RhTextView orderShares;
    public final RhTextView orderSummaryDescription;
    public final RhTextView orderSummaryTitle;
    private final ConstraintLayout rootView;

    private FragmentInvestFlowOneTimeSingleBinding(ConstraintLayout constraintLayout, TickerInputView tickerInputView, ConstraintLayout constraintLayout2, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.amountView = tickerInputView;
        this.constraintLayout = constraintLayout2;
        this.orderShares = rhTextView;
        this.orderSummaryDescription = rhTextView2;
        this.orderSummaryTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowOneTimeSingleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowOneTimeSingleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_one_time_single, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowOneTimeSingleBinding bind(View view) {
        int i = C19349R.id.amount_view;
        TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
        if (tickerInputView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C19349R.id.order_shares;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C19349R.id.order_summary_description;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C19349R.id.order_summary_title;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        return new FragmentInvestFlowOneTimeSingleBinding(constraintLayout, tickerInputView, constraintLayout, rhTextView, rhTextView2, rhTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
