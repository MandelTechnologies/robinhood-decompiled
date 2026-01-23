package com.robinhood.shared.unverifiedaccountrecovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;

/* loaded from: classes12.dex */
public final class FragmentPathfinderAppMfaEnrollBinding implements ViewBinding {
    public final ShimmerLoadingView appMfaEnrollLoadingView;
    private final FrameLayout rootView;

    private FragmentPathfinderAppMfaEnrollBinding(FrameLayout frameLayout, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.appMfaEnrollLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPathfinderAppMfaEnrollBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPathfinderAppMfaEnrollBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C41128R.layout.fragment_pathfinder_app_mfa_enroll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPathfinderAppMfaEnrollBinding bind(View view) {
        int i = C41128R.id.app_mfa_enroll_loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            return new FragmentPathfinderAppMfaEnrollBinding((FrameLayout) view, shimmerLoadingView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
