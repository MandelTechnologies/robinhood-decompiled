package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class ActivityEquityOrderBinding implements ViewBinding {
    public final LinearLayout equityOrderContent;
    public final FrameLayout fragmentContainer;
    private final LinearLayout rootView;

    private ActivityEquityOrderBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.equityOrderContent = linearLayout2;
        this.fragmentContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEquityOrderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEquityOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.activity_equity_order, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEquityOrderBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C20649R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityEquityOrderBinding(linearLayout, linearLayout, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
