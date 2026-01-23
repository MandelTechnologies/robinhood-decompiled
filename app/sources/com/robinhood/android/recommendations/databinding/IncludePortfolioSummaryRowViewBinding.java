package com.robinhood.android.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioSummaryRowView;

/* loaded from: classes11.dex */
public final class IncludePortfolioSummaryRowViewBinding implements ViewBinding {
    private final PortfolioSummaryRowView rootView;

    private IncludePortfolioSummaryRowViewBinding(PortfolioSummaryRowView portfolioSummaryRowView) {
        this.rootView = portfolioSummaryRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public PortfolioSummaryRowView getRoot() {
        return this.rootView;
    }

    public static IncludePortfolioSummaryRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludePortfolioSummaryRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25978R.layout.include_portfolio_summary_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludePortfolioSummaryRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludePortfolioSummaryRowViewBinding((PortfolioSummaryRowView) view);
    }
}
