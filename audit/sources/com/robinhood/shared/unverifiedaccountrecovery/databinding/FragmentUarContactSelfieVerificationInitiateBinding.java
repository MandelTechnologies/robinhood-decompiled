package com.robinhood.shared.unverifiedaccountrecovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;

/* loaded from: classes12.dex */
public final class FragmentUarContactSelfieVerificationInitiateBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final ErrorView selfieVerificationErrorView;
    public final ShimmerLoadingView selfieVerificationLoadingView;

    private FragmentUarContactSelfieVerificationInitiateBinding(FrameLayout frameLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.selfieVerificationErrorView = errorView;
        this.selfieVerificationLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUarContactSelfieVerificationInitiateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUarContactSelfieVerificationInitiateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C41128R.layout.fragment_uar_contact_selfie_verification_initiate, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentUarContactSelfieVerificationInitiateBinding bind(View view) {
        int i = C41128R.id.selfie_verification_error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C41128R.id.selfie_verification_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentUarContactSelfieVerificationInitiateBinding((FrameLayout) view, errorView, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
