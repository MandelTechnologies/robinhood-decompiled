package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;

/* loaded from: classes7.dex */
public final class ActivityWizardBinding implements ViewBinding {
    public final FragmentContainerLayout fragmentContainer;
    public final ShimmerLoadingView loadingView;
    private final ConstraintLayout rootView;
    public final RhToolbar toolbarWrapper;

    private ActivityWizardBinding(ConstraintLayout constraintLayout, FragmentContainerLayout fragmentContainerLayout, ShimmerLoadingView shimmerLoadingView, RhToolbar rhToolbar) {
        this.rootView = constraintLayout;
        this.fragmentContainer = fragmentContainerLayout;
        this.loadingView = shimmerLoadingView;
        this.toolbarWrapper = rhToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWizardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWizardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10285R.layout.activity_wizard, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityWizardBinding bind(View view) {
        int i = C10285R.id.fragment_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            i = C10285R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C10285R.id.toolbar_wrapper;
                RhToolbar rhToolbar = (RhToolbar) ViewBindings.findChildViewById(view, i);
                if (rhToolbar != null) {
                    return new ActivityWizardBinding((ConstraintLayout) view, fragmentContainerLayout, shimmerLoadingView, rhToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
