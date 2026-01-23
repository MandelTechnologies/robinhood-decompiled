package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.utils.p409ui.view.SpeedLimitedScrollView;

/* loaded from: classes8.dex */
public final class FragmentOptionWatchlistOnboardingBinding implements ViewBinding {
    public final LottieAnimationView backgroundLottieView;
    public final Barrier bottomRowBarrier;
    public final RdsButton ctaButton;
    public final LottieAnimationView foregroundLottieView;
    public final LottieAnimationView lighthouseLightLottieView;
    public final RhTextView message;
    public final LottieAnimationView midLayerLottieView;
    public final RdsIconButton pageTurner;
    public final ConstraintLayout placeholder;
    private final ConstraintLayout rootView;
    public final LinearLayout scrollContainerView;
    public final SpeedLimitedScrollView scrollView;
    public final RhTextView title;

    private FragmentOptionWatchlistOnboardingBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, Barrier barrier, RdsButton rdsButton, LottieAnimationView lottieAnimationView2, LottieAnimationView lottieAnimationView3, RhTextView rhTextView, LottieAnimationView lottieAnimationView4, RdsIconButton rdsIconButton, ConstraintLayout constraintLayout2, LinearLayout linearLayout, SpeedLimitedScrollView speedLimitedScrollView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.backgroundLottieView = lottieAnimationView;
        this.bottomRowBarrier = barrier;
        this.ctaButton = rdsButton;
        this.foregroundLottieView = lottieAnimationView2;
        this.lighthouseLightLottieView = lottieAnimationView3;
        this.message = rhTextView;
        this.midLayerLottieView = lottieAnimationView4;
        this.pageTurner = rdsIconButton;
        this.placeholder = constraintLayout2;
        this.scrollContainerView = linearLayout;
        this.scrollView = speedLimitedScrollView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionWatchlistOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionWatchlistOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.fragment_option_watchlist_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionWatchlistOnboardingBinding bind(View view) {
        int i = C20943R.id.background_lottie_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C20943R.id.bottom_row_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C20943R.id.cta_button;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C20943R.id.foreground_lottie_view;
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView2 != null) {
                        i = C20943R.id.lighthouse_light_lottie_view;
                        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView3 != null) {
                            i = C20943R.id.message;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C20943R.id.mid_layer_lottie_view;
                                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                if (lottieAnimationView4 != null) {
                                    i = C20943R.id.page_turner;
                                    RdsIconButton rdsIconButton = (RdsIconButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsIconButton != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = C20943R.id.scroll_container_view;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C20943R.id.scroll_view;
                                            SpeedLimitedScrollView speedLimitedScrollView = (SpeedLimitedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (speedLimitedScrollView != null) {
                                                i = C20943R.id.title;
                                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView2 != null) {
                                                    return new FragmentOptionWatchlistOnboardingBinding(constraintLayout, lottieAnimationView, barrier, rdsButton, lottieAnimationView2, lottieAnimationView3, rhTextView, lottieAnimationView4, rdsIconButton, constraintLayout, linearLayout, speedLimitedScrollView, rhTextView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
