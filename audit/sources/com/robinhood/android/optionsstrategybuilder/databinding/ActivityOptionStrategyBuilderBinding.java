package com.robinhood.android.optionsstrategybuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.optionsstrategybuilder.C24876R;

/* loaded from: classes11.dex */
public final class ActivityOptionStrategyBuilderBinding implements ViewBinding {
    public final FragmentContainerLayout educationTourContainer;
    public final FragmentContainerLayout fragmentContainer;
    public final ShimmerLoadingView rdsLoadingView;
    private final FrameLayout rootView;

    private ActivityOptionStrategyBuilderBinding(FrameLayout frameLayout, FragmentContainerLayout fragmentContainerLayout, FragmentContainerLayout fragmentContainerLayout2, ShimmerLoadingView shimmerLoadingView) {
        this.rootView = frameLayout;
        this.educationTourContainer = fragmentContainerLayout;
        this.fragmentContainer = fragmentContainerLayout2;
        this.rdsLoadingView = shimmerLoadingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOptionStrategyBuilderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOptionStrategyBuilderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24876R.layout.activity_option_strategy_builder, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOptionStrategyBuilderBinding bind(View view) {
        int i = C24876R.id.education_tour_container;
        FragmentContainerLayout fragmentContainerLayout = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerLayout != null) {
            i = C24876R.id.fragment_container;
            FragmentContainerLayout fragmentContainerLayout2 = (FragmentContainerLayout) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerLayout2 != null) {
                i = C24876R.id.rds_loading_view;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    return new ActivityOptionStrategyBuilderBinding((FrameLayout) view, fragmentContainerLayout, fragmentContainerLayout2, shimmerLoadingView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
