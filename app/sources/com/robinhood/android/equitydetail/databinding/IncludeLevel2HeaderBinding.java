package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.common.view.RhCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.leveltwo.Level2AxesView;
import com.robinhood.android.equitydetail.p123ui.leveltwo.Level2Graph;
import com.robinhood.android.equitydetail.p123ui.leveltwo.Level2HeaderView;

/* loaded from: classes3.dex */
public final class IncludeLevel2HeaderBinding implements ViewBinding {
    public final RhTextView bestAskLabelTxt;
    public final AnimatedRhTextView bestAskPriceTxt;
    public final RhTextView bestAskQuantityTxt;
    public final RhTextView bestBidLabelTxt;
    public final AnimatedRhTextView bestBidPriceTxt;
    public final RhTextView bestBidQuantityTxt;
    public final RhTextView bidsAsksLabelTxt;
    public final RhCardView graphCardview;
    public final Level2AxesView level2Axes;
    public final Level2Graph level2Graph;
    public final RhTextView priceLabelTxt;
    public final RhTextView priceTxt;
    private final Level2HeaderView rootView;
    public final Group scrubGroup;
    public final RhTextView sharesLabelTxt;
    public final RhTextView sharesTxt;
    public final Group staticGroup;
    public final RhTextView totalValueLabelTxt;
    public final RhTextView totalValueTxt;

    private IncludeLevel2HeaderBinding(Level2HeaderView level2HeaderView, RhTextView rhTextView, AnimatedRhTextView animatedRhTextView, RhTextView rhTextView2, RhTextView rhTextView3, AnimatedRhTextView animatedRhTextView2, RhTextView rhTextView4, RhTextView rhTextView5, RhCardView rhCardView, Level2AxesView level2AxesView, Level2Graph level2Graph, RhTextView rhTextView6, RhTextView rhTextView7, Group group, RhTextView rhTextView8, RhTextView rhTextView9, Group group2, RhTextView rhTextView10, RhTextView rhTextView11) {
        this.rootView = level2HeaderView;
        this.bestAskLabelTxt = rhTextView;
        this.bestAskPriceTxt = animatedRhTextView;
        this.bestAskQuantityTxt = rhTextView2;
        this.bestBidLabelTxt = rhTextView3;
        this.bestBidPriceTxt = animatedRhTextView2;
        this.bestBidQuantityTxt = rhTextView4;
        this.bidsAsksLabelTxt = rhTextView5;
        this.graphCardview = rhCardView;
        this.level2Axes = level2AxesView;
        this.level2Graph = level2Graph;
        this.priceLabelTxt = rhTextView6;
        this.priceTxt = rhTextView7;
        this.scrubGroup = group;
        this.sharesLabelTxt = rhTextView8;
        this.sharesTxt = rhTextView9;
        this.staticGroup = group2;
        this.totalValueLabelTxt = rhTextView10;
        this.totalValueTxt = rhTextView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Level2HeaderView getRoot() {
        return this.rootView;
    }

    public static IncludeLevel2HeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeLevel2HeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.include_level_2_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeLevel2HeaderBinding bind(View view) {
        int i = C15314R.id.best_ask_label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.best_ask_price_txt;
            AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
            if (animatedRhTextView != null) {
                i = C15314R.id.best_ask_quantity_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C15314R.id.best_bid_label_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C15314R.id.best_bid_price_txt;
                        AnimatedRhTextView animatedRhTextView2 = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                        if (animatedRhTextView2 != null) {
                            i = C15314R.id.best_bid_quantity_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C15314R.id.bids_asks_label_txt;
                                RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView5 != null) {
                                    i = C15314R.id.graph_cardview;
                                    RhCardView rhCardView = (RhCardView) ViewBindings.findChildViewById(view, i);
                                    if (rhCardView != null) {
                                        i = C15314R.id.level_2_axes;
                                        Level2AxesView level2AxesView = (Level2AxesView) ViewBindings.findChildViewById(view, i);
                                        if (level2AxesView != null) {
                                            i = C15314R.id.level_2_graph;
                                            Level2Graph level2Graph = (Level2Graph) ViewBindings.findChildViewById(view, i);
                                            if (level2Graph != null) {
                                                i = C15314R.id.price_label_txt;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    i = C15314R.id.price_txt;
                                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView7 != null) {
                                                        i = C15314R.id.scrub_group;
                                                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                        if (group != null) {
                                                            i = C15314R.id.shares_label_txt;
                                                            RhTextView rhTextView8 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                            if (rhTextView8 != null) {
                                                                i = C15314R.id.shares_txt;
                                                                RhTextView rhTextView9 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                if (rhTextView9 != null) {
                                                                    i = C15314R.id.static_group;
                                                                    Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                                                    if (group2 != null) {
                                                                        i = C15314R.id.total_value_label_txt;
                                                                        RhTextView rhTextView10 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (rhTextView10 != null) {
                                                                            i = C15314R.id.total_value_txt;
                                                                            RhTextView rhTextView11 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (rhTextView11 != null) {
                                                                                return new IncludeLevel2HeaderBinding((Level2HeaderView) view, rhTextView, animatedRhTextView, rhTextView2, rhTextView3, animatedRhTextView2, rhTextView4, rhTextView5, rhCardView, level2AxesView, level2Graph, rhTextView6, rhTextView7, group, rhTextView8, rhTextView9, group2, rhTextView10, rhTextView11);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
