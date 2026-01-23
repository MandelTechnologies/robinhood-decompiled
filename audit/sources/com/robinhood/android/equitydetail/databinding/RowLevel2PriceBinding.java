package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.RhCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class RowLevel2PriceBinding implements ViewBinding {
    public final RhTextView askPriceTxt;
    public final RhTextView askQuantityTxt;
    public final RhTextView bidPriceTxt;
    public final RhTextView bidQuantityTxt;
    private final RhCardView rootView;

    private RowLevel2PriceBinding(RhCardView rhCardView, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = rhCardView;
        this.askPriceTxt = rhTextView;
        this.askQuantityTxt = rhTextView2;
        this.bidPriceTxt = rhTextView3;
        this.bidQuantityTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhCardView getRoot() {
        return this.rootView;
    }

    public static RowLevel2PriceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowLevel2PriceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.row_level_2_price, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowLevel2PriceBinding bind(View view) {
        int i = C15314R.id.ask_price_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C15314R.id.ask_quantity_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C15314R.id.bid_price_txt;
                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView3 != null) {
                    i = C15314R.id.bid_quantity_txt;
                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView4 != null) {
                        return new RowLevel2PriceBinding((RhCardView) view, rhTextView, rhTextView2, rhTextView3, rhTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
