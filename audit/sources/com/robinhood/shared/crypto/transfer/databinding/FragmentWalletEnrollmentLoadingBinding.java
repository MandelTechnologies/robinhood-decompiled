package com.robinhood.shared.crypto.transfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.shared.crypto.transfer.C37934R;

/* loaded from: classes6.dex */
public final class FragmentWalletEnrollmentLoadingBinding implements ViewBinding {
    public final LottieAnimationView loadingAnimation;
    public final LottieAnimationView loadingProgressBar;
    public final ConstraintLayout rootView;
    private final ConstraintLayout rootView_;

    private FragmentWalletEnrollmentLoadingBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, ConstraintLayout constraintLayout2) {
        this.rootView_ = constraintLayout;
        this.loadingAnimation = lottieAnimationView;
        this.loadingProgressBar = lottieAnimationView2;
        this.rootView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView_;
    }

    public static FragmentWalletEnrollmentLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWalletEnrollmentLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C37934R.layout.fragment_wallet_enrollment_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWalletEnrollmentLoadingBinding bind(View view) {
        int i = C37934R.id.loading_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C37934R.id.loading_progress_bar;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new FragmentWalletEnrollmentLoadingBinding(constraintLayout, lottieAnimationView, lottieAnimationView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
