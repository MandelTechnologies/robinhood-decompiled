package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class MergeRecommendationsOrderBinding implements ViewBinding {
    public final TickerInputView amountView;
    public final Barrier bottomBarrier;
    public final RhTextView buyingPowerAvailable;
    public final RhTextView dollarInputErrorTxt;
    public final RhTextView dollarInputInfoTxt;
    public final Guideline guideline;
    public final RecyclerView list;
    public final LinearLayout nbboInfoContainer;
    public final RhTextView nbboInfoTxt;
    public final RhTextView nbboRefreshTxt;
    public final RhTextView orderSummaryDescription;
    public final RhTextView orderSummarySubtitle;
    public final RhTextView orderSummaryTitle;
    private final View rootView;
    public final RhTextView titleTxt;
    public final Barrier topBarrier;

    private MergeRecommendationsOrderBinding(View view, TickerInputView tickerInputView, Barrier barrier, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, Guideline guideline, RecyclerView recyclerView, LinearLayout linearLayout, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, RhTextView rhTextView7, RhTextView rhTextView8, RhTextView rhTextView9, Barrier barrier2) {
        this.rootView = view;
        this.amountView = tickerInputView;
        this.bottomBarrier = barrier;
        this.buyingPowerAvailable = rhTextView;
        this.dollarInputErrorTxt = rhTextView2;
        this.dollarInputInfoTxt = rhTextView3;
        this.guideline = guideline;
        this.list = recyclerView;
        this.nbboInfoContainer = linearLayout;
        this.nbboInfoTxt = rhTextView4;
        this.nbboRefreshTxt = rhTextView5;
        this.orderSummaryDescription = rhTextView6;
        this.orderSummarySubtitle = rhTextView7;
        this.orderSummaryTitle = rhTextView8;
        this.titleTxt = rhTextView9;
        this.topBarrier = barrier2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRecommendationsOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29895R.layout.merge_recommendations_order, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRecommendationsOrderBinding bind(View view) {
        int i = C29895R.id.amount_view;
        TickerInputView tickerInputView = (TickerInputView) ViewBindings.findChildViewById(view, i);
        if (tickerInputView != null) {
            i = C29895R.id.bottom_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C29895R.id.buying_power_available;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C29895R.id.dollar_input_error_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C29895R.id.dollar_input_info_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C29895R.id.guideline;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = C29895R.id.list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C29895R.id.nbbo_info_container;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C29895R.id.nbbo_info_txt;
                                        RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView4 != null) {
                                            i = C29895R.id.nbbo_refresh_txt;
                                            RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView5 != null) {
                                                i = C29895R.id.order_summary_description;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    i = C29895R.id.order_summary_subtitle;
                                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView7 != null) {
                                                        i = C29895R.id.order_summary_title;
                                                        RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView8 != null) {
                                                            i = C29895R.id.title_txt;
                                                            RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView9 != null) {
                                                                i = C29895R.id.top_barrier;
                                                                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                                                if (barrier2 != null) {
                                                                    return new MergeRecommendationsOrderBinding(view, tickerInputView, barrier, rhTextView, rhTextView2, rhTextView3, guideline, recyclerView, linearLayout, rhTextView4, rhTextView5, rhTextView6, rhTextView7, rhTextView8, rhTextView9, barrier2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
