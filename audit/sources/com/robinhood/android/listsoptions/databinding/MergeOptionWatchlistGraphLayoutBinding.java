package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.graph.IntervalSelectorLayout;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistTimeframeLineView;

/* loaded from: classes8.dex */
public final class MergeOptionWatchlistGraphLayoutBinding implements ViewBinding {
    public final ConstraintLayout content;
    public final ConstraintLayout graphHeaderContent;
    public final ImageView graphHeaderDirectionIcon;
    public final RhTextView graphHeaderTitleTxt;
    public final RhTextView graphLayoutChangeInfoTxt;
    public final GraphView graphLayoutGraphView;
    public final AnimatedRhTextView graphLayoutTotalMoneyTxt;
    public final IntervalSelectorLayout intervalSelectorLayout;
    private final View rootView;
    public final RhTextView timeframeEndTxt;
    public final OptionWatchlistTimeframeLineView timeframeLine;
    public final RhTextView timeframeStartTxt;

    private MergeOptionWatchlistGraphLayoutBinding(View view, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, GraphView graphView, AnimatedRhTextView animatedRhTextView, IntervalSelectorLayout intervalSelectorLayout, RhTextView rhTextView3, OptionWatchlistTimeframeLineView optionWatchlistTimeframeLineView, RhTextView rhTextView4) {
        this.rootView = view;
        this.content = constraintLayout;
        this.graphHeaderContent = constraintLayout2;
        this.graphHeaderDirectionIcon = imageView;
        this.graphHeaderTitleTxt = rhTextView;
        this.graphLayoutChangeInfoTxt = rhTextView2;
        this.graphLayoutGraphView = graphView;
        this.graphLayoutTotalMoneyTxt = animatedRhTextView;
        this.intervalSelectorLayout = intervalSelectorLayout;
        this.timeframeEndTxt = rhTextView3;
        this.timeframeLine = optionWatchlistTimeframeLineView;
        this.timeframeStartTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionWatchlistGraphLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20943R.layout.merge_option_watchlist_graph_layout, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionWatchlistGraphLayoutBinding bind(View view) {
        int i = C20943R.id.content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C20943R.id.graph_header_content;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C20943R.id.graph_header_direction_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C20943R.id.graph_header_title_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C20943R.id.graph_layout_change_info_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C20943R.id.graph_layout_graph_view;
                            GraphView graphView = (GraphView) ViewBindings.findChildViewById(view, i);
                            if (graphView != null) {
                                i = C20943R.id.graph_layout_total_money_txt;
                                AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                                if (animatedRhTextView != null) {
                                    i = C20943R.id.interval_selector_layout;
                                    IntervalSelectorLayout intervalSelectorLayout = (IntervalSelectorLayout) ViewBindings.findChildViewById(view, i);
                                    if (intervalSelectorLayout != null) {
                                        i = C20943R.id.timeframe_end_txt;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C20943R.id.timeframe_line;
                                            OptionWatchlistTimeframeLineView optionWatchlistTimeframeLineView = (OptionWatchlistTimeframeLineView) ViewBindings.findChildViewById(view, i);
                                            if (optionWatchlistTimeframeLineView != null) {
                                                i = C20943R.id.timeframe_start_txt;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    return new MergeOptionWatchlistGraphLayoutBinding(view, constraintLayout, constraintLayout2, imageView, rhTextView, rhTextView2, graphView, animatedRhTextView, intervalSelectorLayout, rhTextView3, optionWatchlistTimeframeLineView, rhTextView4);
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
