package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.split.InvestFlowSplitRowView;

/* loaded from: classes10.dex */
public final class IncludeInvestFlowSplitRowBinding implements ViewBinding {
    private final InvestFlowSplitRowView rootView;

    private IncludeInvestFlowSplitRowBinding(InvestFlowSplitRowView investFlowSplitRowView) {
        this.rootView = investFlowSplitRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public InvestFlowSplitRowView getRoot() {
        return this.rootView;
    }

    public static IncludeInvestFlowSplitRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeInvestFlowSplitRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.include_invest_flow_split_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeInvestFlowSplitRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeInvestFlowSplitRowBinding((InvestFlowSplitRowView) view);
    }
}
