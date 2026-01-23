package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.views.OptionsStrategyBidAskView;

/* loaded from: classes2.dex */
public final class IncludeOptionStrategyBidAskViewBinding implements ViewBinding {
    private final OptionsStrategyBidAskView rootView;
    public final OptionsStrategyBidAskView strategyBidAskView;

    private IncludeOptionStrategyBidAskViewBinding(OptionsStrategyBidAskView optionsStrategyBidAskView, OptionsStrategyBidAskView optionsStrategyBidAskView2) {
        this.rootView = optionsStrategyBidAskView;
        this.strategyBidAskView = optionsStrategyBidAskView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionsStrategyBidAskView getRoot() {
        return this.rootView;
    }

    public static IncludeOptionStrategyBidAskViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOptionStrategyBidAskViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.include_option_strategy_bid_ask_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOptionStrategyBidAskViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OptionsStrategyBidAskView optionsStrategyBidAskView = (OptionsStrategyBidAskView) view;
        return new IncludeOptionStrategyBidAskViewBinding(optionsStrategyBidAskView, optionsStrategyBidAskView);
    }
}
