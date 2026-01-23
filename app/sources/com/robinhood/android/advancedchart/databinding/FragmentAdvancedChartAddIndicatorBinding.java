package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAdvancedChartAddIndicatorBinding implements ViewBinding {
    public final ShimmerLoadingView loadingView;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final RhTextView titleTxt;

    private FragmentAdvancedChartAddIndicatorBinding(ConstraintLayout constraintLayout, ShimmerLoadingView shimmerLoadingView, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.loadingView = shimmerLoadingView;
        this.recyclerView = recyclerView;
        this.titleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAdvancedChartAddIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAdvancedChartAddIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.fragment_advanced_chart_add_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAdvancedChartAddIndicatorBinding bind(View view) {
        int i = C8502R.id.loading_view;
        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
        if (shimmerLoadingView != null) {
            i = C8502R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C8502R.id.title_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentAdvancedChartAddIndicatorBinding((ConstraintLayout) view, shimmerLoadingView, recyclerView, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
