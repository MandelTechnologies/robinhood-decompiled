package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.nbbo.InvestFlowNbboRowView;

/* loaded from: classes10.dex */
public final class IncludeInvestFlowNbboRowBinding implements ViewBinding {
    private final InvestFlowNbboRowView rootView;

    private IncludeInvestFlowNbboRowBinding(InvestFlowNbboRowView investFlowNbboRowView) {
        this.rootView = investFlowNbboRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InvestFlowNbboRowView getRoot() {
        return this.rootView;
    }

    public static IncludeInvestFlowNbboRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInvestFlowNbboRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.include_invest_flow_nbbo_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInvestFlowNbboRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInvestFlowNbboRowBinding((InvestFlowNbboRowView) view);
    }
}
