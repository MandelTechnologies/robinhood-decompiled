package com.robinhood.android.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.widget.C31480R;

/* loaded from: classes9.dex */
public final class WidgetHoldingsDividerRowBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final LinearLayout widgetHoldingsDivider;

    private WidgetHoldingsDividerRowBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.widgetHoldingsDivider = linearLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static WidgetHoldingsDividerRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetHoldingsDividerRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31480R.layout.widget_holdings_divider_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static WidgetHoldingsDividerRowBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new WidgetHoldingsDividerRowBinding(linearLayout, linearLayout);
    }
}
