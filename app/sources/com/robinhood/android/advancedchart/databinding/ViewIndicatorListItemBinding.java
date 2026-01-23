package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class ViewIndicatorListItemBinding implements ViewBinding {
    public final View divider;
    public final ImageView dot;
    private final AdvancedChartIndicatorListItemView rootView;
    public final RhTextView title;
    public final RdsToggleView toggle;

    private ViewIndicatorListItemBinding(AdvancedChartIndicatorListItemView advancedChartIndicatorListItemView, View view, ImageView imageView, RhTextView rhTextView, RdsToggleView rdsToggleView) {
        this.rootView = advancedChartIndicatorListItemView;
        this.divider = view;
        this.dot = imageView;
        this.title = rhTextView;
        this.toggle = rdsToggleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AdvancedChartIndicatorListItemView getRoot() {
        return this.rootView;
    }

    public static ViewIndicatorListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewIndicatorListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.view_indicator_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewIndicatorListItemBinding bind(View view) {
        int i = C8502R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C8502R.id.dot;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8502R.id.title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C8502R.id.toggle;
                    RdsToggleView rdsToggleView = (RdsToggleView) ViewBindings.findChildViewById(view, i);
                    if (rdsToggleView != null) {
                        return new ViewIndicatorListItemBinding((AdvancedChartIndicatorListItemView) view, viewFindChildViewById, imageView, rhTextView, rdsToggleView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
