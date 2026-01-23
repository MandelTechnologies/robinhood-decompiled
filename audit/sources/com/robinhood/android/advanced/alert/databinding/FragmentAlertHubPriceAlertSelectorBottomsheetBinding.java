package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAlertHubPriceAlertSelectorBottomsheetBinding implements ViewBinding {
    public final RhTextView advancedAlertTitle;
    public final ImageView priceAboveCaret;
    public final RdsRippleContainerView priceAboveContainer;
    public final RhTextView priceAboveTitle;
    public final ImageView priceBelowCaret;
    public final RdsRippleContainerView priceBelowContainer;
    public final RhTextView priceBelowTitle;
    private final ConstraintLayout rootView;

    private FragmentAlertHubPriceAlertSelectorBottomsheetBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, ImageView imageView, RdsRippleContainerView rdsRippleContainerView, RhTextView rhTextView2, ImageView imageView2, RdsRippleContainerView rdsRippleContainerView2, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.advancedAlertTitle = rhTextView;
        this.priceAboveCaret = imageView;
        this.priceAboveContainer = rdsRippleContainerView;
        this.priceAboveTitle = rhTextView2;
        this.priceBelowCaret = imageView2;
        this.priceBelowContainer = rdsRippleContainerView2;
        this.priceBelowTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAlertHubPriceAlertSelectorBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAlertHubPriceAlertSelectorBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.fragment_alert_hub_price_alert_selector_bottomsheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAlertHubPriceAlertSelectorBottomsheetBinding bind(View view) {
        int i = C8387R.id.advanced_alert_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C8387R.id.price_above_caret;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8387R.id.price_above_container;
                RdsRippleContainerView rdsRippleContainerView = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsRippleContainerView != null) {
                    i = C8387R.id.price_above_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C8387R.id.price_below_caret;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C8387R.id.price_below_container;
                            RdsRippleContainerView rdsRippleContainerView2 = (RdsRippleContainerView) ViewBindings.findChildViewById(view, i);
                            if (rdsRippleContainerView2 != null) {
                                i = C8387R.id.price_below_title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentAlertHubPriceAlertSelectorBottomsheetBinding((ConstraintLayout) view, rhTextView, imageView, rdsRippleContainerView, rhTextView2, imageView2, rdsRippleContainerView2, rhTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
