package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemView;

/* loaded from: classes5.dex */
public final class IncludeMarketIndicatorItemViewBinding implements ViewBinding {
    private final MarketIndicatorItemView rootView;

    private IncludeMarketIndicatorItemViewBinding(MarketIndicatorItemView marketIndicatorItemView) {
        this.rootView = marketIndicatorItemView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public MarketIndicatorItemView getRoot() {
        return this.rootView;
    }

    public static IncludeMarketIndicatorItemViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMarketIndicatorItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27909R.layout.include_market_indicator_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMarketIndicatorItemViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMarketIndicatorItemViewBinding((MarketIndicatorItemView) view);
    }
}
