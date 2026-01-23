package com.robinhood.android.ordersummary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.ordersummary.C25242R;
import com.robinhood.android.ordersummary.p211ui.OrderSummarySectionView;

/* loaded from: classes11.dex */
public final class IncludeOrderSummarySectionBinding implements ViewBinding {
    private final OrderSummarySectionView rootView;

    private IncludeOrderSummarySectionBinding(OrderSummarySectionView orderSummarySectionView) {
        this.rootView = orderSummarySectionView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OrderSummarySectionView getRoot() {
        return this.rootView;
    }

    public static IncludeOrderSummarySectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOrderSummarySectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25242R.layout.include_order_summary_section, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOrderSummarySectionBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOrderSummarySectionBinding((OrderSummarySectionView) view);
    }
}
