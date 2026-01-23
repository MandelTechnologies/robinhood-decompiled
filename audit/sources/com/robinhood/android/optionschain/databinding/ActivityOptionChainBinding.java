package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class ActivityOptionChainBinding implements ViewBinding {
    public final ComposeView composeOverlayView;
    public final FragmentContainerLayout fragmentContainer;
    public final CoordinatorLayout onboardingLayer;
    public final FragmentContainerLayout onboardingOverlay;
    public final CoordinatorLayout overlayContainer;
    public final FrameLayout primaryLayer;
    private final FrameLayout rootView;

    private ActivityOptionChainBinding(FrameLayout frameLayout, ComposeView composeView, FragmentContainerLayout fragmentContainerLayout, CoordinatorLayout coordinatorLayout, FragmentContainerLayout fragmentContainerLayout2, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.composeOverlayView = composeView;
        this.fragmentContainer = fragmentContainerLayout;
        this.onboardingLayer = coordinatorLayout;
        this.onboardingOverlay = fragmentContainerLayout2;
        this.overlayContainer = coordinatorLayout2;
        this.primaryLayer = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOptionChainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOptionChainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.activity_option_chain, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOptionChainBinding bind(View view) {
        int i = C24135R.id.compose_overlay_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C24135R.id.fragment_container;
            FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerLayout != null) {
                i = C24135R.id.onboarding_layer;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                if (coordinatorLayout != null) {
                    i = C24135R.id.onboarding_overlay;
                    FragmentContainerLayout fragmentContainerLayout2 = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerLayout2 != null) {
                        i = C24135R.id.overlay_container;
                        CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                        if (coordinatorLayout2 != null) {
                            i = C24135R.id.primary_layer;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                return new ActivityOptionChainBinding((FrameLayout) view, composeView, fragmentContainerLayout, coordinatorLayout, fragmentContainerLayout2, coordinatorLayout2, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
