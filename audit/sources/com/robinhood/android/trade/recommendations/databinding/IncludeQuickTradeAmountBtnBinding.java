package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class IncludeQuickTradeAmountBtnBinding implements ViewBinding {
    private final RdsButton rootView;

    private IncludeQuickTradeAmountBtnBinding(RdsButton rdsButton) {
        this.rootView = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsButton getRoot() {
        return this.rootView;
    }

    public static IncludeQuickTradeAmountBtnBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeQuickTradeAmountBtnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.include_quick_trade_amount_btn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeQuickTradeAmountBtnBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeQuickTradeAmountBtnBinding((RdsButton) view);
    }
}
