package com.robinhood.android.common.options.tradebar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.tradebar.C11453R;
import com.robinhood.android.lib.trade.view.TradeBarOverlayView;

/* loaded from: classes2.dex */
public final class IncludeOptionsDetailPageTradeBarBinding implements ViewBinding {
    public final TradeBarOverlayView buySellOverlay;
    private final ConstraintLayout rootView;
    public final View tradeBarTopDivider;

    private IncludeOptionsDetailPageTradeBarBinding(ConstraintLayout constraintLayout, TradeBarOverlayView tradeBarOverlayView, View view) {
        this.rootView = constraintLayout;
        this.buySellOverlay = tradeBarOverlayView;
        this.tradeBarTopDivider = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeOptionsDetailPageTradeBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionsDetailPageTradeBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11453R.layout.include_options_detail_page_trade_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionsDetailPageTradeBarBinding bind(View view) {
        View viewFindChildViewById;
        int i = C11453R.id.buy_sell_overlay;
        TradeBarOverlayView tradeBarOverlayView = (TradeBarOverlayView) ViewBindings.findChildViewById(view, i);
        if (tradeBarOverlayView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11453R.id.trade_bar_top_divider))) != null) {
            return new IncludeOptionsDetailPageTradeBarBinding((ConstraintLayout) view, tradeBarOverlayView, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
