package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.withpersona.sdk2.inquiry.shared.R$id;
import com.withpersona.sdk2.inquiry.shared.R$layout;

/* loaded from: classes18.dex */
public final class Pi2UiButtonWithLoadingIndicatorBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final View rootView;

    private Pi2UiButtonWithLoadingIndicatorBinding(View view, ProgressBar progressBar) {
        this.rootView = view;
        this.progressBar = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static Pi2UiButtonWithLoadingIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.pi2_ui_button_with_loading_indicator, viewGroup);
        return bind(viewGroup);
    }

    public static Pi2UiButtonWithLoadingIndicatorBinding bind(View view) {
        int i = R$id.progress_bar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            return new Pi2UiButtonWithLoadingIndicatorBinding(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
