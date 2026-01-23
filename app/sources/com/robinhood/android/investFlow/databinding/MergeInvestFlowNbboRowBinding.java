package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class MergeInvestFlowNbboRowBinding implements ViewBinding {
    public final RhTextView amountTxt;
    public final RhTextView lastPriceTxt;
    public final RhTextView nbboTxt;
    private final ConstraintLayout rootView;
    public final RhTextView tickerTxt;

    private MergeInvestFlowNbboRowBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.amountTxt = rhTextView;
        this.lastPriceTxt = rhTextView2;
        this.nbboTxt = rhTextView3;
        this.tickerTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeInvestFlowNbboRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeInvestFlowNbboRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.merge_invest_flow_nbbo_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeInvestFlowNbboRowBinding bind(View view) {
        int i = C19349R.id.amount_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C19349R.id.last_price_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C19349R.id.nbbo_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C19349R.id.ticker_txt;
                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView4 != null) {
                        return new MergeInvestFlowNbboRowBinding((ConstraintLayout) view, rhTextView, rhTextView2, rhTextView3, rhTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
