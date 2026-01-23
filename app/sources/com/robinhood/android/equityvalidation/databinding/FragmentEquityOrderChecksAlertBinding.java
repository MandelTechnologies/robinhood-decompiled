package com.robinhood.android.equityvalidation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertView;
import com.robinhood.android.equityvalidation.C16020R;

/* loaded from: classes3.dex */
public final class FragmentEquityOrderChecksAlertBinding implements ViewBinding {
    public final EquityOrderChecksAlertView alertView;
    private final FrameLayout rootView;

    private FragmentEquityOrderChecksAlertBinding(FrameLayout frameLayout, EquityOrderChecksAlertView equityOrderChecksAlertView) {
        this.rootView = frameLayout;
        this.alertView = equityOrderChecksAlertView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEquityOrderChecksAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEquityOrderChecksAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16020R.layout.fragment_equity_order_checks_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEquityOrderChecksAlertBinding bind(View view) {
        int i = C16020R.id.alert_view;
        EquityOrderChecksAlertView equityOrderChecksAlertView = (EquityOrderChecksAlertView) ViewBindings.findChildViewById(view, i);
        if (equityOrderChecksAlertView != null) {
            return new FragmentEquityOrderChecksAlertBinding((FrameLayout) view, equityOrderChecksAlertView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
