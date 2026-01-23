package com.robinhood.android.optionsplchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView;

/* loaded from: classes11.dex */
public final class FragmentOptionsProfitLossChartAnalysisBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    public final RdsDataRowView optionsProfitLossChartAnalysisBreakevenRow;
    public final OptionsProfitLossChartView optionsProfitLossChartAnalysisChart;
    public final RdsButton optionsProfitLossChartAnalysisDone;
    public final RhTextView optionsProfitLossChartAnalysisExpectedProfitLoss;
    public final RdsButton optionsProfitLossChartAnalysisLearnMore;
    public final RdsDataRowView optionsProfitLossChartAnalysisLossRow;
    public final RdsDataRowView optionsProfitLossChartAnalysisProfitRow;
    private final FrameLayout rootView;

    private FragmentOptionsProfitLossChartAnalysisBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView, RdsDataRowView rdsDataRowView, OptionsProfitLossChartView optionsProfitLossChartView, RdsButton rdsButton, RhTextView rhTextView, RdsButton rdsButton2, RdsDataRowView rdsDataRowView2, RdsDataRowView rdsDataRowView3) {
        this.rootView = frameLayout;
        this.loadingView = shimmerLoadingView;
        this.optionsProfitLossChartAnalysisBreakevenRow = rdsDataRowView;
        this.optionsProfitLossChartAnalysisChart = optionsProfitLossChartView;
        this.optionsProfitLossChartAnalysisDone = rdsButton;
        this.optionsProfitLossChartAnalysisExpectedProfitLoss = rhTextView;
        this.optionsProfitLossChartAnalysisLearnMore = rdsButton2;
        this.optionsProfitLossChartAnalysisLossRow = rdsDataRowView2;
        this.optionsProfitLossChartAnalysisProfitRow = rdsDataRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionsProfitLossChartAnalysisBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionsProfitLossChartAnalysisBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24771R.layout.fragment_options_profit_loss_chart_analysis, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionsProfitLossChartAnalysisBinding bind(View view) {
        int i = C24771R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C24771R.id.options_profit_loss_chart_analysis_breakeven_row;
            RdsDataRowView rdsDataRowView = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
            if (rdsDataRowView != null) {
                i = C24771R.id.options_profit_loss_chart_analysis_chart;
                OptionsProfitLossChartView optionsProfitLossChartView = (OptionsProfitLossChartView) ViewBindings.findChildViewById(view, i);
                if (optionsProfitLossChartView != null) {
                    i = C24771R.id.options_profit_loss_chart_analysis_done;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C24771R.id.options_profit_loss_chart_analysis_expected_profit_loss;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C24771R.id.options_profit_loss_chart_analysis_learn_more;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C24771R.id.options_profit_loss_chart_analysis_loss_row;
                                RdsDataRowView rdsDataRowView2 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsDataRowView2 != null) {
                                    i = C24771R.id.options_profit_loss_chart_analysis_profit_row;
                                    RdsDataRowView rdsDataRowView3 = (RdsDataRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsDataRowView3 != null) {
                                        return new FragmentOptionsProfitLossChartAnalysisBinding((FrameLayout) view, shimmerLoadingView, rdsDataRowView, optionsProfitLossChartView, rdsButton, rhTextView, rdsButton2, rdsDataRowView2, rdsDataRowView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
