package com.robinhood.android.lib.webview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.lib.webview.C20684R;

/* loaded from: classes8.dex */
public final class MergeWebErrorViewBinding implements ViewBinding {
    public final ErrorView errorView;
    private final View rootView;

    private MergeWebErrorViewBinding(View view, ErrorView errorView) {
        this.rootView = view;
        this.errorView = errorView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeWebErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20684R.layout.merge_web_error_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeWebErrorViewBinding bind(View view) {
        int i = C20684R.id.error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            return new MergeWebErrorViewBinding(view, errorView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
