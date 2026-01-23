package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowView;

/* loaded from: classes8.dex */
public final class IncludeOrderConfirmationRowViewBinding implements ViewBinding {
    private final OrderConfirmationRowView rootView;

    private IncludeOrderConfirmationRowViewBinding(OrderConfirmationRowView orderConfirmationRowView) {
        this.rootView = orderConfirmationRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public OrderConfirmationRowView getRoot() {
        return this.rootView;
    }

    public static IncludeOrderConfirmationRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeOrderConfirmationRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.include_order_confirmation_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeOrderConfirmationRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeOrderConfirmationRowViewBinding((OrderConfirmationRowView) view);
    }
}
