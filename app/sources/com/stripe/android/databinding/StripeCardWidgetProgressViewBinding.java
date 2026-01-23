package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;

/* loaded from: classes10.dex */
public final class StripeCardWidgetProgressViewBinding implements ViewBinding {
    public final ProgressBar cardLoading;
    private final View rootView;

    private StripeCardWidgetProgressViewBinding(View view, ProgressBar progressBar) {
        this.rootView = view;
        this.cardLoading = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static StripeCardWidgetProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.stripe_card_widget_progress_view, viewGroup);
        return bind(viewGroup);
    }

    public static StripeCardWidgetProgressViewBinding bind(View view) {
        int i = R$id.card_loading;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            return new StripeCardWidgetProgressViewBinding(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
