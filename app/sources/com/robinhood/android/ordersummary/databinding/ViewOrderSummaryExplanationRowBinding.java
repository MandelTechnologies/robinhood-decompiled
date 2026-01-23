package com.robinhood.android.ordersummary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.ordersummary.C25242R;

/* loaded from: classes11.dex */
public final class ViewOrderSummaryExplanationRowBinding implements ViewBinding {
    private final RdsRowView rootView;

    private ViewOrderSummaryExplanationRowBinding(RdsRowView rdsRowView) {
        this.rootView = rdsRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsRowView getRoot() {
        return this.rootView;
    }

    public static ViewOrderSummaryExplanationRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewOrderSummaryExplanationRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25242R.layout.view_order_summary_explanation_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewOrderSummaryExplanationRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewOrderSummaryExplanationRowBinding((RdsRowView) view);
    }
}
