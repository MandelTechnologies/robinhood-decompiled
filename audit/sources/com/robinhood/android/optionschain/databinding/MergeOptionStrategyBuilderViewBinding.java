package com.robinhood.android.optionschain.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.optionschain.C24135R;

/* loaded from: classes11.dex */
public final class MergeOptionStrategyBuilderViewBinding implements ViewBinding {
    public final ShimmerLoadingView loading;
    public final RecyclerView optionsStrategyBuilderRecyclerview;
    private final ConstraintLayout rootView;

    private MergeOptionStrategyBuilderViewBinding(ConstraintLayout constraintLayout, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.loading = shimmerLoadingView;
        this.optionsStrategyBuilderRecyclerview = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MergeOptionStrategyBuilderViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeOptionStrategyBuilderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C24135R.layout.merge_option_strategy_builder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeOptionStrategyBuilderViewBinding bind(View view) {
        int i = C24135R.id.loading;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C24135R.id.options_strategy_builder_recyclerview;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new MergeOptionStrategyBuilderViewBinding((ConstraintLayout) view, shimmerLoadingView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
