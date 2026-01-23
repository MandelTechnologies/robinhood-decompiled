package com.robinhood.android.crypto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.common.view.CandlestickChartView;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.graph.IntervalSelectorLayout;
import com.robinhood.android.graph.spark.GraphView;

/* loaded from: classes2.dex */
public final class IncludeCryptoGraphLayoutBinding implements ViewBinding {
    public final RhTextView graphHeaderTitleTxt;
    public final Barrier graphLayoutBarrier;
    public final ViewStub graphLayoutCandlestickDetail;
    public final RhTextView graphLayoutCandlestickScrubbedTxt;
    public final CandlestickChartView graphLayoutCandlestickView;
    public final RhTextView graphLayoutChangeInfoTxt;
    public final GraphView graphLayoutGraphView;
    public final ImageView graphLayoutToggleChartBtn;
    public final AnimatedRhTextView graphLayoutTotalMoneyTxt;
    public final LinearLayout intervalSelectorContainer;
    public final IntervalSelectorLayout intervalSelectorLayout;
    private final ConstraintLayout rootView;

    private IncludeCryptoGraphLayoutBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, Barrier barrier, ViewStub viewStub, RhTextView rhTextView2, CandlestickChartView candlestickChartView, RhTextView rhTextView3, GraphView graphView, ImageView imageView, AnimatedRhTextView animatedRhTextView, LinearLayout linearLayout, IntervalSelectorLayout intervalSelectorLayout) {
        this.rootView = constraintLayout;
        this.graphHeaderTitleTxt = rhTextView;
        this.graphLayoutBarrier = barrier;
        this.graphLayoutCandlestickDetail = viewStub;
        this.graphLayoutCandlestickScrubbedTxt = rhTextView2;
        this.graphLayoutCandlestickView = candlestickChartView;
        this.graphLayoutChangeInfoTxt = rhTextView3;
        this.graphLayoutGraphView = graphView;
        this.graphLayoutToggleChartBtn = imageView;
        this.graphLayoutTotalMoneyTxt = animatedRhTextView;
        this.intervalSelectorContainer = linearLayout;
        this.intervalSelectorLayout = intervalSelectorLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeCryptoGraphLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCryptoGraphLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C12757R.layout.include_crypto_graph_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCryptoGraphLayoutBinding bind(View view) {
        int i = C12757R.id.graph_header_title_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C12757R.id.graph_layout_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C12757R.id.graph_layout_candlestick_detail;
                ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub != null) {
                    i = C12757R.id.graph_layout_candlestick_scrubbed_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C12757R.id.graph_layout_candlestick_view;
                        CandlestickChartView candlestickChartView = (CandlestickChartView) ViewBindings.findChildViewById(view, i);
                        if (candlestickChartView != null) {
                            i = C12757R.id.graph_layout_change_info_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C12757R.id.graph_layout_graph_view;
                                GraphView graphView = (GraphView) ViewBindings.findChildViewById(view, i);
                                if (graphView != null) {
                                    i = C12757R.id.graph_layout_toggle_chart_btn;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C12757R.id.graph_layout_total_money_txt;
                                        AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                                        if (animatedRhTextView != null) {
                                            i = C12757R.id.interval_selector_container;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C12757R.id.interval_selector_layout;
                                                IntervalSelectorLayout intervalSelectorLayout = (IntervalSelectorLayout) ViewBindings.findChildViewById(view, i);
                                                if (intervalSelectorLayout != null) {
                                                    return new IncludeCryptoGraphLayoutBinding((ConstraintLayout) view, rhTextView, barrier, viewStub, rhTextView2, candlestickChartView, rhTextView3, graphView, imageView, animatedRhTextView, linearLayout, intervalSelectorLayout);
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
