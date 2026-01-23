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
public final class FragmentPathfinderSmsChallengeBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final ErrorView smsChallengeErrorView;
    public final ShimmerLoadingView smsChallengeLoadingView;

    private FragmentPathfinderSmsChallengeBinding(FrameLayout frameLayout, ErrorView errorView, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.smsChallengeErrorView = errorView;
        this.smsChallengeLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPathfinderSmsChallengeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPathfinderSmsChallengeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C41128R.layout.fragment_pathfinder_sms_challenge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPathfinderSmsChallengeBinding bind(View view) {
        int i = C41128R.id.sms_challenge_error_view;
        ErrorView errorView = (ErrorView) ViewBindings.findChildViewById(view, i);
        if (errorView != null) {
            i = C41128R.id.sms_challenge_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentPathfinderSmsChallengeBinding((FrameLayout) view, errorView, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
