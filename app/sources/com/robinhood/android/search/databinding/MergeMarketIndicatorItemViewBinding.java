package com.robinhood.android.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.search.C27909R;

/* loaded from: classes5.dex */
public final class MergeMarketIndicatorItemViewBinding implements ViewBinding {
    public final RhTextView indicatorLabel;
    public final AnimatedRhTextView indicatorValue;
    public final LinearLayout marketIndicator;
    public final View marketIndicatorVerticalDivider;
    public final ImageView percentChangeArrowDown;
    public final ImageView percentChangeArrowUp;
    public final AnimatedRhTextView percentChangeValue;
    private final View rootView;

    private MergeMarketIndicatorItemViewBinding(View view, RhTextView rhTextView, AnimatedRhTextView animatedRhTextView, LinearLayout linearLayout, View view2, ImageView imageView, ImageView imageView2, AnimatedRhTextView animatedRhTextView2) {
        this.rootView = view;
        this.indicatorLabel = rhTextView;
        this.indicatorValue = animatedRhTextView;
        this.marketIndicator = linearLayout;
        this.marketIndicatorVerticalDivider = view2;
        this.percentChangeArrowDown = imageView;
        this.percentChangeArrowUp = imageView2;
        this.percentChangeValue = animatedRhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeMarketIndicatorItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C27909R.layout.merge_market_indicator_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeMarketIndicatorItemViewBinding bind(View view) {
        View viewFindChildViewById;
        int i = C27909R.id.indicator_label;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C27909R.id.indicator_value;
            AnimatedRhTextView animatedRhTextView = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
            if (animatedRhTextView != null) {
                i = C27909R.id.market_indicator;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C27909R.id.market_indicator_vertical_divider))) != null) {
                    i = C27909R.id.percent_change_arrow_down;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C27909R.id.percent_change_arrow_up;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C27909R.id.percent_change_value;
                            AnimatedRhTextView animatedRhTextView2 = (AnimatedRhTextView) ViewBindings.findChildViewById(view, i);
                            if (animatedRhTextView2 != null) {
                                return new MergeMarketIndicatorItemViewBinding(view, rhTextView, animatedRhTextView, linearLayout, viewFindChildViewById, imageView, imageView2, animatedRhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
