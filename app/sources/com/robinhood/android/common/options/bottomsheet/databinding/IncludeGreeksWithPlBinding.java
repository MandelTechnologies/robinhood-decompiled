package com.robinhood.android.common.options.bottomsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.options.bottomsheet.C11312R;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossView;

/* loaded from: classes2.dex */
public final class IncludeGreeksWithPlBinding implements ViewBinding {
    private final OptionsProfitLossView rootView;
    public final OptionsProfitLossView shoppingCartProfitLoss;

    private IncludeGreeksWithPlBinding(OptionsProfitLossView optionsProfitLossView, OptionsProfitLossView optionsProfitLossView2) {
        this.rootView = optionsProfitLossView;
        this.shoppingCartProfitLoss = optionsProfitLossView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OptionsProfitLossView getRoot() {
        return this.rootView;
    }

    public static IncludeGreeksWithPlBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeGreeksWithPlBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11312R.layout.include_greeks_with_pl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeGreeksWithPlBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OptionsProfitLossView optionsProfitLossView = (OptionsProfitLossView) view;
        return new IncludeGreeksWithPlBinding(optionsProfitLossView, optionsProfitLossView);
    }
}
