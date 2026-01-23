package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.lib.trade.view.TradeBarOverlayView;

/* loaded from: classes3.dex */
public final class FragmentInstrumentDetailTradeBarBinding implements ViewBinding {
    public final TradeBarOverlayView buySellOverlay;
    private final CoordinatorLayout rootView;
    public final CoordinatorLayout tradeBarContainer;

    private FragmentInstrumentDetailTradeBarBinding(CoordinatorLayout coordinatorLayout, TradeBarOverlayView tradeBarOverlayView, CoordinatorLayout coordinatorLayout2) {
        this.rootView = coordinatorLayout;
        this.buySellOverlay = tradeBarOverlayView;
        this.tradeBarContainer = coordinatorLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInstrumentDetailTradeBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInstrumentDetailTradeBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_instrument_detail_trade_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInstrumentDetailTradeBarBinding bind(View view) {
        int i = C15314R.id.buy_sell_overlay;
        TradeBarOverlayView tradeBarOverlayView = (TradeBarOverlayView) ViewBindings.findChildViewById(view, i);
        if (tradeBarOverlayView != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            return new FragmentInstrumentDetailTradeBarBinding(coordinatorLayout, tradeBarOverlayView, coordinatorLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
