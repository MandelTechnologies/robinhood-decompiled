package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentTradeOnExpirationUpsellBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RhTextView tradeOnExpirationIcon3;
    public final RdsRowView tradeOnExpirationRow;
    public final LinearLayout tradeOnExpirationRow2;
    public final RhTextView tradeOnExpirationSubtitle;
    public final RhTextView tradeOnExpirationTitle;

    private FragmentTradeOnExpirationUpsellBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsRowView rdsRowView, LinearLayout linearLayout2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.tradeOnExpirationIcon3 = rhTextView;
        this.tradeOnExpirationRow = rdsRowView;
        this.tradeOnExpirationRow2 = linearLayout2;
        this.tradeOnExpirationSubtitle = rhTextView2;
        this.tradeOnExpirationTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTradeOnExpirationUpsellBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTradeOnExpirationUpsellBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.fragment_trade_on_expiration_upsell, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTradeOnExpirationUpsellBinding bind(View view) {
        int i = C11303R.id.trade_on_expiration_icon_3;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11303R.id.trade_on_expiration_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                i = C11303R.id.trade_on_expiration_row_2;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C11303R.id.trade_on_expiration_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C11303R.id.trade_on_expiration_title;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentTradeOnExpirationUpsellBinding((LinearLayout) view, rhTextView, rdsRowView, linearLayout, rhTextView2, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
