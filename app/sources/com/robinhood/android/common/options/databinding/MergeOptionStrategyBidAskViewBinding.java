package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeOptionStrategyBidAskViewBinding implements ViewBinding {
    public final View askBlock;
    public final Space askBlockPlaceholder;
    public final RhTextView askLabel;
    public final RhTextView askPrice;
    public final RhTextView askSize;
    public final FrameLayout bidAskDivider;
    public final View bidBlock;
    public final Space bidBlockPlaceholder;
    public final RhTextView bidLabel;
    public final RhTextView bidPrice;
    public final RhTextView bidSize;
    public final Guideline centerGuideline;
    private final View rootView;

    private MergeOptionStrategyBidAskViewBinding(View view, View view2, Space space, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, FrameLayout frameLayout, View view3, Space space2, RhTextView rhTextView4, RhTextView rhTextView5, RhTextView rhTextView6, Guideline guideline) {
        this.rootView = view;
        this.askBlock = view2;
        this.askBlockPlaceholder = space;
        this.askLabel = rhTextView;
        this.askPrice = rhTextView2;
        this.askSize = rhTextView3;
        this.bidAskDivider = frameLayout;
        this.bidBlock = view3;
        this.bidBlockPlaceholder = space2;
        this.bidLabel = rhTextView4;
        this.bidPrice = rhTextView5;
        this.bidSize = rhTextView6;
        this.centerGuideline = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyBidAskViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11303R.layout.merge_option_strategy_bid_ask_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeOptionStrategyBidAskViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11303R.id.ask_block;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = C11303R.id.ask_block_placeholder;
            Space space = (Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = C11303R.id.ask_label;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C11303R.id.ask_price;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C11303R.id.ask_size;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C11303R.id.bid_ask_divider;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11303R.id.bid_block))) != null) {
                                i = C11303R.id.bid_block_placeholder;
                                Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                if (space2 != null) {
                                    i = C11303R.id.bid_label;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C11303R.id.bid_price;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            i = C11303R.id.bid_size;
                                            RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView6 != null) {
                                                i = C11303R.id.center_guideline;
                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                if (guideline != null) {
                                                    return new MergeOptionStrategyBidAskViewBinding(view, viewFindChildViewById2, space, rhTextView, rhTextView2, rhTextView3, frameLayout, viewFindChildViewById, space2, rhTextView4, rhTextView5, rhTextView6, guideline);
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
