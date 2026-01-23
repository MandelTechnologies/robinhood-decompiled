package com.robinhood.android.equityvalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksBreakdownRowView;
import com.robinhood.android.equityvalidation.C16020R;

/* loaded from: classes3.dex */
public final class IncludeEquityOrderChecksBreakdownRowViewBinding implements ViewBinding {
    private final EquityOrderChecksBreakdownRowView rootView;

    private IncludeEquityOrderChecksBreakdownRowViewBinding(EquityOrderChecksBreakdownRowView equityOrderChecksBreakdownRowView) {
        this.rootView = equityOrderChecksBreakdownRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EquityOrderChecksBreakdownRowView getRoot() {
        return this.rootView;
    }

    public static IncludeEquityOrderChecksBreakdownRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEquityOrderChecksBreakdownRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16020R.layout.include_equity_order_checks_breakdown_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEquityOrderChecksBreakdownRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEquityOrderChecksBreakdownRowViewBinding((EquityOrderChecksBreakdownRowView) view);
    }
}
