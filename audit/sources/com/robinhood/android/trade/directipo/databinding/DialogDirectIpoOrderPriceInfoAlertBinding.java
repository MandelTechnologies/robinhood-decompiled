package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class DialogDirectIpoOrderPriceInfoAlertBinding implements ViewBinding {
    public final RhTextView priceInfoAlertDescription;
    public final RdsButton priceInfoAlertDismiss;
    public final RecyclerView priceInfoAlertRecyclerView;
    public final RhTextView priceInfoAlertTitle;
    private final LinearLayout rootView;

    private DialogDirectIpoOrderPriceInfoAlertBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.priceInfoAlertDescription = rhTextView;
        this.priceInfoAlertDismiss = rdsButton;
        this.priceInfoAlertRecyclerView = recyclerView;
        this.priceInfoAlertTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogDirectIpoOrderPriceInfoAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogDirectIpoOrderPriceInfoAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.dialog_direct_ipo_order_price_info_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogDirectIpoOrderPriceInfoAlertBinding bind(View view) {
        int i = C29323R.id.price_info_alert_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C29323R.id.price_info_alert_dismiss;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C29323R.id.price_info_alert_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C29323R.id.price_info_alert_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new DialogDirectIpoOrderPriceInfoAlertBinding((LinearLayout) view, rhTextView, rdsButton, recyclerView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
