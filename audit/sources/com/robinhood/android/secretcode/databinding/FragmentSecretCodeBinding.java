package com.robinhood.android.secretcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.secretcode.C28174R;

/* loaded from: classes5.dex */
public final class FragmentSecretCodeBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ErrorView secretCodeErrorView;
    public final ShimmerLoadingView secretCodeLoadingView;

    private FragmentSecretCodeBinding(ConstraintLayout constraintLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = constraintLayout;
        this.secretCodeErrorView = errorView;
        this.secretCodeLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSecretCodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSecretCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28174R.layout.fragment_secret_code, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSecretCodeBinding bind(View view) {
        int i = C28174R.id.secret_code_error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C28174R.id.secret_code_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentSecretCodeBinding((ConstraintLayout) view, errorView, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
