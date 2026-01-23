package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.view.AlertHubIndicatorListItemView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class ViewAlertHubIndicatorListItemBinding implements ViewBinding {
    public final ImageView caret;
    public final View divider;
    public final ImageView dot;
    private final AlertHubIndicatorListItemView rootView;
    public final RhTextView title;

    private ViewAlertHubIndicatorListItemBinding(AlertHubIndicatorListItemView alertHubIndicatorListItemView, ImageView imageView, View view, ImageView imageView2, RhTextView rhTextView) {
        this.rootView = alertHubIndicatorListItemView;
        this.caret = imageView;
        this.divider = view;
        this.dot = imageView2;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public AlertHubIndicatorListItemView getRoot() {
        return this.rootView;
    }

    public static ViewAlertHubIndicatorListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewAlertHubIndicatorListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8387R.layout.view_alert_hub_indicator_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewAlertHubIndicatorListItemBinding bind(View view) {
        View viewFindChildViewById;
        int i = C8387R.id.caret;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8387R.id.divider))) != null) {
            i = C8387R.id.dot;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C8387R.id.title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new ViewAlertHubIndicatorListItemBinding((AlertHubIndicatorListItemView) view, imageView, viewFindChildViewById, imageView2, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
