package com.robinhood.android.investorprofile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.investorprofile.C19641R;

/* loaded from: classes10.dex */
public final class FragmentBaseQuestionnaireParentBinding implements ViewBinding {
    public final FrameLayout fragmentContainer;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;

    private FragmentBaseQuestionnaireParentBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.fragmentContainer = frameLayout2;
        this.loadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBaseQuestionnaireParentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBaseQuestionnaireParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19641R.layout.fragment_base_questionnaire_parent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBaseQuestionnaireParentBinding bind(View view) {
        int i = C19641R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C19641R.id.loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                return new FragmentBaseQuestionnaireParentBinding((FrameLayout) view, frameLayout, shimmerLoadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
