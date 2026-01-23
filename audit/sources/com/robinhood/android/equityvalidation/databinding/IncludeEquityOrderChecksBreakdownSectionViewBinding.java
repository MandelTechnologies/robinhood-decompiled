package com.robinhood.android.equityvalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksBreakdownSectionView;
import com.robinhood.android.equityvalidation.C16020R;

/* loaded from: classes3.dex */
public final class IncludeEquityOrderChecksBreakdownSectionViewBinding implements ViewBinding {
    private final EquityOrderChecksBreakdownSectionView rootView;

    private IncludeEquityOrderChecksBreakdownSectionViewBinding(EquityOrderChecksBreakdownSectionView equityOrderChecksBreakdownSectionView) {
        this.rootView = equityOrderChecksBreakdownSectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public EquityOrderChecksBreakdownSectionView getRoot() {
        return this.rootView;
    }

    public static IncludeEquityOrderChecksBreakdownSectionViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEquityOrderChecksBreakdownSectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16020R.layout.include_equity_order_checks_breakdown_section_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEquityOrderChecksBreakdownSectionViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeEquityOrderChecksBreakdownSectionViewBinding((EquityOrderChecksBreakdownSectionView) view);
    }
}
