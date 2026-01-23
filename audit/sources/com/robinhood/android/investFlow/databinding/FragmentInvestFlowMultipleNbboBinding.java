package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.tickerinputview.TickerInputView;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowMultipleNbboBinding implements ViewBinding {
    public final TickerInputView amountView;
    public final View divider;
    public final ShimmerLoadingView investFlowNbboLoadingView;
    public final RhTextView itemCount;
    public final RhTextView nbboInfoTxt;
    public final RhTextView nbboRefreshTxt;
    public final RhTextView orderSummaryDescription;
    public final RdsTextButton orderSummaryShowMoreBtn;
    public final RhTextView orderSummaryTitle;
    public final RecyclerView recyclerView;
    public final LinearLayout refreshContainer;
    public final RdsButton reviewBtn;
    private final ConstraintLayout rootView;
    public final RhTextView titleTxt;

    private FragmentInvestFlowMultipleNbboBinding(ConstraintLayout constraintLayout, TickerInputView tickerInputView, View view, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4, RdsTextButton rdsTextButton, RhTextView rhTextView5, RecyclerView recyclerView, LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView6) {
        this.rootView = constraintLayout;
        this.amountView = tickerInputView;
        this.divider = view;
        this.investFlowNbboLoadingView = shimmerLoadingView;
        this.itemCount = rhTextView;
        this.nbboInfoTxt = rhTextView2;
        this.nbboRefreshTxt = rhTextView3;
        this.orderSummaryDescription = rhTextView4;
        this.orderSummaryShowMoreBtn = rdsTextButton;
        this.orderSummaryTitle = rhTextView5;
        this.recyclerView = recyclerView;
        this.refreshContainer = linearLayout;
        this.reviewBtn = rdsButton;
        this.titleTxt = rhTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowMultipleNbboBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowMultipleNbboBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_multiple_nbbo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowMultipleNbboBinding bind(View view) {
        View viewFindChildViewById;
        int i = C19349R.id.amount_view;
        TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
        if (tickerInputView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C19349R.id.divider))) != null) {
            i = C19349R.id.invest_flow_nbbo_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C19349R.id.item_count;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C19349R.id.nbbo_info_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C19349R.id.nbbo_refresh_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C19349R.id.order_summary_description;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C19349R.id.order_summary_show_more_btn;
                                RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
                                if (rdsTextButton != null) {
                                    i = C19349R.id.order_summary_title;
                                    RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView5 != null) {
                                        i = C19349R.id.recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = C19349R.id.refresh_container;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C19349R.id.review_btn;
                                                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                                                if (rdsButton != null) {
                                                    i = C19349R.id.title_txt;
                                                    RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView6 != null) {
                                                        return new FragmentInvestFlowMultipleNbboBinding((ConstraintLayout) view, tickerInputView, viewFindChildViewById, shimmerLoadingView, rhTextView, rhTextView2, rhTextView3, rhTextView4, rdsTextButton, rhTextView5, recyclerView, linearLayout, rdsButton, rhTextView6);
                                                    }
                                                }
                                            }
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
