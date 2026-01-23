package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advancedchart.AdvancedChartView;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.InstrumentSpanSelectorView;
import com.robinhood.shared.iac.infobanner.InfoBannerComponentView;

/* loaded from: classes24.dex */
public final class FragmentAdvancedChartParentBinding implements ViewBinding {
    public final AdvancedChartView advancedChartView;
    public final ConstraintLayout chartLayout;
    public final LinearLayoutCompat indicatorListView;
    public final RecyclerView indicatorRecyclerView;
    public final InfoBannerComponentView infoBannerView;
    public final Guideline intervalBottomGuideline;
    private final FrameLayout rootView;
    public final InstrumentSpanSelectorView spanSelector;
    public final FrameLayout tradeBarContainer;

    private FragmentAdvancedChartParentBinding(FrameLayout frameLayout, AdvancedChartView advancedChartView, ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, InfoBannerComponentView infoBannerComponentView, Guideline guideline, InstrumentSpanSelectorView instrumentSpanSelectorView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.advancedChartView = advancedChartView;
        this.chartLayout = constraintLayout;
        this.indicatorListView = linearLayoutCompat;
        this.indicatorRecyclerView = recyclerView;
        this.infoBannerView = infoBannerComponentView;
        this.intervalBottomGuideline = guideline;
        this.spanSelector = instrumentSpanSelectorView;
        this.tradeBarContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAdvancedChartParentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAdvancedChartParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.fragment_advanced_chart_parent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAdvancedChartParentBinding bind(View view) {
        int i = C8502R.id.advanced_chart_view;
        AdvancedChartView advancedChartView = (AdvancedChartView) ViewBindings.findChildViewById(view, i);
        if (advancedChartView != null) {
            i = C8502R.id.chart_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C8502R.id.indicator_list_view;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C8502R.id.indicator_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C8502R.id.info_banner_view;
                        InfoBannerComponentView infoBannerComponentView = (InfoBannerComponentView) ViewBindings.findChildViewById(view, i);
                        if (infoBannerComponentView != null) {
                            i = C8502R.id.interval_bottom_guideline;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = C8502R.id.span_selector;
                                InstrumentSpanSelectorView instrumentSpanSelectorView = (InstrumentSpanSelectorView) ViewBindings.findChildViewById(view, i);
                                if (instrumentSpanSelectorView != null) {
                                    i = C8502R.id.trade_bar_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        return new FragmentAdvancedChartParentBinding((FrameLayout) view, advancedChartView, constraintLayout, linearLayoutCompat, recyclerView, infoBannerComponentView, guideline, instrumentSpanSelectorView, frameLayout);
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
