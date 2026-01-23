package com.robinhood.android.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.widget.C31480R;

/* loaded from: classes9.dex */
public final class ActivityPortfolioWidgetConfigurationBinding implements ViewBinding {
    public final RdsButton addWidgetBtn;
    public final FrameLayout fragmentContainer;
    private final FrameLayout rootView;

    private ActivityPortfolioWidgetConfigurationBinding(FrameLayout frameLayout, RdsButton rdsButton, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.addWidgetBtn = rdsButton;
        this.fragmentContainer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPortfolioWidgetConfigurationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPortfolioWidgetConfigurationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31480R.layout.activity_portfolio_widget_configuration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPortfolioWidgetConfigurationBinding bind(View view) {
        int i = C31480R.id.add_widget_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C31480R.id.fragment_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new ActivityPortfolioWidgetConfigurationBinding((FrameLayout) view, rdsButton, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
