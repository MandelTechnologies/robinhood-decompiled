package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class IncludeToolbarEquityOrderLabelBinding implements ViewBinding {
    public final FrameLayout orderLabelContent;
    public final RhTextView orderLabelTxt;
    private final FrameLayout rootView;

    private IncludeToolbarEquityOrderLabelBinding(FrameLayout frameLayout, FrameLayout frameLayout2, RhTextView rhTextView) {
        this.rootView = frameLayout;
        this.orderLabelContent = frameLayout2;
        this.orderLabelTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeToolbarEquityOrderLabelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeToolbarEquityOrderLabelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.include_toolbar_equity_order_label, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeToolbarEquityOrderLabelBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C20649R.id.order_label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new IncludeToolbarEquityOrderLabelBinding(frameLayout, frameLayout, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
