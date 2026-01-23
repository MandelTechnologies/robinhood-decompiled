package com.robinhood.android.indexes.detail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.indexes.detail.C18813R;
import com.robinhood.android.lib.trade.view.TradeBarOverlayView;

/* loaded from: classes10.dex */
public final class IncludeIndexDetailPageTradeBarBinding implements ViewBinding {
    public final TradeBarOverlayView buySellOverlay;
    private final ConstraintLayout rootView;
    public final View tradeBarTopDivider;

    private IncludeIndexDetailPageTradeBarBinding(ConstraintLayout constraintLayout, TradeBarOverlayView tradeBarOverlayView, View view) {
        this.rootView = constraintLayout;
        this.buySellOverlay = tradeBarOverlayView;
        this.tradeBarTopDivider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeIndexDetailPageTradeBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeIndexDetailPageTradeBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C18813R.layout.include_index_detail_page_trade_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeIndexDetailPageTradeBarBinding bind(View view) {
        View viewFindChildViewById;
        int i = C18813R.id.buy_sell_overlay;
        TradeBarOverlayView tradeBarOverlayView = (TradeBarOverlayView) ViewBindings.findChildViewById(view, i);
        if (tradeBarOverlayView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C18813R.id.trade_bar_top_divider))) != null) {
            return new IncludeIndexDetailPageTradeBarBinding((ConstraintLayout) view, tradeBarOverlayView, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
