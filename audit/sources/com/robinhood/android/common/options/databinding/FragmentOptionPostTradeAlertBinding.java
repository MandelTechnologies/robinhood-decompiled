package com.robinhood.android.common.options.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentOptionPostTradeAlertBinding implements ViewBinding {
    public final RdsCardView cardView;
    public final RdsButton notNowBtn;
    public final RdsButton okBtn;
    private final FrameLayout rootView;
    public final RhTextView setupAlertSummary;
    public final RhTextView setupAlertTitle;

    private FragmentOptionPostTradeAlertBinding(FrameLayout frameLayout, RdsCardView rdsCardView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = frameLayout;
        this.cardView = rdsCardView;
        this.notNowBtn = rdsButton;
        this.okBtn = rdsButton2;
        this.setupAlertSummary = rhTextView;
        this.setupAlertTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionPostTradeAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionPostTradeAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11303R.layout.fragment_option_post_trade_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionPostTradeAlertBinding bind(View view) {
        int i = C11303R.id.card_view;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            i = C11303R.id.not_now_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C11303R.id.ok_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C11303R.id.setup_alert_summary;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C11303R.id.setup_alert_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentOptionPostTradeAlertBinding((FrameLayout) view, rdsCardView, rdsButton, rdsButton2, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
