package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.databinding.IncludeEquityQuoteDividerBinding;
import com.robinhood.android.common.options.databinding.IncludeEquityQuoteDividerWithoutTopDividerBinding;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.EducationTourEntryPointView;
import com.robinhood.android.optionchain.tooltips.OptionChainTooltipView;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer;
import com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView;

/* loaded from: classes11.dex */
public final class FragmentOptionStrategyBuilderBinding implements ViewBinding {
    public final RdsTooltipView chainCustomizationTooltip;
    public final OptionChainTooltipView chainSettleOnOpenTooltip;
    public final DatePickerContainer datePickerContainer;
    public final EducationTourEntryPointView educationTourEntryPoint;
    public final ComposeView loadingView;
    public final TextView optionsStrategyBuilderHeader;
    public final View optionsStrategyBuilderTourAnchor;
    private final ConstraintLayout rootView;
    public final NotViewPagerRecyclerView strategyChainList;
    public final IncludeEquityQuoteDividerBinding strategyChainScrollIndicatorBottom;
    public final IncludeEquityQuoteDividerWithoutTopDividerBinding strategyChainScrollIndicatorTop;
    public final RecyclerView strategyFiltersRecyclerview;

    private FragmentOptionStrategyBuilderBinding(ConstraintLayout constraintLayout, RdsTooltipView rdsTooltipView, OptionChainTooltipView optionChainTooltipView, DatePickerContainer datePickerContainer, EducationTourEntryPointView educationTourEntryPointView, ComposeView composeView, TextView textView, View view, NotViewPagerRecyclerView notViewPagerRecyclerView, IncludeEquityQuoteDividerBinding includeEquityQuoteDividerBinding, IncludeEquityQuoteDividerWithoutTopDividerBinding includeEquityQuoteDividerWithoutTopDividerBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.chainCustomizationTooltip = rdsTooltipView;
        this.chainSettleOnOpenTooltip = optionChainTooltipView;
        this.datePickerContainer = datePickerContainer;
        this.educationTourEntryPoint = educationTourEntryPointView;
        this.loadingView = composeView;
        this.optionsStrategyBuilderHeader = textView;
        this.optionsStrategyBuilderTourAnchor = view;
        this.strategyChainList = notViewPagerRecyclerView;
        this.strategyChainScrollIndicatorBottom = includeEquityQuoteDividerBinding;
        this.strategyChainScrollIndicatorTop = includeEquityQuoteDividerWithoutTopDividerBinding;
        this.strategyFiltersRecyclerview = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionStrategyBuilderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionStrategyBuilderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.fragment_option_strategy_builder, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionStrategyBuilderBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C24876R.id.chain_customization_tooltip;
        RdsTooltipView rdsTooltipView = (RdsTooltipView) ViewBindings.findChildViewById(view, i);
        if (rdsTooltipView != null) {
            i = C24876R.id.chain_settle_on_open_tooltip;
            OptionChainTooltipView optionChainTooltipView = (OptionChainTooltipView) ViewBindings.findChildViewById(view, i);
            if (optionChainTooltipView != null) {
                i = C24876R.id.date_picker_container;
                DatePickerContainer datePickerContainer = (DatePickerContainer) ViewBindings.findChildViewById(view, i);
                if (datePickerContainer != null) {
                    i = C24876R.id.education_tour_entry_point;
                    EducationTourEntryPointView educationTourEntryPointView = (EducationTourEntryPointView) ViewBindings.findChildViewById(view, i);
                    if (educationTourEntryPointView != null) {
                        i = C24876R.id.loading_view;
                        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView != null) {
                            i = C24876R.id.options_strategy_builder_header;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24876R.id.options_strategy_builder_tour_anchor))) != null) {
                                i = C24876R.id.strategy_chain_list;
                                NotViewPagerRecyclerView notViewPagerRecyclerView = (NotViewPagerRecyclerView) ViewBindings.findChildViewById(view, i);
                                if (notViewPagerRecyclerView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C24876R.id.strategy_chain_scroll_indicator_bottom))) != null) {
                                    IncludeEquityQuoteDividerBinding includeEquityQuoteDividerBindingBind = IncludeEquityQuoteDividerBinding.bind(viewFindChildViewById2);
                                    i = C24876R.id.strategy_chain_scroll_indicator_top;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                                    if (viewFindChildViewById3 != null) {
                                        IncludeEquityQuoteDividerWithoutTopDividerBinding includeEquityQuoteDividerWithoutTopDividerBindingBind = IncludeEquityQuoteDividerWithoutTopDividerBinding.bind(viewFindChildViewById3);
                                        i = C24876R.id.strategy_filters_recyclerview;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            return new FragmentOptionStrategyBuilderBinding((ConstraintLayout) view, rdsTooltipView, optionChainTooltipView, datePickerContainer, educationTourEntryPointView, composeView, textView, viewFindChildViewById, notViewPagerRecyclerView, includeEquityQuoteDividerBindingBind, includeEquityQuoteDividerWithoutTopDividerBindingBind, recyclerView);
                                        }
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
